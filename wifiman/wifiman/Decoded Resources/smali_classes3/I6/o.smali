.class public LI6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lz2/a;


# direct methods
.method public constructor <init>(LJ6/b;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/o;->a:Ljava/util/Map;

    iput-object p2, p0, LI6/o;->b:Lz2/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)LG6/O;
    .locals 4

    iget-object v0, p0, LI6/o;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LI6/a;->a()LG6/O;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LI6/o;->a:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LI6/o;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI6/a;

    if-eqz v1, :cond_1

    invoke-interface {v1}, LI6/a;->a()LG6/O;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LI6/o;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI6/a$a;

    invoke-interface {v1, p1}, LI6/a$a;->b(Ljava/lang/String;)LI6/a$a;

    move-result-object v1

    invoke-interface {v1}, LI6/a$a;->a()LI6/a;

    move-result-object v1

    invoke-interface {v1}, LI6/a;->a()LG6/O;

    move-result-object v2

    iget-object v3, p0, LI6/o;->a:Ljava/util/Map;

    invoke-interface {v3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
