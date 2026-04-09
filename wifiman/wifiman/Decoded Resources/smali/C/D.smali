.class public abstract LC/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:LC/u;

.field private static final c:LC/D$b;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LC/D;->a:F

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    sget-object v6, Lw/q;->Horizontal:Lw/q;

    sget-object v16, Lx/j$a;->a:Lx/j$a;

    new-instance v0, LC/D$a;

    move-object/from16 v17, v0

    invoke-direct {v0}, LC/D$a;-><init>()V

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v21

    new-instance v0, LC/u;

    move-object v1, v0

    const/high16 v22, 0x60000

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v23}, LC/u;-><init>(Ljava/util/List;IIILw/q;IIZILC/e;LC/e;FIZLx/j;LC0/D;ZLjava/util/List;Ljava/util/List;LIi/N;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC/D;->b:LC/u;

    new-instance v0, LC/D$b;

    invoke-direct {v0}, LC/D$b;-><init>()V

    sput-object v0, LC/D;->c:LC/D$b;

    return-void
.end method

.method public static final synthetic a(LB/h;IFLr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, LC/D;->d(LB/h;IFLr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LC/u;I)J
    .locals 0

    invoke-static {p0, p1}, LC/D;->h(LC/u;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c()LC/D$b;
    .locals 1

    sget-object v0, LC/D;->c:LC/D$b;

    return-object v0
.end method

.method private static final d(LB/h;IFLr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 8

    new-instance v7, LC/D$c;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p4

    move v2, p1

    move-object v3, p0

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, LC/D$c;-><init>(Lmh/p;ILB/h;FLr/i;Ldh/e;)V

    invoke-interface {p0, v7, p5}, LB/h;->d(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(LC/C;Ldh/e;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, LC/C;->v()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, LC/C;->F()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0}, LC/C;->v()I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LC/C;->n(LC/C;IFLr/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final f(LC/C;Ldh/e;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, LC/C;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    invoke-virtual {p0}, LC/C;->v()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LC/C;->n(LC/C;IFLr/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final g(LC/n;I)J
    .locals 10

    invoke-interface {p0}, LC/n;->j()I

    move-result v0

    invoke-interface {p0}, LC/n;->i()I

    move-result v1

    add-int/2addr v0, v1

    int-to-long v1, p1

    int-to-long v3, v0

    mul-long/2addr v1, v3

    invoke-interface {p0}, LC/n;->f()I

    move-result v0

    int-to-long v3, v0

    add-long/2addr v1, v3

    invoke-interface {p0}, LC/n;->c()I

    move-result v0

    int-to-long v3, v0

    add-long/2addr v1, v3

    invoke-interface {p0}, LC/n;->e()Lw/q;

    move-result-object v0

    sget-object v3, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v3, :cond_0

    invoke-interface {p0}, LC/n;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LC/n;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v0

    :goto_0
    invoke-interface {p0}, LC/n;->l()Lx/j;

    move-result-object v3

    invoke-interface {p0}, LC/n;->i()I

    move-result v5

    add-int/lit8 v8, p1, -0x1

    invoke-interface {p0}, LC/n;->f()I

    move-result v6

    invoke-interface {p0}, LC/n;->c()I

    move-result v7

    move v4, v0

    move v9, p1

    invoke-interface/range {v3 .. v9}, Lx/j;->a(IIIIII)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p0, p1, v0}, Lsh/m;->k(III)I

    move-result p0

    sub-int/2addr v0, p0

    int-to-long p0, v0

    sub-long/2addr v1, p0

    const-wide/16 p0, 0x0

    invoke-static {v1, v2, p0, p1}, Lsh/m;->e(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final h(LC/u;I)J
    .locals 8

    invoke-virtual {p0}, LC/u;->e()Lw/q;

    move-result-object v0

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LC/u;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LC/u;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    :goto_0
    invoke-virtual {p0}, LC/u;->l()Lx/j;

    move-result-object v1

    invoke-virtual {p0}, LC/u;->i()I

    move-result v3

    invoke-virtual {p0}, LC/u;->f()I

    move-result v4

    invoke-virtual {p0}, LC/u;->c()I

    move-result v5

    const/4 v6, 0x0

    move v2, v0

    move v7, p1

    invoke-interface/range {v1 .. v7}, Lx/j;->a(IIIIII)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p0, p1, v0}, Lsh/m;->k(III)I

    move-result p0

    int-to-long p0, p0

    return-wide p0
.end method

.method public static final i()F
    .locals 1

    sget v0, LC/D;->a:F

    return v0
.end method

.method public static final j()LC/u;
    .locals 1

    sget-object v0, LC/D;->b:LC/u;

    return-object v0
.end method

.method public static final k(IFLmh/a;LT/l;II)LC/C;
    .locals 10

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const/4 p1, 0x0

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_2

    const/4 p5, -0x1

    const-string v0, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)"

    const v2, -0x482adcfd

    invoke-static {v2, p4, p5, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-array v3, v1, [Ljava/lang/Object;

    sget-object p5, LC/b;->L:LC/b$c;

    invoke-virtual {p5}, LC/b$c;->a()Lc0/k;

    move-result-object v4

    and-int/lit8 p5, p4, 0xe

    xor-int/lit8 p5, p5, 0x6

    const/4 v0, 0x4

    const/4 v2, 0x1

    if-le p5, v0, :cond_3

    invoke-interface {p3, p0}, LT/l;->i(I)Z

    move-result p5

    if-nez p5, :cond_4

    :cond_3
    and-int/lit8 p5, p4, 0x6

    if-ne p5, v0, :cond_5

    :cond_4
    move p5, v2

    goto :goto_0

    :cond_5
    move p5, v1

    :goto_0
    and-int/lit8 v0, p4, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v5, 0x20

    if-le v0, v5, :cond_6

    invoke-interface {p3, p1}, LT/l;->g(F)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    and-int/lit8 v0, p4, 0x30

    if-ne v0, v5, :cond_8

    :cond_7
    move v0, v2

    goto :goto_1

    :cond_8
    move v0, v1

    :goto_1
    or-int/2addr p5, v0

    and-int/lit16 v0, p4, 0x380

    xor-int/lit16 v0, v0, 0x180

    const/16 v5, 0x100

    if-le v0, v5, :cond_9

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    and-int/lit16 p4, p4, 0x180

    if-ne p4, v5, :cond_b

    :cond_a
    move v1, v2

    :cond_b
    or-int p4, p5, v1

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_c

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p5, p4, :cond_d

    :cond_c
    new-instance p5, LC/D$d;

    invoke-direct {p5, p0, p1, p2}, LC/D$d;-><init>(IFLmh/a;)V

    invoke-interface {p3, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v6, p5

    check-cast v6, Lmh/a;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p3

    invoke-static/range {v3 .. v9}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC/b;

    invoke-virtual {p0}, LC/b;->m0()LT/q0;

    move-result-object p1

    invoke-interface {p1, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    return-object p0
.end method
