.class public abstract LS6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LS6/k;Landroidx/compose/ui/e;Lr0/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LS6/o;->c(LS6/k;Landroidx/compose/ui/e;Lr0/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LS6/k;Landroidx/compose/ui/e;Lr0/d;LT/l;I)V
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "painter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6cc9c9c6

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string/jumbo v3, "com.skydoves.landscapist.LandscapistImage (LandscapistImage.kt:28)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, LS6/k;->c()Lf0/c;

    move-result-object v4

    invoke-virtual {p0}, LS6/k;->g()LC0/h;

    move-result-object v5

    invoke-virtual {p0}, LS6/k;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, LS6/k;->d()F

    move-result v6

    invoke-virtual {p0}, LS6/k;->e()Lm0/w0;

    move-result-object v7

    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v9, v0, v1

    const/4 v10, 0x0

    move-object v1, p2

    move-object v3, p1

    move-object v8, p3

    invoke-static/range {v1 .. v10}, Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, LS6/n;

    invoke-direct {v0, p0, p1, p2, p4}, LS6/n;-><init>(LS6/k;Landroidx/compose/ui/e;Lr0/d;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final c(LS6/k;Landroidx/compose/ui/e;Lr0/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LS6/o;->b(LS6/k;Landroidx/compose/ui/e;Lr0/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
