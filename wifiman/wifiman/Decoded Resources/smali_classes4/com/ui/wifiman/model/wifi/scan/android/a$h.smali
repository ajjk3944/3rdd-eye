.class final Lcom/ui/wifiman/model/wifi/scan/android/a$h;
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
.field final synthetic a:Lfe/n;

.field final synthetic b:Lcom/ui/wifiman/model/wifi/scan/android/a;


# direct methods
.method constructor <init>(Lfe/n;Lcom/ui/wifiman/model/wifi/scan/android/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$h;->a:Lfe/n;

    iput-object p2, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$h;->b:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lgg/f;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$h;->b:Lcom/ui/wifiman/model/wifi/scan/android/a;

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/a$h$a;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$h$a;-><init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$h;->a:Lfe/n;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "lastScanAt"

    invoke-virtual {v0, v2, v1}, Lfe/n;->j(Ljava/lang/String;Ljava/lang/Long;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$h;->a(Ljava/lang/Long;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
