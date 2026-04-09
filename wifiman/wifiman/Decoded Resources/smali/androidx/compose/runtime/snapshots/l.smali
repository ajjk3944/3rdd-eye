.class public final Landroidx/compose/runtime/snapshots/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/l$a;
    }
.end annotation


# static fields
.field public static final k:I = 0x8


# instance fields
.field private final a:Lmh/l;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;

.field private c:Z

.field private final d:Lmh/p;

.field private final e:Lmh/l;

.field private final f:LV/b;

.field private g:Ld0/b;

.field private h:Z

.field private i:Landroidx/compose/runtime/snapshots/l$a;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l;->a:Lmh/l;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Landroidx/compose/runtime/snapshots/l$b;

    invoke-direct {p1, p0}, Landroidx/compose/runtime/snapshots/l$b;-><init>(Landroidx/compose/runtime/snapshots/l;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l;->d:Lmh/p;

    new-instance p1, Landroidx/compose/runtime/snapshots/l$c;

    invoke-direct {p1, p0}, Landroidx/compose/runtime/snapshots/l$c;-><init>(Landroidx/compose/runtime/snapshots/l;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l;->e:Lmh/l;

    new-instance p1, LV/b;

    const/16 v0, 0x10

    new-array v0, v0, [Landroidx/compose/runtime/snapshots/l$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/compose/runtime/snapshots/l;->j:J

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/runtime/snapshots/l;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/runtime/snapshots/l;->i(Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic b(Landroidx/compose/runtime/snapshots/l;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/l;->m()Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Landroidx/compose/runtime/snapshots/l;)Landroidx/compose/runtime/snapshots/l$a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/snapshots/l;->i:Landroidx/compose/runtime/snapshots/l$a;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/compose/runtime/snapshots/l;)LV/b;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    return-object p0
.end method

.method public static final synthetic e(Landroidx/compose/runtime/snapshots/l;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/runtime/snapshots/l;->c:Z

    return p0
.end method

.method public static final synthetic f(Landroidx/compose/runtime/snapshots/l;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/runtime/snapshots/l;->h:Z

    return p0
.end method

.method public static final synthetic g(Landroidx/compose/runtime/snapshots/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/l;->r()V

    return-void
.end method

.method public static final synthetic h(Landroidx/compose/runtime/snapshots/l;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/runtime/snapshots/l;->c:Z

    return-void
.end method

.method private final i(Ljava/util/Set;)V
    .locals 3

    :cond_0
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Ljava/util/Set;

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Set;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    :goto_0
    iget-object v2, p0, Landroidx/compose/runtime/snapshots/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_3
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/l;->q()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method private final m()Z
    .locals 9

    const/4 v0, 0x1

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Landroidx/compose/runtime/snapshots/l;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v1

    const/4 v1, 0x0

    if-eqz v2, :cond_0

    return v1

    :cond_0
    move v2, v1

    :goto_0
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/l;->p()Ljava/util/Set;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    iget-object v4, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    monitor-enter v4

    :try_start_1
    iget-object v5, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    invoke-virtual {v5}, LV/b;->o()I

    move-result v6

    if-lez v6, :cond_5

    invoke-virtual {v5}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    move v7, v1

    :cond_2
    aget-object v8, v5, v7

    check-cast v8, Landroidx/compose/runtime/snapshots/l$a;

    invoke-virtual {v8, v3}, Landroidx/compose/runtime/snapshots/l$a;->j(Ljava/util/Set;)Z

    move-result v8

    if-nez v8, :cond_4

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    goto :goto_2

    :cond_4
    :goto_1
    move v2, v0

    :goto_2
    add-int/2addr v7, v0

    if-lt v7, v6, :cond_2

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_5
    :goto_3
    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    goto :goto_0

    :goto_4
    monitor-exit v4

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private final n(Lmh/l;)Landroidx/compose/runtime/snapshots/l$a;
    .locals 5

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    move-object v4, v3

    check-cast v4, Landroidx/compose/runtime/snapshots/l$a;

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/l$a;->f()Lmh/l;

    move-result-object v4

    if-ne v4, p1, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    check-cast v3, Landroidx/compose/runtime/snapshots/l$a;

    if-nez v3, :cond_3

    new-instance v0, Landroidx/compose/runtime/snapshots/l$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmh/l;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/snapshots/l$a;-><init>(Lmh/l;)V

    iget-object p1, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    invoke-virtual {p1, v0}, LV/b;->b(Ljava/lang/Object;)Z

    return-object v0

    :cond_3
    return-object v3
.end method

.method private final p()Ljava/util/Set;
    .locals 7

    :cond_0
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    instance-of v2, v0, Ljava/util/Set;

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Ljava/util/Set;

    goto :goto_1

    :cond_2
    instance-of v2, v0, Ljava/util/List;

    if-eqz v2, :cond_5

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ne v4, v6, :cond_3

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v6, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v2, v5, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    :cond_4
    :goto_0
    move-object v2, v3

    :goto_1
    iget-object v3, p0, Landroidx/compose/runtime/snapshots/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v3, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v2

    :cond_5
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/l;->q()Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method private final q()Ljava/lang/Void;
    .locals 1

    const-string v0, "Unexpected notification"

    invoke-static {v0}, LT/o;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method private final r()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->a:Lmh/l;

    new-instance v1, Landroidx/compose/runtime/snapshots/l$d;

    invoke-direct {v1, p0}, Landroidx/compose/runtime/snapshots/l$d;-><init>(Landroidx/compose/runtime/snapshots/l;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j()V
    .locals 5

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Landroidx/compose/runtime/snapshots/l$a;

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/l$a;->c()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v3

    check-cast v5, Landroidx/compose/runtime/snapshots/l$a;

    invoke-virtual {v5, p1}, Landroidx/compose/runtime/snapshots/l$a;->e(Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/l$a;->g()Z

    move-result v5

    if-nez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    if-lez v4, :cond_1

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    sub-int v6, v3, v4

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v7

    aget-object v7, v7, v3

    aput-object v7, v5, v6

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    sub-int v3, v2, v4

    const/4 v4, 0x0

    invoke-static {p1, v4, v3, v2}, LZg/n;->v([Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v1, v3}, LV/b;->D(I)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public final l(Lmh/l;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v3

    check-cast v5, Landroidx/compose/runtime/snapshots/l$a;

    invoke-virtual {v5, p1}, Landroidx/compose/runtime/snapshots/l$a;->n(Lmh/l;)V

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/l$a;->g()Z

    move-result v5

    if-nez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    if-lez v4, :cond_1

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    sub-int v6, v3, v4

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v7

    aget-object v7, v7, v3

    aput-object v7, v5, v6

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    sub-int v3, v2, v4

    const/4 v4, 0x0

    invoke-static {p1, v4, v3, v2}, LZg/n;->v([Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v1, v3}, LV/b;->D(I)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public final o(Ljava/lang/Object;Lmh/l;Lmh/a;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->f:LV/b;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p2}, Landroidx/compose/runtime/snapshots/l;->n(Lmh/l;)Landroidx/compose/runtime/snapshots/l$a;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/l;->h:Z

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l;->i:Landroidx/compose/runtime/snapshots/l$a;

    iget-wide v2, p0, Landroidx/compose/runtime/snapshots/l;->j:J

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-static {}, LT/c;->a()J

    move-result-wide v6

    cmp-long v4, v2, v6

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    if-nez v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "), currentThread={id="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, LT/c;->a()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", name="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, LT/c;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LT/B0;->a(Ljava/lang/String;)V

    :cond_1
    :try_start_1
    iput-boolean v5, p0, Landroidx/compose/runtime/snapshots/l;->h:Z

    iput-object p2, p0, Landroidx/compose/runtime/snapshots/l;->i:Landroidx/compose/runtime/snapshots/l$a;

    invoke-static {}, LT/c;->a()J

    move-result-wide v4

    iput-wide v4, p0, Landroidx/compose/runtime/snapshots/l;->j:J

    iget-object v4, p0, Landroidx/compose/runtime/snapshots/l;->e:Lmh/l;

    invoke-virtual {p2, p1, v4, p3}, Landroidx/compose/runtime/snapshots/l$a;->i(Ljava/lang/Object;Lmh/l;Lmh/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v1, p0, Landroidx/compose/runtime/snapshots/l;->i:Landroidx/compose/runtime/snapshots/l$a;

    iput-boolean v0, p0, Landroidx/compose/runtime/snapshots/l;->h:Z

    iput-wide v2, p0, Landroidx/compose/runtime/snapshots/l;->j:J

    return-void

    :catchall_0
    move-exception p1

    iput-object v1, p0, Landroidx/compose/runtime/snapshots/l;->i:Landroidx/compose/runtime/snapshots/l$a;

    iput-boolean v0, p0, Landroidx/compose/runtime/snapshots/l;->h:Z

    iput-wide v2, p0, Landroidx/compose/runtime/snapshots/l;->j:J

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final s()V
    .locals 2

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l;->d:Lmh/p;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->i(Lmh/p;)Ld0/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/snapshots/l;->g:Ld0/b;

    return-void
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l;->g:Ld0/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ld0/b;->dispose()V

    :cond_0
    return-void
.end method
