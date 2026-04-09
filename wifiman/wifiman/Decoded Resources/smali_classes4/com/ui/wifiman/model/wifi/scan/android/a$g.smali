.class final Lcom/ui/wifiman/model/wifi/scan/android/a$g;
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

.field final synthetic b:Lfe/u;


# direct methods
.method constructor <init>(Lfe/n;Lfe/u;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g;->a:Lfe/n;

    iput-object p2, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g;->b:Lfe/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g;->a:Lfe/n;

    const-string v2, "lastScanAt"

    invoke-virtual {p1, v2}, Lfe/n;->f(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    new-instance v2, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g;->b:Lfe/u;

    invoke-direct {v2, v0, v1, v3}, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;-><init>(JLfe/u;)V

    invoke-virtual {p1, v2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$g;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
