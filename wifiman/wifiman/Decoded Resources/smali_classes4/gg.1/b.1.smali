.class public abstract Lgg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private A(Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)Lgg/b;
    .locals 9

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onTerminate is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onAfterTerminate is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onDispose is null"

    invoke-static {p6, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/v;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lpg/v;-><init>(Lgg/f;Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public static D(Ljava/lang/Throwable;)Lgg/b;
    .locals 1

    const-string v0, "throwable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/k;

    invoke-direct {v0, p0}, Lpg/k;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static E(Lkg/a;)Lgg/b;
    .locals 1

    const-string v0, "action is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/l;

    invoke-direct {v0, p0}, Lpg/l;-><init>(Lkg/a;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static F(Ljava/util/concurrent/Callable;)Lgg/b;
    .locals 1

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/m;

    invoke-direct {v0, p0}, Lpg/m;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static G(LDj/a;)Lgg/b;
    .locals 1

    const-string v0, "publisher is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/n;

    invoke-direct {v0, p0}, Lpg/n;-><init>(LDj/a;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static H(Ljava/lang/Iterable;)Lgg/b;
    .locals 1

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/s;

    invoke-direct {v0, p0}, Lpg/s;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static varargs I([Lgg/f;)Lgg/b;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lgg/b;->j0(Lgg/f;)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lpg/q;

    invoke-direct {v0, p0}, Lpg/q;-><init>([Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static varargs J([Lgg/f;)Lgg/b;
    .locals 1

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/r;

    invoke-direct {v0, p0}, Lpg/r;-><init>([Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private Z(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/f;)Lgg/b;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/z;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lpg/z;-><init>(Lgg/f;JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public static a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lgg/b;->b0(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static b0(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/b;
    .locals 1

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/A;

    invoke-direct {v0, p0, p1, p2, p3}, Lpg/A;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static e0(Ljava/lang/Throwable;)Ljava/lang/NullPointerException;
    .locals 2

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t pass out an exception otherwise..."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method public static j0(Lgg/f;)Lgg/b;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Lgg/b;

    if-eqz v0, :cond_0

    check-cast p0, Lgg/b;

    invoke-static {p0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lpg/p;

    invoke-direct {v0, p0}, Lpg/p;-><init>(Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static m()Lgg/b;
    .locals 1

    sget-object v0, Lpg/j;->a:Lgg/b;

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public static o(Ljava/lang/Iterable;)Lgg/b;
    .locals 1

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/d;

    invoke-direct {v0, p0}, Lpg/d;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static varargs p([Lgg/f;)Lgg/b;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lgg/b;->j0(Lgg/f;)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lpg/c;

    invoke-direct {v0, p0}, Lpg/c;-><init>([Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Iterable;)Lgg/b;
    .locals 1

    invoke-static {p0}, Lgg/i;->A0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->F(Lkg/n;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lgg/e;)Lgg/b;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/e;

    invoke-direct {v0, p0}, Lpg/e;-><init>(Lgg/e;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static s(Lkg/q;)Lgg/b;
    .locals 1

    const-string v0, "supplier is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/f;

    invoke-direct {v0, p0}, Lpg/f;-><init>(Lkg/q;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B(Lkg/f;)Lgg/b;
    .locals 7

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    sget-object v6, Lmg/a;->c:Lkg/a;

    move-object v0, p0

    move-object v1, p1

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Lgg/b;->A(Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lkg/a;)Lgg/b;
    .locals 7

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    sget-object v6, Lmg/a;->c:Lkg/a;

    move-object v0, p0

    move-object v3, v6

    move-object v4, p1

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Lgg/b;->A(Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final K(Lgg/f;)Lgg/b;
    .locals 2

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Lgg/f;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final L(Lgg/y;)Lgg/b;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/t;

    invoke-direct {v0, p0, p1}, Lpg/t;-><init>(Lgg/f;Lgg/y;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final M()Lgg/b;
    .locals 1

    invoke-static {}, Lmg/a;->b()Lkg/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/b;->N(Lkg/p;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public final N(Lkg/p;)Lgg/b;
    .locals 1

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/u;

    invoke-direct {v0, p0, p1}, Lpg/u;-><init>(Lgg/f;Lkg/p;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final O(Lkg/n;)Lgg/b;
    .locals 1

    const-string v0, "fallbackSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/w;

    invoke-direct {v0, p0, p1}, Lpg/w;-><init>(Lgg/f;Lkg/n;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final P(Lkg/n;)Lgg/b;
    .locals 1

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lgg/b;->G(LDj/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final Q(Lkg/n;)Lgg/b;
    .locals 1

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lgg/b;->G(LDj/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final R(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lgg/s;->h1(Lgg/v;)Lgg/s;

    move-result-object p1

    invoke-virtual {p0}, Lgg/b;->f0()Lgg/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->m(Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final S()Lhg/c;
    .locals 1

    new-instance v0, Log/i;

    invoke-direct {v0}, Log/i;-><init>()V

    invoke-virtual {p0, v0}, Lgg/b;->e(Lgg/d;)V

    return-object v0
.end method

.method public final T(Lkg/a;)Lhg/c;
    .locals 1

    sget-object v0, Lmg/a;->f:Lkg/f;

    invoke-virtual {p0, p1, v0}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p1

    return-object p1
.end method

.method public final U(Lkg/a;Lkg/f;)Lhg/c;
    .locals 1

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Log/e;

    invoke-direct {v0, p2, p1}, Log/e;-><init>(Lkg/f;Lkg/a;)V

    invoke-virtual {p0, v0}, Lgg/b;->e(Lgg/d;)V

    return-object v0
.end method

.method protected abstract V(Lgg/d;)V
.end method

.method public final W(Lgg/y;)Lgg/b;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/x;

    invoke-direct {v0, p0, p1}, Lpg/x;-><init>(Lgg/f;Lgg/y;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final X(Lgg/f;)Lgg/b;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/y;

    invoke-direct {v0, p0, p1}, Lpg/y;-><init>(Lgg/b;Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final Y(JLjava/util/concurrent/TimeUnit;)Lgg/b;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lgg/b;->Z(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final c0()Lgg/i;
    .locals 1

    instance-of v0, p0, Lng/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/b;

    invoke-interface {v0}, Lng/b;->f()Lgg/i;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lpg/B;

    invoke-direct {v0, p0}, Lpg/B;-><init>(Lgg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final d0()Lgg/n;
    .locals 1

    instance-of v0, p0, Lng/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/c;

    invoke-interface {v0}, Lng/c;->d()Lgg/n;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lrg/l;

    invoke-direct {v0, p0}, Lrg/l;-><init>(Lgg/f;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lgg/d;)V
    .locals 1

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, LEg/a;->A(Lgg/b;Lgg/d;)Lgg/d;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lgg/b;->V(Lgg/d;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/b;->e0(Ljava/lang/Throwable;)Ljava/lang/NullPointerException;

    move-result-object p1

    throw p1

    :goto_1
    throw p1
.end method

.method public final f0()Lgg/s;
    .locals 1

    instance-of v0, p0, Lng/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/d;

    invoke-interface {v0}, Lng/d;->b()Lgg/s;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lpg/C;

    invoke-direct {v0, p0}, Lpg/C;-><init>(Lgg/f;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lgg/f;)Lgg/b;
    .locals 1

    const-string v0, "next is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/a;

    invoke-direct {v0, p0, p1}, Lpg/a;-><init>(Lgg/f;Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final g0(Lkg/q;)Lgg/z;
    .locals 2

    const-string v0, "completionValueSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/D;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lpg/D;-><init>(Lgg/f;Lkg/q;Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final h(LDj/a;)Lgg/i;
    .locals 1

    const-string v0, "next is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/b;

    invoke-direct {v0, p0, p1}, Lsg/b;-><init>(Lgg/f;LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final h0(Ljava/lang/Object;)Lgg/z;
    .locals 2

    const-string v0, "completionValue is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/D;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lpg/D;-><init>(Lgg/f;Lkg/q;Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lgg/r;)Lgg/n;
    .locals 1

    const-string v0, "next is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/d;

    invoke-direct {v0, p1, p0}, Lrg/d;-><init>(Lgg/r;Lgg/f;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final i0(Lgg/y;)Lgg/b;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/h;

    invoke-direct {v0, p0, p1}, Lpg/h;-><init>(Lgg/f;Lgg/y;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "next is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/a;

    invoke-direct {v0, p0, p1}, Lsg/a;-><init>(Lgg/f;Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "next is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/d;

    invoke-direct {v0, p1, p0}, Lug/d;-><init>(Lgg/D;Lgg/f;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final l()Lgg/b;
    .locals 1

    new-instance v0, Lpg/b;

    invoke-direct {v0, p0}, Lpg/b;-><init>(Lgg/f;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lgg/g;)Lgg/b;
    .locals 1

    const-string v0, "transformer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/g;

    invoke-interface {p1, p0}, Lgg/g;->a(Lgg/b;)Lgg/f;

    move-result-object p1

    invoke-static {p1}, Lgg/b;->j0(Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final t(JLjava/util/concurrent/TimeUnit;)Lgg/b;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lgg/b;->v(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final u(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/b;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lgg/b;->v(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final v(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/b;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/g;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lpg/g;-><init>(Lgg/f;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lkg/a;)Lgg/b;
    .locals 1

    const-string v0, "onFinally is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpg/i;

    invoke-direct {v0, p0, p1}, Lpg/i;-><init>(Lgg/f;Lkg/a;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lkg/a;)Lgg/b;
    .locals 7

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    sget-object v6, Lmg/a;->c:Lkg/a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Lgg/b;->A(Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lkg/a;)Lgg/b;
    .locals 7

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    sget-object v5, Lmg/a;->c:Lkg/a;

    move-object v0, p0

    move-object v3, v5

    move-object v4, v5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lgg/b;->A(Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lkg/f;)Lgg/b;
    .locals 7

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    sget-object v6, Lmg/a;->c:Lkg/a;

    move-object v0, p0

    move-object v2, p1

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Lgg/b;->A(Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
