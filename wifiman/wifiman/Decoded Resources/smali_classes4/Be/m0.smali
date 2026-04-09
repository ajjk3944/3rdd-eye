.class public abstract LBe/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBe/e0;

    invoke-direct {v0}, LBe/e0;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LBe/m0;->a:LT/H0;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, LBe/m0;->o(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Ljava/util/Map;)LBe/b0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBe/m0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Ljava/util/Map;)LBe/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LBe/b0;ZLs9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LBe/m0;->i(Landroidx/compose/ui/e;LBe/b0;ZLs9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc0/m;LBe/b0;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBe/m0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc0/m;LBe/b0;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()LBe/n0;
    .locals 1

    invoke-static {}, LBe/m0;->g()LBe/n0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(ZZLR0/Q;Lmh/l;)LT/q0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LBe/m0;->p(ZZLR0/Q;Lmh/l;)LT/q0;

    move-result-object p0

    return-object p0
.end method

.method private static final g()LBe/n0;
    .locals 1

    new-instance v0, LBe/n0;

    invoke-direct {v0}, LBe/n0;-><init>()V

    return-object v0
.end method

.method public static final h(Landroidx/compose/ui/e;LBe/b0;ZLs9/d;LT/l;II)V
    .locals 23

    move-object/from16 v7, p3

    move/from16 v8, p5

    const-string v0, "placeholderText"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x62fbce71

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v6

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v6, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p6, 0x2

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v6, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v4, p1

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    move/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v8, 0x180

    move/from16 v15, p2

    if-nez v9, :cond_8

    invoke-interface {v6, v15}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :cond_8
    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v8, 0xc00

    if-nez v9, :cond_b

    invoke-interface {v6, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    :cond_b
    :goto_7
    and-int/lit16 v9, v3, 0x493

    const/16 v10, 0x492

    if-ne v9, v10, :cond_d

    invoke-interface {v6}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v6}, LT/l;->C()V

    move-object v1, v2

    move-object v2, v4

    move-object v3, v6

    goto/16 :goto_d

    :cond_d
    :goto_8
    invoke-interface {v6}, LT/l;->q()V

    and-int/lit8 v9, v8, 0x1

    const/4 v14, 0x1

    if-eqz v9, :cond_10

    invoke-interface {v6}, LT/l;->H()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_9

    :cond_e
    invoke-interface {v6}, LT/l;->C()V

    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_f

    and-int/lit8 v3, v3, -0x71

    :cond_f
    move-object/from16 v21, v4

    move/from16 v22, v15

    move-object v15, v2

    goto :goto_c

    :cond_10
    :goto_9
    if-eqz v1, :cond_11

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_a

    :cond_11
    move-object v1, v2

    :goto_a
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_12

    const/4 v2, 0x0

    const/16 v4, 0xf

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v13, v6

    move v14, v2

    move v15, v4

    invoke-static/range {v9 .. v15}, LBe/m0;->n(ZZLR0/Q;Lmh/l;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBe/b0;

    and-int/lit8 v3, v3, -0x71

    goto :goto_b

    :cond_12
    move-object v2, v4

    :goto_b
    if-eqz v5, :cond_13

    move-object v15, v1

    move-object/from16 v21, v2

    const/16 v22, 0x1

    goto :goto_c

    :cond_13
    move/from16 v22, p2

    move-object v15, v1

    move-object/from16 v21, v2

    :goto_c
    invoke-interface {v6}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.UiSearchBox (UiSearchBox.kt:159)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    invoke-static {}, Landroidx/compose/ui/platform/k0;->h()LT/H0;

    move-result-object v0

    invoke-interface {v6, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lk0/e;

    const v0, 0x50f86e97

    invoke-interface {v6, v0}, LT/l;->U(I)V

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_15

    new-instance v0, Landroidx/compose/ui/focus/o;

    invoke-direct {v0}, Landroidx/compose/ui/focus/o;-><init>()V

    invoke-interface {v6, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/focus/o;

    invoke-interface {v6}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->q()LT/H0;

    move-result-object v0

    invoke-interface {v6, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/platform/n1;

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/16 v2, 0xdc

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v15, v2, v0}, Landroidx/compose/foundation/layout/r;->a(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, v6, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v11

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v10

    new-instance v13, LBe/m0$a;

    move-object v0, v13

    move/from16 v2, v22

    move-object/from16 v4, v21

    move-object v14, v6

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v6}, LBe/m0$a;-><init>(Landroidx/compose/ui/focus/o;ZLandroidx/compose/ui/platform/n1;LBe/b0;Lk0/e;Ls9/d;)V

    const/16 v0, 0x36

    const v1, -0xc454b4b

    const/4 v2, 0x1

    invoke-static {v1, v2, v13, v14, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    const/high16 v19, 0x180000

    const/16 v20, 0x38

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    move-object v3, v14

    move-wide v13, v0

    move-object v1, v15

    move-object v15, v2

    move-object/from16 v18, v3

    invoke-static/range {v9 .. v20}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    move-object/from16 v2, v21

    move/from16 v15, v22

    :goto_d
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v10, LBe/h0;

    move-object v0, v10

    move v3, v15

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LBe/h0;-><init>(Landroidx/compose/ui/e;LBe/b0;ZLs9/d;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final i(Landroidx/compose/ui/e;LBe/b0;ZLs9/d;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LBe/m0;->h(Landroidx/compose/ui/e;LBe/b0;ZLs9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Lmh/l;)Lc0/k;
    .locals 5

    new-instance v0, LBe/f0;

    const-string v1, "visible"

    const-string v2, "closable"

    const-string v3, "query"

    invoke-direct {v0, v1, v2, v3}, LBe/f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, LBe/g0;

    invoke-direct {v4, v1, v2, v3, p0}, LBe/g0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;)V

    invoke-static {v0, v4}, Lc0/b;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc0/m;LBe/b0;)Ljava/util/Map;
    .locals 1

    const-string v0, "$this$mapSaver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "it"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, LBe/b0;->c()LT/q0;

    move-result-object p3

    invoke-interface {p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p0, p3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    invoke-virtual {p4}, LBe/b0;->a()LT/q0;

    move-result-object p3

    invoke-interface {p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-virtual {p4}, LBe/b0;->b()LT/q0;

    move-result-object p3

    invoke-interface {p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LR0/Q;

    invoke-virtual {p3}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    filled-new-array {p0, p1, p2}, [LYg/s;

    move-result-object p0

    invoke-static {p0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Ljava/util/Map;)LBe/b0;
    .locals 9

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBe/b0;

    invoke-interface {p4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v8, LR0/Q;

    invoke-interface {p4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string p4, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p0, p1, v8, p3}, LBe/b0;-><init>(ZZLR0/Q;Lmh/l;)V

    return-object v0
.end method

.method public static final m()LT/H0;
    .locals 1

    sget-object v0, LBe/m0;->a:LT/H0;

    return-object v0
.end method

.method public static final n(ZZLR0/Q;Lmh/l;LT/l;II)LT/z1;
    .locals 15

    move-object/from16 v7, p4

    move/from16 v0, p5

    const v1, 0x5a6919cc

    invoke-interface {v7, v1}, LT/l;->U(I)V

    and-int/lit8 v2, p6, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, p0

    :goto_0
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move/from16 v4, p1

    :goto_1
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_2

    new-instance v5, LR0/Q;

    const/4 v13, 0x6

    const/4 v14, 0x0

    const-string v9, ""

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object v8, v5

    invoke-direct/range {v8 .. v14}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object/from16 v5, p2

    :goto_2
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_4

    const v6, -0x2833c635

    invoke-interface {v7, v6}, LT/l;->U(I)V

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_3

    new-instance v6, LBe/c0;

    invoke-direct {v6}, LBe/c0;-><init>()V

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Lmh/l;

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    goto :goto_3

    :cond_4
    move-object/from16 v6, p3

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_5

    const/4 v8, -0x1

    const-string v9, "com.ui.wifiman.ui.component.rememberUiSearchBoxController (UiSearchBox.kt:114)"

    invoke-static {v1, v0, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v6}, LBe/m0;->j(Lmh/l;)Lc0/k;

    move-result-object v8

    const v9, -0x2833b5f2

    invoke-interface {v7, v9}, LT/l;->U(I)V

    and-int/lit8 v9, v0, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/4 v10, 0x4

    const/4 v11, 0x1

    if-le v9, v10, :cond_6

    invoke-interface {v7, v2}, LT/l;->c(Z)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    and-int/lit8 v9, v0, 0x6

    if-ne v9, v10, :cond_8

    :cond_7
    move v9, v11

    goto :goto_4

    :cond_8
    move v9, v3

    :goto_4
    and-int/lit8 v10, v0, 0x70

    xor-int/lit8 v10, v10, 0x30

    const/16 v12, 0x20

    if-le v10, v12, :cond_9

    invoke-interface {v7, v4}, LT/l;->c(Z)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    and-int/lit8 v10, v0, 0x30

    if-ne v10, v12, :cond_b

    :cond_a
    move v10, v11

    goto :goto_5

    :cond_b
    move v10, v3

    :goto_5
    or-int/2addr v9, v10

    and-int/lit16 v10, v0, 0x380

    xor-int/lit16 v10, v10, 0x180

    const/16 v12, 0x100

    if-le v10, v12, :cond_c

    invoke-interface {v7, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    and-int/lit16 v10, v0, 0x180

    if-ne v10, v12, :cond_e

    :cond_d
    move v10, v11

    goto :goto_6

    :cond_e
    move v10, v3

    :goto_6
    or-int/2addr v9, v10

    and-int/lit16 v10, v0, 0x1c00

    xor-int/lit16 v10, v10, 0xc00

    const/16 v12, 0x800

    if-le v10, v12, :cond_f

    invoke-interface {v7, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    :cond_f
    and-int/lit16 v0, v0, 0xc00

    if-ne v0, v12, :cond_11

    :cond_10
    move v3, v11

    :cond_11
    or-int v0, v9, v3

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_12

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_13

    :cond_12
    new-instance v3, LBe/d0;

    invoke-direct {v3, v2, v4, v5, v6}, LBe/d0;-><init>(ZZLR0/Q;Lmh/l;)V

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v3, Lmh/a;

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v0, v1

    move-object v1, v8

    move-object/from16 v4, p4

    invoke-static/range {v0 .. v6}, Lc0/c;->d([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)LT/q0;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    return-object v0
.end method

.method private static final o(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(ZZLR0/Q;Lmh/l;)LT/q0;
    .locals 1

    new-instance v0, LBe/b0;

    invoke-direct {v0, p0, p1, p2, p3}, LBe/b0;-><init>(ZZLR0/Q;Lmh/l;)V

    const/4 p0, 0x0

    const/4 p1, 0x2

    invoke-static {v0, p0, p1, p0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p0

    return-object p0
.end method

.method public static final q(LT/l;I)LBe/n0;
    .locals 3

    const v0, -0x6f2116b1

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.rememberUiSearchBoxVisibilityState (UiSearchBox.kt:144)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x4ca64145

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    new-instance p1, LBe/n0;

    invoke-direct {p1}, LBe/n0;-><init>()V

    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, LBe/n0;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method
