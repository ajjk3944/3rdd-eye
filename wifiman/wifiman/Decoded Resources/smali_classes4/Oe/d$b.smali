.class final LOe/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOe/d;->b(Landroidx/compose/ui/e;LOe/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LOe/b;

.field final synthetic b:Lxe/f$b;


# direct methods
.method constructor <init>(LOe/b;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, LOe/d$b;->a:LOe/b;

    iput-object p2, p0, LOe/d$b;->b:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LOe/d$b;->e(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final e(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 34

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.permission.PermissionExplanationUi.<anonymous> (PermissionExplanationUi.kt:43)"

    const v4, 0x70198828

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v12, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v15, v12, v10, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v9, v14, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->c()F

    move-result v2

    invoke-static {v1, v12, v2, v10, v11}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    const/4 v3, 0x4

    int-to-float v7, v3

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v2, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    iget-object v5, v0, LOe/d$b;->a:LOe/b;

    iget-object v6, v0, LOe/d$b;->b:Lxe/f$b;

    const/16 v4, 0x36

    invoke-static {v2, v3, v14, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v13, 0x0

    invoke-static {v14, v13}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v14, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v12, v2, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v12, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v12}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v12, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v12, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v9, v14, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    invoke-static {v15, v2, v1}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v5}, LOe/b;->o0()LLi/N;

    move-result-object v1

    const/4 v10, 0x1

    invoke-static {v1, v11, v14, v13, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v14, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-virtual {v9, v14, v8}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual {v9, v14, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v3

    sget-object v12, LW0/j;->b:LW0/j$a;

    invoke-virtual {v12}, LW0/j$a;->a()I

    move-result v12

    invoke-static {v12}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    move-object v13, v12

    const/16 v25, 0x0

    const v26, 0x1fdf8

    const-wide/16 v16, 0x0

    move-object v12, v5

    move-object/from16 v27, v6

    move-wide/from16 v5, v16

    const/16 v16, 0x0

    move/from16 v28, v7

    move-object/from16 v7, v16

    move/from16 v29, v8

    move-object/from16 v8, v16

    move-object/from16 v30, v9

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 p1, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v31, v15

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

    invoke-static/range {v28 .. v28}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v12, v31

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    move-object/from16 v13, p2

    invoke-static {v1, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LOe/b;->n0()LLi/N;

    move-result-object v1

    const/4 v11, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v1, v15, v13, v11, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    const v2, -0xdd3757c

    invoke-interface {v13, v2}, LT/l;->U(I)V

    invoke-static {v1}, LOe/d$b;->c(LT/z1;)Z

    move-result v1

    const/4 v10, 0x2

    if-eqz v1, :cond_9

    const/4 v9, 0x0

    invoke-static {v12, v9, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move/from16 v7, v29

    move-object/from16 v8, v30

    invoke-virtual {v8, v13, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    invoke-static {v1, v2, v9, v10, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->F1:I

    invoke-static {v2, v13, v11}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v16

    const v2, -0xdd34dc6

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, p1

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, LOe/d$b$a;

    invoke-direct {v4, v2}, LOe/d$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
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

    move/from16 v32, v7

    move-object/from16 v7, v16

    move-object/from16 v33, v8

    move-object/from16 v8, v19

    move-object/from16 v9, p2

    move/from16 v10, v17

    move/from16 v11, v18

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    goto :goto_2

    :cond_9
    move/from16 v32, v29

    move-object/from16 v33, v30

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v12, v1, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    move/from16 v4, v32

    move-object/from16 v3, v33

    invoke-virtual {v3, v13, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v3

    const/4 v4, 0x2

    invoke-static {v2, v3, v1, v4, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->G1:I

    const/4 v3, 0x0

    invoke-static {v2, v13, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const v2, -0xdd322df    # -3.42392E30f

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, v27

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_b

    :cond_a
    new-instance v4, LOe/e;

    invoke-direct {v4, v2}, LOe/e;-><init>(Lxe/f$b;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v2, v4

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

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
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

    invoke-virtual {p0, p1, p2, p3}, LOe/d$b;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
