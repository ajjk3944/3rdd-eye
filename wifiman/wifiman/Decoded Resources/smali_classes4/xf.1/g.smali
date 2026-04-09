.class public abstract Lxf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lxf/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxf/g;->c(Landroidx/compose/ui/e;Lxf/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lxf/e;LT/l;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "vm"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x56e0fb46

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v12, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v12

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v32, v15

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUiContent (WifiAccessPointDetailUiContent.kt:41)"

    invoke-static {v3, v4, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v4, LQ/y;->a:LQ/y;

    sget v3, LQ/y;->g:I

    shl-int/lit8 v10, v3, 0xc

    const/16 v11, 0xf

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v15

    invoke-virtual/range {v4 .. v11}, LQ/y;->b(LQ/A;Lmh/a;Lr/i;Lr/z;LT/l;II)LQ/z;

    move-result-object v3

    const v4, 0x39fc6a2c

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_7

    const/4 v4, 0x0

    invoke-static {v4, v4, v4, v4}, Lz/h0;->a(IIII)Lz/f0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lz/f0;

    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v3}, LQ/z;->a()Lx0/a;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v0, v5, v6, v12, v6}, Landroidx/compose/ui/input/nestedscroll/a;->b(Landroidx/compose/ui/e;Lx0/a;Lx0/b;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->a()J

    move-result-wide v23

    new-instance v6, Lxf/g$a;

    invoke-direct {v6, v1, v3}, Lxf/g$a;-><init>(Lxf/e;LQ/z;)V

    const v3, 0x247bf3c0

    const/4 v8, 0x1

    const/16 v9, 0x36

    invoke-static {v3, v8, v6, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    new-instance v3, Lxf/g$b;

    invoke-direct {v3, v1}, Lxf/g$b;-><init>(Lxf/e;)V

    const v6, -0x5d724a59

    invoke-static {v6, v8, v3, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v27

    const/high16 v30, 0x6000000

    const v31, 0x2fff4

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    move-object/from16 v32, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v25, 0x0

    const/16 v29, 0xc06

    move-object/from16 v28, v32

    invoke-static/range {v4 .. v31}, LN/C0;->b(Lz/f0;Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_4
    invoke-interface/range {v32 .. v32}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, Lxf/f;

    invoke-direct {v4, v0, v1, v2}, Lxf/f;-><init>(Landroidx/compose/ui/e;Lxf/e;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lxf/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lxf/g;->b(Landroidx/compose/ui/e;Lxf/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
