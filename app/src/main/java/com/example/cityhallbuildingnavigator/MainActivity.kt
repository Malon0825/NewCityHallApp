package com.example.cityhallbuildingnavigator

import android.animation.LayoutTransition
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.Gravity
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var imageBtn: ImageView
    private lateinit var searchView: androidx.appcompat.widget.SearchView

    private fun toggleListViewVisibility(query: String?) {
        if (query.isNullOrEmpty()) {
            listView.visibility = View.INVISIBLE
        } else {
            listView.visibility = View.VISIBLE
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windowMain = window
        windowMain?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        var selectedValue: String? = null
//        var historyValue = ""
//        var historyValueOne = ""
//        var historyValueTwo = ""
//        var historyValueThree = ""
//        var historyValueFour = ""
//        var historyValueFive = ""


        val values = arrayOfNulls<String>(5)


        searchView = findViewById(R.id.searchView1)

        listView = findViewById(R.id.listView1)

        listView.visibility = View.INVISIBLE

        val names = arrayOf(
            "STORAGE",
            "ARCHIVE",
            "PMO STOCK ROOM",
            "CITY DISASTER AND RISK MANAGEMENT",
            "PARKING AREA",
            "SECURITY ROOM LEFT/COOP OFFICE",
            "SECURITY ROOM RIGHT",
            "PUMP ROOM",
            "CANTEEN",
            "BASEMENT ELEVATOR",
            "KITCHEN",
            "GSIS",
            "CDRM",
            "CGSO STORAGE ROOM",
            "CTO STORAGE ROOM",


            //Ground Floor

            "CITY ASSESSOR'S OFFICE",
            "CITY POPULATION OFFICE",
            "CITY TREASURERS OFFICE",
            "CONSTRUCTION PERMIT",
            "ECONOMIC ENTERPRISES",
            "GROUND FLOOR ENTRANCE",
            "GROUND FLOOR EXIT",
            "CMO FRANCHISING UNIT",
            "GENERAL SERVICES",
            "CSU/INFORMATION DESK",
            "GROUND FLOOR MENS ROOM LEFT",
            "GROUND FLOOR MENS ROOM RIGHT",
            "GROUND FLOOR WOMEN ROOM LEFT",
            "GROUND FLOOR WOMEN ROOM RIGHT",
            "CMO BUSSINESS PERMIT AND LISCENCING",
            "LOBBY",

            "CAO",
            "CPO",
            "CSU",
            "CTO",
            "CDEEO",
            "CSGO",


            //Second Floor

            "CITY CIVIL REGISTRAR'S OFFICE",
            "CITY ENVIRONMENT AND NATURAL RESOURCES",
            "CITY AGRICULTURE'S OFFICE",
            "CITY ARCHITECT'S OFFICE",
            "CITY COMMUNITY AFFAIRS OFFICE",
            "CITY COOPERATIVES OFFICE",
            "CITY ENGINEERING OFFICE",
            "CITY NUTRITION OFFICE",
            "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE",
            "CITY TOURISM AND CULTURAL AFFAIRS",
            "CITY VETERINARY OFFICE",
            "SECOND FLOOR MENS ROOM LEFT",
            "SECOND FLOOR MENS ROOM RIGHT",
            "SECOND FLOOR WOMEN ROOM LEFT",
            "SECOND FLOOR WOMEN ROOM RIGHT",
            "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER",
            "SECOND FLOOR ELEVATOR",
            "DILG",

            "CCRO",
            "CENR",
            "CCAO",
            "CCO",
            "CEO",
            "CNO",
            "CSWDO",
            "CTC",
            "CVO",


            //Third Floor

            "ABC HALL",
            "ACCOUNTING OFFICE",
            "CITY AUDITORS OFFICE",
            "BID AND AWARD COMMITTEE",
            "BUDGET HALL",
            "CITY LIBRARY",
            "MAYOR'S OFFICE",
            "CITY PLANING AND DEVELOPMENT",
            "CITY HUMAN RESOURCE MANAGEMENT OFFICE",
            "CITY LEGAL OFFICE",
            "MAYOR'S LOUNGE AND CONFERENCE ROOM",
            "MAYOR'S STAFF OFFICE",
            "THIRD FLOOR MENS ROOM LEFT",
            "THIRD FLOOR MENS ROOM RIGHT",
            "THIRD FLOOR WOMEN ROOM LEFT",
            "THIRD FLOOR WOMEN ROOM RIGHT",
            "MIS ROOM",
            "NEGOSYO CENTER",
            "OFFICE OF THE CITY ADMINISTRATION OFFICE",
            "THIRD FLOOR ELEVATOR",

            "AO",
            "CL",
            "CMO",
            "CPD",
            "CHRMO",
            "CLO",

            //Fourth Floor

            "CONFERENCE ROOM",
            "VICE MAYOR'S STAFF",
            "AUDIO VIDEO ROOM",
            "CITY HEALTH OFFICE",
            "COUNCIL CHAMBER AND MEDIA/AUDIENCE",
            "HON. HANDEL DEE R. CADELLINO-CUBILO",
            "HON. ANTONIO S. ABING",
            "HON. ELLEN GRACE N. SUBERE-ALBIOS",
            "HON ESTER M. CATORCE",
            "HON. FRANCIS ROSS DIDELES",
            "HON. BERNARDO B. HINAY",
            "HON. CHARENE KRISTELLE C. JUMILIA",
            "HON. MARK C. LAPIDEZ",
            "HON. ANNABELLE G. PINGOY",
            "HON. GREGORIO O. PRESGA",
            "HON. JOHN REY P. RODRIGUEZ",
            "HON. SHARMAIGNE ARIANNE M. SALA",
            "HON CLARISSE MAE T. SORONGON",
            "FOURTH FLOOR MENS ROOM LEFT",
            "FOURTH FLOOR MENS ROOM RIGHT",
            "FOURTH FLOOR WOMEN ROOM LEFT",
            "FOURTH FLOOR WOMEN ROOM RIGHT",
            "MULTI-ROOM",
            "ONE-STOP SHOP FOR OFWPRAYER ROOM",
            "SUPPLIES ROOM",
            "VICE MAYOR'S OFFICE",
            "VICE MAYOR'S SECRETARY OFFICE",
            "FOURTH FLOOR ELEVATOR",
            "COUNCIL SECRETARY OFFICE",
            "PRAYER ROOM",

            "CVMO",
            "CVMSO",
            "CHO",
            "CSO",
            "OSSO",
        )

        val officeNames = arrayOf(
            "STORAGE",
            "ARCHIVE",
            "PMO STOCK ROOM",
            "CITY DISASTER AND RISK MANAGEMENT",
            "PARKING AREA",
            "SECURITY ROOM LEFT/COOP OFFICE",
            "SECURITY ROOM RIGHT",
            "PUMP ROOM",
            "CANTEEN",
            "BASEMENT ELEVATOR",
            "KITCHEN",
            "GSIS",
            "CDRM",
            "CGSO STORAGE ROOM",
            "CTO STORAGE ROOM",


            "PMO STOCK",
            "CITY DISASTER",
            "SECURITY ROOM LEFT",
            "SECURITY ROOM RIGHT",
            "CGSO STORAGE",
            "CTO STORAGE",


            //Ground Floor

            "CITY ASSESSOR'S OFFICE",
            "CITY POPULATION OFFICE",
            "CITY TREASURERS OFFICE",
            "CONSTRUCTION PERMIT",
            "ECONOMIC ENTERPRISES",
            "GROUND FLOOR ENTRANCE",
            "GROUND FLOOR EXIT",
            "CMO FRANCHISING UNIT",
            "GENERAL SERVICES",
            "CSU/INFORMATION DESK",
            "GROUND FLOOR MENS ROOM LEFT",
            "GROUND FLOOR MENS ROOM RIGHT",
            "GROUND FLOOR WOMEN ROOM LEFT",
            "GROUND FLOOR WOMEN ROOM RIGHT",
            "CMO BUSSINESS PERMIT AND LISCENCING",
            "LOBBY",

            "CAO",
            "CPO",
            "CSU",
            "CTO",
            "CDEEO",
            "CSGO",


            "CITY ASSESSOR",
            "CITY POPULATION",
            "CITY TREASURERS",
            "CONSTRUCTION",
            "CMO FRANCHISING",
            "CSU DESK",
            "CMO BUSSINESS",

            //Second Floor

            "CITY CIVIL REGISTRAR'S OFFICE",
            "CITY ENVIRONMENT AND NATURAL RESOURCES",
            "CITY AGRICULTURE'S OFFICE",
            "CITY ARCHITECT'S OFFICE",
            "CITY COMMUNITY AFFAIRS OFFICE",
            "CITY COOPERATIVES OFFICE",
            "CITY ENGINEERING OFFICE",
            "CITY NUTRITION OFFICE",
            "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE",
            "CITY TOURISM AND CULTURAL AFFAIRS",
            "CITY VETERINARY OFFICE",
            "SECOND FLOOR MENS ROOM LEFT",
            "SECOND FLOOR MENS ROOM RIGHT",
            "SECOND FLOOR WOMEN ROOM LEFT",
            "SECOND FLOOR WOMEN ROOM RIGHT",
            "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER",
            "SECOND FLOOR ELEVATOR",
            "DILG",

            "CCRO",
            "CENR",
            "CCAO",
            "CCO",
            "CEO",
            "CNO",
            "CSWDO",
            "CTC",
            "CVO",


            "CITY CIVIL",
            "CITY ENVIRONMENT",
            "CITY AGRICULTURE",
            "CITY ARCHITECT",
            "CITY COMMUNITY",
            "CITY COOPERATIVES",
            "CITY ENGINEERING",
            "CITY NUTRITION",
            "CITY SOCIAL",
            "CITY TOURISM",
            "CITY VETERINARY",
            "CITY SOCIAL WELFARE",


            //Third Floor

            "ABC HALL",
            "ACCOUNTING OFFICE",
            "CITY AUDITORS OFFICE",
            "BID AND AWARD COMMITTEE",
            "BUDGET HALL",
            "CITY LIBRARY",
            "MAYOR'S OFFICE",
            "CITY PLANING AND DEVELOPMENT",
            "CITY HUMAN RESOURCE MANAGEMENT OFFICE",
            "CITY LEGAL OFFICE",
            "MAYOR'S LOUNGE AND CONFERENCE ROOM",
            "MAYOR'S STAFF OFFICE",
            "THIRD FLOOR MENS ROOM LEFT",
            "THIRD FLOOR MENS ROOM RIGHT",
            "THIRD FLOOR WOMEN ROOM LEFT",
            "THIRD FLOOR WOMEN ROOM RIGHT",
            "MIS ROOM",
            "NEGOSYO CENTER",
            "OFFICE OF THE CITY ADMINISTRATION OFFICE",
            "THIRD FLOOR ELEVATOR",

            "AO",
            "CL",
            "CMO",
            "CPD",
            "CHRMO",
            "CLO",


            "CITY AUDITORS",
            "BID AND AWARD",
            "CITY PLANING",
            "CITY HUMAN",
            "CITY LEGAL",
            "MAYOR LOUNGE",
            "MAYOR STAFF",
            "CITY ADMINISTRATION",

            //Fourth Floor

            "CONFERENCE ROOM",
            "VICE MAYOR'S STAFF",
            "AUDIO VIDEO ROOM",
            "CITY HEALTH OFFICE",
            "COUNCIL CHAMBER AND MEDIA/AUDIENCE",
            "HON. HANDEL DEE R. CADELLINO-CUBILO",
            "HON. ANTONIO S. ABING",
            "HON. ELLEN GRACE N. SUBERE-ALBIOS",
            "HON ESTER M. CATORCE",
            "HON. FRANCIS ROSS DIDELES",
            "HON. BERNARDO B. HINAY",
            "HON. CHARENE KRISTELLE C. JUMILIA",
            "HON. MARK C. LAPIDEZ",
            "HON. ANNABELLE G. PINGOY",
            "HON. GREGORIO O. PRESGA",
            "HON. JOHN REY P. RODRIGUEZ",
            "HON. SHARMAIGNE ARIANNE M. SALA",
            "HON CLARISSE MAE T. SORONGON",
            "FOURTH FLOOR MENS ROOM LEFT",
            "FOURTH FLOOR MENS ROOM RIGHT",
            "FOURTH FLOOR WOMEN ROOM LEFT",
            "FOURTH FLOOR WOMEN ROOM RIGHT",
            "MULTI-ROOM",
            "ONE-STOP SHOP FOR OFWPRAYER ROOM",
            "SUPPLIES ROOM",
            "VICE MAYOR'S OFFICE",
            "VICE MAYOR'S SECRETARY OFFICE",
            "FOURTH FLOOR ELEVATOR",
            "COUNCIL SECRETARY OFFICE",
            "PRAYER ROOM",

            "CVMO",
            "CVMSO",
            "CHO",
            "CSO",
            "OSSO",


            "VICE MAYOR STAFF",
            "AUDIO ROOM",
            "VIDEO ROOM",
            "COUNCIL CHAMBER",

            "HANDEL",
            "ANTONIO",
            "ELLEN GRACE",
            "ESTER",
            "FRANCIS",
            "BERNARDO",
            "CHARENE",
            "MARK",
            "ANNABELLE",
            "GREGORIO",
            "JOHN REY",
            "SHARMAIGNE",
            "CLARISSE",

            "CADELLINO",
            "ABING",
            "SUBERE",
            "CATORCE",
            "DIDELES",
            "HINAY",
            "JUMILIA",
            "LAPIDEZ",
            "PINGOY",
            "PRESGA",
            "RODRIGUEZ",
            "SALA",
            "SORONGON",

            "VICE MAYOR",
            "VICE MAYOR SECRETARY",
            "COUNCIL SECRETARY",
        )

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )


        listView.adapter = adapter


        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                val searchQuery = query?.uppercase()

                // Get the list of items from the adapter.
                val items = mutableListOf<String>()
                for (i in 0 until adapter.count) {
                    val item = adapter.getItem(i)
                    if (item != null) {
                        items.add(item)
                    }
                }

                // Get the first item in the filtered list.
                val firstItem = items.firstOrNull()

                if (firstItem != null) {
                    // Set the text of a TextView to the value of the first item.

                    val intent = when (firstItem) {

                        //       Basement Offices //
                        "ARCHIVE" -> Intent(this@MainActivity, GroundArchive::class.java)
                        "STORAGE" -> Intent(this@MainActivity, GroundStorage::class.java)
                        "CTO STORAGE ROOM" -> Intent(this@MainActivity, GroundCTOStorage::class.java)
                        "CGSO" -> Intent(this@MainActivity, GroundCGSO::class.java)
                        "PMO STOCK ROOM" -> Intent(this@MainActivity, GroundPMO::class.java)
                        "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this@MainActivity, GroundCityDisaster::class.java)
                        "PARKING AREA" -> Intent(this@MainActivity, GroundParkingArea::class.java)
                        "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this@MainActivity, GroundSecurityRoom::class.java)
                        "SECURITY ROOM RIGHT" -> Intent(this@MainActivity, GroundSecurityCoop::class.java)
                        "GSIS" -> Intent(this@MainActivity, GroundGSIS::class.java)
                        "PUMP ROOM" -> Intent(this@MainActivity, GroundPumpRoom::class.java)
                        "CANTEEN" -> Intent(this@MainActivity, GroundCanteen::class.java)
                        "KITCHEN" -> Intent(this@MainActivity, GroundKitchen::class.java)
                        "CDRM" -> Intent(this@MainActivity, GroundCityDisaster::class.java)
                        "CGSO STORAGE ROOM" -> Intent(this@MainActivity, GroundCGSO::class.java)


                        "BASEMENT ELEVATOR" -> Intent(this@MainActivity, GroundFloorElevator::class.java)


//          First Floor Offices //


                        "CITY ASSESSOR'S OFFICE" -> Intent(this@MainActivity, FirstFloorCityAssesor::class.java)
                        "CITY POPULATION OFFICE" -> Intent(this@MainActivity, FirstFloorCityPopulation::class.java)
                        "CITY TREASURERS OFFICE" -> Intent(this@MainActivity, FirstFloorCityTreasurers::class.java)
                        "GROUND FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, FirstFloorMenRoomLeft::class.java)
                        "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, FirstFloorMenRoomRight::class.java)
                        "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, FirstFloorCRLeft::class.java)
                        "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity, FirstFloorCRRight::class.java)
                        "CONSTRUCTION PERMIT" -> Intent(this@MainActivity, FirstFloorConstructionPermit::class.java)
                        "ECONOMIC ENTERPRISES" -> Intent(this@MainActivity, FirstFloorEconomicEnterprises::class.java)
                        "GROUND FLOOR ENTRANCE" -> Intent(this@MainActivity, FirstFloorEntrance::class.java)
                        "GROUND FLOOR EXIT" -> Intent(this@MainActivity, FirstFloorExit::class.java)
                        "CMO FRANCHISING UNIT" -> Intent(this@MainActivity, FirstFloorFranchisingUnit::class.java)
                        "GENERAL SERVICES" -> Intent(this@MainActivity, FirstFloorGeneralService::class.java)
                        "CSU/INFORMATION DESK" -> Intent(this@MainActivity, FirstFloorCSUInformationDesk::class.java)
                        "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this@MainActivity, FirstFloorBusinessPermit::class.java)
                        "LOBBY" -> Intent(this@MainActivity, FirstFloorLobby::class.java)

                        "CAO" -> Intent(this@MainActivity, FirstFloorCityAssesor::class.java)
                        "CPO" -> Intent(this@MainActivity, FirstFloorCityPopulation::class.java)
                        "CSU" -> Intent(this@MainActivity, FirstFloorCSUInformationDesk::class.java)
                        "CTO" -> Intent(this@MainActivity, FirstFloorCityTreasurers::class.java)
                        "CDEEO" -> Intent(this@MainActivity, FirstFloorEconomicEnterprises::class.java)
                        "CSGO" -> Intent(this@MainActivity, FirstFloorGeneralService::class.java)

//          Second Floor Offices //


                        "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this@MainActivity, SecondFloorCivilRegistrar::class.java)
                        "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this@MainActivity, SecondFloorCityEnvironment::class.java)
                        "CITY AGRICULTURE'S OFFICE" -> Intent(this@MainActivity, SecondFloorCityArgiculture::class.java)
                        "CITY ARCHITECT'S OFFICE" -> Intent(this@MainActivity, SecondFloorCityArchitect::class.java)
                        "CITY COMMUNITY AFFAIRS OFFICE" -> Intent(this@MainActivity, SecondFloorCommunityAffairs::class.java)
                        "CITY COOPERATIVES OFFICE" -> Intent(this@MainActivity, SecondFloorCooperative::class.java)
                        "CITY ENGINEERING OFFICE"-> Intent(this@MainActivity, SecondFloorEngineering::class.java)
                        "CITY NUTRITION OFFICE"-> Intent(this@MainActivity, SecondFloorNutrition::class.java)
                        "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this@MainActivity, SecondFloorSocialWelfare::class.java)
                        "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this@MainActivity, SecondFloorTourism::class.java)
                        "CITY VETERINARY OFFICE"-> Intent(this@MainActivity, SecondFloorVeterinary::class.java)
                        "SECOND FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, SecondFloorMenRoomLeft::class.java)
                        "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, SecondFloorMenRoomRight::class.java)
                        "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, SecondFloorCRLeft::class.java)
                        "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity, SecondFloorCRRight::class.java)
                        "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this@MainActivity,
                            SecondFloorOfficeCSWD::class.java)
                        "DILG" -> Intent(this@MainActivity, SecondFloorDILG::class.java)

                        "SECOND FLOOR ELEVATOR" -> Intent(this@MainActivity, SecondFloorElevator::class.java)

                        "CCRO" -> Intent(this@MainActivity, SecondFloorCivilRegistrar::class.java)
                        "CENR" -> Intent(this@MainActivity, SecondFloorCityEnvironment::class.java)
                        "CCAO" -> Intent(this@MainActivity, SecondFloorCommunityAffairs::class.java)
                        "CCO" -> Intent(this@MainActivity, SecondFloorCooperative::class.java)
                        "CEO" -> Intent(this@MainActivity, SecondFloorEngineering::class.java)
                        "CNO" -> Intent(this@MainActivity, SecondFloorNutrition::class.java)
                        "CSWDO" -> Intent(this@MainActivity, SecondFloorSocialWelfare::class.java)
                        "CTC" -> Intent(this@MainActivity, SecondFloorTourism::class.java)
                        "CVO" -> Intent(this@MainActivity, SecondFloorVeterinary::class.java)


//          Third Floor Offices //

                        "ABC HALL" -> Intent(this@MainActivity, ThirdFloorABCHall::class.java)
                        "ACCOUNTING OFFICE" -> Intent(this@MainActivity, ThirdFloorAccounting::class.java)
                        "CITY AUDITORS OFFICE" -> Intent(this@MainActivity, ThirdFloorAution::class.java)
                        "BID AND AWARD COMMITTEE" -> Intent(this@MainActivity, ThirdFloorAward::class.java)
                        "BUDGET HALL" -> Intent(this@MainActivity, ThirdFloorBudgetHall::class.java)
                        "CITY LIBRARY" -> Intent(this@MainActivity, ThirdFloorLibrary::class.java)
                        "CITY MAYOR'S OFFICE" -> Intent(this@MainActivity, ThirdFloorMayorOffice::class.java)
                        "CITY PLANING AND DEVELOPMENT" -> Intent(this@MainActivity, ThirdFloorPlanning::class.java)
                        "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this@MainActivity, ThirdFloorResourceManagement::class.java)
                        "CITY LEGAL OFFICE" -> Intent(this@MainActivity, ThirdFloorLegaOffice::class.java)
                        "MAYOR'S OFFICE" -> Intent(this@MainActivity, ThirdFloorMayorOffice::class.java)
                        "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this@MainActivity, ThirdFloorMayorLounge::class.java)
                        "MAYOR'S STAFF OFFICE" -> Intent(this@MainActivity, ThirdFloorMayorStaff::class.java)
                        "THIRD FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, ThirdFloorMensRoomLeft::class.java)
                        "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, ThirdFloorMensRoomRight::class.java)
                        "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity,  ThirdFloorWomensRoomRight::class.java)
                        "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, ThirdFloorWomensRoomLeft::class.java)
                        "MIS ROOM" -> Intent(this@MainActivity, ThirdFloorMISRoom::class.java)
                        "NEGOSYO CENTER" -> Intent(this@MainActivity, ThirdFloorNegosyo::class.java)
                        "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this@MainActivity, ThirdFloorCityAdministration::class.java)

                        "THIRD FLOOR ELEVATOR" -> Intent(this@MainActivity, ThirdFloorElevator::class.java)

                        "AO" -> Intent(this@MainActivity, ThirdFloorAccounting::class.java)
                        "CL" -> Intent(this@MainActivity, ThirdFloorLibrary::class.java)
                        "CMO" -> Intent(this@MainActivity, ThirdFloorMayorOffice::class.java)
                        "CPD" -> Intent(this@MainActivity, ThirdFloorPlanning::class.java)
                        "CHRMO" -> Intent(this@MainActivity, ThirdFloorResourceManagement::class.java)
                        "CLO" -> Intent(this@MainActivity, ThirdFloorLegaOffice::class.java)


//          Fourth Floor Offices //

                        "CONFERENCE ROOM" -> Intent(this@MainActivity, FourthFloorCONFERENCEROOM::class.java)
                        "VICE MAYOR'S STAFF" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
                        "AUDIO VIDEO ROOM" -> Intent(this@MainActivity, FourthFloorAUDIOVIDEOROOM::class.java)
                        "CITY HEALTH OFFICE" -> Intent(this@MainActivity, FourthFloorCITYHEALTHOFFICE::class.java)
                        "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this@MainActivity, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
                        "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this@MainActivity, FourthFloorCADELLINOCUBILO::class.java)
                        "HON. ANTONIO S. ABING" -> Intent(this@MainActivity, FourthFloorABING::class.java)
                        "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this@MainActivity, FourthFloorALBIOS::class.java)
                        "HON ESTER M. CATORCE" -> Intent(this@MainActivity, FourthFloorCATORCE::class.java)
                        "HON. FRANCIS ROSS DIDELES" -> Intent(this@MainActivity, FourthFloorDIDELES::class.java)
                        "HON. BERNARDO B. HINAY" -> Intent(this@MainActivity, FourthFloorHINAY::class.java)
                        "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this@MainActivity, FourthFloorJUMILIA::class.java)
                        "HON. MARK C. LAPIDEZ" -> Intent(this@MainActivity, FourthFloorLAPIDEZ::class.java)
                        "HON. ANNABELLE G. PINGOY" -> Intent(this@MainActivity, FourthFloorPINGOY::class.java)
                        "HON. GREGORIO O. PRESGA" -> Intent(this@MainActivity,  FourthFloorPRESGA::class.java)
                        "HON. JOHN REY P. RODRIGUEZ" -> Intent(this@MainActivity, FourthFloorRODRIGUEZ::class.java)
                        "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this@MainActivity, FourthFloorSALA::class.java)
                        "HON CLARISSE MAE T. SORONGON" -> Intent(this@MainActivity, FourthFloorSORONGON::class.java)
                        "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, FourthFloorMENSROOMLEFT::class.java)
                        "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, FourthFloorMENSROOMRIGHT::class.java)
                        "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, FourthFloorWOMENSROOMLEFT::class.java)
                        "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity, FourthFloorWOMENSROOMRIGHT::class.java)
                        "MULTI-ROOM" -> Intent(this@MainActivity, FourthFloorMULTIROOM::class.java)
                        "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this@MainActivity,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
                        "SUPPLIES ROOM" -> Intent(this@MainActivity, FourthFloorSUPPLIESROOM::class.java)
                        "VICE MAYOR'S OFFICE" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
                        "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this@MainActivity, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
                        "COUNCIL SECRETARY OFFICE" -> Intent(this@MainActivity, FourthFloorCouncilSec::class.java)
                        "PRAYER ROOM" -> Intent(this@MainActivity, FourthFloorPrayer::class.java)

                        "FOURTH FLOOR ELEVATOR" -> Intent(this@MainActivity, FourthFloorElevator::class.java)

                        "CVMO" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
                        "CVMSO" -> Intent(this@MainActivity, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
                        "CHO" -> Intent(this@MainActivity, FourthFloorCITYHEALTHOFFICE::class.java)
                        "CSO" -> Intent(this@MainActivity, FourthFloorCouncilSec::class.java)
                        "OSSO" -> Intent(this@MainActivity,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)

                        else -> null}
                    if (intent != null) {
                        startActivity(intent)
                        android.os.Handler().postDelayed({
                            selectedValue = ""
                            searchView.setQuery(selectedValue, false)
                        },2000)
                    }else { Toast.makeText(applicationContext, "Office not found", Toast.LENGTH_LONG).show() }

                } else {
                    // Handle the case where there are no items in the filtered list.
                    Toast.makeText(this@MainActivity, "Error: No such office or department", Toast.LENGTH_LONG).show()
                }

                toggleListViewVisibility(query)
                return false
            }

            override fun onQueryTextChange(query: String?): Boolean {
                adapter.filter.filter(query)
                toggleListViewVisibility(query)
                return false
            }
        })

        listView.setOnItemClickListener { parent, view, position, id ->

            selectedValue = parent.getItemAtPosition(position).toString()

            searchView.setQuery(selectedValue, false)



            val intent = when (selectedValue) {

//          Basement Offices //
                "ARCHIVE" -> Intent(this, GroundArchive::class.java)
                "STORAGE" -> Intent(this, GroundStorage::class.java)
                "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
                "CGSO" -> Intent(this, GroundCGSO::class.java)
                "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
                "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
                "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
                "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
                "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
                "GSIS" -> Intent(this, GroundGSIS::class.java)
                "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
                "CANTEEN" -> Intent(this, GroundCanteen::class.java)
                "KITCHEN" -> Intent(this, GroundKitchen::class.java)
                "CDRM" -> Intent(this, GroundCityDisaster::class.java)
                "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)


                "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)


//          First Floor Offices //


                "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
                "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
                "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
                "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
                "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
                "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
                "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
                "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
                "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
                "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
                "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
                "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
                "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
                "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
                "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
                "LOBBY" -> Intent(this, FirstFloorLobby::class.java)

                "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
                "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
                "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
                "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
                "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
                "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)

//          Second Floor Offices //


                "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
                "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
                "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
                "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
                "CITY COMMUNITY AFFAIRS OFFICE" -> Intent(this, SecondFloorCommunityAffairs::class.java)
                "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
                "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
                "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
                "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
                "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
                "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
                "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
                "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
                "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
                "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
                "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
                "DILG" -> Intent(this, SecondFloorDILG::class.java)

                "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)

                "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
                "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
                "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
                "CCO" -> Intent(this, SecondFloorCooperative::class.java)
                "CEO" -> Intent(this, SecondFloorEngineering::class.java)
                "CNO" -> Intent(this, SecondFloorNutrition::class.java)
                "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
                "CTC" -> Intent(this, SecondFloorTourism::class.java)
                "CVO" -> Intent(this,SecondFloorVeterinary::class.java)


//          Third Floor Offices //

                "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
                "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
                "CITY AUDITORS OFFICE" -> Intent(this, ThirdFloorAution::class.java)
                "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
                "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
                "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
                "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
                "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
                "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
                "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
                "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
                "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
                "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
                "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
                "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
                "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
                "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
                "MIS ROOM" -> Intent(this, ThirdFloorMISRoom::class.java)
                "NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
                "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)

                "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)

                "AO" -> Intent(this, ThirdFloorAccounting::class.java)
                "CL" -> Intent(this, ThirdFloorLibrary::class.java)
                "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
                "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
                "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
                "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)


//          Fourth Floor Offices //

                "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
                "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
                "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
                "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
                "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
                "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
                "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
                "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
                "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
                "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
                "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
                "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
                "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
                "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
                "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
                "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
                "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
                "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
                "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
                "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
                "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
                "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
                "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
                "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
                "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
                "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
                "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
                "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
                "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)

                "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)

                "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
                "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
                "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
                "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
                "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)


                else -> Intent(this, MainActivity::class.java)
            }

            startActivity(intent)
            android.os.Handler().postDelayed({
                selectedValue = ""
                searchView.setQuery(selectedValue, false)
            },2000)


        }

        searchView.setOnKeyListener { _, keyCode, event ->
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                Toast.makeText(this, "Enter", Toast.LENGTH_LONG).show()
                return@setOnKeyListener true
            }
            false
        }

        val instruction = findViewById<ImageView>(R.id.btn_instruction)
        instruction.setOnClickListener {

            val dialogBinding = layoutInflater.inflate(R.layout.home_intructions, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            val window = myDialog.window
            window?.setGravity(Gravity.CENTER)
            window?.setDimAmount(0.5F) // Set dim amount to 0 for full transparency


            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.setCanceledOnTouchOutside(true)
            myDialog.show()
        }

        val navbar =findViewById<ImageButton>(R.id.home_about_us)

        navbar.setOnClickListener{

            val dialogBinding = layoutInflater.inflate(R.layout.activity_navbar, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            val window = myDialog.window
            window?.setGravity(Gravity.START)
            window?.setDimAmount(0.5F) // Set dim amount to 0 for full transparency
            val layoutParams = window?.attributes
            layoutParams?.x = -100 // Set x offset to position the dialog
            layoutParams?.y = 100 // Set y offset to position the dialog
            window?.attributes = layoutParams

            val lp = WindowManager.LayoutParams()
            lp.copyFrom(myDialog.window?.attributes)
            lp.width = WindowManager.LayoutParams.WRAP_CONTENT
            lp.height = WindowManager.LayoutParams.MATCH_PARENT
            myDialog.window?.attributes = lp

            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.setCanceledOnTouchOutside(true)
            myDialog.show()

            val xBtn = dialogBinding.findViewById<ImageButton>(R.id.about_us_btn)
            xBtn.setOnClickListener{
                myDialog.dismiss()
            }
        }

    }
}