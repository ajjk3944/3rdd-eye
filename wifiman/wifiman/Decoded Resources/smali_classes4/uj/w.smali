.class public final Luj/w;
.super Luj/s;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Luj/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lvj/j;->a()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Luj/w;->a:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Luj/w;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;ZLmh/a;)Ljava/lang/Object;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Luj/w;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    iget-object v1, p0, Luj/w;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmh/a;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_4

    :cond_2
    if-nez p2, :cond_5

    iget-object p2, p0, Luj/w;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lmh/a;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    :cond_3
    if-eqz v0, :cond_4

    :goto_2
    move-object v1, v0

    goto :goto_4

    :cond_4
    invoke-interface {p3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luj/p;

    invoke-virtual {p2}, Luj/p;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, Luj/p;->b()Lmh/a;

    move-result-object p2

    iget-object p3, p0, Luj/w;->a:Ljava/util/Map;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    monitor-enter p2

    :try_start_0
    iget-object v1, p0, Luj/w;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmh/a;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    monitor-exit p2

    goto :goto_2

    :cond_7
    :try_start_1
    invoke-interface {p3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Luj/p;

    invoke-virtual {p3}, Luj/p;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p3}, Luj/p;->b()Lmh/a;

    move-result-object p3

    iget-object v0, p0, Luj/w;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p2

    :goto_4
    return-object v1

    :goto_5
    monitor-exit p2

    throw p1
.end method
