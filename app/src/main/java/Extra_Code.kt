import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cityhallbuildingnavigator.*

//class Extra_Code {
//    package com.example.cityhallbuildingnavigator
//
//    import android.animation.LayoutTransition
//    import android.app.Dialog
//    import android.content.Intent
//    import android.graphics.Color
//    import android.graphics.drawable.ColorDrawable
//    import android.os.Bundle
//    import android.transition.AutoTransition
//    import android.transition.TransitionInflater
//    import android.transition.TransitionManager
//    import android.view.Gravity
//    import android.view.LayoutInflater
//    import android.view.MotionEvent
//    import android.view.View
//    import android.view.WindowManager
//    import android.widget.*
//    import androidx.appcompat.app.AppCompatActivity
//    import androidx.core.content.ContextCompat
//
//
//    class MainActivity : AppCompatActivity() {
//
//        private lateinit var listView: ListView
//        private lateinit var searchView: androidx.appcompat.widget.SearchView
//
//        private fun toggleListViewVisibility(query: String?) {
//            if (query.isNullOrEmpty()) {
//                listView.visibility = View.INVISIBLE
//            } else {
//                listView.visibility = View.VISIBLE
//            }
//        }
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//
//            val windowMain = window
//            windowMain?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//            supportActionBar?.hide()
//
//            setContentView(R.layout.activity_main)
//
//            var selectedValue: String? = null
//            var historyValue = ""
//            var historyValueOne = ""
//            var historyValueTwo = ""
//            var historyValueThree = ""
//            var historyValueFour = ""
//            var historyValueFive = ""
//
//
//            val values = arrayOfNulls<String>(5)
//
//
//            searchView = findViewById(R.id.searchView1)
//
//            listView = findViewById(R.id.listView1)
//
//            listView.visibility = View.INVISIBLE
//
//            val names = arrayOf(
//                "STORAGE",
//                "ARCHIVE",
//                "PMO STOCK ROOM",
//                "CITY DISASTER AND RISK MANAGEMENT",
//                "PARKING AREA",
//                "SECURITY ROOM LEFT/COOP OFFICE",
//                "SECURITY ROOM RIGHT",
//                "PUMP ROOM",
//                "CANTEEN",
//                "BASEMENT ELEVATOR",
//                "KITCHEN",
//                "GSIS",
//                "CDRM",
//                "CGSO STORAGE ROOM",
//                "CTO STORAGE ROOM",
//
//
//                //Ground Floor
//
//                "CITY ASSESSOR'S OFFICE",
//                "CITY POPULATION OFFICE",
//                "CITY TREASURERS OFFICE",
//                "CONSTRUCTION PERMIT",
//                "ECONOMIC ENTERPRISES",
//                "GROUND FLOOR ENTRANCE",
//                "GROUND FLOOR EXIT",
//                "CMO FRANCHISING UNIT",
//                "GENERAL SERVICES",
//                "CSU/INFORMATION DESK",
//                "GROUND FLOOR MENS ROOM LEFT",
//                "GROUND FLOOR MENS ROOM RIGHT",
//                "GROUND FLOOR WOMEN ROOM LEFT",
//                "GROUND FLOOR WOMEN ROOM RIGHT",
//                "CMO BUSSINESS PERMIT AND LISCENCING",
//                "LOBBY",
//
//                "CAO",
//                "CPO",
//                "CSU",
//                "CTO",
//                "CDEEO",
//                "CSGO",
//
//                //Second Floor
//
//                "CITY CIVIL REGISTRAR'S OFFICE",
//                "CITY ENVIRONMENT AND NATURAL RESOURCES",
//                "CITY AGRICULTURE'S OFFICE",
//                "CITY ARCHITECT'S OFFICE",
//                "CITY COMMUNITY AFFAIRS OFFICE",
//                "CITY COOPERATIVES OFFICE",
//                "CITY ENGINEERING OFFICE",
//                "CITY NUTRITION OFFICE",
//                "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE",
//                "CITY TOURISM AND CULTURAL AFFAIRS",
//                "CITY VETERINARY OFFICE",
//                "SECOND FLOOR MENS ROOM LEFT",
//                "SECOND FLOOR MENS ROOM RIGHT",
//                "SECOND FLOOR WOMEN ROOM LEFT",
//                "SECOND FLOOR WOMEN ROOM RIGHT",
//                "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER",
//                "SECOND FLOOR ELEVATOR",
//                "DILG",
//
//                "CCRO",
//                "CENR",
//                "CCAO",
//                "CCO",
//                "CEO",
//                "CNO",
//                "CSWDO",
//                "CTC",
//                "CVO",
//
//                //Third Floor
//
//                "ABC HALL",
//                "ACCOUNTING OFFICE",
//                "CITY AUDITORS OFFICE",
//                "BID AND AWARD COMMITTEE",
//                "BUDGET HALL",
//                "CITY LIBRARY",
//                "MAYOR'S OFFICE",
//                "CITY PLANING AND DEVELOPMENT",
//                "CITY HUMAN RESOURCE MANAGEMENT OFFICE",
//                "CITY LEGAL OFFICE",
//                "MAYOR'S LOUNGE AND CONFERENCE ROOM",
//                "MAYOR'S STAFF OFFICE",
//                "THIRD FLOOR MENS ROOM LEFT",
//                "THIRD FLOOR MENS ROOM RIGHT",
//                "THIRD FLOOR WOMEN ROOM LEFT",
//                "THIRD FLOOR WOMEN ROOM RIGHT",
//                "MIS ROOM",
//                "NEGOSYO CENTER",
//                "OFFICE OF THE CITY ADMINISTRATION OFFICE",
//                "THIRD FLOOR ELEVATOR",
//
//                "AO",
//                "CL",
//                "CMO",
//                "CPD",
//                "CHRMO",
//                "CLO",
//
//                //Fourth Floor
//
//                "CONFERENCE ROOM",
//                "VICE MAYOR'S STAFF",
//                "AUDIO VIDEO ROOM",
//                "CITY HEALTH OFFICE",
//                "COUNCIL CHAMBER AND MEDIA/AUDIENCE",
//                "HON. HANDEL DEE R. CADELLINO-CUBILO",
//                "HON. ANTONIO S. ABING",
//                "HON. ELLEN GRACE N. SUBERE-ALBIOS",
//                "HON ESTER M. CATORCE",
//                "HON. FRANCIS ROSS DIDELES",
//                "HON. BERNARDO B. HINAY",
//                "HON. CHARENE KRISTELLE C. JUMILIA",
//                "HON. MARK C. LAPIDEZ",
//                "HON. ANNABELLE G. PINGOY",
//                "HON. GREGORIO O. PRESGA",
//                "HON. JOHN REY P. RODRIGUEZ",
//                "HON. SHARMAIGNE ARIANNE M. SALA",
//                "HON CLARISSE MAE T. SORONGON",
//                "FOURTH FLOOR MENS ROOM LEFT",
//                "FOURTH FLOOR MENS ROOM RIGHT",
//                "FOURTH FLOOR WOMEN ROOM LEFT",
//                "FOURTH FLOOR WOMEN ROOM RIGHT",
//                "MULTI-ROOM",
//                "ONE-STOP SHOP FOR OFWPRAYER ROOM",
//                "SUPPLIES ROOM",
//                "VICE MAYOR'S OFFICE",
//                "VICE MAYOR'S SECRETARY OFFICE",
//                "FOURTH FLOOR ELEVATOR",
//                "COUNCIL SECRETARY OFFICE",
//                "PRAYER ROOM",
//
//                "CVMO",
//                "CVMSO",
//                "CHO",
//                "CSO",
//                "OSSO",
//            )
//
//            val adapter: ArrayAdapter<String> = ArrayAdapter(
//                this, android.R.layout.simple_list_item_1, names
//            )
//
//
//            listView.adapter = adapter
//
//            searchView.setOnQueryTextListener(object :androidx.appcompat.widget.SearchView.OnQueryTextListener{
//                override fun onQueryTextSubmit(query: String?): Boolean {
//                    searchView.clearFocus()
//                    if (names.contains(query)){
//                        adapter.filter.filter(query)
//                    }else{
//                        Toast.makeText(applicationContext, "Item not found", Toast.LENGTH_LONG).show()
//                    }
//                    toggleListViewVisibility(query)
//                    return false
//                }
//                override fun onQueryTextChange(query: String?): Boolean {
//                    adapter.filter.filter(query)
//                    toggleListViewVisibility(query)
//                    return false
//                }
//
//            })
//
//            listView.setOnItemClickListener { parent, view, position, id ->
//
//                selectedValue = parent.getItemAtPosition(position).toString()
//
//                searchView.setQuery(selectedValue, false)
//
//                historyValue = selectedValue.toString()
//
//
//                historyValueFive = historyValueFour
//                historyValueFour = historyValueThree
//                historyValueThree = historyValueTwo
//                historyValueTwo = historyValueOne
//                historyValueOne = historyValue
//
//                val intent = when (selectedValue) {
//
////          Basement Offices //
//                    "ARCHIVE" -> Intent(this, GroundArchive::class.java)
//                    "STORAGE" -> Intent(this, GroundStorage::class.java)
//                    "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
//                    "CGSO" -> Intent(this, GroundCGSO::class.java)
//                    "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
//                    "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
//                    "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
//                    "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
//                    "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
//                    "GSIS" -> Intent(this, GroundGSIS::class.java)
//                    "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
//                    "CANTEEN" -> Intent(this, GroundCanteen::class.java)
//                    "KITCHEN" -> Intent(this, GroundKitchen::class.java)
//                    "CDRM" -> Intent(this, GroundCityDisaster::class.java)
//                    "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
//
//
//                    "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
//
//
////          First Floor Offices //
//
//
//                    "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
//                    "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
//                    "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
//                    "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
//                    "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
//                    "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
//                    "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
//                    "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
//                    "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
//                    "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
//                    "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
//                    "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
//                    "GENERAL SERVICES" -> Intent(this, FirstFloorGeneralService::class.java)
//                    "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
//                    "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
//                    "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
//
//                    "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
//                    "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
//                    "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
//                    "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
//                    "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
//                    "CSGO" -> Intent(this, FirstFloorGeneralService::class.java)
//
////          Second Floor Offices //
//
//
//                    "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
//                    "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
//                    "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
//                    "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
//                    "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
//                    "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
//                    "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
//                    "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
//                    "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
//                    "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
//                    "CITY VETERINARY OFFICE"-> Intent(this, SecondFloorVeterinary::class.java)
//                    "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
//                    "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
//                    "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
//                    "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
//                    "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,
//                        SecondFloorOfficeCSWD::class.java)
//                    "DILG" -> Intent(this, SecondFloorDILG::class.java)
//
//                    "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
//
//                    "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
//                    "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
//                    "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
//                    "CCO" -> Intent(this, SecondFloorCooperative::class.java)
//                    "CEO" -> Intent(this, SecondFloorEngineering::class.java)
//                    "CNO" -> Intent(this, SecondFloorNutrition::class.java)
//                    "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
//                    "CTC" -> Intent(this, SecondFloorTourism::class.java)
//                    "CVO" -> Intent(this, SecondFloorVeterinary::class.java)
//
//
////          Third Floor Offices //
//
//                    "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
//                    "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
//                    "CITY AUDITORS OFFICE" -> Intent(this, ThirdFloorAution::class.java)
//                    "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
//                    "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
//                    "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
//                    "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
//                    "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
//                    "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
//                    "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
//                    "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
//                    "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this, ThirdFloorMayorLounge::class.java)
//                    "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
//                    "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
//                    "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
//                    "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
//                    "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
//                    "MIS ROOM" -> Intent(this, ThirdFloorMISRoom::class.java)
//                    "NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
//                    "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
//
//                    "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
//
//                    "AO" -> Intent(this, ThirdFloorAccounting::class.java)
//                    "CL" -> Intent(this, ThirdFloorLibrary::class.java)
//                    "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
//                    "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
//                    "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
//                    "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
//
//
////          Fourth Floor Offices //
//
//                    "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
//                    "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
//                    "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
//                    "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
//                    "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
//                    "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
//                    "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
//                    "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
//                    "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
//                    "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
//                    "HON. BERNARDO B. HINAY" -> Intent(this, FourthFloorHINAY::class.java)
//                    "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
//                    "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
//                    "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
//                    "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
//                    "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
//                    "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
//                    "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
//                    "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
//                    "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
//                    "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
//                    "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
//                    "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
//                    "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
//                    "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
//                    "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
//                    "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
//                    "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
//                    "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
//
//                    "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
//
//                    "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
//                    "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
//                    "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
//                    "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
//                    "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
//
//
//                    else -> Intent(this, MainActivity::class.java)
//                }
//
//                startActivity(intent)
//                android.os.Handler().postDelayed({
//                    selectedValue = ""
//                    searchView.setQuery(selectedValue, false)
//                },2000)
//
//
//            }
//
//            val instruction = findViewById<ImageView>(R.id.btn_instruction)
//            instruction.setOnClickListener {
//
//            }
//
////        val navbar =findViewById<ImageButton>(R.id.nav_btn)
//
////        navbar.setOnClickListener{
////
////            val dialogBinding = layoutInflater.inflate(R.layout.activity_navbar, null)
////
////            val myDialog = Dialog(this)
////            myDialog.setContentView(dialogBinding)
////
////            val window = myDialog.window
////            window?.setGravity(Gravity.START)
////            window?.setDimAmount(0.5F) // Set dim amount to 0 for full transparency
////            val layoutParams = window?.attributes
////            layoutParams?.x = -100 // Set x offset to position the dialog
////            layoutParams?.y = 100 // Set y offset to position the dialog
////            window?.attributes = layoutParams
////
////            val lp = WindowManager.LayoutParams()
////            lp.copyFrom(myDialog.window?.attributes)
////            lp.width = WindowManager.LayoutParams.WRAP_CONTENT
////            lp.height = WindowManager.LayoutParams.MATCH_PARENT
////            myDialog.window?.attributes = lp
////
////            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
////            myDialog.setCanceledOnTouchOutside(true)
////            myDialog.show()
////
////            val xBtn = dialogBinding.findViewById<ImageButton>(R.id.close_nav_btn)
////            xBtn.setOnClickListener{
////                myDialog.dismiss()
////            }
////
////
////
////            val history = dialogBinding.findViewById<TextView>(R.id.lbl_history_one)
////            val historyTwo = dialogBinding.findViewById<TextView>(R.id.lbl_history_two)
////            val historyThree = dialogBinding.findViewById<TextView>(R.id.lbl_history_three)
////            val historyFour = dialogBinding.findViewById<TextView>(R.id.lbl_history_four)
////            val historyFive = dialogBinding.findViewById<TextView>(R.id.lbl_history_five)
////
////            val layout = dialogBinding.findViewById<LinearLayout>(R.id.layout)
////            layout.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
////
////
////            if (historyValueOne == "") {
////                history.text = ""
////                historyTwo.text = ""
////                historyThree.text = ""
////                historyFour.text = ""
////                historyFive.text = ""
////
////            } else {
////                history.text = historyValueOne
////                historyTwo.text = historyValueTwo
////                historyThree.text = historyValueThree
////                historyFour.text = historyValueFour
////                historyFive.text = historyValueFive
////            }
////            val expandAbout = dialogBinding.findViewById<androidx.cardview.widget.CardView>(R.id.cv_about)
////            expandAbout.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white))
////
////            val expandHistory = dialogBinding.findViewById<androidx.cardview.widget.CardView>(R.id.cv_history)
////            expandHistory.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white))
////
////            expandHistory.setOnClickListener {
////
////                val expandHisOne = if (history.visibility == View.GONE) View.VISIBLE else View.GONE
////                TransitionManager.beginDelayedTransition(layout, AutoTransition())
////                history.visibility = expandHisOne
////
////                val expandHisTwo = if (historyTwo.visibility == View.GONE) View.VISIBLE else View.GONE
////                TransitionManager.beginDelayedTransition(layout, AutoTransition())
////                historyTwo.visibility = expandHisTwo
////
////                val expandHisThree = if (historyThree.visibility == View.GONE) View.VISIBLE else View.GONE
////                TransitionManager.beginDelayedTransition(layout, AutoTransition())
////                historyThree.visibility = expandHisThree
////
////                val expandHisFour = if (historyFour.visibility == View.GONE) View.VISIBLE else View.GONE
////                TransitionManager.beginDelayedTransition(layout, AutoTransition())
////                historyFour.visibility = expandHisFour
////
////                val expandHisFive = if (historyFive.visibility == View.GONE) View.VISIBLE else View.GONE
////                TransitionManager.beginDelayedTransition(layout, AutoTransition())
////                historyFive.visibility = expandHisFive
////            }
////
////            history.setOnClickListener{
////                val intent = when (historyValueOne) {
////
//////          Basement Offices //
////                    "ARCHIVE" -> Intent(this, GroundArchive::class.java)
////                    "STORAGE" -> Intent(this, GroundStorage::class.java)
////                    "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
////                    "CGSO" -> Intent(this, GroundCGSO::class.java)
////                    "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
////                    "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
////                    "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
////                    "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
////                    "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
////                    "GSIS" -> Intent(this, GroundGSIS::class.java)
////                    "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
////                    "CANTEEN" -> Intent(this, GroundCanteen::class.java)
////                    "KITCHEN" -> Intent(this, GroundKitchen::class.java)
////                    "CDRM" -> Intent(this, GroundCityDisaster::class.java)
////                    "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
////
////
////                    "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
////
////
//////          First Floor Offices //
////
////
////                    "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
////                    "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
////                    "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
////                    "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
////                    "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
////                    "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
////                    "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
////                    "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
////                    "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
////                    "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
////                    "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
////
////                    "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)
////
//////          Second Floor Offices //
////
////
////                    "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
////                    "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
////                    "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
////                    "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
////                    "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
////                    "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
////                    "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
////                    "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
////                    "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
////                    "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
////                    "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
////                    "DILG" -> Intent(this, SecondFloorDILG::class.java)
////
////                    "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
////
////                    "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CCO" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CEO" -> Intent(this, SecondFloorEngineering::class.java)
////                    "CNO" -> Intent(this, SecondFloorNutrition::class.java)
////                    "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CTC" -> Intent(this, SecondFloorTourism::class.java)
////                    "CVO" -> Intent(this,SecondFloorVeterinary::class.java)
////
////
//////          Third Floor Offices //
////
////                    "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
////                    "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
////                    "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
////                    "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
////                    "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
////                    "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
////                    "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
////                    "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
////                    "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
////                    "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
////                    "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
////
////                    "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
////
////                    "AO" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CL" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
////
////
//////          Fourth Floor Offices //
////
////                    "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
////                    "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
////                    "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
////                    "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
////                    "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
////                    "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
////                    "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
////                    "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
////                    "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
////                    "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
////                    "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
////                    "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
////                    "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
////                    "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
////                    "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
////                    "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
////                    "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
////                    "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
////                    "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////                    "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
////                    "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
////
////                    "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
////
////                    "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////
////
////                    else -> Intent(this, MainActivity::class.java)
////                }
////                startActivity(intent)
////
////            }
////
////            historyTwo.setOnClickListener{
////                val intent = when (historyValueTwo) {
////
//////          Basement Offices //
////                    "ARCHIVE" -> Intent(this, GroundArchive::class.java)
////                    "STORAGE" -> Intent(this, GroundStorage::class.java)
////                    "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
////                    "CGSO" -> Intent(this, GroundCGSO::class.java)
////                    "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
////                    "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
////                    "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
////                    "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
////                    "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
////                    "GSIS" -> Intent(this, GroundGSIS::class.java)
////                    "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
////                    "CANTEEN" -> Intent(this, GroundCanteen::class.java)
////                    "KITCHEN" -> Intent(this, GroundKitchen::class.java)
////                    "CDRM" -> Intent(this, GroundCityDisaster::class.java)
////                    "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
////
////
////                    "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
////
////
//////          First Floor Offices //
////
////
////                    "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
////                    "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
////                    "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
////                    "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
////                    "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
////                    "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
////                    "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
////                    "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
////                    "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
////                    "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
////                    "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
////
////                    "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)
////
//////          Second Floor Offices //
////
////
////                    "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
////                    "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
////                    "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
////                    "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
////                    "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
////                    "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
////                    "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
////                    "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
////                    "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
////                    "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
////                    "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
////                    "DILG" -> Intent(this, SecondFloorDILG::class.java)
////
////                    "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
////
////                    "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CCO" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CEO" -> Intent(this, SecondFloorEngineering::class.java)
////                    "CNO" -> Intent(this, SecondFloorNutrition::class.java)
////                    "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CTC" -> Intent(this, SecondFloorTourism::class.java)
////                    "CVO" -> Intent(this,SecondFloorVeterinary::class.java)
////
////
//////          Third Floor Offices //
////
////                    "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
////                    "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
////                    "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
////                    "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
////                    "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
////                    "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
////                    "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
////                    "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
////                    "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
////                    "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
////                    "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
////
////                    "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
////
////                    "AO" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CL" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
////
////
//////          Fourth Floor Offices //
////
////                    "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
////                    "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
////                    "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
////                    "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
////                    "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
////                    "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
////                    "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
////                    "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
////                    "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
////                    "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
////                    "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
////                    "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
////                    "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
////                    "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
////                    "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
////                    "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
////                    "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
////                    "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
////                    "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////                    "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
////                    "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
////
////                    "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
////
////                    "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////
////
////                    else -> Intent(this, MainActivity::class.java)
////                }
////                startActivity(intent)
////
////            }
////
////            historyThree.setOnClickListener{
////                val intent = when (historyValueThree) {
////
//////          Basement Offices //
////                    "ARCHIVE" -> Intent(this, GroundArchive::class.java)
////                    "STORAGE" -> Intent(this, GroundStorage::class.java)
////                    "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
////                    "CGSO" -> Intent(this, GroundCGSO::class.java)
////                    "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
////                    "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
////                    "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
////                    "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
////                    "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
////                    "GSIS" -> Intent(this, GroundGSIS::class.java)
////                    "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
////                    "CANTEEN" -> Intent(this, GroundCanteen::class.java)
////                    "KITCHEN" -> Intent(this, GroundKitchen::class.java)
////                    "CDRM" -> Intent(this, GroundCityDisaster::class.java)
////                    "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
////
////
////                    "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
////
////
//////          First Floor Offices //
////
////
////                    "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
////                    "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
////                    "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
////                    "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
////                    "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
////                    "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
////                    "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
////                    "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
////                    "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
////                    "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
////                    "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
////
////                    "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)
////
//////          Second Floor Offices //
////
////
////                    "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
////                    "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
////                    "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
////                    "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
////                    "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
////                    "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
////                    "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
////                    "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
////                    "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
////                    "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
////                    "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
////                    "DILG" -> Intent(this, SecondFloorDILG::class.java)
////
////                    "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
////
////                    "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CCO" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CEO" -> Intent(this, SecondFloorEngineering::class.java)
////                    "CNO" -> Intent(this, SecondFloorNutrition::class.java)
////                    "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CTC" -> Intent(this, SecondFloorTourism::class.java)
////                    "CVO" -> Intent(this,SecondFloorVeterinary::class.java)
////
////
//////          Third Floor Offices //
////
////                    "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
////                    "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
////                    "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
////                    "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
////                    "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
////                    "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
////                    "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
////                    "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
////                    "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
////                    "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
////                    "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
////
////                    "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
////
////                    "AO" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CL" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
////
////
//////          Fourth Floor Offices //
////
////                    "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
////                    "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
////                    "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
////                    "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
////                    "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
////                    "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
////                    "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
////                    "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
////                    "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
////                    "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
////                    "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
////                    "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
////                    "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
////                    "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
////                    "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
////                    "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
////                    "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
////                    "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
////                    "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////                    "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
////                    "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
////
////                    "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
////
////                    "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////
////
////                    else -> Intent(this, MainActivity::class.java)
////                }
////                startActivity(intent)
////
////            }
////
////            historyFour.setOnClickListener{
////                val intent = when (historyValueFour) {
////
//////          Basement Offices //
////                    "ARCHIVE" -> Intent(this, GroundArchive::class.java)
////                    "STORAGE" -> Intent(this, GroundStorage::class.java)
////                    "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
////                    "CGSO" -> Intent(this, GroundCGSO::class.java)
////                    "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
////                    "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
////                    "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
////                    "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
////                    "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
////                    "GSIS" -> Intent(this, GroundGSIS::class.java)
////                    "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
////                    "CANTEEN" -> Intent(this, GroundCanteen::class.java)
////                    "KITCHEN" -> Intent(this, GroundKitchen::class.java)
////                    "CDRM" -> Intent(this, GroundCityDisaster::class.java)
////                    "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
////
////
////                    "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
////
////
//////          First Floor Offices //
////
////
////                    "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
////                    "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
////                    "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
////                    "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
////                    "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
////                    "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
////                    "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
////                    "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
////                    "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
////                    "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
////                    "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
////
////                    "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)
////
//////          Second Floor Offices //
////
////
////                    "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
////                    "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
////                    "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
////                    "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
////                    "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
////                    "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
////                    "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
////                    "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
////                    "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
////                    "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
////                    "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
////                    "DILG" -> Intent(this, SecondFloorDILG::class.java)
////
////                    "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
////
////                    "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CCO" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CEO" -> Intent(this, SecondFloorEngineering::class.java)
////                    "CNO" -> Intent(this, SecondFloorNutrition::class.java)
////                    "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CTC" -> Intent(this, SecondFloorTourism::class.java)
////                    "CVO" -> Intent(this,SecondFloorVeterinary::class.java)
////
////
//////          Third Floor Offices //
////
////                    "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
////                    "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
////                    "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
////                    "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
////                    "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
////                    "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
////                    "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
////                    "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
////                    "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
////                    "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
////                    "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
////
////                    "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
////
////                    "AO" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CL" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
////
////
//////          Fourth Floor Offices //
////
////                    "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
////                    "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
////                    "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
////                    "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
////                    "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
////                    "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
////                    "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
////                    "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
////                    "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
////                    "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
////                    "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
////                    "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
////                    "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
////                    "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
////                    "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
////                    "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
////                    "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
////                    "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
////                    "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////                    "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
////                    "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
////
////                    "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
////
////                    "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////
////
////                    else -> Intent(this, MainActivity::class.java)
////                }
////                startActivity(intent)
////
////            }
////
////            historyFive.setOnClickListener{
////                val intent = when (historyValueFive) {
////
//////          Basement Offices //
////                    "ARCHIVE" -> Intent(this, GroundArchive::class.java)
////                    "STORAGE" -> Intent(this, GroundStorage::class.java)
////                    "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
////                    "CGSO" -> Intent(this, GroundCGSO::class.java)
////                    "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
////                    "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
////                    "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
////                    "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
////                    "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
////                    "GSIS" -> Intent(this, GroundGSIS::class.java)
////                    "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
////                    "CANTEEN" -> Intent(this, GroundCanteen::class.java)
////                    "KITCHEN" -> Intent(this, GroundKitchen::class.java)
////                    "CDRM" -> Intent(this, GroundCityDisaster::class.java)
////                    "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
////
////
////                    "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
////
////
//////          First Floor Offices //
////
////
////                    "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
////                    "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
////                    "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
////                    "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
////                    "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
////                    "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
////                    "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
////                    "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
////                    "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
////                    "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
////                    "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
////
////                    "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
////                    "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
////                    "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                    "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                    "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                    "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)
////
//////          Second Floor Offices //
////
////
////                    "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
////                    "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
////                    "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
////                    "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
////                    "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
////                    "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
////                    "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
////                    "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
////                    "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
////                    "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
////                    "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
////                    "DILG" -> Intent(this, SecondFloorDILG::class.java)
////
////                    "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
////
////                    "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                    "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
////                    "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                    "CCO" -> Intent(this, SecondFloorCooperative::class.java)
////                    "CEO" -> Intent(this, SecondFloorEngineering::class.java)
////                    "CNO" -> Intent(this, SecondFloorNutrition::class.java)
////                    "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                    "CTC" -> Intent(this, SecondFloorTourism::class.java)
////                    "CVO" -> Intent(this,SecondFloorVeterinary::class.java)
////
////
//////          Third Floor Offices //
////
////                    "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
////                    "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
////                    "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
////                    "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
////                    "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
////                    "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
////                    "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
////                    "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
////                    "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
////                    "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
////                    "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
////                    "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
////
////                    "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
////
////                    "AO" -> Intent(this, ThirdFloorAccounting::class.java)
////                    "CL" -> Intent(this, ThirdFloorLibrary::class.java)
////                    "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                    "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
////                    "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                    "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
////
////
//////          Fourth Floor Offices //
////
////                    "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
////                    "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
////                    "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
////                    "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
////                    "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
////                    "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
////                    "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
////                    "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
////                    "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
////                    "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
////                    "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
////                    "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
////                    "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
////                    "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
////                    "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
////                    "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
////                    "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
////                    "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
////                    "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
////                    "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////                    "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
////                    "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
////
////                    "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
////
////                    "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                    "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                    "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                    "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
////                    "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////
////
////                    else -> Intent(this, MainActivity::class.java)
////                }
////                startActivity(intent)
////
////            }
////        }
//
//
//
//
//
////        searchFloor.setOnClickListener {
////            val intent = when (selectedValue) {
////
//////          Basement Offices //
////                "ARCHIVE" -> Intent(this, GroundArchive::class.java)
////                "STORAGE" -> Intent(this, GroundStorage::class.java)
////                "CTO STORAGE ROOM" -> Intent(this, GroundCTOStorage::class.java)
////                "CGSO" -> Intent(this, GroundCGSO::class.java)
////                "PMO STOCK ROOM" -> Intent(this, GroundPMO::class.java)
////                "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this, GroundCityDisaster::class.java)
////                "PARKING AREA" -> Intent(this, GroundParkingArea::class.java)
////                "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this, GroundSecurityRoom::class.java)
////                "SECURITY ROOM RIGHT" -> Intent(this, GroundSecurityCoop::class.java)
////                "GSIS" -> Intent(this, GroundGSIS::class.java)
////                "PUMP ROOM" -> Intent(this, GroundPumpRoom::class.java)
////                "CANTEEN" -> Intent(this, GroundCanteen::class.java)
////                "KITCHEN" -> Intent(this, GroundKitchen::class.java)
////                "CDRM" -> Intent(this, GroundCityDisaster::class.java)
////                "CGSO STORAGE ROOM" -> Intent(this, GroundCGSO::class.java)
////
////
////                "BASEMENT ELEVATOR" -> Intent(this, GroundFloorElevator::class.java)
////
////
//////          First Floor Offices //
////
////
////                "CITY ASSESSOR'S OFFICE" -> Intent(this, FirstFloorCityAssesor::class.java)
////                "CITY POPULATION OFFICE" -> Intent(this, FirstFloorCityPopulation::class.java)
////                "CITY TREASURERS OFFICE" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                "GROUND FLOOR MENS ROOM LEFT" -> Intent(this, FirstFloorMenRoomLeft::class.java)
////                "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this, FirstFloorMenRoomRight::class.java)
////                "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this, FirstFloorCRLeft::class.java)
////                "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this, FirstFloorCRRight::class.java)
////                "CONSTRUCTION PERMIT" -> Intent(this, FirstFloorConstructionPermit::class.java)
////                "ECONOMIC ENTERPRISES" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                "GROUND FLOOR ENTRANCE" -> Intent(this, FirstFloorEntrance::class.java)
////                "GROUND FLOOR EXIT" -> Intent(this, FirstFloorExit::class.java)
////                "CMO FRANCHISING UNIT" -> Intent(this, FirstFloorFranchisingUnit::class.java)
////                "GENERAL SERVICES" -> Intent(this,FirstFloorGeneralService::class.java)
////                "CSU/INFORMATION DESK" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this, FirstFloorBusinessPermit::class.java)
////                "LOBBY" -> Intent(this, FirstFloorLobby::class.java)
////
////                "CAO" -> Intent(this, FirstFloorCityAssesor::class.java)
////                "CPO" -> Intent(this, FirstFloorCityPopulation::class.java)
////                "CSU" -> Intent(this, FirstFloorCSUInformationDesk::class.java)
////                "CTO" -> Intent(this, FirstFloorCityTreasurers::class.java)
////                "CDEEO" -> Intent(this, FirstFloorEconomicEnterprises::class.java)
////                "CSGO" -> Intent(this,FirstFloorGeneralService::class.java)
////
//////          Second Floor Offices //
////
////
////                "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this, SecondFloorCityEnvironment::class.java)
////                "CITY AGRICULTURE'S OFFICE" -> Intent(this, SecondFloorCityArgiculture::class.java)
////                "CITY ARCHITECT'S OFFICE" -> Intent(this, SecondFloorCityArchitect::class.java)
////                "CITY COMMUNITY AFFAIRS OFFICE", -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                "CITY COOPERATIVES OFFICE" -> Intent(this, SecondFloorCooperative::class.java)
////                "CITY ENGINEERING OFFICE"-> Intent(this, SecondFloorEngineering::class.java)
////                "CITY NUTRITION OFFICE"-> Intent(this, SecondFloorNutrition::class.java)
////                "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this, SecondFloorTourism::class.java)
////                "CITY VETERINARY OFFICE"-> Intent(this,SecondFloorVeterinary::class.java)
////                "SECOND FLOOR MENS ROOM LEFT" -> Intent(this, SecondFloorMenRoomLeft::class.java)
////                "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this, SecondFloorMenRoomRight::class.java)
////                "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this, SecondFloorCRLeft::class.java)
////                "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this, SecondFloorCRRight::class.java)
////                "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this,SecondFloorOfficeCSWD::class.java)
////                "DILG" -> Intent(this, SecondFloorDILG::class.java)
////
////                "SECOND FLOOR ELEVATOR" -> Intent(this, SecondFloorElevator::class.java)
////
////                "CCRO" -> Intent(this, SecondFloorCivilRegistrar::class.java)
////                "CENR" -> Intent(this, SecondFloorCityEnvironment::class.java)
////                "CCAO" -> Intent(this, SecondFloorCommunityAffairs::class.java)
////                "CCO" -> Intent(this, SecondFloorCooperative::class.java)
////                "CEO" -> Intent(this, SecondFloorEngineering::class.java)
////                "CNO" -> Intent(this, SecondFloorNutrition::class.java)
////                "CSWDO" -> Intent(this, SecondFloorSocialWelfare::class.java)
////                "CTC" -> Intent(this, SecondFloorTourism::class.java)
////                "CVO" -> Intent(this,SecondFloorVeterinary::class.java)
////
////
//////          Third Floor Offices //
////
////                "ABC HALL" -> Intent(this, ThirdFloorABCHall::class.java)
////                "ACCOUNTING OFFICE" -> Intent(this, ThirdFloorAccounting::class.java)
////                "CITY AUCTION OFFICE" -> Intent(this, ThirdFloorAution::class.java)
////                "BID AND AWARD COMMITTEE" -> Intent(this, ThirdFloorAward::class.java)
////                "BUDGET HALL" -> Intent(this, ThirdFloorBudgetHall::class.java)
////                "CITY LIBRARY" -> Intent(this, ThirdFloorLibrary::class.java)
////                "CITY MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                "CITY PLANING AND DEVELOPMENT" -> Intent(this, ThirdFloorPlanning::class.java)
////                "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                "CITY LEGAL OFFICE" -> Intent(this, ThirdFloorLegaOffice::class.java)
////                "MAYOR'S OFFICE" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this,ThirdFloorMayorLounge::class.java)
////                "MAYOR'S STAFF OFFICE" -> Intent(this, ThirdFloorMayorStaff::class.java)
////                "THIRD FLOOR MENS ROOM LEFT" -> Intent(this, ThirdFloorMensRoomLeft::class.java)
////                "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this, ThirdFloorMensRoomRight::class.java)
////                "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this,  ThirdFloorWomensRoomRight::class.java)
////                "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this, ThirdFloorWomensRoomLeft::class.java)
////                "MIS ROOM-NEGOSYO CENTER" -> Intent(this, ThirdFloorNegosyo::class.java)
////                "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this, ThirdFloorCityAdministration::class.java)
////
////                "THIRD FLOOR ELEVATOR" -> Intent(this, ThirdFloorElevator::class.java)
////
////                "AO" -> Intent(this, ThirdFloorAccounting::class.java)
////                "CL" -> Intent(this, ThirdFloorLibrary::class.java)
////                "CMO" -> Intent(this, ThirdFloorMayorOffice::class.java)
////                "CPD" -> Intent(this, ThirdFloorPlanning::class.java)
////                "CHRMO" -> Intent(this, ThirdFloorResourceManagement::class.java)
////                "CLO" -> Intent(this, ThirdFloorLegaOffice::class.java)
////
////
//////          Fourth Floor Offices //
////
////                "CONFERENCE ROOM" -> Intent(this, FourthFloorCONFERENCEROOM::class.java)
////                "VICE MAYOR'S STAFF" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                "AUDIO VIDEO ROOM" -> Intent(this, FourthFloorAUDIOVIDEOROOM::class.java)
////                "CITY HEALTH OFFICE" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
////                "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this, FourthFloorCADELLINOCUBILO::class.java)
////                "HON. ANTONIO S. ABING" -> Intent(this, FourthFloorABING::class.java)
////                "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this, FourthFloorALBIOS::class.java)
////                "HON ESTER M. CATORCE" -> Intent(this, FourthFloorCATORCE::class.java)
////                "HON. FRANCIS ROSS DIDELES" -> Intent(this, FourthFloorDIDELES::class.java)
////                "HON. BERNARDO B. HINAY" -> Intent(this,FourthFloorHINAY::class.java)
////                "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this, FourthFloorJUMILIA::class.java)
////                "HON. MARK C. LAPIDEZ" -> Intent(this, FourthFloorLAPIDEZ::class.java)
////                "HON. ANNABELLE G. PINGOY" -> Intent(this, FourthFloorPINGOY::class.java)
////                "HON. GREGORIO O. PRESGA" -> Intent(this,  FourthFloorPRESGA::class.java)
////                "HON. JOHN REY P. RODRIGUEZ" -> Intent(this, FourthFloorRODRIGUEZ::class.java)
////                "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this, FourthFloorSALA::class.java)
////                "HON CLARISSE MAE T. SORONGON" -> Intent(this, FourthFloorSORONGON::class.java)
////                "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this, FourthFloorMENSROOMLEFT::class.java)
////                "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this, FourthFloorMENSROOMRIGHT::class.java)
////                "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this, FourthFloorWOMENSROOMLEFT::class.java)
////                "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this, FourthFloorWOMENSROOMRIGHT::class.java)
////                "MULTI-ROOM" -> Intent(this, FourthFloorMULTIROOM::class.java)
////                "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////                "SUPPLIES ROOM" -> Intent(this, FourthFloorSUPPLIESROOM::class.java)
////                "VICE MAYOR'S OFFICE" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                "COUNCIL SECRETARY OFFICE" -> Intent(this, FourthFloorCouncilSec::class.java)
////                "PRAYER ROOM" -> Intent(this, FourthFloorPrayer::class.java)
////
////                "FOURTH FLOOR ELEVATOR" -> Intent(this, FourthFloorElevator::class.java)
////
////                "CVMO" -> Intent(this, FourthFloorVICEMAYORSOFFICE::class.java)
////                "CVMSO" -> Intent(this, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
////                "CHO" -> Intent(this, FourthFloorCITYHEALTHOFFICE::class.java)
////                "CSO" -> Intent(this, FourthFloorCouncilSec::class.java)
////                "OSSO" -> Intent(this,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
////
////
////                else -> Intent(this, MainActivity::class.java)
////            }
////
////            selectedValue = ""
////            startActivity(intent)
////            searchView.setQuery(selectedValue, false)
////            searchFloor.isEnabled = shouldDisableButton
////        }
//
////        val imageView = findViewById<ImageView>(R.id.img_logo)
////
////        imageView.setOnClickListener {
////            // Change the image source based on the current image
////            if (imageView.drawable.constantState == resources.getDrawable(R.id.img_logo).constantState){
////                    imageView.setImageResource(R.drawable.koronadal_logo)
////                }
////            else{
////                    imageView.setImageResource(R.drawable.app_logo)
////            }
////        }
//
//        }
//    }
//}