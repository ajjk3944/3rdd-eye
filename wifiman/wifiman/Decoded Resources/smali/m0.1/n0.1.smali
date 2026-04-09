.class public interface abstract Lm0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic o(Lm0/n0;Ll0/i;IILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {p2}, Lm0/u0$a;->b()I

    move-result p2

    :cond_0
    invoke-interface {p0, p1, p2}, Lm0/n0;->i(Ll0/i;I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic p(Lm0/n0;FFFFIILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    sget-object p5, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {p5}, Lm0/u0$a;->b()I

    move-result p5

    :cond_0
    move v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lm0/n0;->b(FFFFI)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: clipRect-N_I0leg"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {p2}, Lm0/u0$a;->b()I

    move-result p2

    :cond_0
    invoke-interface {p0, p1, p2}, Lm0/n0;->d(Lm0/U0;I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract b(FFFFI)V
.end method

.method public abstract c(FF)V
.end method

.method public abstract d(Lm0/U0;I)V
.end method

.method public abstract e(FF)V
.end method

.method public abstract f(F)V
.end method

.method public abstract g(FFFFFFZLm0/S0;)V
.end method

.method public abstract h(JJLm0/S0;)V
.end method

.method public i(Ll0/i;I)V
    .locals 6

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result v4

    move-object v0, p0

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lm0/n0;->b(FFFFI)V

    return-void
.end method

.method public abstract j()V
.end method

.method public abstract k()V
.end method

.method public abstract l(Ll0/i;Lm0/S0;)V
.end method

.method public abstract m(Lm0/U0;Lm0/S0;)V
.end method

.method public abstract n([F)V
.end method

.method public abstract q(Lm0/J0;JLm0/S0;)V
.end method

.method public abstract r()V
.end method

.method public abstract s(Lm0/J0;JJJJLm0/S0;)V
.end method

.method public abstract u(FFFFFFLm0/S0;)V
.end method

.method public v(Ll0/i;Lm0/S0;)V
    .locals 6

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result v4

    move-object v0, p0

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lm0/n0;->x(FFFFLm0/S0;)V

    return-void
.end method

.method public abstract w(JFLm0/S0;)V
.end method

.method public abstract x(FFFFLm0/S0;)V
.end method

.method public abstract y()V
.end method
