.class public abstract Lbg/f;
.super Lbg/d;
.source "SourceFile"

# interfaces
.implements Lag/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbg/f$b;,
        Lbg/f$c;,
        Lbg/f$a;
    }
.end annotation


# static fields
.field protected static final l:Lbg/f$b;


# instance fields
.field private final k:Linet/ipaddr/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbg/f$b;

    invoke-direct {v0}, Lbg/f$b;-><init>()V

    sput-object v0, Lbg/f;->l:Lbg/f$b;

    sget-boolean v1, Lbg/f$b;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lbg/f$b;->d(I)V

    :cond_0
    return-void
.end method

.method public constructor <init>([Lbg/e;Linet/ipaddr/i;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lbg/d;-><init>([Lbg/b;)V

    if-eqz p2, :cond_4

    .line 2
    iput-object p2, p0, Lbg/f;->k:Linet/ipaddr/i;

    const/4 p2, 0x0

    move v0, p2

    .line 3
    :goto_0
    array-length v1, p1

    if-ge p2, v1, :cond_3

    .line 4
    aget-object v1, p1, p2

    .line 5
    invoke-virtual {v1}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lbg/d;->s(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 7
    array-length v0, p1

    if-ge p2, v0, :cond_1

    .line 8
    aget-object v0, p1, p2

    .line 9
    invoke-virtual {v0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 10
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 11
    :cond_0
    new-instance v2, Linet/ipaddr/InconsistentPrefixException;

    add-int/lit8 p2, p2, -0x1

    aget-object p1, p1, p2

    invoke-direct {v2, p1, v0, v1}, Linet/ipaddr/InconsistentPrefixException;-><init>(Lag/g;Lag/g;Ljava/lang/Integer;)V

    throw v2

    :cond_1
    return-void

    .line 12
    :cond_2
    invoke-interface {v1}, Lag/g;->f()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 13
    :cond_3
    sget-object p1, Lag/d;->g:Ljava/lang/Integer;

    iput-object p1, p0, Lag/d;->c:Ljava/lang/Integer;

    return-void

    .line 14
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ipaddress.error.nullNetwork"

    invoke-static {p2}, Lag/d;->Y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected constructor <init>([Lbg/e;Z)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lbg/d;-><init>([Lbg/b;Z)V

    .line 16
    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object p1

    iput-object p1, p0, Lbg/f;->k:Linet/ipaddr/i;

    if-eqz p1, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ipaddress.error.nullNetwork"

    invoke-static {p2}, Lag/d;->Y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected static H1()Lbg/f$c;
    .locals 1

    sget-object v0, Lbg/f$b;->f:Lbg/f$c;

    return-object v0
.end method

.method protected static I1(II)Lbg/f$c;
    .locals 2

    sget-object v0, Lbg/f;->l:Lbg/f$b;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, v1, p1}, Lbg/f$b;->a(III)Lbg/f$b;

    move-result-object p0

    invoke-virtual {p0}, Lbg/f$b;->b()Lbg/f$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public B0(I)Z
    .locals 0

    invoke-static {p0, p1}, Lag/d;->C(Lag/k;I)Z

    move-result p1

    return p1
.end method

.method public F0()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p0}, Lag/d;->v(Lag/k;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    return-object v0

    :cond_0
    sget-object v0, Lag/d;->g:Ljava/lang/Integer;

    iput-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    return-object v1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget-object v3, Lag/d;->g:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public G1(I)Lbg/e;
    .locals 0

    invoke-super {p0, p1}, Lbg/d;->m1(I)Lbg/b;

    move-result-object p1

    check-cast p1, Lbg/e;

    return-object p1
.end method

.method public J1()Lbg/f$c;
    .locals 1

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbg/f;->L1(Z)Lbg/f$c;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lbg/f;->K1()Lbg/f$c;

    move-result-object v0

    return-object v0
.end method

.method public K1()Lbg/f$c;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lbg/f;->L1(Z)Lbg/f$c;

    move-result-object v0

    return-object v0
.end method

.method protected L1(Z)Lbg/f$c;
    .locals 12

    sget-object v0, Lbg/f;->l:Lbg/f$b;

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v1

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lbg/f;->x()Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-int/2addr p1, v2

    const/4 v2, -0x1

    move v5, v2

    move v6, v3

    move v7, v6

    :goto_1
    if-ge v6, v1, :cond_5

    invoke-virtual {p0, v6}, Lbg/f;->G1(I)Lbg/e;

    move-result-object v8

    invoke-virtual {v8}, Lbg/b;->c0()Z

    move-result v9

    if-nez v9, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {v8}, Lbg/e;->i()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v8}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const-wide/16 v10, 0x0

    invoke-virtual {v8, v10, v11, v9}, Lbg/e;->q2(JI)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :cond_1
    if-lez v7, :cond_4

    invoke-virtual {v0, v2, v5, v7}, Lbg/f$b;->a(III)Lbg/f$b;

    move-result-object v0

    add-int/2addr v7, v2

    move v5, v7

    move v7, v3

    goto :goto_3

    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    if-ne v7, v4, :cond_3

    move v2, v6

    :cond_3
    add-int/lit8 v8, v1, -0x1

    if-ne v6, v8, :cond_4

    invoke-virtual {v0, v2, v5, v7}, Lbg/f$b;->a(III)Lbg/f$b;

    move-result-object v0

    add-int v5, v2, v7

    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lbg/f$b;->b()Lbg/f$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic V0(I)Lag/b;
    .locals 0

    invoke-virtual {p0, p1}, Lbg/f;->G1(I)Lbg/e;

    move-result-object p1

    return-object p1
.end method

.method protected c1(Lag/d;)Z
    .locals 1

    instance-of v0, p1, Lbg/f;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lbg/d;->c1(Lag/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e()Linet/ipaddr/i;
    .locals 1

    iget-object v0, p0, Lbg/f;->k:Linet/ipaddr/i;

    return-object v0
.end method

.method public bridge synthetic k(I)Lag/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbg/f;->G1(I)Lbg/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/l;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lbg/f;->G1(I)Lbg/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lcg/c;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lbg/f;->G1(I)Lbg/e;

    move-result-object p1

    return-object p1
.end method

.method public l0(Lag/e;)I
    .locals 2

    invoke-virtual {p0}, Lag/d;->A0()Z

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
    invoke-virtual {p0}, Lbg/f;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lag/e;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Lag/e;->f()I

    move-result v0

    invoke-virtual {p0}, Lbg/f;->A()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-interface {p1}, Lag/e;->f()I

    move-result v1

    invoke-interface {p1}, Lag/e;->A()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr v1, p1

    sub-int/2addr v0, v1

    return v0

    :cond_3
    invoke-virtual {p0}, Lag/d;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {p1}, Lag/e;->getCount()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m1(I)Lbg/b;
    .locals 0

    invoke-virtual {p0, p1}, Lbg/f;->G1(I)Lbg/e;

    move-result-object p1

    return-object p1
.end method

.method public u()Z
    .locals 1

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lbg/f;->u0(I)Z

    move-result v0

    return v0
.end method

.method public u0(I)Z
    .locals 0

    invoke-static {p0, p1}, Lag/d;->J(Lag/k;I)Z

    move-result p1

    return p1
.end method

.method public x()Z
    .locals 2

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lbg/f;->B0(I)Z

    move-result v0

    return v0
.end method
