.class public abstract Lgg/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/v;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private C(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/s;
    .locals 7

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onAfterTerminate is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/n;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ltg/n;-><init>(Lgg/v;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public static K()Lgg/s;
    .locals 1

    sget-object v0, Ltg/s;->a:Lgg/s;

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public static L(Ljava/lang/Throwable;)Lgg/s;
    .locals 1

    const-string v0, "throwable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lmg/a;->h(Ljava/lang/Object;)Lkg/q;

    move-result-object p0

    invoke-static {p0}, Lgg/s;->M(Lkg/q;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static M(Lkg/q;)Lgg/s;
    .locals 1

    const-string v0, "supplier is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/t;

    invoke-direct {v0, p0}, Ltg/t;-><init>(Lkg/q;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private Z0(JLjava/util/concurrent/TimeUnit;Lgg/v;Lgg/y;)Lgg/s;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/m0;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p5

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Ltg/m0;-><init>(Lgg/s;JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public static varargs a0([Ljava/lang/Object;)Lgg/s;
    .locals 2

    const-string v0, "items is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/s;->K()Lgg/s;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Ltg/A;

    invoke-direct {v0, p0}, Ltg/A;-><init>([Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private a1(Lgg/v;Lkg/n;Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "itemTimeoutIndicator is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/l0;

    invoke-direct {v0, p0, p1, p2, p3}, Ltg/l0;-><init>(Lgg/s;Lgg/v;Lkg/n;Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public static b(Ljava/lang/Iterable;)Lgg/s;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ltg/b;-><init>([Lgg/v;Ljava/lang/Iterable;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static b0(Ljava/util/concurrent/Callable;)Lgg/s;
    .locals 1

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/B;

    invoke-direct {v0, p0}, Ltg/B;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static b1(JLjava/util/concurrent/TimeUnit;)Lgg/s;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lgg/s;->c1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static c0(Ljava/lang/Iterable;)Lgg/s;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/D;

    invoke-direct {v0, p0}, Ltg/D;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static c1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;
    .locals 3

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/n0;

    const-wide/16 v1, 0x0

    invoke-static {p0, p1, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-direct {v0, p0, p1, p2, p3}, Ltg/n0;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static e()I
    .locals 1

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    return v0
.end method

.method public static g0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/K;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    move-object v1, v0

    move-wide v2, p0

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Ltg/K;-><init>(JJLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static h0(Ljava/lang/Object;)Lgg/s;
    .locals 1

    const-string v0, "item is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/L;

    invoke-direct {v0, p0}, Ltg/L;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static h1(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Lgg/s;

    if-eqz v0, :cond_0

    check-cast p0, Lgg/s;

    invoke-static {p0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ltg/F;

    invoke-direct {v0, p0}, Ltg/F;-><init>(Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lgg/v;Lgg/v;)Lgg/s;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Lgg/v;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lgg/s;->k([Lgg/v;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/Iterable;)Lgg/s;
    .locals 3

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lgg/s;->c0(Ljava/lang/Iterable;)Lgg/s;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Lgg/s;->e()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lgg/s;->l(Lkg/n;ZI)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static j0(Lgg/v;Lgg/v;)Lgg/s;
    .locals 3

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v1, v0, [Lgg/v;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v1}, Lgg/s;->a0([Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v0}, Lgg/s;->S(Lkg/n;ZI)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static varargs k([Lgg/v;)Lgg/s;
    .locals 4

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/s;->K()Lgg/s;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lgg/s;->h1(Lgg/v;)Lgg/s;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Ltg/d;

    invoke-static {p0}, Lgg/s;->a0([Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v1

    invoke-static {}, Lgg/s;->e()I

    move-result v2

    sget-object v3, Lzg/g;->BOUNDARY:Lzg/g;

    invoke-direct {v0, p0, v1, v2, v3}, Ltg/d;-><init>(Lgg/v;Lkg/n;ILzg/g;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static k0(Lgg/v;Lgg/v;Lgg/v;)Lgg/s;
    .locals 3

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x3

    new-array v1, v0, [Lgg/v;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    invoke-static {v1}, Lgg/s;->a0([Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v0}, Lgg/s;->S(Lkg/n;ZI)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static n0()Lgg/s;
    .locals 1

    sget-object v0, Ltg/O;->a:Lgg/s;

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public static o(Lgg/u;)Lgg/s;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/g;

    invoke-direct {v0, p0}, Ltg/g;-><init>(Lgg/u;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lkg/q;)Lgg/s;
    .locals 1

    const-string v0, "supplier is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/i;

    invoke-direct {v0, p0}, Ltg/i;-><init>(Lkg/q;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lkg/a;)Lgg/s;
    .locals 1

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lgg/s;->E(Lkg/f;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final A0(Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "handler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/Z;

    invoke-direct {v0, p0, p1}, Ltg/Z;-><init>(Lgg/v;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lgg/x;)Lgg/s;
    .locals 3

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Ltg/J;->c(Lgg/x;)Lkg/f;

    move-result-object v0

    invoke-static {p1}, Ltg/J;->b(Lgg/x;)Lkg/f;

    move-result-object v1

    invoke-static {p1}, Ltg/J;->a(Lgg/x;)Lkg/a;

    move-result-object p1

    sget-object v2, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, v1, p1, v2}, Lgg/s;->C(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final B0(Ljava/lang/Object;Lkg/b;)Lgg/s;
    .locals 1

    const-string v0, "initialValue is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmg/a;->h(Ljava/lang/Object;)Lkg/q;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lgg/s;->C0(Lkg/q;Lkg/b;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final C0(Lkg/q;Lkg/b;)Lgg/s;
    .locals 1

    const-string v0, "seedSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "accumulator is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/b0;

    invoke-direct {v0, p0, p1, p2}, Ltg/b0;-><init>(Lgg/v;Lkg/q;Lkg/b;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lkg/f;)Lgg/s;
    .locals 2

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    sget-object v1, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, p1, v1, v1}, Lgg/s;->C(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final D0()Lgg/s;
    .locals 1

    invoke-virtual {p0}, Lgg/s;->r0()LBg/a;

    move-result-object v0

    invoke-virtual {v0}, LBg/a;->l1()Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final E(Lkg/f;Lkg/a;)Lgg/s;
    .locals 1

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onDispose is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/o;

    invoke-direct {v0, p0, p1, p2}, Ltg/o;-><init>(Lgg/s;Lkg/f;Lkg/a;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final E0()Lgg/n;
    .locals 1

    new-instance v0, Ltg/c0;

    invoke-direct {v0, p0}, Ltg/c0;-><init>(Lgg/v;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public final F(Lkg/f;)Lgg/s;
    .locals 2

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    sget-object v1, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, p1, v0, v1, v1}, Lgg/s;->C(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final F0()Lgg/z;
    .locals 2

    new-instance v0, Ltg/d0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ltg/d0;-><init>(Lgg/v;Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public final G(Lkg/f;)Lgg/s;
    .locals 1

    sget-object v0, Lmg/a;->c:Lkg/a;

    invoke-virtual {p0, p1, v0}, Lgg/s;->E(Lkg/f;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final G0(J)Lgg/s;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {p0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ltg/e0;

    invoke-direct {v0, p0, p1, p2}, Ltg/e0;-><init>(Lgg/v;J)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count >= 0 expected but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H(Lkg/a;)Lgg/s;
    .locals 3

    const-string v0, "onTerminate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    invoke-static {p1}, Lmg/a;->a(Lkg/a;)Lkg/f;

    move-result-object v1

    sget-object v2, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, v1, p1, v2}, Lgg/s;->C(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final H0(Lgg/D;)Lgg/s;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lgg/z;->a0(Lgg/D;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->Y()Lgg/s;

    move-result-object p1

    invoke-static {p1, p0}, Lgg/s;->i(Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final I(J)Lgg/n;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Ltg/q;

    invoke-direct {v0, p0, p1, p2}, Ltg/q;-><init>(Lgg/v;J)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I0(Ljava/lang/Object;)Lgg/s;
    .locals 2

    invoke-static {p1}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Lgg/v;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p0, v0, p1

    invoke-static {v0}, Lgg/s;->k([Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final J(J)Lgg/z;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Ltg/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ltg/r;-><init>(Lgg/v;JLjava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J0(Lkg/f;Lkg/f;)Lhg/c;
    .locals 1

    sget-object v0, Lmg/a;->c:Lkg/a;

    invoke-virtual {p0, p1, p2, v0}, Lgg/s;->K0(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object p1

    return-object p1
.end method

.method public final K0(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;
    .locals 2

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Log/j;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    invoke-direct {v0, p1, p2, p3, v1}, Log/j;-><init>(Lkg/f;Lkg/f;Lkg/a;Lkg/f;)V

    invoke-virtual {p0, v0}, Lgg/s;->d(Lgg/x;)V

    return-object v0
.end method

.method protected abstract L0(Lgg/x;)V
.end method

.method public final M0(Lgg/y;)Lgg/s;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/f0;

    invoke-direct {v0, p0, p1}, Ltg/f0;-><init>(Lgg/v;Lgg/y;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final N(Lkg/p;)Lgg/s;
    .locals 1

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/u;

    invoke-direct {v0, p0, p1}, Ltg/u;-><init>(Lgg/v;Lkg/p;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final N0(Lgg/x;)Lgg/x;
    .locals 0

    invoke-virtual {p0, p1}, Lgg/s;->d(Lgg/x;)V

    return-object p1
.end method

.method public final O()Lgg/n;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lgg/s;->I(J)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public final O0(Lkg/n;)Lgg/s;
    .locals 1

    invoke-static {}, Lgg/s;->e()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lgg/s;->P0(Lkg/n;I)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final P()Lgg/z;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lgg/s;->J(J)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public final P0(Lkg/n;I)Lgg/s;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/s;->K()Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Ltg/a0;->a(Ljava/lang/Object;Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ltg/g0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ltg/g0;-><init>(Lgg/v;Lkg/n;IZ)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final Q(Lkg/n;)Lgg/s;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lgg/s;->R(Lkg/n;Z)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final Q0(Lkg/n;)Lgg/b;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lsg/j;-><init>(Lgg/s;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final R(Lkg/n;Z)Lgg/s;
    .locals 1

    const v0, 0x7fffffff

    invoke-virtual {p0, p1, p2, v0}, Lgg/s;->S(Lkg/n;ZI)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final R0(J)Lgg/s;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Ltg/h0;

    invoke-direct {v0, p0, p1, p2}, Ltg/h0;-><init>(Lgg/v;J)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final S(Lkg/n;ZI)Lgg/s;
    .locals 1

    invoke-static {}, Lgg/s;->e()I

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lgg/s;->T(Lkg/n;ZII)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final S0(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lgg/s;->c1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/s;->T0(Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final T(Lkg/n;ZII)Lgg/s;
    .locals 7

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const-string v0, "bufferSize"

    invoke-static {p4, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/s;->K()Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Ltg/a0;->a(Ljava/lang/Object;Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v6, Ltg/v;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ltg/v;-><init>(Lgg/v;Lkg/n;ZII)V

    invoke-static {v6}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final T0(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/i0;

    invoke-direct {v0, p0, p1}, Ltg/i0;-><init>(Lgg/v;Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final U(Lkg/n;)Lgg/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lgg/s;->V(Lkg/n;Z)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final U0(Lkg/p;)Lgg/s;
    .locals 1

    const-string v0, "stopPredicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/j0;

    invoke-direct {v0, p0, p1}, Ltg/j0;-><init>(Lgg/v;Lkg/p;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final V(Lkg/n;Z)Lgg/b;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/x;

    invoke-direct {v0, p0, p1, p2}, Ltg/x;-><init>(Lgg/v;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final V0(Lkg/p;)Lgg/s;
    .locals 1

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/k0;

    invoke-direct {v0, p0, p1}, Ltg/k0;-><init>(Lgg/v;Lkg/p;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final W(Lkg/n;)Lgg/s;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lgg/s;->X(Lkg/n;Z)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final W0(JLjava/util/concurrent/TimeUnit;)Lgg/s;
    .locals 6

    const/4 v4, 0x0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lgg/s;->Z0(JLjava/util/concurrent/TimeUnit;Lgg/v;Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final X(Lkg/n;Z)Lgg/s;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/y;

    invoke-direct {v0, p0, p1, p2}, Ltg/y;-><init>(Lgg/v;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final X0(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/v;)Lgg/s;
    .locals 6

    const-string v0, "fallback is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p5

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lgg/s;->Z0(JLjava/util/concurrent/TimeUnit;Lgg/v;Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Lkg/n;)Lgg/s;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lgg/s;->Z(Lkg/n;Z)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final Y0(Lgg/v;Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "firstTimeoutIndicator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lgg/s;->a1(Lgg/v;Lkg/n;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Lkg/n;Z)Lgg/s;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/z;

    invoke-direct {v0, p0, p1, p2}, Ltg/z;-><init>(Lgg/v;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lgg/x;)V
    .locals 2

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, LEg/a;->C(Lgg/s;Lgg/x;)Lgg/x;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lgg/s;->L0(Lgg/x;)V
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

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t throw other exceptions due to RS"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :goto_1
    throw p1
.end method

.method public final d0(Lkg/n;)Lgg/s;
    .locals 3

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Lgg/s;->e()I

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lgg/s;->e0(Lkg/n;Lkg/n;ZI)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final d1(Lgg/a;)Lgg/i;
    .locals 2

    const-string v0, "strategy is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/E;

    invoke-direct {v0, p0}, Lqg/E;-><init>(Lgg/v;)V

    sget-object v1, Lgg/s$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Lgg/i;->a1()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lqg/W;

    invoke-direct {p1, v0}, Lqg/W;-><init>(Lgg/i;)V

    invoke-static {p1}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {v0}, Lgg/i;->c1()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final e0(Lkg/n;Lkg/n;ZI)Lgg/s;
    .locals 7

    const-string v0, "keySelector is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "valueSelector is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p4, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Ltg/G;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p3

    invoke-direct/range {v1 .. v6}, Ltg/G;-><init>(Lgg/v;Lkg/n;Lkg/n;IZ)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final e1(Lgg/y;)Lgg/s;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/o0;

    invoke-direct {v0, p0, p1}, Ltg/o0;-><init>(Lgg/v;Lgg/y;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/Class;)Lgg/s;
    .locals 1

    const-string v0, "clazz is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmg/a;->c(Ljava/lang/Class;)Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final f0()Lgg/b;
    .locals 1

    new-instance v0, Ltg/I;

    invoke-direct {v0, p0}, Ltg/I;-><init>(Lgg/v;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public final f1(Lgg/v;)Lgg/s;
    .locals 1

    invoke-static {}, Lgg/s;->e()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lgg/s;->g1(Lgg/v;I)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lgg/w;)Lgg/s;
    .locals 1

    const-string v0, "composer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/w;

    invoke-interface {p1, p0}, Lgg/w;->b(Lgg/s;)Lgg/v;

    move-result-object p1

    invoke-static {p1}, Lgg/s;->h1(Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final g1(Lgg/v;I)Lgg/s;
    .locals 1

    const-string v0, "boundaryIndicator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Ltg/p0;

    invoke-direct {v0, p0, p1, p2}, Ltg/p0;-><init>(Lgg/v;Lgg/v;I)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final i0(Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/M;

    invoke-direct {v0, p0, p1}, Ltg/M;-><init>(Lgg/v;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lkg/n;ZI)Lgg/s;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/s;->K()Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Ltg/a0;->a(Ljava/lang/Object;Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ltg/d;

    if-eqz p2, :cond_2

    sget-object p2, Lzg/g;->END:Lzg/g;

    goto :goto_0

    :cond_2
    sget-object p2, Lzg/g;->BOUNDARY:Lzg/g;

    :goto_0
    invoke-direct {v0, p0, p1, p3, p2}, Ltg/d;-><init>(Lgg/v;Lkg/n;ILzg/g;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final l0(Lgg/f;)Lgg/s;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/N;

    invoke-direct {v0, p0, p1}, Ltg/N;-><init>(Lgg/s;Lgg/f;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lgg/s;->i(Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final m0(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lgg/s;->j0(Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final n()Lgg/z;
    .locals 1

    new-instance v0, Ltg/f;

    invoke-direct {v0, p0}, Ltg/f;-><init>(Lgg/v;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public final o0(Lgg/y;)Lgg/s;
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lgg/s;->e()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lgg/s;->p0(Lgg/y;ZI)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final p(JLjava/util/concurrent/TimeUnit;)Lgg/s;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lgg/s;->q(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final p0(Lgg/y;ZI)Lgg/s;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Ltg/P;

    invoke-direct {v0, p0, p1, p2, p3}, Ltg/P;-><init>(Lgg/v;Lgg/y;ZI)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final q(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/h;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Ltg/h;-><init>(Lgg/v;JLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/f;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final q0(Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "fallbackSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/Q;

    invoke-direct {v0, p0, p1}, Ltg/Q;-><init>(Lgg/v;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final r0()LBg/a;
    .locals 1

    new-instance v0, Ltg/S;

    invoke-direct {v0, p0}, Ltg/S;-><init>(Lgg/v;)V

    invoke-static {v0}, LEg/a;->m(LBg/a;)LBg/a;

    move-result-object v0

    return-object v0
.end method

.method public final s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lgg/s;->t(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final s0(Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "selector is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/T;

    invoke-direct {v0, p0, p1}, Ltg/T;-><init>(Lgg/v;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final t(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/s;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/j;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Ltg/j;-><init>(Lgg/v;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final t0()Lgg/s;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lgg/s;->u0(J)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lgg/v;)Lgg/s;
    .locals 1

    const-string v0, "subscriptionIndicator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/k;

    invoke-direct {v0, p0, p1}, Ltg/k;-><init>(Lgg/v;Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final u0(J)Lgg/s;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lgg/s;->K()Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ltg/V;

    invoke-direct {v0, p0, p1, p2}, Ltg/V;-><init>(Lgg/s;J)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "times >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v()Lgg/s;
    .locals 1

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/s;->x(Lkg/n;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final v0(Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "handler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/W;

    invoke-direct {v0, p0, p1}, Ltg/W;-><init>(Lgg/v;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lkg/c;)Lgg/s;
    .locals 2

    const-string v0, "comparer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/l;

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Ltg/l;-><init>(Lgg/v;Lkg/n;Lkg/c;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final w0()LBg/a;
    .locals 1

    invoke-static {p0}, Ltg/X;->r1(Lgg/v;)LBg/a;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lkg/n;)Lgg/s;
    .locals 2

    const-string v0, "keySelector is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/l;

    invoke-static {}, Lmg/b;->a()Lkg/c;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Ltg/l;-><init>(Lgg/v;Lkg/n;Lkg/c;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final x0(I)LBg/a;
    .locals 1

    const-string v0, "bufferSize"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Ltg/X;->p1(Lgg/v;IZ)LBg/a;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lkg/a;)Lgg/s;
    .locals 1

    const-string v0, "onFinally is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/m;

    invoke-direct {v0, p0, p1}, Ltg/m;-><init>(Lgg/v;Lkg/a;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final y0(JLkg/p;)Lgg/s;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-string v0, "predicate is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/Y;

    invoke-direct {v0, p0, p1, p2, p3}, Ltg/Y;-><init>(Lgg/s;JLkg/p;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "times >= 0 required but it was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public final z(Lkg/a;)Lgg/s;
    .locals 3

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    sget-object v2, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, v1, p1, v2}, Lgg/s;->C(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final z0(Lkg/p;)Lgg/s;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1, p1}, Lgg/s;->y0(JLkg/p;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
