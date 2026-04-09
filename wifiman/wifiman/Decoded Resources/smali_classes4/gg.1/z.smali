.class public abstract Lgg/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/D;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgg/D;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static B(Lgg/D;Lgg/D;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Lgg/D;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lgg/i;->z0([Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object p1

    const v0, 0x7fffffff

    invoke-virtual {p0, p1, v1, v0}, Lgg/i;->y0(Lkg/n;ZI)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/lang/Iterable;)Lgg/i;
    .locals 1

    invoke-static {p0}, Lgg/i;->A0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private T(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/w;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lug/w;-><init>(Lgg/D;JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public static U(JLjava/util/concurrent/TimeUnit;)Lgg/z;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lgg/z;->V(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static V(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/z;
    .locals 1

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/x;

    invoke-direct {v0, p0, p1, p2, p3}, Lug/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static Z(Lgg/i;)Lgg/z;
    .locals 2

    new-instance v0, Lqg/m0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqg/m0;-><init>(Lgg/i;Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static a0(Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Lgg/z;

    if-eqz v0, :cond_0

    check-cast p0, Lgg/z;

    invoke-static {p0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lug/p;

    invoke-direct {v0, p0}, Lug/p;-><init>(Lgg/D;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static b0(Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lkg/j;)Lgg/z;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source6 is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "zipper is null"

    invoke-static {p6, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p6}, Lmg/a;->n(Lkg/j;)Lkg/n;

    move-result-object p6

    const/4 v0, 0x6

    new-array v0, v0, [Lgg/D;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    invoke-static {p6, v0}, Lgg/z;->g0(Lkg/n;[Lgg/D;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static c0(Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lkg/i;)Lgg/z;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "zipper is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p5}, Lmg/a;->m(Lkg/i;)Lkg/n;

    move-result-object p5

    const/4 v0, 0x5

    new-array v0, v0, [Lgg/D;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    invoke-static {p5, v0}, Lgg/z;->g0(Lkg/n;[Lgg/D;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static d0(Lgg/D;Lgg/D;Lgg/D;Lkg/g;)Lgg/z;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "zipper is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p3}, Lmg/a;->k(Lkg/g;)Lkg/n;

    move-result-object p3

    const/4 v0, 0x3

    new-array v0, v0, [Lgg/D;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    invoke-static {p3, v0}, Lgg/z;->g0(Lkg/n;[Lgg/D;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static e0(Lgg/D;Lgg/D;Lkg/b;)Lgg/z;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "zipper is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p2}, Lmg/a;->j(Lkg/b;)Lkg/n;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Lgg/D;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {p2, v0}, Lgg/z;->g0(Lkg/n;[Lgg/D;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static f0(Ljava/lang/Iterable;Lkg/n;)Lgg/z;
    .locals 1

    const-string v0, "zipper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/B;

    invoke-direct {v0, p0, p1}, Lug/B;-><init>(Ljava/lang/Iterable;Lkg/n;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static varargs g0(Lkg/n;[Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "zipper is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "sources is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p1

    if-nez v0, :cond_0

    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-static {p0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lug/A;

    invoke-direct {v0, p1, p0}, Lug/A;-><init>([Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lgg/C;)Lgg/z;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/b;

    invoke-direct {v0, p0}, Lug/b;-><init>(Lgg/C;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lkg/q;)Lgg/z;
    .locals 1

    const-string v0, "supplier is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/c;

    invoke-direct {v0, p0}, Lug/c;-><init>(Lkg/q;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/lang/Throwable;)Lgg/z;
    .locals 1

    const-string v0, "throwable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lmg/a;->h(Ljava/lang/Object;)Lkg/q;

    move-result-object p0

    invoke-static {p0}, Lgg/z;->q(Lkg/q;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lkg/q;)Lgg/z;
    .locals 1

    const-string v0, "supplier is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/j;

    invoke-direct {v0, p0}, Lug/j;-><init>(Lkg/q;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static x(Ljava/util/concurrent/Callable;)Lgg/z;
    .locals 1

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/o;

    invoke-direct {v0, p0}, Lug/o;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static z(Ljava/lang/Object;)Lgg/z;
    .locals 1

    const-string v0, "item is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/q;

    invoke-direct {v0, p0}, Lug/q;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lkg/n;)Lgg/z;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/r;

    invoke-direct {v0, p0, p1}, Lug/r;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lgg/D;)Lgg/i;
    .locals 0

    invoke-static {p0, p1}, Lgg/z;->B(Lgg/D;Lgg/D;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final E(Lgg/y;)Lgg/z;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/s;

    invoke-direct {v0, p0, p1}, Lug/s;-><init>(Lgg/D;Lgg/y;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final F(Lkg/n;)Lgg/z;
    .locals 1

    const-string v0, "fallbackSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/u;

    invoke-direct {v0, p0, p1}, Lug/u;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final G(Lkg/n;)Lgg/z;
    .locals 2

    const-string v0, "itemSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lug/t;-><init>(Lgg/D;Lkg/n;Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final H(Ljava/lang/Object;)Lgg/z;
    .locals 2

    const-string v0, "item is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lug/t;-><init>(Lgg/D;Lkg/n;Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final I()Lgg/i;
    .locals 1

    invoke-virtual {p0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->k1()Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final J(Lkg/d;)Lgg/i;
    .locals 1

    invoke-virtual {p0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->m1(Lkg/d;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final K(Lkg/n;)Lgg/i;
    .locals 1

    invoke-virtual {p0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final L(Lkg/n;)Lgg/z;
    .locals 1

    invoke-virtual {p0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->Z(Lgg/i;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final M(Lkg/f;Lkg/f;)Lhg/c;
    .locals 1

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Log/f;

    invoke-direct {v0, p1, p2}, Log/f;-><init>(Lkg/f;Lkg/f;)V

    invoke-virtual {p0, v0}, Lgg/z;->a(Lgg/B;)V

    return-object v0
.end method

.method protected abstract N(Lgg/B;)V
.end method

.method public final O(Lgg/y;)Lgg/z;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/v;

    invoke-direct {v0, p0, p1}, Lug/v;-><init>(Lgg/D;Lgg/y;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final P(Lgg/B;)Lgg/B;
    .locals 0

    invoke-virtual {p0, p1}, Lgg/z;->a(Lgg/B;)V

    return-object p1
.end method

.method public final Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lgg/z;->T(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final R(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "fallback is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-direct/range {p0 .. p5}, Lgg/z;->T(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final S(JLjava/util/concurrent/TimeUnit;Lgg/D;)Lgg/z;
    .locals 7

    const-string v0, "fallback is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lgg/z;->T(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final W()Lgg/i;
    .locals 1

    instance-of v0, p0, Lng/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/b;

    invoke-interface {v0}, Lng/b;->f()Lgg/i;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lug/y;

    invoke-direct {v0, p0}, Lug/y;-><init>(Lgg/D;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final X()Lgg/n;
    .locals 1

    instance-of v0, p0, Lng/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/c;

    invoke-interface {v0}, Lng/c;->d()Lgg/n;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lrg/m;

    invoke-direct {v0, p0}, Lrg/m;-><init>(Lgg/D;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Lgg/s;
    .locals 1

    instance-of v0, p0, Lng/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lng/d;

    invoke-interface {v0}, Lng/d;->b()Lgg/s;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lug/z;

    invoke-direct {v0, p0}, Lug/z;-><init>(Lgg/D;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lgg/B;)V
    .locals 2

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, LEg/a;->D(Lgg/z;Lgg/B;)Lgg/B;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, p1}, Lgg/z;->N(Lgg/B;)V
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

.method public final d()Ljava/lang/Object;
    .locals 1

    new-instance v0, Log/d;

    invoke-direct {v0}, Log/d;-><init>()V

    invoke-virtual {p0, v0}, Lgg/z;->a(Lgg/B;)V

    invoke-virtual {v0}, Log/d;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lgg/z;
    .locals 1

    new-instance v0, Lug/a;

    invoke-direct {v0, p0}, Lug/a;-><init>(Lgg/D;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/Class;)Lgg/z;
    .locals 1

    const-string v0, "clazz is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmg/a;->c(Ljava/lang/Class;)Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lgg/E;)Lgg/z;
    .locals 1

    const-string v0, "transformer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/E;

    invoke-interface {p1, p0}, Lgg/E;->a(Lgg/z;)Lgg/D;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->a0(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lgg/v;)Lgg/z;
    .locals 1

    const-string v0, "subscriptionIndicator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/e;

    invoke-direct {v0, p0, p1}, Lug/e;-><init>(Lgg/D;Lgg/v;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lkg/a;)Lgg/z;
    .locals 1

    const-string v0, "onFinally is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/f;

    invoke-direct {v0, p0, p1}, Lug/f;-><init>(Lgg/D;Lkg/a;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lkg/f;)Lgg/z;
    .locals 1

    const-string v0, "onError is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/g;

    invoke-direct {v0, p0, p1}, Lug/g;-><init>(Lgg/D;Lkg/f;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lkg/f;)Lgg/z;
    .locals 1

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/h;

    invoke-direct {v0, p0, p1}, Lug/h;-><init>(Lgg/D;Lkg/f;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final o(Lkg/f;)Lgg/z;
    .locals 1

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/i;

    invoke-direct {v0, p0, p1}, Lug/i;-><init>(Lgg/D;Lkg/f;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lkg/p;)Lgg/n;
    .locals 1

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrg/g;

    invoke-direct {v0, p0, p1}, Lrg/g;-><init>(Lgg/D;Lkg/p;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lkg/n;)Lgg/z;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/k;

    invoke-direct {v0, p0, p1}, Lug/k;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lkg/n;)Lgg/b;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/l;

    invoke-direct {v0, p0, p1}, Lug/l;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lkg/n;)Lgg/n;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/m;

    invoke-direct {v0, p0, p1}, Lug/m;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lkg/n;)Lgg/s;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/l;

    invoke-direct {v0, p0, p1}, Lsg/l;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lug/n;

    invoke-direct {v0, p0, p1}, Lug/n;-><init>(Lgg/D;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final y()Lgg/b;
    .locals 1

    new-instance v0, Lpg/o;

    invoke-direct {v0, p0}, Lpg/o;-><init>(Lgg/D;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method
