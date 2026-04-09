.class public LM4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM4/o$a;
    }
.end annotation


# instance fields
.field private final a:LM4/g;

.field private final b:LL4/f;

.field private c:Ljava/lang/String;

.field private final d:LM4/o$a;

.field private final e:LM4/o$a;

.field private final f:LM4/k;

.field private final g:Ljava/util/concurrent/atomic/AtomicMarkableReference;


# direct methods
.method public constructor <init>(Ljava/lang/String;LQ4/g;LL4/f;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LM4/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LM4/o$a;-><init>(LM4/o;Z)V

    iput-object v0, p0, LM4/o;->d:LM4/o$a;

    new-instance v0, LM4/o$a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, LM4/o$a;-><init>(LM4/o;Z)V

    iput-object v0, p0, LM4/o;->e:LM4/o$a;

    new-instance v0, LM4/k;

    const/16 v2, 0x80

    invoke-direct {v0, v2}, LM4/k;-><init>(I)V

    iput-object v0, p0, LM4/o;->f:LM4/k;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    iput-object p1, p0, LM4/o;->c:Ljava/lang/String;

    new-instance p1, LM4/g;

    invoke-direct {p1, p2}, LM4/g;-><init>(LQ4/g;)V

    iput-object p1, p0, LM4/o;->a:LM4/g;

    iput-object p3, p0, LM4/o;->b:LL4/f;

    return-void
.end method

.method public static synthetic a(LM4/o;)V
    .locals 0

    invoke-direct {p0}, LM4/o;->m()V

    return-void
.end method

.method public static synthetic b(LM4/o;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LM4/o;->j(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(LM4/o;)LL4/f;
    .locals 0

    iget-object p0, p0, LM4/o;->b:LL4/f;

    return-object p0
.end method

.method static synthetic d(LM4/o;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LM4/o;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(LM4/o;)LM4/g;
    .locals 0

    iget-object p0, p0, LM4/o;->a:LM4/g;

    return-object p0
.end method

.method private synthetic j(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 2

    invoke-virtual {p0}, LM4/o;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LM4/o;->a:LM4/g;

    invoke-virtual {p0}, LM4/o;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LM4/g;->t(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LM4/o;->a:LM4/g;

    invoke-virtual {v0, p1, p2}, LM4/g;->q(Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, LM4/o;->a:LM4/g;

    invoke-virtual {p2, p1, p3}, LM4/g;->s(Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public static k(Ljava/lang/String;LQ4/g;LL4/f;)LM4/o;
    .locals 3

    new-instance v0, LM4/g;

    invoke-direct {v0, p1}, LM4/g;-><init>(LQ4/g;)V

    new-instance v1, LM4/o;

    invoke-direct {v1, p0, p1, p2}, LM4/o;-><init>(Ljava/lang/String;LQ4/g;LL4/f;)V

    iget-object p1, v1, LM4/o;->d:LM4/o$a;

    iget-object p1, p1, LM4/o$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM4/e;

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, LM4/g;->i(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, LM4/e;->e(Ljava/util/Map;)V

    iget-object p1, v1, LM4/o;->e:LM4/o$a;

    iget-object p1, p1, LM4/o$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM4/e;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v2}, LM4/g;->i(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, LM4/e;->e(Ljava/util/Map;)V

    iget-object p1, v1, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0, p0}, LM4/g;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, p2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    iget-object p1, v1, LM4/o;->f:LM4/k;

    invoke-virtual {v0, p0}, LM4/g;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, LM4/k;->c(Ljava/util/List;)Z

    return-object v1
.end method

.method public static l(Ljava/lang/String;LQ4/g;)Ljava/lang/String;
    .locals 1

    new-instance v0, LM4/g;

    invoke-direct {v0, p1}, LM4/g;-><init>(LQ4/g;)V

    invoke-virtual {v0, p0}, LM4/g;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private m()V
    .locals 4

    iget-object v0, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LM4/o;->i()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    iget-object v0, p0, LM4/o;->a:LM4/g;

    iget-object v2, p0, LM4/o;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, LM4/g;->t(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public f(Ljava/util/Map;)Ljava/util/Map;
    .locals 7

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LM4/o;->d:LM4/o$a;

    invoke-virtual {p1}, LM4/o$a;->b()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LM4/o;->d:LM4/o$a;

    invoke-virtual {v0}, LM4/o$a;->b()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/16 v3, 0x400

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v3}, LM4/e;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v5

    const/16 v6, 0x40

    if-lt v5, v6, :cond_2

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v3}, LM4/e;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    if-lez v0, :cond_4

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Ignored "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " keys when adding event specific keys. Maximum allowable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public g()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LM4/o;->e:LM4/o$a;

    invoke-virtual {v0}, LM4/o$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM4/o;->f:LM4/k;

    invoke-virtual {v0}, LM4/k;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LM4/o;->d:LM4/o$a;

    invoke-virtual {v0, p1, p2}, LM4/o$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LM4/o;->e:LM4/o$a;

    invoke-virtual {v0, p1, p2}, LM4/o$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, LM4/o;->c:Ljava/lang/String;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LM4/o;->c:Ljava/lang/String;

    iget-object v1, p0, LM4/o;->d:LM4/o$a;

    invoke-virtual {v1}, LM4/o$a;->b()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, LM4/o;->f:LM4/k;

    invoke-virtual {v2}, LM4/k;->b()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, LM4/o;->b:LL4/f;

    iget-object v3, v3, LL4/f;->b:LL4/e;

    new-instance v4, LM4/l;

    invoke-direct {v4, p0, p1, v1, v2}, LM4/l;-><init>(LM4/o;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    invoke-virtual {v3, v4}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public q(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x400

    invoke-static {p1, v0}, LM4/e;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/google/firebase/crashlytics/internal/common/i;->y(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LM4/o;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LM4/o;->b:LL4/f;

    iget-object p1, p1, LL4/f;->b:LL4/e;

    new-instance v0, LM4/m;

    invoke-direct {v0, p0}, LM4/m;-><init>(LM4/o;)V

    invoke-virtual {p1, v0}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
