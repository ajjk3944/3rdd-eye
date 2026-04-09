.class public abstract Ltf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(ZLra/d;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltf/c;->c(ZLra/d;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZLra/d;Lmh/p;LT/l;II)V
    .locals 7

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2d6b4179

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    and-int/lit8 v1, p5, 0x1

    if-nez v1, :cond_0

    invoke-interface {p3, p0}, LT/l;->c(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_4

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_7

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, v1, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_a

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_7

    :cond_8
    invoke-interface {p3}, LT/l;->C()V

    :cond_9
    :goto_6
    move v2, p0

    move-object v3, p1

    goto :goto_a

    :cond_a
    :goto_7
    invoke-interface {p3}, LT/l;->q()V

    and-int/lit8 v3, p4, 0x1

    if-eqz v3, :cond_c

    invoke-interface {p3}, LT/l;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {p3}, LT/l;->C()V

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_e

    and-int/lit8 v1, v1, -0xf

    goto :goto_9

    :cond_c
    :goto_8
    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_d

    const/4 p0, 0x0

    invoke-static {p3, p0}, Ls/m;->a(LT/l;I)Z

    move-result p0

    and-int/lit8 v1, v1, -0xf

    :cond_d
    if-eqz v2, :cond_e

    sget-object p1, Lra/d;->COMPACT:Lra/d;

    :cond_e
    :goto_9
    invoke-interface {p3}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_f

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.theme.WifimanTheme (WifimanTheme.kt:12)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_f
    new-instance v0, Ltf/c$a;

    invoke-direct {v0, p2}, Ltf/c$a;-><init>(Lmh/p;)V

    const/16 v2, 0x36

    const v3, 0x14d93df

    const/4 v4, 0x1

    invoke-static {v3, v4, v0, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    and-int/lit8 v0, v1, 0xe

    or-int/lit16 v0, v0, 0x180

    and-int/lit8 v1, v1, 0x70

    or-int v5, v0, v1

    const/4 v6, 0x0

    move v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v6}, Lla/g;->j(ZLra/d;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    goto :goto_6

    :goto_a
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_10

    new-instance p1, Ltf/b;

    move-object v1, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Ltf/b;-><init>(ZLra/d;Lmh/p;II)V

    invoke-interface {p0, p1}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final c(ZLra/d;Lmh/p;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Ltf/c;->b(ZLra/d;Lmh/p;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
