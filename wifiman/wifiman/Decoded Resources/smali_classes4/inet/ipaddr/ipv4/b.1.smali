.class public Linet/ipaddr/ipv4/b;
.super Linet/ipaddr/g;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv4/b$b;,
        Linet/ipaddr/ipv4/b$a;
    }
.end annotation


# instance fields
.field transient p:Linet/ipaddr/ipv4/I$b;


# direct methods
.method public constructor <init>(Linet/ipaddr/ipv4/I;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Linet/ipaddr/g;-><init>(Linet/ipaddr/j;)V

    .line 2
    invoke-virtual {p1}, Linet/ipaddr/j;->Z()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Linet/ipaddr/AddressValueException;

    invoke-virtual {p1}, Linet/ipaddr/j;->Z()I

    move-result p1

    int-to-long v1, p1

    const-string p1, "ipaddress.error.ipv4.invalid.segment.count"

    invoke-direct {v0, p1, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(Ljava/lang/String;J)V

    throw v0
.end method

.method public constructor <init>(Ljava/net/Inet4Address;)V
    .locals 2

    .line 4
    invoke-virtual {p1}, Ljava/net/Inet4Address;->getAddress()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Linet/ipaddr/ipv4/b;-><init>(Ljava/net/Inet4Address;[BLjava/lang/Integer;)V

    return-void
.end method

.method private constructor <init>(Ljava/net/Inet4Address;[BLjava/lang/Integer;)V
    .locals 1

    .line 5
    new-instance v0, Linet/ipaddr/ipv4/a;

    invoke-direct {v0, p2, p3}, Linet/ipaddr/ipv4/a;-><init>([BLjava/lang/Integer;)V

    invoke-direct {p0, v0}, Linet/ipaddr/g;-><init>(Ljava/util/function/Function;)V

    .line 6
    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object p2

    invoke-virtual {p2, p1}, Linet/ipaddr/ipv4/I;->g1(Ljava/net/InetAddress;)V

    return-void
.end method

.method private static synthetic J1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;
    .locals 6

    check-cast p2, Linet/ipaddr/ipv4/b;

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->y1()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    array-length v3, p0

    const/4 v4, 0x4

    const/4 v2, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Linet/ipaddr/ipv4/e$a;->X0([BIIILjava/lang/Integer;)Linet/ipaddr/ipv4/I;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/b;->J1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;

    move-result-object p0

    return-object p0
.end method

.method private w1(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->y1()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/e$a;->N0(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public A1()Linet/ipaddr/ipv6/b;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->C1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object v2

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v2, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    aput-object v2, v3, v1

    const v1, 0xffff

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v3, v1

    invoke-virtual {p0, v3}, Linet/ipaddr/ipv4/b;->B1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public B1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->C1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-static {v0, p1, p0}, Linet/ipaddr/ipv6/Q;->o3(Linet/ipaddr/ipv6/e$a;[Linet/ipaddr/ipv6/V;Linet/ipaddr/ipv4/b;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public C1()Linet/ipaddr/ipv6/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->s()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public D1()Linet/ipaddr/ipv4/b;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Linet/ipaddr/ipv4/I;->n3(Linet/ipaddr/ipv4/b;ZZ)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public E1()Linet/ipaddr/ipv4/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->j()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public F1()Linet/ipaddr/ipv4/I;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

    return-object v0
.end method

.method public G1(I)Linet/ipaddr/ipv4/M;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public H1()Linet/ipaddr/ipv4/b;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, Linet/ipaddr/ipv4/I;->n3(Linet/ipaddr/ipv4/b;ZZ)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public I1()Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xe0

    invoke-virtual {v0, v2, v1}, Linet/ipaddr/k;->P2(ILjava/lang/Integer;)Z

    move-result v0

    return v0
.end method

.method public K1()J
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->Y3()J

    move-result-wide v0

    return-wide v0
.end method

.method public L1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/ipv4/b;->M1(Linet/ipaddr/g;Z)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method public M1(Linet/ipaddr/g;Z)Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->x1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Linet/ipaddr/ipv4/I;->Z3(Linet/ipaddr/ipv4/I;Z)Linet/ipaddr/ipv4/I;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv4/b;->w1(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method public N1(Z)Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/I;->a4(Z)Linet/ipaddr/ipv4/I;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv4/b;->w1(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method public O1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/Y;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->S1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/Y;

    move-result-object p1

    return-object p1
.end method

.method public P1()Ldg/b;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->y1()Linet/ipaddr/ipv4/e$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Linet/ipaddr/ipv4/I;->e4(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/e$a;Z)Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public Q1()Ljava/net/Inet4Address;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v0

    check-cast v0, Ljava/net/Inet4Address;

    return-object v0
.end method

.method public R1()Linet/ipaddr/ipv4/Y;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->U1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    new-instance v1, Linet/ipaddr/ipv4/Y;

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->D1()Linet/ipaddr/ipv4/b;

    move-result-object v2

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->H1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Linet/ipaddr/ipv4/Y;-><init>(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;Z)V

    return-object v1
.end method

.method public S1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/Y;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/Y;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->x1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Linet/ipaddr/ipv4/Y;-><init>(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V

    return-object v0
.end method

.method protected T1(Z)Linet/ipaddr/ipv4/b;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/a;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Linet/ipaddr/i;->s(IZ)Linet/ipaddr/g;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/b;

    invoke-virtual {v0}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->D1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/g;->d1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/g;->h1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->D1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/I;->g3(Z)Linet/ipaddr/ipv4/I;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv4/b;->w1(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method public U1()Linet/ipaddr/ipv4/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/b;->N1(Z)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Y0()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->D1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public Z()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public bridge synthetic b1()Linet/ipaddr/j;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public e1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public g1()Z
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->I1()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v2}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    const/16 v3, 0xe0

    invoke-virtual {v0, v3}, Linet/ipaddr/k;->N2(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    invoke-virtual {v0}, Lbg/b;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    invoke-virtual {v0}, Lbg/b;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    const/16 v3, 0xfc

    invoke-virtual {v0, v3}, Linet/ipaddr/k;->N2(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    invoke-virtual {p0, v2}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    const/16 v3, 0xa9

    invoke-virtual {v0, v3}, Linet/ipaddr/k;->N2(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v0

    const/16 v3, 0xfe

    invoke-virtual {v0, v3}, Linet/ipaddr/k;->N2(I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1
.end method

.method public bridge synthetic i1(Linet/ipaddr/g;)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->L1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->y1()Linet/ipaddr/ipv4/e$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Linet/ipaddr/ipv4/I;->z3(Linet/ipaddr/ipv4/b;Lbg/a;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j1(Linet/ipaddr/g;)Linet/ipaddr/m;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->O1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/Y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->z1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/l;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->z1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lcg/c;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->z1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public n1()Linet/ipaddr/ipv4/b;
    .locals 0

    return-object p0
.end method

.method public o1()Linet/ipaddr/ipv6/b;
    .locals 1

    sget-object v0, Linet/ipaddr/g;->o:Linet/ipaddr/h;

    invoke-interface {v0, p0}, Linet/ipaddr/ipv6/b$b;->b(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p1()Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->Q1()Ljava/net/Inet4Address;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q(I)Linet/ipaddr/k;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method protected q0()Linet/ipaddr/o;
    .locals 2

    new-instance v0, Linet/ipaddr/o$a;

    invoke-direct {v0}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/Z$a;->q(Linet/ipaddr/ipv4/e;)Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z$a;->f()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->C1()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/j0$a;->v(Linet/ipaddr/ipv6/e;)Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/j0$a;->f()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r1()Linet/ipaddr/m;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->R1()Linet/ipaddr/ipv4/Y;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic s1(Z)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->T1(Z)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->P1()Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t1()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->U1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()LZf/c;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    return-object v0
.end method

.method public v0()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method v1(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Linet/ipaddr/ipv4/I;->d3(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V

    return-void
.end method

.method protected x1(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/g;->n1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Linet/ipaddr/AddressConversionException;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/AddressConversionException;-><init>(Lag/g;Lag/g;)V

    throw v0
.end method

.method y1()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method public z1(I)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method
