.class public abstract Linet/ipaddr/g;
.super Linet/ipaddr/a;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/l;
.implements Lag/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/g$a;
    }
.end annotation


# static fields
.field public static final o:Linet/ipaddr/h;


# instance fields
.field m:Linet/ipaddr/e;

.field private n:Linet/ipaddr/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Linet/ipaddr/h$a;

    invoke-direct {v0}, Linet/ipaddr/h$a;-><init>()V

    sput-object v0, Linet/ipaddr/g;->o:Linet/ipaddr/h;

    return-void
.end method

.method protected constructor <init>(Linet/ipaddr/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Linet/ipaddr/a;-><init>(LZf/c;)V

    return-void
.end method

.method protected constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Linet/ipaddr/a;-><init>(Ljava/util/function/Function;)V

    return-void
.end method

.method static T(Linet/ipaddr/g;Linet/ipaddr/g;)I
    .locals 1

    sget-object v0, Linet/ipaddr/a;->i:Linet/ipaddr/b;

    invoke-virtual {v0, p0, p1}, Linet/ipaddr/b;->f(Linet/ipaddr/a;Linet/ipaddr/a;)I

    move-result p0

    return p0
.end method

.method public static U0(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x20

    goto :goto_0

    :cond_0
    const/16 p0, 0x80

    :goto_0
    return p0
.end method

.method static V0(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-static {p0}, Linet/ipaddr/k;->u2(Linet/ipaddr/g$a;)I

    move-result p0

    return p0
.end method

.method static X0(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-static {p0}, Linet/ipaddr/k;->v2(Linet/ipaddr/g$a;)I

    move-result p0

    return p0
.end method

.method static Z0(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-static {p0}, Linet/ipaddr/k;->x2(Linet/ipaddr/g$a;)I

    move-result p0

    return p0
.end method

.method public static c1(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x4

    goto :goto_0

    :cond_0
    const/16 p0, 0x8

    :goto_0
    return p0
.end method


# virtual methods
.method public F0()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-virtual {v0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public I0()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/k;->x2(Linet/ipaddr/g$a;)I

    move-result v0

    return v0
.end method

.method J(LZf/f;)V
    .locals 2

    instance-of v0, p1, Linet/ipaddr/e;

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/e;

    iput-object p1, p0, Linet/ipaddr/g;->m:Linet/ipaddr/e;

    new-instance p1, Linet/ipaddr/n;

    iget-object v0, p0, Linet/ipaddr/g;->m:Linet/ipaddr/e;

    invoke-virtual {v0}, Linet/ipaddr/e;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/g;->m:Linet/ipaddr/e;

    iget-object v1, v1, Linet/ipaddr/e;->f:Linet/ipaddr/f;

    iget-object v1, v1, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-direct {p1, v0, p0, v1}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/g;Linet/ipaddr/o;)V

    iput-object p1, p0, Linet/ipaddr/a;->b:LZf/f;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Linet/ipaddr/n;

    if-eqz v0, :cond_1

    check-cast p1, Linet/ipaddr/n;

    iput-object p1, p0, Linet/ipaddr/a;->b:LZf/f;

    :cond_1
    :goto_0
    return-void
.end method

.method protected K0()Linet/ipaddr/n;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/a;->b:LZf/f;

    check-cast v0, Linet/ipaddr/n;

    return-object v0
.end method

.method public V()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-interface {v0}, Linet/ipaddr/l;->V()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public W0(Z)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/j;->Y1(Z)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public abstract Y0()Linet/ipaddr/g;
.end method

.method protected a1()Linet/ipaddr/format/validate/d;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/g;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/a;->x()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Linet/ipaddr/g;->s1(Z)Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/g;->t1()Linet/ipaddr/g;

    move-result-object v0

    invoke-static {p0, v0}, Linet/ipaddr/format/validate/d;->O0(Linet/ipaddr/g;Linet/ipaddr/g;)Linet/ipaddr/format/validate/d;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Linet/ipaddr/g;->t1()Linet/ipaddr/g;

    move-result-object v0

    invoke-static {p0, v0}, Linet/ipaddr/format/validate/d;->O0(Linet/ipaddr/g;Linet/ipaddr/g;)Linet/ipaddr/format/validate/d;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static {p0, p0}, Linet/ipaddr/format/validate/d;->O0(Linet/ipaddr/g;Linet/ipaddr/g;)Linet/ipaddr/format/validate/d;

    move-result-object v0

    return-object v0
.end method

.method public b0(Linet/ipaddr/g;)Z
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/a;->g(Linet/ipaddr/a;)Z

    move-result p1

    return p1
.end method

.method public b1()Linet/ipaddr/j;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    check-cast v0, Linet/ipaddr/j;

    return-object v0
.end method

.method public d1()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j;->h2()Z

    move-result v0

    return v0
.end method

.method public abstract e()Linet/ipaddr/i;
.end method

.method public e0()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/k;->v2(Linet/ipaddr/g$a;)I

    move-result v0

    return v0
.end method

.method public e1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract g1()Z
.end method

.method public h1()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j;->m2()Z

    move-result v0

    return v0
.end method

.method public abstract i1(Linet/ipaddr/g;)Linet/ipaddr/g;
.end method

.method public abstract j1(Linet/ipaddr/g;)Linet/ipaddr/m;
.end method

.method public k1()Linet/ipaddr/n;
    .locals 3

    iget-object v0, p0, Linet/ipaddr/a;->b:LZf/f;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/g;->q0()Linet/ipaddr/o;

    move-result-object v0

    new-instance v1, Linet/ipaddr/n;

    invoke-virtual {p0}, Linet/ipaddr/a;->Y()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p0, v0}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/g;Linet/ipaddr/o;)V

    iput-object v1, p0, Linet/ipaddr/a;->b:LZf/f;

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/g;->K0()Linet/ipaddr/n;

    move-result-object v0

    return-object v0
.end method

.method public l1()Linet/ipaddr/e;
    .locals 4

    iget-object v0, p0, Linet/ipaddr/g;->n:Linet/ipaddr/e;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/a;->A0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getCanonicalHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Linet/ipaddr/e;

    new-instance v2, Linet/ipaddr/format/validate/h;

    invoke-virtual {p0}, Linet/ipaddr/g;->a1()Linet/ipaddr/format/validate/d;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;Linet/ipaddr/format/validate/d;)V

    invoke-direct {v0, v1, v2}, Linet/ipaddr/e;-><init>(Ljava/lang/String;Linet/ipaddr/format/validate/h;)V

    filled-new-array {p0}, [Linet/ipaddr/g;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/e;->e:[Linet/ipaddr/g;

    goto :goto_0

    :cond_0
    new-instance v0, Linet/ipaddr/e;

    invoke-direct {v0, v1}, Linet/ipaddr/e;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Linet/ipaddr/IncompatibleAddressException;

    const-string v1, "ipaddress.error.unavailable.numeric"

    invoke-direct {v0, p0, v1}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public m0()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/k;->u2(Linet/ipaddr/g$a;)I

    move-result v0

    return v0
.end method

.method public m1()Linet/ipaddr/e;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/g;->m:Linet/ipaddr/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/g;->l1()Linet/ipaddr/e;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/g;->m:Linet/ipaddr/e;

    :cond_0
    return-object v0
.end method

.method public n0()Linet/ipaddr/g$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-interface {v0}, Linet/ipaddr/l;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    return-object v0
.end method

.method public abstract n1()Linet/ipaddr/ipv4/b;
.end method

.method public abstract o1()Linet/ipaddr/ipv6/b;
.end method

.method public p1()Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Linet/ipaddr/j;->C2(Linet/ipaddr/g;)Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method protected abstract q0()Linet/ipaddr/o;
.end method

.method protected q1()Ljava/net/InetAddress;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j;->q0()[B

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r0()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    invoke-interface {v0}, Linet/ipaddr/l;->r0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract r1()Linet/ipaddr/m;
.end method

.method protected abstract s1(Z)Linet/ipaddr/g;
.end method

.method public abstract t1()Linet/ipaddr/g;
.end method

.method protected y(LZf/f;)Z
    .locals 4

    iget-object v0, p0, Linet/ipaddr/a;->b:LZf/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v2, p1, Linet/ipaddr/n;

    if-eqz v2, :cond_1

    check-cast v0, Linet/ipaddr/n;

    check-cast p1, Linet/ipaddr/n;

    if-eq v0, p1, :cond_0

    iget-object v2, v0, Linet/ipaddr/n;->b:Ljava/lang/String;

    iget-object v3, p1, Linet/ipaddr/n;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    iget-object p1, p1, Linet/ipaddr/n;->a:Linet/ipaddr/o;

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method
