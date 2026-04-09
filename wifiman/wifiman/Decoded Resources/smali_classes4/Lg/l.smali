.class public LLg/l;
.super LKg/a;
.source "SourceFile"

# interfaces
.implements LLg/i;
.implements LLg/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLg/l$i;,
        LLg/l$j;,
        LLg/l$h;
    }
.end annotation


# static fields
.field private static v:LEj/b;

.field private static final w:Ljava/util/Random;


# instance fields
.field private volatile b:Ljava/net/InetAddress;

.field private volatile c:Ljava/net/MulticastSocket;

.field private final d:Ljava/util/List;

.field final e:Ljava/util/concurrent/ConcurrentMap;

.field private final f:Ljava/util/Set;

.field private final g:LLg/a;

.field private final h:Ljava/util/concurrent/ConcurrentMap;

.field private final i:Ljava/util/concurrent/ConcurrentMap;

.field protected final j:J

.field protected k:Ljava/lang/Thread;

.field private l:LLg/k;

.field private m:Ljava/lang/Thread;

.field private n:I

.field private o:J

.field private final p:Ljava/util/concurrent/ExecutorService;

.field private final q:Ljava/util/concurrent/locks/ReentrantLock;

.field private r:LLg/c;

.field private final s:Ljava/util/concurrent/ConcurrentMap;

.field private final t:Ljava/lang/String;

.field private final u:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/l;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/l;->v:LEj/b;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, LLg/l;->w:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;Ljava/lang/String;J)V
    .locals 2

    invoke-direct {p0}, LKg/a;-><init>()V

    new-instance v0, LPg/b;

    const-string v1, "JmDNS"

    invoke-direct {v0, v1}, LPg/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, LLg/l;->q:Ljava/util/concurrent/locks/ReentrantLock;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LLg/l;->u:Ljava/lang/Object;

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "JmDNS instance created"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    new-instance v0, LLg/a;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, LLg/a;-><init>(I)V

    iput-object v0, p0, LLg/l;->g:LLg/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LLg/l;->d:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LLg/l;->f:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1, p0, p2}, LLg/k;->z(Ljava/net/InetAddress;LLg/l;Ljava/lang/String;)LLg/k;

    move-result-object p1

    iput-object p1, p0, LLg/l;->l:LLg/k;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LLg/k;->p()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, LLg/l;->t:Ljava/lang/String;

    iput-wide p3, p0, LLg/l;->j:J

    invoke-virtual {p0}, LLg/l;->F0()LLg/k;

    move-result-object p1

    invoke-direct {p0, p1}, LLg/l;->b1(LLg/k;)V

    invoke-virtual {p0}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, LLg/l;->p1(Ljava/util/Collection;)V

    invoke-virtual {p0}, LLg/l;->y()V

    return-void
.end method

.method public static H0()Ljava/util/Random;
    .locals 1

    sget-object v0, LLg/l;->w:Ljava/util/Random;

    return-object v0
.end method

.method private Y0(LLg/h;J)Z
    .locals 4

    invoke-virtual {p1}, LLg/h;->A()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    sub-long/2addr p2, v2

    cmp-long p1, v0, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private a1(LLg/q;)Z
    .locals 10

    invoke-virtual {p1}, LLg/q;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    :cond_0
    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v3

    invoke-virtual {p1}, LLg/q;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LLg/a;->n(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LLg/b;

    sget-object v6, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v4}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v4, v1, v2}, LLg/b;->k(J)Z

    move-result v6

    if-nez v6, :cond_1

    move-object v6, v4

    check-cast v6, LLg/h$f;

    invoke-virtual {v6}, LLg/h$f;->W()I

    move-result v7

    invoke-virtual {p1}, LLg/q;->o()I

    move-result v8

    if-ne v7, v8, :cond_2

    invoke-virtual {v6}, LLg/h$f;->Y()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v8}, LLg/k;->p()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    :cond_2
    sget-object v3, LLg/l;->v:LEj/b;

    invoke-virtual {v6}, LLg/h$f;->Y()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v8}, LLg/k;->p()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, LLg/h$f;->Y()Ljava/lang/String;

    move-result-object v6

    iget-object v9, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v9}, LLg/k;->p()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    filled-new-array {v4, v7, v8, v6}, [Ljava/lang/Object;

    move-result-object v4

    const-string v6, "makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}"

    invoke-interface {v3, v6, v4}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, LLg/n$c;->a()LLg/n;

    move-result-object v3

    iget-object v4, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v4}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v4

    invoke-virtual {p1}, LLg/q;->n()Ljava/lang/String;

    move-result-object v6

    sget-object v7, LLg/n$d;->SERVICE:LLg/n$d;

    invoke-interface {v3, v4, v6, v7}, LLg/n;->a(Ljava/net/InetAddress;Ljava/lang/String;LLg/n$d;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, LLg/q;->k0(Ljava/lang/String;)V

    move v3, v5

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, LLg/q;->m()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LKg/d;

    if-eqz v4, :cond_4

    if-eq v4, p1, :cond_4

    invoke-static {}, LLg/n$c;->a()LLg/n;

    move-result-object v3

    iget-object v4, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v4}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v4

    invoke-virtual {p1}, LLg/q;->n()Ljava/lang/String;

    move-result-object v6

    sget-object v7, LLg/n$d;->SERVICE:LLg/n$d;

    invoke-interface {v3, v4, v6, v7}, LLg/n;->a(Ljava/net/InetAddress;Ljava/lang/String;LLg/n$d;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, LLg/q;->k0(Ljava/lang/String;)V

    move v3, v5

    :cond_4
    if-nez v3, :cond_0

    invoke-virtual {p1}, LLg/q;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1
.end method

.method private b1(LLg/k;)V
    .locals 4

    iget-object v0, p0, LLg/l;->b:Ljava/net/InetAddress;

    if-nez v0, :cond_1

    invoke-virtual {p1}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet6Address;

    if-eqz v0, :cond_0

    sget-object v0, Ljavax/jmdns/impl/constants/a;->b:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, LLg/l;->b:Ljava/net/InetAddress;

    goto :goto_0

    :cond_0
    sget-object v0, Ljavax/jmdns/impl/constants/a;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, LLg/l;->b:Ljava/net/InetAddress;

    :cond_1
    :goto_0
    iget-object v0, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    if-eqz v0, :cond_2

    invoke-direct {p0}, LLg/l;->x0()V

    :cond_2
    new-instance v0, Ljava/net/MulticastSocket;

    sget v1, Ljavax/jmdns/impl/constants/a;->c:I

    invoke-direct {v0, v1}, Ljava/net/MulticastSocket;-><init>(I)V

    iput-object v0, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LLg/k;->o()Ljava/net/NetworkInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v2, p0, LLg/l;->b:Ljava/net/InetAddress;

    invoke-direct {v0, v2, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iget-object v1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    invoke-virtual {p1}, LLg/k;->o()Ljava/net/NetworkInterface;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/net/MulticastSocket;->setNetworkInterface(Ljava/net/NetworkInterface;)V

    sget-object v1, LLg/l;->v:LEj/b;

    const-string v2, "Trying to joinGroup({}, {})"

    invoke-virtual {p1}, LLg/k;->o()Ljava/net/NetworkInterface;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    invoke-virtual {p1}, LLg/k;->o()Ljava/net/NetworkInterface;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/net/MulticastSocket;->joinGroup(Ljava/net/SocketAddress;Ljava/net/NetworkInterface;)V

    goto :goto_1

    :cond_3
    sget-object p1, LLg/l;->v:LEj/b;

    const-string v0, "Trying to joinGroup({})"

    iget-object v1, p0, LLg/l;->b:Ljava/net/InetAddress;

    invoke-interface {p1, v0, v1}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    iget-object v0, p0, LLg/l;->b:Ljava/net/InetAddress;

    invoke-virtual {p1, v0}, Ljava/net/MulticastSocket;->joinGroup(Ljava/net/InetAddress;)V

    :goto_1
    iget-object p1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Ljava/net/MulticastSocket;->setTimeToLive(I)V

    return-void
.end method

.method private h1(LKg/c;)V
    .locals 1

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object p1

    instance-of v0, p1, LLg/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p1, LLg/d;

    invoke-virtual {p0, p1}, LLg/l;->g1(LLg/d;)V

    return-void
.end method

.method private p1(Ljava/util/Collection;)V
    .locals 3

    iget-object v0, p0, LLg/l;->m:Ljava/lang/Thread;

    if-nez v0, :cond_0

    new-instance v0, LLg/s;

    invoke-direct {v0, p0}, LLg/s;-><init>(LLg/l;)V

    iput-object v0, p0, LLg/l;->m:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    invoke-virtual {p0}, LLg/l;->C()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKg/d;

    :try_start_0
    new-instance v1, LLg/q;

    invoke-direct {v1, v0}, LLg/q;-><init>(LKg/d;)V

    invoke-virtual {p0, v1}, LLg/l;->m0(LKg/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, LLg/l;->v:LEj/b;

    const-string v2, "start() Registration exception "

    invoke-interface {v1, v2, v0}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static q1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 p0, 0x0

    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method private r0(Ljava/util/List;)Ljava/util/List;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLg/h;

    invoke-virtual {v2}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private t0(Ljava/lang/String;LKg/e;Z)V
    .locals 7

    new-instance v0, LLg/m$a;

    invoke-direct {v0, p2, p3}, LLg/m$a;-><init>(LKg/e;Z)V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    if-nez p3, :cond_1

    iget-object p3, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {p3, p2, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    iget-object p3, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, LLg/l$i;

    invoke-direct {v1, p1}, LLg/l$i;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p2, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    iget-object p3, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LKg/e;

    const/4 v1, 0x1

    invoke-direct {p0, p2, p3, v1}, LLg/l;->t0(Ljava/lang/String;LKg/e;Z)V

    :cond_0
    iget-object p3, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    :cond_1
    if-eqz p3, :cond_3

    monitor-enter p3

    :try_start_0
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit p3

    goto :goto_2

    :goto_1
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_2
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v1

    invoke-virtual {v1}, LLg/a;->h()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLg/b;

    check-cast v2, LLg/h;

    invoke-virtual {v2}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    if-ne v3, v4, :cond_4

    invoke-virtual {v2}, LLg/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, LLg/p;

    invoke-virtual {v2}, LLg/b;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, LLg/b;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, LLg/b;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, LLg/l;->q1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, LLg/h;->F()LKg/d;

    move-result-object v2

    invoke-direct {v3, p0, v4, v5, v2}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LKg/c;

    invoke-virtual {v0, p3}, LLg/m$a;->d(LKg/c;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p0, p1}, LLg/l;->j(Ljava/lang/String;)V

    return-void
.end method

.method private x0()V
    .locals 4

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "closeMulticastSocket()"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    iget-object v0, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    iget-object v2, p0, LLg/l;->b:Ljava/net/InetAddress;

    invoke-virtual {v1, v2}, Ljava/net/MulticastSocket;->leaveGroup(Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_4

    :catch_1
    :goto_0
    :try_start_1
    iget-object v1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->close()V

    :goto_1
    iget-object v1, p0, LLg/l;->m:Ljava/lang/Thread;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1

    monitor-enter p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v1, p0, LLg/l;->m:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LLg/l;->v:LEj/b;

    const-string v2, "closeMulticastSocket(): waiting for jmDNS monitor"

    invoke-interface {v1, v2}, LEj/b;->l(Ljava/lang/String;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_2
    :cond_0
    :goto_2
    :try_start_3
    monitor-exit p0

    goto :goto_1

    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    :cond_1
    iput-object v0, p0, LLg/l;->m:Ljava/lang/Thread;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_5

    :goto_4
    sget-object v2, LLg/l;->v:LEj/b;

    const-string v3, "closeMulticastSocket() Close socket exception "

    invoke-interface {v2, v3, v1}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    iput-object v0, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    :cond_2
    return-void
.end method

.method private y0()V
    .locals 4

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "disposeServiceCollectors()"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    iget-object v0, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLg/l$i;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, LLg/l;->n0(Ljava/lang/String;LKg/e;)V

    iget-object v3, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public A0()LKg/a$a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public B0()LLg/l;
    .locals 0

    return-object p0
.end method

.method public C()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->C()V

    return-void
.end method

.method public C0()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, LLg/l;->b:Ljava/net/InetAddress;

    return-object v0
.end method

.method public D0()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public E0()J
    .locals 2

    iget-wide v0, p0, LLg/l;->o:J

    return-wide v0
.end method

.method public F0()LLg/k;
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    return-object v0
.end method

.method public G0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/l;->t:Ljava/lang/String;

    return-object v0
.end method

.method I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LLg/q;
    .locals 12

    move/from16 v9, p4

    new-instance v10, LLg/q;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v8}, LLg/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZ[B)V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v0

    new-instance v7, LLg/h$e;

    sget-object v8, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {v10}, LLg/q;->u()Ljava/lang/String;

    move-result-object v6

    move-object v1, v7

    move-object v2, p1

    move-object v3, v8

    invoke-direct/range {v1 .. v6}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    invoke-virtual {v0, v7}, LLg/a;->j(LLg/b;)LLg/b;

    move-result-object v0

    instance-of v1, v0, LLg/h;

    if-eqz v1, :cond_9

    check-cast v0, LLg/h;

    invoke-virtual {v0, v9}, LLg/h;->G(Z)LKg/d;

    move-result-object v0

    check-cast v0, LLg/q;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LLg/q;->S()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {v10}, LLg/q;->u()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v2, v3, v4, v8}, LLg/a;->l(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)LLg/b;

    move-result-object v2

    instance-of v3, v2, LLg/h;

    if-eqz v3, :cond_0

    check-cast v2, LLg/h;

    invoke-virtual {v2, v9}, LLg/h;->G(Z)LKg/d;

    move-result-object v7

    if-eqz v7, :cond_0

    new-instance v11, LLg/q;

    invoke-virtual {v7}, LKg/d;->o()I

    move-result v2

    invoke-virtual {v7}, LKg/d;->B()I

    move-result v3

    invoke-virtual {v7}, LKg/d;->p()I

    move-result v4

    const/4 v6, 0x0

    move-object v0, v11

    move/from16 v5, p4

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    invoke-virtual {v7}, LKg/d;->z()[B

    move-result-object v0

    invoke-virtual {v7}, LKg/d;->w()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const-string v2, ""

    :goto_0
    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v3, v2, v4, v8}, LLg/a;->p(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LLg/b;

    instance-of v6, v4, LLg/h;

    if-eqz v6, :cond_1

    check-cast v4, LLg/h;

    invoke-virtual {v4, v9}, LLg/h;->G(Z)LKg/d;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, LKg/d;->i()[Ljava/net/Inet4Address;

    move-result-object v6

    array-length v7, v6

    :goto_2
    if-ge v5, v7, :cond_2

    aget-object v8, v6, v5

    invoke-virtual {v0, v8}, LLg/q;->H(Ljava/net/Inet4Address;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, LKg/d;->z()[B

    move-result-object v4

    invoke-virtual {v0, v4}, LLg/q;->G([B)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    sget-object v6, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {v3, v2, v4, v6}, LLg/a;->p(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/b;

    instance-of v4, v3, LLg/h;

    if-eqz v4, :cond_4

    check-cast v3, LLg/h;

    invoke-virtual {v3, v9}, LLg/h;->G(Z)LKg/d;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LKg/d;->k()[Ljava/net/Inet6Address;

    move-result-object v4

    array-length v6, v4

    move v7, v5

    :goto_4
    if-ge v7, v6, :cond_5

    aget-object v8, v4, v7

    invoke-virtual {v0, v8}, LLg/q;->I(Ljava/net/Inet6Address;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, LKg/d;->z()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LLg/q;->G([B)V

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {v0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_TXT:Ljavax/jmdns/impl/constants/e;

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {v2, v3, v4, v5}, LLg/a;->l(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)LLg/b;

    move-result-object v2

    instance-of v3, v2, LLg/h;

    if-eqz v3, :cond_7

    check-cast v2, LLg/h;

    invoke-virtual {v2, v9}, LLg/h;->G(Z)LKg/d;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, LKg/d;->z()[B

    move-result-object v2

    invoke-virtual {v0, v2}, LLg/q;->G([B)V

    :cond_7
    invoke-virtual {v0}, LLg/q;->z()[B

    move-result-object v2

    array-length v2, v2

    if-nez v2, :cond_8

    invoke-virtual {v0, v1}, LLg/q;->G([B)V

    :cond_8
    invoke-virtual {v0}, LLg/q;->D()Z

    move-result v1

    if-eqz v1, :cond_9

    move-object v10, v0

    :cond_9
    return-object v10
.end method

.method public J()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->J()V

    return-void
.end method

.method public J0()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method public K0()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method public L0()Ljava/net/MulticastSocket;
    .locals 1

    iget-object v0, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    return-object v0
.end method

.method public M0()I
    .locals 1

    iget v0, p0, LLg/l;->n:I

    return v0
.end method

.method N0(LLg/c;Ljava/net/InetAddress;I)V
    .locals 5

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "{} handle query: {}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x78

    add-long/2addr v0, v2

    invoke-virtual {p1}, LLg/e;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LLg/h;

    invoke-virtual {v4, p0, v0, v1}, LLg/h;->I(LLg/l;J)Z

    move-result v4

    or-int/2addr v3, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LLg/l;->R0()V

    :try_start_0
    iget-object v0, p0, LLg/l;->r:LLg/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LLg/c;->z(LLg/c;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    invoke-virtual {p1}, LLg/c;->A()LLg/c;

    move-result-object v0

    invoke-virtual {p1}, LLg/e;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    iput-object v0, p0, LLg/l;->r:LLg/c;

    :cond_2
    invoke-virtual {p0, v0, p2, p3}, LLg/l;->P(LLg/c;Ljava/net/InetAddress;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, LLg/l;->S0()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1}, LLg/e;->c()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/h;

    invoke-virtual {p0, v0, p2, p3}, LLg/l;->O0(LLg/h;J)V

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {p0}, LLg/l;->C()V

    :cond_4
    return-void

    :goto_3
    invoke-virtual {p0}, LLg/l;->S0()V

    throw p1
.end method

.method O0(LLg/h;J)V
    .locals 8

    sget-object v0, LLg/l$h;->Noop:LLg/l$h;

    invoke-virtual {p1, p2, p3}, LLg/h;->k(J)Z

    move-result v1

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v3, "{} handle response: {}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, p1}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, LLg/b;->p()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p1}, LLg/b;->j()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p1}, LLg/b;->q()Z

    move-result v2

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v3

    invoke-virtual {v3, p1}, LLg/a;->j(LLg/b;)LLg/b;

    move-result-object v3

    check-cast v3, LLg/h;

    sget-object v4, LLg/l;->v:LEj/b;

    const-string v5, "{} handle response cached record: {}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, v3}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {p1}, LLg/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LLg/a;->n(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LLg/b;

    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v5

    invoke-virtual {v4}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p1}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v5

    invoke-virtual {v4}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, LLg/h;

    invoke-direct {p0, v5, p2, p3}, LLg/l;->Y0(LLg/h;J)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v6, LLg/l;->v:LEj/b;

    const-string v7, "setWillExpireSoon() on: {}"

    invoke-interface {v6, v7, v4}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5, p2, p3}, LLg/h;->S(J)V

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_7

    if-eqz v1, :cond_3

    invoke-virtual {p1}, LLg/h;->H()I

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, LLg/l$h;->Noop:LLg/l$h;

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v4, "Record is expired - setWillExpireSoon() on:\n\t{}"

    invoke-interface {v2, v4, v3}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, p2, p3}, LLg/h;->S(J)V

    goto :goto_2

    :cond_2
    sget-object v0, LLg/l$h;->Remove:LLg/l$h;

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v4, "Record is expired - removeDNSEntry() on:\n\t{}"

    invoke-interface {v2, v4, v3}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {v2, v3}, LLg/a;->s(LLg/b;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v3}, LLg/h;->Q(LLg/h;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, v3}, LLg/b;->v(LLg/b;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p1}, LLg/b;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v3, p1}, LLg/h;->O(LLg/h;)V

    move-object p1, v3

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {p1}, LLg/h;->L()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, LLg/l$h;->Update:LLg/l$h;

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v4, "Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}"

    invoke-interface {v2, v4, p1, v3}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {v2, p1, v3}, LLg/a;->t(LLg/b;LLg/b;)Z

    goto :goto_2

    :cond_6
    sget-object v0, LLg/l$h;->Add:LLg/l$h;

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v3, "Record (multiValue) has changed - addDNSEntry on:\n\t{}"

    invoke-interface {v2, v3, p1}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {v2, p1}, LLg/a;->g(LLg/b;)Z

    goto :goto_2

    :cond_7
    if-nez v1, :cond_8

    sget-object v0, LLg/l$h;->Add:LLg/l$h;

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v3, "Record not cached - addDNSEntry on:\n\t{}"

    invoke-interface {v2, v3, p1}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {v2, p1}, LLg/a;->g(LLg/b;)Z

    :cond_8
    :goto_2
    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v2

    sget-object v3, Ljavax/jmdns/impl/constants/e;->TYPE_PTR:Ljavax/jmdns/impl/constants/e;

    if-ne v2, v3, :cond_b

    invoke-virtual {p1}, LLg/b;->p()Z

    move-result v2

    if-eqz v2, :cond_a

    if-nez v1, :cond_9

    check-cast p1, LLg/h$e;

    invoke-virtual {p1}, LLg/h$e;->W()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LLg/l;->e1(Ljava/lang/String;)Z

    :cond_9
    return-void

    :cond_a
    invoke-virtual {p1}, LLg/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, LLg/l;->e1(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, LLg/l$h;->Noop:LLg/l$h;

    if-ne v0, v1, :cond_b

    sget-object v0, LLg/l$h;->RegisterServiceType:LLg/l$h;

    :cond_b
    sget-object v1, LLg/l$h;->Noop:LLg/l$h;

    if-eq v0, v1, :cond_c

    invoke-virtual {p0, p2, p3, p1, v0}, LLg/l;->s1(JLLg/h;LLg/l$h;)V

    :cond_c
    return-void
.end method

.method public P(LLg/c;Ljava/net/InetAddress;I)V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LLg/j;->P(LLg/c;Ljava/net/InetAddress;I)V

    return-void
.end method

.method P0(LLg/c;)V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, LLg/e;->b()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LLg/l;->r0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LLg/h;

    invoke-virtual {p0, v4, v0, v1}, LLg/l;->O0(LLg/h;J)V

    sget-object v5, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v4}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v4}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v4, p0}, LLg/h;->J(LLg/l;)Z

    move-result v4

    or-int/2addr v3, v4

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v4, p0}, LLg/h;->J(LLg/l;)Z

    move-result v4

    or-int/2addr v2, v4

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    if-eqz v3, :cond_4

    :cond_3
    invoke-virtual {p0}, LLg/l;->C()V

    :cond_4
    return-void
.end method

.method Q0(LKg/c;)V
    .locals 4

    iget-object v0, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object v1

    invoke-virtual {v1}, LKg/d;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLg/m$a;

    iget-object v2, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v3, LLg/l$a;

    invoke-direct {v3, p0, v1, p1}, LLg/l$a;-><init>(LLg/l;LLg/m$a;LKg/c;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    return-void
.end method

.method public R0()V
    .locals 1

    iget-object v0, p0, LLg/l;->q:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    return-void
.end method

.method public S()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->S()V

    return-void
.end method

.method public S0()V
    .locals 1

    iget-object v0, p0, LLg/l;->q:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method public T()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->T()V

    return-void
.end method

.method public T0()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->r()Z

    move-result v0

    return v0
.end method

.method public U0(LMg/a;Ljavax/jmdns/impl/constants/g;)Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0, p1, p2}, LLg/k;->s(LMg/a;Ljavax/jmdns/impl/constants/g;)Z

    move-result p1

    return p1
.end method

.method public V0()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->t()Z

    move-result v0

    return v0
.end method

.method public W0()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->u()Z

    move-result v0

    return v0
.end method

.method public X0()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->w()Z

    move-result v0

    return v0
.end method

.method public Y()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->Y()V

    return-void
.end method

.method public Z0()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->x()Z

    move-result v0

    return v0
.end method

.method public a()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->a()V

    return-void
.end method

.method public b0(Ljava/lang/String;LKg/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LLg/l;->t0(Ljava/lang/String;LKg/e;Z)V

    return-void
.end method

.method public c1()V
    .locals 5

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "{}.recover()"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->X0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LLg/l;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LLg/l;->W0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LLg/l;->V0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, LLg/l;->u:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LLg/l;->v0()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".recover()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LLg/l;->v:LEj/b;

    const-string v3, "{} thread {}"

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v1, v4}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, LLg/l$f;

    invoke-direct {v2, p0, v1}, LLg/l$f;-><init>(LLg/l;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_2
    return-void
.end method

.method public close()V
    .locals 2

    invoke-virtual {p0}, LLg/l;->X0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "Cancelling JmDNS: {}"

    invoke-interface {v0, v1, p0}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->v0()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "Canceling the timer"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    invoke-virtual {p0}, LLg/l;->s()V

    invoke-virtual {p0}, LLg/l;->r1()V

    invoke-direct {p0}, LLg/l;->y0()V

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "Wait for JmDNS cancel: {}"

    invoke-interface {v0, v1, p0}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x1388

    invoke-virtual {p0, v0, v1}, LLg/l;->t1(J)Z

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "Canceling the state timer"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    invoke-virtual {p0}, LLg/l;->g()V

    iget-object v0, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    invoke-direct {p0}, LLg/l;->x0()V

    iget-object v0, p0, LLg/l;->k:Ljava/lang/Thread;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    iget-object v1, p0, LLg/l;->k:Ljava/lang/Thread;

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->removeShutdownHook(Ljava/lang/Thread;)Z

    :cond_1
    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->a(LLg/l;)V

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "JmDNS closed."

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/l;->h(LMg/a;)Z

    return-void
.end method

.method public d0(LKg/f;)V
    .locals 5

    new-instance v0, LLg/m$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LLg/m$b;-><init>(LKg/f;Z)V

    iget-object p1, p0, LLg/l;->f:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, LLg/p;

    const-string v3, ""

    const/4 v4, 0x0

    invoke-direct {v2, p0, v1, v3, v4}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    invoke-virtual {v0, v2}, LLg/m$b;->c(LKg/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LLg/l;->Y()V

    return-void
.end method

.method public d1()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->A()Z

    move-result v0

    return v0
.end method

.method public e1(Ljava/lang/String;)Z
    .locals 13

    invoke-static {p1}, LLg/r;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, LKg/d$a;->Domain:LKg/d$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, LKg/d$a;->Protocol:LKg/d$a;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, LKg/d$a;->Application:LKg/d$a;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v4, LKg/d$a;->Subtype:LKg/d$a;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    const-string v5, ""

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, ""

    :goto_1
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    sget-object v5, LLg/l;->v:LEj/b;

    const-string v6, "{} registering service type: {} as: {}{}{}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_2

    const-string v8, " subtype: "

    goto :goto_2

    :cond_2
    const-string v8, ""

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_3

    move-object v9, v0

    goto :goto_3

    :cond_3
    const-string v9, ""

    :goto_3
    filled-new-array {v7, p1, v2, v8, v9}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v5, v6, p1}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez p1, :cond_5

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v3, "dns-sd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v3, "in-addr.arpa"

    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ip6.arpa"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, LLg/l$j;

    invoke-direct {v1, v2}, LLg/l$j;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v4, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    move p1, v6

    goto :goto_4

    :cond_4
    move p1, v7

    :goto_4
    if-eqz p1, :cond_6

    iget-object v1, p0, LLg/l;->f:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    new-array v3, v3, [LLg/m$b;

    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LLg/m$b;

    new-instance v3, LLg/p;

    const-string v8, ""

    invoke-direct {v3, p0, v2, v8, v5}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    array-length v8, v1

    move v9, v7

    :goto_5
    if-ge v9, v8, :cond_6

    aget-object v10, v1, v9

    iget-object v11, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v12, LLg/l$b;

    invoke-direct {v12, p0, v10, v3}, LLg/l$b;-><init>(LLg/l;LLg/m$b;LKg/c;)V

    invoke-interface {v11, v12}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_5
    move p1, v7

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_9

    iget-object v1, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLg/l$j;

    if-eqz v1, :cond_9

    invoke-virtual {v1, v0}, LLg/l$j;->e(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1, v0}, LLg/l$j;->e(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v1, v0}, LLg/l$j;->b(Ljava/lang/String;)Z

    iget-object p1, p0, LLg/l;->f:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    new-array v3, v3, [LLg/m$b;

    invoke-interface {p1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LLg/m$b;

    new-instance v3, LLg/p;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "_"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "._sub."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-direct {v3, p0, v0, v2, v5}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    array-length v0, p1

    :goto_6
    if-ge v7, v0, :cond_8

    aget-object v2, p1, v7

    iget-object v4, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v5, LLg/l$c;

    invoke-direct {v5, p0, v2, v3}, LLg/l$c;-><init>(LLg/l;LLg/m$b;LKg/c;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :catchall_0
    move-exception p1

    goto :goto_7

    :cond_7
    move v6, p1

    :cond_8
    monitor-exit v1

    move p1, v6

    goto :goto_8

    :goto_7
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_9
    :goto_8
    return p1
.end method

.method public f1(LMg/a;)V
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0, p1}, LLg/k;->B(LMg/a;)V

    return-void
.end method

.method public g()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->g()V

    return-void
.end method

.method public g1(LLg/d;)V
    .locals 1

    iget-object v0, p0, LLg/l;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(LMg/a;)Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0, p1}, LLg/k;->h(LMg/a;)Z

    move-result p1

    return p1
.end method

.method public i1(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LLg/l;->j(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public isClosed()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->v()Z

    move-result v0

    return v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0, p1}, LLg/j;->j(Ljava/lang/String;)V

    return-void
.end method

.method j1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LLg/q;
    .locals 3

    invoke-virtual {p0}, LLg/l;->w0()V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, LLg/l;->e1(Ljava/lang/String;)Z

    iget-object v1, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    new-instance v2, LLg/l$i;

    invoke-direct {v2, p1}, LLg/l$i;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKg/e;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, LLg/l;->t0(Ljava/lang/String;LKg/e;Z)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LLg/l;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LLg/q;

    move-result-object p1

    invoke-virtual {p0, p1}, LLg/l;->p(LLg/q;)V

    return-object p1
.end method

.method public k1(LLg/c;)V
    .locals 1

    invoke-virtual {p0}, LLg/l;->R0()V

    :try_start_0
    iget-object v0, p0, LLg/l;->r:LLg/c;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LLg/l;->r:LLg/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, LLg/l;->S0()V

    return-void

    :goto_1
    invoke-virtual {p0}, LLg/l;->S0()V

    throw p1
.end method

.method public l1()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->C()Z

    move-result v0

    return v0
.end method

.method public m0(LKg/d;)V
    .locals 2

    invoke-virtual {p0}, LLg/l;->X0()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, LLg/l;->isClosed()Z

    move-result v0

    if-nez v0, :cond_4

    check-cast p1, LLg/q;

    invoke-virtual {p1}, LLg/q;->Q()LLg/l;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LLg/q;->Q()LLg/l;

    move-result-object v0

    if-ne v0, p0, :cond_1

    iget-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, LLg/q;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A service information can only be registered once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A service information can only be registered with a single instamce of JmDNS."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p1, p0}, LLg/q;->j0(LLg/l;)V

    invoke-virtual {p1}, LLg/q;->U()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LLg/l;->e1(Ljava/lang/String;)Z

    invoke-virtual {p1}, LLg/q;->f0()Z

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LLg/q;->m0(Ljava/lang/String;)V

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->l()Ljava/net/Inet4Address;

    move-result-object v0

    invoke-virtual {p1, v0}, LLg/q;->H(Ljava/net/Inet4Address;)V

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->m()Ljava/net/Inet6Address;

    move-result-object v0

    invoke-virtual {p1, v0}, LLg/q;->I(Ljava/net/Inet6Address;)V

    invoke-direct {p0, p1}, LLg/l;->a1(LLg/q;)Z

    :goto_1
    iget-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, LLg/q;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, LLg/l;->a1(LLg/q;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LLg/l;->C()V

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "registerService() JmDNS registered service as {}"

    invoke-interface {v0, v1, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This DNS is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m1(LLg/f;)V
    .locals 5

    invoke-virtual {p1}, LLg/e;->n()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, LLg/f;->D()Ljava/net/InetSocketAddress;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LLg/f;->D()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p1}, LLg/f;->D()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LLg/l;->b:Ljava/net/InetAddress;

    sget v1, Ljavax/jmdns/impl/constants/a;->c:I

    :goto_0
    invoke-virtual {p1}, LLg/f;->C()[B

    move-result-object p1

    new-instance v2, Ljava/net/DatagramPacket;

    array-length v3, p1

    invoke-direct {v2, p1, v3, v0, v1}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    sget-object p1, LLg/l;->v:LEj/b;

    invoke-interface {p1}, LEj/b;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    new-instance p1, LLg/c;

    invoke-direct {p1, v2}, LLg/c;-><init>(Ljava/net/DatagramPacket;)V

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "send({}) JmDNS out:{}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {p1, v4}, LLg/c;->E(Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, v3, p1}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    sget-object v0, LLg/l;->v:LEj/b;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v3, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "{}.send({}) - JmDNS can not parse what it sends!!!"

    invoke-interface {v0, v1, p1}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    iget-object p1, p0, LLg/l;->c:Ljava/net/MulticastSocket;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    :cond_2
    return-void
.end method

.method public n0(Ljava/lang/String;LKg/e;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    monitor-enter v0

    :try_start_0
    new-instance v1, LLg/m$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, LLg/m$a;-><init>(LKg/e;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p2, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-void
.end method

.method public n1(J)V
    .locals 0

    iput-wide p1, p0, LLg/l;->o:J

    return-void
.end method

.method public o0(LKg/f;)V
    .locals 2

    new-instance v0, LLg/m$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LLg/m$b;-><init>(LKg/f;Z)V

    iget-object p1, p0, LLg/l;->f:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public o1(I)V
    .locals 0

    iput p1, p0, LLg/l;->n:I

    return-void
.end method

.method public p(LLg/q;)V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0, p1}, LLg/j;->p(LLg/q;)V

    return-void
.end method

.method public p0(LKg/d;)V
    .locals 3

    iget-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, LKg/d;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LLg/q;->M()Z

    invoke-virtual {p0}, LLg/l;->v()V

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, LLg/q;->n0(J)Z

    iget-object p1, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0}, LLg/q;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, LLg/l;->v:LEj/b;

    const-string v1, "unregisterService() JmDNS {} unregistered service as {}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2, v0}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, LLg/l;->v:LEj/b;

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LKg/d;->m()Ljava/lang/String;

    move-result-object p1

    const-string v2, "{} removing unregistered service info: {}"

    invoke-interface {v0, v2, v1, p1}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method q0()V
    .locals 4

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "{}.recover() Cleanning up"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "RECOVERING"

    invoke-interface {v0, v1}, LEj/b;->t(Ljava/lang/String;)V

    invoke-virtual {p0}, LLg/l;->a()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, LLg/l;->r1()V

    invoke-direct {p0}, LLg/l;->y0()V

    const-wide/16 v1, 0x1388

    invoke-virtual {p0, v1, v2}, LLg/l;->t1(J)Z

    invoke-virtual {p0}, LLg/l;->S()V

    invoke-direct {p0}, LLg/l;->x0()V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractMap;->clear()V

    sget-object v1, LLg/l;->v:LEj/b;

    const-string v2, "{}.recover() All is clean"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->V0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKg/d;

    check-cast v2, LLg/q;

    invoke-virtual {v2}, LLg/q;->f0()Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LLg/l;->d1()Z

    :try_start_0
    invoke-virtual {p0}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-direct {p0, v1}, LLg/l;->b1(LLg/k;)V

    invoke-direct {p0, v0}, LLg/l;->p1(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v1, LLg/l;->v:LEj/b;

    const-string v2, ".recover() Start services exception "

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "{}.recover() We are back!"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "{}.recover() Could not recover we are Down!"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->A0()LKg/a$a;

    :goto_2
    return-void
.end method

.method public r1()V
    .locals 6

    sget-object v0, LLg/l;->v:LEj/b;

    const-string v1, "unregisterAllServices()"

    invoke-interface {v0, v1}, LEj/b;->l(Ljava/lang/String;)V

    iget-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKg/d;

    if-eqz v1, :cond_0

    move-object v2, v1

    check-cast v2, LLg/q;

    sget-object v3, LLg/l;->v:LEj/b;

    const-string v4, "Cancelling service info: {}"

    invoke-interface {v3, v4, v1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2}, LLg/q;->M()Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LLg/l;->v()V

    iget-object v0, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKg/d;

    if-eqz v2, :cond_2

    move-object v3, v2

    check-cast v3, LLg/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v4, LLg/l;->v:LEj/b;

    const-string v5, "Wait for service info cancel: {}"

    invoke-interface {v4, v5, v2}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v3, v4, v5}, LLg/q;->n0(J)Z

    iget-object v3, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method public s()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->s()V

    return-void
.end method

.method public s0(LLg/d;LLg/g;)V
    .locals 5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LLg/l;->d:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_1

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v2

    invoke-virtual {p2}, LLg/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LLg/a;->n(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/b;

    invoke-virtual {p2, v3}, LLg/g;->B(LLg/b;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v0, v1}, LLg/b;->k(J)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v4

    invoke-interface {p1, v4, v0, v1, v3}, LLg/d;->b(LLg/a;JLLg/b;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public s1(JLLg/h;LLg/l$h;)V
    .locals 4

    invoke-virtual {p3, p0}, LLg/h;->E(LLg/l;)LKg/c;

    move-result-object v0

    sget-object v1, LLg/l$h;->Remove:LLg/l$h;

    if-ne p4, v1, :cond_0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {p3}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, LLg/l;->h1(LKg/c;)V

    :cond_0
    iget-object v1, p0, LLg/l;->d:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, LLg/l;->d:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLg/d;

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v3

    invoke-interface {v2, v3, p1, p2, p3}, LLg/d;->b(LLg/a;JLLg/b;)V

    goto :goto_0

    :cond_1
    sget-object p1, Ljavax/jmdns/impl/constants/e;->TYPE_PTR:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {p3}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {p3}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, LLg/l$h;->Remove:LLg/l$h;

    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    :cond_2
    invoke-virtual {v0}, LKg/c;->d()LKg/d;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, LKg/c;->d()LKg/d;

    move-result-object p1

    invoke-virtual {p1}, LKg/d;->D()Z

    move-result p1

    if-nez p1, :cond_4

    :cond_3
    invoke-virtual {v0}, LKg/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, LKg/c;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, ""

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, LLg/l;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LLg/q;

    move-result-object p1

    invoke-virtual {p1}, LKg/d;->D()Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, LLg/p;

    invoke-virtual {v0}, LKg/c;->h()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0}, LKg/c;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, p0, p3, v0, p1}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    move-object v0, p2

    :cond_4
    iget-object p1, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0}, LKg/c;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_5

    monitor-enter p1

    :try_start_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2

    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    :goto_1
    sget-object p1, LLg/l;->v:LEj/b;

    const-string p3, "{}.updating record for event: {} list {} operation: {}"

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, v0, p2, p4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, p3, v1}, LEj/b;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_a

    sget-object p1, LLg/l$g;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p1, p1, p3

    const/4 p3, 0x1

    if-eq p1, p3, :cond_8

    const/4 p3, 0x2

    if-eq p1, p3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LLg/m$a;

    invoke-virtual {p2}, LLg/m;->b()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p2, v0}, LLg/m$a;->e(LKg/c;)V

    goto :goto_2

    :cond_7
    iget-object p3, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    new-instance p4, LLg/l$e;

    invoke-direct {p4, p0, p2, v0}, LLg/l$e;-><init>(LLg/l;LLg/m$a;LKg/c;)V

    invoke-interface {p3, p4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_2

    :cond_8
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LLg/m$a;

    invoke-virtual {p2}, LLg/m;->b()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-virtual {p2, v0}, LLg/m$a;->d(LKg/c;)V

    goto :goto_3

    :cond_9
    iget-object p3, p0, LLg/l;->p:Ljava/util/concurrent/ExecutorService;

    new-instance p4, LLg/l$d;

    invoke-direct {p4, p0, p2, v0}, LLg/l$d;-><init>(LLg/l;LLg/m$a;LKg/c;)V

    invoke-interface {p3, p4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    :cond_a
    :goto_4
    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public t1(J)Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0, p1, p2}, LLg/k;->E(J)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x800

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\t---- Local Host -----"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n\t---- Services -----"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LLg/l;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, ": "

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    const-string v5, "\n\t\tService: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\t---- Types ----"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LLg/l;->i:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/l$j;

    const-string v5, "\n\t\tType: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LLg/l$j;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v3, "no subtypes"

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LLg/l;->g:LLg/a;

    invoke-virtual {v2}, LLg/a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\t---- Service Collectors ----"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LLg/l;->s:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    const-string v5, "\n\t\tService Collector: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\t---- Service Listeners ----"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLg/l;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v3, "\n\t\tService Listener: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u0(LMg/a;Ljavax/jmdns/impl/constants/g;)V
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0, p1, p2}, LLg/k;->b(LMg/a;Ljavax/jmdns/impl/constants/g;)V

    return-void
.end method

.method public v()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->v()V

    return-void
.end method

.method public v0()Z
    .locals 1

    iget-object v0, p0, LLg/l;->l:LLg/k;

    invoke-virtual {v0}, LLg/k;->c()Z

    move-result v0

    return v0
.end method

.method public w0()V
    .locals 8

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v0

    invoke-virtual {v0}, LLg/a;->r()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v3

    invoke-virtual {v3}, LLg/a;->h()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LLg/b;

    :try_start_0
    move-object v5, v4

    check-cast v5, LLg/h;

    invoke-virtual {v5, v0, v1}, LLg/h;->k(J)Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v6, LLg/l$h;->Remove:LLg/l$h;

    invoke-virtual {p0, v0, v1, v5, v6}, LLg/l;->s1(JLLg/h;LLg/l$h;)V

    sget-object v6, LLg/l;->v:LEj/b;

    const-string v7, "Removing DNSEntry from cache: {}"

    invoke-interface {v6, v7, v4}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LLg/l;->z0()LLg/a;

    move-result-object v6

    invoke-virtual {v6, v5}, LLg/a;->s(LLg/b;)Z

    goto :goto_0

    :catch_0
    move-exception v5

    goto :goto_1

    :cond_1
    invoke-virtual {v5, v0, v1}, LLg/h;->N(J)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, LLg/h;->K()V

    invoke-virtual {v5}, LLg/h;->F()LKg/d;

    move-result-object v5

    invoke-virtual {v5}, LKg/d;->A()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0, v5}, LLg/l;->i1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    sget-object v6, LLg/l;->v:LEj/b;

    invoke-virtual {p0}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7, v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "{}.Error while reaping records: {}"

    invoke-interface {v6, v5, v4}, LEj/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v4, LLg/l;->v:LEj/b;

    invoke-virtual {p0}, LLg/l;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, LEj/b;->t(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public y()V
    .locals 2

    invoke-static {}, LLg/j$b;->b()LLg/j$b;

    move-result-object v0

    invoke-virtual {p0}, LLg/l;->B0()LLg/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LLg/j$b;->c(LLg/l;)LLg/j;

    move-result-object v0

    invoke-interface {v0}, LLg/j;->y()V

    return-void
.end method

.method public z0()LLg/a;
    .locals 1

    iget-object v0, p0, LLg/l;->g:LLg/a;

    return-object v0
.end method
