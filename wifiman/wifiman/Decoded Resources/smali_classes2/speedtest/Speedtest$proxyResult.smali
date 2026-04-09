.class final Lspeedtest/Speedtest$proxyResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/Seq$Proxy;
.implements Lspeedtest/Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lspeedtest/Speedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "proxyResult"
.end annotation


# instance fields
.field private final refnum:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/Speedtest$proxyResult;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method


# virtual methods
.method public native error()Lspeedtest/SpeedtestError;
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/Speedtest$proxyResult;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/Speedtest$proxyResult;->refnum:I

    return v0
.end method
