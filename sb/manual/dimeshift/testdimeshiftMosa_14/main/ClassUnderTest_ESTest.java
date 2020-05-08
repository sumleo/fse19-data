/*
 * This file was automatically generated by EvoSuite
 * Fri May 08 12:42:30 GMT 2020
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
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 5. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 6. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 7. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 8. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 9. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 10. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 11. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 12. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 13. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      int int0 = 3694;
      Id id0 = new Id(int0);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      int int1 = 1015;
      Id id1 = new Id(int1);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.hideWalletWalletsManagerPage(id1);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.hideWalletWalletsManagerPage(id1);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
  }

  //Test case number: 1
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addIncomeAddIncomeToWalletPage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 624
   * Goal 4. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.closeTransactionDetailsPage()V: Line 458
   * Goal 8. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 9. main.ClassUnderTest.selectTransactionTransactionManagerPage(Lcustom_classes/Id;)V: Line 791
   * Goal 10. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      int int0 = (-590);
      Id id0 = new Id(int0);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      int int1 = (-1253);
      Id id1 = new Id(int1);
      Email email0 = Email.COMPANY;
      classUnderTest0.addAccessWalletAccessManagerPage(email0);
      classUnderTest0.selectWalletWalletsManagerPage(id1);
      classUnderTest0.addIncomeTransactionManagerPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SALARY;
      Amount amount0 = new Amount(int1);
      classUnderTest0.addIncomeAddIncomeToWalletPage(incomeDescription0, amount0);
      classUnderTest0.selectTransactionTransactionManagerPage(id1);
      classUnderTest0.closeTransactionDetailsPage();
  }

  //Test case number: 2
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 6. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 7. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 10. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      int int0 = (-590);
      Id id0 = new Id(int0);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.CAR;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames0);
      int int1 = (-2997);
      Amount amount0 = new Amount(int1);
      Date date0 = Date.SUMMER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
  }

  //Test case number: 3
  /*
   * 23 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 3. main.ClassUnderTest.addTransactionTransactionManagerPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 673
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddIncomeToWalletPage()V: Line 643
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 8. main.ClassUnderTest.closeSetTotalIncomeToWalletPage()V: Line 543
   * Goal 9. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 11. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 12. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 13. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 14. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 15. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 16. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 17. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 18. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 19. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 20. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 21. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 22. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 23. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      int int0 = 485;
      Id id0 = new Id(int0);
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      Amount amount0 = new Amount(id0.value);
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      Amount amount1 = new Amount(int0);
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount1);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.closeSetTotalIncomeToWalletPage();
      TransactionDescription transactionDescription1 = TransactionDescription.EBAY;
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription1, amount0);
      classUnderTest0.addIncomeTransactionManagerPage();
      classUnderTest0.closeAddIncomeToWalletPage();
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
  }

  //Test case number: 4
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 4. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 5. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 6. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInTransactionManagerPage()V: Line 717
   * Goal 8. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 9. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 11. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 12. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 13. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 14. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 15. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-345);
      Id id0 = new Id(int0);
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      Id id1 = new Id(id0.value);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id1);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
  }

  //Test case number: 5
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 2. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 3. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 4. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 5. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 6. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 9. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 10. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 11. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
  }

  //Test case number: 6
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageCreateGoalSecondStepPage()V: Line 60
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 11. main.ClassUnderTest.goToWalletsManagerPageCreateGoalFirstStepPage()V: Line 290
   * Goal 12. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 13. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.MUSEUM;
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames1);
      classUnderTest0.goToGoalsManagerPageCreateGoalSecondStepPage();
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 4. main.ClassUnderTest.goToWalletsManagerPageNavbarTransactionManagerPage()V: Line 776
   * Goal 5. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test7()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = 2999;
      Id id0 = new Id(int0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToWalletsManagerPageNavbarTransactionManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
  }
}
