.class Lorg/snmp4j/Snmp$SyncResponseListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/event/ResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/Snmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SyncResponseListener"
.end annotation


# instance fields
.field private response:Lorg/snmp4j/event/ResponseEvent;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/snmp4j/Snmp$SyncResponseListener;->response:Lorg/snmp4j/event/ResponseEvent;

    return-void
.end method

.method static synthetic access$200(Lorg/snmp4j/Snmp$SyncResponseListener;)Lorg/snmp4j/event/ResponseEvent;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp$SyncResponseListener;->response:Lorg/snmp4j/event/ResponseEvent;

    return-object p0
.end method

.method static synthetic access$202(Lorg/snmp4j/Snmp$SyncResponseListener;Lorg/snmp4j/event/ResponseEvent;)Lorg/snmp4j/event/ResponseEvent;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/Snmp$SyncResponseListener;->response:Lorg/snmp4j/event/ResponseEvent;

    return-object p1
.end method


# virtual methods
.method public getResponse()Lorg/snmp4j/event/ResponseEvent;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp$SyncResponseListener;->response:Lorg/snmp4j/event/ResponseEvent;

    return-object v0
.end method

.method public declared-synchronized onResponse(Lorg/snmp4j/event/ResponseEvent;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lorg/snmp4j/Snmp$SyncResponseListener;->response:Lorg/snmp4j/event/ResponseEvent;

    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
