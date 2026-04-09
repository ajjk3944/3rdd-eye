.class public interface abstract Lag/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/g;
.implements Lcg/b;


# virtual methods
.method public abstract A()Ljava/lang/Integer;
.end method

.method public abstract f()I
.end method

.method public getCount()Ljava/math/BigInteger;
    .locals 5

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-interface {p0}, Lcg/b;->H()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p0, v2}, Lag/e;->k(I)Lag/f;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->A0()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Lag/g;->getCount()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public abstract i()Z
.end method

.method public abstract k(I)Lag/f;
.end method

.method public l0(Lag/e;)I
    .locals 1

    invoke-interface {p0}, Lag/g;->A0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lag/g;->A0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-interface {p1}, Lag/g;->A0()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-interface {p0}, Lag/e;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {p1}, Lag/e;->getCount()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public abstract u()Z
.end method

.method public abstract x()Z
.end method
