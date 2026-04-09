.class final Lcom/ui/wifiman/ui/component/network/X$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X$d;->b(LA/c;FLcom/ui/wifiman/ui/component/network/M;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/X$d$a;->a:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/component/network/M;LT/l;I)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:199)"

    const v2, -0x58a87946

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-virtual {p1}, Lcom/ui/wifiman/ui/component/network/M;->d()Lcom/ui/wifiman/ui/component/network/K;

    move-result-object p3

    instance-of v0, p3, Lcom/ui/wifiman/ui/component/network/K$a;

    if-eqz v0, :cond_5

    const p3, 0x2c42ebe8    # 2.7700012E-12f

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/component/network/M;->d()Lcom/ui/wifiman/ui/component/network/K;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lcom/ui/wifiman/ui/component/network/K$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/component/network/M;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/X$d$a;->a:Lmh/l;

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Lcom/ui/wifiman/ui/component/network/X;->v(Landroidx/compose/ui/e;Ljava/lang/String;Lcom/ui/wifiman/ui/component/network/K$a;Lmh/l;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    instance-of p3, p3, Lcom/ui/wifiman/ui/component/network/K$b;

    if-eqz p3, :cond_7

    const p3, -0x40a2d4de

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/component/network/M;->d()Lcom/ui/wifiman/ui/component/network/K;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/ui/component/network/K$b;

    const/4 v0, 0x6

    invoke-static {p3, p1, p2, v0}, Lcom/ui/wifiman/ui/component/network/X;->w(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/K$b;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void

    :cond_7
    const p1, -0x40a30c00

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/component/network/M;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/X$d$a;->a(Lcom/ui/wifiman/ui/component/network/M;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
