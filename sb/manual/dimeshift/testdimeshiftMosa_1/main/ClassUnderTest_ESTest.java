/*
 * This file was automatically generated by EvoSuite
 * Fri May 08 08:46:31 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Amount;
import custom_classes.Date;
import custom_classes.Email;
import custom_classes.Goals;
import custom_classes.Id;
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
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addTransactionTransactionManagerPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 673
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.closeAddIncomeToWalletPage()V: Line 643
   * Goal 7. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 8. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 9. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 11. main.ClassUnderTest.goToNextMonthTransactionViewTransactionManagerPage()V: Line 732
   * Goal 12. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 13. main.ClassUnderTest.goToWalletsManagerPageBreadcrumbTransactionManagerPage()V: Line 763
   * Goal 14. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 15. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 16. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 17. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = (-2913);
      Id id0 = new Id(int0);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      Email email0 = Email.COMPANY;
      TransactionDescription transactionDescription0 = TransactionDescription.AMAZON;
      int int1 = 1390;
      Amount amount0 = new Amount(int1);
      int int2 = (-421);
      Id id1 = new Id(int2);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.addAccessWalletAccessManagerPage(email0);
      classUnderTest0.selectWalletWalletsManagerPage(id1);
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.goToNextMonthTransactionViewTransactionManagerPage();
      classUnderTest0.addIncomeTransactionManagerPage();
      classUnderTest0.closeAddIncomeToWalletPage();
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
  }

  //Test case number: 1
  /*
   * 24 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.editGoalCreateGoalFirstStepPage(Lcustom_classes/Goals;)V: Line 233
   * Goal 7. main.ClassUnderTest.editGoalGoalsManagerPage(Lcustom_classes/Id;)V: Line 115
   * Goal 8. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 9. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 11. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 12. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 13. main.ClassUnderTest.goToHomeUserLoggedInTransactionManagerPage()V: Line 717
   * Goal 14. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 15. main.ClassUnderTest.goToPlanYourExpensesGoalDetailsPage()V: Line 327
   * Goal 16. main.ClassUnderTest.goToWalletsManagerPageGoalDetailsPage()V: Line 340
   * Goal 17. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 18. main.ClassUnderTest.goToWalletsManagerPageNavbarTransactionManagerPage()V: Line 776
   * Goal 19. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 20. main.ClassUnderTest.refreshStatsGoalDetailsPage()V: Line 353
   * Goal 21. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 22. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 23. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 24. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      int int0 = (-2749);
      Id id0 = new Id(int0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.MUSEUM;
      WalletNames walletNames1 = WalletNames.PERSONAL;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames1);
      Amount amount0 = new Amount(int0);
      Date date0 = Date.FALL;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
      classUnderTest0.refreshStatsGoalDetailsPage();
      classUnderTest0.goToWalletsManagerPageGoalDetailsPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.addAddWalletPage(walletNames0);
      int int1 = 1872;
      Id id1 = new Id(int1);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToHomeUserLoggedInTransactionManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id1);
      classUnderTest0.goToWalletsManagerPageNavbarTransactionManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.editGoalGoalsManagerPage(id1);
      Goals goals1 = Goals.SKI;
      classUnderTest0.editGoalCreateGoalFirstStepPage(goals1);
      Date date1 = Date.WINTER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date1);
      classUnderTest0.goToPlanYourExpensesGoalDetailsPage();
      classUnderTest0.editGoalGoalsManagerPage(id1);
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.editGoalGoalsManagerPage(id0);
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
  }

  //Test case number: 2
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 4. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 5. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 6. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 7. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 8. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 9. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 10. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 11. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 12. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 13. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-2157);
      Id id0 = new Id(int0);
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
  }

  //Test case number: 3
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 4. main.ClassUnderTest.closeTransactionDetailsPage()V: Line 458
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageCreateGoalFirstStepPage()V: Line 290
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageNavbarTransactionManagerPage()V: Line 776
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 11. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 12. main.ClassUnderTest.selectTransactionTransactionManagerPage(Lcustom_classes/Id;)V: Line 791
   * Goal 13. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 15. main.ClassUnderTest.setTotalIncomeSetTotalIncomeToWalletPage(Lcustom_classes/Amount;)V: Line 563
   * Goal 16. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = (-185);
      Id id0 = new Id(int0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      Amount amount0 = new Amount(id0.value);
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.selectTransactionTransactionManagerPage(id0);
      classUnderTest0.closeTransactionDetailsPage();
      classUnderTest0.selectTransactionTransactionManagerPage(id0);
      classUnderTest0.closeTransactionDetailsPage();
      classUnderTest0.goToWalletsManagerPageNavbarTransactionManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageCreateGoalFirstStepPage();
  }

  //Test case number: 4
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 7. main.ClassUnderTest.goBackToPreviousStepCreateGoalSecondStepPage()V: Line 47
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 11. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = (-2913);
      Id id0 = new Id(int0);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.MUSEUM;
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames1);
      classUnderTest0.goBackToPreviousStepCreateGoalSecondStepPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
  }

  //Test case number: 5
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 6. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalSecondStepPage()V: Line 72
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 9. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 10. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 11. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.SKI;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames0);
      classUnderTest0.goToHomeUserLoggedInCreateGoalSecondStepPage();
  }

  //Test case number: 6
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageCreateGoalSecondStepPage()V: Line 85
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 10. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 11. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 12. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames0);
      classUnderTest0.goToWalletsManagerPageCreateGoalSecondStepPage();
  }

  //Test case number: 7
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 5. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 8. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 11. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 12. main.ClassUnderTest.restoreWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 976
   * Goal 13. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 14. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 15. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 16. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 17. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test7()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      int int0 = 540;
      Id id0 = new Id(int0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      int int1 = (-916);
      Id id1 = new Id(int1);
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.restoreWalletWalletsManagerPage(id1);
      classUnderTest0.selectBothAccessWalletsManagerPage();
  }
}
