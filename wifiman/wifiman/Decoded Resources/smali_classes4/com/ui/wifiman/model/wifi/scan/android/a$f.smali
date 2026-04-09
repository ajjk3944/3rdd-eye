.class final Lcom/ui/wifiman/model/wifi/scan/android/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$f;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "Scanning DISABLED"

    const-string v0, "WifiScanner"

    invoke-static {p1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$f;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-static {p1}, Lcom/ui/wifiman/model/wifi/scan/android/a;->j(Lcom/ui/wifiman/model/wifi/scan/android/a;)LFg/a;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$f;->a(Lhg/c;)V

    return-void
.end method
