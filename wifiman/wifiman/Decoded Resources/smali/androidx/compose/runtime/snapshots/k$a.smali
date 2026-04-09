.class public final Landroidx/compose/runtime/snapshots/k$a;
.super Landroidx/compose/runtime/snapshots/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/snapshots/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private c:LW/e;

.field private d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LW/e;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/n;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/k$a;->c:LW/e;

    return-void
.end method


# virtual methods
.method public c(Landroidx/compose/runtime/snapshots/n;)V
    .locals 2

    invoke-static {}, Ld0/h;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    iget-object v1, v1, Landroidx/compose/runtime/snapshots/k$a;->c:LW/e;

    iput-object v1, p0, Landroidx/compose/runtime/snapshots/k$a;->c:LW/e;

    move-object v1, p1

    check-cast v1, Landroidx/compose/runtime/snapshots/k$a;

    iget v1, v1, Landroidx/compose/runtime/snapshots/k$a;->d:I

    iput v1, p0, Landroidx/compose/runtime/snapshots/k$a;->d:I

    check-cast p1, Landroidx/compose/runtime/snapshots/k$a;

    iget p1, p1, Landroidx/compose/runtime/snapshots/k$a;->e:I

    iput p1, p0, Landroidx/compose/runtime/snapshots/k$a;->e:I

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public d()Landroidx/compose/runtime/snapshots/n;
    .locals 2

    new-instance v0, Landroidx/compose/runtime/snapshots/k$a;

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/k$a;->c:LW/e;

    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/k$a;-><init>(LW/e;)V

    return-object v0
.end method

.method public final i()LW/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/k$a;->c:LW/e;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/k$a;->d:I

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/k$a;->e:I

    return v0
.end method

.method public final l(LW/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/k$a;->c:LW/e;

    return-void
.end method

.method public final m(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/k$a;->d:I

    return-void
.end method

.method public final n(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/k$a;->e:I

    return-void
.end method
