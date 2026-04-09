.class public Lorg/snmp4j/util/DefaultTimerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TimerFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createTimer()Lorg/snmp4j/util/CommonTimer;
    .locals 1

    new-instance v0, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;

    invoke-direct {v0, p0}, Lorg/snmp4j/util/DefaultTimerFactory$TimerAdapter;-><init>(Lorg/snmp4j/util/DefaultTimerFactory;)V

    return-object v0
.end method
