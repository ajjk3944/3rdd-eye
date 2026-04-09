.class public final synthetic Ltb/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/RTCStatsCollectorCallback;


# instance fields
.field public final synthetic a:Ltb/N;


# direct methods
.method public synthetic constructor <init>(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/F;->a:Ltb/N;

    return-void
.end method


# virtual methods
.method public final onStatsDelivered(Lorg/webrtc/RTCStatsReport;)V
    .locals 1

    iget-object v0, p0, Ltb/F;->a:Ltb/N;

    invoke-static {v0, p1}, Ltb/N;->j(Ltb/N;Lorg/webrtc/RTCStatsReport;)V

    return-void
.end method
