.class public Lorg/snmp4j/tools/console/LogControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/tools/console/LogControl$LoggerListListener;
    }
.end annotation


# static fields
.field private static final COMMANDS:[[Ljava/lang/String;

.field private static final COMMAND_PARAMETER:Ljava/lang/String; = "#command[s<(set|list)>] +following[s] .."

.field private static final OPTIONS:Ljava/lang/String; = "+a[s{=MD5}<(MD5|SHA)>] +A[s] +b[i{=0}] -c[s{=public}] -bc[i{=0}] +u[s{securityName}] -t[l{timeout=5000}] -r[i{retries=0}] +l[o<\\n\\n[:\\n\\n]*>] +e[o<\\n\\n[:\\n\\n]*>] +E[o<\\n\\n[:\\n\\n]*>] +n[s] +Y[s] +y[s<(DES|3DES|AES|AES128|AES192|AES256)>] -v[s{version=3}<(1|2c|3)>] "

.field public static final SNMP4J_LOGGER_OIDS:[Lorg/snmp4j/smi/OID;


# instance fields
.field private parameters:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/snmp4j/smi/OID;

    const-string v1, "1.3.6.1.4.1.4976.10.1.1.1.1.2.2.1.3"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    new-instance v1, Lorg/snmp4j/smi/OID;

    const-string v2, "1.3.6.1.4.1.4976.10.1.1.1.1.2.2.1.4"

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    new-instance v2, Lorg/snmp4j/smi/OID;

    const-string v3, "1.3.6.1.4.1.4976.10.1.1.1.1.2.2.1.6"

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    filled-new-array {v0, v1, v2}, [Lorg/snmp4j/smi/OID;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/tools/console/LogControl;->SNMP4J_LOGGER_OIDS:[Lorg/snmp4j/smi/OID;

    const-string v0, "#command[s<list>] #address[s<(udp|tcp):.*[/[0-9]+]?>] +filter[s]"

    const-string v1, "list"

    const-string v2, "+a[s{=MD5}<(MD5|SHA)>] +A[s] +b[i{=0}] -c[s{=public}] -bc[i{=0}] +u[s{securityName}] -t[l{timeout=5000}] -r[i{retries=0}] +l[o<\\n\\n[:\\n\\n]*>] +e[o<\\n\\n[:\\n\\n]*>] +E[o<\\n\\n[:\\n\\n]*>] +n[s] +Y[s] +y[s<(DES|3DES|AES|AES128|AES192|AES256)>] -v[s{version=3}<(1|2c|3)>] "

    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "set"

    const-string v3, "#command[s<set>] #address[s<(udp|tcp):.*[/[0-9]+]?>] #logger[s] #level[s<(NONE|OFF|ALL|TRACE|DEBUG|INFO|WARN|ERROR|FATAL)>]"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "#command[s<help>] +subject[s<list|set>]"

    const-string v4, "help"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/tools/console/LogControl;->COMMANDS:[[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    return-void
.end method

.method private declared-synchronized listLoggers(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/util/PDUFactory;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    new-instance v0, Lorg/snmp4j/util/TableUtils;

    invoke-direct {v0, p1, p3}, Lorg/snmp4j/util/TableUtils;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    iget-object p1, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    const-string p3, "filter"

    const/4 v1, 0x0

    invoke-static {p1, p3, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance p3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p3, p1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Lorg/snmp4j/smi/OctetString;->toSubIndex(Z)Lorg/snmp4j/smi/OID;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->nextPeer()Lorg/snmp4j/smi/OID;

    move-result-object p3

    move-object v5, p1

    move-object v6, p3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    move-object v5, p1

    move-object v6, v5

    :goto_0
    new-instance p1, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;

    invoke-direct {p1, p0}, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;-><init>(Lorg/snmp4j/tools/console/LogControl;)V

    sget-object v2, Lorg/snmp4j/tools/console/LogControl;->SNMP4J_LOGGER_OIDS:[Lorg/snmp4j/smi/OID;

    move-object v1, p2

    move-object v3, p1

    move-object v4, p0

    invoke-virtual/range {v0 .. v6}, Lorg/snmp4j/util/TableUtils;->getTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V

    :catch_0
    :goto_1
    invoke-virtual {p1}, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;->isFinished()Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static main([Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "+a[s{=MD5}<(MD5|SHA)>] +A[s] +b[i{=0}] -c[s{=public}] -bc[i{=0}] +u[s{securityName}] -t[l{timeout=5000}] -r[i{retries=0}] +l[o<\\n\\n[:\\n\\n]*>] +e[o<\\n\\n[:\\n\\n]*>] +E[o<\\n\\n[:\\n\\n]*>] +n[s] +Y[s] +y[s<(DES|3DES|AES|AES128|AES192|AES256)>] -v[s{version=3}<(1|2c|3)>] "

    sget-object v2, Lorg/snmp4j/tools/console/LogControl;->COMMANDS:[[Ljava/lang/String;

    invoke-static {p0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->selectCommand([Ljava/lang/String;Ljava/lang/String;[[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printUsage()V

    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v3, Lorg/snmp4j/util/ArgumentParser;

    aget-object v4, v1, v0

    aget-object v1, v1, v2

    invoke-direct {v3, v4, v1}, Lorg/snmp4j/util/ArgumentParser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lorg/snmp4j/util/ArgumentParser;->parse([Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    new-instance v1, Lorg/snmp4j/tools/console/LogControl;

    invoke-direct {v1, p0}, Lorg/snmp4j/tools/console/LogControl;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lorg/snmp4j/tools/console/LogControl;->run()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :goto_2
    return-void
.end method

.method private static printHelpUsage()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " help [COMMAND]                  Print usage help for the specified command."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static printListUsage()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " list <ADDRESS> [FILTER]         List logger configuration for the agent at"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 ADDRESS (e.g. \'udp:localhost/161\') with"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 for all logger names that contain start with"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 the optional parameter string FILTER."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static printOptions()V
    .locals 3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "valid <OPTIONS> are:"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "  -a  authProtocol      Sets the authentication protocol used to"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                        authenticate SNMPv3 messages. Valid values are"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                        MD5 and SHA."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "  -A  authPassphrase    Sets the authentication pass phrase for authenticated"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                        SNMPv3 messages."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -bc bootCounter       The boot counter to be used (default is 0)"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -c  community         The SNMPv1/v2c community to use (default is \'public\')"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -e  engineID          Sets the authoritative engine ID of the command"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        responder used for SNMPv3 request messages. If not"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        supplied, the engine ID will be discovered."

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -E  contextEngineID   Sets the context engine ID used for the SNMPv3 scoped"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        PDU. The authoritative engine ID will be used for the"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        context engine ID, if the latter is not specified."

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -l  localEngineID     Sets the local engine ID. This option can be"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        used to avoid engine ID clashes through duplicate IDs"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        leading to usmStatsNotInTimeWindows reports."

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -n  contextName       Sets the target context name for SNMPv3 messages. "

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        Default is the empty string."

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -u  securityName      The SNMPv3 security name"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -t  timeout           SNMP timeout in milli-seconds (default is 5000)"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -r  retries           SNMP retries (default is 0) "

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -v  1|2c|3            The SNMP version (one of 1, 2c, or 3)"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -y  privacyProtocol   Sets the privacy protocol to be used to encrypt"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        SNMPv3 messages. Valid values are DES, AES (AES128),"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "                        AES192, AES256, and 3DES(DESEDE)."

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v2, "  -Y  privacyPassphrase Sets the privacy pass phrase for encrypted"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static printSetUsage()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " set <ADDRESS> <LOGGER> <LEVEL>  Set a LOGGER to a new LEVEL at agent"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 ADDRESS (e.g. \'udp:localhost/161\')."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 LOGGER is a fully qualified logger name and"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 LEVEL is one of NONE, OFF, ALL, TRACE, DEBUG,"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "                                 INFO, WARN, ERROR, or FATAL."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static printUsage()V
    .locals 0

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printUsageHeader()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printHelpUsage()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printListUsage()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printSetUsage()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printOptions()V

    return-void
.end method

.method private static printUsageHeader()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "LogControl <OPTIONS> <COMMAND> <PARAMETERS>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "where <COMMAND> is one of: "

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private setLevel(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/util/PDUFactory;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p3, p2}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v3

    new-instance v4, Lorg/snmp4j/smi/OID;

    sget-object p3, Lorg/snmp4j/tools/console/LogControl;->SNMP4J_LOGGER_OIDS:[Lorg/snmp4j/smi/OID;

    const/4 v0, 0x0

    aget-object v1, p3, v0

    invoke-direct {v4, v1}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    const-string v2, "logger"

    invoke-static {v1, v2, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1, v5}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lorg/snmp4j/smi/OctetString;->toSubIndex(Z)Lorg/snmp4j/smi/OID;

    move-result-object v6

    iget-object v1, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    const-string v2, "level"

    invoke-static {v1, v2, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v4, v6}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    invoke-static {v7}, Lorg/snmp4j/log/LogLevel;->toLevel(Ljava/lang/String;)Lorg/snmp4j/log/LogLevel;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/log/LogLevel;->getLevel()I

    move-result v0

    new-instance v1, Lorg/snmp4j/smi/VariableBinding;

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v0}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-direct {v1, v4, v2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v3, v1}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    invoke-virtual {p1, v3, p2}, Lorg/snmp4j/Snmp;->set(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object v8

    invoke-virtual {v8}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v8}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v1

    if-eqz v1, :cond_2

    const/16 v2, 0xb

    if-eq v1, v2, :cond_0

    const/16 v2, 0x12

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lorg/snmp4j/PDU;->clear()V

    new-instance v1, Lorg/snmp4j/smi/OID;

    const/4 v2, 0x2

    aget-object p3, p3, v2

    invoke-direct {v1, p3}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v6}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    new-instance p3, Lorg/snmp4j/smi/VariableBinding;

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v0}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-direct {p3, v4, v2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v3, p3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    new-instance p3, Lorg/snmp4j/smi/VariableBinding;

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-direct {p3, v1, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v3, p3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    invoke-virtual {p1, v3, p2}, Lorg/snmp4j/Snmp;->set(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object v8

    invoke-virtual {v8}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {v8}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p3

    invoke-virtual {p3}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p3

    if-nez p3, :cond_1

    sget-object p3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Logger created successfully."

    invoke-virtual {p3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Lorg/snmp4j/tools/console/LogControl;->verifyLoggerModification(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Lorg/snmp4j/smi/OID;Ljava/lang/String;Lorg/snmp4j/smi/OID;Ljava/lang/String;Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Lorg/snmp4j/tools/console/LogControl;->verifyLoggerModification(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Lorg/snmp4j/smi/OID;Ljava/lang/String;Lorg/snmp4j/smi/OID;Ljava/lang/String;Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_0

    :cond_3
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, "SET request timed out."

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private verifyLoggerModification(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Lorg/snmp4j/smi/OID;Ljava/lang/String;Lorg/snmp4j/smi/OID;Ljava/lang/String;Lorg/snmp4j/event/ResponseEvent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3}, Lorg/snmp4j/PDU;->clear()V

    new-instance p8, Lorg/snmp4j/smi/OID;

    sget-object v0, Lorg/snmp4j/tools/console/LogControl;->SNMP4J_LOGGER_OIDS:[Lorg/snmp4j/smi/OID;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-direct {p8, v0}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p8, p6}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    new-instance p6, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {p6, p4}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, p6}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    new-instance p4, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {p4, p8}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, p4}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    invoke-virtual {p1, p3, p2}, Lorg/snmp4j/Snmp;->get(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p4

    invoke-virtual {p4}, Lorg/snmp4j/smi/VariableBinding;->isException()Z

    move-result p4

    if-nez p4, :cond_0

    invoke-virtual {p2, v1}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p4

    invoke-virtual {p4}, Lorg/snmp4j/smi/VariableBinding;->isException()Z

    move-result p4

    if-nez p4, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p1

    new-instance p2, Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1, p3}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p3

    invoke-virtual {p3}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object p3

    invoke-interface {p3}, Lorg/snmp4j/smi/Variable;->toInt()I

    move-result p3

    invoke-direct {p2, p3}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    new-instance p3, Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1, v1}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/smi/Variable;->toInt()I

    move-result p1

    invoke-direct {p3, p1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p6, "Set logger \'"

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, "\' level to "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, ". Now levels are "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " (configured) and "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " (effective)."

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p3, "SET request successfully sent, but verfication failed:"

    invoke-virtual {p1, p3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    if-nez p2, :cond_1

    const-string p2, "GET request timed out."

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p2}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p2

    invoke-static {p2}, Lorg/snmp4j/PDU;->toErrorStatusText(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lorg/snmp4j/PDU;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    iget-object v0, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    const-string v1, "command"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "help"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "set"

    const-string v4, "list"

    if-eqz v1, :cond_2

    iget-object v0, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    const-string v1, "subject"

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printUsage()V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printUsageHeader()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printListUsage()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printOptions()V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printUsageHeader()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printListUsage()V

    invoke-static {}, Lorg/snmp4j/tools/console/LogControl;->printOptions()V

    goto/16 :goto_1

    :cond_2
    :try_start_0
    new-instance v1, Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    new-instance v5, Lorg/snmp4j/smi/UdpAddress;

    const-string v6, "0.0.0.0/0"

    invoke-direct {v5, v6}, Lorg/snmp4j/smi/UdpAddress;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v5}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;-><init>(Lorg/snmp4j/smi/UdpAddress;)V

    new-instance v5, Lorg/snmp4j/MessageDispatcherImpl;

    invoke-direct {v5}, Lorg/snmp4j/MessageDispatcherImpl;-><init>()V

    new-instance v6, Lorg/snmp4j/Snmp;

    invoke-direct {v6, v5, v1}, Lorg/snmp4j/Snmp;-><init>(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/TransportMapping;)V

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/security/SecurityProtocols;->addDefaultProtocols()Lorg/snmp4j/security/SecurityProtocols;

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    new-instance v7, Lorg/snmp4j/smi/OctetString;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "LogControl"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Lorg/snmp4j/mp/MPv3;->createLocalEngineID(Lorg/snmp4j/smi/OctetString;)[B

    move-result-object v7

    invoke-direct {v1, v7}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    new-instance v7, Lorg/snmp4j/mp/MPv1;

    invoke-direct {v7}, Lorg/snmp4j/mp/MPv1;-><init>()V

    invoke-interface {v5, v7}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    new-instance v7, Lorg/snmp4j/mp/MPv2c;

    invoke-direct {v7}, Lorg/snmp4j/mp/MPv2c;-><init>()V

    invoke-interface {v5, v7}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    new-instance v7, Lorg/snmp4j/security/USM;

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v8

    invoke-direct {v7, v8, v1, v2}, Lorg/snmp4j/security/USM;-><init>(Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/smi/OctetString;I)V

    new-instance v1, Lorg/snmp4j/mp/MPv3;

    invoke-direct {v1, v7}, Lorg/snmp4j/mp/MPv3;-><init>(Lorg/snmp4j/security/USM;)V

    invoke-interface {v5, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    new-instance v1, Lorg/snmp4j/util/SnmpConfigurator;

    invoke-direct {v1}, Lorg/snmp4j/util/SnmpConfigurator;-><init>()V

    iget-object v2, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    invoke-virtual {v1, v6, v2}, Lorg/snmp4j/util/SnmpConfigurator;->configure(Lorg/snmp4j/Snmp;Ljava/util/Map;)V

    invoke-virtual {v6}, Lorg/snmp4j/Snmp;->listen()V

    iget-object v2, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    invoke-virtual {v1, v2}, Lorg/snmp4j/util/SnmpConfigurator;->getTarget(Ljava/util/Map;)Lorg/snmp4j/Target;

    move-result-object v2

    iget-object v5, p0, Lorg/snmp4j/tools/console/LogControl;->parameters:Ljava/util/Map;

    invoke-virtual {v1, v5}, Lorg/snmp4j/util/SnmpConfigurator;->getPDUFactory(Ljava/util/Map;)Lorg/snmp4j/util/PDUFactory;

    move-result-object v1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v6, v2, v1}, Lorg/snmp4j/tools/console/LogControl;->listLoggers(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/util/PDUFactory;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, v6, v2, v1}, Lorg/snmp4j/tools/console/LogControl;->setLevel(Lorg/snmp4j/Snmp;Lorg/snmp4j/Target;Lorg/snmp4j/util/PDUFactory;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method
