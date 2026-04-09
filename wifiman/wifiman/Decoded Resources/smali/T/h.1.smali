.class public final LT/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/h$a;
    }
.end annotation


# instance fields
.field private final a:Lmh/a;

.field private final b:Ljava/lang/Object;

.field private c:Ljava/lang/Throwable;

.field private d:Ljava/util/List;

.field private e:Ljava/util/List;

.field private final f:LT/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/h;->a:Lmh/a;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/h;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LT/h;->d:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LT/h;->e:Ljava/util/List;

    new-instance p1, LT/g;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, LT/g;-><init>(I)V

    iput-object p1, p0, LT/h;->f:LT/g;

    return-void
.end method

.method public static final synthetic b(LT/h;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, LT/h;->i(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic c(LT/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LT/h;->d:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic d(LT/h;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, LT/h;->c:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static final synthetic e(LT/h;)LT/g;
    .locals 0

    iget-object p0, p0, LT/h;->f:LT/g;

    return-object p0
.end method

.method public static final synthetic f(LT/h;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LT/h;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic g(LT/h;)Lmh/a;
    .locals 0

    iget-object p0, p0, LT/h;->a:Lmh/a;

    return-object p0
.end method

.method private final i(Ljava/lang/Throwable;)V
    .locals 7

    iget-object v0, p0, LT/h;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/h;->c:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, LT/h;->c:Ljava/lang/Throwable;

    iget-object v1, p0, LT/h;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LT/h$a;

    invoke-virtual {v5}, LT/h$a;->a()Ldh/e;

    move-result-object v5

    sget-object v6, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LT/h;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, LT/h;->f:LT/g;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LT/g0$a;->a(LT/g0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->b(LT/g0;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public j(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 5

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LT/h$a;

    invoke-direct {v1, p1, v0}, LT/h$a;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {p0}, LT/h;->f(LT/h;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    invoke-static {p0}, LT/h;->d(LT/h;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {v3}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-static {p0}, LT/h;->c(LT/h;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    invoke-static {p0}, LT/h;->c(LT/h;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v3, :cond_1

    invoke-static {p0}, LT/h;->e(LT/h;)LT/g;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p1

    new-instance p1, LT/h$b;

    invoke-direct {p1, p0, v1}, LT/h$b;-><init>(LT/h;LT/h$a;)V

    invoke-interface {v0, p1}, LIi/n;->B(Lmh/l;)V

    if-eqz v3, :cond_2

    invoke-static {p0}, LT/h;->g(LT/h;)Lmh/a;

    move-result-object p1

    if-eqz p1, :cond_2

    :try_start_2
    invoke-static {p0}, LT/h;->g(LT/h;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-static {p0, p1}, LT/h;->b(LT/h;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_3

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_3
    return-object p1

    :goto_1
    monitor-exit p1

    throw p2
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LT/h;->f:LT/g;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(J)V
    .locals 5

    iget-object v0, p0, LT/h;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/h;->d:Ljava/util/List;

    iget-object v2, p0, LT/h;->e:Ljava/util/List;

    iput-object v2, p0, LT/h;->d:Ljava/util/List;

    iput-object v1, p0, LT/h;->e:Ljava/util/List;

    iget-object v2, p0, LT/h;->f:LT/g;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT/h$a;

    invoke-virtual {v4, p1, p2}, LT/h$a;->b(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->c(LT/g0;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->d(LT/g0;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
