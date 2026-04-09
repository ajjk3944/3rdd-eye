.class public Linet/ipaddr/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZf/f;
.implements Ljava/lang/Comparable;


# static fields
.field public static final e:Linet/ipaddr/o;

.field private static final f:Linet/ipaddr/n;


# instance fields
.field final a:Linet/ipaddr/o;

.field final b:Ljava/lang/String;

.field private c:Linet/ipaddr/AddressStringException;

.field private d:Linet/ipaddr/format/validate/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Linet/ipaddr/o$a;

    invoke-direct {v0}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v0

    sput-object v0, Linet/ipaddr/n;->e:Linet/ipaddr/o;

    new-instance v0, Linet/ipaddr/n;

    const-string v1, "::ffff:0:0/96"

    invoke-direct {v0, v1}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Linet/ipaddr/n;->f:Linet/ipaddr/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Linet/ipaddr/n;->e:Linet/ipaddr/o;

    invoke-direct {p0, p1, v0}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/o;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Linet/ipaddr/g;Linet/ipaddr/o;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Linet/ipaddr/format/validate/d;->q0:Linet/ipaddr/format/validate/d$k;

    iput-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    .line 10
    iput-object p3, p0, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    .line 11
    iput-object p1, p0, Linet/ipaddr/n;->b:Ljava/lang/String;

    .line 12
    invoke-virtual {p2}, Linet/ipaddr/g;->a1()Linet/ipaddr/format/validate/d;

    move-result-object p1

    iput-object p1, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Linet/ipaddr/o;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Linet/ipaddr/format/validate/d;->q0:Linet/ipaddr/format/validate/d$k;

    iput-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    if-nez p1, :cond_0

    .line 4
    const-string p1, ""

    iput-object p1, p0, Linet/ipaddr/n;->b:Ljava/lang/String;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 6
    iput-object p1, p0, Linet/ipaddr/n;->b:Ljava/lang/String;

    .line 7
    :goto_0
    iput-object p2, p0, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.address.is.ipv6"

    invoke-direct {v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Linet/ipaddr/n;->c:Linet/ipaddr/AddressStringException;

    if-nez v0, :cond_2

    return-void

    :cond_2
    throw v0
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.address.is.ipv4"

    invoke-direct {v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Linet/ipaddr/n;->c:Linet/ipaddr/AddressStringException;

    if-nez v0, :cond_2

    return-void

    :cond_2
    throw v0
.end method

.method private n(Linet/ipaddr/g$a;)Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->J0()Z

    move-result v0

    if-nez v0, :cond_4

    if-nez p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/n;->c:Linet/ipaddr/AddressStringException;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    invoke-virtual {p1}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Linet/ipaddr/n;->a()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Linet/ipaddr/n;->c()V

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private static r(Linet/ipaddr/format/validate/d;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Linet/ipaddr/a;->e:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->y0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, ""

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->i0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->g0()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Linet/ipaddr/i;->v(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->S0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private t(Linet/ipaddr/g$a;)V
    .locals 1

    invoke-direct {p0, p1}, Linet/ipaddr/n;->n(Linet/ipaddr/g$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Linet/ipaddr/n;->n(Linet/ipaddr/g$a;)Z

    move-result p1

    if-eqz p1, :cond_1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Linet/ipaddr/n;->j()Linet/ipaddr/format/validate/b;

    move-result-object p1

    invoke-interface {p1, p0}, Linet/ipaddr/format/validate/b;->a(Linet/ipaddr/n;)Linet/ipaddr/format/validate/d;

    move-result-object p1

    iput-object p1, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;
    :try_end_1
    .catch Linet/ipaddr/AddressStringException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    iput-object p1, p0, Linet/ipaddr/n;->c:Linet/ipaddr/AddressStringException;

    sget-object v0, Linet/ipaddr/format/validate/d;->p0:Linet/ipaddr/format/validate/d$k;

    iput-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public a0()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/n;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-static {v0}, Linet/ipaddr/n;->r(Linet/ipaddr/format/validate/d;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/n;

    invoke-virtual {p0, p1}, Linet/ipaddr/n;->d(Linet/ipaddr/n;)I

    move-result p1

    return p1
.end method

.method public d(Linet/ipaddr/n;)I
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/n;->l()Z

    move-result v0

    invoke-virtual {p1}, Linet/ipaddr/n;->l()Z

    move-result v1

    if-nez v0, :cond_1

    if-eqz v1, :cond_2

    :cond_1
    :try_start_0
    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    iget-object v1, p1, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0, v1}, Linet/ipaddr/format/validate/d;->D0(Linet/ipaddr/format/validate/d;)I

    move-result p1
    :try_end_0
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_2
    invoke-virtual {p0}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Linet/ipaddr/n;

    if-eqz v1, :cond_4

    check-cast p1, Linet/ipaddr/n;

    invoke-virtual {p0}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    iget-object v3, p1, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    if-ne v2, v3, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/n;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Linet/ipaddr/n;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    iget-object v2, p1, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0, v2}, Linet/ipaddr/format/validate/d;->k0(Linet/ipaddr/format/validate/d;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_2
    :try_start_0
    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    iget-object p1, p1, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0, p1}, Linet/ipaddr/format/validate/d;->W(Linet/ipaddr/format/validate/d;)Z

    move-result p1
    :try_end_0
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1

    :cond_3
    invoke-virtual {p1}, Linet/ipaddr/n;->l()Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public g()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->s0()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Linet/ipaddr/n;->p()Linet/ipaddr/g;

    move-result-object v0
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Linet/ipaddr/o;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/n;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->t0()I

    move-result v0
    :try_end_0
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method protected j()Linet/ipaddr/format/validate/b;
    .locals 1

    sget-object v0, Linet/ipaddr/format/validate/s;->j:Linet/ipaddr/format/validate/b;

    return-object v0
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->J0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Linet/ipaddr/n;->s()V
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->s0()Z

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method public p()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/n;->s()V

    iget-object v0, p0, Linet/ipaddr/n;->d:Linet/ipaddr/format/validate/d;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v0

    return-object v0
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Linet/ipaddr/n;->t(Linet/ipaddr/g$a;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/n;->b:Ljava/lang/String;

    return-object v0
.end method
