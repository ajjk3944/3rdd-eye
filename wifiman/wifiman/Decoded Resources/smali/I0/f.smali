.class public abstract LI0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LIi/y0;)V
    .locals 0

    invoke-static {p0}, LI0/f;->d(LIi/y0;)V

    return-void
.end method

.method public static final synthetic b(LIi/N;Landroid/os/CancellationSignal;Lmh/p;)LIi/y0;
    .locals 0

    invoke-static {p0, p1, p2}, LI0/f;->c(LIi/N;Landroid/os/CancellationSignal;Lmh/p;)LIi/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;Landroid/os/CancellationSignal;Lmh/p;)LIi/y0;
    .locals 6

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p0

    new-instance p2, LI0/f$a;

    invoke-direct {p2, p1}, LI0/f$a;-><init>(Landroid/os/CancellationSignal;)V

    invoke-interface {p0, p2}, LIi/y0;->invokeOnCompletion(Lmh/l;)LIi/e0;

    new-instance p2, LI0/e;

    invoke-direct {p2, p0}, LI0/e;-><init>(LIi/y0;)V

    invoke-virtual {p1, p2}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    return-object p0
.end method

.method private static final d(LIi/y0;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
