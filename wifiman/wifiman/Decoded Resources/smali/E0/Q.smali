.class public abstract LE0/Q;
.super LE0/P;
.source "SourceFile"

# interfaces
.implements LC0/B;


# instance fields
.field private final p:LE0/c0;

.field private q:J

.field private r:Ljava/util/Map;

.field private final s:LC0/z;

.field private t:LC0/D;

.field private final u:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/c0;)V
    .locals 2

    invoke-direct {p0}, LE0/P;-><init>()V

    iput-object p1, p0, LE0/Q;->p:LE0/c0;

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LE0/Q;->q:J

    new-instance p1, LC0/z;

    invoke-direct {p1, p0}, LC0/z;-><init>(LE0/Q;)V

    iput-object p1, p0, LE0/Q;->s:LC0/z;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LE0/Q;->u:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic W1(LE0/Q;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->S0(J)V

    return-void
.end method

.method public static final synthetic Y1(LE0/Q;LC0/D;)V
    .locals 0

    invoke-direct {p0, p1}, LE0/Q;->l2(LC0/D;)V

    return-void
.end method

.method private final h2(J)V
    .locals 2

    invoke-virtual {p0}, LE0/Q;->r1()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LY0/n;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2}, LE0/Q;->k2(J)V

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->U()LE0/L;

    move-result-object p1

    invoke-virtual {p1}, LE0/L;->H()LE0/L$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/L$a;->E1()V

    :cond_0
    iget-object p1, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {p0, p1}, LE0/P;->B1(LE0/c0;)V

    :cond_1
    invoke-virtual {p0}, LE0/P;->L1()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LE0/Q;->h1()LC0/D;

    move-result-object p1

    invoke-virtual {p0, p1}, LE0/P;->W0(LC0/D;)V

    :cond_2
    return-void
.end method

.method private final l2(LC0/D;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result v0

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/layout/t;->Q0(J)V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-virtual {v0}, LY0/r$a;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/layout/t;->Q0(J)V

    :cond_1
    iget-object v0, p0, LE0/Q;->t:LC0/D;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_5

    iget-object v0, p0, LE0/Q;->r:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_3
    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LE0/Q;->r:Ljava/util/Map;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LE0/Q;->Z1()LE0/b;

    move-result-object v0

    invoke-interface {v0}, LE0/b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->m()V

    iget-object v0, p0, LE0/Q;->r:Ljava/util/Map;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LE0/Q;->r:Ljava/util/Map;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_5
    iput-object p1, p0, LE0/Q;->t:LC0/D;

    return-void
.end method


# virtual methods
.method public G1()LE0/G;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    return-object v0
.end method

.method protected final K0(JFLmh/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LE0/Q;->h2(J)V

    invoke-virtual {p0}, LE0/P;->M1()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LE0/Q;->g2()V

    return-void
.end method

.method public abstract R(I)I
.end method

.method public R1()V
    .locals 4

    invoke-virtual {p0}, LE0/Q;->r1()J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, LE0/Q;->K0(JFLmh/l;)V

    return-void
.end method

.method public abstract S(I)I
.end method

.method public Z0()LE0/P;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public Z1()LE0/b;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    invoke-virtual {v0}, LE0/L;->C()LE0/b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method public a1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final a2(LC0/a;)I
    .locals 1

    iget-object v0, p0, LE0/Q;->u:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/high16 p1, -0x80000000

    :goto_0
    return p1
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final b2()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LE0/Q;->u:Ljava/util/Map;

    return-object v0
.end method

.method public c1()LC0/r;
    .locals 1

    iget-object v0, p0, LE0/Q;->s:LC0/z;

    return-object v0
.end method

.method public final c2()J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->H0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d2()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    return-object v0
.end method

.method public final e2()LC0/z;
    .locals 1

    iget-object v0, p0, LE0/Q;->s:LC0/z;

    return-object v0
.end method

.method public final f2()J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public g1()Z
    .locals 1

    iget-object v0, p0, LE0/Q;->t:LC0/D;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected g2()V
    .locals 1

    invoke-virtual {p0}, LE0/Q;->h1()LC0/D;

    move-result-object v0

    invoke-interface {v0}, LC0/D;->q()V

    return-void
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public h1()LC0/D;
    .locals 2

    iget-object v0, p0, LE0/Q;->t:LC0/D;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LookaheadDelegate has not been measured yet when measureResult is requested."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i2(J)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->A0()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/n;->l(JJ)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, LE0/Q;->h2(J)V

    return-void
.end method

.method public final j2(LE0/Q;Z)J
    .locals 5

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    move-object v2, p0

    :goto_0
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, LE0/P;->J1()Z

    move-result v3

    if-eqz v3, :cond_0

    if-nez p2, :cond_1

    :cond_0
    invoke-virtual {v2}, LE0/Q;->r1()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/n;->l(JJ)J

    move-result-wide v0

    :cond_1
    iget-object v2, v2, LE0/Q;->p:LE0/c0;

    invoke-virtual {v2}, LE0/c0;->I2()LE0/c0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, LE0/c0;->C2()LE0/Q;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method public k2(J)V
    .locals 0

    iput-wide p1, p0, LE0/Q;->q:J

    return-void
.end method

.method public o1()LE0/P;
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public r1()J
    .locals 2

    iget-wide v0, p0, LE0/Q;->q:J

    return-wide v0
.end method

.method public abstract s(I)I
.end method

.method public abstract s0(I)I
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, LE0/Q;->p:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->y()F

    move-result v0

    return v0
.end method
