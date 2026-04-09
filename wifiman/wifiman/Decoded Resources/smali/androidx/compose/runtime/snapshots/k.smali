.class public final Landroidx/compose/runtime/snapshots/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/k;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Lnh/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/k$a;
    }
.end annotation


# instance fields
.field private a:Landroidx/compose/runtime/snapshots/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LW/a;->a()LW/e;

    move-result-object v0

    new-instance v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-direct {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;-><init>(LW/e;)V

    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-direct {v2, v0}, Landroidx/compose/runtime/snapshots/k$a;-><init>(LW/e;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/snapshots/n;->h(I)V

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/n;->g(Landroidx/compose/runtime/snapshots/n;)V

    :cond_0
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/k;->a:Landroidx/compose/runtime/snapshots/n;

    return-void
.end method

.method private final k(Lmh/l;)Z
    .locals 8

    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1}, LW/e;->c()LW/e$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, LW/e$a;->a()LW/e;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    invoke-static {v1, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    if-ne v7, v2, :cond_1

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v2, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v4

    throw p1

    :cond_2
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 7

    .line 27
    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 30
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 31
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    .line 32
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    .line 33
    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 34
    monitor-exit v0

    .line 35
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    .line 36
    invoke-interface {v1, p1, p2}, LW/e;->add(ILjava/lang/Object;)LW/e;

    move-result-object v0

    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 39
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    .line 40
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v3

    .line 41
    monitor-enter v3

    .line 42
    :try_start_1
    sget-object v4, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    .line 43
    invoke-static {v1, p0, v4}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 44
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v5

    .line 45
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v6

    if-ne v6, v2, :cond_2

    .line 47
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    .line 48
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V

    .line 49
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 50
    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    .line 51
    invoke-static {v4, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v2, :cond_0

    :goto_1
    return-void

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 52
    :goto_2
    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v3

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    .line 2
    monitor-enter v0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 4
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 5
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    .line 6
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    .line 7
    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    monitor-exit v0

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    .line 10
    invoke-interface {v1, p1}, LW/e;->add(Ljava/lang/Object;)LW/e;

    move-result-object v0

    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 13
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    .line 14
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    .line 15
    monitor-enter v4

    .line 16
    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    .line 17
    invoke-static {v1, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 18
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    .line 19
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 21
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    .line 22
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V

    .line 23
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 24
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    .line 25
    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 26
    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/k$b;

    invoke-direct {v0, p1, p2}, Landroidx/compose/runtime/snapshots/k$b;-><init>(ILjava/util/Collection;)V

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/k;->k(Lmh/l;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 9

    .line 2
    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 5
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 6
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    .line 7
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    .line 8
    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    monitor-exit v0

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    .line 11
    invoke-interface {v1, p1}, LW/e;->addAll(Ljava/util/Collection;)LW/e;

    move-result-object v0

    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 14
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    .line 15
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    .line 16
    monitor-enter v4

    .line 17
    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    .line 18
    invoke-static {v1, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 19
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    .line 20
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 22
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    .line 23
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V

    .line 24
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 25
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    .line 26
    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 27
    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()Landroidx/compose/runtime/snapshots/k$a;
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v0, p0}, Landroidx/compose/runtime/snapshots/j;->X(Landroidx/compose/runtime/snapshots/n;Ld0/k;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    return-object v0
.end method

.method public clear()V
    .locals 5

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, LW/a;->a()LW/e;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    invoke-static {v2, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit v1

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final f()I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    return v0
.end method

.method public g(Landroidx/compose/runtime/snapshots/n;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/n;->g(Landroidx/compose/runtime/snapshots/n;)V

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/runtime/snapshots/k$a;

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/k;->a:Landroidx/compose/runtime/snapshots/n;

    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i()Landroidx/compose/runtime/snapshots/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/k;->a:Landroidx/compose/runtime/snapshots/n;

    return-object v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->b()Landroidx/compose/runtime/snapshots/k$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/snapshots/m;-><init>(Landroidx/compose/runtime/snapshots/k;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    new-instance v0, Landroidx/compose/runtime/snapshots/m;

    invoke-direct {v0, p0, p1}, Landroidx/compose/runtime/snapshots/m;-><init>(Landroidx/compose/runtime/snapshots/k;I)V

    return-object v0
.end method

.method public q(I)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/k;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v3

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v2

    sget-object v4, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, LW/e;->f0(I)LW/e;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    invoke-static {v2, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    if-ne v7, v3, :cond_2

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/k;->q(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 9

    .line 2
    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 5
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 6
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    .line 7
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    .line 8
    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    monitor-exit v0

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    .line 11
    invoke-interface {v1, p1}, LW/e;->remove(Ljava/lang/Object;)LW/e;

    move-result-object v0

    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 14
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    .line 15
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    .line 16
    monitor-enter v4

    .line 17
    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    .line 18
    invoke-static {v1, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    .line 19
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    .line 20
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 22
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    .line 23
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V

    .line 24
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 25
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    .line 26
    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 27
    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 9

    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LW/e;->removeAll(Ljava/util/Collection;)LW/e;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    invoke-static {v1, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance v0, Landroidx/compose/runtime/snapshots/k$c;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/snapshots/k$c;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/k;->k(Lmh/l;)Z

    move-result p1

    return p1
.end method

.method public final s(II)V
    .locals 7

    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v1}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v2

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v1

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1}, LW/e;->c()LW/e$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-interface {v0}, LW/e$a;->a()LW/e;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    sget-object v4, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    invoke-static {v1, p0, v4}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v6

    if-ne v6, v2, :cond_1

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    invoke-static {v4, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v2, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v3

    throw p1

    :cond_2
    :goto_3
    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/k;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v3

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v2

    sget-object v4, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v2, p1, p2}, LW/e;->set(ILjava/lang/Object;)LW/e;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    invoke-static {v2, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    if-ne v7, v3, :cond_2

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->e()I

    move-result v0

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "fromIndex or toIndex are out of bounds"

    invoke-static {v0}, LT/B0;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Landroidx/compose/runtime/snapshots/o;

    invoke-direct {v0, p0, p1, p2}, Landroidx/compose/runtime/snapshots/o;-><init>(Landroidx/compose/runtime/snapshots/k;II)V

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/j;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lkotlin/jvm/internal/j;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/k$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SnapshotStateList(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/util/Collection;II)I
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v0

    :cond_0
    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v3

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->i()LW/e;

    move-result-object v2

    sget-object v4, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v2}, LW/e;->c()LW/e$a;

    move-result-object v1

    invoke-interface {v1, p2, p3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, LW/e$a;->a()LW/e;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->i()Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    invoke-static {v2, p0, v5}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/k$a;

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v7

    if-ne v7, v3, :cond_1

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->l(LW/e;)V

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->j()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->m(I)V

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/k$a;->k()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/snapshots/k$a;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    if-eqz v3, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v4

    throw p1

    :cond_2
    :goto_3
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result p1

    sub-int/2addr v0, p1

    return v0

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method
