.class public abstract Lr/P;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr/O;FFLr/N;Ljava/lang/String;LT/l;II)LT/z1;
    .locals 11

    move/from16 v0, p6

    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_0

    const-string v1, "FloatAnimation"

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object v7, p4

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)"

    const v3, -0x266e6c59

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    sget-object v1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v1}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v5

    and-int/lit16 v1, v0, 0x3fe

    shl-int/lit8 v0, v0, 0x3

    const v2, 0xe000

    and-int/2addr v2, v0

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    or-int v9, v1, v0

    const/4 v10, 0x0

    move-object v2, p0

    move-object v6, p3

    move-object/from16 v8, p5

    invoke-static/range {v2 .. v10}, Lr/P;->b(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-object v0
.end method

.method public static final b(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/N;Ljava/lang/String;LT/l;II)LT/z1;
    .locals 7

    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_0

    const-string p5, "ValueAnimation"

    :cond_0
    move-object v6, p5

    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string p8, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)"

    const v0, -0x3f59c4ef

    invoke-static {v0, p7, p5, p8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    sget-object p8, LT/l;->a:LT/l$a;

    invoke-virtual {p8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p5, v0, :cond_2

    new-instance p5, Lr/O$a;

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lr/O$a;-><init>(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/i;Ljava/lang/String;)V

    invoke-interface {p6, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p5, Lr/O$a;

    and-int/lit8 p3, p7, 0x70

    xor-int/lit8 p3, p3, 0x30

    const/16 v0, 0x20

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-le p3, v0, :cond_3

    invoke-interface {p6, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    and-int/lit8 p3, p7, 0x30

    if-ne p3, v0, :cond_5

    :cond_4
    move p3, v1

    goto :goto_0

    :cond_5
    move p3, v2

    :goto_0
    and-int/lit16 v0, p7, 0x380

    xor-int/lit16 v0, v0, 0x180

    const/16 v3, 0x100

    if-le v0, v3, :cond_6

    invoke-interface {p6, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    and-int/lit16 v0, p7, 0x180

    if-ne v0, v3, :cond_8

    :cond_7
    move v0, v1

    goto :goto_1

    :cond_8
    move v0, v2

    :goto_1
    or-int/2addr p3, v0

    const v0, 0xe000

    and-int/2addr v0, p7

    xor-int/lit16 v0, v0, 0x6000

    const/16 v3, 0x4000

    if-le v0, v3, :cond_9

    invoke-interface {p6, p4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_9
    and-int/lit16 p7, p7, 0x6000

    if-ne p7, v3, :cond_a

    goto :goto_2

    :cond_a
    move v1, v2

    :cond_b
    :goto_2
    or-int/2addr p3, v1

    invoke-interface {p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object p7

    if-nez p3, :cond_c

    invoke-virtual {p8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p7, p3, :cond_d

    :cond_c
    new-instance p7, Lr/P$a;

    invoke-direct {p7, p1, p5, p2, p4}, Lr/P$a;-><init>(Ljava/lang/Object;Lr/O$a;Ljava/lang/Object;Lr/N;)V

    invoke-interface {p6, p7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast p7, Lmh/a;

    invoke-static {p7, p6, v2}, LT/O;->g(Lmh/a;LT/l;I)V

    invoke-interface {p6, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_e

    invoke-virtual {p8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_f

    :cond_e
    new-instance p2, Lr/P$b;

    invoke-direct {p2, p0, p5}, Lr/P$b;-><init>(Lr/O;Lr/O$a;)V

    invoke-interface {p6, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast p2, Lmh/l;

    const/4 p0, 0x6

    invoke-static {p5, p2, p6, p0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    return-object p5
.end method

.method public static final c(Ljava/lang/String;LT/l;II)Lr/O;
    .locals 2

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-string p0, "InfiniteTransition"

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v0, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)"

    const v1, 0x3c6b1875

    invoke-static {v1, p2, p3, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_2

    new-instance p2, Lr/O;

    invoke-direct {p2, p0}, Lr/O;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lr/O;

    const/4 p0, 0x0

    invoke-virtual {p2, p1, p0}, Lr/O;->k(LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object p2
.end method
