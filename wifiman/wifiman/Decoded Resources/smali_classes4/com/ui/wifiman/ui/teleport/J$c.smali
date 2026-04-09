.class final Lcom/ui/wifiman/ui/teleport/J$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/J;->n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/A;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/B;

.field final synthetic c:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;Landroidx/compose/ui/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/J$c;->a:Lcom/ui/wifiman/ui/teleport/A;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/J$c;->b:Lcom/ui/wifiman/ui/teleport/B;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/J$c;->c:Landroidx/compose/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$UiContentCard"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous> (TeleportTunnelUi.kt:68)"

    const v5, -0x7ca0af4

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v13, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-static {v15, v13, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v13, v2, v5, v4}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v2

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v6, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    iget-object v12, v0, Lcom/ui/wifiman/ui/teleport/J$c;->a:Lcom/ui/wifiman/ui/teleport/A;

    iget-object v11, v0, Lcom/ui/wifiman/ui/teleport/J$c;->b:Lcom/ui/wifiman/ui/teleport/B;

    iget-object v10, v0, Lcom/ui/wifiman/ui/teleport/J$c;->c:Landroidx/compose/ui/e;

    const/16 v9, 0x36

    invoke-static {v6, v2, v14, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v8, 0x0

    invoke-static {v14, v8}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v14, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v2, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v4, v7, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v4}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v4, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v27, Lz/k;->a:Lz/k;

    sget-object v5, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v5, v14, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->e()F

    move-result v1

    const/16 v2, 0xd

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v6, v15

    move-object/from16 v19, v15

    move v15, v8

    move v8, v1

    move v1, v9

    move/from16 v9, v17

    move-object/from16 v28, v10

    move/from16 v10, v18

    move-object/from16 v29, v11

    move v11, v2

    move-object v2, v12

    move-object/from16 v12, v16

    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    move-object v12, v2

    move-object v2, v6

    invoke-virtual {v12}, Lcom/ui/wifiman/ui/teleport/A;->a()Ls9/d;

    move-result-object v6

    invoke-static {v6, v14, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move v10, v1

    move-object v1, v6

    invoke-virtual {v12}, Lcom/ui/wifiman/ui/teleport/A;->d()Lrf/f;

    move-result-object v6

    invoke-virtual {v6}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v6

    invoke-static {v6, v14, v15}, Lcom/ui/wifiman/ui/teleport/J;->w(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)J

    move-result-wide v6

    move/from16 v30, v3

    move v9, v4

    const/4 v11, 0x0

    move-wide v3, v6

    invoke-virtual {v12}, Lcom/ui/wifiman/ui/teleport/A;->d()Lrf/f;

    move-result-object v6

    invoke-virtual {v6}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object v6

    invoke-static {v6, v14, v15}, Lcom/ui/wifiman/ui/teleport/J;->x(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)LL0/U;

    move-result-object v22

    const/16 v25, 0x0

    const v26, 0x1fff8

    const-wide/16 v6, 0x0

    move-object/from16 v31, v5

    const/4 v8, 0x1

    move-wide v5, v6

    const/4 v7, 0x0

    move-object/from16 v8, v16

    move/from16 v32, v9

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 p1, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move/from16 v34, v15

    move-object/from16 v33, v19

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    move-object/from16 v1, v33

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x1

    invoke-static {v1, v2, v11, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static/range {v30 .. v30}, LY0/h;->j(F)F

    move-result v2

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v3, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/A;->d()Lrf/f;

    move-result-object v2

    move-object/from16 v12, p2

    move-object/from16 v3, v31

    move/from16 v4, v32

    invoke-virtual {v3, v12, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->b()J

    move-result-wide v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, Lrf/j;->h(Landroidx/compose/ui/e;Lrf/f;JLT/l;II)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/A;->c()Lcom/ui/wifiman/ui/teleport/x;

    move-result-object v1

    if-eqz v1, :cond_7

    move v2, v11

    goto :goto_2

    :cond_7
    move/from16 v2, v34

    :goto_2
    new-instance v1, Lcom/ui/wifiman/ui/teleport/J$c$a;

    move-object/from16 v13, p1

    invoke-direct {v1, v13}, Lcom/ui/wifiman/ui/teleport/J$c$a;-><init>(Lcom/ui/wifiman/ui/teleport/A;)V

    const v3, -0x126150a6

    const/16 v14, 0x36

    invoke-static {v3, v11, v1, v12, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v15, 0x180006

    move-object/from16 v1, v27

    move-object/from16 v8, p2

    move v9, v15

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual {v13}, Lcom/ui/wifiman/ui/teleport/A;->b()Lcom/ui/wifiman/ui/teleport/A$a;

    move-result-object v1

    if-eqz v1, :cond_8

    move v2, v11

    goto :goto_3

    :cond_8
    move/from16 v2, v34

    :goto_3
    new-instance v1, Lcom/ui/wifiman/ui/teleport/J$c$b;

    move-object/from16 v10, v29

    invoke-direct {v1, v13, v10}, Lcom/ui/wifiman/ui/teleport/J$c$b;-><init>(Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;)V

    const v3, 0x4c861491    # 7.029671E7f

    invoke-static {v3, v11, v1, v12, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v16, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v27

    move-object/from16 v8, p2

    move v9, v15

    move-object v15, v10

    move/from16 v10, v16

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual {v13}, Lcom/ui/wifiman/ui/teleport/A;->e()Z

    move-result v2

    new-instance v1, Lcom/ui/wifiman/ui/teleport/J$c$c;

    move-object/from16 v3, v28

    invoke-direct {v1, v3, v15}, Lcom/ui/wifiman/ui/teleport/J$c$c;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;)V

    const v3, 0x3709e6d2

    invoke-static {v3, v11, v1, v12, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    move-object/from16 v1, v27

    const v9, 0x180006

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/J$c;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
