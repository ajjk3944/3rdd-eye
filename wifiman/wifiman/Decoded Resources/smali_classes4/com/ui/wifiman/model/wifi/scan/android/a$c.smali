.class final Lcom/ui/wifiman/model/wifi/scan/android/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/android/a;-><init>(Landroid/net/wifi/WifiManager;Ltc/a;Lcom/ui/wifiman/model/android/permissions/d;Lfe/n;Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wifi/scan/android/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$c;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/util/List;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$c;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v1}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v1

    invoke-interface {v1}, Lcom/ubnt/usurvey/a$b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/usurvey/a;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {p1}, Lcom/ui/wifiman/model/wifi/scan/android/a;->h(Lcom/ui/wifiman/model/wifi/scan/android/a;)Landroid/net/wifi/WifiManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/wifi/ScanResult;

    :try_start_0
    new-instance v5, Lcom/ui/wifiman/model/wifi/scan/android/a$b;

    invoke-static {p1}, Lcom/ui/wifiman/model/wifi/scan/android/a;->i(Lcom/ui/wifiman/model/wifi/scan/android/a;)Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;

    move-result-object v6

    invoke-interface {v6, v4}, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;->a(Landroid/net/wifi/ScanResult;)Lme/k;

    move-result-object v4

    invoke-direct {v5, v1, v2, v4}, Lcom/ui/wifiman/model/wifi/scan/android/a$b;-><init>(JLme/k;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v5, "Failed to process Wifi ScanResult"

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static {v5, v4, v7, v6, v7}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$c;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
