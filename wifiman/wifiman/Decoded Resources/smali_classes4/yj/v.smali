.class public abstract Lyj/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([Lyj/u;Z)Lyj/f;
    .locals 1

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lzj/c;->Y()Lyj/f;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, Lzj/c;

    invoke-direct {p1, p0}, Lzj/c;-><init>([Lyj/u;)V

    return-object p1

    :cond_1
    new-instance p1, Lzj/c;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lyj/u;

    invoke-direct {p1, p0}, Lzj/c;-><init>([Lyj/u;)V

    return-object p1
.end method

.method public static b([BZ)Lyj/g;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lzj/e;

    invoke-direct {p1, p0}, Lzj/e;-><init>([B)V

    return-object p1

    :cond_0
    new-instance p1, Lzj/e;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    invoke-direct {p1, p0}, Lzj/e;-><init>([B)V

    return-object p1
.end method

.method public static c(Z)Lyj/h;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lzj/f;->b:Lyj/h;

    goto :goto_0

    :cond_0
    sget-object p0, Lzj/f;->c:Lyj/h;

    :goto_0
    return-object p0
.end method

.method public static d(B[B)Lyj/i;
    .locals 1

    new-instance v0, Lzj/h;

    invoke-direct {v0, p0, p1}, Lzj/h;-><init>(B[B)V

    return-object v0
.end method

.method public static e(D)Lyj/j;
    .locals 1

    new-instance v0, Lzj/g;

    invoke-direct {v0, p0, p1}, Lzj/g;-><init>(D)V

    return-object v0
.end method

.method public static f(J)Lyj/k;
    .locals 1

    new-instance v0, Lzj/i;

    invoke-direct {v0, p0, p1}, Lzj/i;-><init>(J)V

    return-object v0
.end method

.method public static g(Ljava/math/BigInteger;)Lyj/k;
    .locals 1

    new-instance v0, Lzj/d;

    invoke-direct {v0, p0}, Lzj/d;-><init>(Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public static h([Lyj/u;Z)Lyj/l;
    .locals 1

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lzj/j;->Z()Lyj/l;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, Lzj/j;

    invoke-direct {p1, p0}, Lzj/j;-><init>([Lyj/u;)V

    return-object p1

    :cond_1
    new-instance p1, Lzj/j;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lyj/u;

    invoke-direct {p1, p0}, Lzj/j;-><init>([Lyj/u;)V

    return-object p1
.end method

.method public static i()Lyj/m;
    .locals 1

    invoke-static {}, Lzj/k;->X()Lyj/m;

    move-result-object v0

    return-object v0
.end method

.method public static j([BZ)Lyj/n;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lzj/l;

    invoke-direct {p1, p0}, Lzj/l;-><init>([B)V

    return-object p1

    :cond_0
    new-instance p1, Lzj/l;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    invoke-direct {p1, p0}, Lzj/l;-><init>([B)V

    return-object p1
.end method
