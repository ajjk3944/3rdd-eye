.class final Lrf/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/j;->h(Landroidx/compose/ui/e;Lrf/f;JLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrf/f;


# direct methods
.method constructor <init>(Lrf/f;)V
    .locals 0

    iput-object p1, p0, Lrf/j$d;->a:Lrf/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v1, p1

    check-cast v1, Lz/f;

    move-object v2, p2

    check-cast v2, LA/B;

    check-cast p3, LY0/h;

    invoke-virtual {p3}, LY0/h;->s()F

    move-result v3

    check-cast p4, Lm0/v0;

    invoke-virtual {p4}, Lm0/v0;->u()J

    move-result-wide v4

    move-object v6, p5

    check-cast v6, LT/l;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lrf/j$d;->a(Lz/f;LA/B;FJLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(Lz/f;LA/B;FJLT/l;I)V
    .locals 12

    move-object/from16 v9, p6

    move/from16 v0, p7

    const-string v1, "$this$BaseNetworkTopology"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$unused$var$"

    move-object v2, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 v1, v0, 0x2001

    const/16 v2, 0x2000

    if-ne v1, v2, :cond_1

    invoke-interface/range {p6 .. p6}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p6 .. p6}, LT/l;->C()V

    move-object v10, p0

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous> (TeleportTunnelNetworkTopology.kt:118)"

    const v3, 0x4fe96c06

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v1, 0x40

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->l(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->e()Lf0/c;

    move-result-object v1

    move-object v10, p0

    iget-object v2, v10, Lrf/j$d;->a:Lrf/f;

    const/4 v4, 0x0

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {v9, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p6 .. p6}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v9, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p6 .. p6}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p6 .. p6}, LT/l;->u()V

    invoke-interface/range {p6 .. p6}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v9, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p6 .. p6}, LT/l;->I()V

    :goto_1
    invoke-static/range {p6 .. p6}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v8, v1, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v8, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v8, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v2}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/ui/teleport/y$a;

    if-nez v1, :cond_9

    instance-of v1, v0, Lcom/ui/wifiman/ui/teleport/y$b;

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    instance-of v0, v0, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz v0, :cond_8

    move v0, v4

    goto :goto_3

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    :goto_2
    move v0, v3

    :goto_3
    new-instance v1, Lrf/j$d$a;

    invoke-direct {v1, v2}, Lrf/j$d$a;-><init>(Lrf/f;)V

    const/16 v2, 0x36

    const v4, 0x5b0f90e4

    invoke-static {v4, v3, v1, v9, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/high16 v7, 0x30000

    const/16 v8, 0x1e

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v8}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p6 .. p6}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    return-void
.end method
