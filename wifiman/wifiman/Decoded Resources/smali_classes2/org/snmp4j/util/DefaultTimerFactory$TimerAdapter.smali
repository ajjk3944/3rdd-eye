.class Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/CommonTimer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/DefaultTimerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TimerAdapter"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/snmp4j/util/DefaultTimerFactory;

.field private timer:Ljava/util/Timer;


# direct methods
.method constructor <init>(Lorg/snmp4j/util/DefaultTimerFactory;)V
    .locals 1

    iput-object p1, p0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;->this$0:Lorg/snmp4j/util/DefaultTimerFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/Timer;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/Timer;-><init>(Z)V

    iput-object p1, p0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;->timer:Ljava/util/Timer;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

.method public schedule(Ljava/util/TimerTask;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;->timer:Ljava/util/Timer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public schedule(Ljava/util/TimerTask;JJ)V
    .locals 6

    .line 3
    iget-object v0, p0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;->timer:Ljava/util/Timer;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public schedule(Ljava/util/TimerTask;Ljava/util/Date;J)V
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;->timer:Ljava/util/Timer;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;J)V

    return-void
.end method
