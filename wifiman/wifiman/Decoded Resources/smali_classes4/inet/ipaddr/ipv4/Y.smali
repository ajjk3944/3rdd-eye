.class public Linet/ipaddr/ipv4/Y;
.super Linet/ipaddr/m;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field private static final f:[Linet/ipaddr/ipv4/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Linet/ipaddr/ipv4/Y;

    sput-object v0, Linet/ipaddr/ipv4/Y;->f:[Linet/ipaddr/ipv4/Y;

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V
    .locals 6

    .line 2
    new-instance v3, Linet/ipaddr/ipv4/Q;

    invoke-direct {v3}, Linet/ipaddr/ipv4/Q;-><init>()V

    new-instance v4, Linet/ipaddr/ipv4/S;

    invoke-direct {v4}, Linet/ipaddr/ipv4/S;-><init>()V

    new-instance v5, Linet/ipaddr/ipv4/T;

    invoke-direct {v5}, Linet/ipaddr/ipv4/T;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/m;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;Ljava/util/function/UnaryOperator;Ljava/util/function/UnaryOperator;Ljava/util/function/UnaryOperator;)V

    .line 3
    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/e;->f0(Linet/ipaddr/ipv4/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;Lag/g;)V

    throw v0
.end method

.method constructor <init>(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/m;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;Z)V

    return-void
.end method

.method public static synthetic e1(Linet/ipaddr/ipv4/e$a;[Linet/ipaddr/ipv4/M;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/Y;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/Y;->p1(Linet/ipaddr/ipv4/e$a;[Linet/ipaddr/ipv4/M;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/Y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f1(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/Y;->o1(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic g1(ZZLinet/ipaddr/ipv4/Y;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/Y;->r1(ZZLinet/ipaddr/ipv4/Y;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h1(Linet/ipaddr/ipv4/M;I)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv4/Y;->n1(Linet/ipaddr/ipv4/M;I)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i1(Linet/ipaddr/ipv4/e$a;IILinet/ipaddr/m$d;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Linet/ipaddr/ipv4/Y;->q1(Linet/ipaddr/ipv4/e$a;IILinet/ipaddr/m$d;)Z

    move-result p0

    return p0
.end method

.method private j1()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic n1(Linet/ipaddr/ipv4/M;I)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/M;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic o1(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;I)Z
    .locals 0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    invoke-virtual {p1, p2}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

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

.method private static synthetic p1(Linet/ipaddr/ipv4/e$a;[Linet/ipaddr/ipv4/M;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/Y;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/Y;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->U0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/e$a;->U0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Linet/ipaddr/ipv4/Y;-><init>(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V

    return-object v0
.end method

.method private static synthetic q1(Linet/ipaddr/ipv4/e$a;IILinet/ipaddr/m$d;)Z
    .locals 9

    invoke-interface {p3}, Linet/ipaddr/m$d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/Y;

    new-instance v2, Linet/ipaddr/ipv4/X;

    invoke-direct {v2, p0}, Linet/ipaddr/ipv4/X;-><init>(Linet/ipaddr/ipv4/e$a;)V

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object v4

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

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

.method private static synthetic r1(ZZLinet/ipaddr/ipv4/Y;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p2}, Linet/ipaddr/ipv4/Y;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic K0()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method protected b0()Ljava/math/BigInteger;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->k1()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 9

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v1

    invoke-direct {p0}, Linet/ipaddr/ipv4/Y;->j1()Linet/ipaddr/ipv4/e$a;

    move-result-object v2

    invoke-virtual {p0}, Linet/ipaddr/m;->A0()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v0, v2}, Linet/ipaddr/m;->U0(Linet/ipaddr/a;Lbg/a;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->Z()I

    move-result v7

    new-instance v3, Linet/ipaddr/ipv4/U;

    invoke-direct {v3}, Linet/ipaddr/ipv4/U;-><init>()V

    new-instance v4, Linet/ipaddr/ipv4/V;

    invoke-direct {v4}, Linet/ipaddr/ipv4/V;-><init>()V

    new-instance v5, Linet/ipaddr/ipv4/W;

    invoke-direct {v5}, Linet/ipaddr/ipv4/W;-><init>()V

    add-int/lit8 v6, v7, -0x1

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Linet/ipaddr/m;->V0(Linet/ipaddr/g;Linet/ipaddr/g;Lbg/a;Linet/ipaddr/j$e;Linet/ipaddr/j$e;Linet/ipaddr/m$e;IILinet/ipaddr/j$e;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public k1()J
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->K1()J

    move-result-wide v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv4/b;->K1()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public l1()Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/b;

    return-object v0
.end method

.method public m1()Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/b;

    return-object v0
.end method

.method public bridge synthetic q0()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public s1()Ldg/a;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->Z()I

    move-result v0

    invoke-direct {p0}, Linet/ipaddr/ipv4/Y;->j1()Linet/ipaddr/ipv4/e$a;

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    new-instance v3, Linet/ipaddr/ipv4/N;

    invoke-direct {v3, v1, v2, v0}, Linet/ipaddr/ipv4/N;-><init>(Linet/ipaddr/ipv4/e$a;II)V

    new-instance v0, Linet/ipaddr/ipv4/O;

    invoke-direct {v0}, Linet/ipaddr/ipv4/O;-><init>()V

    new-instance v1, Linet/ipaddr/ipv4/P;

    invoke-direct {v1}, Linet/ipaddr/ipv4/P;-><init>()V

    invoke-static {p0, v3, v0, v1}, Linet/ipaddr/m;->T(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/m$c;Ljava/util/function/ToLongFunction;)Ldg/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Y;->s1()Ldg/a;

    move-result-object v0

    return-object v0
.end method
