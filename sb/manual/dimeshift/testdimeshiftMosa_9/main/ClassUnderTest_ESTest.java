/*
 * This file was automatically generated by EvoSuite
 * Fri May 08 11:09:57 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Amount;
import custom_classes.Date;
import custom_classes.Email;
import custom_classes.Goals;
import custom_classes.Id;
import custom_classes.IncomeDescription;
import custom_classes.TransactionDescription;
import custom_classes.WalletNames;
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 20 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddIncomeToWalletPage()V: Line 643
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 8. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 9. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 10. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 11. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 12. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 13. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 14. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 15. main.ClassUnderTest.goToWalletsManagerPageNavbarTransactionManagerPage()V: Line 776
   * Goal 16. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 17. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 18. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 19. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 20. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames1);
      int int0 = 2298;
      Id id0 = new Id(int0);
      int int1 = (-496);
      Id id1 = new Id(int1);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames2 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames2);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id1);
      classUnderTest0.addIncomeTransactionManagerPage();
      classUnderTest0.closeAddIncomeToWalletPage();
      classUnderTest0.goToWalletsManagerPageNavbarTransactionManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id1);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
  }

  //Test case number: 1
  /*
   * 20 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 5. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 6. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 7. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 8. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 432
   * Goal 9. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInTransactionManagerPage()V: Line 717
   * Goal 11. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 12. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 13. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 14. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 15. main.ClassUnderTest.removeAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 523
   * Goal 16. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 17. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 18. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 19. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 20. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-1460);
      Id id0 = new Id(int0);
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInTransactionManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      Email email0 = Email.ASD;
      classUnderTest0.addAccessWalletAccessManagerPage(email0);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      Email email1 = Email.COMPANY;
      classUnderTest0.addAccessWalletAccessManagerPage(email1);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      Email email2 = Email.ASD;
      classUnderTest0.removeAccessWalletAccessManagerPage(email2);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      Id id1 = new Id(int0);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
  }

  //Test case number: 2
  /*
   * 24 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 6. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 7. main.ClassUnderTest.editGoalGoalsManagerPage(Lcustom_classes/Id;)V: Line 115
   * Goal 8. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 9. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 11. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 12. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 13. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalSecondStepPage()V: Line 72
   * Goal 14. main.ClassUnderTest.goToHomeUserLoggedInGoalDetailsPage()V: Line 314
   * Goal 15. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 16. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 17. main.ClassUnderTest.goToPlanYourExpensesGoalDetailsPage()V: Line 327
   * Goal 18. main.ClassUnderTest.refreshStatsGoalDetailsPage()V: Line 353
   * Goal 19. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 20. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 21. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 22. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 23. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 24. main.ClassUnderTest.viewGoalReportGoalsManagerPage(Lcustom_classes/Id;)V: Line 190
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 1125;
      Id id0 = new Id(int0);
      classUnderTest0.editWalletWalletsManagerPage(id0);
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.HOUSE;
      WalletNames walletNames2 = WalletNames.PRIVATE;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames2);
      Amount amount0 = new Amount(int0);
      Date date0 = Date.SUMMER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.goToHomeUserLoggedInGoalDetailsPage();
      Id id1 = new Id(amount0.value);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.addAddWalletPage(walletNames2);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals1 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals1, walletNames2);
      classUnderTest0.goToHomeUserLoggedInCreateGoalSecondStepPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.viewGoalReportGoalsManagerPage(id1);
      classUnderTest0.refreshStatsGoalDetailsPage();
      classUnderTest0.goToPlanYourExpensesGoalDetailsPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.editGoalGoalsManagerPage(id1);
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
  }

  //Test case number: 3
  /*
   * 22 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addIncomeAddIncomeToWalletPage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 624
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addTransactionTransactionManagerPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 673
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.closeTransactionDetailsPage()V: Line 458
   * Goal 8. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 12. main.ClassUnderTest.goToNextMonthTransactionViewTransactionManagerPage()V: Line 732
   * Goal 13. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 14. main.ClassUnderTest.goToWalletsManagerPageBreadcrumbTransactionManagerPage()V: Line 763
   * Goal 15. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 16. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 17. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 18. main.ClassUnderTest.selectTransactionTransactionManagerPage(Lcustom_classes/Id;)V: Line 791
   * Goal 19. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 20. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 21. main.ClassUnderTest.setTotalIncomeSetTotalIncomeToWalletPage(Lcustom_classes/Amount;)V: Line 563
   * Goal 22. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      int int0 = (-1460);
      Id id0 = new Id(int0);
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      Amount amount0 = new Amount(int0);
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.goToNextMonthTransactionViewTransactionManagerPage();
      classUnderTest0.selectTransactionTransactionManagerPage(id0);
      classUnderTest0.closeTransactionDetailsPage();
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.addIncomeTransactionManagerPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SCHOLARSHIP;
      classUnderTest0.addIncomeAddIncomeToWalletPage(incomeDescription0, amount0);
      classUnderTest0.addIncomeTransactionManagerPage();
      IncomeDescription incomeDescription1 = IncomeDescription.SALARY;
      classUnderTest0.addIncomeAddIncomeToWalletPage(incomeDescription1, amount0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
  }

  //Test case number: 4
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 435
   * Goal 7. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageGoalDetailsPage()V: Line 302
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInGoalDetailsPage()V: Line 314
   * Goal 12. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 13. main.ClassUnderTest.removeGoalGoalsManagerPage(Lcustom_classes/Id;)V: Line 171
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 1125;
      Id id0 = new Id(int0);
      classUnderTest0.editWalletWalletsManagerPage(id0);
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.HOUSE;
      WalletNames walletNames2 = WalletNames.PRIVATE;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames2);
      Amount amount0 = new Amount(int0);
      Date date0 = Date.SUMMER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.goToHomeUserLoggedInGoalDetailsPage();
      Id id1 = new Id(amount0.value);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.addAddWalletPage(walletNames2);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals1 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals1, walletNames2);
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.goToGoalsManagerPageGoalDetailsPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.removeGoalGoalsManagerPage(id1);
      classUnderTest0.denyOperationConfirmationPage();
  }

  //Test case number: 5
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 7. main.ClassUnderTest.goBackToPreviousStepCreateGoalSecondStepPage()V: Line 47
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalSecondStepPage()V: Line 72
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInGoalDetailsPage()V: Line 314
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 12. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 13. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 14. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 15. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 16. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 17. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 1125;
      Id id0 = new Id(int0);
      classUnderTest0.editWalletWalletsManagerPage(id0);
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.HOUSE;
      WalletNames walletNames2 = WalletNames.PRIVATE;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames2);
      Amount amount0 = new Amount(int0);
      Date date0 = Date.SUMMER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.goToHomeUserLoggedInGoalDetailsPage();
      Id id1 = new Id(amount0.value);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.addAddWalletPage(walletNames2);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals1 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals1, walletNames2);
      classUnderTest0.goToHomeUserLoggedInCreateGoalSecondStepPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals2 = Goals.CAR;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals2, walletNames2);
      classUnderTest0.goBackToPreviousStepCreateGoalSecondStepPage();
  }

  //Test case number: 6
  /*
   * 18 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 6. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageCreateGoalSecondStepPage()V: Line 60
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 12. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 13. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 14. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 15. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 16. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 17. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 18. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      int int0 = (-1460);
      Id id0 = new Id(int0);
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.SKI;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames0);
      classUnderTest0.goToGoalsManagerPageCreateGoalSecondStepPage();
  }

  //Test case number: 7
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 2. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 3. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 4. main.ClassUnderTest.goToWalletsManagerPageCreateGoalFirstStepPage()V: Line 290
   * Goal 5. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 6. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 7. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 8. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 9. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test7()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageCreateGoalFirstStepPage();
  }

  //Test case number: 8
  /*
   * 18 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 4. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 7. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInGoalDetailsPage()V: Line 314
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 12. main.ClassUnderTest.goToWalletsManagerPageGoalDetailsPage()V: Line 340
   * Goal 13. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 14. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 15. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 16. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 17. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 18. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test8()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 1125;
      Id id0 = new Id(int0);
      classUnderTest0.editWalletWalletsManagerPage(id0);
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.HOUSE;
      WalletNames walletNames2 = WalletNames.PRIVATE;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames2);
      Amount amount0 = new Amount(int0);
      Date date0 = Date.SUMMER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.goToHomeUserLoggedInGoalDetailsPage();
      Id id1 = new Id(amount0.value);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.addAddWalletPage(walletNames2);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals1 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals1, walletNames2);
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.goToWalletsManagerPageGoalDetailsPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      Id id2 = new Id(amount0.value);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id2);
      Email email0 = Email.ASD;
      classUnderTest0.addAccessWalletAccessManagerPage(email0);
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
  }
}
