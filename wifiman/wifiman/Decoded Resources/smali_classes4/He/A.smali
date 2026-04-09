.class public abstract LHe/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lof/a$c;Ls9/d;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LHe/A;->c(Landroidx/compose/ui/e;Lof/a$c;Ls9/d;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lof/a$c;Ls9/d;Lmh/q;LT/l;II)V
    .locals 8

    const-string v0, "accountVM"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x391aa324

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_2

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_2
    move v2, p5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

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
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, p5, 0x180

    if-nez v4, :cond_8

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v2, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v2, v2, 0xc00

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
    or-int/2addr v2, v5

    :cond_b
    :goto_7
    and-int/lit16 v5, v2, 0x493

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
    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    goto :goto_a

    :cond_e
    :goto_9
    if-eqz v1, :cond_f

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_f
    if-eqz v3, :cond_10

    const/4 p2, 0x0

    :cond_10
    if-eqz v4, :cond_11

    sget-object p3, LHe/c;->a:LHe/c;

    invoke-virtual {p3}, LHe/c;->a()Lmh/q;

    move-result-object p3

    :cond_11
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.component.toolbar.WifimanToolbar (WifimanToolbar.kt:17)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    new-instance v0, LHe/A$a;

    invoke-direct {v0, p2}, LHe/A$a;-><init>(Ls9/d;)V

    const/16 v1, 0x36

    const v3, -0x4e35be0e

    const/4 v4, 0x1

    invoke-static {v3, v4, v0, p4, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    and-int/lit8 v0, v2, 0xe

    or-int/lit16 v0, v0, 0x180

    and-int/lit8 v1, v2, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0x1c00

    or-int v6, v0, v1

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v7}, LHe/m;->b(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    goto :goto_8

    :goto_a
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance p2, LHe/z;

    move-object v1, p2

    move-object v3, p1

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, LHe/z;-><init>(Landroidx/compose/ui/e;Lof/a$c;Ls9/d;Lmh/q;II)V

    invoke-interface {p0, p2}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lof/a$c;Ls9/d;Lmh/q;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LHe/A;->b(Landroidx/compose/ui/e;Lof/a$c;Ls9/d;Lmh/q;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
