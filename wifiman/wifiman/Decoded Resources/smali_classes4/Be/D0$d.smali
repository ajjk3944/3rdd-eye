.class public final LBe/D0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/D0;->b(Landroidx/compose/ui/e;LBe/B0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lb1/l;

.field final synthetic c:Lmh/a;

.field final synthetic d:LBe/B0;

.field final synthetic e:LT/z1;

.field final synthetic f:LT/z1;


# direct methods
.method public constructor <init>(LT/q0;Lb1/l;Lmh/a;LBe/B0;LT/z1;LT/z1;)V
    .locals 0

    iput-object p1, p0, LBe/D0$d;->a:LT/q0;

    iput-object p2, p0, LBe/D0$d;->b:Lb1/l;

    iput-object p3, p0, LBe/D0$d;->c:Lmh/a;

    iput-object p4, p0, LBe/D0$d;->d:LBe/B0;

    iput-object p5, p0, LBe/D0$d;->e:LT/z1;

    iput-object p6, p0, LBe/D0$d;->f:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)"

    const v4, 0x478ef317

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LBe/D0$d;->a:LT/q0;

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-interface {v1, v2}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, LBe/D0$d;->b:Lb1/l;

    invoke-virtual {v1}, Lb1/i;->e()I

    move-result v12

    iget-object v1, v0, LBe/D0$d;->b:Lb1/l;

    invoke-virtual {v1}, Lb1/l;->f()V

    iget-object v13, v0, LBe/D0$d;->b:Lb1/l;

    const v1, 0x51753432

    invoke-interface {v11, v1}, LT/l;->U(I)V

    invoke-virtual {v13}, Lb1/l;->j()Lb1/l$b;

    move-result-object v1

    invoke-virtual {v1}, Lb1/l$b;->a()Lb1/f;

    move-result-object v9

    invoke-virtual {v1}, Lb1/l$b;->b()Lb1/f;

    move-result-object v14

    iget-object v1, v0, LBe/D0$d;->d:LBe/B0;

    invoke-virtual {v1}, LBe/B0;->b()LW7/f;

    move-result-object v1

    const/4 v15, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, LBe/D0$d;->d:LBe/B0;

    invoke-virtual {v1}, LBe/B0;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, 0x5177edd0

    invoke-interface {v11, v1}, LT/l;->U(I)V

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v11, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v1

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const v1, 0x5178e8d7

    invoke-interface {v11, v1}, LT/l;->U(I)V

    iget-object v1, v0, LBe/D0$d;->d:LBe/B0;

    invoke-virtual {v1}, LBe/B0;->b()LW7/f;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v11, v15, v3}, LNe/f;->c(LW7/f;LW7/f$a;LT/l;II)J

    move-result-wide v1

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_1
    const/16 v7, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "signal color"

    const/4 v5, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v1

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v2, -0x4ff3bf57

    invoke-interface {v11, v2}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v16, LT/l;->a:LT/l$a;

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4

    sget-object v2, LBe/D0$e;->a:LBe/D0$e;

    invoke-interface {v11, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-virtual {v13, v10, v9, v2}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v3, 0x3

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v3}, LE/h;->d(F)LE/g;

    move-result-object v3

    invoke-static {v2, v3}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, LBe/D0$d;->e:LT/z1;

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/v0;

    invoke-virtual {v4}, Lm0/v0;->u()J

    move-result-wide v4

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v17

    const/16 v23, 0xe

    const/16 v24, 0x0

    const v19, 0x3e4ccccd    # 0.2f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    const/4 v9, 0x0

    const/16 v17, 0x10

    const/4 v8, 0x0

    move v1, v3

    move-wide v3, v4

    move-wide v5, v6

    move v7, v8

    move-object/from16 v8, p1

    move-object v15, v10

    move/from16 v10, v17

    invoke-static/range {v1 .. v10}, LN/t0;->g(FLandroidx/compose/ui/e;JJILT/l;II)V

    iget-object v1, v0, LBe/D0$d;->f:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v13, v1}, Lb1/i;->c(F)Lb1/i$c;

    move-result-object v1

    const v2, -0x4ff36a51

    invoke-interface {v11, v2}, LT/l;->U(I)V

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, LBe/D0$f;

    invoke-direct {v3, v1}, LBe/D0$f;-><init>(Lb1/i$c;)V

    invoke-interface {v11, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-virtual {v13, v15, v14, v3}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v4

    const v1, -0x4ff34096

    invoke-interface {v11, v1}, LT/l;->U(I)V

    iget-object v1, v0, LBe/D0$d;->d:LBe/B0;

    invoke-virtual {v1}, LBe/B0;->c()LW7/f;

    move-result-object v1

    if-eqz v1, :cond_7

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v11, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->c()J

    move-result-wide v1

    :goto_2
    move-wide v5, v1

    goto :goto_3

    :cond_7
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->d()J

    move-result-wide v1

    goto :goto_2

    :goto_3
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v11, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-object v1, v0, LBe/D0$d;->b:Lb1/l;

    invoke-virtual {v1}, Lb1/i;->e()I

    move-result v1

    if-eq v1, v12, :cond_8

    iget-object v1, v0, LBe/D0$d;->c:Lmh/a;

    const/4 v2, 0x6

    invoke-static {v1, v11, v2}, LT/O;->g(Lmh/a;LT/l;I)V

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LBe/D0$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
