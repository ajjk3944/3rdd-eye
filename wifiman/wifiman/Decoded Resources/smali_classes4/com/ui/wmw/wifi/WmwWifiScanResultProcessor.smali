.class public abstract Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->a:Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    return-void
.end method


# virtual methods
.method protected final c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->a:Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    return-object v0
.end method
