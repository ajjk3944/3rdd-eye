.class public abstract Ly0/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, Ly0/I$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ly0/I$a;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {p0, p1, v0}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Landroidx/compose/ui/viewinterop/c;)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, Ly0/H;

    invoke-direct {v0}, Ly0/H;-><init>()V

    new-instance v1, Ly0/I$b;

    invoke-direct {v1, p1}, Ly0/I$b;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    invoke-virtual {v0, v1}, Ly0/H;->e(Lmh/l;)V

    new-instance v1, Ly0/O;

    invoke-direct {v1}, Ly0/O;-><init>()V

    invoke-virtual {v0, v1}, Ly0/H;->f(Ly0/O;)V

    invoke-virtual {p1, v1}, Landroidx/compose/ui/viewinterop/c;->setOnRequestDisallowInterceptTouchEvent$ui_release(Lmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
