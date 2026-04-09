.class public abstract LT/l1;
.super Ld0/l;
.source "SourceFile"

# interfaces
.implements LT/o0;
.implements Ld0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/l1$a;
    }
.end annotation


# instance fields
.field private b:LT/l1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ld0/l;-><init>()V

    new-instance v0, LT/l1$a;

    invoke-direct {v0, p1, p2}, LT/l1$a;-><init>(J)V

    sget-object v1, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g$a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LT/l1$a;

    invoke-direct {v1, p1, p2}, LT/l1$a;-><init>(J)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Landroidx/compose/runtime/snapshots/n;->h(I)V

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/n;->g(Landroidx/compose/runtime/snapshots/n;)V

    :cond_0
    iput-object v0, p0, LT/l1;->b:LT/l1$a;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, LT/l1;->b:LT/l1$a;

    invoke-static {v0, p0}, Landroidx/compose/runtime/snapshots/j;->X(Landroidx/compose/runtime/snapshots/n;Ld0/k;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/l1$a;

    invoke-virtual {v0}, LT/l1$a;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lmh/l;
    .locals 1

    new-instance v0, LT/l1$b;

    invoke-direct {v0, p0}, LT/l1$b;-><init>(LT/l1;)V

    return-object v0
.end method

.method public d()LT/n1;
    .locals 1

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/l1;->r()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public g(Landroidx/compose/runtime/snapshots/n;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/l1$a;

    iput-object p1, p0, LT/l1;->b:LT/l1$a;

    return-void
.end method

.method public i()Landroidx/compose/runtime/snapshots/n;
    .locals 1

    iget-object v0, p0, LT/l1;->b:LT/l1$a;

    return-object v0
.end method

.method public j(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;
    .locals 4

    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, LT/l1$a;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, LT/l1$a;

    invoke-virtual {v0}, LT/l1$a;->i()J

    move-result-wide v0

    invoke-virtual {p3}, LT/l1$a;->i()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public m(J)V
    .locals 4

    iget-object v0, p0, LT/l1;->b:LT/l1$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/l1$a;

    invoke-virtual {v0}, LT/l1$a;->i()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    iget-object v1, p0, LT/l1;->b:LT/l1$a;

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

    check-cast v0, LT/l1$a;

    invoke-virtual {v0, p1, p2}, LT/l1$a;->j(J)V

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

.method public r()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, LT/l1;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LT/l1;->b:LT/l1$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/l1$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MutableLongState(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LT/l1$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
