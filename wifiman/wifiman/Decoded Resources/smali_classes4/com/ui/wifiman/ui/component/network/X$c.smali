.class final Lcom/ui/wifiman/ui/component/network/X$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/N;JJFZLmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/component/network/N;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/component/network/N;LT/q0;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/X$c;->a:Lcom/ui/wifiman/ui/component/network/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/X$c;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)Lcom/ui/wifiman/ui/component/network/q$c;
    .locals 10

    const-string v0, "$this$BaseNetworkTopology"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6efcd51f

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous> (WifimanNetworkTopology.kt:157)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/X$c;->a:Lcom/ui/wifiman/ui/component/network/N;

    and-int/lit8 p3, p3, 0xe

    or-int/lit16 p3, p3, 0x180

    invoke-virtual {v0, p1, v1, p2, p3}, Lcom/ui/wifiman/ui/component/network/q;->f(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/X$c;->b:LT/q0;

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/X$c;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-virtual {v0, p1, v3, p2, p3}, Lcom/ui/wifiman/ui/component/network/q;->g(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)I

    move-result p1

    const p3, 0x411159ba

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, Lcom/ui/wifiman/ui/component/network/X$c;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, v1}, LT/l;->c(Z)Z

    move-result v0

    or-int/2addr p3, v0

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/X$c;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_2
    if-eqz v1, :cond_4

    if-ge p1, v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lcom/ui/wifiman/ui/component/network/N;->h()Ljava/util/List;

    move-result-object p3

    sub-int/2addr p1, v2

    invoke-static {p3, p1}, LZg/v;->b1(Ljava/util/List;I)Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lcom/ui/wifiman/ui/component/network/N;->e(Lcom/ui/wifiman/ui/component/network/N;Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;ILjava/lang/Object;)Lcom/ui/wifiman/ui/component/network/N;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_5
    check-cast v0, Lcom/ui/wifiman/ui/component/network/N;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p2}, LT/l;->J()V

    return-object v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/X$c;->a(Lz/f;LT/l;I)Lcom/ui/wifiman/ui/component/network/q$c;

    move-result-object p1

    return-object p1
.end method
