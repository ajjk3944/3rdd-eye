.class public final Lorg/snmp4j/mp/SnmpConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;
    }
.end annotation


# static fields
.field public static final DEFAULT_COMMAND_RESPONDER_PORT:I = 0xa1

.field public static final DEFAULT_NOTIFICATION_RECEIVER_PORT:I = 0xa2

.field public static final HUNDREDTHS_TO_NANOSECOND:I = 0x989680

.field public static MD_ERROR_MESSAGES:[[Ljava/lang/String; = null

.field public static final MILLISECOND_TO_NANOSECOND:I = 0xf4240

.field public static final MIN_PDU_LENGTH:I = 0x1e4

.field public static MP_ERROR_MESSAGES:[[Ljava/lang/String; = null

.field public static final SNMP_ERROR_AUTHORIZATION_ERROR:I = 0x10

.field public static final SNMP_ERROR_BAD_VALUE:I = 0x3

.field public static final SNMP_ERROR_COMMIT_FAILED:I = 0xe

.field public static final SNMP_ERROR_GENERAL_ERROR:I = 0x5

.field public static final SNMP_ERROR_INCONSISTENT_NAME:I = 0x12

.field public static final SNMP_ERROR_INCONSISTENT_VALUE:I = 0xc

.field public static final SNMP_ERROR_IO:I = -0x4

.field public static final SNMP_ERROR_LEXICOGRAPHIC_ORDER:I = -0x2

.field public static final SNMP_ERROR_MESSAGES:[Ljava/lang/String;

.field public static final SNMP_ERROR_NOT_WRITEABLE:I = 0x11

.field public static final SNMP_ERROR_NO_ACCESS:I = 0x6

.field public static final SNMP_ERROR_NO_CREATION:I = 0xb

.field public static final SNMP_ERROR_NO_SUCH_NAME:I = 0x2

.field public static final SNMP_ERROR_READ_ONLY:I = 0x4

.field public static final SNMP_ERROR_REPORT:I = -0x3

.field public static final SNMP_ERROR_RESOURCE_UNAVAILABLE:I = 0xd

.field public static final SNMP_ERROR_SUCCESS:I = 0x0

.field public static final SNMP_ERROR_TIMEOUT:I = -0x1

.field public static final SNMP_ERROR_TOO_BIG:I = 0x1

.field public static final SNMP_ERROR_UNDO_FAILED:I = 0xf

.field public static final SNMP_ERROR_WRONG_ENCODING:I = 0x9

.field public static final SNMP_ERROR_WRONG_LENGTH:I = 0x8

.field public static final SNMP_ERROR_WRONG_TYPE:I = 0x7

.field public static final SNMP_ERROR_WRONG_VALUE:I = 0xa

.field public static final SNMP_MD_ERROR:I = 0x6a5

.field public static final SNMP_MD_OK:I = 0x0

.field public static final SNMP_MD_UNSUPPORTED_ADDRESS_CLASS:I = 0x6a7

.field public static final SNMP_MD_UNSUPPORTED_MP_MODEL:I = 0x6a6

.field public static final SNMP_MD_UNSUPPORTED_SNMP_VERSION:I = 0x6a8

.field public static final SNMP_MP_BUILD_ERROR:I = -0x585

.field public static final SNMP_MP_COMMUNITY_ERROR:I = -0x583

.field public static final SNMP_MP_DOUBLED_MESSAGE:I = -0x57c

.field public static final SNMP_MP_ERROR:I = -0x578

.field public static final SNMP_MP_INVALID_ENGINEID:I = -0x57e

.field public static final SNMP_MP_INVALID_MESSAGE:I = -0x57d

.field public static final SNMP_MP_MATCH_ERROR:I = -0x582

.field public static final SNMP_MP_NOT_INITIALIZED:I = -0x57f

.field public static final SNMP_MP_NOT_IN_TIME_WINDOW:I = -0x57b

.field public static final SNMP_MP_OK:I = 0x0

.field public static final SNMP_MP_PARSE_ERROR:I = -0x580

.field public static final SNMP_MP_REPORT_SENT:I = -0x58a

.field public static final SNMP_MP_UNAVAILABLE_CONTEXT:I = -0x588

.field public static final SNMP_MP_UNKNOWN_CONTEXT:I = -0x589

.field public static final SNMP_MP_UNKNOWN_MSGID:I = -0x581

.field public static final SNMP_MP_UNKNOWN_PDU_HANDLERS:I = -0x587

.field public static final SNMP_MP_UNSUPPORTED_SECURITY_MODEL:I = -0x57a

.field public static final SNMP_MP_USM_ERROR:I = -0x586

.field public static final SNMP_MP_WRONG_USER_NAME:I = -0x584

.field public static final SNMP_TP_ERROR_MESSAGES:[Ljava/lang/String;

.field public static final SNMPv1v2c_CSM_BAD_COMMUNITY_NAME:I = 0x5dd

.field public static final SNMPv1v2c_CSM_BAD_COMMUNITY_USE:I = 0x5de

.field public static final SNMPv1v2c_CSM_OK:I = 0x0

.field public static final SNMPv3_TSM_INADEQUATE_SECURITY_LEVELS:I = 0x643

.field public static final SNMPv3_TSM_INVALID_CACHES:I = 0x642

.field public static final SNMPv3_TSM_OK:I = 0x0

.field public static final SNMPv3_TSM_UNKNOWN_PREFIXES:I = 0x641

.field public static final SNMPv3_USM_ADDRESS_ERROR:I = 0x586

.field public static final SNMPv3_USM_AUTHENTICATION_ERROR:I = 0x57f

.field public static final SNMPv3_USM_AUTHENTICATION_FAILURE:I = 0x580

.field public static final SNMPv3_USM_DECRYPTION_ERROR:I = 0x57e

.field public static final SNMPv3_USM_ENCRYPTION_ERROR:I = 0x57d

.field public static final SNMPv3_USM_ENGINE_ID_TOO_LONG:I = 0x587

.field public static final SNMPv3_USM_ERROR:I = 0x579

.field public static final SNMPv3_USM_NOT_IN_TIME_WINDOW:I = 0x583

.field public static final SNMPv3_USM_OK:I = 0x0

.field public static final SNMPv3_USM_PARSE_ERROR:I = 0x581

.field public static final SNMPv3_USM_SECURITY_NAME_TOO_LONG:I = 0x588

.field public static final SNMPv3_USM_UNKNOWN_ENGINEID:I = 0x582

.field public static final SNMPv3_USM_UNKNOWN_SECURITY_NAME:I = 0x57c

.field public static final SNMPv3_USM_UNSUPPORTED_AUTHPROTOCOL:I = 0x584

.field public static final SNMPv3_USM_UNSUPPORTED_PRIVPROTOCOL:I = 0x585

.field public static final SNMPv3_USM_UNSUPPORTED_SECURITY_LEVEL:I = 0x57b

.field public static USM_ERROR_MESSAGES:[[Ljava/lang/String; = null

.field public static final authenticationFailure:Lorg/snmp4j/smi/OID;

.field public static final coldStart:Lorg/snmp4j/smi/OID;

.field public static final linkDown:Lorg/snmp4j/smi/OID;

.field public static final linkUp:Lorg/snmp4j/smi/OID;

.field public static final oosnmpUsmAesCfb192Protocol:Lorg/snmp4j/smi/OID;

.field public static final oosnmpUsmAesCfb192ProtocolWith3DESKeyExtension:Lorg/snmp4j/smi/OID;

.field public static final oosnmpUsmAesCfb256Protocol:Lorg/snmp4j/smi/OID;

.field public static final oosnmpUsmAesCfb256ProtocolWith3DESKeyExtension:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsReqTableRetries:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsReqTableRuntime:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsReqTableTimeouts:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsReqTableWaitTime:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsRequestRetries:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsRequestRuntime:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsRequestTimeouts:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsRequestWaitTime:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsResponseIgnoredRetries:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsResponseProcessTime:Lorg/snmp4j/smi/OID;

.field public static final snmp4jStatsResponseTimeouts:Lorg/snmp4j/smi/OID;

.field public static final snmpEngineID:Lorg/snmp4j/smi/OID;

.field public static final snmpInASNParseErrs:Lorg/snmp4j/smi/OID;

.field public static final snmpInBadCommunityNames:Lorg/snmp4j/smi/OID;

.field public static final snmpInBadCommunityUses:Lorg/snmp4j/smi/OID;

.field public static final snmpInBadVersions:Lorg/snmp4j/smi/OID;

.field public static final snmpInPkts:Lorg/snmp4j/smi/OID;

.field public static final snmpInvalidMsgs:Lorg/snmp4j/smi/OID;

.field public static final snmpProxyDrops:Lorg/snmp4j/smi/OID;

.field public static final snmpSetSerialNo:Lorg/snmp4j/smi/OID;

.field public static final snmpSilentDrops:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionCloses:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionInvalidCaches:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionNoChannels:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionNoSessions:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionNoSubsystems:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionOpenErrors:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionOpens:Lorg/snmp4j/smi/OID;

.field public static final snmpSshtmSessionUserAuthFailures:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionAccepts:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionClientCloses:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionInvalidCaches:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionNoSessions:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionOpens:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionServerCloses:Lorg/snmp4j/smi/OID;

.field public static final snmpTlstmSessionUnknownServerCertificate:Lorg/snmp4j/smi/OID;

.field public static final snmpTrapAddress:Lorg/snmp4j/smi/OID;

.field public static final snmpTrapCommunity:Lorg/snmp4j/smi/OID;

.field public static final snmpTrapEnterprise:Lorg/snmp4j/smi/OID;

.field public static final snmpTrapOID:Lorg/snmp4j/smi/OID;

.field public static final snmpTraps:Lorg/snmp4j/smi/OID;

.field public static final snmpTsmConfigurationUsePrefix:Lorg/snmp4j/smi/OID;

.field public static final snmpTsmInadequateSecurityLevels:Lorg/snmp4j/smi/OID;

.field public static final snmpTsmInvalidCaches:Lorg/snmp4j/smi/OID;

.field public static final snmpTsmInvalidPrefixes:Lorg/snmp4j/smi/OID;

.field public static final snmpTsmUnknownPrefixes:Lorg/snmp4j/smi/OID;

.field public static final snmpUnavailableContexts:Lorg/snmp4j/smi/OID;

.field public static final snmpUnknownContexts:Lorg/snmp4j/smi/OID;

.field public static final snmpUnknownPDUHandlers:Lorg/snmp4j/smi/OID;

.field public static final snmpUnknownSecurityModels:Lorg/snmp4j/smi/OID;

.field public static final sysContact:Lorg/snmp4j/smi/OID;

.field public static final sysDescr:Lorg/snmp4j/smi/OID;

.field public static final sysLocation:Lorg/snmp4j/smi/OID;

.field public static final sysName:Lorg/snmp4j/smi/OID;

.field public static final sysOREntry:Lorg/snmp4j/smi/OID;

.field public static final sysObjectID:Lorg/snmp4j/smi/OID;

.field public static final sysServices:Lorg/snmp4j/smi/OID;

.field public static final sysUpTime:Lorg/snmp4j/smi/OID;

.field public static final system:Lorg/snmp4j/smi/OID;

.field public static final usm3DESEDEPrivProtocol:Lorg/snmp4j/smi/OID;

.field public static final usmAesCfb128Protocol:Lorg/snmp4j/smi/OID;

.field public static final usmDESPrivProtocol:Lorg/snmp4j/smi/OID;

.field public static final usmHMACMD5AuthProtocol:Lorg/snmp4j/smi/OID;

.field public static final usmHMACSHAAuthProtocol:Lorg/snmp4j/smi/OID;

.field public static final usmNoAuthProtocol:Lorg/snmp4j/smi/OID;

.field public static final usmNoPrivProtocol:Lorg/snmp4j/smi/OID;

.field public static final usmStatsDecryptionErrors:Lorg/snmp4j/smi/OID;

.field public static final usmStatsNotInTimeWindows:Lorg/snmp4j/smi/OID;

.field public static final usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

.field public static final usmStatsUnknownUserNames:Lorg/snmp4j/smi/OID;

.field public static final usmStatsUnsupportedSecLevels:Lorg/snmp4j/smi/OID;

.field public static final usmStatsWrongDigests:Lorg/snmp4j/smi/OID;

.field public static final version1:I = 0x0

.field public static final version2c:I = 0x1

.field public static final version3:I = 0x3

.field public static final warmStart:Lorg/snmp4j/smi/OID;

.field public static final zeroDotZero:Lorg/snmp4j/smi/OID;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/16 v1, 0xa

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmNoAuthProtocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_1

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmHMACMD5AuthProtocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_2

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmHMACSHAAuthProtocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_3

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmNoPrivProtocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_4

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmDESPrivProtocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_5

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usm3DESEDEPrivProtocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_6

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmAesCfb128Protocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/16 v2, 0xc

    new-array v3, v2, [I

    fill-array-data v3, :array_7

    invoke-direct {v0, v3}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->oosnmpUsmAesCfb192Protocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v3, v2, [I

    fill-array-data v3, :array_8

    invoke-direct {v0, v3}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->oosnmpUsmAesCfb256Protocol:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v3, v2, [I

    fill-array-data v3, :array_9

    invoke-direct {v0, v3}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->oosnmpUsmAesCfb192ProtocolWith3DESKeyExtension:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v2, [I

    fill-array-data v2, :array_a

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->oosnmpUsmAesCfb256ProtocolWith3DESKeyExtension:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/4 v2, 0x0

    const/16 v3, 0xf

    const/16 v4, 0xb

    new-array v5, v4, [I

    fill-array-data v5, :array_b

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnsupportedSecLevels:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_c

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmStatsNotInTimeWindows:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_d

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownUserNames:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_e

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_f

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmStatsWrongDigests:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_10

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->usmStatsDecryptionErrors:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_11

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpEngineID:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_12

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownSecurityModels:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_13

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpInvalidMsgs:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v4, [I

    fill-array-data v5, :array_14

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownPDUHandlers:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/16 v5, 0x9

    new-array v6, v5, [I

    fill-array-data v6, :array_15

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpInPkts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_16

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpInBadVersions:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_17

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpInBadCommunityNames:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_18

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpInBadCommunityUses:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_19

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpInASNParseErrs:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_1a

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSilentDrops:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_1b

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpProxyDrops:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v4, [I

    fill-array-data v6, :array_1c

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapOID:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v4, [I

    fill-array-data v6, :array_1d

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapEnterprise:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_1e

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTraps:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v1, [I

    fill-array-data v6, :array_1f

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->coldStart:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v1, [I

    fill-array-data v6, :array_20

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->warmStart:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v1, [I

    fill-array-data v6, :array_21

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->authenticationFailure:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v1, [I

    fill-array-data v6, :array_22

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->linkDown:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v1, [I

    fill-array-data v6, :array_23

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->linkUp:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_24

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysDescr:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_25

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysObjectID:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_26

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysUpTime:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_27

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysContact:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_28

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysName:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v6, v5, [I

    fill-array-data v6, :array_29

    invoke-direct {v0, v6}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysLocation:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/4 v6, 0x7

    new-array v7, v5, [I

    fill-array-data v7, :array_2a

    invoke-direct {v0, v7}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysServices:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v5, [I

    fill-array-data v5, :array_2b

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->sysOREntry:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v6, [I

    fill-array-data v5, :array_2c

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->system:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v1, [I

    fill-array-data v5, :array_2d

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpUnavailableContexts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v1, [I

    fill-array-data v5, :array_2e

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownContexts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v5, v1, [I

    fill-array-data v5, :array_2f

    invoke-direct {v0, v5}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapAddress:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v1, [I

    fill-array-data v1, :array_30

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapCommunity:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    filled-new-array {v2, v2}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->zeroDotZero:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_31

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInvalidCaches:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_32

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInadequateSecurityLevels:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_33

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmUnknownPrefixes:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_34

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInvalidPrefixes:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_35

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmConfigurationUsePrefix:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_36

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpens:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_37

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionClientCloses:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_38

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_39

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionAccepts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_3a

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionServerCloses:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_3b

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionNoSessions:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_3c

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_3d

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionUnknownServerCertificate:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_3e

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_3f

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidCaches:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_40

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionOpens:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_41

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionCloses:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_42

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_43

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionUserAuthFailures:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_44

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionNoChannels:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_45

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionNoSubsystems:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_46

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionNoSessions:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_47

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionInvalidCaches:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_48

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestTimeouts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_49

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestRetries:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_4a

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestWaitTime:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_4b

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestRuntime:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/16 v1, 0x11

    new-array v2, v1, [I

    fill-array-data v2, :array_4c

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableTimeouts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_4d

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableRetries:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_4e

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableWaitTime:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v1, [I

    fill-array-data v1, :array_4f

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableRuntime:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_50

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsResponseTimeouts:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_51

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsResponseIgnoredRetries:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v3, [I

    fill-array-data v1, :array_52

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsResponseProcessTime:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v4, [I

    fill-array-data v1, :array_53

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSetSerialNo:Lorg/snmp4j/smi/OID;

    const-string v0, "Request timed out"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->SNMP_TP_ERROR_MESSAGES:[Ljava/lang/String;

    const-string v18, "Not writable"

    const-string v19, "Inconsistent naming used"

    const-string v1, "Success"

    const-string v2, "PDU encoding too big"

    const-string v3, "No such name"

    const-string v4, "Bad value"

    const-string v5, "Variable is read-only"

    const-string v6, "General variable binding error"

    const-string v7, "No access"

    const-string v8, "Wrong type"

    const-string v9, "Variable binding data with incorrect length"

    const-string v10, "Variable binding data with wrong encoding"

    const-string v11, "Wrong value"

    const-string v12, "Unable to create object"

    const-string v13, "Inconsistent value"

    const-string v14, "Resource unavailable"

    const-string v15, "Commit failed"

    const-string v16, "Undo failed"

    const-string v17, "Authorization error"

    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->SNMP_ERROR_MESSAGES:[Ljava/lang/String;

    const-string v0, "1701"

    const-string v1, "Message Dispatcher error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "1702"

    const-string v2, "Unsupported message processing model"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "1703"

    const-string v3, "Unsupported address class"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, "1704"

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->MD_ERROR_MESSAGES:[[Ljava/lang/String;

    const-string v0, "-1400"

    const-string v1, "MP error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    const-string v0, "-1402"

    const-string v1, "Unsupported security model"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v3

    const-string v0, "-1403"

    const-string v1, "Message not in time window"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v4

    const-string v0, "-1404"

    const-string v1, "Doubled message"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v5

    const-string v0, "-1405"

    const-string v1, "Invalid message"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v6

    const-string v0, "-1406"

    const-string v1, "Invalid engine ID"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v7

    const-string v0, "-1407"

    const-string v1, "MP not initialized"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v8

    const-string v0, "-1408"

    const-string v1, "MP parse error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v9

    const-string v0, "-1409"

    const-string v1, "Unknown message ID"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v10

    const-string v0, "-1410"

    const-string v1, "MP match error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v11

    const-string v0, "-1411"

    const-string v1, "MP community error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v12

    const-string v0, "-1412"

    const-string v1, "Wrong user name"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v13

    const-string v0, "-1413"

    const-string v1, "MP build error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v14

    const-string v0, "-1414"

    const-string v1, "USM error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    const-string v0, "-1415"

    move-object/from16 v20, v1

    const-string v1, "Unknown PDU handles"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v16

    const-string v0, "-1416"

    const-string v1, "Unavailable context"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v17

    const-string v0, "-1417"

    const-string v1, "Unknown context"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v18

    const-string v0, "-1418"

    const-string v1, "Report sent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v19

    filled-new-array/range {v2 .. v19}, [[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->MP_ERROR_MESSAGES:[[Ljava/lang/String;

    const-string v0, "0"

    const-string v1, "USM OK"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    const-string v0, "1401"

    move-object/from16 v1, v20

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v3

    const-string v0, "1403"

    const-string v1, "Unsupported security level"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v4

    const-string v0, "1404"

    const-string v1, "Unknown security name"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v5

    const-string v0, "1405"

    const-string v1, "Encryption error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v6

    const-string v0, "1406"

    const-string v1, "Decryption error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v7

    const-string v0, "1407"

    const-string v1, "Authentication error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v8

    const-string v0, "1408"

    const-string v1, "Authentication failure"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v9

    const-string v0, "1409"

    const-string v1, "USM parse error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v10

    const-string v0, "1410"

    const-string v1, "Unknown engine ID"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v11

    const-string v0, "1411"

    const-string v1, "Not in time window"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v12

    const-string v0, "1412"

    const-string v1, "Unsupported authentication protocol"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v13

    const-string v0, "1413"

    const-string v1, "Unsupported privacy protocol"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v14

    const-string v0, "1414"

    const-string v1, "Address error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v15

    const-string v0, "1415"

    const-string v1, "Engine ID too long"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v16

    const-string v0, "1416"

    const-string v1, "Security name too long"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v17

    filled-new-array/range {v2 .. v17}, [[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants;->USM_ERROR_MESSAGES:[[Ljava/lang/String;

    return-void

    :array_0
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x1
        0x2
    .end array-data

    :array_2
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x1
        0x3
    .end array-data

    :array_3
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x2
        0x1
    .end array-data

    :array_4
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x2
        0x2
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x2
        0x3
    .end array-data

    :array_6
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x2
        0x4
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0x2
        0x2
        0x1
        0x1
        0x1
    .end array-data

    :array_8
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0x2
        0x2
        0x1
        0x1
        0x2
    .end array-data

    :array_9
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0x2
        0x2
        0x1
        0x2
        0x1
    .end array-data

    :array_a
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0x2
        0x2
        0x1
        0x2
        0x2
    .end array-data

    :array_b
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xf
        0x1
        0x1
        0x1
        0x0
    .end array-data

    :array_c
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xf
        0x1
        0x1
        0x2
        0x0
    .end array-data

    :array_d
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xf
        0x1
        0x1
        0x3
        0x0
    .end array-data

    :array_e
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xf
        0x1
        0x1
        0x4
        0x0
    .end array-data

    :array_f
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xf
        0x1
        0x1
        0x5
        0x0
    .end array-data

    :array_10
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xf
        0x1
        0x1
        0x6
        0x0
    .end array-data

    :array_11
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x2
        0x1
        0x1
        0x0
    .end array-data

    :array_12
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xb
        0x2
        0x1
        0x1
        0x0
    .end array-data

    :array_13
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xb
        0x2
        0x1
        0x2
        0x0
    .end array-data

    :array_14
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xb
        0x2
        0x1
        0x3
        0x0
    .end array-data

    :array_15
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x1
        0x0
    .end array-data

    :array_16
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x3
        0x0
    .end array-data

    :array_17
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x4
        0x0
    .end array-data

    :array_18
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x5
        0x0
    .end array-data

    :array_19
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x6
        0x0
    .end array-data

    :array_1a
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x1f
        0x0
    .end array-data

    :array_1b
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xb
        0x20
        0x0
    .end array-data

    :array_1c
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x4
        0x1
        0x0
    .end array-data

    :array_1d
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x4
        0x3
        0x0
    .end array-data

    :array_1e
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x5
    .end array-data

    :array_1f
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x5
        0x1
    .end array-data

    :array_20
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x5
        0x2
    .end array-data

    :array_21
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x5
        0x5
    .end array-data

    :array_22
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x5
        0x3
    .end array-data

    :array_23
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x5
        0x4
    .end array-data

    :array_24
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x1
        0x0
    .end array-data

    :array_25
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x2
        0x0
    .end array-data

    :array_26
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x3
        0x0
    .end array-data

    :array_27
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x4
        0x0
    .end array-data

    :array_28
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x5
        0x0
    .end array-data

    :array_29
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x6
        0x0
    .end array-data

    :array_2a
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x7
        0x0
    .end array-data

    :array_2b
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
        0x9
        0x1
    .end array-data

    :array_2c
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0x1
    .end array-data

    :array_2d
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xc
        0x1
        0x4
        0x0
    .end array-data

    :array_2e
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xc
        0x1
        0x5
        0x0
    .end array-data

    :array_2f
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x12
        0x1
        0x3
        0x0
    .end array-data

    :array_30
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x12
        0x1
        0x4
        0x0
    .end array-data

    :array_31
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbe
        0x1
        0x1
        0x1
        0x0
    .end array-data

    :array_32
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbe
        0x1
        0x1
        0x2
        0x0
    .end array-data

    :array_33
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbe
        0x1
        0x1
        0x3
        0x0
    .end array-data

    :array_34
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbe
        0x1
        0x1
        0x4
        0x0
    .end array-data

    :array_35
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbe
        0x1
        0x2
        0x1
        0x0
    .end array-data

    :array_36
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x1
        0x0
    .end array-data

    :array_37
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x2
        0x0
    .end array-data

    :array_38
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x3
        0x0
    .end array-data

    :array_39
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x4
        0x0
    .end array-data

    :array_3a
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x5
        0x0
    .end array-data

    :array_3b
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x6
        0x0
    .end array-data

    :array_3c
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x7
        0x0
    .end array-data

    :array_3d
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x8
        0x0
    .end array-data

    :array_3e
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0x9
        0x0
    .end array-data

    :array_3f
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xc6
        0x2
        0x1
        0xa
        0x0
    .end array-data

    :array_40
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x1
        0x0
    .end array-data

    :array_41
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x2
        0x0
    .end array-data

    :array_42
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x3
        0x0
    .end array-data

    :array_43
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x4
        0x0
    .end array-data

    :array_44
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x5
        0x0
    .end array-data

    :array_45
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x6
        0x0
    .end array-data

    :array_46
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x7
        0x0
    .end array-data

    :array_47
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x2
        0x1
        0xbd
        0x1
        0x1
        0x8
        0x0
    .end array-data

    :array_48
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0x1
        0x0
    .end array-data

    :array_49
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0x2
        0x0
    .end array-data

    :array_4a
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0x3
        0x0
    .end array-data

    :array_4b
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0x4
        0x0
    .end array-data

    :array_4c
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0xa
        0x3
        0x1
        0x4
    .end array-data

    :array_4d
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0xa
        0x3
        0x1
        0x5
    .end array-data

    :array_4e
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0xa
        0x3
        0x1
        0x6
    .end array-data

    :array_4f
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x1
        0xa
        0x3
        0x1
        0x7
    .end array-data

    :array_50
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x2
        0x1
        0x0
    .end array-data

    :array_51
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x2
        0x2
        0x0
    .end array-data

    :array_52
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x4
        0x1
        0x1370
        0xa
        0x1
        0x1
        0x4
        0x1
        0x2
        0x3
        0x0
    .end array-data

    :array_53
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0x1
        0x1
        0x6
        0x1
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static errorMessage(I[[Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    aget-object v4, v3, v1

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p0, 0x1

    aget-object p0, v3, p0

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getGenericTrapID(Lorg/snmp4j/smi/OID;)I
    .locals 4

    const/4 v0, -0x1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v1

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpTraps:Lorg/snmp4j/smi/OID;

    invoke-virtual {v2}, Lorg/snmp4j/smi/OID;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lorg/snmp4j/smi/OID;->size()I

    move-result v1

    invoke-virtual {p0, v1, v2}, Lorg/snmp4j/smi/OID;->leftMostCompare(ILorg/snmp4j/smi/OID;)I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/OID;->get(I)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static getTrapOID(Lorg/snmp4j/smi/OID;II)Lorg/snmp4j/smi/OID;
    .locals 1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    new-instance p0, Lorg/snmp4j/smi/OID;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTraps:Lorg/snmp4j/smi/OID;

    invoke-direct {p0, p2}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OID;->append(I)Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lorg/snmp4j/smi/OID;->append(I)Lorg/snmp4j/smi/OID;

    invoke-virtual {p1, p2}, Lorg/snmp4j/smi/OID;->append(I)Lorg/snmp4j/smi/OID;

    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method public static mpErrorMessage(I)Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->MP_ERROR_MESSAGES:[[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    aget-object v7, v6, v4

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 p0, 0x1

    aget-object p0, v6, p0

    return-object p0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->USM_ERROR_MESSAGES:[[Ljava/lang/String;

    invoke-static {p0, v0}, Lorg/snmp4j/mp/SnmpConstants;->errorMessage(I[[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->MD_ERROR_MESSAGES:[[Ljava/lang/String;

    invoke-static {p0, v0}, Lorg/snmp4j/mp/SnmpConstants;->errorMessage(I[[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public static usmErrorMessage(I)Ljava/lang/String;
    .locals 2

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->USM_ERROR_MESSAGES:[[Ljava/lang/String;

    invoke-static {p0, v0}, Lorg/snmp4j/mp/SnmpConstants;->errorMessage(I[[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
