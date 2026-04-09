.class public abstract Linet/ipaddr/k;
.super Lbg/e;
.source "SourceFile"

# interfaces
.implements LZf/d;


# instance fields
.field private final s:I

.field private final t:I


# direct methods
.method protected constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lbg/e;-><init>()V

    if-ltz p1, :cond_0

    .line 2
    iput p1, p0, Linet/ipaddr/k;->t:I

    iput p1, p0, Linet/ipaddr/k;->s:I

    return-void

    .line 3
    :cond_0
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, p1

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0
.end method

.method protected constructor <init>(IILjava/lang/Integer;)V
    .locals 3

    .line 5
    invoke-direct {p0, p3}, Lbg/e;-><init>(Ljava/lang/Integer;)V

    if-ltz p1, :cond_4

    if-gez p2, :cond_0

    goto :goto_2

    :cond_0
    if-le p1, p2, :cond_1

    move v2, p2

    move p2, p1

    move p1, v2

    .line 6
    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p0}, Lag/g;->f()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/k;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Linet/ipaddr/k;->z2(I)I

    move-result v0

    and-int/2addr p1, v0

    .line 9
    iput p1, p0, Linet/ipaddr/k;->s:I

    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Linet/ipaddr/k;->y2(I)I

    move-result p1

    or-int/2addr p1, p2

    iput p1, p0, Linet/ipaddr/k;->t:I

    goto :goto_1

    .line 11
    :cond_3
    :goto_0
    iput p1, p0, Linet/ipaddr/k;->s:I

    .line 12
    iput p2, p0, Linet/ipaddr/k;->t:I

    :goto_1
    return-void

    .line 13
    :cond_4
    :goto_2
    new-instance p3, Linet/ipaddr/AddressValueException;

    if-gez p1, :cond_5

    int-to-long p1, p1

    goto :goto_3

    :cond_5
    int-to-long p1, p2

    :goto_3
    invoke-direct {p3, p1, p2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw p3
.end method

.method protected constructor <init>(ILjava/lang/Integer;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p1, p2}, Linet/ipaddr/k;-><init>(IILjava/lang/Integer;)V

    return-void
.end method

.method protected static B2(ILjava/lang/Integer;I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/j;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static D2(III)I
    .locals 0

    shl-int/2addr p1, p2

    or-int/2addr p0, p1

    return p0
.end method

.method protected static F2(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x8

    return p0
.end method

.method protected static M2(I)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method protected static Q2(Linet/ipaddr/k;ZLinet/ipaddr/c$a;)Linet/ipaddr/k;
    .locals 13

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Linet/ipaddr/k;->z2(I)I

    move-result p1

    invoke-virtual {p0}, Linet/ipaddr/k;->W1()J

    move-result-wide v3

    invoke-virtual {p0}, Linet/ipaddr/k;->a2()J

    move-result-wide v5

    invoke-virtual {p0}, Linet/ipaddr/k;->X1()J

    move-result-wide v9

    int-to-long v11, p1

    move-wide v7, v11

    invoke-static/range {v3 .. v10}, Linet/ipaddr/k;->d2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v4

    if-eqz v4, :cond_0

    int-to-long p0, v0

    invoke-virtual {v3, p0, p1, v11, v12}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide p0

    long-to-int p0, p0

    int-to-long v0, v1

    invoke-virtual {v3, v0, v1, v11, v12}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-interface {p2, p0, p1, v2}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p0

    check-cast p0, Linet/ipaddr/k;

    return-object p0

    :cond_0
    new-instance p2, Linet/ipaddr/IncompatibleAddressException;

    const-string v0, "ipaddress.error.maskMismatch"

    invoke-direct {p2, p0, p1, v0}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;ILjava/lang/String;)V

    throw p2

    :cond_1
    invoke-interface {p2, v0, v1, v2}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p0

    check-cast p0, Linet/ipaddr/k;

    :cond_2
    return-object p0
.end method

.method protected static X2(IILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 6

    int-to-long v0, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v2, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lag/b;->H1(JIIZLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0
.end method

.method protected static Y2(II)I
    .locals 2

    int-to-long v0, p0

    invoke-static {v0, v1, p1}, Lag/b;->K1(JI)I

    move-result p0

    return p0
.end method

.method protected static d2(JJJJ)Linet/ipaddr/format/validate/r$j;
    .locals 0

    invoke-static/range {p0 .. p7}, Lbg/b;->d2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object p0

    return-object p0
.end method

.method public static u2(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x8

    goto :goto_0

    :cond_0
    const/16 p0, 0x10

    :goto_0
    return p0
.end method

.method public static v2(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    :goto_0
    return p0
.end method

.method protected static w2(Linet/ipaddr/k;Linet/ipaddr/c$a;Z)Linet/ipaddr/k;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->A0()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    return-object p0

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p2

    :goto_0
    if-eqz v0, :cond_3

    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p0

    :goto_1
    invoke-interface {p1, p2, p0}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object p0

    check-cast p0, Linet/ipaddr/k;

    return-object p0
.end method

.method public static x2(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0xff

    goto :goto_0

    :cond_0
    const p0, 0xffff

    :goto_0
    return p0
.end method


# virtual methods
.method public A0()Z
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public A2()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public C2()I
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected E2()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-static {v0}, Linet/ipaddr/k;->F2(I)I

    move-result v0

    return v0
.end method

.method protected G2(IILjava/lang/Integer;)Z
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v1

    if-ne v0, p1, :cond_2

    if-ne v1, p2, :cond_2

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method protected H2(Ljava/lang/Integer;Z)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ltz v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {p0}, Lag/g;->f()I

    move-result v4

    if-gt v3, v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p2, p0, p1}, Linet/ipaddr/PrefixLenException;-><init>(Lag/g;I)V

    throw p2

    :cond_2
    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result p2

    if-eqz p2, :cond_7

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ge p1, p2, :cond_3

    move v0, v1

    :cond_3
    return v0

    :cond_4
    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result p2

    if-eqz p2, :cond_7

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-eq p1, p2, :cond_6

    :cond_5
    move v0, v1

    :cond_6
    return v0

    :cond_7
    return v2
.end method

.method protected I2(Ljava/lang/Integer;Z)Z
    .locals 4

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ltz v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p0}, Lag/g;->f()I

    move-result v3

    if-gt v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p2, p0, p1}, Linet/ipaddr/PrefixLenException;-><init>(Lag/g;I)V

    throw p2

    :cond_2
    :goto_1
    and-int/2addr p2, v1

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v2

    if-eq p2, v2, :cond_3

    return v0

    :cond_3
    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object p2

    if-eq p1, p2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lbg/e;->B0(I)Z

    move-result p1

    xor-int/2addr p1, v0

    return p1

    :cond_5
    :goto_2
    return v0
.end method

.method protected J2(I)Z
    .locals 1

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lbg/e;->B0(I)Z

    move-result p1

    if-nez p1, :cond_0

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

.method protected K2(LZf/d;)Z
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-interface {p1}, LZf/d;->Q()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v0

    invoke-interface {p1}, LZf/d;->w0()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public L()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected L2()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-static {v0}, Linet/ipaddr/k;->M2(I)I

    move-result v0

    return v0
.end method

.method public N2(I)Z
    .locals 2

    int-to-long v0, p1

    invoke-super {p0, v0, v1}, Lbg/b;->e2(J)Z

    move-result p1

    return p1
.end method

.method public O()Z
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v0

    invoke-interface {p0}, LZf/d;->I0()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public O2(II)Z
    .locals 2

    int-to-long v0, p1

    int-to-long p1, p2

    invoke-super {p0, v0, v1, p1, p2}, Lbg/b;->f2(JJ)Z

    move-result p1

    return p1
.end method

.method public P2(ILjava/lang/Integer;)Z
    .locals 2

    int-to-long v0, p1

    invoke-super {p0, v0, v1, p2}, Lbg/e;->s2(JLjava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public Q()I
    .locals 1

    iget v0, p0, Linet/ipaddr/k;->s:I

    return v0
.end method

.method R2(Ljava/lang/CharSequence;ZIII)V
    .locals 4

    iget-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    int-to-long v0, p5

    invoke-virtual {p0}, Linet/ipaddr/k;->W1()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    invoke-interface {p1, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbg/e;->q:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method S2(Ljava/lang/CharSequence;ZZIIIII)V
    .locals 2

    iget-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lbg/e;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_3

    int-to-long p2, p7

    invoke-virtual {p0}, Linet/ipaddr/k;->W1()J

    move-result-wide p6

    cmp-long p2, p2, p6

    if-nez p2, :cond_3

    invoke-interface {p1, p4, p5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbg/e;->q:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lag/l;->w()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p1, Linet/ipaddr/a;->e:Ljava/lang/String;

    iput-object p1, p0, Lbg/e;->q:Ljava/lang/String;

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_3

    int-to-long p2, p7

    invoke-virtual {p0}, Linet/ipaddr/k;->W1()J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-nez p2, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/k;->a2()J

    move-result-wide p2

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p5

    invoke-virtual {p0, p5}, Linet/ipaddr/k;->n2(I)J

    move-result-wide v0

    and-long/2addr p2, v0

    :cond_2
    int-to-long p7, p8

    cmp-long p2, p7, p2

    if-nez p2, :cond_3

    invoke-interface {p1, p4, p6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbg/e;->q:Ljava/lang/String;

    :cond_3
    :goto_0
    return-void
.end method

.method T2(Ljava/lang/CharSequence;ZIII)V
    .locals 4

    iget-object v0, p0, Lag/b;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    int-to-long v0, p5

    invoke-virtual {p0}, Linet/ipaddr/k;->W1()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->a2()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    invoke-interface {p1, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lag/b;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method U2(Ljava/lang/CharSequence;ZIIII)V
    .locals 4

    iget-object v0, p0, Lag/b;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-interface {p0}, Lag/l;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Linet/ipaddr/a;->e:Ljava/lang/String;

    iput-object p1, p0, Lag/b;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    int-to-long v0, p5

    invoke-virtual {p0}, Linet/ipaddr/k;->W1()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    int-to-long p5, p6

    invoke-virtual {p0}, Linet/ipaddr/k;->a2()J

    move-result-wide v0

    cmp-long p2, p5, v0

    if-nez p2, :cond_1

    invoke-interface {p1, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lag/b;->a:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method protected V2(Ljava/lang/Integer;ZLinet/ipaddr/c$a;)Linet/ipaddr/k;
    .locals 6

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p0, v5}, Linet/ipaddr/k;->z2(I)I

    move-result v5

    and-int/2addr v0, v5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p0, v5}, Linet/ipaddr/k;->y2(I)I

    move-result v5

    or-int/2addr v1, v5

    :cond_1
    if-eqz p2, :cond_2

    if-eqz v4, :cond_2

    move v2, v3

    :cond_2
    if-eq v0, v1, :cond_4

    if-nez v2, :cond_3

    const/4 p1, 0x0

    invoke-interface {p3, v0, v1, p1}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p1

    check-cast p1, Linet/ipaddr/k;

    return-object p1

    :cond_3
    invoke-interface {p3, v0, v1, p1}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p1

    check-cast p1, Linet/ipaddr/k;

    return-object p1

    :cond_4
    if-eqz v2, :cond_5

    invoke-interface {p3, v0, p1}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object p1

    :goto_1
    check-cast p1, Linet/ipaddr/k;

    goto :goto_2

    :cond_5
    invoke-interface {p3, v0}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object p1

    goto :goto_1

    :goto_2
    return-object p1
.end method

.method public W1()J
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method protected W2(Ljava/lang/Integer;Linet/ipaddr/c$a;)Linet/ipaddr/k;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eq v0, v1, :cond_2

    if-nez v2, :cond_1

    const/4 p1, 0x0

    invoke-interface {p2, v0, v1, p1}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p1

    check-cast p1, Linet/ipaddr/k;

    return-object p1

    :cond_1
    invoke-interface {p2, v0, v1, p1}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p1

    check-cast p1, Linet/ipaddr/k;

    return-object p1

    :cond_2
    if-eqz v2, :cond_3

    invoke-interface {p2, v0, p1}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object p1

    :goto_1
    check-cast p1, Linet/ipaddr/k;

    goto :goto_2

    :cond_3
    invoke-interface {p2, v0}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object p1

    goto :goto_1

    :goto_2
    return-object p1
.end method

.method public abstract X1()J
.end method

.method public Y1()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/k;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-super {p0}, Lbg/b;->Y1()I

    move-result v0

    return v0
.end method

.method protected a1()Ljava/lang/String;
    .locals 1

    sget-object v0, Linet/ipaddr/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public a2()J
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public abstract e()Linet/ipaddr/i;
.end method

.method public getCount()Ljava/math/BigInteger;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/k;->C2()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v1

    invoke-interface {p0}, Lag/g;->f()I

    move-result v2

    invoke-static {v0, v1, v2}, Linet/ipaddr/k;->D2(III)I

    move-result v0

    return v0
.end method

.method protected m2(I)J
    .locals 2

    invoke-virtual {p0, p1}, Linet/ipaddr/k;->y2(I)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method protected n2(I)J
    .locals 2

    invoke-virtual {p0, p1}, Linet/ipaddr/k;->z2(I)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method protected t2(LZf/d;)Z
    .locals 2

    invoke-interface {p1}, LZf/d;->Q()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-interface {p1}, LZf/d;->w0()I

    move-result p1

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public w0()I
    .locals 1

    iget v0, p0, Linet/ipaddr/k;->t:I

    return v0
.end method

.method public x()Z
    .locals 1

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/k;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Lbg/e;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected abstract y2(I)I
.end method

.method protected abstract z2(I)I
.end method
