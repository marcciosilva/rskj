package org.ethereum.net;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(NodeStatistics.class)
public class NodeStatisticsTest {

    @Test
    public void getSessionFairReputation_OK() {
        NodeStatistics nodeStatistics = new NodeStatistics();

        Assert.assertEquals(0, nodeStatistics.getSessionFairReputation());
    }

    @Test
    public void getSessionFairReputation_disconnected_OK() {
        NodeStatistics nodeStatistics = new NodeStatistics();

        Assert.assertEquals(0, nodeStatistics.getSessionFairReputation());
    }

}
