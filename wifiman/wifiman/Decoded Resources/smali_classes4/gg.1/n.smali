.class public abstract Lgg/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/r;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lgg/q;)Lgg/n;
    .locals 1

    const-string v0, "onSubscribe is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/b;

    invoke-direct {v0, p0}, Lrg/b;-><init>(Lgg/q;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static h()Lgg/n;
    .locals 1

    sget-object v0, Lrg/e;->a:Lrg/e;

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public static i(Ljava/lang/Throwable;)Lgg/n;
    .locals 1

    const-string v0, "throwable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/f;

    invoke-direct {v0, p0}, Lrg/f;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/util/concurrent/Callable;)Lgg/n;
    .locals 1

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/k;

    invoke-direct {v0, p0}, Lrg/k;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ljava/lang/Object;)Lgg/n;
    .locals 1

    const-string v0, "item is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/p;

    invoke-direct {v0, p0}, Lrg/p;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static varargs q([Lgg/r;)Lgg/i;
    .locals 3

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lgg/i;->z0([Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v1

    array-length p0, p0

    const/4 v2, 0x1

    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-virtual {v0, v1, v2, p0}, Lgg/i;->w0(Lkg/n;ZI)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lgg/r;Lgg/r;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Lgg/r;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lgg/n;->q([Lgg/r;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static y(JLjava/util/concurrent/TimeUnit;)Lgg/n;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lgg/n;->z(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static z(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/n;
    .locals 3

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/v;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-direct {v0, p0, p1, p2, p3}, Lrg/v;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()Lgg/i;
    .locals 1

    instance-of v0, p0, Lng/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/b;

    invoke-interface {v0}, Lng/b;->f()Lgg/i;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lrg/w;

    invoke-direct {v0, p0}, Lrg/w;-><init>(Lgg/r;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final B()Lgg/s;
    .locals 1

    instance-of v0, p0, Lng/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/d;

    invoke-interface {v0}, Lng/d;->b()Lgg/s;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lrg/x;

    invoke-direct {v0, p0}, Lrg/x;-><init>(Lgg/r;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lgg/p;)V
    .locals 2

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, LEg/a;->B(Lgg/n;Lgg/p;)Lgg/p;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, p1}, Lgg/n;->v(Lgg/p;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "subscribeActual failed"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final d(JLjava/util/concurrent/TimeUnit;)Lgg/n;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lgg/n;->e(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/n;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/c;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move-object v1, v0

    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lrg/c;-><init>(Lgg/r;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lkg/f;)Lgg/n;
    .locals 9

    new-instance v8, Lrg/s;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkg/f;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v4

    sget-object v7, Lmg/a;->c:Lkg/a;

    move-object v0, v8

    move-object v1, p0

    move-object v5, v7

    move-object v6, v7

    invoke-direct/range {v0 .. v7}, Lrg/s;-><init>(Lgg/r;Lkg/f;Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;)V

    invoke-static {v8}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lkg/n;)Lgg/n;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/j;

    invoke-direct {v0, p0, p1}, Lrg/j;-><init>(Lgg/r;Lkg/n;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lkg/n;)Lgg/b;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/h;

    invoke-direct {v0, p0, p1}, Lrg/h;-><init>(Lgg/r;Lkg/n;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lkg/n;)Lgg/n;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/i;

    invoke-direct {v0, p0, p1}, Lrg/i;-><init>(Lgg/r;Lkg/n;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final n()Lgg/b;
    .locals 1

    new-instance v0, Lrg/o;

    invoke-direct {v0, p0}, Lrg/o;-><init>(Lgg/r;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lkg/n;)Lgg/n;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/q;

    invoke-direct {v0, p0, p1}, Lrg/q;-><init>(Lgg/r;Lkg/n;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lkg/n;)Lgg/n;
    .locals 1

    const-string v0, "fallbackSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/r;

    invoke-direct {v0, p0, p1}, Lrg/r;-><init>(Lgg/r;Lkg/n;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final t()Lgg/i;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lgg/n;->u(J)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final u(J)Lgg/i;
    .locals 1

    invoke-virtual {p0}, Lgg/n;->A()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lgg/i;->l1(J)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method protected abstract v(Lgg/p;)V
.end method

.method public final w(Lgg/r;)Lgg/n;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/t;

    invoke-direct {v0, p0, p1}, Lrg/t;-><init>(Lgg/r;Lgg/r;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/u;

    invoke-direct {v0, p0, p1}, Lrg/u;-><init>(Lgg/r;Lgg/D;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
