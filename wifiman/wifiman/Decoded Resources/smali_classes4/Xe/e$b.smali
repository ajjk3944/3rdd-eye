.class final LXe/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXe/e;->b(Landroidx/compose/ui/e;LXe/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LXe/b;

.field final synthetic b:Lxe/f$b;


# direct methods
.method constructor <init>(LXe/b;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, LXe/e$b;->a:LXe/b;

    iput-object p2, p0, LXe/e$b;->b:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LXe/e$b;->k(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LXe/b;)Lmh/p;
    .locals 0

    invoke-static {p0}, LXe/e$b;->j(LXe/b;)Lmh/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LT/q0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LXe/e$b;->h(LT/q0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LXe/e$b;->i(LT/q0;Ljava/lang/String;)V

    return-void
.end method

.method private static final h(LT/q0;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final i(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(LXe/b;)Lmh/p;
    .locals 1

    new-instance v0, LXe/e$b$b;

    invoke-direct {v0, p0}, LXe/e$b$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final k(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f(Lz/j;LT/l;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v14, 0x10

    if-ne v2, v14, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous> (FloorplanSaveUi.kt:68)"

    const v4, 0x7a1f4029

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x1

    invoke-static {v15, v13, v12, v11}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    invoke-static {v10, v9, v11, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v13, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v3, 0x2

    invoke-static {v1, v2, v9, v3, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v2

    iget-object v8, v0, LXe/e$b;->a:LXe/b;

    iget-object v7, v0, LXe/e$b;->b:Lxe/f$b;

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->g()Lz/c$m;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v2, v13, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v13, v12}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v13, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v14, v2, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v14, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v14}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v14, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v14, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v14, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    const v1, -0x185ec4b3

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v14, LT/l;->a:LT/l$a;

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_7

    const-string v1, ""

    invoke-static {v1, v15, v3, v15}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v13, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v8}, LXe/b;->o0()LLi/N;

    move-result-object v2

    invoke-static {v2, v15, v13, v12, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls9/d;

    const/4 v9, 0x0

    invoke-static {v10, v9, v11, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v4, LXe/e$b$a;

    invoke-direct {v4, v2, v8, v1}, LXe/e$b$a;-><init>(Ls9/d;LXe/b;LT/q0;)V

    const/16 v1, 0x36

    const v2, -0xaf46269

    invoke-static {v2, v11, v4, v13, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const v17, 0x6000006

    const/16 v18, 0xfe

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v1, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, v19

    move-object/from16 v22, v7

    move-object/from16 v7, v20

    move-object/from16 p3, v8

    move-object/from16 v8, v21

    move-object/from16 v9, v16

    move-object v15, v10

    move-object/from16 v10, p2

    move/from16 v11, v17

    move v0, v12

    move/from16 v12, v18

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v1, 0xbe

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v11, v12, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {p3 .. p3}, LXe/b;->n0()LLi/N;

    move-result-object v4

    invoke-static {v4, v3, v13, v0, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    const v4, -0x185e4f73

    invoke-interface {v13, v4}, LT/l;->U(I)V

    move-object/from16 v10, p3

    invoke-interface {v13, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_8

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_9

    :cond_8
    new-instance v5, LXe/f;

    invoke-direct {v5, v10}, LXe/f;-><init>(LXe/b;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v1, v3, v5, v13, v2}, LUe/f;->e(Landroidx/compose/ui/e;Ljava/lang/Long;Lmh/a;LT/l;I)V

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v1, 0x0

    invoke-static {v15, v11, v12, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget v1, Lm8/c;->b1:I

    invoke-static {v1, v13, v0}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const v1, -0x185e2c41

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface {v13, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_a

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_b

    :cond_a
    new-instance v3, LXe/e$b$c;

    invoke-direct {v3, v10}, LXe/e$b$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v3, Lmh/a;

    const/16 v17, 0x6

    const/16 v18, 0xbc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object v8, v9

    move-object/from16 v9, p2

    move-object/from16 v23, v10

    move/from16 v10, v17

    move v0, v11

    move/from16 v11, v18

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    const/4 v1, 0x0

    invoke-static {v15, v0, v12, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget v1, Lm8/c;->c1:I

    const/4 v3, 0x0

    invoke-static {v1, v13, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const v1, -0x185e11c0

    invoke-interface {v13, v1}, LT/l;->U(I)V

    move-object/from16 v1, v23

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_d

    :cond_c
    new-instance v4, LXe/e$b$d;

    invoke-direct {v4, v1}, LXe/e$b$d;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v3, v4

    check-cast v3, Lmh/a;

    const/4 v8, 0x6

    const/16 v9, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v7

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    const/4 v1, 0x0

    invoke-static {v15, v0, v12, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, Lm8/c;->a:I

    const/4 v2, 0x0

    invoke-static {v1, v13, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const v1, -0x185df84e

    invoke-interface {v13, v1}, LT/l;->U(I)V

    move-object/from16 v1, v22

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_e

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_f

    :cond_e
    new-instance v3, LXe/g;

    invoke-direct {v3, v1}, LXe/g;-><init>(Lxe/f$b;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v2, v3

    check-cast v2, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v8, 0x6

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v13, v1, v12}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LXe/e$b;->f(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
