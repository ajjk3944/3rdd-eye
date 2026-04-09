.class public Linet/ipaddr/ipv6/V;
.super Linet/ipaddr/k;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Linet/ipaddr/k;-><init>(I)V

    const v0, 0xffff

    if-gt p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, p1

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0
.end method

.method public constructor <init>(IILjava/lang/Integer;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/k;-><init>(IILjava/lang/Integer;)V

    .line 8
    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p1

    const p2, 0xffff

    if-gt p1, p2, :cond_2

    if-eqz p3, :cond_1

    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0x80

    if-gt p1, p2, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw p1

    :cond_1
    :goto_0
    return-void

    .line 11
    :cond_2
    new-instance p1, Linet/ipaddr/AddressValueException;

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p2

    int-to-long p2, p2

    invoke-direct {p1, p2, p3}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw p1
.end method

.method public constructor <init>(ILjava/lang/Integer;)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2}, Linet/ipaddr/k;-><init>(ILjava/lang/Integer;)V

    const v0, 0xffff

    if-gt p1, v0, :cond_2

    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x80

    if-gt p1, v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw p1

    :cond_1
    :goto_0
    return-void

    .line 6
    :cond_2
    new-instance p2, Linet/ipaddr/AddressValueException;

    int-to-long v0, p1

    invoke-direct {p2, v0, v1}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw p2
.end method

.method protected static X2(IILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/k;->X2(IILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0
.end method

.method protected static Y2(II)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/k;->Y2(II)I

    move-result p0

    return p0
.end method

.method public static synthetic Z2(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;II)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Linet/ipaddr/ipv6/V;->j3(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;II)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a3(ILinet/ipaddr/ipv6/e$a;Ljava/lang/Integer;ZZII)Ljava/util/Iterator;
    .locals 0

    invoke-static/range {p0 .. p6}, Linet/ipaddr/ipv6/V;->i3(ILinet/ipaddr/ipv6/e$a;Ljava/lang/Integer;ZZII)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private f3([LZf/d;ILinet/ipaddr/c$a;)V
    .locals 10

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v2

    invoke-static {v1}, Linet/ipaddr/k;->F2(I)I

    move-result v3

    invoke-static {v2}, Linet/ipaddr/k;->F2(I)I

    move-result v4

    invoke-static {v1}, Linet/ipaddr/k;->M2(I)I

    move-result v1

    invoke-static {v2}, Linet/ipaddr/k;->M2(I)I

    move-result v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    move v7, v6

    goto :goto_0

    :cond_0
    move v7, v5

    :goto_0
    if-eqz v7, :cond_2

    if-nez v1, :cond_1

    const/16 v8, 0xff

    if-ne v2, v8, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Linet/ipaddr/IncompatibleAddressException;

    const-string p2, "ipaddress.error.splitSeg"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    const/16 v8, 0x8

    if-ltz p2, :cond_4

    array-length v9, p1

    if-ge p2, v9, :cond_4

    invoke-static {v8, v0, v5}, Linet/ipaddr/k;->B2(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v7, :cond_3

    invoke-interface {p3, v3, v4, v5}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v3

    aput-object v3, p1, p2

    goto :goto_2

    :cond_3
    invoke-interface {p3, v3, v5}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v3

    aput-object v3, p1, p2

    :cond_4
    :goto_2
    add-int/2addr p2, v6

    if-ltz p2, :cond_6

    array-length v3, p1

    if-ge p2, v3, :cond_6

    invoke-static {v8, v0, v6}, Linet/ipaddr/k;->B2(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v0

    if-ne v1, v2, :cond_5

    invoke-interface {p3, v1, v0}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object p3

    aput-object p3, p1, p2

    goto :goto_3

    :cond_5
    invoke-interface {p3, v1, v2, v0}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p3

    aput-object p3, p1, p2

    :cond_6
    :goto_3
    return-void
.end method

.method private static synthetic i3(ILinet/ipaddr/ipv6/e$a;Ljava/lang/Integer;ZZII)Ljava/util/Iterator;
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    move v1, p5

    move v2, p6

    move v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lbg/b;->b2(LZf/d;IIILinet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic j3(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;II)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-virtual {p0, p2, p3, p1}, Linet/ipaddr/ipv6/e$a;->f1(IILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public I0()I
    .locals 1

    sget-object v0, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    invoke-static {v0}, Linet/ipaddr/k;->x2(Linet/ipaddr/g$a;)I

    move-result v0

    return v0
.end method

.method public L0(LZf/d;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    invoke-virtual {p0, p1}, Linet/ipaddr/k;->t2(LZf/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of p1, p1, Linet/ipaddr/ipv6/V;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method protected X0(Z)[B
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p1

    :goto_0
    ushr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x2

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    const/4 v0, 0x1

    aput-byte p1, v1, v0

    return-object v1
.end method

.method public X1()J
    .locals 2

    const-wide/32 v0, 0xffff

    return-wide v0
.end method

.method protected Z1()I
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/k;->Y1()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->f()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lbg/e;->u0(I)Z

    move-result v2

    if-eqz v2, :cond_0

    rem-int/lit8 v2, v0, 0x4

    if-nez v2, :cond_0

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x4

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b1()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public b3()Linet/ipaddr/ipv6/V;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Linet/ipaddr/k;->w2(Linet/ipaddr/k;Linet/ipaddr/c$a;Z)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    return-object v0
.end method

.method public c3()Linet/ipaddr/ipv6/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->s()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method protected d3()Linet/ipaddr/ipv6/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public e3([LZf/d;ILinet/ipaddr/c$a;)V
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/k;->A0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Linet/ipaddr/k;->B2(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v2, v0, v3}, Linet/ipaddr/k;->B2(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v0

    if-ltz p2, :cond_0

    array-length v2, p1

    if-ge p2, v2, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->E2()I

    move-result v2

    invoke-interface {p3, v2, v1}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v1

    aput-object v1, p1, p2

    :cond_0
    add-int/2addr p2, v3

    if-ltz p2, :cond_2

    array-length v1, p1

    if-ge p2, v1, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/k;->L2()I

    move-result v1

    invoke-interface {p3, v1, v0}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object p3

    aput-object p3, p1, p2

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/ipv6/V;->f3([LZf/d;ILinet/ipaddr/c$a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Linet/ipaddr/ipv6/V;

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/ipv6/V;

    invoke-virtual {p1, p0}, Linet/ipaddr/k;->K2(LZf/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public f()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public g3()Linet/ipaddr/ipv6/V;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Linet/ipaddr/k;->w2(Linet/ipaddr/k;Linet/ipaddr/c$a;Z)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    return-object v0
.end method

.method h3(Z)Ljava/util/Iterator;
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->p3()Linet/ipaddr/ipv6/V;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2, v2}, Lbg/b;->c2(LZf/d;Linet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/V;->h3(Z)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public k1()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public k3()Ldg/b;
    .locals 9

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->f()I

    move-result v2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v4

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v5

    new-instance v6, Linet/ipaddr/ipv6/S;

    invoke-direct {v6, p0}, Linet/ipaddr/ipv6/S;-><init>(Linet/ipaddr/ipv6/V;)V

    new-instance v7, Linet/ipaddr/ipv6/T;

    invoke-direct {v7, v2, v0, v1}, Linet/ipaddr/ipv6/T;-><init>(ILinet/ipaddr/ipv6/e$a;Ljava/lang/Integer;)V

    new-instance v8, Linet/ipaddr/ipv6/U;

    invoke-direct {v8, v0, v1}, Linet/ipaddr/ipv6/U;-><init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;)V

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lag/b;->U0(LZf/d;IILjava/util/function/Supplier;Lag/b$a;Lag/b$b;)Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public l3(Ljava/lang/Integer;)Linet/ipaddr/ipv6/V;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/ipv6/V;->m3(Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public m3(Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/k;->I2(Ljava/lang/Integer;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-super {p0, p1, p2, v0}, Linet/ipaddr/k;->V2(Ljava/lang/Integer;ZLinet/ipaddr/c$a;)Linet/ipaddr/k;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/V;

    return-object p1

    :cond_0
    return-object p0
.end method

.method protected n3()Linet/ipaddr/ipv6/V;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->f()I

    move-result v3

    invoke-static {v3}, Linet/ipaddr/ipv6/Q;->s(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Linet/ipaddr/ipv6/e$a;->f1(IILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object v0

    return-object v0
.end method

.method protected o3(Ljava/lang/Integer;)Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/k;->H2(Ljava/lang/Integer;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-super {p0, p1, v0}, Linet/ipaddr/k;->W2(Ljava/lang/Integer;Linet/ipaddr/c$a;)Linet/ipaddr/k;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/V;

    return-object p1

    :cond_0
    return-object p0
.end method

.method public p3()Linet/ipaddr/ipv6/V;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->d3()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    invoke-static {p0, v0, v1}, Linet/ipaddr/k;->Q2(Linet/ipaddr/k;ZLinet/ipaddr/c$a;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->k3()Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public v0()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method protected y2(I)I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/i;->B(I)I

    move-result p1

    return p1
.end method

.method protected z2(I)I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->c3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/i;->C(I)I

    move-result p1

    return p1
.end method
