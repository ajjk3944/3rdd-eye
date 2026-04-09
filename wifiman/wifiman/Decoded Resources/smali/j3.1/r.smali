.class public Lj3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ld3/e;

.field private final c:Lk3/d;

.field private final d:Lj3/x;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Ll3/a;

.field private final g:Lm3/a;

.field private final h:Lm3/a;

.field private final i:Lk3/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld3/e;Lk3/d;Lj3/x;Ljava/util/concurrent/Executor;Ll3/a;Lm3/a;Lm3/a;Lk3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/r;->a:Landroid/content/Context;

    iput-object p2, p0, Lj3/r;->b:Ld3/e;

    iput-object p3, p0, Lj3/r;->c:Lk3/d;

    iput-object p4, p0, Lj3/r;->d:Lj3/x;

    iput-object p5, p0, Lj3/r;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lj3/r;->f:Ll3/a;

    iput-object p7, p0, Lj3/r;->g:Lm3/a;

    iput-object p8, p0, Lj3/r;->h:Lm3/a;

    iput-object p9, p0, Lj3/r;->i:Lk3/c;

    return-void
.end method

.method public static synthetic a(Lj3/r;Lc3/p;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lj3/r;->m(Lc3/p;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj3/r;Ljava/lang/Iterable;Lc3/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lj3/r;->n(Ljava/lang/Iterable;Lc3/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj3/r;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lj3/r;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj3/r;Lc3/p;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lj3/r;->l(Lc3/p;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lj3/r;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lj3/r;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lj3/r;Lc3/p;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lj3/r;->s(Lc3/p;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lj3/r;Lc3/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj3/r;->r(Lc3/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lj3/r;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lj3/r;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lj3/r;Lc3/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj3/r;->t(Lc3/p;ILjava/lang/Runnable;)V

    return-void
.end method

.method private synthetic l(Lc3/p;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lj3/r;->c:Lk3/d;

    invoke-interface {v0, p1}, Lk3/d;->e(Lc3/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Lc3/p;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lj3/r;->c:Lk3/d;

    invoke-interface {v0, p1}, Lk3/d;->I(Lc3/p;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;Lc3/p;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj3/r;->c:Lk3/d;

    invoke-interface {v0, p1}, Lk3/d;->c0(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lj3/r;->c:Lk3/d;

    iget-object v0, p0, Lj3/r;->g:Lm3/a;

    invoke-interface {v0}, Lm3/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lk3/d;->O(Lc3/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj3/r;->c:Lk3/d;

    invoke-interface {v0, p1}, Lk3/d;->i(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj3/r;->i:Lk3/c;

    invoke-interface {v0}, Lk3/c;->g()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lj3/r;->i:Lk3/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lf3/c$b;->INVALID_PAYLOD:Lf3/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lk3/c;->a(JLf3/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(Lc3/p;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj3/r;->c:Lk3/d;

    iget-object v1, p0, Lj3/r;->g:Lm3/a;

    invoke-interface {v1}, Lm3/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lk3/d;->O(Lc3/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(Lc3/p;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj3/r;->d:Lj3/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lj3/x;->b(Lc3/p;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(Lc3/p;ILjava/lang/Runnable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lj3/r;->f:Ll3/a;

    iget-object v1, p0, Lj3/r;->c:Lk3/d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lj3/i;

    invoke-direct {v2, v1}, Lj3/i;-><init>(Lk3/d;)V

    invoke-interface {v0, v2}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Lj3/r;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj3/r;->f:Ll3/a;

    new-instance v1, Lj3/j;

    invoke-direct {v1, p0, p1, p2}, Lj3/j;-><init>(Lj3/r;Lc3/p;I)V

    invoke-interface {v0, v1}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj3/r;->u(Lc3/p;I)Ld3/g;
    :try_end_0
    .catch Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v0, p0, Lj3/r;->d:Lj3/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lj3/x;->b(Lc3/p;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p1
.end method


# virtual methods
.method public j(Ld3/m;)Lc3/i;
    .locals 4

    iget-object v0, p0, Lj3/r;->f:Ll3/a;

    iget-object v1, p0, Lj3/r;->i:Lk3/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lj3/h;

    invoke-direct {v2, v1}, Lj3/h;-><init>(Lk3/c;)V

    invoke-interface {v0, v2}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf3/a;

    invoke-static {}, Lc3/i;->a()Lc3/i$a;

    move-result-object v1

    iget-object v2, p0, Lj3/r;->g:Lm3/a;

    invoke-interface {v2}, Lm3/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lc3/i$a;->i(J)Lc3/i$a;

    move-result-object v1

    iget-object v2, p0, Lj3/r;->h:Lm3/a;

    invoke-interface {v2}, Lm3/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lc3/i$a;->o(J)Lc3/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, Lc3/i$a;->n(Ljava/lang/String;)Lc3/i$a;

    move-result-object v1

    new-instance v2, Lc3/h;

    const-string v3, "proto"

    invoke-static {v3}, La3/b;->b(Ljava/lang/String;)La3/b;

    move-result-object v3

    invoke-virtual {v0}, Lf3/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lc3/h;-><init>(La3/b;[B)V

    invoke-virtual {v1, v2}, Lc3/i$a;->h(Lc3/h;)Lc3/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lc3/i$a;->d()Lc3/i;

    move-result-object v0

    invoke-interface {p1, v0}, Ld3/m;->b(Lc3/i;)Lc3/i;

    move-result-object p1

    return-object p1
.end method

.method k()Z
    .locals 2

    iget-object v0, p0, Lj3/r;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(Lc3/p;I)Ld3/g;
    .locals 11

    iget-object v0, p0, Lj3/r;->b:Ld3/e;

    invoke-virtual {p1}, Lc3/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ld3/e;->get(Ljava/lang/String;)Ld3/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ld3/g;->e(J)Ld3/g;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    :cond_1
    :goto_1
    iget-object v1, p0, Lj3/r;->f:Ll3/a;

    new-instance v2, Lj3/k;

    invoke-direct {v2, p0, p1}, Lj3/k;-><init>(Lj3/r;Lc3/p;)V

    invoke-interface {v1, v2}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lj3/r;->f:Ll3/a;

    new-instance v2, Lj3/l;

    invoke-direct {v2, p0, p1}, Lj3/l;-><init>(Lj3/r;Lc3/p;)V

    invoke-interface {v1, v2}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, Lg3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ld3/g;->a()Ld3/g;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk3/k;

    invoke-virtual {v3}, Lk3/k;->b()Lc3/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lc3/p;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Lj3/r;->j(Ld3/m;)Lc3/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, Ld3/f;->a()Ld3/f$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ld3/f$a;->b(Ljava/lang/Iterable;)Ld3/f$a;

    move-result-object v1

    invoke-virtual {p1}, Lc3/p;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ld3/f$a;->c([B)Ld3/f$a;

    move-result-object v1

    invoke-virtual {v1}, Ld3/f$a;->a()Ld3/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ld3/m;->a(Ld3/f;)Ld3/g;

    move-result-object v1

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, Ld3/g;->c()Ld3/g$a;

    move-result-object v1

    sget-object v2, Ld3/g$a;->TRANSIENT_ERROR:Ld3/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Lj3/r;->f:Ll3/a;

    new-instance v1, Lj3/m;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lj3/m;-><init>(Lj3/r;Ljava/lang/Iterable;Lc3/p;J)V

    invoke-interface {v0, v1}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    iget-object v0, p0, Lj3/r;->d:Lj3/x;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, Lj3/x;->a(Lc3/p;IZ)V

    return-object v3

    :cond_6
    iget-object v1, p0, Lj3/r;->f:Ll3/a;

    new-instance v2, Lj3/n;

    invoke-direct {v2, p0, v6}, Lj3/n;-><init>(Lj3/r;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    invoke-virtual {v3}, Ld3/g;->c()Ld3/g$a;

    move-result-object v1

    sget-object v2, Ld3/g$a;->OK:Ld3/g$a;

    if-ne v1, v2, :cond_7

    invoke-virtual {v3}, Ld3/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, Lc3/p;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lj3/r;->f:Ll3/a;

    new-instance v5, Lj3/o;

    invoke-direct {v5, p0}, Lj3/o;-><init>(Lj3/r;)V

    invoke-interface {v4, v5}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, Ld3/g;->c()Ld3/g$a;

    move-result-object v1

    sget-object v2, Ld3/g$a;->INVALID_PAYLOAD:Ld3/g$a;

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk3/k;

    invoke-virtual {v4}, Lk3/k;->b()Lc3/i;

    move-result-object v4

    invoke-virtual {v4}, Lc3/i;->n()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    iget-object v2, p0, Lj3/r;->f:Ll3/a;

    new-instance v4, Lj3/p;

    invoke-direct {v4, p0, v1}, Lj3/p;-><init>(Lj3/r;Ljava/util/Map;)V

    invoke-interface {v2, v4}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    iget-object p2, p0, Lj3/r;->f:Ll3/a;

    new-instance v0, Lj3/q;

    invoke-direct {v0, p0, p1, v8, v9}, Lj3/q;-><init>(Lj3/r;Lc3/p;J)V

    invoke-interface {p2, v0}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(Lc3/p;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lj3/r;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lj3/g;

    invoke-direct {v1, p0, p1, p2, p3}, Lj3/g;-><init>(Lj3/r;Lc3/p;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
