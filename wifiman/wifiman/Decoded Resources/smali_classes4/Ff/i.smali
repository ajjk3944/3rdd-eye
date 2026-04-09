.class public abstract LFf/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LFf/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LFf/i;->f(LFf/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LFf/i;->h(Landroidx/compose/ui/e;Lmh/q;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LFf/e;LT/l;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "vm"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x4273347b

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v1, 0x6

    const/4 v11, 0x2

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v11

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, v3, 0x3

    if-ne v4, v11, :cond_3

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LT/l;->C()V

    move-object v5, v15

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent (WifiScanUiContent.kt:74)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v3, LQ/y;->a:LQ/y;

    sget v2, LQ/y;->g:I

    shl-int/lit8 v9, v2, 0xc

    const/16 v10, 0xf

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v15

    invoke-virtual/range {v3 .. v10}, LQ/y;->a(LQ/A;Lmh/a;Lr/i;Lr/z;LT/l;II)LQ/z;

    move-result-object v2

    const/4 v14, 0x0

    const/4 v3, 0x3

    invoke-static {v14, v14, v15, v14, v3}, LA/C;->c(IILT/l;II)LA/B;

    move-result-object v13

    const v3, 0x6b009b79

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v31, LT/l;->a:LT/l$a;

    invoke-virtual/range {v31 .. v31}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_5

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, LT/h1;->a(J)LT/o0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v12, v3

    check-cast v12, LT/o0;

    invoke-interface {v15}, LT/l;->J()V

    const v3, 0x6b00a2fc

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {v31 .. v31}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_6

    invoke-static {v14, v14, v14, v14}, Lz/h0;->a(IIII)Lz/f0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lz/f0;

    invoke-interface {v15}, LT/l;->J()V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {v2}, LQ/z;->a()Lx0/a;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v4, v5, v10, v11, v10}, Landroidx/compose/ui/input/nestedscroll/a;->b(Landroidx/compose/ui/e;Lx0/a;Lx0/b;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->e()Lma/a$e;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$e;->a()J

    move-result-wide v22

    new-instance v5, LFf/i$a;

    invoke-direct {v5, v0, v2, v12}, LFf/i$a;-><init>(LFf/e;LQ/z;LT/o0;)V

    const v6, -0x3aa3233f

    const/4 v7, 0x1

    const/16 v8, 0x36

    invoke-static {v6, v7, v5, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    new-instance v5, LFf/i$b;

    invoke-direct {v5, v0, v13}, LFf/i$b;-><init>(LFf/e;LA/B;)V

    const v9, 0x2e02e5fa

    invoke-static {v9, v7, v5, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v26

    const/high16 v29, 0x6000000

    const v30, 0x2fff4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move v10, v11

    const/16 v16, 0x0

    move-object/from16 p1, v12

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 v32, v13

    move/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v14, v16

    const/16 v16, 0x0

    move-object/from16 v33, v15

    move/from16 v15, v16

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v24, 0x0

    const/16 v28, 0xc06

    move-object/from16 v27, v33

    invoke-static/range {v3 .. v30}, LN/C0;->b(Lz/f0;Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static/range {p1 .. p1}, LFf/i;->d(LT/o0;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const v4, 0x6b0556d8

    move-object/from16 v5, v33

    invoke-interface {v5, v4}, LT/l;->U(I)V

    move-object/from16 v4, v32

    invoke-interface {v5, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v5, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_7

    invoke-virtual/range {v31 .. v31}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_8

    :cond_7
    new-instance v7, LFf/i$c;

    move-object/from16 v6, p1

    const/4 v8, 0x0

    invoke-direct {v7, v4, v2, v6, v8}, LFf/i$c;-><init>(LA/B;LQ/z;LT/o0;Ldh/e;)V

    invoke-interface {v5, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lmh/p;

    invoke-interface {v5}, LT/l;->J()V

    const/4 v2, 0x0

    invoke-static {v3, v7, v5, v2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_3
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v3, LFf/f;

    invoke-direct {v3, v0, v1}, LFf/f;-><init>(LFf/e;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final d(LT/o0;)J
    .locals 2

    invoke-interface {p0}, LT/f0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final e(LT/o0;J)V
    .locals 0

    invoke-interface {p0, p1, p2}, LT/o0;->m(J)V

    return-void
.end method

.method private static final f(LFf/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LFf/i;->c(LFf/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V
    .locals 8

    const v0, -0x7af1c549

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.scan.WithItemType (WifiScanUiContent.kt:302)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, LFf/i$d;

    invoke-direct {v0, p0, p1}, LFf/i$d;-><init>(Landroidx/compose/ui/e;Lmh/q;)V

    const/16 v2, 0x36

    const v3, 0x16f98fa1

    const/4 v4, 0x1

    invoke-static {v3, v4, v0, p2, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    and-int/lit8 v0, v1, 0xe

    or-int/lit16 v6, v0, 0xc00

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lz/e;->a(Landroidx/compose/ui/e;Lf0/c;ZLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, LFf/g;

    invoke-direct {v0, p0, p1, p3}, LFf/g;-><init>(Landroidx/compose/ui/e;Lmh/q;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LFf/i;->g(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic i(LT/o0;)J
    .locals 2

    invoke-static {p0}, LFf/i;->d(LT/o0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic j(LT/o0;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LFf/i;->e(LT/o0;J)V

    return-void
.end method

.method public static final synthetic k(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LFf/i;->g(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V

    return-void
.end method
