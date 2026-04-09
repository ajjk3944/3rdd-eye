.class Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PingRunnable"
.end annotation


# static fields
.field private static final methodName:Ljava/lang/String; = "PingTask.run"


# instance fields
.field final synthetic this$0:Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;


# direct methods
.method private constructor <init>(Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;->this$0:Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;-><init>(Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "MQTT Ping: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;->this$0:Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;

    invoke-static {v3}, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;->access$0(Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;->this$0:Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;

    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;->access$1(Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v1

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;->access$2()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string/jumbo v4, "PingTask.run"

    const-string v5, "660"

    invoke-interface {v1, v2, v4, v5, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender$PingRunnable;->this$0:Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;

    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;->access$3(Lorg/eclipse/paho/client/mqttv3/ScheduledExecutorPingSender;)Lkj/a;

    move-result-object v1

    invoke-virtual {v1}, Lkj/a;->n()Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void
.end method
