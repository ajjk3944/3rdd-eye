.class public abstract LEe/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LEe/I;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LEe/I;->e(Landroidx/compose/ui/e;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lmh/a;LT/l;II)V
    .locals 9

    const v0, 0x39f400a2

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_8
    if-eqz v3, :cond_a

    const p1, -0x2104584d

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_9

    new-instance p1, LEe/G;

    invoke-direct {p1}, LEe/G;-><init>()V

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast p1, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    :cond_a
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.component.list.ListItemActionDeleteWidget (ListItemActionDeleteWidget.kt:15)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, LEe/c;->a:LEe/c;

    invoke-virtual {v1}, LEe/c;->a()Lmh/p;

    move-result-object v5

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v7, v1, 0x6000

    const/16 v8, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, v0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, LEe/H;

    invoke-direct {v0, p0, p1, p3, p4}, LEe/H;-><init>(Landroidx/compose/ui/e;Lmh/a;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LEe/I;->c(Landroidx/compose/ui/e;Lmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
