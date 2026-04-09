.class public abstract LLg/h$a;
.super LLg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# static fields
.field private static o:LEj/b;


# instance fields
.field n:Ljava/net/InetAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/h$a;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/h$a;->o:LEj/b;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZILjava/net/InetAddress;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LLg/h;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZI)V

    .line 2
    iput-object p6, p0, LLg/h$a;->n:Ljava/net/InetAddress;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZI[B)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, LLg/h;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZI)V

    .line 4
    :try_start_0
    invoke-static {p6}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p1

    iput-object p1, p0, LLg/h$a;->n:Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    sget-object p2, LLg/h$a;->o:LEj/b;

    const-string p3, "Address() exception "

    invoke-interface {p2, p3, p1}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public E(LLg/l;)LKg/c;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/h$a;->G(Z)LKg/d;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LLg/q;

    invoke-virtual {v1, p1}, LLg/q;->j0(LLg/l;)V

    new-instance v1, LLg/p;

    invoke-virtual {v0}, LKg/d;->A()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LKg/d;->n()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3, v0}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    return-object v1
.end method

.method public G(Z)LKg/d;
    .locals 8

    new-instance v7, LLg/q;

    invoke-virtual {p0}, LLg/b;->e()Ljava/util/Map;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v7
.end method

.method I(LLg/l;J)Z
    .locals 3

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object p2

    invoke-virtual {p2, p0}, LLg/k;->d(LLg/h$a;)Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object p2

    invoke-virtual {p0}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v0

    invoke-virtual {p0}, LLg/b;->q()Z

    move-result v1

    sget v2, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {p2, v0, v1, v2}, LLg/k;->j(Ljavax/jmdns/impl/constants/e;ZI)LLg/h$a;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, LLg/b;->b(LLg/b;)I

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, LLg/h$a;->o:LEj/b;

    const-string p2, "handleQuery() Ignoring an identical address query"

    invoke-interface {p1, p2}, LEj/b;->l(Ljava/lang/String;)V

    return p3

    :cond_0
    sget-object p3, LLg/h$a;->o:LEj/b;

    const-string v0, "handleQuery() Conflicting query detected."

    invoke-interface {p3, v0}, LEj/b;->l(Ljava/lang/String;)V

    invoke-virtual {p1}, LLg/l;->Z0()Z

    move-result p3

    if-eqz p3, :cond_1

    if-lez p2, :cond_1

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object p2

    invoke-virtual {p2}, LLg/k;->q()Ljava/lang/String;

    invoke-virtual {p1}, LLg/l;->z0()LLg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/AbstractMap;->clear()V

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LKg/d;

    check-cast p3, LLg/q;

    invoke-virtual {p3}, LLg/q;->i0()Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LLg/l;->l1()Z

    const/4 p1, 0x1

    return p1

    :cond_2
    return p3
.end method

.method J(LLg/l;)Z
    .locals 2

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v0

    invoke-virtual {v0, p0}, LLg/k;->d(LLg/h$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LLg/h$a;->o:LEj/b;

    const-string v1, "handleResponse() Denial detected"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    invoke-virtual {p1}, LLg/l;->Z0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v0

    invoke-virtual {v0}, LLg/k;->q()Ljava/lang/String;

    invoke-virtual {p1}, LLg/l;->z0()LLg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractMap;->clear()V

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKg/d;

    check-cast v1, LLg/q;

    invoke-virtual {v1}, LLg/q;->i0()Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LLg/l;->l1()Z

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method Q(LLg/h;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    instance-of v1, p1, LLg/h$a;

    if-nez v1, :cond_0

    return v0

    :cond_0
    check-cast p1, LLg/h$a;

    invoke-virtual {p0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object v1

    if-eqz v1, :cond_1

    return v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p1}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :goto_0
    sget-object v1, LLg/h$a;->o:LEj/b;

    const-string v2, "Failed to compare addresses of DNSRecords"

    invoke-interface {v1, v2, p1}, LEj/b;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method W()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, LLg/h$a;->n:Ljava/net/InetAddress;

    return-object v0
.end method

.method X(LLg/h;)Z
    .locals 1

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LLg/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method protected w(Ljava/io/DataOutputStream;)V
    .locals 3

    invoke-super {p0, p1}, LLg/b;->w(Ljava/io/DataOutputStream;)V

    invoke-virtual {p0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    aget-byte v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected y(Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-super {p0, p1}, LLg/h;->y(Ljava/lang/StringBuilder;)V

    const-string v0, " address: \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
