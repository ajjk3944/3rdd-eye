.class final LMj/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMj/p$b;,
        LMj/p$c;
    }
.end annotation


# instance fields
.field private final a:LMj/v;

.field private final b:Ljava/lang/Object;

.field private final c:[Ljava/lang/Object;

.field private final d:Lokhttp3/Call$Factory;

.field private final e:LMj/h;

.field private volatile f:Z

.field private g:Lokhttp3/Call;

.field private h:Ljava/lang/Throwable;

.field private i:Z


# direct methods
.method constructor <init>(LMj/v;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/Call$Factory;LMj/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMj/p;->a:LMj/v;

    iput-object p2, p0, LMj/p;->b:Ljava/lang/Object;

    iput-object p3, p0, LMj/p;->c:[Ljava/lang/Object;

    iput-object p4, p0, LMj/p;->d:Lokhttp3/Call$Factory;

    iput-object p5, p0, LMj/p;->e:LMj/h;

    return-void
.end method

.method private c()Lokhttp3/Call;
    .locals 4

    iget-object v0, p0, LMj/p;->d:Lokhttp3/Call$Factory;

    iget-object v1, p0, LMj/p;->a:LMj/v;

    iget-object v2, p0, LMj/p;->b:Ljava/lang/Object;

    iget-object v3, p0, LMj/p;->c:[Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, LMj/v;->a(Ljava/lang/Object;[Ljava/lang/Object;)Lokhttp3/Request;

    move-result-object v1

    invoke-interface {v0, v1}, Lokhttp3/Call$Factory;->b(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Call.Factory returned null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d()Lokhttp3/Call;
    .locals 2

    iget-object v0, p0, LMj/p;->g:Lokhttp3/Call;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LMj/p;->h:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_1
    check-cast v0, Ljava/lang/Error;

    throw v0

    :cond_2
    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_3
    :try_start_0
    invoke-direct {p0}, LMj/p;->c()Lokhttp3/Call;

    move-result-object v0

    iput-object v0, p0, LMj/p;->g:Lokhttp3/Call;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-static {v0}, LMj/B;->t(Ljava/lang/Throwable;)V

    iput-object v0, p0, LMj/p;->h:Ljava/lang/Throwable;

    throw v0
.end method


# virtual methods
.method public K0(LMj/f;)V
    .locals 3

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LMj/p;->i:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, LMj/p;->i:Z

    iget-object v0, p0, LMj/p;->g:Lokhttp3/Call;

    iget-object v1, p0, LMj/p;->h:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    :try_start_1
    invoke-direct {p0}, LMj/p;->c()Lokhttp3/Call;

    move-result-object v2

    iput-object v2, p0, LMj/p;->g:Lokhttp3/Call;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, LMj/B;->t(Ljava/lang/Throwable;)V

    iput-object v1, p0, LMj/p;->h:Ljava/lang/Throwable;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_1

    invoke-interface {p1, p0, v1}, LMj/f;->b(LMj/d;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iget-boolean v1, p0, LMj/p;->f:Z

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    :cond_2
    new-instance v1, LMj/p$a;

    invoke-direct {v1, p0, p1}, LMj/p$a;-><init>(LMj/p;LMj/f;)V

    invoke-interface {v0, v1}, Lokhttp3/Call;->T(Lokhttp3/Callback;)V

    return-void

    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already executed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public b()LMj/p;
    .locals 7

    new-instance v6, LMj/p;

    iget-object v1, p0, LMj/p;->a:LMj/v;

    iget-object v2, p0, LMj/p;->b:Ljava/lang/Object;

    iget-object v3, p0, LMj/p;->c:[Ljava/lang/Object;

    iget-object v4, p0, LMj/p;->d:Lokhttp3/Call$Factory;

    iget-object v5, p0, LMj/p;->e:LMj/h;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LMj/p;-><init>(LMj/v;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/Call$Factory;LMj/h;)V

    return-object v6
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LMj/p;->f:Z

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LMj/p;->g:Lokhttp3/Call;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public bridge synthetic clone()LMj/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LMj/p;->b()LMj/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, LMj/p;->b()LMj/p;

    move-result-object v0

    return-object v0
.end method

.method e(Lokhttp3/Response;)LMj/w;
    .locals 5

    invoke-virtual {p1}, Lokhttp3/Response;->a()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/Response;->Y()Lokhttp3/Response$Builder;

    move-result-object p1

    new-instance v1, LMj/p$c;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->s()Lokhttp3/MediaType;

    move-result-object v2

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->p()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, LMj/p$c;-><init>(Lokhttp3/MediaType;J)V

    invoke-virtual {p1, v1}, Lokhttp3/Response$Builder;->b(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Response$Builder;->c()Lokhttp3/Response;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Response;->p()I

    move-result v1

    const/16 v2, 0xc8

    if-lt v1, v2, :cond_3

    const/16 v2, 0x12c

    if-lt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0xcc

    if-eq v1, v2, :cond_2

    const/16 v2, 0xcd

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, LMj/p$b;

    invoke-direct {v1, v0}, LMj/p$b;-><init>(Lokhttp3/ResponseBody;)V

    :try_start_0
    iget-object v0, p0, LMj/p;->e:LMj/h;

    invoke-interface {v0, v1}, LMj/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, LMj/w;->h(Ljava/lang/Object;Lokhttp3/Response;)LMj/w;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {v1}, LMj/p$b;->J()V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    const/4 v0, 0x0

    invoke-static {v0, p1}, LMj/w;->h(Ljava/lang/Object;Lokhttp3/Response;)LMj/w;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    :try_start_1
    invoke-static {v0}, LMj/B;->a(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-static {v1, p1}, LMj/w;->c(Lokhttp3/ResponseBody;Lokhttp3/Response;)LMj/w;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    throw p1
.end method

.method public g()LMj/w;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LMj/p;->i:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, LMj/p;->i:Z

    invoke-direct {p0}, LMj/p;->d()Lokhttp3/Call;

    move-result-object v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, LMj/p;->f:Z

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    :cond_0
    invoke-interface {v0}, Lokhttp3/Call;->g()Lokhttp3/Response;

    move-result-object v0

    invoke-virtual {p0, v0}, LMj/p;->e(Lokhttp3/Response;)LMj/w;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already executed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized j()Lokhttp3/Request;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, LMj/p;->d()Lokhttp3/Call;

    move-result-object v0

    invoke-interface {v0}, Lokhttp3/Call;->j()Lokhttp3/Request;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to create request."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public v()Z
    .locals 2

    iget-boolean v0, p0, LMj/p;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LMj/p;->g:Lokhttp3/Call;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lokhttp3/Call;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0

    return v1

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
