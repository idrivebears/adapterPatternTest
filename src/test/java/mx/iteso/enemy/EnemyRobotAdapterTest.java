package mx.iteso.enemy;

/**
 * Created by Alex on 04/11/2015.
 */

import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyRobotAdapterTest {

    EnemyRobotAdapter enemyRobotAdapter;
    EnemyRobot enemyRobot;

    @Before
    public void SetUp()
    {
        enemyRobot = new EnemyGiantRobot();
        enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
    }

    @Test
    public void RunTests()
    {
        assertEquals(enemyRobot.walkForward(), enemyRobotAdapter.driveForward());
        assertEquals(enemyRobot.smashWithHands(), enemyRobotAdapter.fireWeapon());
        assertEquals(enemyRobot.reactToHuman("Michael"), enemyRobotAdapter.assignDriver("Michael"));
    }

}
