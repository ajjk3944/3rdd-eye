.class public abstract Lxg4;
.super Lpg4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Lws3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpg4;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxg4;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg4;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lwg4;

    .line 22
    .line 23
    iget-object v2, v1, Lwg4;->a:Lpg4;

    .line 24
    .line 25
    iget-object v1, v1, Lwg4;->b:Lsg4;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lpg4;->o(Llh4;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg4;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lwg4;

    .line 22
    .line 23
    iget-object v2, v1, Lwg4;->a:Lpg4;

    .line 24
    .line 25
    iget-object v1, v1, Lwg4;->b:Lsg4;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lpg4;->p(Llh4;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxg4;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lwg4;

    .line 22
    .line 23
    iget-object v3, v2, Lwg4;->a:Lpg4;

    .line 24
    .line 25
    iget-object v4, v2, Lwg4;->b:Lsg4;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Lpg4;->q(Llh4;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v2, Lwg4;->c:Lvg4;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lpg4;->l(Lrh4;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Lpg4;->m(Lkf4;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg4;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lwg4;

    .line 22
    .line 23
    iget-object v1, v1, Lwg4;->a:Lpg4;

    .line 24
    .line 25
    invoke-virtual {v1}, Lpg4;->r()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public abstract s(Ljava/lang/Object;Lpg4;Loz1;)V
.end method

.method public final t(Ljava/lang/Integer;Lpg4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxg4;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    xor-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-static {v1}, Lzt0;->D(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lsg4;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Lsg4;-><init>(Lxg4;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lvg4;

    .line 18
    .line 19
    invoke-direct {v2, p0, p1}, Lvg4;-><init>(Lxg4;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lwg4;

    .line 23
    .line 24
    invoke-direct {v3, p2, v1, v2}, Lwg4;-><init>(Lpg4;Lsg4;Lvg4;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lxg4;->i:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, p2, Lpg4;->c:Lwt2;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v3, Lmh4;

    .line 41
    .line 42
    invoke-direct {v3, p1, v2}, Lmh4;-><init>(Landroid/os/Handler;Lrh4;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Lwt2;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lxg4;->i:Landroid/os/Handler;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object p1, p2, Lpg4;->d:Llv2;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, Ljf4;

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljf4;-><init>(Lkf4;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, Llv2;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lxg4;->j:Lws3;

    .line 75
    .line 76
    iget-object v0, p0, Lpg4;->g:Lxd4;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1, p1, v0}, Lpg4;->n(Llh4;Lws3;Lxd4;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lpg4;->b:Ljava/util/HashSet;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Lpg4;->p(Llh4;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    return-void
.end method

.method public u(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract v(Ljava/lang/Object;Lkh4;)Lkh4;
.end method

.method public w(JLjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
