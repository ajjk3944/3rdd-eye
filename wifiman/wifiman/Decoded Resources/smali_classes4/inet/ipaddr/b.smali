.class public abstract Linet/ipaddr/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/b$a;,
        Linet/ipaddr/b$b;
    }
.end annotation


# instance fields
.field protected final a:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Linet/ipaddr/b;->a:Z

    return-void
.end method

.method protected static h(Lag/e;Lag/e;)I
    .locals 4

    invoke-interface {p0}, Lcg/b;->H()I

    move-result v0

    invoke-interface {p1}, Lcg/b;->H()I

    move-result v1

    sub-int v1, v0, v1

    if-nez v1, :cond_1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Lag/e;->k(I)Lag/f;

    move-result-object v1

    invoke-interface {v1}, Lag/g;->f()I

    move-result v1

    invoke-interface {p1, v2}, Lag/e;->k(I)Lag/f;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->f()I

    move-result v3

    sub-int/2addr v1, v3

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method static n(J)I
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method private static o(Lag/f;)I
    .locals 1

    instance-of v0, p0, Linet/ipaddr/ipv6/V;

    if-eqz v0, :cond_0

    const/4 p0, 0x4

    return p0

    :cond_0
    instance-of p0, p0, Linet/ipaddr/ipv4/M;

    if-eqz p0, :cond_1

    const/4 p0, 0x3

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static p(Lag/e;)I
    .locals 1

    instance-of v0, p0, Linet/ipaddr/ipv6/Q;

    if-eqz v0, :cond_0

    const/4 p0, 0x6

    return p0

    :cond_0
    instance-of v0, p0, Linet/ipaddr/ipv4/I;

    if-eqz v0, :cond_1

    const/4 p0, 0x4

    return p0

    :cond_1
    instance-of v0, p0, Linet/ipaddr/ipv6/Q$i;

    if-eqz v0, :cond_2

    const/4 p0, 0x5

    return p0

    :cond_2
    instance-of v0, p0, Lbg/f;

    if-eqz v0, :cond_3

    const/4 p0, -0x1

    return p0

    :cond_3
    instance-of p0, p0, Lbg/d;

    if-eqz p0, :cond_4

    const/4 p0, -0x3

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method private static q(Linet/ipaddr/m;)I
    .locals 1

    instance-of v0, p0, Linet/ipaddr/ipv4/Y;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of p0, p0, Linet/ipaddr/ipv6/i0;

    if-eqz p0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(LZf/c;LZf/c;)I
    .locals 2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Linet/ipaddr/b;->p(Lag/e;)I

    move-result v0

    invoke-static {p2}, Linet/ipaddr/b;->p(Lag/e;)I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    return v0

    :cond_1
    instance-of v0, p1, Linet/ipaddr/ipv6/Q;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Linet/ipaddr/ipv6/Q;

    move-object v1, p2

    check-cast v1, Linet/ipaddr/ipv6/Q;

    iget v1, v1, Linet/ipaddr/ipv6/Q;->v:I

    iget v0, v0, Linet/ipaddr/ipv6/Q;->v:I

    sub-int/2addr v1, v0

    if-eqz v1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->i(LZf/c;LZf/c;)I

    move-result p1

    return p1
.end method

.method public b(LZf/d;LZf/d;)I
    .locals 2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Linet/ipaddr/b;->o(Lag/f;)I

    move-result v0

    invoke-static {p2}, Linet/ipaddr/b;->o(Lag/f;)I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-interface {p1}, LZf/d;->w0()I

    move-result v0

    invoke-interface {p1}, LZf/d;->Q()I

    move-result p1

    invoke-interface {p2}, LZf/d;->w0()I

    move-result v1

    invoke-interface {p2}, LZf/d;->Q()I

    move-result p2

    invoke-virtual {p0, v0, p1, v1, p2}, Linet/ipaddr/b;->k(IIII)I

    move-result p1

    return p1
.end method

.method public c(Lag/e;Lag/e;)I
    .locals 2

    instance-of v0, p1, Linet/ipaddr/a;

    if-eqz v0, :cond_2

    instance-of v0, p2, Linet/ipaddr/a;

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/a;

    check-cast p2, Linet/ipaddr/a;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->f(Linet/ipaddr/a;Linet/ipaddr/a;)I

    move-result p1

    return p1

    :cond_0
    iget-boolean v0, p0, Linet/ipaddr/b;->a:Z

    if-eqz v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    check-cast p1, Linet/ipaddr/a;

    invoke-virtual {p1}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p2, Linet/ipaddr/a;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Linet/ipaddr/b;->a:Z

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    check-cast p2, Linet/ipaddr/a;

    invoke-virtual {p2}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object p2

    :cond_4
    :goto_0
    instance-of v0, p1, LZf/c;

    if-eqz v0, :cond_5

    instance-of v0, p2, LZf/c;

    if-eqz v0, :cond_5

    check-cast p1, LZf/c;

    check-cast p2, LZf/c;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->a(LZf/c;LZf/c;)I

    move-result p1

    return p1

    :cond_5
    if-ne p1, p2, :cond_6

    const/4 p1, 0x0

    return p1

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p1}, Linet/ipaddr/b;->p(Lag/e;)I

    move-result v0

    invoke-static {p2}, Linet/ipaddr/b;->p(Lag/e;)I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_7

    return v0

    :cond_7
    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->j(Lag/e;Lag/e;)I

    move-result p1

    return p1
.end method

.method public d(Lag/f;Lag/f;)I
    .locals 9

    instance-of v0, p1, LZf/d;

    if-eqz v0, :cond_0

    instance-of v0, p2, LZf/d;

    if-eqz v0, :cond_0

    check-cast p1, LZf/d;

    check-cast p2, LZf/d;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->b(LZf/d;LZf/d;)I

    move-result p1

    return p1

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Linet/ipaddr/b;->o(Lag/f;)I

    move-result v0

    invoke-static {p2}, Linet/ipaddr/b;->o(Lag/f;)I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_2

    return v0

    :cond_2
    iget-boolean v0, p0, Linet/ipaddr/b;->a:Z

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lag/g;->f()I

    move-result v0

    invoke-interface {p2}, Lag/g;->f()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_3

    return v0

    :cond_3
    instance-of v0, p1, Lbg/b;

    if-eqz v0, :cond_4

    instance-of v0, p2, Lbg/b;

    if-eqz v0, :cond_4

    check-cast p1, Lbg/b;

    check-cast p2, Lbg/b;

    invoke-virtual {p1}, Lbg/b;->a2()J

    move-result-wide v1

    invoke-virtual {p1}, Lbg/b;->W1()J

    move-result-wide v3

    invoke-virtual {p2}, Lbg/b;->a2()J

    move-result-wide v5

    invoke-virtual {p2}, Lbg/b;->W1()J

    move-result-wide v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Linet/ipaddr/b;->l(JJJJ)I

    move-result p1

    return p1

    :cond_4
    invoke-interface {p1}, Lag/g;->R()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {p1}, Lag/g;->getValue()Ljava/math/BigInteger;

    move-result-object p1

    invoke-interface {p2}, Lag/g;->R()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p2}, Lag/g;->getValue()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p0, v0, p1, v1, p2}, Linet/ipaddr/b;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public e(Lag/g;Lag/g;)I
    .locals 6

    instance-of v0, p1, Lag/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    instance-of v0, p2, Lag/e;

    if-eqz v0, :cond_0

    check-cast p1, Lag/e;

    check-cast p2, Lag/e;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->c(Lag/e;Lag/e;)I

    move-result p1

    return p1

    :cond_0
    iget-boolean v0, p0, Linet/ipaddr/b;->a:Z

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-interface {p1}, Lag/g;->A0()Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p1, Lag/e;

    invoke-interface {p1}, Lcg/b;->H()I

    move-result v0

    if-lez v0, :cond_2

    return v2

    :cond_2
    invoke-interface {p1, v1}, Lag/e;->k(I)Lag/f;

    move-result-object p1

    :cond_3
    instance-of v0, p1, Lag/f;

    const/4 v3, -0x1

    if-eqz v0, :cond_5

    instance-of v4, p2, Lag/f;

    if-eqz v4, :cond_4

    check-cast p1, Lag/f;

    check-cast p2, Lag/f;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->d(Lag/f;Lag/f;)I

    move-result p1

    return p1

    :cond_4
    iget-boolean v4, p0, Linet/ipaddr/b;->a:Z

    if-eqz v4, :cond_8

    return v3

    :cond_5
    instance-of v4, p1, Linet/ipaddr/m;

    if-eqz v4, :cond_8

    instance-of v4, p2, Linet/ipaddr/m;

    if-eqz v4, :cond_6

    check-cast p1, Linet/ipaddr/m;

    check-cast p2, Linet/ipaddr/m;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->g(Linet/ipaddr/m;Linet/ipaddr/m;)I

    move-result p1

    return p1

    :cond_6
    iget-boolean v4, p0, Linet/ipaddr/b;->a:Z

    if-eqz v4, :cond_8

    instance-of p1, p2, Lag/e;

    if-eqz p1, :cond_7

    return v3

    :cond_7
    return v2

    :cond_8
    iget-boolean v4, p0, Linet/ipaddr/b;->a:Z

    if-eqz v4, :cond_b

    instance-of v5, p2, Lag/e;

    if-eqz v5, :cond_9

    return v3

    :cond_9
    instance-of v5, p2, Lag/f;

    if-eqz v5, :cond_a

    return v2

    :cond_a
    instance-of v5, p2, Linet/ipaddr/m;

    if-eqz v5, :cond_b

    return v3

    :cond_b
    if-ne p1, p2, :cond_c

    return v1

    :cond_c
    if-eqz v4, :cond_d

    invoke-interface {p1}, Lag/g;->f()I

    move-result v3

    invoke-interface {p2}, Lag/g;->f()I

    move-result v4

    sub-int/2addr v3, v4

    if-eqz v3, :cond_d

    return v3

    :cond_d
    instance-of v3, p2, Lag/e;

    if-eqz v3, :cond_10

    move-object v3, p2

    check-cast v3, Lag/e;

    invoke-interface {p2}, Lag/g;->A0()Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {v3}, Lcg/b;->H()I

    move-result p2

    if-lez p2, :cond_e

    return v2

    :cond_e
    if-eqz v0, :cond_f

    check-cast p1, Lag/f;

    invoke-interface {v3, v1}, Lag/e;->k(I)Lag/f;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b;->d(Lag/f;Lag/f;)I

    move-result p1

    return p1

    :cond_f
    invoke-interface {v3, v1}, Lag/e;->k(I)Lag/f;

    move-result-object p2

    :cond_10
    invoke-interface {p1}, Lag/g;->R()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {p1}, Lag/g;->getValue()Ljava/math/BigInteger;

    move-result-object p1

    invoke-interface {p2}, Lag/g;->R()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p2}, Lag/g;->getValue()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p0, v0, p1, v1, p2}, Linet/ipaddr/b;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public f(Linet/ipaddr/a;Linet/ipaddr/a;)I
    .locals 2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-virtual {p2}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Linet/ipaddr/b;->a(LZf/c;LZf/c;)I

    move-result v0

    if-nez v0, :cond_1

    instance-of v1, p1, Linet/ipaddr/ipv6/b;

    if-eqz v1, :cond_1

    check-cast p1, Linet/ipaddr/ipv6/b;

    check-cast p2, Linet/ipaddr/ipv6/b;

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->M1()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->M1()Ljava/lang/String;

    move-result-object p2

    new-instance v0, LZf/a;

    invoke-direct {v0}, LZf/a;-><init>()V

    invoke-static {v0}, Ljava/util/Comparator;->nullsFirst(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ljava/util/Objects;->compare(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result v0

    :cond_1
    return v0
.end method

.method public g(Linet/ipaddr/m;Linet/ipaddr/m;)I
    .locals 10

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Linet/ipaddr/b;->q(Linet/ipaddr/m;)I

    move-result v0

    invoke-static {p2}, Linet/ipaddr/b;->q(Linet/ipaddr/m;)I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    return v0

    :cond_1
    instance-of v0, p1, Linet/ipaddr/ipv4/Y;

    if-eqz v0, :cond_2

    instance-of v0, p2, Linet/ipaddr/ipv4/Y;

    if-eqz v0, :cond_2

    check-cast p1, Linet/ipaddr/ipv4/Y;

    check-cast p2, Linet/ipaddr/ipv4/Y;

    invoke-virtual {p1}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->K1()J

    move-result-wide v2

    invoke-virtual {p1}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->K1()J

    move-result-wide v4

    invoke-virtual {p2}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->K1()J

    move-result-wide v6

    invoke-virtual {p2}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->K1()J

    move-result-wide v8

    move-object v1, p0

    invoke-virtual/range {v1 .. v9}, Linet/ipaddr/b;->l(JJJJ)I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1}, Linet/ipaddr/m;->R()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/m;->getValue()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p2}, Linet/ipaddr/m;->R()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p2}, Linet/ipaddr/m;->getValue()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p0, v0, p1, v1, p2}, Linet/ipaddr/b;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method protected abstract i(LZf/c;LZf/c;)I
.end method

.method protected abstract j(Lag/e;Lag/e;)I
.end method

.method protected abstract k(IIII)I
.end method

.method protected abstract l(JJJJ)I
.end method

.method protected abstract m(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)I
.end method
