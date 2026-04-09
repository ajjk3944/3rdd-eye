.class public abstract LQe/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQe/k;

    invoke-direct {v0}, LQe/k;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQe/q;->a:LT/H0;

    new-instance v0, LQe/l;

    invoke-direct {v0}, LQe/l;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQe/q;->b:LT/H0;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LQe/q;->j(Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LQe/q;->m(Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LQe/d;)LYg/J;
    .locals 0

    invoke-static {p0}, LQe/q;->l(LQe/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/ui/wifiman/ui/teleport/consoles/i;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LQe/q;->o(Lcom/ui/wifiman/ui/teleport/consoles/i;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()LHe/p;
    .locals 1

    invoke-static {}, LQe/q;->h()LHe/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lcom/ui/wifiman/ui/teleport/consoles/i;
    .locals 1

    invoke-static {}, LQe/q;->g()Lcom/ui/wifiman/ui/teleport/consoles/i;

    move-result-object v0

    return-object v0
.end method

.method private static final g()Lcom/ui/wifiman/ui/teleport/consoles/i;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No TeleportConsolePickerVM set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final h()LHe/p;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No WifimanToolbarDropdown set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final i(Landroidx/compose/ui/e;LT/l;II)V
    .locals 9

    const v0, -0xabbd7a0

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, p2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p2, 0x6

    if-nez v3, :cond_2

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    or-int/2addr v3, p2

    goto :goto_1

    :cond_2
    move v3, p2

    :goto_1
    and-int/lit8 v4, v3, 0x3

    if-ne v4, v2, :cond_4

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.root.WiFimanRootDropdownOverlay (WifimanRootUi.kt:153)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, LQe/q;->a:LT/H0;

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LHe/p;

    sget-object v0, LQe/a;->a:LQe/a;

    invoke-virtual {v0}, LQe/a;->g()Lmh/q;

    move-result-object v5

    and-int/lit8 v0, v3, 0xe

    or-int/lit16 v7, v0, 0xc00

    const/4 v8, 0x4

    const-wide/16 v3, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-static/range {v1 .. v8}, LHe/v;->f(Landroidx/compose/ui/e;LHe/p;JLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, LQe/m;

    invoke-direct {v0, p0, p2, p3}, LQe/m;-><init>(Landroidx/compose/ui/e;II)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final j(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LQe/q;->i(Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/e;LT/l;II)V
    .locals 18

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, -0x6fdca7e7

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v13, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v4

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v6, 0x3

    if-ne v7, v4, :cond_4

    invoke-interface {v13}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v13}, LT/l;->C()V

    goto/16 :goto_5

    :cond_4
    :goto_2
    if-eqz v3, :cond_5

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v3

    goto :goto_3

    :cond_5
    move-object v14, v5

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.root.WiFimanRootNavigation (WifimanRootUi.kt:65)"

    invoke-static {v2, v6, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/4 v2, 0x0

    const/4 v15, 0x1

    const/4 v12, 0x0

    invoke-static {v14, v2, v15, v12}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    const/4 v11, 0x0

    invoke-static {v3, v4, v13, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v13, v11}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v13, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v13}, LT/l;->I()V

    :goto_4
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v2, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-static {}, LQe/i;->f()LT/H0;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQe/d;

    new-array v4, v11, [Lf2/D;

    invoke-static {v4, v13, v11}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v4

    invoke-static {v13, v11}, LBe/m0;->q(LT/l;I)LBe/n0;

    move-result-object v5

    invoke-static {}, LBe/m0;->m()LT/H0;

    move-result-object v6

    invoke-virtual {v6, v5}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v6

    new-instance v7, LQe/q$a;

    invoke-direct {v7, v3, v4, v2}, LQe/q$a;-><init>(Lz/j;Lf2/w;LQe/d;)V

    const v4, -0x2438e4dd

    const/16 v8, 0x36

    invoke-static {v4, v15, v7, v13, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    sget v7, LT/I0;->i:I

    or-int/lit8 v7, v7, 0x30

    invoke-static {v6, v4, v13, v7}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-virtual {v5}, LBe/n0;->a()LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    xor-int/2addr v4, v15

    new-instance v5, LQe/q$b;

    invoke-direct {v5, v2}, LQe/q$b;-><init>(LQe/d;)V

    const v6, -0x263453f5

    invoke-static {v6, v15, v5, v13, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v16, 0x180006

    const/16 v17, 0x1e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v13

    move/from16 v11, v16

    move-object/from16 v16, v14

    move-object v14, v12

    move/from16 v12, v17

    invoke-static/range {v3 .. v12}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v2}, LQe/d;->e()LLi/N;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v14, v13, v4, v15}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const v5, -0x4cf3bbbc

    invoke-interface {v13, v5}, LT/l;->U(I)V

    invoke-interface {v13, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_b

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_c

    :cond_b
    new-instance v6, LQe/n;

    invoke-direct {v6, v2}, LQe/n;-><init>(LQe/d;)V

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lmh/a;

    invoke-interface {v13}, LT/l;->J()V

    invoke-static {v3, v6, v13, v4, v4}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-interface {v13}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    move-object/from16 v5, v16

    :goto_5
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v3, LQe/o;

    invoke-direct {v3, v5, v0, v1}, LQe/o;-><init>(Landroidx/compose/ui/e;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final l(LQe/d;)LYg/J;
    .locals 0

    invoke-interface {p0}, LQe/d;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LQe/q;->k(Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final n(Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V
    .locals 12

    const/4 v0, 0x1

    const v1, 0x2de08699

    invoke-interface {p1, v1}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    and-int/lit8 v2, p3, 0x1

    if-nez v2, :cond_0

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, p2

    move v10, v2

    goto :goto_1

    :cond_1
    move v10, p2

    :goto_1
    and-int/lit8 v2, v10, 0x3

    if-ne v2, v3, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_7

    :cond_3
    :goto_2
    invoke-interface {p1}, LT/l;->q()V

    and-int/lit8 v2, p2, 0x1

    const/4 v11, 0x0

    if-eqz v2, :cond_5

    invoke-interface {p1}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {p1}, LT/l;->C()V

    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_9

    :goto_3
    and-int/lit8 v10, v10, -0xf

    goto/16 :goto_5

    :cond_5
    :goto_4
    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_9

    const p0, -0x72e5f4af

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lc2/a;->a:Lc2/a;

    sget v2, Lc2/a;->c:I

    invoke-virtual {p0, p1, v2}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p0

    invoke-interface {p1, p0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Landroidx/lifecycle/P$c;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const-class v2, Lcom/ui/wifiman/ui/teleport/consoles/i;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v9}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v2

    invoke-interface {p1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v3

    invoke-interface {p1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {p1, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    const v5, 0x318a4a49

    invoke-interface {p1, v5}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {p1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_7

    :cond_6
    new-instance v6, Lye/i;

    invoke-direct {v6, p0, v2, v3}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {v4, v6, p1, v11}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    check-cast p0, Lcom/ui/wifiman/ui/teleport/consoles/i;

    goto/16 :goto_3

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    :goto_5
    invoke-interface {p1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.root.WiFimanRootUi (WifimanRootUi.kt:42)"

    invoke-static {v1, v10, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v2

    invoke-static {p1, v11}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {p1, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_c
    invoke-interface {p1}, LT/l;->I()V

    :goto_6
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v2, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v7, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v7, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v3, p1, v11, v0}, LHe/v;->m(LHe/q;LT/l;II)LHe/p;

    move-result-object v0

    sget-object v1, LQe/q;->a:LT/H0;

    invoke-virtual {v1, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    sget-object v1, LQe/q;->b:LT/H0;

    invoke-virtual {v1, p0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    filled-new-array {v0, v1}, [LT/I0;

    move-result-object v0

    sget-object v1, LQe/a;->a:LQe/a;

    invoke-virtual {v1}, LQe/a;->a()Lmh/p;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p1, v2}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_7
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_10

    new-instance v0, LQe/j;

    invoke-direct {v0, p0, p2, p3}, LQe/j;-><init>(Lcom/ui/wifiman/ui/teleport/consoles/i;II)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final o(Lcom/ui/wifiman/ui/teleport/consoles/i;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LQe/q;->n(Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic p(Landroidx/compose/ui/e;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQe/q;->i(Landroidx/compose/ui/e;LT/l;II)V

    return-void
.end method

.method public static final synthetic q(Landroidx/compose/ui/e;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQe/q;->k(Landroidx/compose/ui/e;LT/l;II)V

    return-void
.end method

.method public static final r()LT/H0;
    .locals 1

    sget-object v0, LQe/q;->b:LT/H0;

    return-object v0
.end method

.method public static final s()LT/H0;
    .locals 1

    sget-object v0, LQe/q;->a:LT/H0;

    return-object v0
.end method
