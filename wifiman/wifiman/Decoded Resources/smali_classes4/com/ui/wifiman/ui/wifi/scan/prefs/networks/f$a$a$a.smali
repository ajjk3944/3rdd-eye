.class final Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a;->a:Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 6

    const-string v0, "$this$UiSettingsCard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.scan.prefs.networks.WifiScanDisplayPrefsNetworksUi.<anonymous>.<anonymous>.<anonymous> (WifiScanDisplayPrefsNetworksUi.kt:49)"

    const v1, 0x52c81343

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a;->a:Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/d;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/d;->n0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, p3, v0}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LCi/c;

    iget-object p1, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a;->a:Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/d;

    const p3, 0x3b12c3da

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    new-instance v0, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a$a;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v2, v0

    check-cast v2, Lmh/l;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LF9/F;->c(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/f$a$a$a;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
