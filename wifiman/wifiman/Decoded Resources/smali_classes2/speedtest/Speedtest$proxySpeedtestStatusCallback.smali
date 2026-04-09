.class final Lspeedtest/Speedtest$proxySpeedtestStatusCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/Seq$Proxy;
.implements Lspeedtest/SpeedtestStatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lspeedtest/Speedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "proxySpeedtestStatusCallback"
.end annotation


# instance fields
.field private final refnum:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/Speedtest$proxySpeedtestStatusCallback;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method


# virtual methods
.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/Speedtest$proxySpeedtestStatusCallback;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/Speedtest$proxySpeedtestStatusCallback;->refnum:I

    return v0
.end method

.method public native onChanged(JJJJLspeedtest/SpeedtestError;)V
.end method
