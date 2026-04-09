.class public final Lme/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme/r;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/wifi/ScanResult;)Lme/q;
    .locals 1

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lme/E;

    invoke-direct {v0, p1}, Lme/E;-><init>(Landroid/net/wifi/ScanResult;)V

    return-object v0
.end method
