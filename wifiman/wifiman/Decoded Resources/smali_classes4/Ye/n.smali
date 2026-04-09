.class public abstract LYe/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LYe/d$b;LYe/f;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LYe/n;->c(Landroidx/compose/ui/e;LYe/d$b;LYe/f;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LYe/d$b;LYe/f;LT/l;II)V
    .locals 32

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "reason"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vm"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x19172f92

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, p5, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    :goto_4
    move v8, v7

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v7, v8

    goto :goto_4

    :goto_6
    and-int/lit16 v7, v8, 0x93

    const/16 v9, 0x92

    if-ne v7, v9, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    goto :goto_9

    :cond_a
    :goto_7
    if-eqz v5, :cond_b

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_8

    :cond_b
    move-object v5, v6

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_c

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUnavailableUi (FloorplanMapperUnavailableUi.kt:28)"

    invoke-static {v0, v8, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    sget-object v0, LYe/b;->a:LYe/b;

    invoke-virtual {v0}, LYe/b;->a()Lmh/p;

    move-result-object v7

    new-instance v0, LYe/n$a;

    invoke-direct {v0, v2, v5, v3}, LYe/n$a;-><init>(LYe/d$b;Landroidx/compose/ui/e;LYe/f;)V

    const/16 v6, 0x36

    const v9, -0x2eda9f90

    const/4 v10, 0x1

    invoke-static {v9, v10, v0, v1, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v27

    and-int/lit8 v0, v8, 0xe

    or-int/lit16 v0, v0, 0x180

    move/from16 v29, v0

    const/high16 v30, 0xc00000

    const v31, 0x1fffa

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    move-object v0, v5

    move-object/from16 v28, v1

    invoke-static/range {v5 .. v31}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    move-object v6, v0

    :goto_9
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v8, LYe/m;

    move-object v0, v8

    move-object v1, v6

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LYe/m;-><init>(Landroidx/compose/ui/e;LYe/d$b;LYe/f;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LYe/d$b;LYe/f;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LYe/n;->b(Landroidx/compose/ui/e;LYe/d$b;LYe/f;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
