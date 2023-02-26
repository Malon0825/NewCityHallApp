package com.example.cityhallbuildingnavigator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
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

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        var selectedValue: String? = null

        searchView = findViewById(R.id.searchView1)
        listView = findViewById(R.id.listView1)

        listView.visibility = View.INVISIBLE

        val names = arrayOf(
            "STORAGE",
            "CTO STORAGE ROOM",
            "ARCHIVE",
            "CGSO",
            "PMO STOCK ROOM",
            "CITY DISASTER AND RISK MANAGEMENT",
            "PARKING AREA",
            "SECURITY ROOM LEFT",
            "SECURITY ROOM RIGHT/COOP OFFICE",
            "GSIS",
            "PUMP ROOM",
            "CANTEEN",
            "ELEVATOR",

            //Ground Floor

            "CITY ASSESOR'S OFFICE",
            "CITY POPULATION OFFICE",
            "CITY TREASURERS OFFICE",
            "GROUND COMFORT ROOM LEFT",
            "GROUND COMFORT ROOM RIGHT",
            "CONSTRUCTION PERMIT",
            "ECONOMIC ENTERPRISES",
            "GROUND FLOOR ENTRANCE",
            "GROUND FLOOR EXIT",
            "FRANCHISING UNIT",
            "GENERAL SERVICES",
            "GROUND FLOOR ELEVATOR",
            "CSU/INFORMATION DESK",

            //Second Floor

            "City Civil Registrar's Office",
            "City Environment and Natural Resources",
            "City Agriculture's Office",
            "City Architect's Office",
            "City Community Affairs Office",
            "City Cooperatives Office",
            "City Engineering Office",
            "City Nutrition Office",
            "City Social Welfare and Development Office",
            "City Tourism and Cultural Affairs",
            "City Veterinary Office",
            "Second Floor COMFORT ROOM LEFT",
            "Second Floor COMFORT ROOM RIGHT",
            "Office of the City Social Welfare and Development Officer",

            //Third Floor

            "ABC HALL",
            "ACCOUNTING OFFICE",
            "CITY AUCTIO OFFICE",
            "BID & AWARD COMMITTEE",
            "BUDGET HALL",
            "CITY LIBRARY",
            "MAYORS OFFICE",
            "CITY PLANING & DEVELOPMENT",
            "CITY HUMAN RESOURCE MANAGEMENT OFFICE",
            "CITY LEGAL OFFICE",
            "MAYORS LOUNGE/ CONFERENCE ROOM",
            "MAYORS STAFF OFFICE",
            "THIRD FLOOR MENS ROOM LEFT",
            "THIRD FLOOR MENS ROOM RIGHT",
            "THIRD FLOOR WOMEN ROOM LEFT",
            "THIRD FLOOR WOMEN ROOM RIGHT",
            "MIS ROOM-NEGOSYO CENTER",
            "OFFICE OF THE CITY ADMINISTRATION OFFICE",

            //Fourth Floor

            "CONFERENCE ROOM",
            "VICE MAYORS STAFF",
            "AUDIO VIDEO ROOM",
            "CITY HEALTH OFFICE",
            "COUNCIL CHAMBER AND MEDIA/AUDIENCE",
            "COUNCILS SECRETARY OFFICE",
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
            "FOURTH FLOOR WOMENS ROOM LEFT",
            "FOURTH FLOOR WOMENS ROOM RIGHT",
            "MULTI-ROOM",
            "ONE-STOP SHOP FOR OFWPRAYER ROOM",
            "SUPPLIES ROOM",
            "VICE MAYORS OFFICE",
            "VICE MAYORS SECRETARY OFFICE",

        )

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )


        listView.adapter = adapter

        searchView.setOnQueryTextListener(object :androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                if (names.contains(query)){
                    adapter.filter.filter(query)
                }else{
                    Toast.makeText(applicationContext, "Item not found", Toast.LENGTH_LONG).show()
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
            listView.visibility = View.INVISIBLE
        }

        val searchFloor = findViewById<Button>(R.id.btn_search)
        searchFloor.setOnClickListener {
            val intent = when (selectedValue) {

//          Basement Offices //
                "ARCHIVE" -> Intent(this, GroundArchive::class.java)
                "STORAGE" -> Intent(this, GroundStorage::class.java)
                "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
                "CGSO" -> Intent(this, GroundCGSO::class.java)
                "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
                "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
                "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
                "SECURITY ROOM LEFT" -> Intent(this, GroundSecurityRoom::class.java)
                "SECURITY ROOM RIGHT/COOP OFFICE" -> Intent(this, GroundSecurityCoop::class.java)
                "GSIS" -> Intent(this, GroundGSIS::class.java)
                "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
                "CANTEEN" -> Intent(this, GroundCanteen::class.java)


//          First Floor Offices //

                "CITY ASSESOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
                "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
                "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
                "GROUND COMFORT ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
                "GROUND COMFORT ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
                "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
                "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
                "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
                "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
                "FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
                "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
                "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)

//          Second Floor Offices //

                "City Civil Registrar's Office" -> Intent(this, SecondFloorCivilRegistrar::class.java)
                "City Environment and Natural Resources" -> Intent(this, SecondFloorCityEnvironment::class.java)
                "City Agriculture's Office" -> Intent(this, SecondFloorCityArgiculture::class.java)
                "City Architect's Office" -> Intent(this, SecondFloorCityArchitect::class.java)
                "City Community Affairs Office" -> Intent(this, SecondFloorCommunityAffairs::class.java)
                "City Cooperatives Office" -> Intent(this, SecondFloorCooperative::class.java)
                "City Engineering Office" -> Intent(this, SecondFloorEngineering::class.java)
                "City Nutrition Office" -> Intent(this, SecondFloorNutrition::class.java)
                "City Social Welfare and Development Office" -> Intent(this, SecondFloorSocialWelfare::class.java)
                "City Tourism and Cultural Affairs" -> Intent(this, SecondFloorTourism::class.java)
                "City Veterinary Office" -> Intent(this,SecondFloorVeterinary::class.java)
                "Second Floor COMFORT ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
                "Second Floor COMFORT ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
                "Office of the City Social Welfare and Development Officer" -> Intent(this,SecondFloorOfficeCSWD::class.java)

//          Third Floor Offices //

                "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
                "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
                "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
                "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
                "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
                "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
                "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
                "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
                "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
                "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
                "MAYORS LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
                "MAYORS STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
                "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
                "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
                "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
                "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
                "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
                "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)

//          Fourth Floor Offices //

                "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
                "VICE MAYORS STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
                "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
                "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
                "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
                "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
                "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
                "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
                "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
                "HON. FRANCIS ROSS DIDELESE" -> Intent(this, FourthFloorDIDELES::class.java)
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
                "FOURTH FLOOR WOMENS ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
                "FOURTH FLOOR WOMENS ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
                "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
                "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
                "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
                "VICE MAYORS OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
                "VICE MAYORS SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)



                else -> Intent(this, MainActivity::class.java)
            }

            startActivity(intent)
        }
    }
}