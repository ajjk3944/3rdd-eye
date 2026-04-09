.class public Lorg/snmp4j/log/ConsoleLogFactory;
.super Lorg/snmp4j/log/LogFactory;
.source "SourceFile"


# instance fields
.field private logAdapter:Lorg/snmp4j/log/ConsoleLogAdapter;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/log/LogFactory;-><init>()V

    new-instance v0, Lorg/snmp4j/log/ConsoleLogAdapter;

    invoke-direct {v0}, Lorg/snmp4j/log/ConsoleLogAdapter;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/log/ConsoleLogFactory;->logAdapter:Lorg/snmp4j/log/ConsoleLogAdapter;

    return-void
.end method


# virtual methods
.method protected createLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/snmp4j/log/ConsoleLogFactory;->logAdapter:Lorg/snmp4j/log/ConsoleLogAdapter;

    return-object p1
.end method

.method protected createLogger(Ljava/lang/String;)Lorg/snmp4j/log/LogAdapter;
    .locals 0

    .line 2
    iget-object p1, p0, Lorg/snmp4j/log/ConsoleLogFactory;->logAdapter:Lorg/snmp4j/log/ConsoleLogAdapter;

    return-object p1
.end method

.method public getRootLogger()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/ConsoleLogFactory;->logAdapter:Lorg/snmp4j/log/ConsoleLogAdapter;

    return-object v0
.end method
