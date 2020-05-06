/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 19:57:16 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.BoardNames;
import custom_classes.Id;
import custom_classes.IdeasPosts;
import custom_classes.NotWentWellPosts;
import custom_classes.PeopleNames;
import custom_classes.WentWellPosts;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createNotWentWellPostRetrospectivePage(Lcustom_classes/NotWentWellPosts;)V: Line 332
   * Goal 3. main.ClassUnderTestApogen.createWentWellPostRetrospectivePage(Lcustom_classes/WentWellPosts;)V: Line 353
   * Goal 4. main.ClassUnderTestApogen.deleteNotWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 397
   * Goal 5. main.ClassUnderTestApogen.deleteWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 419
   * Goal 6. main.ClassUnderTestApogen.goToIndexIndexPage()V: Line 237
   * Goal 7. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 8. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 9. main.ClassUnderTestApogen.goToPreviousIndexPage()V: Line 252
   * Goal 10. main.ClassUnderTestApogen.goToPreviousPreviousPage()V: Line 56
   * Goal 11. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 12. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 13. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 294
   * Goal 14. main.ClassUnderTestApogen.logoutMenuPage()V: Line 107
   * Goal 15. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      BoardNames boardNames0 = BoardNames.MY_RETROSPECTIVE;
      int int0 = 314;
      Id id0 = new Id(int0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.DEV_TIME;
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      WentWellPosts wentWellPosts0 = WentWellPosts.PROBLEM_X;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id0);
      IdeasPosts ideasPosts0 = IdeasPosts.FRIDAYNIGHT;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      classUnderTestApogen0.deleteNotWentWellPostRetrospectivePage(id0);
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.logoutMenuPage();
      PeopleNames peopleNames1 = PeopleNames.JOHN;
      classUnderTestApogen0.loginLoginPage(peopleNames1);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToPreviousIndexPage();
      classUnderTestApogen0.goToPreviousPreviousPage();
  }

  //Test case number: 1
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createNotWentWellPostRetrospectivePage(Lcustom_classes/NotWentWellPosts;)V: Line 332
   * Goal 3. main.ClassUnderTestApogen.createWentWellPostRetrospectivePage(Lcustom_classes/WentWellPosts;)V: Line 353
   * Goal 4. main.ClassUnderTestApogen.deleteIdeasPostRetrospectivePage(Lcustom_classes/Id;)V: Line 375
   * Goal 5. main.ClassUnderTestApogen.deleteNotWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 397
   * Goal 6. main.ClassUnderTestApogen.deleteWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 419
   * Goal 7. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 8. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 9. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 10. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 11. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 12. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      WentWellPosts wentWellPosts0 = WentWellPosts.DELIVERING;
      int int0 = (-2584);
      Id id0 = new Id(int0);
      BoardNames boardNames0 = BoardNames.PROJECT_Y;
      IdeasPosts ideasPosts0 = IdeasPosts.FRIDAYNIGHT;
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      Id id1 = new Id(id0.value);
      classUnderTestApogen0.deleteIdeasPostRetrospectivePage(id1);
      WentWellPosts wentWellPosts1 = WentWellPosts.DELIVERING;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts1);
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      WentWellPosts wentWellPosts2 = WentWellPosts.PROBLEM_X;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts2);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      int int1 = (-63);
      Id id2 = new Id(int1);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id2);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id2);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.LATE_WORK;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.deleteNotWentWellPostRetrospectivePage(id1);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id0);
      BoardNames boardNames1 = BoardNames.WORK;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames1);
      WentWellPosts wentWellPosts3 = WentWellPosts.PROBLEM_X;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts3);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAdvancedAdvancedPage()V: Line 162
   * Goal 2. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 3. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToAdvancedAdvancedPage();
  }

  //Test case number: 3
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createNotWentWellPostRetrospectivePage(Lcustom_classes/NotWentWellPosts;)V: Line 332
   * Goal 3. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 4. main.ClassUnderTestApogen.goToAdvancedPreviousPage()V: Line 28
   * Goal 5. main.ClassUnderTestApogen.goToIndexIndexPage()V: Line 237
   * Goal 6. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 7. main.ClassUnderTestApogen.goToIndexPreviousPage()V: Line 42
   * Goal 8. main.ClassUnderTestApogen.goToLoginAdvancedPage()V: Line 190
   * Goal 9. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 10. main.ClassUnderTestApogen.goToPreviousAdvancedPage()V: Line 205
   * Goal 11. main.ClassUnderTestApogen.goToPreviousIndexPage()V: Line 252
   * Goal 12. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 13. main.ClassUnderTestApogen.goToRetrospectivePreviousPage(Lcustom_classes/BoardNames;)V: Line 72
   * Goal 14. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 15. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 294
   * Goal 16. main.ClassUnderTestApogen.logoutMenuPage()V: Line 107
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.DEV_TIME;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToPreviousAdvancedPage();
      classUnderTestApogen0.goToAdvancedPreviousPage();
      classUnderTestApogen0.goToPreviousAdvancedPage();
      classUnderTestApogen0.goToAdvancedPreviousPage();
      classUnderTestApogen0.goToPreviousAdvancedPage();
      classUnderTestApogen0.goToIndexPreviousPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToLoginAdvancedPage();
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.logoutMenuPage();
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      IdeasPosts ideasPosts0 = IdeasPosts.DEVOPS;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      IdeasPosts ideasPosts1 = IdeasPosts.SUPPLIER;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts1);
      IdeasPosts ideasPosts2 = IdeasPosts.SUPPLIER;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts2);
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToPreviousIndexPage();
      BoardNames boardNames0 = BoardNames.MY_RETROSPECTIVE;
      classUnderTestApogen0.goToRetrospectivePreviousPage(boardNames0);
  }

  //Test case number: 4
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createWentWellPostRetrospectivePage(Lcustom_classes/WentWellPosts;)V: Line 353
   * Goal 3. main.ClassUnderTestApogen.deleteIdeasPostRetrospectivePage(Lcustom_classes/Id;)V: Line 375
   * Goal 4. main.ClassUnderTestApogen.deleteWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 419
   * Goal 5. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 6. main.ClassUnderTestApogen.goToIndexAdvancedPage()V: Line 176
   * Goal 7. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 8. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 9. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 10. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 11. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      int int0 = (-1486);
      Id id0 = new Id(int0);
      BoardNames boardNames0 = BoardNames.WORK;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      IdeasPosts ideasPosts0 = IdeasPosts.STORYPOINTS;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      WentWellPosts wentWellPosts0 = WentWellPosts.PROBLEM_X;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      WentWellPosts wentWellPosts1 = WentWellPosts.PROBLEM_X;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts1);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id0);
      classUnderTestApogen0.deleteIdeasPostRetrospectivePage(id0);
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      WentWellPosts wentWellPosts2 = WentWellPosts.TEAM_BONDING;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts2);
      classUnderTestApogen0.deleteIdeasPostRetrospectivePage(id0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToIndexAdvancedPage();
  }

  //Test case number: 5
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createNotWentWellPostRetrospectivePage(Lcustom_classes/NotWentWellPosts;)V: Line 332
   * Goal 2. main.ClassUnderTestApogen.createWentWellPostRetrospectivePage(Lcustom_classes/WentWellPosts;)V: Line 353
   * Goal 3. main.ClassUnderTestApogen.deleteWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 419
   * Goal 4. main.ClassUnderTestApogen.goToAdvancedPreviousPage()V: Line 28
   * Goal 5. main.ClassUnderTestApogen.goToIndexIndexPage()V: Line 237
   * Goal 6. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 7. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 8. main.ClassUnderTestApogen.goToPreviousIndexPage()V: Line 252
   * Goal 9. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 10. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 11. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   * Goal 12. main.ClassUnderTestApogen.toggleSummaryModeMenuPage()V: Line 123
   * Goal 13. main.ClassUnderTestApogen.untoggleSummaryModeMenuPage()V: Line 144
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      int int0 = (-1673);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.toggleSummaryModeMenuPage();
      WentWellPosts wentWellPosts0 = WentWellPosts.QUICK_CLIENT;
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.untoggleSummaryModeMenuPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.MEETINGS;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      NotWentWellPosts notWentWellPosts1 = NotWentWellPosts.DEV_TIME;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts1);
      WentWellPosts wentWellPosts1 = WentWellPosts.TEAM_BONDING;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts1);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id0);
      NotWentWellPosts notWentWellPosts2 = NotWentWellPosts.DEV_TIME;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts2);
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts2);
      BoardNames boardNames0 = BoardNames.PROJECT_Y;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts1);
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToPreviousIndexPage();
      classUnderTestApogen0.goToAdvancedPreviousPage();
  }
}
