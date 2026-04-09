.class public final Landroidx/compose/runtime/snapshots/a;
.super Landroidx/compose/runtime/snapshots/b;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILandroidx/compose/runtime/snapshots/i;)V
    .locals 3

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->h()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LZg/v;->T0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmh/l;

    if-nez v2, :cond_0

    new-instance v2, Landroidx/compose/runtime/snapshots/a$a;

    invoke-direct {v2, v1}, Landroidx/compose/runtime/snapshots/a$a;-><init>(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v2}, Landroidx/compose/runtime/snapshots/b;-><init>(ILandroidx/compose/runtime/snapshots/i;Lmh/l;Lmh/l;)V

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public C()Landroidx/compose/runtime/snapshots/h;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public Q(Lmh/l;Lmh/l;)Landroidx/compose/runtime/snapshots/b;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/snapshots/a$b;

    invoke-direct {v0, p1, p2}, Landroidx/compose/runtime/snapshots/a$b;-><init>(Lmh/l;Lmh/l;)V

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;

    move-result-object p1

    check-cast p1, Landroidx/compose/runtime/snapshots/b;

    return-object p1
.end method

.method public T(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/i;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public U(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/i;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public d()V
    .locals 2

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/g;->q()V

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

.method public bridge synthetic m(Landroidx/compose/runtime/snapshots/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/a;->T(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Landroidx/compose/runtime/snapshots/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/a;->U(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 0

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->b()V

    return-void
.end method

.method public x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/snapshots/a$c;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/snapshots/a$c;-><init>(Lmh/l;)V

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;

    move-result-object p1

    return-object p1
.end method
