.class final LVe/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVe/e;->b(Landroidx/compose/ui/e;LVe/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LVe/b;

.field final synthetic b:Lxe/f$b;


# direct methods
.method constructor <init>(LVe/b;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, LVe/e$b;->a:LVe/b;

    iput-object p2, p0, LVe/e$b;->b:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LVe/e$b;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v1, p3

    const-string v3, "$this$ModalScaffold"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v1, 0x11

    const/16 v14, 0x10

    if-ne v3, v14, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.signal.floorplan.delete.FloorplanRemoveUi.<anonymous> (FloorplanRemoveUi.kt:59)"

    const v5, -0x4fd683b7

    invoke-static {v5, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v2, v15, v12}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    invoke-static {v10, v11, v12, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v2, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    const/16 v7, 0x20

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v6, v7}, Lra/b$a;->a(F)F

    move-result v6

    const/4 v7, 0x2

    invoke-static {v3, v6, v11, v7, v1}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v6

    iget-object v9, v0, LVe/e$b;->a:LVe/b;

    iget-object v8, v0, LVe/e$b;->b:Lxe/f$b;

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v7

    const/16 v13, 0x30

    invoke-static {v7, v6, v2, v13}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v2, v15}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v2, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v2, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v6, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v14, v13, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v14}, LT/l;->o()Z

    move-result v13

    if-nez v13, :cond_5

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v14, v13}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v14, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v14, v3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-static {v10, v11, v12, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v23

    invoke-virtual {v9}, LVe/b;->o0()LLi/N;

    move-result-object v3

    const/4 v14, 0x0

    invoke-static {v3, v1, v2, v14, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls9/d;

    const v6, -0x5e4bdef5

    invoke-interface {v2, v6}, LT/l;->U(I)V

    if-nez v3, :cond_7

    move-object v3, v1

    goto :goto_2

    :cond_7
    invoke-static {v3, v2, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    if-nez v3, :cond_8

    new-instance v3, LL0/d;

    const/16 v19, 0x6

    const/16 v20, 0x0

    const-string v16, ""

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v3

    invoke-direct/range {v15 .. v20}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_8
    move-object/from16 v27, v3

    invoke-virtual {v4, v2, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual {v4, v2, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v3

    sget-object v5, LW0/j;->b:LW0/j$a;

    invoke-virtual {v5}, LW0/j$a;->a()I

    move-result v5

    invoke-static {v5}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const/16 v25, 0x0

    const v26, 0x1fdf8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    move-object/from16 v28, v8

    move-object v8, v15

    move-object/from16 v29, v9

    move-object v9, v15

    const-wide/16 v15, 0x0

    move-object/from16 v30, v10

    move-wide v10, v15

    const/4 v15, 0x0

    move-object v12, v15

    const-wide/16 v15, 0x0

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x30

    move-object/from16 v1, v27

    move-object/from16 v2, v23

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v12, v30

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    move-object/from16 v13, p2

    invoke-static {v1, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v12, v11, v15, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->Z0:I

    const/4 v10, 0x0

    invoke-static {v2, v13, v10}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    sget-object v6, Lw9/p;->ALERT:Lw9/p;

    const v2, -0x5e4ba1aa

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, v29

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, LVe/e$b$a;

    invoke-direct {v4, v2}, LVe/e$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v2, v4

    check-cast v2, Lmh/a;

    const v16, 0x30006

    const/16 v17, 0x9c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    move/from16 v10, v16

    move v0, v11

    move/from16 v11, v17

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-static {v12, v0, v15, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v0, Lm8/c;->a:I

    const/4 v10, 0x0

    invoke-static {v0, v13, v10}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const v0, -0x5e4b883d

    invoke-interface {v13, v0}, LT/l;->U(I)V

    move-object/from16 v0, v28

    invoke-interface {v13, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, LVe/f;

    invoke-direct {v3, v0}, LVe/f;-><init>(Lxe/f$b;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v2, v3

    check-cast v2, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v8, 0x6

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {v14, v13, v10, v15}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LVe/e$b;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
