.class final LE8/r$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;->D0(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LT7/c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lmf/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

.field final synthetic b:LE8/r;

.field final synthetic c:LT7/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LE8/r;LT7/c;)V
    .locals 0

    iput-object p1, p0, LE8/r$l;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    iput-object p2, p0, LE8/r$l;->b:LE8/r;

    iput-object p3, p0, LE8/r$l;->c:LT7/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 7

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4f5fc4a1

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.speedtest.SpeedtestInternetServerPickerVM.toServerItemModel.<anonymous> (SpeedtestInternetServerPickerVM.kt:89)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE8/r$l;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    iget-object v1, p0, LE8/r$l;->b:LE8/r;

    iget-object v2, p0, LE8/r$l;->c:LT7/c;

    new-instance v3, LL0/d$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v6, v4, v5}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LL0/d$a;->e(Ljava/lang/CharSequence;)LL0/d$a;

    const-string v4, ", "

    invoke-virtual {v3, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LL0/d$a;->e(Ljava/lang/CharSequence;)LL0/d$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->k()Ljava/lang/Float;

    move-result-object v0

    const v4, -0x411307bf

    invoke-interface {p2, v4}, LT/l;->U(I)V

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const-string v4, " - "

    invoke-virtual {v3, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-static {v1, v0, v2}, LE8/r;->s0(LE8/r;FLT7/c;)Ls9/d;

    move-result-object v0

    and-int/lit8 p3, p3, 0xe

    invoke-virtual {v0, p1, p2, p3}, Ls9/d;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, LL0/d$a;->i(Ljava/lang/String;)V

    :goto_0
    invoke-interface {p2}, LT/l;->J()V

    invoke-virtual {v3}, LL0/d$a;->p()LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LE8/r$l;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
