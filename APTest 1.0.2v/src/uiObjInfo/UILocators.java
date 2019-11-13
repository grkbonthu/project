package uiObjInfo;

public class UILocators {

	// gLogin
	public String gsiginlink_xp = "//a[text()='Sign in']";
	public String gUserName_id = "id=identifierId";
	public String gnext_xp = "//span[text()='Next']";
	public String gPassword_xp = "//input[@name='password']";
	public String gLoginbtn_xp = "//span[text()='Next']";

	// gLogout
	public String guser_xp = "//a[contains(text(),'Google Account')]";
	// this can also used instead of text "//a[contains(.,'Google Account')]"
	public String glogout_xp = "//a[.='Sign out']";

	// Login page
	public String username_id = "id=userid";
	public String password_id = "id=password";
	public String signin_id = "id=btnActive";

	// Home page
	public String home_id = "id=pt1:_UIShome::icon";
	public String Payables_id = "id=groupNode_payables";
	public String Invoices_xp = "//div[@title='Invoices']";
	public String Payments_xp = "//div[@title='Payments']";
	public String Sudarshan_xp = "//span[@title='Vulavala Sudarshanreddy']";
	
	public String PayablesIcon_xp="//div[@title='Payables']";
	public String PaymentIcon_xp="//a[@id='itemNode_payables_payables_payments_2']";

	// Task bar
	public String TaskBar_xp = "//div[@title='Tasks']";
	
	
	
	//Validation For Supplier Search Results
	public String SuppNoResults_xp = "//div[text()='No rows to display']";
	//Validation For Invoice Number Results
	public String InvNoResults_xp = "//div/span[contains(text(),'This invoice number already exists.')]";
	
	
	
	
	// Create invoice
	public String create_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl1']";
	//Create Mass Additions
	public String CreateMassAdditions_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl16']";
	//Accounting Date
	public String AccountingDate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE1_ATTRIBUTE1::content']";
	//Asset Book
	public String AssetBook_xp = "//option[@title='CYTK US CORP BOOK']";
	//Assetbook
	public String AssetBook1_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE2_ATTRIBUTE2::content']";

	//Submit
	//public String Submit_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:requestBtns:submitButton']";
	//Ok
	public String SubmitOk_xp = "//button[text()='OK']";
	//Fixed Assets
	public String FixedAssets_xp = "//a[text()='Fixed Assets']";
	//Assets
	public String Assets_xp = "//a[text()='Assets']";
	
	
	
	//Multiperiod Accounting Invoice
	public String MultiperiodAccounting_xp = "//a[text()='Multiperiod Accounting']";
	//Accrual Account
	public String AccrualAccount_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf10KBIMG']";
	//Accrual Department Drop down
	public String AccrualDepartmentDD_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf10SPOP_query:value10::lovIconId']";
	
	
	//Accrual Department
	public String AccrualDepartment_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf10SPOP_query:value10::content']";
	//Accrual AutoSearch
	public String AccrualSearch_xp = "//table[@class='x1nj']/tbody/tr/td";
	//Accrual Account
	public String AccrualAccount1_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf10SPOP_query:value20::content']";
	//Accrual Account Dropdown
	public String AccrualAccountDD_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf10SPOP_query:value20::lovIconId']";
	//Accrual Ok
	public String AccrualOk_xp = "//button[text()='O']";
	//Start Date
	public String AccrualStartDate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:id3::content']";
	//End Date
	public String AccrualEndDate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:id6::content']";
	
	
	// Invoice Header-Identifying PO
	public String PO_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic1::content']";
	// Business Unit
	public String BU_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic2::content']";
	// Business Drop Down
	public String BUdrop_xp = "//span[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic2::cntnrSpan']";
	// BU Select Option
	public String BUselect_xp = "//tr[@_afrrk='0']";
	// Supplier
	public String Supp_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content']";
	// Supplier Select
	public String Suppselect_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:pl3']";
	// Supplier Number label
	public String Suppnum_xp = "//label[text()='Supplier Number']";
	// Supplier Advanced Search controls
	// Supplier Search
	public String SupplierSearch1_xp = "//a[contains(@title,'Search: Supplier')]";
	// Advanced
	public String SupplierAdvanced_xp = "//button[@accesskey='d']";
	// Supplier name
	public String Suppliernameadv_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::_afrLovInternalQueryId:value00::content']";
	// Supplier number
	public String Suppliernoadv_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::_afrLovInternalQueryId:operator1::content']";
	// Taxpayer dd
	public String Suppliertaxpayerdd_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::_afrLovInternalQueryId:operator2::content']";
	// Search
	public String Suppsearch_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::_afrLovInternalQueryId::search']";
	public String SuppSelect1_xp = "//table[@_afrit='1']//tr/td[1]/span";
	// ok
	public String Suppok_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::lovDialogId::ok']";
	// Goods Line Select
	public String Goodsline_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:p14']";
	// Click
	public String Goodsclick_xp = "//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:at1:_ATp:ta1:0:sb1::content']";
	// Quantity
	public String Goodsquantity_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:at1:_ATp:ta1:0:i1::content']";
	// Unit Price
	public String GoodsUnitPrice_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:at1:_ATp:ta1:0:i2::content']";
	// Goods Ok
	public String GoodsOk_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb17']";
	// Amount
	public String ServicesAmount_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:at1:_ATp:ta1:0:i3::content']";
	// Supplier Site
	public String Site_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic4::content']";
	// Attribute pop-up
	public String pop_xp = "//button[@id='d1::msgDlg::cancel']";
	// Number
	public String Number_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content']";
	// Amount
	public String Amount_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content']";
	// Type
	public String Type_xp = "//select[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so1::content']";
	// Debit Memo
	public String Debit_xp = "//option[@title='Debit memo']";
	// Credit Memo
	public String Credit_xp = "//option[@title='Credit memo']";
	// Date
	public String Date_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:id2::content']";
	// Date Calendar
	public String Datecal_xp = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:id2::glyph']";
	// Payment Terms
	public String Payment_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so3::content']";
	// Payment drop Terms
	public String Paymentdd_xp = "//span[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so3::cntnrSpan']";
	// Terms Date
	public String Terms_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:id5::content']";
	// Requester
	public String Requester_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic6::content']";
	// Show More
	public String Showmore_xp = "//table[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:p4']";
	// Show Less
	public String Showless_xp = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cl2']";
	// Accounting
	public String Accounting_xp = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:sm2::disAcr']";
	// Accounting Date
	public String Datecalendar_xp = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:id4::glyph']";
	public String Datemanual_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:id4::content']";
	// Lines Tilt
	public String Lines_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:sh2::_afrDscl']";
	// Lines tilt for edit
	public String Linestilt_xp = "//a[@title='Expand Lines']";
	// Select line
	public String SelectLine_xp = "//table/tbody/tr[@_afrrk='0']";
	// Cancel Line
	public String Linecancel_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:at2:_ATp:ctb2']";
	// Save Cancelled Line
	public String SaveLine_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:ct5']";
	// Amount
	public String Lineamount_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:i26::content']";
	// Distribution select
	public String Linedistribution1_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so13::content']";
	// Distribution Set
	public String Linedistributiondd_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so13::lovIconId']";
	// Distribution Combination
	public String Linedistributioncomb_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1KBIMG']";
	// Department
	public String Department_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1SPOP_query:value10::content']";
	// 1
	public String Department1_xp = "//tr[@_afrrk='0']";
	// public String Deptdpdn_xp="//span[@class='p_AFDepressed x1tq']";
	public String Deptdpdn_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1SPOP_query:value10::lovIconId']";
	// Account
	public String Account_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1SPOP_query:value20::content']";
	// 1
	public String Account1_xp = "//div[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1SPOP_query:value20::dropdownPopup::dropDownContent::db']/table/tbody/tr/td/span";
	// Account Dropdown
	public String Accountdd_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1SPOP_query:value20::lovIconId']";
	public String Acclist_xp = "//table[@class='x1no']//tbody/tr/td";
	
	//Distribution Set Search
	public String DistributionSet_xp = "//a[text() = 'Search...']";
	//Advanced
	public String DistributionSetAdv_xp = "//button[text() = 'A']";
	//Set
	public String DistributionSet1_xp = "//input[@id = 'pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so13::_afrLovInternalQueryId:value00::content']";
	//Search
	public String DistributionSetSearch_xp = "//button[text() = 'Search']";
	//Select
	public String DistributionSet2_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so13_afrLovInternalTableId::db']//table/tbody/tr";
	//Ok Button
	public String DistributionSetOk_xp = "//button[text() = 'OK']";
	

	// Tax Refresh
	public String TaxRefresh_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cil2']";
	
	//Distribution Combination Click
	public String DistributionCombination_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1CS::content']";

	// Ok
	public String Selectok_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1SEl']";
	// Line accounting date
	public String Linedate_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:id1::content']";

	// Description
	public String Linedescription_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:i34::content']";
	// Line Requester
	public static String Linerequester_xp = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:ic202::content']";
	// Number
	public String Linenumber_xp = "//span[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:ic21']";
	// Track as Asset
	public String Trackasset_xp = "//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:sb5::content']";
	// Invoice Actions
	public String Invoiceactions_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:me1']";
	//Invoice Actions
	public String Invoiceactions1_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:me1']";
	//CancelInv
	public String CancelInv_xp = "//td[text()='Cancel Invoice']";
	//CancelInv ok
	public String CancelInvOk_xp = "//span[text()='K']";
	//Post
	public String PL_xp = "//td[text()='Post to Ledger']";
	//ViewAccounting
	public String viewAccount_xp = "//button[text()='View Accounting']";
	//ViewAccounting done
	public String viewAccountdone_xp = "//span[text()='o']";
	
	// Manage Installments
	public String Manageinstallments_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm3']";
	// SaveAndClose
	public String InstallmentsSave_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb27']";
	// Correct Matched invoice Lines
	public String MatchedInvoice_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:so3::content']";
	// Click Matched invoice Lines
	public String MatchedInvoice1_xp = "//option[@title='Correct Matched Invoices']";
	// Lines Go
	public String LinesGo_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:p14']";
	// Correct
	public String Correct_xp = "//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r10:1:at1:_ATp:ta1:0:sb1::content']";
	// Correction Type
	public String CorrectionType_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r10:1:at1:_ATp:ta1:0:so1::content']";
	// Amount
	public String CorrectionAmount_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r10:1:at1:_ATp:ta1:0:i3::content']";
	// Ok
	public String CorrectionOk_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm7']";

	// Calculate Tax
	public String Calculatetax_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cmi1']";
	// Tax amount
	public String TaxAmount_xp = "//table/tbody/tr/td/span[@class='xmo']";
	// Due amount
	public String TaxAmountDC_xp = "//table/tbody/tr/td/span[@class='xmj'] and contains(text, 'Due')";
	// Validate
	public String Validate_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm1']";
	// Apply or Unapply prepayments
	public static String Prepayments_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cm2']";
	// Manage Holds
	public String Manageholds_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cm4']";
	// Approval
	public String Approval_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:me2']";
	// 1.Initiate
	public String Initiate_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:1:MAnt2:1:pm1:r1:0:ap1:cm5']";
	// 2.Withdraw
	public static String Withdraw_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cm9']";
	// 3.Hold
	public static String Hold_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cm10']";
	// 4.Resubmit
	public static String Resubmit_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cm12']";
	// 5.Approve
	public static String Approve_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cmi4']";
	// 6.Reject
	public static String Reject_xp = "//tr[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cmi8']";
	// 7.Force Approve
	public String ForceApprove_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm11']";
	// Delete Invoice
	public String Deleteinvoice_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm15']";
	// Delete Yes
	public String Deleteinvoiceyes_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:d49::yes']";
	// Save and Create next
	public static String Saveandnext_xp = "//div[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:ct4']";
	// Save
	public String Save_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:ct5']";
	// Save and Close
	public String Saveandclose_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb14']";
	// Cancel
	public String Cancel_xp = "//div[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb33']";
	// post to ledger
	public String PosttoLedger_xp = "//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm16']";
	// Pay in Full
	public String PayinFull_xp = "//tr[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cmi2']";
	// Needs revalidation
	public String Needsrevalidation_xp = "//table[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:pg2']";
	// System holds
	public String SystemHolds_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r22:0:ta1:4:cl2']";
	// System Holds Save and close
	public String SystemHoldsSaveandclose_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb9']";
	// Manage Actions
	//public String Actions_xp = "//div[@aria-label='Actions']";
	// Cancel invoice
	// public String CancelInvoice_xp =
	// "//tr[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:0:pm1:r1:0:ap1:at1:_ATp:cm10']";
	public String CancelInvoice_xp = "//td[@class='xnr'] and contains(text(),'Cancel Invoice')";
	// Cancel Ok
	public String CancelInvoiceOk_xp = "//button[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:0:pm1:r1:0:ap1:at1:cb40']";
	// Actions Post to Ledger
	public String ActionsPosttoLed_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ATm']";
	// View Accounting
	public String ViewAccounting_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb42']";
	// View Accounting Done
	public String ViewAccountingDone_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb99']";

	// Manage Invoice
	public String Manage_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl4']";
	// Invoice Number
	public String Invoiceno_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:q1:value10::content']";
	// Invoice Date
	public String Invoicedate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:q1:value30::content']";
	// Supplier or Party
	public String Invoicesupplier_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:q1:value40::content']";
	// Supplier Number
	public String Invsupplierno_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:q1:value50::content']";
	// Invoice group
	public String Invgroup_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:q1:value80::content']";
	// Search
	public String Search_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:q1::search']";

	// select search
	public String InvoiceSearch_xp = "//table[@class='x1no x1oc']/tbody/tr/td";
	// Edit Mode
	public String InvoiceEdit_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ct1']";

	// Tools
	public String Tools_xp = "//div[@title='Tools']"; //Alekya
	// Reports and Analytics
	public String Reports_xp = "//a[@id='itemNode_tools_reports_and_analytics_3']";
	// Browse Catalog
	public String Browse_xp = "//button[@title='Browse Catalog']";
	// Shared folders
	public String Sharedfolder_xp = "//img[contains(@id,'shared_disclosure')]";
	// Expand
	public String Expand_xp = "//a[@class='CatalogTasksActionListItem']";
	// Custom
	public String Custom_xp = "//img[contains(@id,'shared/Custom_disclosure')]";
	// Financial
	public String Financials_xp = "//img[contains(@id,'shared/Custom/Financials_disclosure')]";
	// Payable
	public String Payables_xp = "//img[contains(@id,'shared/Custom/Financials/Payables_disclosure')]";
	// Reports Expand
	public String ReportsExpand_xp = "//span[@title='Payables']";
	// Data Model
	public String DataModels_xp = "//img[contains(@id,'shared/Custom/Financials/Payables/Data Models_disclosure')]";
	// Data Model Expand
	public String DataModelexpand_xp = "//span[@title='Data Models']";
	// Report Click
	public String ReportClick_xp = "//td/span[text()='CYTK AP Invoice Aging Report by Invoice Date']";
	// Invoice Aging
	public String Aging_xp = "//table[@cellspacing='3']";
	// Open
	public String Open_xp = "//a[@class='CatalogTasksActionListItem']";
	// Report as of date
	public String Reportdate_xp = "//img[@src='/xmlpserver/theme/alta/images/timedate_ena.png']";
	// Date ok
	public String Dateok_xp = "//button[@class='button']";
	// Apply
	public String Apply_xp = "//button[@title='Apply']";

	// Procurement Reports
	public String Procurement_xp = "//img[contains(@id,'shared/Custom/Procurement_disclosure')]";
	// Procurement Expand
	public String Procurementexp_xp = "//span[@title='Procurement']";
	// Report Click Supplier Listing Report
	public String ReportClick1_xp = "//td/span[text()='CYTK Suppliers Listing Report With Approvals']";
	// Invoice Aging
	public String Listing_xp = "//table[@cellspacing='4']";

	// Schedule Process
	public String Scheduleprocess_xp = "//a[@id='itemNode_tools_scheduled_processes_fuse_plus_4']";
	// Schedule New Process
	public String Schedulenewprocess_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:panel:scheduleProcess']";
	// Name
	public String ScheduleName_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::content']";
	// Name DropDown
	public String Scheduledd_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::lovIconId']";
	// Schedule Search
	public String Schedulesearch_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::dropdownPopup::popupsearch']";
	// Name
	public String ScheduleName1_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId:value00::content']";
	// Schedule Search
	public String Schedulesearch1_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId::search']";
	// Select
	// public String Scheduleselect_xp = "//tr[@class='p_AFSelected p_AFFocused
	// xep']/td[2]/div/table/tbody/tr/td";
	public String Scheduleselect_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2_afrLovInternalTableId::db']//table/tbody/tr/td";
	// Ok
	public String ScheduleOk_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::lovDialogId::ok']";
	// Ok1
	public String ScheduleOk1_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:snpokbtnid']";
	// Business Unit
	public String Businessunit_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_BusinessUnit::content']";
	// Tax Reporting Entity
	public String Taxreporting_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_RepEntity::content']";
	// Tax Reporting Entity Us Report
	public String Taxreporting1_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_TaxReportingEntity::content']";
	// From Accounting Date
	public String Fromaccounting_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_FromDate::content']";
	// From Accounting Date Us Report
	public String Fromaccounting1_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_FromPaymentDate::content']";
	// To Accounting Date
	public String Toaccounting_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ToPaymentDate::content']";
	// Schedule Aging Period
	public String ScheduleAging_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content']";
	// Schedule Aging Period select
	public String ScheduleAging1_xp = "//select[@title='Monthly Aging Periods']";
	// Schedule Submit
	public String Schedulesubmit_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:requestBtns:submitButton']";
	// Process ok
	public String Scheduleprocess1_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok']";
	// Process Refresh
	public String Scheduleprocess2_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:panel:processRefreshId']";
	// Schedule Process Succeeded
	public String Scheduleprocess3_xp = "//a[@title='Succeeded']";
	// Job Status
	public String JobStatus_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:stsmsginfopwid::ok']";
	// Schedule Process Republish
	public String Scheduleprocess4_xp = "//button[text()='Republish']";
	
	
	//Schedule Process iFrame1
	public String Scheduleprocess4iframe1_xp = "//iframe[@id='afr::PushIframe']";
	
	//Schedule Process Republish iframe
	public String Scheduleprocess4iframe_xp = "//iframe[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r61:0:if1']";
	//Click Republish
	public String TraverseRepublish_xp = "//iframe/html/body/div/div/div/div/div/div/div/button[@type='button']";
	
	public String ScheduleprocessRepublish_xp = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/span[5]/button[1]";
	
	
	
	// Schedule Actions
	public String Scheduleprocess5_xp = "//img[@title='Actions']";
	// Schedule Actions Export
	public String Scheduleprocess6_xp = "//div[@id='_xdoFMenu0']";
	// Schedule excel download
	public String Scheduleprocess7_xp = "//li[@fmid='105']";
	// Schedule From Date
	public String Schedulefromdate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_FromDate::content']";
	// Schedule To Date
	public String Scheduletodate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ToDate::content']";

	
	//Parameters
	public String ClickParameters_xp = "//a[@title='Expand Parameters']";
	//Output
	public String ClickOutput_xp = "//h1[contains(text(),'Output')]";
		
	//XML Data
	public String ClickXMLdata_xp = "//label[contains(text(),'XML Data')]";
	//Download Icon
	public String ClickDownloadIcon_xp = "//span[@class='downloadIconEnabled']";
	
	
	
	// Invoice from Spreadsheet
	public String Spreadsheet_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl2']";

	// Payments Task Bar
	public String PaymentTaskbar_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::ti']";
	// Payments
	public String CreatePayment_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl4']";
	// Business Unit
	public String BusinessUnit_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:OrgUiId::content']";
	// Supplier or Party
	public String SupplierorParty_xp = "//span[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:payeeNameId::cntnr']";
	// Disbursement Bank Account
	public String DisbursementBank_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:bankAccountNameId::content']";
	// Payment Method
	public String PaymentMethod_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl4']";
	// Payment Method DD
	public String PaymentMethodDD_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:paymentMethodNameUiId::lovIconId']";
	// Payment Process Profile
	public String PaymentProcess_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:paymentProfileUICompId::content']";
	// Remit to account
	public String RemitAccount_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:remitToBankAccountNumberId::content']";
    //Invoices to Pay
	public String SelectandAdd_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT1:_ATp:commandToolbarButton1']";
	//Invoice Number
	public String Invoicenumber_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:coVOId:value00::content']";
	//Search
	public String SearchInvoice_xp = "//button[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:0:coVOId::search']";
	//Invoice Search
	public String InvSearch_xp = "//table/tbody/tr[@_afrrk='11']";
	//Invoice Ok
	public String InvoiceOk_xp = "//button[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:0:dialog1::ok']";
	//Save and close
	public String PaymentSave_xp = "//button[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:0:AP1:cb5']";
	
	
	
	//Pay in Full
	public String PayFull_xp = "//td[text()='Pay in Full']";
	//PPR
	public String PPR_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r9:1:paymentProfileNameId::content']";
	//PPR DD
	public String PPRDD_xp = "//span[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r9:1:paymentProfileNameId::cntnrSpan']";
	//Submit
	public String PPRSubmit_xp = "//button[text()='Sub']";
	//Submit Ok
	public String PPRSubmitOk_xp = "//button[text()='OK']";
	
	//PPR Search
	public String PPRSearch_xp = "//a[text()='Search...']";
	//Name
	public String PPRname_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r9:1:paymentProfileNameId::_afrLovInternalQueryId:value00::content']";
	//Name Search
	public String PPRnameSearch_xp = "//button[text()='Search']";
	//Name Select
	public String PPRnameSelect_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r9:1:paymentProfileNameId_afrLovInternalTableId::db']//table/tbody/tr";
	//Name Ok
	public String PPRNameok_xp = "//button[text()='OK']";
	
	
	// Manage Payment
	public String ManagePayment_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl5']";
	// Manage Supplier
	public String ManageSupplier_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value00::content']";
	// Payment Date
	public String ManagePaymentDate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value10::content']";
	// Payment Number
	public String ManagePaymentNumber_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value20::content']";
	// Disbursement Bank Account
	public String ManageDisbursement_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value30::content']";
	// Payment Type
	public String ManagePaymentType_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:AP1:q1:value40::content']";
	// Payment Process Request
	public String ManagePaymentProcess_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value50::content']";
	// Search payment
	public String SearchPayment_xp = "//button[text()='Search']";

	// Submit Payment Process Request
	public String SubmitPPR_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl1']";
	// Payment Name
	public String PaymentName_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:3:ap1:inputText1::content']";
	// Template
	//public String Template_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:3:ap1:templateNameId::content']";
	// Template Drop Down
	public String Templatedd_xp = "//span[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:3:ap1:templateNameId::cntnrSpan']";
	// Pay Through Date
	public String Paythroughdate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:3:ap1:inputDate2::content']";
	// Payment Method
	public String Paymentmethod_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:paymentMethodNameId::content']";
	// Supplier
	public String SupplierPPR_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:partyNameId::content']";
	// Pay From Date
	public String Payfromdate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputDate4::content']";

	// Payment Processing Options
	// Payment Date
	public String PaymentDate_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputDate1::content']";

	//InvoiceSelect
	public String InvoiceSelect_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1:0:cl1']";
	//Payments
	public String PaymentsCol_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r7:1:sm3::disAcr']";
	//Select Payment Line
	public String PaymentLine_xp = "//table/tbody/tr[@_afrrk='0']";
	//Payment number
	public String Paymentnumber_xp = "//table/tbody/tr/td[@class='xeq']";
	//Select Payment number
	public String PaymentNumSelect_xp = "//table/tbody/tr[@_afrrk='0']";
	//Payment Actions
	public String PaymentNumActions_xp = "//div[@class='xmi']";
	//Void Payment
	public String PaymentVoid_xp = "//td[text()='Void']";
	//Void Submit
	public String SubmitVoid_xp = "//button[text()='Sub']";
	//Void Done
	public String VoidDone_xp = "//span[text()='D']";
	
	
	//Manage Supplier
	public String ManageSupp_xp = "//a[text()='Manage Suppliers']";
	//Keywords
	public String Keywords_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:pt1:Suppl1:0:AP1:q1:value00::content']";
	//Search Keywords
	public String SearchKeywords_xp = "//button[text()='Search']";
	//Select Supplier
	public String SelectSupplier_xp = "//table/tbody/tr/td/span[@class='x2rx']";
	//Select Supplier Num
	public String SelectSupplier1_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:pt1:Suppl1:0:AP1:AT1:_ATp:Table:0:cl1']";
	//Edit
	public String SupplierEdit_xp = "//span[text()='Edit']";
	
	
	//Procurement Icon
	public String Procurement_id = "id=groupNode_procurement_9";
	//Suppliers Icon
	public String SuppliersIcon_xp = "//div[@title='Suppliers']";
	//Supplier Task
	public String SuppliersTaskbar_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard__FndTasksList::ti']";
	//Create Supplier
	public String CreateSupplier_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:RAtl3']";
	//Supplier Name
	public String SupplierName_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:it1::content']";
	//Tax Organization Type
	public String TaxOrganization_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc1::content']";
	//Corporation
	public String TaxOrganizationType_xp = "//option[@title='Corporation']";
	//Create
	public String Create_xp = "//button[text()='Create']";
	//Supplier Type
	public String SupplierType_xp = "//select[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:selectOneChoice4::content']";
	//Supplier Type 1
	public String SupplierType1_xp = "//option[@title='Supplier']";
	//Income Tax Tab
	public String IncomeTax_xp = "//a[text()='Income Tax']";
	//Tax Payer Country
	public String TaxPayerCountrydd_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:territoryShortNameId::lovIconId']";
	//Tax Payer Country Search
	public String TaxPayerCountrySearch_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:territoryShortNameId::dropdownPopup::popupsearch']";
	//Tax Payer Country Advanced
	public String TaxPayerCountryAdvanced_xp = "//button[text()='A']";
	//Name
	public String TaxPayerCountryName_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:territoryShortNameId::_afrLovInternalQueryId:value00::content']";
	//Search
	public String TaxPayerSearch_xp = "//button[text()='Search']";
	//Select Tax Payer Country
	public String TaxPayerSelect_xp = "//table/tbody/tr/td/span[text()='United States']";
	//Ok
	public String TaxPayerSearchOk_xp = "//button[text()='OK']";
	
	
	
	//Tax Payer Id
	public String TaxPayerId_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:text32a::content']";
	//Federal Reportable
	public String FederalReportable_xp = "//label[@for='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:FdrlReportableFlagId::content']";
	//Federal Income Tax Type Drop Down
	public String FederalIncomeTaxDD_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:type1099Id::content']";
	//Federal Income Tax Type
	public String FederalSearch_xp = "//a[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt4:0:ap1:type1099Id::dropdownPopup::popupsearch']";
	//Federal Advanced
	public String FederalAdvanced_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt4:0:ap1:type1099Id::_afrLovInternalQueryId::mode']";
	//Income Tax Type
	public String FederalIncomeTax_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt4:0:ap1:type1099Id::_afrLovInternalQueryId:value00::content']";
	//Income Tax Search
	public String FederalIncomeTaxSearch_xp = "//button[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt4:0:ap1:type1099Id::_afrLovInternalQueryId::search']";
	//Select Income Tax Type
	public String IncomeTaxSearch_xp = "//table/tbody/tr[@_afrrk='0']";
	//Ok
	public String IncomeTaxOk_xp = "//button[text()='OK']";
	//Payments
	public String Payments1_xp = "//a[text()='Payments']";
	//Payment Methoda
	public String PaymentsMethods_xp = "//a[text()='Payment Methods']";
	//Select Payment Type
	public String PaymentType_xp = "//table/tbody/tr/td[@class='xeq']";
	//Payment Electronic
	public String PaymentElectronic_xp = "//span[@id='pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:Payee3:0:ibyAT1:_ATp:ibypanelGroupLayout2']";
	//Select Line
	public String SelectPaymentLine_xp = "//div[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:Payee3:0:ibyAT1:_ATp:ATtb1::eoi']";
	//Select Enable
	public String SelectEnable_xp = "//img[@id='pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:Payee3:0:ibyAT1:_ATp:ibycommandImageLink1::icon']";
	//Payments
	public String BankAccounts_xp = "//a[text()='Bank Accounts']";
	//Add BankAccount
	public String AddBankAccount_xp = "//div[@id='pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt9:0:ap1:r9:1:AT1:_ATp:create']";
	//Country
	public String Country_xp = "//input[@id='pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt9:0:ap1:r9:1:territoryShortNameId::content']";
	
	
	
	// logout
	public String Logout_xp = "//td[@id='pt1:_UISgc5']";
	public String Signout_xp = "//a[@id='pt1:_UISlg1']";
	public String Confirm_xp = "//button[@id='Confirm']";

	// Delete installment
	//public String DeleteInstall_xp="//img[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT5:_ATp:delete::icon']";
	// Delete OK
	//public String DeleteOK_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:dialog1::ok']";
					
	// Payment Process Profile
			public  String PayProcessProfile_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute4_ATTRIBUTE4::content']";
	        // From Payment Date	
			public String FromDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute2_ATTRIBUTE2::content']";
	        //To Payment Date	
			public String ToDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute3_ATTRIBUTE3::content']";
			// Submit
			public String SubmitPP_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:requestBtns:submitButton']";
			// Okay
			public String OKPP_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok']";
			// Cancel
			public String CancelPP_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:requestBtns:cancelButton']";
			// Allow sending replacement copy	 
			public String Replace_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute5_ATTRIBUTE5::content']";
			// Select Status	
			public String Status_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute6_ATTRIBUTE6::content']";
			
			//Submit Payment Process Request
			//public String SubmitPPR_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl1']";
			// Invoice Group
			public String InvGroup_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:1:MAnt2:1:ap1:batchNameId::content']";
			//Generate external pay Payment Process Request along with file generation (SVB)
			// Refresh Payment Process Requests
			public String PPRRefresh_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTsr1:0:AP1:PprAc1:0:PprRequiringAction:_ATTp:i2']";
			// Refresh Recently Completed Payment
			public String RCRefresh_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTsr1:0:AP1:PprAc1:0:RecentlyCompletedPpr:_ATTp:i1']";
			// Actions Payment Process Requests
			//Payment Name
			public String paymentName="//div[2]/table[1]/tbody[1]/tr/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[2]/span[1]/a[1]";
			//public String payment1Name="//div[2]/table[1]/tbody[1]/tr/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[2]/a[1]";
	 

			//Arrow Name part1
			public String arrowp1="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTsr1:0:AP1:PprAc1:0:PprRequiringAction:_ATTp:tt1::db']/table[1]/tbody[1]/tr[";
			//Arrow Name part2
			public String arrowp2="]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/span[1]/a[1]/img[1]";
			
			// Requiring Attention
	        public String ReqAttention_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTsr1:0:AP1:PprAc1:0:sdi1::disAcr']";

			
			// Installments
			//Number
			public String InstallInvNum_xp="//div[2]/table[1]/tbody[1]/tr/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/a[1]";
			
			// Linepart1
			public String Linepart1_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT5:_ATp:table5::db']/table[1]/tbody[1]/tr[";
			
			// Linepart2
			public String Linepart2="]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]";
			
			// Delete installment
			public String DeleteInstall_xp="//img[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT5:_ATp:delete::icon']";
			
			// Delete OK
			public String DeleteOK_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:dialog1::ok']";
			
			public String ActionPPR_xp="//a[@class='xko p_AFIconOnly' and contains(text(),'Autoext pay-1')]";
			// Pay Line Select
			public String PayLineSelect_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:AP1:AT5:_ATp:table5::db']";
			// Submit for payment
			public String SubmitPay_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:AP1:SPsb2']";
			
			// Template
			public String Template_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:templateNameId::content']";
			// Name
			public String Name_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputText1::content']";
			// Selection Criteria
		    // Pay Through Date	
			public String PayThroughDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputDate2::content']";
			// Pay From Date
			public String PayFromDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputDate4::content']";
			// From Payment Priority
			public String FromPayPriority_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputText2::content']";
			// To Payment Priority	
			public String ToPayPriority_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputText3::content']";
			// Date Basis
			public String DateBasis_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectOneChoice12::content']";
			// Include Zero Amount Invoices
			public String ZeroAmIn_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:soc1::content']";
			// Supplier Type	
			public String SuppTyp_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectOneChoice13::content']";
			// Payment Method	
			public String PayMeth_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:paymentMethodNameId::content']";
			// Invoice Conversion Rate Type	
			public String ConRate_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectOneChoice2::content']";
			// Supplier or Party
			public String SupplierParty_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:partyNameId::content']";
			// Invoice Group	
			public String InvGrp_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:batchNameId::content']";
			// Pay Groups	
			public String PG_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:PayGroupRadio:_0']";
			// Currencies
			public String Curr_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:CurrencyGroupRadio:_0']";
			// Business Units
			public String BU1_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:OuGroupRadio:_0']";
			// Legal Entities	
			public String LE_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:LeGroupRadio:_0']";
			// Sources	
			public String sources_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:SourceGroupRadio:_0']";
		    // Payment and Processing Options
			// Payment Date	
			public String PayDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputDate1::content']";
			// Disbursement Bank Account		
			public String DisBaAcc_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:bankAccountNameId::content']";
			// Payment Process Profile	
			public String ppp_xp="//input[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:paymentProfileNameId::content']";
			// Payment Conversion Rate Type		
			public String PayConRaTyp_xp="//input[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:userConversionTypeId::content']";
			// Payment Document
			public String PayDoc="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:PaymentDocumentId::content']";
			
			//Review proposed payments
			public String RevProPay_xp="//label[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectBooleanCheckbox2::content']";
			
			//Create payment files immediately
			public String CreatePayImme_xp="//label[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:sbc1::content']";
			
			//Review installments
			//public String ReviInst_xp="//label[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectBooleanCheckbox1::content']";
			// Processing Options
	        // Apply credits up to zero amount payment
			public String ApplyCredits_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectBooleanCheckbox3::content']";
			// Review installments
			public String RevInstall_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectBooleanCheckbox1::content']";
			// Review proposed payments
			public String RevPay_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectBooleanCheckbox2::content']";
			// Create payment files immediately
			public String CreaPayFiles_xp="//label[@for='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:sbc1::content']";
			// Validation Failure Handling
			// Document	
			public String Doc_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectOneChoice3::content']";
			// Payment	
			public String Pay_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectOneChoice4::content']";
			// Approvals
	        // First Approver	
	        public String FirApp_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:firstApproverNameId::content']";
	        
	        // Submit
	        public String Sub_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:SPsb2']";
	        // Cancel
	        public String Can_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:SPc']";
	      
			// tools
	      //  public String Tools_xp="//div[@id='groupNode_tools']"; //tanya
	        
	        
	        //Payables Register
	        //Business Unit
	        public String PRBU_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_BusinessUnit::content']";
	        //Tax Reporting Entity
	        public String TaxRepEnt_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_RepEntity::content']";
	        // Supplier
	        public String PRSupplier_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_SupplierName::content']";
	        // Invoice Type	
	        public String PRInType_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content']";
	        // From Entered Date
	        public String FromEnterDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_FromEnteredDate::content']";
	        // To Entered Date
	        public String ToEnterDate="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ToEnteredDate::content']";
	        // Accounting Period
	        public String PRAccPeriod_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content']";
	        // Canceled Invoices Only
	        public String CanInvOnly_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_CanceledInvoicesOnly::content']";
	        // Unvalidated Invoices Only	
	        public String UnvalInvOnly_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_UnvalidatedInvoicesOnly::content']";
	        
	        
	        
	        //Business Unit Context	
	        public String PRBUContext_xp="//select[@_afov='1']";
	        //From Date
	        public String PRFromDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_FromDate::content']";
	        //To Date
	        public String PRToDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ToDate::content']";
	        //Display Payee Address	
	        public String PRDisPayAdd_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content']";
	        //Payment Type
	        public String PRPayTyp_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE11_ATTRIBUTE11::content']";
	       
	        
	        // Schedule Process
	        public String SP_xp="//a[@id='itemNode_tools_scheduled_processes_fuse_plus_4']";
	        // View Output(Succeeded)
	        public String SPOutput_xp="//span[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:panel:result:335:pgl1']";
	        //Catch Error
	        public String SPOutputError_xp="//a[@title='Error']";
	        
	        //Schedule New Process
	        public String SchNewProcess_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:panel:scheduleProcess']";
	        //Refresh
	        public String SPRefresh_xp="//img[@title='Refresh']";
			//Select
	        public String SPSelect_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:panel:result::db']";
	        //Name dropdown
	        public String Namedropdown_xp="//span[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::cntnrSpan']";
	        //Search
	 
	       
	        public String SPSearch_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::dropdownPopup::popupsearch']";
	        //Name
	        public String SPName_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId:value00::content']";
	        //Search
	        public String SPSearch1_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId::search']";
	        //ok
	        public String SPOK_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2::lovDialogId::ok']";
	        // Ok
	        public String SPOK1_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:snpokbtnid']";
	        //Ledger
	        public String SPLedger1_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_LEDGERlovPopupId']";
	        
	        public String SPLedger_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_LEDGER::content']";
	        //From Accounting Date
	        public String SPFromAccDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE7_ATTRIBUTE7::content']";
	        //To Accounting Date
	        public String SPToAccDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content']";
	        //Period
	        public String SPPeriod_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE3_ATTRIBUTE3::content']";
	        //Sweep Now
	        public String SweepNow_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content']";
	        //Sweep Period
	        public String SweepPeriod_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE7_ATTRIBUTE7::content']";
	        
	        //Submit
	        public String Submit_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:requestBtns:submitButton']";
	        //ok
	        public String SPOk_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok']";
	        
	        
	        //Create Accounting
	        public String CreateAccount_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl12']";
			//SubLedger Application
	        public String Subledger_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_SubledgerApplicationAttr::content']";
			//Ledger
	        public String Ledger_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::content']";
			//End Date
	        public String EndDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE6_ATTRIBUTE6::content']";
	        
	        
	        //Accounting Mode
	        public String AccountingMode_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content']";
	        //Process Events
	        public String ProcessEvents_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content']";
	        //Report Style	
	        public String ReportStyle_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE10_ATTRIBUTE10::content']";
	        //Transfer to General Ledger
	        public String TraGenLed_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE11_ATTRIBUTE11::content']";
	        //Post in General Ledger
	        public String PostGenLed_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE12_ATTRIBUTE12::content']";
	        //Include User Transaction Identifiers	
	        public String IncUTraIden_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE15_ATTRIBUTE15::content']";
	        //Submit Accounting
	        public String SubmitAcc_xp="//span[contains(text(),'Sub')]";
	        
	       
	        
	       //Manage Accounting Periods
	        public String ManageAcc_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:1:_FOTRaT:0:RAtl18']";
	        public String ManageAcc1_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:j_id47']";
	        
	       // public String ManageAcc2_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:1:_FOTRaT:0:RAtl18'] and contains(text = 'Manage Accounting Periods')";
	         public String LineSelect1_xp="//tr[@_afrrk='0']";
	        //Line Select
	        public String LineSelect_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT1:_ATp:table1::db']";
	        //Actions
	        public String Actions_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT1:_ATp:ATm']";
	        //Close Current Period
	        public String CloseCurrPer_xp="//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT1:_ATp:cmi7']";
	        //Open Next Period
	        public String OpenNextPer_xp="//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT1:_ATp:cmi5']";
	        //public String Ledger1_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_LEDGER::content']";
	        // Select BU
	        public String SelectBU_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT1:_ATp:table1:0:tableCommandLink']";
	        // Refresh BU
	        public String RefreshPeriod_xp="//img[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:AT1:_ATp:ctb7::icon']";
	        //Period close Process – Sub ledger Period Close Exceptions Report
	        //Journal Source
	        public String JournalSource_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_JESourceAttr::content']";
	        //Ledger
	        public String PCPLedger_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_LedgerAttr::content']";
	        //Journal Category	
	       // public String PCPJournalCategory_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE4_ATTRIBUTE4::content']";
	        //From Accounting Period
	        public String PCPFromAccPeriod_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE6_ATTRIBUTE6::content']";
	        //To Accounting Period	
	       // public String PCPToAccPeriod_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content']";
	       
	        
	        //Period close Process – Sweep process
	        //Report Level
	        public String SWReportLevel="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE1_ATTRIBUTE1::content']";
	        //Business unit
	        public String SWBU_xp="//option[@value'0']";
	        //Report Context
	        public String SWReportContext="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_REPORTCONTEXT::content']";
	        //From Accounting Date	
	        public String FromAccountingDate="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE4_ATTRIBUTE4::content']";
	        //To Accounting Date	
	        public String ToAccountingDate_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content']";
	        //Period
	        public String Period_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE6_ATTRIBUTE6::content']";
	        
	        
	        //Period close Process - AP GL Recon process
	        //Request Name	
	        public String ReqNam_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:dynam1:0:it1::content']";
	        //Ledger
	        public String AGLedger_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:dynam1:0:soc1::content']";
	        //Business Unit	
	        public String AGBU_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:dynam1:0:businessunitId::content']";
	        //Accounting Period	
	        public String AGAccPeriod_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:dynam1:0:aTTRIBUTE6Id::content']";
	        //Include Intercompany Transactions
	        public String IncInterTrans_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:dynam1:0:soc3::content']";
	        
	        //
	        public String LedgerDpdwn="//a[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:r1:0:r1:basicReqBody:paramDynForm_LEDGER::lovIconId']";
	        
	        
	        //Select Row
	        public String SelectRow_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_tools_scheduled_processes_fuse_plus:0:_FOTsr1:0:pt1:selectOneChoice2_afrLovInternalTableId::db']//table/tbody/tr/td/div/table/tbody/tr/td/span[@class='x2s3']";
			
			//public String InvoiceActionsx_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:me1']";
			public String InvoiceActionsx_xp="//div[@class='xmi']";

			// Prepayment
			public String PrePayment="//option[@title='Prepayment']";
			public static String Calculatetax1_xp = "//table/tbody/tr/td/span[@class='xmo']";

			// Forced Approval
			public String ForAppr_xp="//td[contains(text(),'Force Approve')]";
			// Apply Pre
			public String ApplyPre_xp="//td[contains(text(),'Apply or Unapply Prepayments')]";

			// Sel Line
			public String SelectLinePre_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r12:1:at1:_ATp:ta1::db']/table[1]/tbody[1]/tr/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]";

			// Invoice Group
			public static String Invoicegroup_xp = "//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i1::content']";

			//Create Positive Pay File
		    public String PositivePay_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl10']";

		    public String SepRemAdv_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl11']";
			//Payment File
			public String PayFile_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute1_ATTRIBUTE1::content']";
		    //Format
			public String Format_xp="//select[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute2::content']";
			//Payment Reference From
			public String PayRefForm_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute3_ATTRIBUTE3::content']";
			//Payment Reference To	
			public String PayRefTo_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute4_ATTRIBUTE4::content']";
			
			
			// Pay in Full
			public String PayInFull_xp="//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cmi2']";
			// Bank Account
			public String BankAccount="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r9:1:bankAccountNamePIFId::content']";
			// Payment Process Profile
			public String PPP_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r9:1:paymentProfileNameId::content']";
			// Payment Number
			public String SubmitPrePay_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:pifbtn1']";
			// Post to Ledger
			public String PostLedger_xp="//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm16']";
			// OK Accountinh
			public String AccOK_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb43']";
			// Done
			public String Done_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb19']";
			// Select Line
			public String SelectLineAppPrep_xp="//td[@tabindex='-1']";
			// Post to Ledger
			public String MIPostToLedger_xp="//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:cm11']";
			// Okay
			public String AccOk_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:cb43']";
			// Apply
			public String Apply1_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:1:MAnt2:1:pm1:r1:1:ap1:r12:1:at1:_ATp:cb1']";
			// Apply Pre
			//public String ApplyPre_xp="//td[contains(text(),'Apply or Unapply Prepayments')]";
			// Force Approval
			public static String ForceApproval_xp="//tr[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm11']";
			
			// Installments Payment Method
			public String PayMeth1_xp="//input[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r15:1:at1:_ATp:ta1:0:paymentMethodNameId2::content']";
			//Bank Account
			public String BankAccount_xp="//input[@id='pt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:1:MAnt2:1:pm1:r1:0:ap1:r15:1:at1:_ATp:ta1:0:iclov1::content']";
			// Select Line
			//public String SelectLine_xp="//span[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r15:1:at1:_ATp:ta1:0:p7']";
			// Split Installment
			public String SplitInstall_xp="//div[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r15:1:at1:_ATp:ctb2']";
			
			//Installments Save and Close
			public String SAC_xp="//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb27']";
			

			// Resume Payment Process 
			public String ResumePay_xp="//button[contains(text(),'Resume Payment Process')]";
			// Recently Completed
			public String RecCom_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTsr1:0:AP1:PprAc1:0:sdi2::disAcr']";
	        // TasK bar Payments
			//Submit Payment Process Request
			public String PayProReq_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl1']";
			//Manage Payment Process Request
			public String ManPayProReq_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl2']";
			//Manage Payment Process Request template
			public String ManPayProReqTemp_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl3']";	
			//Create Payment
			public String CreatePay_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl4']";	
			//Manage Payment
			public String ManagePay_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl5']";	
			//Create Electronic Payment Files
			public String CreateElectrPayFiles_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl6']";	
			//Create Electronic Payment Files
			public String CreatePrintedPayFiles_xp="//a[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl7']";
			


}
