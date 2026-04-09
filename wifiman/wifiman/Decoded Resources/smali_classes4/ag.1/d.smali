.class public abstract Lag/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lag/d$f;,
        Lag/d$c;,
        Lag/d$b;,
        Lag/d$e;,
        Lag/d$a;,
        Lag/d$d;,
        Lag/d$g;
    }
.end annotation


# static fields
.field protected static final g:Ljava/lang/Integer;

.field static final h:Ljava/math/BigInteger;

.field protected static i:Ljava/math/BigInteger;

.field static j:Ljava/util/ResourceBundle;


# instance fields
.field protected transient a:Lag/d$g;

.field private final b:[Lag/b;

.field protected c:Ljava/lang/Integer;

.field private transient d:Ljava/lang/Boolean;

.field private transient e:Ljava/math/BigInteger;

.field protected transient f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lag/d;->g:Ljava/lang/Integer;

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->not()Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lag/d;->h:Ljava/math/BigInteger;

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lag/d;->i:Ljava/math/BigInteger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Linet/ipaddr/HostIdentifierException;

    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "IPAddressResources"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;)Ljava/util/ResourceBundle;

    move-result-object v1

    sput-object v1, Lag/d;->j:Ljava/util/ResourceBundle;
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bundle "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is missing"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public constructor <init>([Lag/b;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lag/d;-><init>([Lag/b;Z)V

    return-void
.end method

.method public constructor <init>([Lag/b;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lag/d;->b:[Lag/b;

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    .line 4
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_1

    .line 5
    aget-object v0, p1, p2

    if-eqz v0, :cond_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ipaddress.error.null.segment"

    invoke-static {p2}, Lag/d;->Y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method protected static C(Lag/k;I)Z
    .locals 8

    invoke-static {p0, p1}, Lag/d;->y(Lag/e;I)V

    invoke-interface {p0}, Lcg/d;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lag/e;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Lag/k;->F0()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-gt v2, p1, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Lcg/b;->H()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_7

    invoke-interface {p0, v4}, Lag/k;->k(I)Lag/l;

    move-result-object v6

    invoke-interface {v6}, Lag/g;->f()I

    move-result v7

    add-int/2addr v7, v5

    if-ge p1, v7, :cond_6

    sub-int/2addr p1, v5

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-interface {v6, p1}, Lag/g;->B0(I)Z

    move-result p1

    if-nez p1, :cond_1

    return v3

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v6}, Lag/l;->i()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    add-int/2addr v4, v1

    :goto_1
    if-ge v4, v2, :cond_5

    invoke-interface {p0, v4}, Lag/k;->k(I)Lag/l;

    move-result-object p1

    invoke-interface {p1}, Lag/l;->w()Z

    move-result v5

    if-nez v5, :cond_3

    return v3

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {p1}, Lag/l;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return v1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    :cond_7
    return v1
.end method

.method protected static J(Lag/k;I)Z
    .locals 8

    invoke-static {p0, p1}, Lag/d;->y(Lag/e;I)V

    invoke-interface {p0}, Lcg/d;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lag/e;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Lag/k;->F0()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v2, p1, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Lcg/b;->H()I

    move-result v2

    move v3, v1

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v2, :cond_7

    invoke-interface {p0, v3}, Lag/k;->k(I)Lag/l;

    move-result-object v6

    invoke-interface {v6}, Lag/g;->f()I

    move-result v7

    add-int/2addr v7, v4

    if-lt p1, v7, :cond_2

    invoke-interface {v6}, Lag/g;->A0()Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_0

    :cond_2
    sub-int/2addr p1, v4

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-interface {v6, p1}, Lag/g;->u0(I)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v6}, Lag/l;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    return v5

    :cond_4
    add-int/2addr v3, v5

    :goto_1
    if-ge v3, v2, :cond_7

    invoke-interface {p0, v3}, Lag/k;->k(I)Lag/l;

    move-result-object p1

    invoke-interface {p1}, Lag/l;->w()Z

    move-result v4

    if-nez v4, :cond_5

    return v1

    :cond_5
    if-eqz v0, :cond_6

    invoke-interface {p1}, Lag/l;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    return v5

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    return v5
.end method

.method protected static K0(Lag/d$f;)Ldg/c;
    .locals 0

    iget-object p0, p0, Lag/d$f;->a:Ldg/c;

    return-object p0
.end method

.method protected static T(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/b;
    .locals 8

    new-instance v7, Lag/j;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lag/j;-><init>(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    return-object v7
.end method

.method protected static Y0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lag/d;->j:Ljava/util/ResourceBundle;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object p0
.end method

.method private synthetic d1(I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lag/d;->V0(I)Lag/b;

    move-result-object p1

    invoke-virtual {p1}, Lag/b;->E1()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected static f1(Lag/d$f;Ldg/c;)V
    .locals 0

    iput-object p1, p0, Lag/d$f;->a:Ldg/c;

    return-void
.end method

.method public static synthetic g(Lag/d;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lag/d;->d1(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static j(IJJ)I
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lag/b;->C(IJJ)I

    move-result p0

    return p0
.end method

.method protected static s(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/format/validate/g;->a(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method protected static v(Lag/k;)Ljava/lang/Integer;
    .locals 6

    invoke-interface {p0}, Lcg/b;->H()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2

    invoke-interface {p0}, Lcg/d;->e()Linet/ipaddr/i;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v2, v0, -0x1

    invoke-interface {p0, v2}, Lag/k;->k(I)Lag/l;

    move-result-object v2

    invoke-interface {v2}, Lag/l;->i()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p0, v2}, Lag/k;->k(I)Lag/l;

    move-result-object v4

    invoke-interface {v4}, Lcg/c;->g()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr v3, p0

    invoke-static {v3}, Linet/ipaddr/format/validate/g;->a(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {v4}, Lag/g;->f()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method protected static y(Lag/e;I)V
    .locals 1

    if-ltz p1, :cond_0

    invoke-interface {p0}, Lag/e;->f()I

    move-result v0

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Linet/ipaddr/PrefixLenException;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/PrefixLenException;-><init>(Lag/g;I)V

    throw v0
.end method


# virtual methods
.method public abstract A()Ljava/lang/Integer;
.end method

.method public A0()Z
    .locals 3

    iget-object v0, p0, Lag/d;->d:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Lag/d;->V0(I)Lag/b;

    move-result-object v2

    invoke-interface {v2}, Lag/g;->A0()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lag/d;->d:Ljava/lang/Boolean;

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lag/d;->d:Ljava/lang/Boolean;

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public H()I
    .locals 1

    invoke-virtual {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public H0()Z
    .locals 4

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lag/d;->V0(I)Lag/b;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->H0()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public L()Z
    .locals 4

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lag/d;->V0(I)Lag/b;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->L()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public O()Z
    .locals 4

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lag/d;->V0(I)Lag/b;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->O()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public R()Ljava/math/BigInteger;
    .locals 4

    invoke-virtual {p0}, Lag/d;->a1()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    new-instance v2, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lag/d;->Z0()[B

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v2, v0, Lag/d$g;->d:Ljava/math/BigInteger;

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v1

    if-nez v1, :cond_3

    iput-object v2, v0, Lag/d$g;->c:Ljava/math/BigInteger;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iget-object v2, v0, Lag/d$g;->d:Ljava/math/BigInteger;

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v0, Lag/d$g;->c:Ljava/math/BigInteger;

    if-eqz v2, :cond_1

    iput-object v2, v0, Lag/d$g;->d:Ljava/math/BigInteger;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lag/d;->Z0()[B

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v2, v0, Lag/d$g;->d:Ljava/math/BigInteger;

    iput-object v2, v0, Lag/d$g;->c:Ljava/math/BigInteger;

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lag/d;->Z0()[B

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v2, v0, Lag/d$g;->d:Ljava/math/BigInteger;

    :cond_3
    :goto_0
    return-object v2
.end method

.method protected U0()Ljava/math/BigInteger;
    .locals 1

    invoke-super {p0}, Lag/e;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public V0(I)Lag/b;
    .locals 1

    invoke-virtual {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public W0()[Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    new-instance v1, Lag/c;

    invoke-direct {v1, p0}, Lag/c;-><init>(Lag/d;)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)V

    return-object v0
.end method

.method protected X0()[Lag/b;
    .locals 1

    iget-object v0, p0, Lag/d;->b:[Lag/b;

    return-object v0
.end method

.method protected Z0()[B
    .locals 3

    invoke-virtual {p0}, Lag/d;->a1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    invoke-virtual {p0, v1}, Lag/d;->b0(Z)[B

    move-result-object v1

    iput-object v1, v0, Lag/d$g;->b:[B

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v2

    if-nez v2, :cond_4

    iput-object v1, v0, Lag/d$g;->a:[B

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iget-object v2, v0, Lag/d$g;->b:[B

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Lag/d$g;->a:[B

    if-eqz v2, :cond_2

    iput-object v2, v0, Lag/d$g;->b:[B

    :cond_1
    move-object v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Lag/d;->b0(Z)[B

    move-result-object v1

    iput-object v1, v0, Lag/d$g;->b:[B

    iput-object v1, v0, Lag/d$g;->a:[B

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v1}, Lag/d;->b0(Z)[B

    move-result-object v1

    iput-object v1, v0, Lag/d$g;->b:[B

    :cond_4
    :goto_0
    return-object v1
.end method

.method protected a1()Z
    .locals 1

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    if-nez v0, :cond_0

    new-instance v0, Lag/d$g;

    invoke-direct {v0}, Lag/d$g;-><init>()V

    iput-object v0, p0, Lag/d;->a:Lag/d$g;

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    goto :goto_1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract b0(Z)[B
.end method

.method protected b1(Ljava/lang/Integer;Ljava/math/BigInteger;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lag/d;->g:Ljava/lang/Integer;

    :cond_0
    iput-object p1, p0, Lag/d;->c:Ljava/lang/Integer;

    iput-object p2, p0, Lag/d;->e:Ljava/math/BigInteger;

    return-void
.end method

.method public c0()Z
    .locals 4

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lag/d;->V0(I)Lag/b;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->c0()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected c1(Lag/d;)Z
    .locals 5

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    invoke-virtual {p1}, Lag/d;->H()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lag/d;->V0(I)Lag/b;

    move-result-object v3

    invoke-virtual {p1, v1}, Lag/d;->V0(I)Lag/b;

    move-result-object v4

    invoke-virtual {v3, v4}, Lag/b;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method protected e1([B)V
    .locals 1

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    if-nez v0, :cond_0

    new-instance v0, Lag/d$g;

    invoke-direct {v0}, Lag/d$g;-><init>()V

    iput-object v0, p0, Lag/d;->a:Lag/d$g;

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iput-object p1, v0, Lag/d$g;->a:[B

    return-void
.end method

.method protected g1(Ljava/net/InetAddress;)V
    .locals 1

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    if-nez v0, :cond_0

    new-instance v0, Lag/d$g;

    invoke-direct {v0}, Lag/d$g;-><init>()V

    iput-object v0, p0, Lag/d;->a:Lag/d$g;

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iput-object p1, v0, Lag/d$g;->e:Ljava/net/InetAddress;

    return-void
.end method

.method public getCount()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lag/d;->e:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lag/d;->U0()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lag/d;->e:Ljava/math/BigInteger;

    :cond_0
    return-object v0
.end method

.method public getValue()Ljava/math/BigInteger;
    .locals 4

    invoke-virtual {p0}, Lag/d;->a1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iget-object v0, v0, Lag/d$g;->c:Ljava/math/BigInteger;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-virtual {p0}, Lag/d;->q0()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v1, v0, Lag/d$g;->c:Ljava/math/BigInteger;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public i()Z
    .locals 1

    invoke-virtual {p0}, Lag/d;->A()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected q0()[B
    .locals 2

    invoke-virtual {p0}, Lag/d;->a1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iget-object v0, v0, Lag/d$g;->a:[B

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lag/d;->b0(Z)[B

    move-result-object v1

    iput-object v1, v0, Lag/d$g;->a:[B

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public w()Z
    .locals 4

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lag/d;->V0(I)Lag/b;

    move-result-object v3

    invoke-interface {v3}, Lag/g;->w()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
