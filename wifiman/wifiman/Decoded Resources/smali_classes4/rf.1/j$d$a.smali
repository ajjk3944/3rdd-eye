.class final Lrf/j$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/j$d;->a(Lz/f;LA/B;FJLT/l;I)V
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

    iput-object p1, p0, Lrf/j$d$a;->a:Lrf/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/animation/d;)Lq/i;
    .locals 0

    invoke-static {p0}, Lrf/j$d$a;->c(Landroidx/compose/animation/d;)Lq/i;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/animation/d;)Lq/i;
    .locals 6

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p0, 0xc8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p0, v0, v1, v2, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v1}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object p0

    invoke-static {p0, v4, v5, v1}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    invoke-static {v3, p0}, Landroidx/compose/animation/a;->e(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)Lq/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelNetworkTopology.kt:131)"

    const v3, 0x5b0f90e4

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, Lrf/j$d$a;->a:Lrf/f;

    invoke-virtual {v1}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v1

    const/4 v9, 0x0

    invoke-static {v1, v12, v9}, Lcom/ui/wifiman/ui/teleport/C;->a(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)J

    move-result-wide v1

    const/16 v7, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "conn color"

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v13

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v15, Lrf/d;->a:Lrf/d;

    invoke-virtual {v15}, Lrf/d;->b()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v2

    invoke-static {v1, v2}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v12, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->e()Lma/a$e;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$e;->b()J

    move-result-wide v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    iget-object v11, v0, Lrf/j$d$a;->a:Lrf/f;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v12, v9}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v12, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v12, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_0
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v4, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    invoke-static {v14, v10, v9, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v15}, Lrf/d;->c()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v1, v12, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->g()J

    move-result-wide v6

    const/16 v16, 0xc36

    const/16 v17, 0x30

    const/high16 v1, 0x3f800000    # 1.0f

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    move-object v2, v3

    move-wide v3, v6

    move-wide/from16 v6, v18

    move/from16 v8, v20

    move-object/from16 v9, p2

    move/from16 v10, v16

    move-object/from16 v16, v11

    move/from16 v11, v17

    invoke-static/range {v1 .. v11}, LN/t0;->a(FLandroidx/compose/ui/e;JFJILT/l;II)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x1

    invoke-static {v14, v1, v11, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v3

    instance-of v4, v3, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    instance-of v1, v3, Lcom/ui/wifiman/ui/teleport/y$b;

    if-eqz v1, :cond_6

    invoke-virtual/range {v16 .. v16}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/ui/teleport/y$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/teleport/y$b;->a()F

    move-result v1

    goto :goto_1

    :cond_6
    instance-of v1, v3, Lcom/ui/wifiman/ui/teleport/y$a;

    if-eqz v1, :cond_9

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_1
    invoke-virtual {v15}, Lrf/d;->c()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-interface {v13}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v3

    const/16 v10, 0xc30

    const/16 v14, 0x30

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    move v15, v11

    move v11, v14

    invoke-static/range {v1 .. v11}, LN/t0;->a(FLandroidx/compose/ui/e;JFJILT/l;II)V

    invoke-virtual/range {v16 .. v16}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v1

    invoke-static {v1}, Lrf/j;->k(Lcom/ui/wifiman/ui/teleport/y;)Lrf/A;

    move-result-object v1

    const v2, -0x37deaf7d

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_7

    new-instance v2, Lrf/k;

    invoke-direct {v2}, Lrf/k;-><init>()V

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v3, v2

    check-cast v3, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v2, Lrf/j$d$a$a;

    invoke-direct {v2, v13}, Lrf/j$d$a$a;-><init>(LT/z1;)V

    const/16 v4, 0x36

    const v5, -0x71b6b3ef

    invoke-static {v5, v15, v2, v12, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x186180

    const/16 v10, 0x2a

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-string v5, "conn progress"

    const/4 v6, 0x0

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lrf/j$d$a;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
