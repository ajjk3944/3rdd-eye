.class public final LT/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ljava/util/List;

.field private c:Ljava/util/List;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LT/b0;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LT/b0;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LT/b0;->c:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, LT/b0;->d:Z

    return-void
.end method

.method public static final synthetic a(LT/b0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LT/b0;->b:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic b(LT/b0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LT/b0;->a:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final c(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LT/b0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-static {p0}, LT/b0;->b(LT/b0;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, LT/b0;->a(LT/b0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    new-instance v1, LT/b0$a;

    invoke-direct {v1, p0, v0}, LT/b0$a;-><init>(LT/b0;LIi/n;)V

    invoke-interface {v0, v1}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    return-object v0

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LT/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, LT/b0;->d:Z

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, LT/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LT/b0;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final f()V
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, LT/b0;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, LT/b0;->e()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, LT/b0;->b:Ljava/util/List;

    iget-object v3, p0, LT/b0;->c:Ljava/util/List;

    iput-object v3, p0, LT/b0;->b:Ljava/util/List;

    iput-object v2, p0, LT/b0;->c:Ljava/util/List;

    iput-boolean v0, p0, LT/b0;->d:Z

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldh/e;

    sget-object v6, LYg/u;->b:LYg/u$a;

    sget-object v6, LYg/J;->a:LYg/J;

    invoke-static {v6}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    add-int/2addr v4, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw v0
.end method
