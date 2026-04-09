.class final Landroidx/compose/runtime/snapshots/l$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/snapshots/l;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/runtime/snapshots/l;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$d;->a:Landroidx/compose/runtime/snapshots/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    const/4 v0, 0x1

    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l$d;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-static {v1}, Landroidx/compose/runtime/snapshots/l;->d(Landroidx/compose/runtime/snapshots/l;)LV/b;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/runtime/snapshots/l$d;->a:Landroidx/compose/runtime/snapshots/l;

    monitor-enter v1

    :try_start_0
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/l;->e(Landroidx/compose/runtime/snapshots/l;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v2, v0}, Landroidx/compose/runtime/snapshots/l;->h(Landroidx/compose/runtime/snapshots/l;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    :try_start_1
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/l;->d(Landroidx/compose/runtime/snapshots/l;)LV/b;

    move-result-object v4

    invoke-virtual {v4}, LV/b;->o()I

    move-result v5

    if-lez v5, :cond_2

    invoke-virtual {v4}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v4

    move v6, v3

    :cond_1
    aget-object v7, v4, v6

    check-cast v7, Landroidx/compose/runtime/snapshots/l$a;

    invoke-virtual {v7}, Landroidx/compose/runtime/snapshots/l$a;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v6, v0

    if-lt v6, v5, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    :try_start_2
    invoke-static {v2, v3}, Landroidx/compose/runtime/snapshots/l;->h(Landroidx/compose/runtime/snapshots/l;Z)V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :goto_1
    invoke-static {v2, v3}, Landroidx/compose/runtime/snapshots/l;->h(Landroidx/compose/runtime/snapshots/l;Z)V

    throw v0

    :cond_3
    :goto_2
    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l$d;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-static {v1}, Landroidx/compose/runtime/snapshots/l;->b(Landroidx/compose/runtime/snapshots/l;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :goto_3
    monitor-exit v1

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/l$d;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
