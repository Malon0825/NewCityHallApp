import android.content.Intent
import com.example.cityhallbuildingnavigator.*

class Scratch {
    //                if (officeNames.contains(searchQuery)) {
//
//                    val intent = when (searchQuery) {
//
//                        "ARCHIVE" -> Intent(this@MainActivity, GroundArchive::class.java)
//                        "STORAGE" -> Intent(this@MainActivity, GroundStorage::class.java)
//                        "CTO STORAGE ROOM" -> Intent(this@MainActivity, GroundCTOStorage::class.java)
//                        "CGSO" -> Intent(this@MainActivity, GroundCGSO::class.java)
//                        "PMO STOCK ROOM" -> Intent(this@MainActivity, GroundPMO::class.java)
//                        "CITY DISASTER AND RISK MANAGEMENT" -> Intent(this@MainActivity, GroundCityDisaster::class.java)
//                        "PARKING AREA" -> Intent(this@MainActivity, GroundParkingArea::class.java)
//                        "SECURITY ROOM LEFT/COOP OFFICE" -> Intent(this@MainActivity, GroundSecurityRoom::class.java)
//                        "SECURITY ROOM RIGHT" -> Intent(this@MainActivity, GroundSecurityCoop::class.java)
//                        "GSIS" -> Intent(this@MainActivity, GroundGSIS::class.java)
//                        "PUMP ROOM" -> Intent(this@MainActivity, GroundPumpRoom::class.java)
//                        "CANTEEN" -> Intent(this@MainActivity, GroundCanteen::class.java)
//                        "KITCHEN" -> Intent(this@MainActivity, GroundKitchen::class.java)
//                        "CDRM" -> Intent(this@MainActivity, GroundCityDisaster::class.java)
//                        "CGSO STORAGE ROOM" -> Intent(this@MainActivity, GroundCGSO::class.java)
//
//
//                        "BASEMENT ELEVATOR" -> Intent(this@MainActivity, GroundFloorElevator::class.java)
//
//                        "PMO STOCK" -> Intent(this@MainActivity, GroundPMO::class.java)
//                        "CITY DISASTER" -> Intent(this@MainActivity, GroundCityDisaster::class.java)
//                        "SECURITY ROOM LEFT" -> Intent(this@MainActivity, GroundSecurityRoom::class.java)
//                        "CGSO STORAGE" -> Intent(this@MainActivity, GroundCGSO::class.java)
//                        "CTO STORAGE" -> Intent(this@MainActivity, GroundCTOStorage::class.java)
//
//
////          First Floor Offices //
//
//
//                        "CITY ASSESSOR'S OFFICE" -> Intent(this@MainActivity, FirstFloorCityAssesor::class.java)
//                        "CITY POPULATION OFFICE" -> Intent(this@MainActivity, FirstFloorCityPopulation::class.java)
//                        "CITY TREASURERS OFFICE" -> Intent(this@MainActivity, FirstFloorCityTreasurers::class.java)
//                        "GROUND FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, FirstFloorMenRoomLeft::class.java)
//                        "GROUND FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, FirstFloorMenRoomRight::class.java)
//                        "GROUND FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, FirstFloorCRLeft::class.java)
//                        "GROUND FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity, FirstFloorCRRight::class.java)
//                        "CONSTRUCTION PERMIT" -> Intent(this@MainActivity, FirstFloorConstructionPermit::class.java)
//                        "ECONOMIC ENTERPRISES" -> Intent(this@MainActivity, FirstFloorEconomicEnterprises::class.java)
//                        "GROUND FLOOR ENTRANCE" -> Intent(this@MainActivity, FirstFloorEntrance::class.java)
//                        "GROUND FLOOR EXIT" -> Intent(this@MainActivity, FirstFloorExit::class.java)
//                        "CMO FRANCHISING UNIT" -> Intent(this@MainActivity, FirstFloorFranchisingUnit::class.java)
//                        "GENERAL SERVICES" -> Intent(this@MainActivity,FirstFloorGeneralService::class.java)
//                        "CSU/INFORMATION DESK" -> Intent(this@MainActivity, FirstFloorCSUInformationDesk::class.java)
//                        "CMO BUSSINESS PERMIT AND LISCENCING" -> Intent(this@MainActivity, FirstFloorBusinessPermit::class.java)
//                        "LOBBY" -> Intent(this@MainActivity, FirstFloorLobby::class.java)
//
//                        "CAO" -> Intent(this@MainActivity, FirstFloorCityAssesor::class.java)
//                        "CPO" -> Intent(this@MainActivity, FirstFloorCityPopulation::class.java)
//                        "CSU" -> Intent(this@MainActivity, FirstFloorCSUInformationDesk::class.java)
//                        "CTO" -> Intent(this@MainActivity, FirstFloorCityTreasurers::class.java)
//                        "CDEEO" -> Intent(this@MainActivity, FirstFloorEconomicEnterprises::class.java)
//                        "CSGO" -> Intent(this@MainActivity,FirstFloorGeneralService::class.java)
//
//                        "CITY ASSESSOR" -> Intent(this@MainActivity, FirstFloorCityAssesor::class.java)
//                        "CITY POPULATION" -> Intent(this@MainActivity, FirstFloorCityPopulation::class.java)
//                        "CITY TREASURERS" -> Intent(this@MainActivity, FirstFloorCityTreasurers::class.java)
//                        "CONSTRUCTION" -> Intent(this@MainActivity, FirstFloorConstructionPermit::class.java)
//                        "CMO FRANCHISING" -> Intent(this@MainActivity, FirstFloorFranchisingUnit::class.java)
//                        "CSU DESK" -> Intent(this@MainActivity, FirstFloorCSUInformationDesk::class.java)
//                        "CMO BUSSINESS" -> Intent(this@MainActivity, FirstFloorFranchisingUnit::class.java)
//
////          Second Floor Offices //
//
//
//                        "CITY CIVIL REGISTRAR'S OFFICE" -> Intent(this@MainActivity, SecondFloorCivilRegistrar::class.java)
//                        "CITY ENVIRONMENT AND NATURAL RESOURCES"-> Intent(this@MainActivity, SecondFloorCityEnvironment::class.java)
//                        "CITY AGRICULTURE'S OFFICE" -> Intent(this@MainActivity, SecondFloorCityArgiculture::class.java)
//                        "CITY ARCHITECT'S OFFICE" -> Intent(this@MainActivity, SecondFloorCityArchitect::class.java)
//                        "CITY COMMUNITY AFFAIRS OFFICE" -> Intent(this@MainActivity, SecondFloorCommunityAffairs::class.java)
//                        "CITY COOPERATIVES OFFICE" -> Intent(this@MainActivity, SecondFloorCooperative::class.java)
//                        "CITY ENGINEERING OFFICE"-> Intent(this@MainActivity, SecondFloorEngineering::class.java)
//                        "CITY NUTRITION OFFICE"-> Intent(this@MainActivity, SecondFloorNutrition::class.java)
//                        "CITY SOCIAL WELFARE AND DEVELOPMENT OFFICE" -> Intent(this@MainActivity, SecondFloorSocialWelfare::class.java)
//                        "CITY TOURISM AND CULTURAL AFFAIRS" -> Intent(this@MainActivity, SecondFloorTourism::class.java)
//                        "CITY VETERINARY OFFICE"-> Intent(this@MainActivity,SecondFloorVeterinary::class.java)
//                        "SECOND FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, SecondFloorMenRoomLeft::class.java)
//                        "SECOND FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, SecondFloorMenRoomRight::class.java)
//                        "SECOND FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, SecondFloorCRLeft::class.java)
//                        "SECOND FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity, SecondFloorCRRight::class.java)
//                        "OFFICE OF THE CITY SOCIAL WELFARE AND DEVELOPMENT OFFICER" -> Intent(this@MainActivity,SecondFloorOfficeCSWD::class.java)
//                        "DILG" -> Intent(this@MainActivity, SecondFloorDILG::class.java)
//
//                        "SECOND FLOOR ELEVATOR" -> Intent(this@MainActivity, SecondFloorElevator::class.java)
//
//                        "CCRO" -> Intent(this@MainActivity, SecondFloorCivilRegistrar::class.java)
//                        "CENR" -> Intent(this@MainActivity, SecondFloorCityEnvironment::class.java)
//                        "CCAO" -> Intent(this@MainActivity, SecondFloorCommunityAffairs::class.java)
//                        "CCO" -> Intent(this@MainActivity, SecondFloorCooperative::class.java)
//                        "CEO" -> Intent(this@MainActivity, SecondFloorEngineering::class.java)
//                        "CNO" -> Intent(this@MainActivity, SecondFloorNutrition::class.java)
//                        "CSWDO" -> Intent(this@MainActivity, SecondFloorSocialWelfare::class.java)
//                        "CTC" -> Intent(this@MainActivity, SecondFloorTourism::class.java)
//                        "CVO" -> Intent(this@MainActivity,SecondFloorVeterinary::class.java)
//
//                        "CITY CIVIL" -> Intent(this@MainActivity, SecondFloorCivilRegistrar::class.java)
//                        "CITY ENVIRONMENT" -> Intent(this@MainActivity, SecondFloorCityEnvironment::class.java)
//                        "CITY AGRICULTURE" -> Intent(this@MainActivity, SecondFloorCityArgiculture::class.java)
//                        "CITY ARCHITECT" -> Intent(this@MainActivity, SecondFloorCityArchitect::class.java)
//                        "CITY COMMUNITY" -> Intent(this@MainActivity, SecondFloorCommunityAffairs::class.java)
//                        "CITY COOPERATIVES" -> Intent(this@MainActivity, SecondFloorCooperative::class.java)
//                        "CITY ENGINEERING" -> Intent(this@MainActivity, SecondFloorEngineering::class.java)
//                        "CITY NUTRITION" -> Intent(this@MainActivity, SecondFloorNutrition::class.java)
//                        "CITY SOCIAL" -> Intent(this@MainActivity, SecondFloorSocialWelfare::class.java)
//                        "CITY TOURISM" -> Intent(this@MainActivity, SecondFloorTourism::class.java)
//                        "CITY VETERINARY" -> Intent(this@MainActivity,SecondFloorVeterinary::class.java)
//                        "CITY SOCIAL WELFARE" -> Intent(this@MainActivity, SecondFloorSocialWelfare::class.java)
//
//
////          Third Floor Offices //
//
//                        "ABC HALL" -> Intent(this@MainActivity, ThirdFloorABCHall::class.java)
//                        "ACCOUNTING OFFICE" -> Intent(this@MainActivity, ThirdFloorAccounting::class.java)
//                        "CITY AUDITORS OFFICE" -> Intent(this@MainActivity, ThirdFloorAution::class.java)
//                        "BID AND AWARD COMMITTEE" -> Intent(this@MainActivity, ThirdFloorAward::class.java)
//                        "BUDGET HALL" -> Intent(this@MainActivity, ThirdFloorBudgetHall::class.java)
//                        "CITY LIBRARY" -> Intent(this@MainActivity, ThirdFloorLibrary::class.java)
//                        "CITY MAYOR'S OFFICE" -> Intent(this@MainActivity, ThirdFloorMayorOffice::class.java)
//                        "CITY PLANING AND DEVELOPMENT" -> Intent(this@MainActivity, ThirdFloorPlanning::class.java)
//                        "CITY HUMAN RESOURCE MANAGEMENT OFFICE" -> Intent(this@MainActivity, ThirdFloorResourceManagement::class.java)
//                        "CITY LEGAL OFFICE" -> Intent(this@MainActivity, ThirdFloorLegaOffice::class.java)
//                        "MAYOR'S OFFICE" -> Intent(this@MainActivity, ThirdFloorMayorOffice::class.java)
//                        "MAYOR'S LOUNGE AND CONFERENCE ROOM" -> Intent(this@MainActivity,ThirdFloorMayorLounge::class.java)
//                        "MAYOR'S STAFF OFFICE" -> Intent(this@MainActivity, ThirdFloorMayorStaff::class.java)
//                        "THIRD FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, ThirdFloorMensRoomLeft::class.java)
//                        "THIRD FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, ThirdFloorMensRoomRight::class.java)
//                        "THIRD FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity,  ThirdFloorWomensRoomRight::class.java)
//                        "THIRD FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, ThirdFloorWomensRoomLeft::class.java)
//                        "MIS ROOM" -> Intent(this@MainActivity, ThirdFloorMISRoom::class.java)
//                        "NEGOSYO CENTER" -> Intent(this@MainActivity, ThirdFloorNegosyo::class.java)
//                        "OFFICE OF THE CITY ADMINISTRATION OFFICE" -> Intent(this@MainActivity, ThirdFloorCityAdministration::class.java)
//
//                        "THIRD FLOOR ELEVATOR" -> Intent(this@MainActivity, ThirdFloorElevator::class.java)
//
//                        "AO" -> Intent(this@MainActivity, ThirdFloorAccounting::class.java)
//                        "CL" -> Intent(this@MainActivity, ThirdFloorLibrary::class.java)
//                        "CMO" -> Intent(this@MainActivity, ThirdFloorMayorOffice::class.java)
//                        "CPD" -> Intent(this@MainActivity, ThirdFloorPlanning::class.java)
//                        "CHRMO" -> Intent(this@MainActivity, ThirdFloorResourceManagement::class.java)
//                        "CLO" -> Intent(this@MainActivity, ThirdFloorLegaOffice::class.java)
//
//                        "CITY AUDITORS" -> Intent(this@MainActivity, ThirdFloorAution::class.java)
//                        "BID AND AWARD" -> Intent(this@MainActivity, ThirdFloorAward::class.java)
//                        "CITY PLANING" -> Intent(this@MainActivity, ThirdFloorPlanning::class.java)
//                        "CITY HUMAN" -> Intent(this@MainActivity, ThirdFloorResourceManagement::class.java)
//                        "CITY LEGAL" -> Intent(this@MainActivity, ThirdFloorLegaOffice::class.java)
//                        "MAYOR LOUNGE" -> Intent(this@MainActivity,ThirdFloorMayorLounge::class.java)
//                        "MAYOR STAFF" -> Intent(this@MainActivity, ThirdFloorMayorStaff::class.java)
//                        "CITY ADMINISTRATION" -> Intent(this@MainActivity, ThirdFloorCityAdministration::class.java)
//
//
////          Fourth Floor Offices //
//
//                        "CONFERENCE ROOM" -> Intent(this@MainActivity, FourthFloorCONFERENCEROOM::class.java)
//                        "VICE MAYOR'S STAFF" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
//                        "AUDIO VIDEO ROOM" -> Intent(this@MainActivity, FourthFloorAUDIOVIDEOROOM::class.java)
//                        "CITY HEALTH OFFICE" -> Intent(this@MainActivity, FourthFloorCITYHEALTHOFFICE::class.java)
//                        "COUNCIL CHAMBER AND MEDIA/AUDIENCE" -> Intent(this@MainActivity, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
//                        "HON. HANDEL DEE R. CADELLINO-CUBILO" -> Intent(this@MainActivity, FourthFloorCADELLINOCUBILO::class.java)
//                        "HON. ANTONIO S. ABING" -> Intent(this@MainActivity, FourthFloorABING::class.java)
//                        "HON. ELLEN GRACE N. SUBERE-ALBIOS" -> Intent(this@MainActivity, FourthFloorALBIOS::class.java)
//                        "HON ESTER M. CATORCE" -> Intent(this@MainActivity, FourthFloorCATORCE::class.java)
//                        "HON. FRANCIS ROSS DIDELES" -> Intent(this@MainActivity, FourthFloorDIDELES::class.java)
//                        "HON. BERNARDO B. HINAY" -> Intent(this@MainActivity,FourthFloorHINAY::class.java)
//                        "HON. CHARENE KRISTELLE C. JUMILIA" -> Intent(this@MainActivity, FourthFloorJUMILIA::class.java)
//                        "HON. MARK C. LAPIDEZ" -> Intent(this@MainActivity, FourthFloorLAPIDEZ::class.java)
//                        "HON. ANNABELLE G. PINGOY" -> Intent(this@MainActivity, FourthFloorPINGOY::class.java)
//                        "HON. GREGORIO O. PRESGA" -> Intent(this@MainActivity,  FourthFloorPRESGA::class.java)
//                        "HON. JOHN REY P. RODRIGUEZ" -> Intent(this@MainActivity, FourthFloorRODRIGUEZ::class.java)
//                        "HON. SHARMAIGNE ARIANNE M. SALA" -> Intent(this@MainActivity, FourthFloorSALA::class.java)
//                        "HON CLARISSE MAE T. SORONGON" -> Intent(this@MainActivity, FourthFloorSORONGON::class.java)
//                        "FOURTH FLOOR MENS ROOM LEFT" -> Intent(this@MainActivity, FourthFloorMENSROOMLEFT::class.java)
//                        "FOURTH FLOOR MENS ROOM RIGHT" -> Intent(this@MainActivity, FourthFloorMENSROOMRIGHT::class.java)
//                        "FOURTH FLOOR WOMEN ROOM LEFT" -> Intent(this@MainActivity, FourthFloorWOMENSROOMLEFT::class.java)
//                        "FOURTH FLOOR WOMEN ROOM RIGHT" -> Intent(this@MainActivity, FourthFloorWOMENSROOMRIGHT::class.java)
//                        "MULTI-ROOM" -> Intent(this@MainActivity, FourthFloorMULTIROOM::class.java)
//                        "ONE-STOP SHOP FOR OFWPRAYER ROOM" -> Intent(this@MainActivity,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
//                        "SUPPLIES ROOM" -> Intent(this@MainActivity, FourthFloorSUPPLIESROOM::class.java)
//                        "VICE MAYOR'S OFFICE" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
//                        "VICE MAYOR'S SECRETARY OFFICE" -> Intent(this@MainActivity, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
//                        "COUNCIL SECRETARY OFFICE" -> Intent(this@MainActivity, FourthFloorCouncilSec::class.java)
//                        "PRAYER ROOM" -> Intent(this@MainActivity, FourthFloorPrayer::class.java)
//
//                        "FOURTH FLOOR ELEVATOR" -> Intent(this@MainActivity, FourthFloorElevator::class.java)
//
//                        "CVMO" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
//                        "CVMSO" -> Intent(this@MainActivity, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
//                        "CHO" -> Intent(this@MainActivity, FourthFloorCITYHEALTHOFFICE::class.java)
//                        "CSO" -> Intent(this@MainActivity, FourthFloorCouncilSec::class.java)
//                        "OSSO" -> Intent(this@MainActivity,  FourthFloorONESTOPSHOPFOROFWPRAYERROOM::class.java)
//
//
//                        "VICE MAYOR STAFF" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
//                        "AUDIO ROOM" -> Intent(this@MainActivity, FourthFloorAUDIOVIDEOROOM::class.java)
//                        "VIDEO ROOM" -> Intent(this@MainActivity, FourthFloorAUDIOVIDEOROOM::class.java)
//                        "COUNCIL CHAMBER" -> Intent(this@MainActivity, FourthFloorCOUNCILCHAMBERANDMEDIAAUDIENCE::class.java)
//
//                        "HANDEL" -> Intent(this@MainActivity, FourthFloorCADELLINOCUBILO::class.java)
//                        "ANTONIO" -> Intent(this@MainActivity, FourthFloorABING::class.java)
//                        "ELLEN GRACE" -> Intent(this@MainActivity, FourthFloorALBIOS::class.java)
//                        "ESTER" -> Intent(this@MainActivity, FourthFloorCATORCE::class.java)
//                        "FRANCIS" -> Intent(this@MainActivity, FourthFloorDIDELES::class.java)
//                        "BERNARDO" -> Intent(this@MainActivity, FourthFloorJUMILIA::class.java)
//                        "CHARENE"-> Intent(this@MainActivity, FourthFloorJUMILIA::class.java)
//                        "MARK" -> Intent(this@MainActivity, FourthFloorLAPIDEZ::class.java)
//                        "ANNABELLE" -> Intent(this@MainActivity, FourthFloorPINGOY::class.java)
//                        "GREGORIO" -> Intent(this@MainActivity,  FourthFloorPRESGA::class.java)
//                        "JOHN REY" -> Intent(this@MainActivity, FourthFloorRODRIGUEZ::class.java)
//                        "SHARMAIGNE" -> Intent(this@MainActivity, FourthFloorSALA::class.java)
//                        "CLARISSE" -> Intent(this@MainActivity, FourthFloorSORONGON::class.java)
//
//                        "CADELLINO" -> Intent(this@MainActivity, FourthFloorCADELLINOCUBILO::class.java)
//                        "ABING" -> Intent(this@MainActivity, FourthFloorABING::class.java)
//                        "SUBERE" -> Intent(this@MainActivity, FourthFloorALBIOS::class.java)
//                        "CATORCE" -> Intent(this@MainActivity, FourthFloorCATORCE::class.java)
//                        "DIDELES" -> Intent(this@MainActivity, FourthFloorDIDELES::class.java)
//                        "HINAY" -> Intent(this@MainActivity, FourthFloorJUMILIA::class.java)
//                        "JUMILIA" -> Intent(this@MainActivity, FourthFloorJUMILIA::class.java)
//                        "LAPIDEZ" -> Intent(this@MainActivity, FourthFloorLAPIDEZ::class.java)
//                        "PINGOY" -> Intent(this@MainActivity, FourthFloorPINGOY::class.java)
//                        "PRESGA" -> Intent(this@MainActivity,  FourthFloorPRESGA::class.java)
//                        "RODRIGUEZ" -> Intent(this@MainActivity, FourthFloorRODRIGUEZ::class.java)
//                        "SALA" -> Intent(this@MainActivity, FourthFloorSALA::class.java)
//                        "SORONGON" -> Intent(this@MainActivity, FourthFloorSORONGON::class.java)
//
//                        "VICE MAYOR" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
//                        "VICE MAYOR SECRETARY" -> Intent(this@MainActivity, FourthFloorVICEMAYORSSECRETARYOFFICE::class.java)
//                        "COUNCIL SECRETARY" -> Intent(this@MainActivity, FourthFloorVICEMAYORSOFFICE::class.java)
//
//                        else -> null
//                    }
//                    if (intent != null) {
//                        startActivity(intent)
//                        android.os.Handler().postDelayed({
//                            selectedValue = ""
//                            searchView.setQuery(selectedValue, false)
//                        },2000)
//                    }
//                } else {
//                    Toast.makeText(applicationContext, "Item not found", Toast.LENGTH_LONG).show()
    //               }



    //            historyValue = selectedValue.toString()
//
//
//            historyValueFive = historyValueFour
//            historyValueFour = historyValueThree
//            historyValueThree = historyValueTwo
//            historyValueTwo = historyValueOne
//            historyValueOne = historyValue






    }