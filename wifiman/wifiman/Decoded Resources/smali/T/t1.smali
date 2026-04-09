.class abstract synthetic LT/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Landroidx/compose/runtime/snapshots/k;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/snapshots/k;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/k;-><init>()V

    return-object v0
.end method

.method public static final varargs b([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/k;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/snapshots/k;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/k;-><init>()V

    invoke-static {p0}, LZg/n;->d1([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/k;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static final c(Ljava/lang/Object;LT/n1;)LT/q0;
    .locals 0

    invoke-static {p0, p1}, LT/b;->d(Ljava/lang/Object;LT/n1;)Ld0/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/Object;LT/l;I)LT/z1;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)"

    const v2, -0x3f14ae72

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p2, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, LT/q0;

    invoke-interface {p2, p0}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-object p2
.end method
