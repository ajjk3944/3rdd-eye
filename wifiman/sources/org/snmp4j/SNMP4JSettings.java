package org.snmp4j;

import org.snmp4j.util.DefaultThreadFactory;
import org.snmp4j.util.DefaultTimerFactory;
import org.snmp4j.util.OIDTextFormat;
import org.snmp4j.util.SimpleOIDTextFormat;
import org.snmp4j.util.SimpleVariableTextFormat;
import org.snmp4j.util.ThreadFactory;
import org.snmp4j.util.TimerFactory;
import org.snmp4j.util.VariableTextFormat;

/* loaded from: classes2.dex */
public final class SNMP4JSettings {
    private static boolean extensibilityEnabled = false;
    private static volatile boolean forwardRuntimeExceptions = false;
    private static int maxEngineIdCacheSize = 50000;
    private static ThreadFactory threadFactory = new DefaultThreadFactory();
    private static TimerFactory timerFactory = new DefaultTimerFactory();
    private static OIDTextFormat oidTextFormat = new SimpleOIDTextFormat();
    private static VariableTextFormat variableTextFormat = new SimpleVariableTextFormat();
    private static long threadJoinTimeout = 60000;
    private static boolean allowSNMPv2InV1 = false;
    private static boolean noGetBulk = false;
    private static ReportSecurityLevelStrategy reportSecurityLevelStrategy = ReportSecurityLevelStrategy.standard;
    public static final int AGENTPP_ENTERPRISE_ID = 4976;
    private static int enterpriseID = AGENTPP_ENTERPRISE_ID;
    private static Snmp4jStatistics snmp4jStatistics = Snmp4jStatistics.basic;
    private static boolean checkUsmUserPassphraseLength = true;

    public enum ReportSecurityLevelStrategy {
        noAuthNoPrivIfNeeded,
        standard,
        neverNoAuthNoPriv
    }

    public enum Snmp4jStatistics {
        none,
        basic,
        extended
    }

    public static int getEnterpriseID() {
        return enterpriseID;
    }

    public static int getMaxEngineIdCacheSize() {
        return maxEngineIdCacheSize;
    }

    public static OIDTextFormat getOIDTextFormat() {
        return oidTextFormat;
    }

    public static ReportSecurityLevelStrategy getReportSecurityLevelStrategy() {
        return reportSecurityLevelStrategy;
    }

    public static Snmp4jStatistics getSnmp4jStatistics() {
        return snmp4jStatistics;
    }

    public static ThreadFactory getThreadFactory() {
        return threadFactory;
    }

    public static long getThreadJoinTimeout() {
        return threadJoinTimeout;
    }

    public static TimerFactory getTimerFactory() {
        return timerFactory;
    }

    public static VariableTextFormat getVariableTextFormat() {
        return variableTextFormat;
    }

    public static boolean isAllowSNMPv2InV1() {
        return allowSNMPv2InV1;
    }

    public static boolean isCheckUsmUserPassphraseLength() {
        return checkUsmUserPassphraseLength;
    }

    public static boolean isExtensibilityEnabled() {
        return extensibilityEnabled;
    }

    public static boolean isForwardRuntimeExceptions() {
        return forwardRuntimeExceptions;
    }

    public static boolean isNoGetBulk() {
        return noGetBulk;
    }

    public static void setAllowSNMPv2InV1(boolean z10) {
        allowSNMPv2InV1 = z10;
    }

    public static void setCheckUsmUserPassphraseLength(boolean z10) {
        checkUsmUserPassphraseLength = z10;
    }

    public static void setEnterpriseID(int i10) {
        enterpriseID = i10;
    }

    public static void setExtensibilityEnabled(boolean z10) {
        extensibilityEnabled = z10;
    }

    public static void setForwardRuntimeExceptions(boolean z10) {
        forwardRuntimeExceptions = z10;
    }

    public static void setMaxEngineIdCacheSize(int i10) {
        maxEngineIdCacheSize = i10;
    }

    public static void setNoGetBulk(boolean z10) {
        noGetBulk = z10;
    }

    public static void setOIDTextFormat(OIDTextFormat oIDTextFormat) {
        oIDTextFormat.getClass();
        oidTextFormat = oIDTextFormat;
    }

    public static void setReportSecurityLevelStrategy(ReportSecurityLevelStrategy reportSecurityLevelStrategy2) {
        reportSecurityLevelStrategy = reportSecurityLevelStrategy2;
    }

    public static void setSnmp4jStatistics(Snmp4jStatistics snmp4jStatistics2) {
        snmp4jStatistics = snmp4jStatistics2;
    }

    public static void setThreadFactory(ThreadFactory threadFactory2) {
        threadFactory2.getClass();
        threadFactory = threadFactory2;
    }

    public static void setThreadJoinTimeout(long j10) {
        threadJoinTimeout = j10;
    }

    public static void setTimerFactory(TimerFactory timerFactory2) {
        timerFactory2.getClass();
        timerFactory = timerFactory2;
    }

    public static void setVariableTextFormat(VariableTextFormat variableTextFormat2) {
        variableTextFormat2.getClass();
        variableTextFormat = variableTextFormat2;
    }
}
