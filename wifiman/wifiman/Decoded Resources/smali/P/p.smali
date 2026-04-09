.class public abstract LP/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lr/r0;

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0xf

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, LP/p;->a:Lr/r0;

    return-void
.end method

.method public static final synthetic a(Ly/j;)Lr/i;
    .locals 0

    invoke-static {p0}, LP/p;->d(Ly/j;)Lr/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ly/j;)Lr/i;
    .locals 0

    invoke-static {p0}, LP/p;->e(Ly/j;)Lr/i;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly/k;ZFLm0/y0;Lmh/a;)LE0/j;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LP/t;->d(Ly/k;ZFLm0/y0;Lmh/a;)LE0/j;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ly/j;)Lr/i;
    .locals 7

    instance-of v0, p0, Ly/g;

    if-eqz v0, :cond_0

    sget-object p0, LP/p;->a:Lr/r0;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ly/d;

    if-eqz v0, :cond_1

    new-instance p0, Lr/r0;

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/16 v2, 0x2d

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    instance-of p0, p0, Ly/b;

    if-eqz p0, :cond_2

    new-instance p0, Lr/r0;

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0x2d

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    sget-object p0, LP/p;->a:Lr/r0;

    :goto_0
    return-object p0
.end method

.method private static final e(Ly/j;)Lr/i;
    .locals 6

    instance-of v0, p0, Ly/g;

    if-eqz v0, :cond_0

    sget-object p0, LP/p;->a:Lr/r0;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ly/d;

    if-eqz v0, :cond_1

    sget-object p0, LP/p;->a:Lr/r0;

    goto :goto_0

    :cond_1
    instance-of p0, p0, Ly/b;

    if-eqz p0, :cond_2

    new-instance p0, Lr/r0;

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0x96

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    sget-object p0, LP/p;->a:Lr/r0;

    :goto_0
    return-object p0
.end method

.method public static final f(ZFJLT/l;II)Ls/G;
    .locals 4

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_1

    sget-object p1, LY0/h;->b:LY0/h$a;

    invoke-virtual {p1}, LY0/h$a;->c()F

    move-result p1

    :cond_1
    const/4 v0, 0x4

    and-int/2addr p6, v0

    if-eqz p6, :cond_2

    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->e()J

    move-result-wide p2

    :cond_2
    invoke-static {}, LT/o;->H()Z

    move-result p6

    if-eqz p6, :cond_3

    const/4 p6, -0x1

    const-string v2, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)"

    const v3, 0x61769d80

    invoke-static {v3, p5, p6, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p2, p3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p2

    shr-int/lit8 p3, p5, 0x6

    and-int/lit8 p3, p3, 0xe

    invoke-static {p2, p4, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p2

    and-int/lit8 p3, p5, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 p6, 0x0

    if-le p3, v0, :cond_4

    invoke-interface {p4, p0}, LT/l;->c(Z)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_4
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v0, :cond_6

    :cond_5
    move p3, v1

    goto :goto_0

    :cond_6
    move p3, p6

    :goto_0
    and-int/lit8 v0, p5, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-le v0, v2, :cond_7

    invoke-interface {p4, p1}, LT/l;->g(F)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_7
    and-int/lit8 p5, p5, 0x30

    if-ne p5, v2, :cond_8

    goto :goto_1

    :cond_8
    move v1, p6

    :cond_9
    :goto_1
    or-int/2addr p3, v1

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_a

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p5, p3, :cond_b

    :cond_a
    new-instance p5, LP/e;

    const/4 p3, 0x0

    invoke-direct {p5, p0, p1, p2, p3}, LP/e;-><init>(ZFLT/z1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast p5, LP/e;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    return-object p5
.end method
