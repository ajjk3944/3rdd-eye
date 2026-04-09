.class public abstract LI/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI/I;Ljava/lang/String;I)V
    .locals 2

    invoke-virtual {p0}, LI/I;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI/I;->i()I

    move-result v0

    invoke-virtual {p0}, LI/I;->h()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, LI/I;->q(IILjava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LI/I;->o()I

    move-result v0

    invoke-virtual {p0}, LI/I;->n()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, LI/I;->q(IILjava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {p0}, LI/I;->j()I

    move-result v0

    if-lez p2, :cond_1

    add-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    add-int/2addr v0, p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr v0, p1

    :goto_1
    const/4 p1, 0x0

    invoke-virtual {p0}, LI/I;->l()I

    move-result p2

    invoke-static {v0, p1, p2}, Lsh/m;->k(III)I

    move-result p1

    invoke-virtual {p0, p1}, LI/I;->s(I)V

    return-void
.end method

.method public static final b(LI/I;)V
    .locals 3

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1}, LI/I;->q(IILjava/lang/CharSequence;)V

    return-void
.end method

.method public static final c(LI/I;II)V
    .locals 2

    if-ltz p1, :cond_2

    if-ltz p2, :cond_2

    invoke-virtual {p0}, LI/I;->n()I

    move-result v0

    add-int v1, v0, p2

    xor-int/2addr v0, v1

    xor-int/2addr p2, v1

    and-int/2addr p2, v0

    if-gez p2, :cond_0

    invoke-virtual {p0}, LI/I;->l()I

    move-result v1

    :cond_0
    invoke-virtual {p0}, LI/I;->n()I

    move-result p2

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, p2, v0}, LI/I;->d(II)V

    invoke-virtual {p0}, LI/I;->o()I

    move-result p2

    sub-int v0, p2, p1

    xor-int/2addr p1, p2

    xor-int/2addr p2, v0

    and-int/2addr p1, p2

    const/4 p2, 0x0

    if-gez p1, :cond_1

    move v0, p2

    :cond_1
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, LI/I;->o()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LI/I;->d(II)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " respectively."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final d(LI/I;II)V
    .locals 6

    if-ltz p1, :cond_6

    if-ltz p2, :cond_6

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p1, :cond_2

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0}, LI/I;->o()I

    move-result v4

    if-le v4, v3, :cond_1

    invoke-virtual {p0}, LI/I;->o()I

    move-result v4

    sub-int/2addr v4, v3

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {p0, v4}, LI/I;->e(I)C

    move-result v4

    invoke-virtual {p0}, LI/I;->o()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-virtual {p0, v5}, LI/I;->e(I)C

    move-result v5

    invoke-static {v4, v5}, LI/H;->f(CC)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LI/I;->o()I

    move-result v2

    :cond_2
    move p1, v0

    :goto_2
    if-ge v0, p2, :cond_5

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {p0}, LI/I;->n()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p0}, LI/I;->l()I

    move-result v4

    if-ge v3, v4, :cond_4

    invoke-virtual {p0}, LI/I;->n()I

    move-result v3

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p0, v3}, LI/I;->e(I)C

    move-result v3

    invoke-virtual {p0}, LI/I;->n()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {p0, v4}, LI/I;->e(I)C

    move-result v4

    invoke-static {v3, v4}, LI/H;->f(CC)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 p1, p1, 0x2

    goto :goto_3

    :cond_3
    move p1, v1

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, LI/I;->l()I

    move-result p1

    invoke-virtual {p0}, LI/I;->n()I

    move-result p2

    sub-int/2addr p1, p2

    :cond_5
    invoke-virtual {p0}, LI/I;->n()I

    move-result p2

    invoke-virtual {p0}, LI/I;->n()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p2, v0}, LI/I;->d(II)V

    invoke-virtual {p0}, LI/I;->o()I

    move-result p1

    sub-int/2addr p1, v2

    invoke-virtual {p0}, LI/I;->o()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LI/I;->d(II)V

    return-void

    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " respectively."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final e(LI/I;)V
    .locals 0

    invoke-virtual {p0}, LI/I;->c()V

    return-void
.end method

.method private static final f(CC)Z
    .locals 0

    invoke-static {p0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g(LI/I;II)V
    .locals 2

    invoke-virtual {p0}, LI/I;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI/I;->c()V

    :cond_0
    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lsh/m;->k(III)I

    move-result p1

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    invoke-static {p2, v1, v0}, Lsh/m;->k(III)I

    move-result p2

    if-eq p1, p2, :cond_2

    if-ge p1, p2, :cond_1

    invoke-virtual {p0, p1, p2}, LI/I;->r(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2, p1}, LI/I;->r(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static final h(LI/I;Ljava/lang/String;I)V
    .locals 2

    invoke-virtual {p0}, LI/I;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI/I;->i()I

    move-result v0

    invoke-virtual {p0}, LI/I;->h()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, LI/I;->q(IILjava/lang/CharSequence;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v0, v1}, LI/I;->r(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LI/I;->o()I

    move-result v0

    invoke-virtual {p0}, LI/I;->n()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, LI/I;->q(IILjava/lang/CharSequence;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v0, v1}, LI/I;->r(II)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LI/I;->j()I

    move-result v0

    if-lez p2, :cond_2

    add-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    add-int/2addr v0, p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr v0, p1

    :goto_1
    const/4 p1, 0x0

    invoke-virtual {p0}, LI/I;->l()I

    move-result p2

    invoke-static {v0, p1, p2}, Lsh/m;->k(III)I

    move-result p1

    invoke-virtual {p0, p1}, LI/I;->s(I)V

    return-void
.end method
