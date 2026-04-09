.class public abstract LL9/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LL9/z$a;->a:LL9/z$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LL9/z;->a:LT/H0;

    return-void
.end method

.method public static synthetic a(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LL9/z;->e(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LL9/z;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v7, p7

    const-string/jumbo v0, "icon"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6e86cf6

    move-object/from16 v2, p6

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, p8, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v7, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v7

    goto :goto_1

    :cond_2
    move v3, v7

    :goto_1
    and-int/lit8 v4, p8, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p8, 0x4

    move-wide/from16 v8, p2

    if-nez v6, :cond_6

    invoke-interface {v2, v8, v9}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    goto :goto_5

    :cond_7
    move-wide/from16 v8, p2

    :goto_5
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move/from16 v10, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_8

    move/from16 v10, p4

    invoke-interface {v2, v10}, LT/l;->c(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-object/from16 v12, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_b

    move-object/from16 v12, p5

    invoke-interface {v2, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit16 v13, v3, 0x2493

    const/16 v14, 0x2492

    if-ne v13, v14, :cond_f

    invoke-interface {v2}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {v2}, LT/l;->C()V

    move-object v4, v5

    move v5, v10

    move-object v6, v12

    goto/16 :goto_f

    :cond_f
    :goto_a
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v13, v7, 0x1

    const/4 v14, 0x1

    if-eqz v13, :cond_13

    invoke-interface {v2}, LT/l;->H()Z

    move-result v13

    if-eqz v13, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_11

    and-int/lit16 v3, v3, -0x381

    :cond_11
    move-object v4, v5

    :cond_12
    move-wide v5, v8

    move-object/from16 v17, v12

    :goto_b
    move v8, v3

    move v3, v10

    goto :goto_e

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v4, v5

    :goto_d
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_15

    sget-object v5, LL9/z;->a:LT/H0;

    invoke-interface {v2, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/v0;

    invoke-virtual {v5}, Lm0/v0;->u()J

    move-result-wide v8

    and-int/lit16 v3, v3, -0x381

    :cond_15
    if-eqz v6, :cond_16

    move v10, v14

    :cond_16
    if-eqz v11, :cond_12

    const v5, 0x63ec4f38

    invoke-interface {v2, v5}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_17

    new-instance v5, LL9/x;

    invoke-direct {v5}, LL9/x;-><init>()V

    invoke-interface {v2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v5, Lmh/a;

    invoke-interface {v2}, LT/l;->J()V

    move-object/from16 v17, v5

    move-wide v5, v8

    goto :goto_b

    :goto_e
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_18

    const/4 v9, -0x1

    const-string/jumbo v10, "com.ui.core.ui.component.toolbar.UiToolbarIconButton (UiToolbarIconButton.kt:22)"

    invoke-static {v0, v8, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    new-instance v0, LL9/z$b;

    invoke-direct {v0, v3, v5, v6, v1}, LL9/z$b;-><init>(ZJLs9/b;)V

    const/16 v9, 0x36

    const v10, 0x28a1d05a

    invoke-static {v10, v14, v0, v2, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v13

    shr-int/lit8 v0, v8, 0x3

    and-int/lit8 v0, v0, 0xe

    const/high16 v9, 0x30000

    or-int/2addr v0, v9

    shr-int/lit8 v8, v8, 0x6

    and-int/lit8 v9, v8, 0x70

    or-int/2addr v0, v9

    and-int/lit16 v8, v8, 0x380

    or-int v15, v0, v8

    const/16 v16, 0x18

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v4

    move v9, v3

    move-object/from16 v10, v17

    move-object v14, v2

    invoke-static/range {v8 .. v16}, LL9/g;->c(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move-wide v8, v5

    move-object/from16 v6, v17

    move v5, v3

    :goto_f
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v11, LL9/y;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object v2, v4

    move-wide v3, v8

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LL9/y;-><init>(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final f()LT/H0;
    .locals 1

    sget-object v0, LL9/z;->a:LT/H0;

    return-object v0
.end method
