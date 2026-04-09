.class public abstract LOg/c;
.super LMg/a;
.source "SourceFile"


# static fields
.field static d:LEj/b;

.field private static e:I


# instance fields
.field private final b:I

.field private c:Ljavax/jmdns/impl/constants/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LOg/c;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LOg/c;->d:LEj/b;

    sget v0, Ljavax/jmdns/impl/constants/a;->d:I

    sput v0, LOg/c;->e:I

    return-void
.end method

.method public constructor <init>(LLg/l;I)V
    .locals 0

    invoke-direct {p0, p1}, LMg/a;-><init>(LLg/l;)V

    const/4 p1, 0x0

    iput-object p1, p0, LOg/c;->c:Ljavax/jmdns/impl/constants/g;

    iput p2, p0, LOg/c;->b:I

    return-void
.end method

.method public static n()I
    .locals 1

    sget v0, LOg/c;->e:I

    return v0
.end method


# virtual methods
.method protected g(Ljava/util/List;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/i;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p0}, LLg/i;->h(LMg/a;)Z

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    return-void
.end method

.method protected abstract h()V
.end method

.method protected i(Ljavax/jmdns/impl/constants/g;)V
    .locals 2

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, LLg/l;->u0(LMg/a;Ljavax/jmdns/impl/constants/g;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->K0()Ljava/util/Map;

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

    invoke-virtual {v1, p0, p1}, LLg/q;->L(LMg/a;Ljavax/jmdns/impl/constants/g;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected abstract j(LLg/f;)LLg/f;
.end method

.method protected abstract k(LLg/q;LLg/f;)LLg/f;
.end method

.method protected abstract l()Z
.end method

.method protected abstract m()LLg/f;
.end method

.method public o()I
    .locals 1

    iget v0, p0, LOg/c;->b:I

    return v0
.end method

.method public abstract p()Ljava/lang/String;
.end method

.method protected q()Ljavax/jmdns/impl/constants/g;
    .locals 1

    iget-object v0, p0, LOg/c;->c:Ljavax/jmdns/impl/constants/g;

    return-object v0
.end method

.method protected abstract r(Ljava/lang/Throwable;)V
.end method

.method public run()V
    .locals 9

    invoke-virtual {p0}, LOg/c;->m()LLg/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, LOg/c;->l()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v3

    invoke-virtual {p0}, LOg/c;->q()Ljavax/jmdns/impl/constants/g;

    move-result-object v4

    invoke-virtual {v3, p0, v4}, LLg/l;->U0(LMg/a;Ljavax/jmdns/impl/constants/g;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, LOg/c;->d:LEj/b;

    const-string v4, "{}.run() JmDNS {} {}"

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, LOg/c;->p()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v7

    invoke-virtual {v7}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v5, v6, v7}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v4, v5}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, LOg/c;->j(LLg/f;)LLg/f;

    move-result-object v0

    goto :goto_0

    :catchall_1
    move-exception v0

    goto/16 :goto_4

    :cond_1
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LKg/d;

    check-cast v3, LLg/q;

    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p0}, LOg/c;->q()Ljavax/jmdns/impl/constants/g;

    move-result-object v4

    invoke-virtual {v3, p0, v4}, LLg/q;->c0(LMg/a;Ljavax/jmdns/impl/constants/g;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, LOg/c;->d:LEj/b;

    const-string v5, "{}.run() JmDNS {} {}"

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, LOg/c;->p()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, LLg/q;->u()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v5, v6}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3, v0}, LOg/c;->k(LLg/q;LLg/f;)LLg/f;

    move-result-object v0

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit v3

    goto :goto_1

    :goto_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    throw v0

    :cond_3
    invoke-virtual {v0}, LLg/e;->n()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, LOg/c;->d:LEj/b;

    const-string v3, "{}.run() JmDNS {} #{}"

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, LOg/c;->p()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, LOg/c;->q()Ljavax/jmdns/impl/constants/g;

    move-result-object v6

    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2, v0}, LLg/l;->m1(LLg/f;)V

    invoke-virtual {p0, v1}, LOg/c;->g(Ljava/util/List;)V

    goto :goto_6

    :cond_4
    invoke-virtual {p0, v1}, LOg/c;->g(Ljava/util/List;)V

    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-void

    :goto_4
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_5
    sget-object v1, LOg/c;->d:LEj/b;

    const-string v2, "{}.run() exception "

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, LOg/c;->r(Ljava/lang/Throwable;)V

    :goto_6
    invoke-virtual {p0}, LOg/c;->h()V

    return-void
.end method

.method protected s()V
    .locals 2

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1, p0}, LLg/l;->f1(LMg/a;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->K0()Ljava/util/Map;

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

    invoke-virtual {v1, p0}, LLg/q;->g0(LMg/a;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method protected t(Ljavax/jmdns/impl/constants/g;)V
    .locals 0

    iput-object p1, p0, LOg/c;->c:Ljavax/jmdns/impl/constants/g;

    return-void
.end method
