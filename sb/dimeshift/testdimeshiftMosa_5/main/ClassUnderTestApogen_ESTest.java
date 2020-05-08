/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 21:02:45 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Amount;
import custom_classes.Email;
import custom_classes.Goals;
import custom_classes.Id;
import custom_classes.IncomeDescription;
import custom_classes.TransactionDescription;
import custom_classes.WalletNames;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 144
   * Goal 2. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 3. main.ClassUnderTestApogen.addTransactionTransactionsPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 362
   * Goal 4. main.ClassUnderTestApogen.cancelHideWalletPage()V: Line 194
   * Goal 5. main.ClassUnderTestApogen.cancelRemoveEmailAccessPage()V: Line 236
   * Goal 6. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 7. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 8. main.ClassUnderTestApogen.editWalletWalletPage(Lcustom_classes/Id;)V: Line 469
   * Goal 9. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 10. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 11. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 12. main.ClassUnderTestApogen.goToWalletPageAddWalletPage()V: Line 347
   * Goal 13. main.ClassUnderTestApogen.goToWalletPageTransactionsPage()V: Line 404
   * Goal 14. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 15. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   * Goal 16. main.ClassUnderTestApogen.removeAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 174
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1452;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.COMPANY;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      Email email1 = Email.ASD;
      classUnderTestApogen0.addAccessAccessEmailPage(email1);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.cancelHideWalletPage();
      classUnderTestApogen0.editWalletWalletPage(id0);
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames1);
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      TransactionDescription transactionDescription0 = TransactionDescription.AMAZON;
      Amount amount0 = new Amount(id0.value);
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount0);
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email1);
      Email email2 = Email.ASD;
      classUnderTestApogen0.removeAccessAccessEmailPage(email2);
      classUnderTestApogen0.cancelRemoveEmailAccessPage();
      classUnderTestApogen0.addAccessAccessEmailPage(email1);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
  }

  //Test case number: 1
  /*
   * 25 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 2. main.ClassUnderTestApogen.addIncomeAddIncomePage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 41
   * Goal 3. main.ClassUnderTestApogen.addProfitSetTotalPage(Lcustom_classes/Amount;)V: Line 606
   * Goal 4. main.ClassUnderTestApogen.addTransactionTransactionsPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 362
   * Goal 5. main.ClassUnderTestApogen.cancelRemoveEmailAccessPage()V: Line 236
   * Goal 6. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 7. main.ClassUnderTestApogen.confirmAndSaveCreatePlanAdvancedSettingsPage()V: Line 263
   * Goal 8. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 9. main.ClassUnderTestApogen.editWalletWalletPage(Lcustom_classes/Id;)V: Line 469
   * Goal 10. main.ClassUnderTestApogen.goToAddIncomePageTransactionsPage()V: Line 376
   * Goal 11. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 12. main.ClassUnderTestApogen.goToCreateNewPlanPageCreatePlanPage()V: Line 92
   * Goal 13. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 14. main.ClassUnderTestApogen.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 296
   * Goal 15. main.ClassUnderTestApogen.goToSetTotalPageTransactionsPage()V: Line 390
   * Goal 16. main.ClassUnderTestApogen.goToTransactionsAddIncomePage()V: Line 60
   * Goal 17. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 18. main.ClassUnderTestApogen.goToWalletPageAddWalletPage()V: Line 347
   * Goal 19. main.ClassUnderTestApogen.goToWalletPageTransactionsPage()V: Line 404
   * Goal 20. main.ClassUnderTestApogen.goToWalletPageViewPlanPage()V: Line 451
   * Goal 21. main.ClassUnderTestApogen.hideHideWalletPage()V: Line 222
   * Goal 22. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 23. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   * Goal 24. main.ClassUnderTestApogen.removeAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 174
   * Goal 25. main.ClassUnderTestApogen.removeRemoveEmailAccessPage()V: Line 250
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      int int0 = 3031;
      Id id0 = new Id(int0);
      classUnderTestApogen0.editWalletWalletPage(id0);
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.ASD;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      classUnderTestApogen0.removeAccessAccessEmailPage(email0);
      classUnderTestApogen0.cancelRemoveEmailAccessPage();
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email1 = Email.COMPANY;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email1);
      classUnderTestApogen0.removeAccessAccessEmailPage(email1);
      classUnderTestApogen0.cancelRemoveEmailAccessPage();
      classUnderTestApogen0.removeAccessAccessEmailPage(email0);
      classUnderTestApogen0.removeRemoveEmailAccessPage();
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      Goals goals0 = Goals.SKI;
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals0, walletNames1);
      classUnderTestApogen0.confirmAndSaveCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      int int1 = (-2203);
      Amount amount0 = new Amount(int1);
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount0);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      int int2 = 1858;
      Amount amount1 = new Amount(int2);
      classUnderTestApogen0.addProfitSetTotalPage(amount1);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SALARY;
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription0, amount1);
      TransactionDescription transactionDescription1 = TransactionDescription.EBAY;
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription1, amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount0);
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.hideHideWalletPage();
  }

  //Test case number: 2
  /*
   * 18 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 2. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 3. main.ClassUnderTestApogen.confirmAndSaveCreatePlanAdvancedSettingsPage()V: Line 263
   * Goal 4. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 5. main.ClassUnderTestApogen.editWalletWalletPage(Lcustom_classes/Id;)V: Line 469
   * Goal 6. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 7. main.ClassUnderTestApogen.goToCreateNewPlanPageCreatePlanPage()V: Line 92
   * Goal 8. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 9. main.ClassUnderTestApogen.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 296
   * Goal 10. main.ClassUnderTestApogen.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage()V: Line 278
   * Goal 11. main.ClassUnderTestApogen.goToPlanPageCreatePlanBasicSettingsPage()V: Line 314
   * Goal 12. main.ClassUnderTestApogen.goToTrashPageWalletPage()V: Line 543
   * Goal 13. main.ClassUnderTestApogen.goToWalletPageAddWalletPage()V: Line 347
   * Goal 14. main.ClassUnderTestApogen.goToWalletPageHideWalletPage()V: Line 208
   * Goal 15. main.ClassUnderTestApogen.goToWalletPageTrashPage()V: Line 126
   * Goal 16. main.ClassUnderTestApogen.goToWalletPageViewPlanPage()V: Line 451
   * Goal 17. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 18. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      int int0 = (-85);
      Id id0 = new Id(int0);
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.goToWalletPageHideWalletPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.editWalletWalletPage(id0);
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.ASD;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      WalletNames walletNames1 = WalletNames.PERSONAL;
      Goals goals0 = Goals.MUSEUM;
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals0, walletNames0);
      classUnderTestApogen0.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage();
      Goals goals1 = Goals.MUSEUM;
      WalletNames walletNames2 = WalletNames.PERSONAL;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals1, walletNames2);
      classUnderTestApogen0.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage();
      Goals goals2 = Goals.SKI;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals2, walletNames1);
      classUnderTestApogen0.confirmAndSaveCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      classUnderTestApogen0.goToTrashPageWalletPage();
      classUnderTestApogen0.goToWalletPageTrashPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      classUnderTestApogen0.goToPlanPageCreatePlanBasicSettingsPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      classUnderTestApogen0.goToPlanPageCreatePlanBasicSettingsPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
  }

  //Test case number: 3
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addIncomeAddIncomePage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 41
   * Goal 2. main.ClassUnderTestApogen.addProfitSetTotalPage(Lcustom_classes/Amount;)V: Line 606
   * Goal 3. main.ClassUnderTestApogen.addTransactionTransactionsPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 362
   * Goal 4. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 5. main.ClassUnderTestApogen.goToAddIncomePageTransactionsPage()V: Line 376
   * Goal 6. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 7. main.ClassUnderTestApogen.goToSetTotalPageTransactionsPage()V: Line 390
   * Goal 8. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 9. main.ClassUnderTestApogen.goToTrashPageWalletPage()V: Line 543
   * Goal 10. main.ClassUnderTestApogen.goToWalletPageAddWalletPage()V: Line 347
   * Goal 11. main.ClassUnderTestApogen.goToWalletPageGiveAccessToWalletPage()V: Line 437
   * Goal 12. main.ClassUnderTestApogen.goToWalletPageTransactionsPage()V: Line 404
   * Goal 13. main.ClassUnderTestApogen.goToWalletPageTrashPage()V: Line 126
   * Goal 14. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      int int0 = (-835);
      Id id0 = new Id(int0);
      Amount amount0 = new Amount(id0.value);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      classUnderTestApogen0.goToWalletPageGiveAccessToWalletPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      int int1 = (-4194);
      Amount amount1 = new Amount(int1);
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount1);
      TransactionDescription transactionDescription1 = TransactionDescription.AMAZON;
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription1, amount0);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      classUnderTestApogen0.addProfitSetTotalPage(amount1);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      classUnderTestApogen0.addProfitSetTotalPage(amount0);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      classUnderTestApogen0.addProfitSetTotalPage(amount0);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      classUnderTestApogen0.addProfitSetTotalPage(amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SCHOLARSHIP;
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription0, amount1);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      classUnderTestApogen0.addProfitSetTotalPage(amount1);
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.goToTrashPageWalletPage();
      classUnderTestApogen0.goToWalletPageTrashPage();
  }
}