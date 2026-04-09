.class final Lcom/ui/wifiman/ui/component/network/X$e$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X$e$c;->a(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lcom/ui/wifiman/ui/component/network/X$e$c$a;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:324)"

    const v2, -0x3c275c44

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v0, 0x20

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->e()Lf0/c;

    move-result-object v1

    iget-wide v2, p0, Lcom/ui/wifiman/ui/component/network/X$e$c$a;->a:J

    const/4 v4, 0x0

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {p1, v4}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {p1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {p1, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v1, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v7, v5, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v7, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->z()Ls9/b;

    move-result-object v0

    new-instance v1, Ls9/d$b;

    sget v4, Lm8/c;->n:I

    invoke-direct {v1, v4}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v0, v1}, Ls9/b;->g(Ls9/d;)Ls9/b;

    move-result-object v5

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    const/16 v10, 0x30

    const/4 v11, 0x4

    const/4 v8, 0x0

    move-object v9, p1

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/component/network/X$e$c$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
