.class public abstract LE0/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e$c;Lmh/a;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->g2()LE0/j0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LE0/j0;

    move-object v1, p0

    check-cast v1, LE0/h0;

    invoke-direct {v0, v1}, LE0/j0;-><init>(LE0/h0;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/e$c;->y2(LE0/j0;)V

    :cond_0
    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object p0

    invoke-interface {p0}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object p0

    sget-object v1, LE0/j0;->b:LE0/j0$b;

    invoke-virtual {v1}, LE0/j0$b;->a()Lmh/l;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    return-void
.end method
