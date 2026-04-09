.class public abstract LT/m1;
.super Ld0/l;
.source "SourceFile"

# interfaces
.implements Ld0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/m1$a;
    }
.end annotation


# instance fields
.field private final b:LT/n1;

.field private c:LT/m1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;LT/n1;)V
    .locals 1

    invoke-direct {p0}, Ld0/l;-><init>()V

    iput-object p2, p0, LT/m1;->b:LT/n1;

    new-instance p2, LT/m1$a;

    invoke-direct {p2, p1}, LT/m1$a;-><init>(Ljava/lang/Object;)V

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LT/m1$a;

    invoke-direct {v0, p1}, LT/m1$a;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/n;->h(I)V

    invoke-virtual {p2, v0}, Landroidx/compose/runtime/snapshots/n;->g(Landroidx/compose/runtime/snapshots/n;)V

    :cond_0
    iput-object p2, p0, LT/m1;->c:LT/m1$a;

    return-void
.end method


# virtual methods
.method public b()Lmh/l;
    .locals 1

    new-instance v0, LT/m1$b;

    invoke-direct {v0, p0}, LT/m1$b;-><init>(LT/m1;)V

    return-object v0
.end method

.method public d()LT/n1;
    .locals 1

    iget-object v0, p0, LT/m1;->b:LT/n1;

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/m1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g(Landroidx/compose/runtime/snapshots/n;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/m1$a;

    iput-object p1, p0, LT/m1;->c:LT/m1$a;

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/m1;->c:LT/m1$a;

    invoke-static {v0, p0}, Landroidx/compose/runtime/snapshots/j;->X(Landroidx/compose/runtime/snapshots/n;Ld0/k;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/m1$a;

    invoke-virtual {v0}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i()Landroidx/compose/runtime/snapshots/n;
    .locals 1

    iget-object v0, p0, LT/m1;->c:LT/m1$a;

    return-object v0
.end method

.method public j(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;
    .locals 4

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/m1$a;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, LT/m1$a;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, LT/m1$a;

    invoke-virtual {p0}, LT/m1;->d()LT/n1;

    move-result-object v0

    invoke-virtual {v1}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p3}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LT/m1;->d()LT/n1;

    move-result-object p2

    invoke-virtual {p1}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p1, v0, v1}, LT/n1;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p3}, LT/m1$a;->d()Landroidx/compose/runtime/snapshots/n;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p3, p2

    check-cast p3, LT/m1$a;

    invoke-virtual {p3, p1}, LT/m1$a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, LT/m1;->c:LT/m1$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/m1$a;

    invoke-virtual {p0}, LT/m1;->d()LT/n1;

    move-result-object v1

    invoke-virtual {v0}, LT/m1$a;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2, p1}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LT/m1;->c:LT/m1$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->J()Landroidx/compose/runtime/snapshots/g;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    sget-object v3, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    invoke-static {v1, p0, v3, v0}, Landroidx/compose/runtime/snapshots/j;->S(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/m1$a;

    invoke-virtual {v0, p1}, LT/m1$a;->j(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-static {v3, p0}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LT/m1;->c:LT/m1$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/m1$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MutableState(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LT/m1$a;->i()Ljava/lang/Object;

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
