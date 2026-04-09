.class public abstract LL9/O;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LL9/O;->f(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LL9/O;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;LT/l;II)V
    .locals 8

    const-string/jumbo v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x30a0e84e

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_2

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_2
    move v1, p5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p5, 0x30

    if-nez v3, :cond_5

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, p5, 0x180

    if-nez v4, :cond_8

    invoke-interface {p4, p2}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v5, p5, 0xc00

    if-nez v5, :cond_b

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_6

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v1, v5

    :cond_b
    :goto_7
    and-int/lit16 v5, v1, 0x493

    const/16 v6, 0x492

    if-ne v5, v6, :cond_e

    invoke-interface {p4}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {p4}, LT/l;->C()V

    :cond_d
    :goto_8
    move-object v3, p1

    move v4, p2

    move-object v5, p3

    goto/16 :goto_c

    :cond_e
    :goto_9
    if-eqz v2, :cond_f

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_f
    const/4 v2, 0x1

    if-eqz v3, :cond_10

    move p2, v2

    :cond_10
    if-eqz v4, :cond_12

    const p3, -0xd78a374

    invoke-interface {p4, p3}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne p3, v3, :cond_11

    new-instance p3, LL9/M;

    invoke-direct {p3}, LL9/M;-><init>()V

    invoke-interface {p4, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast p3, Lmh/a;

    invoke-interface {p4}, LT/l;->J()V

    :cond_12
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_13

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.toolbar.UiToolbarTextButton (UiToolbarTextButton.kt:21)"

    invoke-static {v0, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_13
    if-eqz p2, :cond_14

    const v0, -0xd789992

    invoke-interface {p4, v0}, LT/l;->U(I)V

    sget-object v0, LN/r;->a:LN/r;

    sget v1, LN/r;->b:I

    invoke-virtual {v0, p4, v1}, LN/r;->c(LT/l;I)F

    move-result v0

    :goto_a
    invoke-interface {p4}, LT/l;->J()V

    goto :goto_b

    :cond_14
    const v0, -0xd7896ae

    invoke-interface {p4, v0}, LT/l;->U(I)V

    sget-object v0, LN/r;->a:LN/r;

    sget v1, LN/r;->b:I

    invoke-virtual {v0, p4, v1}, LN/r;->b(LT/l;I)F

    move-result v0

    goto :goto_a

    :goto_b
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p4, v1}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v0

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v1

    invoke-static {v0}, LL9/O;->e(LT/z1;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, LL9/O$a;

    invoke-direct {v1, p1, p2, p3, p0}, LL9/O$a;-><init>(Landroidx/compose/ui/e;ZLmh/a;Ljava/lang/String;)V

    const/16 v3, 0x36

    const v4, 0x65b57c72

    invoke-static {v4, v2, v1, p4, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p4, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_8

    :goto_c
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_15

    new-instance p2, LL9/N;

    move-object v1, p2

    move-object v2, p0

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, LL9/N;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;II)V

    invoke-interface {p1, p2}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final f(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;IILT/l;I)LYg/J;
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

    invoke-static/range {v0 .. v6}, LL9/O;->c(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
