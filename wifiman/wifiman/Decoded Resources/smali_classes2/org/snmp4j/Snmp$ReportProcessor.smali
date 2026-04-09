.class Lorg/snmp4j/Snmp$ReportProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/Snmp$ReportHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/Snmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ReportProcessor"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/snmp4j/Snmp;


# direct methods
.method constructor <init>(Lorg/snmp4j/Snmp;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/Snmp$ReportProcessor;->this$0:Lorg/snmp4j/Snmp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected checkReport(Lorg/snmp4j/CommandResponderEvent;Lorg/snmp4j/PDU;Lorg/snmp4j/Snmp$PendingRequest;)Lorg/snmp4j/smi/VariableBinding;
    .locals 3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmatched report PDU received from "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lorg/snmp4j/PDU;->size()I

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal report PDU received from "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " missing report variable binding"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return-object v0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p2

    if-nez p2, :cond_2

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Received illegal REPORT PDU from "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return-object v0

    :cond_2
    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityModel()I

    move-result v1

    iget-object v2, p3, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v2}, Lorg/snmp4j/Target;->getSecurityModel()I

    move-result v2

    if-eq v1, v2, :cond_3

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RFC3412 \u00a77.2.11.b: Received REPORT PDU with different security model than cached one: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    return-object v0

    :cond_3
    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityLevel()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object v1

    sget-object v2, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    if-eq v1, v2, :cond_4

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityLevel()I

    move-result v1

    iget-object p3, p3, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {p3}, Lorg/snmp4j/Target;->getSecurityLevel()I

    move-result p3

    if-eq v1, p3, :cond_4

    sget-object p3, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownUserNames:Lorg/snmp4j/smi/OID;

    invoke-virtual {p2}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {p3, v1}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    sget-object p3, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

    invoke-virtual {p2}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {p3, v1}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RFC3412 \u00a77.2.11.b:Received REPORT PDU with security level noAuthNoPriv from \'"

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'. Ignoring it, because report strategy is set to "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    return-object v0

    :cond_4
    return-object p2
.end method

.method public processReport(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/CommandResponderEvent;)V
    .locals 7

    invoke-virtual {p2}, Lorg/snmp4j/CommandResponderEvent;->getPDU()Lorg/snmp4j/PDU;

    move-result-object v4

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Searching pending request with handle"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object v0, p0, Lorg/snmp4j/Snmp$ReportProcessor;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/Snmp$PendingRequest;

    invoke-virtual {p0, p2, v4, v0}, Lorg/snmp4j/Snmp$ReportProcessor;->checkReport(Lorg/snmp4j/CommandResponderEvent;Lorg/snmp4j/PDU;Lorg/snmp4j/Snmp$PendingRequest;)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-static {v0}, Lorg/snmp4j/Snmp$PendingRequest;->access$700(Lorg/snmp4j/Snmp$PendingRequest;)I

    move-result v2

    invoke-static {v0}, Lorg/snmp4j/Snmp$PendingRequest;->access$000(Lorg/snmp4j/Snmp$PendingRequest;)I

    move-result v3

    if-ge v2, v3, :cond_4

    invoke-static {v0}, Lorg/snmp4j/Snmp$PendingRequest;->access$700(Lorg/snmp4j/Snmp$PendingRequest;)I

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsNotInTimeWindows:Lorg/snmp4j/smi/OID;

    invoke-virtual {v2, v1}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_2
    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

    invoke-virtual {v2, v1}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsNotInTimeWindows:Lorg/snmp4j/smi/OID;

    invoke-virtual {v2, v1}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lorg/snmp4j/Snmp$PendingRequest;->access$708(Lorg/snmp4j/Snmp$PendingRequest;)I

    :goto_0
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    const-string v1, "Send new request after report."

    invoke-interface {p1, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {v0}, Lorg/snmp4j/Snmp$PendingRequest;->access$708(Lorg/snmp4j/Snmp$PendingRequest;)I

    :try_start_0
    iget-object p1, p0, Lorg/snmp4j/Snmp$ReportProcessor;->this$0:Lorg/snmp4j/Snmp;

    iget-object v1, v0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v2, v0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-virtual {p2}, Lorg/snmp4j/CommandResponderEvent;->getTransportMapping()Lorg/snmp4j/TransportMapping;

    move-result-object p2

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, p2, v3}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/snmp4j/Snmp$PendingRequest;->access$402(Lorg/snmp4j/Snmp$PendingRequest;Lorg/snmp4j/mp/PduHandle;)Lorg/snmp4j/mp/PduHandle;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p1

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to send message to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return-void

    :cond_4
    :goto_1
    iget-object v6, v0, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    iget-object v3, v0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v5, v0, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    move-result v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lorg/snmp4j/Snmp$ReportProcessor;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_5

    if-eqz v6, :cond_5

    new-instance p1, Lorg/snmp4j/event/ResponseEvent;

    iget-object v1, p0, Lorg/snmp4j/Snmp$ReportProcessor;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {p2}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object v2

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;)V

    invoke-interface {v6, p1}, Lorg/snmp4j/event/ResponseListener;->onResponse(Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_2

    :cond_5
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Received late report from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " with request ID "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
