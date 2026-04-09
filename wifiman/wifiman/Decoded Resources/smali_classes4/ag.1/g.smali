.class public interface abstract Lag/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# virtual methods
.method public A0()Z
    .locals 2

    invoke-interface {p0}, Lag/g;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public abstract B0(I)Z
.end method

.method public abstract G([B)[B
.end method

.method public abstract H0()Z
.end method

.method public abstract L()Z
.end method

.method public abstract O()Z
.end method

.method public abstract R()Ljava/math/BigInteger;
.end method

.method public abstract R0([B)[B
.end method

.method public abstract c0()Z
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lag/g;

    invoke-interface {p0, p1}, Lag/g;->z0(Lag/g;)I

    move-result p1

    return p1
.end method

.method public abstract f()I
.end method

.method public getCount()Ljava/math/BigInteger;
    .locals 2

    invoke-interface {p0}, Lag/g;->R()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {p0}, Lag/g;->getValue()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public abstract getValue()Ljava/math/BigInteger;
.end method

.method public abstract u0(I)Z
.end method

.method public abstract v0()I
.end method

.method public w()Z
    .locals 1

    invoke-interface {p0}, Lag/g;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lag/g;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z0(Lag/g;)I
    .locals 1

    sget-object v0, Linet/ipaddr/a;->h:Linet/ipaddr/b;

    invoke-virtual {v0, p0, p1}, Linet/ipaddr/b;->e(Lag/g;Lag/g;)I

    move-result p1

    return p1
.end method
