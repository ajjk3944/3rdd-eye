.class public LLg/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLg/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLg/k$b;
    }
.end annotation


# static fields
.field private static e:LEj/b;


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/net/InetAddress;

.field protected c:Ljava/net/NetworkInterface;

.field private final d:LLg/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/k;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/k;->e:LEj/b;

    return-void
.end method

.method private constructor <init>(Ljava/net/InetAddress;Ljava/lang/String;LLg/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLg/k$b;

    invoke-direct {v0, p3}, LLg/k$b;-><init>(LLg/l;)V

    iput-object v0, p0, LLg/k;->d:LLg/k$b;

    iput-object p1, p0, LLg/k;->b:Ljava/net/InetAddress;

    iput-object p2, p0, LLg/k;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/net/NetworkInterface;->getByInetAddress(Ljava/net/InetAddress;)Ljava/net/NetworkInterface;

    move-result-object p1

    iput-object p1, p0, LLg/k;->c:Ljava/net/NetworkInterface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, LLg/k;->e:LEj/b;

    const-string p3, "LocalHostInfo() exception "

    invoke-interface {p2, p3, p1}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private e(ZI)LLg/h$a;
    .locals 7

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    new-instance v0, LLg/h$c;

    invoke-virtual {p0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v6

    move-object v1, v0

    move v4, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, LLg/h$c;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/net/InetAddress;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private f(ZI)LLg/h$e;
    .locals 7

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    new-instance v0, LLg/h$e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".in-addr.arpa."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    move v4, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private g(ZI)LLg/h$a;
    .locals 7

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet6Address;

    if-eqz v0, :cond_0

    new-instance v0, LLg/h$d;

    invoke-virtual {p0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v6

    move-object v1, v0

    move v4, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, LLg/h$d;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/net/InetAddress;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private i(ZI)LLg/h$e;
    .locals 7

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet6Address;

    if-eqz v0, :cond_0

    new-instance v0, LLg/h$e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".ip6.arpa."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    move v4, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private static y()Ljava/net/InetAddress;
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static z(Ljava/net/InetAddress;LLg/l;Ljava/lang/String;)LLg/k;
    .locals 5

    if-eqz p2, :cond_0

    move-object v0, p2

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const/4 v1, 0x0

    if-nez p0, :cond_3

    :try_start_0
    const-string v2, "net.mdns.interface"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, LKg/b$a;->a()LKg/b;

    move-result-object v3

    invoke-interface {v3}, LKg/b;->a()[Ljava/net/InetAddress;

    move-result-object v3

    array-length v4, v3

    if-lez v4, :cond_2

    aget-object v2, v3, v1

    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, LLg/k;->e:LEj/b;

    const-string v4, "Could not find any address beside the loopback."

    invoke-interface {v3, v4}, LEj/b;->t(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object v2, p0

    :cond_4
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    :cond_5
    const-string v3, "in-addr.arpa"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_6
    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    sget-object v2, LLg/k;->e:LEj/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not initialize the host network interface on "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "because of an error: "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0, v0}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, LLg/k;->y()Ljava/net/InetAddress;

    move-result-object v2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_8

    goto :goto_4

    :cond_8
    const-string p2, "computer"

    :goto_4
    move-object v0, p2

    :cond_9
    const-string p0, ".local"

    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_a

    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 p2, 0x3f

    if-le p0, p2, :cond_b

    const/16 p0, 0x40

    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 p2, 0x2e

    invoke-virtual {p0, p2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p2

    invoke-virtual {p0, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_b
    const-string p0, "[:%\\.]"

    const-string p2, "-"

    invoke-virtual {v0, p0, p2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".local."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p2, LLg/k;

    invoke-direct {p2, v2, p0, p1}, LLg/k;-><init>(Ljava/net/InetAddress;Ljava/lang/String;LLg/l;)V

    return-object p2
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->s()Z

    move-result v0

    return v0
.end method

.method public B(LMg/a;)V
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0, p1}, LLg/i$b;->t(LMg/a;)V

    return-void
.end method

.method public C()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->v()Z

    move-result v0

    return v0
.end method

.method D(Ljava/net/DatagramPacket;)Z
    .locals 3

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->isMCLinkLocal()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v0

    if-nez v0, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {p1}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result p1

    if-nez p1, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public E(J)Z
    .locals 1

    iget-object v0, p0, LLg/k;->b:Ljava/net/InetAddress;

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0, p1, p2}, LLg/i$b;->E(J)Z

    move-result p1

    return p1
.end method

.method public a(Ljavax/jmdns/impl/constants/d;ZI)Ljava/util/Collection;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p2, p3}, LLg/k;->e(ZI)LLg/h$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, LLg/b;->t(Ljavax/jmdns/impl/constants/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, p2, p3}, LLg/k;->g(ZI)LLg/h$a;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, LLg/b;->t(Ljavax/jmdns/impl/constants/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public b(LMg/a;Ljavax/jmdns/impl/constants/g;)V
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0, p1, p2}, LLg/i$b;->a(LMg/a;Ljavax/jmdns/impl/constants/g;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->c()Z

    move-result v0

    return v0
.end method

.method public d(LLg/h$a;)Z
    .locals 3

    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v0

    invoke-virtual {p1}, LLg/b;->q()Z

    move-result v1

    sget v2, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {p0, v0, v1, v2}, LLg/k;->j(Ljavax/jmdns/impl/constants/e;ZI)LLg/h$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LLg/h;->P(LLg/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, LLg/h$a;->X(LLg/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, LLg/h$a;->Q(LLg/h;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h(LMg/a;)Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0, p1}, LLg/i$b;->h(LMg/a;)Z

    move-result p1

    return p1
.end method

.method j(Ljavax/jmdns/impl/constants/e;ZI)LLg/h$a;
    .locals 1

    sget-object v0, LLg/k$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0, p2, p3}, LLg/k;->g(ZI)LLg/h$a;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p2, p3}, LLg/k;->e(ZI)LLg/h$a;

    move-result-object p1

    return-object p1
.end method

.method k(Ljavax/jmdns/impl/constants/e;ZI)LLg/h$e;
    .locals 1

    sget-object v0, LLg/k$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0, p2, p3}, LLg/k;->i(ZI)LLg/h$e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p2, p3}, LLg/k;->f(ZI)LLg/h$e;

    move-result-object p1

    return-object p1
.end method

.method l()Ljava/net/Inet4Address;
    .locals 1

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    iget-object v0, p0, LLg/k;->b:Ljava/net/InetAddress;

    check-cast v0, Ljava/net/Inet4Address;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method m()Ljava/net/Inet6Address;
    .locals 1

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet6Address;

    if-eqz v0, :cond_0

    iget-object v0, p0, LLg/k;->b:Ljava/net/InetAddress;

    check-cast v0, Ljava/net/Inet6Address;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public n()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, LLg/k;->b:Ljava/net/InetAddress;

    return-object v0
.end method

.method public o()Ljava/net/NetworkInterface;
    .locals 1

    iget-object v0, p0, LLg/k;->c:Ljava/net/NetworkInterface;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method declared-synchronized q()Ljava/lang/String;
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-static {}, LLg/n$c;->a()LLg/n;

    move-result-object v0

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v1

    iget-object v2, p0, LLg/k;->a:Ljava/lang/String;

    sget-object v3, LLg/n$d;->HOST:LLg/n$d;

    invoke-interface {v0, v1, v2, v3}, LLg/n;->a(Ljava/net/InetAddress;Ljava/lang/String;LLg/n$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/k;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->g()Z

    move-result v0

    return v0
.end method

.method public s(LMg/a;Ljavax/jmdns/impl/constants/g;)Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0, p1, p2}, LLg/i$b;->l(LMg/a;Ljavax/jmdns/impl/constants/g;)Z

    move-result p1

    return p1
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->m()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "local host info["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "no name"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/k;->o()Ljava/net/NetworkInterface;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LLg/k;->o()Ljava/net/NetworkInterface;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, "???"

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    const-string v2, "no address"

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->n()Z

    move-result v0

    return v0
.end method

.method public v()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->o()Z

    move-result v0

    return v0
.end method

.method public w()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->p()Z

    move-result v0

    return v0
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, LLg/k;->d:LLg/k$b;

    invoke-virtual {v0}, LLg/i$b;->r()Z

    move-result v0

    return v0
.end method
