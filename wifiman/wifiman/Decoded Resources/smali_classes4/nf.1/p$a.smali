.class final Lnf/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnf/p;->f(Landroidx/compose/ui/e;Lnf/h;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnf/h;

.field final synthetic b:Lxe/f$b;


# direct methods
.method constructor <init>(Lnf/h;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, Lnf/p$a;->a:Lnf/h;

    iput-object p2, p0, Lnf/p$a;->b:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lnf/h;LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lnf/p$a;->h(Lnf/h;LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lnf/p$a;->i(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LT/q0;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final f(LT/q0;Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lnf/h;LT/q0;)LYg/J;
    .locals 1

    invoke-static {p1}, Lnf/p$a;->e(LT/q0;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lnf/p$a;->f(LT/q0;Z)V

    invoke-static {p1}, Lnf/p$a;->e(LT/q0;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lnf/h;->v0(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lz/j;LT/l;I)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

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

    const-string v3, "com.ui.wifiman.ui.speedtest.test.MeteredNetworkWarning.<anonymous> (SpeedtestProcessUi.kt:162)"

    const v4, -0x30cb1872

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v13, 0x0

    const/4 v12, 0x1

    const/4 v10, 0x0

    invoke-static {v15, v13, v12, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v11, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v11, v14, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->c()F

    move-result v2

    invoke-static {v1, v13, v2, v12, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lz/c;->a:Lz/c;

    const/4 v2, 0x4

    int-to-float v7, v2

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v8, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    sget-object v27, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    iget-object v5, v0, Lnf/p$a;->a:Lnf/h;

    iget-object v6, v0, Lnf/p$a;->b:Lxe/f$b;

    const/16 v4, 0x36

    invoke-static {v2, v3, v14, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v14, v3}, LT/j;->a(LT/l;I)I

    move-result v16

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v28, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v10, v2, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v10, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v10}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v10, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v10, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v10, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v11, v14, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    invoke-static {v15, v2, v1}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    new-instance v1, Ls9/d$b;

    sget v4, Lm8/c;->g3:I

    invoke-direct {v1, v4}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v14, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-virtual {v11, v14, v9}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->b()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual {v11, v14, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->b()J

    move-result-wide v18

    move v10, v3

    const/16 v12, 0x36

    move-wide/from16 v3, v18

    const/16 v25, 0x0

    const v26, 0x1fff8

    const-wide/16 v18, 0x0

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move-wide/from16 v5, v18

    const/16 v16, 0x0

    move/from16 v31, v7

    move-object/from16 v7, v16

    move-object/from16 v32, v8

    move-object/from16 v8, v16

    move/from16 v33, v9

    move-object/from16 v9, v16

    move-object/from16 v34, v11

    move-wide/from16 v10, v18

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v35, v15

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

    const v1, -0x44a641ed

    move-object/from16 v14, p2

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v36, LT/l;->a:LT/l$a;

    invoke-virtual/range {v36 .. v36}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v15, 0x2

    if-ne v1, v2, :cond_7

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v13, 0x0

    invoke-static {v1, v13, v15, v13}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v14, v1}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    const/4 v13, 0x0

    :goto_2
    check-cast v1, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object/from16 v12, v35

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-static {v12, v10, v11, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static/range {v31 .. v31}, LY0/h;->j(F)F

    move-result v3

    invoke-static/range {v31 .. v31}, LY0/h;->j(F)F

    move-result v4

    move/from16 v8, v33

    move-object/from16 v9, v34

    invoke-virtual {v9, v14, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->d()F

    move-result v5

    invoke-virtual {v9, v14, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    invoke-virtual {v6}, Lra/b$a$a;->d()F

    move-result v6

    invoke-static {v2, v5, v3, v6, v4}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v16

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, LQ/o;->c(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v18

    const v2, -0x44a603c8

    invoke-interface {v14, v2}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v36 .. v36}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_8

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v2

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v17, v2

    check-cast v17, Ly/m;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v2, -0x44a5f9f8

    invoke-interface {v14, v2}, LT/l;->U(I)V

    move-object/from16 v7, v29

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    invoke-virtual/range {v36 .. v36}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_a

    :cond_9
    new-instance v3, Lnf/n;

    invoke-direct {v3, v7, v1}, Lnf/n;-><init>(Lnf/h;LT/q0;)V

    invoke-interface {v14, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v22, v3

    check-cast v22, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v23, 0x1c

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    move-object/from16 v5, v32

    invoke-virtual {v5, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v14, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v14, v6}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v14, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_c

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_c
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v6, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v6, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v6, v2, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/Z;->a:Lz/Z;

    invoke-static {v1}, Lnf/p$a;->e(LT/q0;)Z

    move-result v2

    const/16 v10, 0x180

    const/16 v16, 0x19

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    move-object/from16 v6, p2

    move-object/from16 v37, v7

    move v7, v10

    move v10, v8

    move/from16 v8, v16

    invoke-static/range {v1 .. v8}, Lx9/h;->m(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;LT/l;II)V

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->f3:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v14, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-virtual {v9, v14, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual {v9, v14, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v3

    const/16 v25, 0x0

    const v26, 0x1fff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    move-object/from16 v38, v9

    move-object v9, v2

    const-wide/16 v16, 0x0

    move/from16 v39, v10

    const/4 v2, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v35, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x30

    move-object/from16 v2, v35

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static/range {v31 .. v31}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v12, v35

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    move-object/from16 v13, p2

    invoke-static {v1, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v12, v14, v15, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v10, v38

    move/from16 v9, v39

    invoke-virtual {v10, v13, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v8, 0x2

    invoke-static {v1, v2, v14, v8, v11}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->e3:I

    const/4 v7, 0x0

    invoke-static {v2, v13, v7}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v16

    const v2, -0x44a56f72

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, v37

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_f

    invoke-virtual/range {v36 .. v36}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_10

    :cond_f
    new-instance v4, Lnf/p$a$a;

    invoke-direct {v4, v2}, Lnf/p$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v2, v4

    check-cast v2, Lmh/a;

    const/16 v17, 0x0

    const/16 v18, 0xbc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, v16

    move-object/from16 v8, v19

    move/from16 v40, v9

    move-object/from16 v9, p2

    move-object/from16 v41, v10

    move/from16 v10, v17

    move-object v0, v11

    move/from16 v11, v18

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-static {v12, v14, v15, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move/from16 v3, v40

    move-object/from16 v2, v41

    invoke-virtual {v2, v13, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v3, 0x2

    invoke-static {v1, v2, v14, v3, v0}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v0, Lm8/c;->a:I

    const/4 v2, 0x0

    invoke-static {v0, v13, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const v0, -0x44a548af

    invoke-interface {v13, v0}, LT/l;->U(I)V

    move-object/from16 v0, v30

    invoke-interface {v13, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_11

    invoke-virtual/range {v36 .. v36}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_12

    :cond_11
    new-instance v3, Lnf/o;

    invoke-direct {v3, v0}, Lnf/o;-><init>(Lxe/f$b;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    move-object v2, v3

    check-cast v2, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v8, 0x0

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
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

    invoke-virtual {p0, p1, p2, p3}, Lnf/p$a;->c(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
