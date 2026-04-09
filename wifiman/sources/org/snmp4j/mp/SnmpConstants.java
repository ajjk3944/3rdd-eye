package org.snmp4j.mp;

import org.snmp4j.SNMP4JSettings;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public final class SnmpConstants {
    public static final int DEFAULT_COMMAND_RESPONDER_PORT = 161;
    public static final int DEFAULT_NOTIFICATION_RECEIVER_PORT = 162;
    public static final int HUNDREDTHS_TO_NANOSECOND = 10000000;
    public static final int MILLISECOND_TO_NANOSECOND = 1000000;
    public static final int MIN_PDU_LENGTH = 484;
    public static final int SNMP_ERROR_AUTHORIZATION_ERROR = 16;
    public static final int SNMP_ERROR_BAD_VALUE = 3;
    public static final int SNMP_ERROR_COMMIT_FAILED = 14;
    public static final int SNMP_ERROR_GENERAL_ERROR = 5;
    public static final int SNMP_ERROR_INCONSISTENT_NAME = 18;
    public static final int SNMP_ERROR_INCONSISTENT_VALUE = 12;
    public static final int SNMP_ERROR_IO = -4;
    public static final int SNMP_ERROR_LEXICOGRAPHIC_ORDER = -2;
    public static final int SNMP_ERROR_NOT_WRITEABLE = 17;
    public static final int SNMP_ERROR_NO_ACCESS = 6;
    public static final int SNMP_ERROR_NO_CREATION = 11;
    public static final int SNMP_ERROR_NO_SUCH_NAME = 2;
    public static final int SNMP_ERROR_READ_ONLY = 4;
    public static final int SNMP_ERROR_REPORT = -3;
    public static final int SNMP_ERROR_RESOURCE_UNAVAILABLE = 13;
    public static final int SNMP_ERROR_SUCCESS = 0;
    public static final int SNMP_ERROR_TIMEOUT = -1;
    public static final int SNMP_ERROR_TOO_BIG = 1;
    public static final int SNMP_ERROR_UNDO_FAILED = 15;
    public static final int SNMP_ERROR_WRONG_ENCODING = 9;
    public static final int SNMP_ERROR_WRONG_LENGTH = 8;
    public static final int SNMP_ERROR_WRONG_TYPE = 7;
    public static final int SNMP_ERROR_WRONG_VALUE = 10;
    public static final int SNMP_MD_ERROR = 1701;
    public static final int SNMP_MD_OK = 0;
    public static final int SNMP_MD_UNSUPPORTED_ADDRESS_CLASS = 1703;
    public static final int SNMP_MD_UNSUPPORTED_MP_MODEL = 1702;
    public static final int SNMP_MD_UNSUPPORTED_SNMP_VERSION = 1704;
    public static final int SNMP_MP_BUILD_ERROR = -1413;
    public static final int SNMP_MP_COMMUNITY_ERROR = -1411;
    public static final int SNMP_MP_DOUBLED_MESSAGE = -1404;
    public static final int SNMP_MP_ERROR = -1400;
    public static final int SNMP_MP_INVALID_ENGINEID = -1406;
    public static final int SNMP_MP_INVALID_MESSAGE = -1405;
    public static final int SNMP_MP_MATCH_ERROR = -1410;
    public static final int SNMP_MP_NOT_INITIALIZED = -1407;
    public static final int SNMP_MP_NOT_IN_TIME_WINDOW = -1403;
    public static final int SNMP_MP_OK = 0;
    public static final int SNMP_MP_PARSE_ERROR = -1408;
    public static final int SNMP_MP_REPORT_SENT = -1418;
    public static final int SNMP_MP_UNAVAILABLE_CONTEXT = -1416;
    public static final int SNMP_MP_UNKNOWN_CONTEXT = -1417;
    public static final int SNMP_MP_UNKNOWN_MSGID = -1409;
    public static final int SNMP_MP_UNKNOWN_PDU_HANDLERS = -1415;
    public static final int SNMP_MP_UNSUPPORTED_SECURITY_MODEL = -1402;
    public static final int SNMP_MP_USM_ERROR = -1414;
    public static final int SNMP_MP_WRONG_USER_NAME = -1412;
    public static final int SNMPv1v2c_CSM_BAD_COMMUNITY_NAME = 1501;
    public static final int SNMPv1v2c_CSM_BAD_COMMUNITY_USE = 1502;
    public static final int SNMPv1v2c_CSM_OK = 0;
    public static final int SNMPv3_TSM_INADEQUATE_SECURITY_LEVELS = 1603;
    public static final int SNMPv3_TSM_INVALID_CACHES = 1602;
    public static final int SNMPv3_TSM_OK = 0;
    public static final int SNMPv3_TSM_UNKNOWN_PREFIXES = 1601;
    public static final int SNMPv3_USM_ADDRESS_ERROR = 1414;
    public static final int SNMPv3_USM_AUTHENTICATION_ERROR = 1407;
    public static final int SNMPv3_USM_AUTHENTICATION_FAILURE = 1408;
    public static final int SNMPv3_USM_DECRYPTION_ERROR = 1406;
    public static final int SNMPv3_USM_ENCRYPTION_ERROR = 1405;
    public static final int SNMPv3_USM_ENGINE_ID_TOO_LONG = 1415;
    public static final int SNMPv3_USM_ERROR = 1401;
    public static final int SNMPv3_USM_NOT_IN_TIME_WINDOW = 1411;
    public static final int SNMPv3_USM_OK = 0;
    public static final int SNMPv3_USM_PARSE_ERROR = 1409;
    public static final int SNMPv3_USM_SECURITY_NAME_TOO_LONG = 1416;
    public static final int SNMPv3_USM_UNKNOWN_ENGINEID = 1410;
    public static final int SNMPv3_USM_UNKNOWN_SECURITY_NAME = 1404;
    public static final int SNMPv3_USM_UNSUPPORTED_AUTHPROTOCOL = 1412;
    public static final int SNMPv3_USM_UNSUPPORTED_PRIVPROTOCOL = 1413;
    public static final int SNMPv3_USM_UNSUPPORTED_SECURITY_LEVEL = 1403;
    public static final int version1 = 0;
    public static final int version2c = 1;
    public static final int version3 = 3;
    public static final OID usmNoAuthProtocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 1});
    public static final OID usmHMACMD5AuthProtocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 2});
    public static final OID usmHMACSHAAuthProtocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 3});
    public static final OID usmNoPrivProtocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 2, 1});
    public static final OID usmDESPrivProtocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 2, 2});
    public static final OID usm3DESEDEPrivProtocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 2, 3});
    public static final OID usmAesCfb128Protocol = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 2, 4});
    public static final OID oosnmpUsmAesCfb192Protocol = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 2, 2, 1, 1, 1});
    public static final OID oosnmpUsmAesCfb256Protocol = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 2, 2, 1, 1, 2});
    public static final OID oosnmpUsmAesCfb192ProtocolWith3DESKeyExtension = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 2, 2, 1, 2, 1});
    public static final OID oosnmpUsmAesCfb256ProtocolWith3DESKeyExtension = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 2, 2, 1, 2, 2});
    public static final OID usmStatsUnsupportedSecLevels = new OID(new int[]{1, 3, 6, 1, 6, 3, 15, 1, 1, 1, 0});
    public static final OID usmStatsNotInTimeWindows = new OID(new int[]{1, 3, 6, 1, 6, 3, 15, 1, 1, 2, 0});
    public static final OID usmStatsUnknownUserNames = new OID(new int[]{1, 3, 6, 1, 6, 3, 15, 1, 1, 3, 0});
    public static final OID usmStatsUnknownEngineIDs = new OID(new int[]{1, 3, 6, 1, 6, 3, 15, 1, 1, 4, 0});
    public static final OID usmStatsWrongDigests = new OID(new int[]{1, 3, 6, 1, 6, 3, 15, 1, 1, 5, 0});
    public static final OID usmStatsDecryptionErrors = new OID(new int[]{1, 3, 6, 1, 6, 3, 15, 1, 1, 6, 0});
    public static final OID snmpEngineID = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 2, 1, 1, 0});
    public static final OID snmpUnknownSecurityModels = new OID(new int[]{1, 3, 6, 1, 6, 3, 11, 2, 1, 1, 0});
    public static final OID snmpInvalidMsgs = new OID(new int[]{1, 3, 6, 1, 6, 3, 11, 2, 1, 2, 0});
    public static final OID snmpUnknownPDUHandlers = new OID(new int[]{1, 3, 6, 1, 6, 3, 11, 2, 1, 3, 0});
    public static final OID snmpInPkts = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 1, 0});
    public static final OID snmpInBadVersions = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 3, 0});
    public static final OID snmpInBadCommunityNames = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 4, 0});
    public static final OID snmpInBadCommunityUses = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 5, 0});
    public static final OID snmpInASNParseErrs = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 6, 0});
    public static final OID snmpSilentDrops = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 31, 0});
    public static final OID snmpProxyDrops = new OID(new int[]{1, 3, 6, 1, 2, 1, 11, 32, 0});
    public static final OID snmpTrapOID = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 4, 1, 0});
    public static final OID snmpTrapEnterprise = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 4, 3, 0});
    public static final OID snmpTraps = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 5});
    public static final OID coldStart = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 5, 1});
    public static final OID warmStart = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 5, 2});
    public static final OID authenticationFailure = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 5, 5});
    public static final OID linkDown = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 5, 3});
    public static final OID linkUp = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 5, 4});
    public static final OID sysDescr = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 1, 0});
    public static final OID sysObjectID = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 2, 0});
    public static final OID sysUpTime = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 3, 0});
    public static final OID sysContact = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 4, 0});
    public static final OID sysName = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 5, 0});
    public static final OID sysLocation = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 6, 0});
    public static final OID sysServices = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 7, 0});
    public static final OID sysOREntry = new OID(new int[]{1, 3, 6, 1, 2, 1, 1, 9, 1});
    public static final OID system = new OID(new int[]{1, 3, 6, 1, 2, 1, 1});
    public static final OID snmpUnavailableContexts = new OID(new int[]{1, 3, 6, 1, 6, 3, 12, 1, 4, 0});
    public static final OID snmpUnknownContexts = new OID(new int[]{1, 3, 6, 1, 6, 3, 12, 1, 5, 0});
    public static final OID snmpTrapAddress = new OID(new int[]{1, 3, 6, 1, 6, 3, 18, 1, 3, 0});
    public static final OID snmpTrapCommunity = new OID(new int[]{1, 3, 6, 1, 6, 3, 18, 1, 4, 0});
    public static final OID zeroDotZero = new OID(new int[]{0, 0});
    public static final OID snmpTsmInvalidCaches = new OID(new int[]{1, 3, 6, 1, 2, 1, 190, 1, 1, 1, 0});
    public static final OID snmpTsmInadequateSecurityLevels = new OID(new int[]{1, 3, 6, 1, 2, 1, 190, 1, 1, 2, 0});
    public static final OID snmpTsmUnknownPrefixes = new OID(new int[]{1, 3, 6, 1, 2, 1, 190, 1, 1, 3, 0});
    public static final OID snmpTsmInvalidPrefixes = new OID(new int[]{1, 3, 6, 1, 2, 1, 190, 1, 1, 4, 0});
    public static final OID snmpTsmConfigurationUsePrefix = new OID(new int[]{1, 3, 6, 1, 2, 1, 190, 1, 2, 1, 0});
    public static final OID snmpTlstmSessionOpens = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 1, 0});
    public static final OID snmpTlstmSessionClientCloses = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 2, 0});
    public static final OID snmpTlstmSessionOpenErrors = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 3, 0});
    public static final OID snmpTlstmSessionAccepts = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 4, 0});
    public static final OID snmpTlstmSessionServerCloses = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 5, 0});
    public static final OID snmpTlstmSessionNoSessions = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 6, 0});
    public static final OID snmpTlstmSessionInvalidClientCertificates = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 7, 0});
    public static final OID snmpTlstmSessionUnknownServerCertificate = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 8, 0});
    public static final OID snmpTlstmSessionInvalidServerCertificates = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 9, 0});
    public static final OID snmpTlstmSessionInvalidCaches = new OID(new int[]{1, 3, 6, 1, 2, 1, 198, 2, 1, 10, 0});
    public static final OID snmpSshtmSessionOpens = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 1, 0});
    public static final OID snmpSshtmSessionCloses = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 2, 0});
    public static final OID snmpSshtmSessionOpenErrors = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 3, 0});
    public static final OID snmpSshtmSessionUserAuthFailures = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 4, 0});
    public static final OID snmpSshtmSessionNoChannels = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 5, 0});
    public static final OID snmpSshtmSessionNoSubsystems = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 6, 0});
    public static final OID snmpSshtmSessionNoSessions = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 7, 0});
    public static final OID snmpSshtmSessionInvalidCaches = new OID(new int[]{1, 3, 6, 1, 2, 1, 189, 1, 1, 8, 0});
    public static final OID snmp4jStatsRequestTimeouts = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 1, 0});
    public static final OID snmp4jStatsRequestRetries = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 2, 0});
    public static final OID snmp4jStatsRequestWaitTime = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 3, 0});
    public static final OID snmp4jStatsRequestRuntime = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 4, 0});
    public static final OID snmp4jStatsReqTableTimeouts = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 10, 3, 1, 4});
    public static final OID snmp4jStatsReqTableRetries = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 10, 3, 1, 5});
    public static final OID snmp4jStatsReqTableWaitTime = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 10, 3, 1, 6});
    public static final OID snmp4jStatsReqTableRuntime = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 1, 10, 3, 1, 7});
    public static final OID snmp4jStatsResponseTimeouts = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 2, 1, 0});
    public static final OID snmp4jStatsResponseIgnoredRetries = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 2, 2, 0});
    public static final OID snmp4jStatsResponseProcessTime = new OID(new int[]{1, 3, 6, 1, 4, 1, SNMP4JSettings.AGENTPP_ENTERPRISE_ID, 10, 1, 1, 4, 1, 2, 3, 0});
    public static final OID snmpSetSerialNo = new OID(new int[]{1, 3, 6, 1, 6, 3, 1, 1, 6, 1, 0});
    public static final String[] SNMP_TP_ERROR_MESSAGES = {"Request timed out"};
    public static final String[] SNMP_ERROR_MESSAGES = {"Success", "PDU encoding too big", "No such name", "Bad value", "Variable is read-only", "General variable binding error", "No access", "Wrong type", "Variable binding data with incorrect length", "Variable binding data with wrong encoding", "Wrong value", "Unable to create object", "Inconsistent value", "Resource unavailable", "Commit failed", "Undo failed", "Authorization error", "Not writable", "Inconsistent naming used"};
    public static String[][] MD_ERROR_MESSAGES = {new String[]{"1701", "Message Dispatcher error"}, new String[]{"1702", "Unsupported message processing model"}, new String[]{"1703", "Unsupported address class"}, new String[]{"1704", "Unsupported address class"}};
    public static String[][] MP_ERROR_MESSAGES = {new String[]{"-1400", "MP error"}, new String[]{"-1402", "Unsupported security model"}, new String[]{"-1403", "Message not in time window"}, new String[]{"-1404", "Doubled message"}, new String[]{"-1405", "Invalid message"}, new String[]{"-1406", "Invalid engine ID"}, new String[]{"-1407", "MP not initialized"}, new String[]{"-1408", "MP parse error"}, new String[]{"-1409", "Unknown message ID"}, new String[]{"-1410", "MP match error"}, new String[]{"-1411", "MP community error"}, new String[]{"-1412", "Wrong user name"}, new String[]{"-1413", "MP build error"}, new String[]{"-1414", "USM error"}, new String[]{"-1415", "Unknown PDU handles"}, new String[]{"-1416", "Unavailable context"}, new String[]{"-1417", "Unknown context"}, new String[]{"-1418", "Report sent"}};
    public static String[][] USM_ERROR_MESSAGES = {new String[]{"0", "USM OK"}, new String[]{"1401", "USM error"}, new String[]{"1403", "Unsupported security level"}, new String[]{"1404", "Unknown security name"}, new String[]{"1405", "Encryption error"}, new String[]{"1406", "Decryption error"}, new String[]{"1407", "Authentication error"}, new String[]{"1408", "Authentication failure"}, new String[]{"1409", "USM parse error"}, new String[]{"1410", "Unknown engine ID"}, new String[]{"1411", "Not in time window"}, new String[]{"1412", "Unsupported authentication protocol"}, new String[]{"1413", "Unsupported privacy protocol"}, new String[]{"1414", "Address error"}, new String[]{"1415", "Engine ID too long"}, new String[]{"1416", "Security name too long"}};

    public enum StorageTypeEnum {
        other(1),
        _volatile(2),
        nonVolatile(3),
        permanent(4),
        readOnly(5);

        private int smiValue;

        StorageTypeEnum(int i10) {
            this.smiValue = i10;
        }

        public int getSmiValue() {
            return this.smiValue;
        }
    }

    private static String errorMessage(int i10, String[][] strArr) {
        String str = "" + i10;
        for (String[] strArr2 : strArr) {
            if (str.equals(strArr2[0])) {
                return strArr2[1];
            }
        }
        return null;
    }

    public static int getGenericTrapID(OID oid) {
        if (oid != null) {
            int size = oid.size();
            OID oid2 = snmpTraps;
            if (size == oid2.size() + 1 && oid.leftMostCompare(oid2.size(), oid2) == 0) {
                return oid.get(oid.size() - 1) - 1;
            }
        }
        return -1;
    }

    public static OID getTrapOID(OID oid, int i10, int i11) {
        if (i10 != 6) {
            OID oid2 = new OID(snmpTraps);
            oid2.append(i10 + 1);
            return oid2;
        }
        OID oid3 = new OID(oid);
        oid3.append(0);
        oid3.append(i11);
        return oid3;
    }

    public static String mpErrorMessage(int i10) {
        String str = "" + i10;
        for (String[] strArr : MP_ERROR_MESSAGES) {
            if (str.equals(strArr[0])) {
                return strArr[1];
            }
        }
        String strErrorMessage = errorMessage(i10, USM_ERROR_MESSAGES);
        if (strErrorMessage != null) {
            return strErrorMessage;
        }
        String strErrorMessage2 = errorMessage(i10, MD_ERROR_MESSAGES);
        if (strErrorMessage2 != null) {
            return strErrorMessage2;
        }
        return "" + i10;
    }

    public static String usmErrorMessage(int i10) {
        String strErrorMessage = errorMessage(i10, USM_ERROR_MESSAGES);
        if (strErrorMessage != null) {
            return strErrorMessage;
        }
        return "" + i10;
    }
}
