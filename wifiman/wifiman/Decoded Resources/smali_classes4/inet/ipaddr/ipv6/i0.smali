.class public Linet/ipaddr/ipv6/i0;
.super Linet/ipaddr/m;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field private static final f:Ljava/math/BigInteger;

.field private static final g:[Linet/ipaddr/ipv6/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/i0;->f:Ljava/math/BigInteger;

    const/4 v0, 0x0

    new-array v0, v0, [Linet/ipaddr/ipv6/i0;

    sput-object v0, Linet/ipaddr/ipv6/i0;->g:[Linet/ipaddr/ipv6/i0;

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)V
    .locals 6

    .line 2
    new-instance v3, Linet/ipaddr/ipv6/d0;

    invoke-direct {v3}, Linet/ipaddr/ipv6/d0;-><init>()V

    new-instance v4, Linet/ipaddr/ipv6/e0;

    invoke-direct {v4}, Linet/ipaddr/ipv6/e0;-><init>()V

    new-instance v5, Linet/ipaddr/ipv6/f0;

    invoke-direct {v5}, Linet/ipaddr/ipv6/f0;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/m;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;Ljava/util/function/UnaryOperator;Ljava/util/function/UnaryOperator;Ljava/util/function/UnaryOperator;)V

    .line 3
    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/e;->b0(Linet/ipaddr/ipv6/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;Lag/g;)V

    throw v0
.end method

.method constructor <init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/m;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;Z)V

    return-void
.end method

.method public static synthetic e1(Linet/ipaddr/ipv6/e$a;IILinet/ipaddr/m$d;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Linet/ipaddr/ipv6/i0;->t1(Linet/ipaddr/ipv6/e$a;IILinet/ipaddr/m$d;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f1(Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/ipv6/i0;->r1(Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g1(Linet/ipaddr/ipv6/e$a;[Linet/ipaddr/ipv6/V;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/i0;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/i0;->s1(Linet/ipaddr/ipv6/e$a;[Linet/ipaddr/ipv6/V;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/i0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h1(Linet/ipaddr/ipv6/V;I)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv6/i0;->p1(Linet/ipaddr/ipv6/V;I)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i1(Linet/ipaddr/ipv6/i0;)Z
    .locals 0

    invoke-static {p0}, Linet/ipaddr/ipv6/i0;->v1(Linet/ipaddr/ipv6/i0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j1(Linet/ipaddr/ipv6/i0;)J
    .locals 2

    invoke-static {p0}, Linet/ipaddr/ipv6/i0;->w1(Linet/ipaddr/ipv6/i0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic k1(ZZLinet/ipaddr/ipv6/i0;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/i0;->u1(ZZLinet/ipaddr/ipv6/i0;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l1(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/i0;->q1(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;I)Z

    move-result p0

    return p0
.end method

.method private m1()Linet/ipaddr/ipv6/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->n1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->B1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic p1(Linet/ipaddr/ipv6/V;I)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/V;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic q1(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;I)Z
    .locals 0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    invoke-virtual {p1, p2}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/k;->Q()I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic r1(Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->h2()Linet/ipaddr/ipv6/b;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Y1()Linet/ipaddr/ipv6/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic s1(Linet/ipaddr/ipv6/e$a;[Linet/ipaddr/ipv6/V;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/i0;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/i0;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/e$a;->W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Linet/ipaddr/ipv6/i0;-><init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)V

    return-object v0
.end method

.method private static synthetic t1(Linet/ipaddr/ipv6/e$a;IILinet/ipaddr/m$d;)Z
    .locals 9

    invoke-interface {p3}, Linet/ipaddr/m$d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/i0;

    new-instance v2, Linet/ipaddr/ipv6/Y;

    invoke-direct {v2, p0}, Linet/ipaddr/ipv6/Y;-><init>(Linet/ipaddr/ipv6/e$a;)V

    invoke-virtual {v0}, Linet/ipaddr/ipv6/i0;->n1()Linet/ipaddr/ipv6/b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v4

    invoke-virtual {v0}, Linet/ipaddr/ipv6/i0;->o1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v5

    const/4 v8, 0x0

    move-object v1, p3

    move-object v3, p0

    move v6, p1

    move v7, p2

    invoke-static/range {v1 .. v8}, Linet/ipaddr/m;->b1(Linet/ipaddr/m$d;Ljava/util/function/BiFunction;Linet/ipaddr/c$a;[LZf/d;[LZf/d;IILjava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method private static synthetic u1(ZZLinet/ipaddr/ipv6/i0;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p2}, Linet/ipaddr/ipv6/i0;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic v1(Linet/ipaddr/ipv6/i0;)Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->getCount()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Linet/ipaddr/ipv6/i0;->f:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic w1(Linet/ipaddr/ipv6/i0;)J
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/m;->getCount()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public bridge synthetic K0()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->o1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 9

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->n1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->o1()Linet/ipaddr/ipv6/b;

    move-result-object v1

    invoke-direct {p0}, Linet/ipaddr/ipv6/i0;->m1()Linet/ipaddr/ipv6/e$a;

    move-result-object v2

    invoke-virtual {p0}, Linet/ipaddr/m;->A0()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v0, v2}, Linet/ipaddr/m;->U0(Linet/ipaddr/a;Lbg/a;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->Z()I

    move-result v7

    new-instance v3, Linet/ipaddr/ipv6/g0;

    invoke-direct {v3}, Linet/ipaddr/ipv6/g0;-><init>()V

    new-instance v4, Linet/ipaddr/ipv6/h0;

    invoke-direct {v4}, Linet/ipaddr/ipv6/h0;-><init>()V

    new-instance v5, Linet/ipaddr/ipv6/X;

    invoke-direct {v5}, Linet/ipaddr/ipv6/X;-><init>()V

    add-int/lit8 v6, v7, -0x1

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Linet/ipaddr/m;->V0(Linet/ipaddr/g;Linet/ipaddr/g;Lbg/a;Linet/ipaddr/j$e;Linet/ipaddr/j$e;Linet/ipaddr/m$e;IILinet/ipaddr/j$e;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public n1()Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/b;

    return-object v0
.end method

.method public o1()Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/b;

    return-object v0
.end method

.method public bridge synthetic q0()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->n1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->x1()Ldg/a;

    move-result-object v0

    return-object v0
.end method

.method public x1()Ldg/a;
    .locals 9

    invoke-virtual {p0}, Linet/ipaddr/ipv6/i0;->n1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->Z()I

    move-result v0

    invoke-direct {p0}, Linet/ipaddr/ipv6/i0;->m1()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    new-instance v4, Linet/ipaddr/ipv6/W;

    invoke-direct {v4, v1, v2, v0}, Linet/ipaddr/ipv6/W;-><init>(Linet/ipaddr/ipv6/e$a;II)V

    new-instance v5, Linet/ipaddr/ipv6/Z;

    invoke-direct {v5}, Linet/ipaddr/ipv6/Z;-><init>()V

    new-instance v6, Linet/ipaddr/ipv6/a0;

    invoke-direct {v6}, Linet/ipaddr/ipv6/a0;-><init>()V

    new-instance v7, Linet/ipaddr/ipv6/b0;

    invoke-direct {v7}, Linet/ipaddr/ipv6/b0;-><init>()V

    new-instance v8, Linet/ipaddr/ipv6/c0;

    invoke-direct {v8}, Linet/ipaddr/ipv6/c0;-><init>()V

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Linet/ipaddr/m;->J(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/m$c;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/a;

    move-result-object v0

    return-object v0
.end method
