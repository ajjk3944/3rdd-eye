.class final Lcom/ui/wifiman/model/wifi/scan/android/a$l;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$l;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$l;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-static {p1}, Lcom/ui/wifiman/model/wifi/scan/android/a;->g(Lcom/ui/wifiman/model/wifi/scan/android/a;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$l;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/wifi/scan/android/a;->f(Lcom/ui/wifiman/model/wifi/scan/android/a;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$l;->a(Ljava/util/Set;)LDj/a;

    move-result-object p1

    return-object p1
.end method
