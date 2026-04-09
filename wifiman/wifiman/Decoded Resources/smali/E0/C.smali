.class public final LE0/C;
.super LE0/c0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/C$a;,
        LE0/C$b;
    }
.end annotation


# static fields
.field public static final o1:LE0/C$a;

.field private static final p1:Lm0/S0;


# instance fields
.field private k1:LE0/B;

.field private l1:LY0/b;

.field private m1:LE0/Q;

.field private n1:Landroidx/compose/ui/layout/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE0/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0/C$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE0/C;->o1:LE0/C$a;

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v0

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->b()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lm0/S0;->I(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lm0/S0;->K(F)V

    sget-object v1, Lm0/T0;->a:Lm0/T0$a;

    invoke-virtual {v1}, Lm0/T0$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->H(I)V

    sput-object v0, LE0/C;->p1:Lm0/S0;

    return-void
.end method

.method public constructor <init>(LE0/G;LE0/B;)V
    .locals 2

    invoke-direct {p0, p1}, LE0/c0;-><init>(LE0/G;)V

    iput-object p2, p0, LE0/C;->k1:LE0/B;

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, LE0/C$b;

    invoke-direct {p1, p0}, LE0/C$b;-><init>(LE0/C;)V

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, LE0/C;->m1:LE0/Q;

    invoke-interface {p2}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p1

    const/16 v1, 0x200

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result p1

    and-int/2addr p1, v1

    if-eqz p1, :cond_1

    new-instance v0, Landroidx/compose/ui/layout/d;

    const-string p1, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/compose/ui/layout/b;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/layout/d;-><init>(LE0/C;Landroidx/compose/ui/layout/b;)V

    :cond_1
    iput-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    return-void
.end method

.method public static final synthetic B3(LE0/C;)Landroidx/compose/ui/layout/d;
    .locals 0

    iget-object p0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    return-object p0
.end method

.method private final F3()V
    .locals 7

    invoke-virtual {p0}, LE0/P;->M1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LE0/c0;->a3()V

    iget-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->p()Landroidx/compose/ui/layout/b;

    move-result-object v2

    invoke-virtual {p0}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v3

    invoke-virtual {p0}, LE0/C;->C2()LE0/Q;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, LE0/Q;->e2()LC0/z;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/b;->k0(Landroidx/compose/ui/layout/t$a;LC0/r;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v2

    invoke-virtual {p0}, LE0/C;->C2()LE0/Q;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/Q;->f2()J

    move-result-wide v5

    invoke-static {v5, v6}, LY0/r;->b(J)LY0/r;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    invoke-static {v2, v3, v0}, LY0/r;->d(JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->h()J

    move-result-wide v2

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/Q;->f2()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->b(J)LY0/r;

    move-result-object v4

    :cond_2
    invoke-static {v2, v3, v4}, LY0/r;->d(JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-virtual {v2, v0}, LE0/c0;->j3(Z)V

    :cond_4
    invoke-virtual {p0}, LE0/c0;->h1()LC0/D;

    move-result-object v0

    invoke-interface {v0}, LC0/D;->q()V

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, v1}, LE0/c0;->j3(Z)V

    return-void
.end method


# virtual methods
.method public C2()LE0/Q;
    .locals 1

    iget-object v0, p0, LE0/C;->m1:LE0/Q;

    return-object v0
.end method

.method public final C3()LE0/B;
    .locals 1

    iget-object v0, p0, LE0/C;->k1:LE0/B;

    return-object v0
.end method

.method public final D3()LY0/b;
    .locals 1

    iget-object v0, p0, LE0/C;->l1:LY0/b;

    return-object v0
.end method

.method public final E3()LE0/c0;
    .locals 1

    invoke-virtual {p0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method public G2()Landroidx/compose/ui/e$c;
    .locals 1

    iget-object v0, p0, LE0/C;->k1:LE0/B;

    invoke-interface {v0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    return-object v0
.end method

.method public final G3(LE0/B;)V
    .locals 2

    iget-object v0, p0, LE0/C;->k1:LE0/B;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    const/16 v1, 0x200

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/b;

    iget-object v1, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/compose/ui/layout/d;->s(Landroidx/compose/ui/layout/b;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/compose/ui/layout/d;

    invoke-direct {v1, p0, v0}, Landroidx/compose/ui/layout/d;-><init>(LE0/C;Landroidx/compose/ui/layout/b;)V

    :goto_0
    iput-object v1, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    :cond_2
    :goto_1
    iput-object p1, p0, LE0/C;->k1:LE0/B;

    return-void
.end method

.method public final H3(LY0/b;)V
    .locals 0

    iput-object p1, p0, LE0/C;->l1:LY0/b;

    return-void
.end method

.method protected I3(LE0/Q;)V
    .locals 0

    iput-object p1, p0, LE0/C;->m1:LE0/Q;

    return-void
.end method

.method protected K0(JFLmh/l;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LE0/c0;->K0(JFLmh/l;)V

    invoke-direct {p0}, LE0/C;->F3()V

    return-void
.end method

.method protected L0(JFLp0/c;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LE0/c0;->L0(JFLp0/c;)V

    invoke-direct {p0}, LE0/C;->F3()V

    return-void
.end method

.method public R(I)I
    .locals 3

    iget-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->p()Landroidx/compose/ui/layout/b;

    move-result-object v1

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-interface {v1, v0, v2, p1}, Landroidx/compose/ui/layout/b;->W1(LC0/c;LC0/n;I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/C;->k1:LE0/B;

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LE0/B;->r(LC0/o;LC0/n;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public S(I)I
    .locals 3

    iget-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->p()Landroidx/compose/ui/layout/b;

    move-result-object v1

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-interface {v1, v0, v2, p1}, Landroidx/compose/ui/layout/b;->O(LC0/c;LC0/n;I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/C;->k1:LE0/B;

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LE0/B;->A(LC0/o;LC0/n;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 6

    invoke-virtual {p0}, LE0/c0;->y2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, LE0/C;->l1:LY0/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LY0/b;->r()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Lookahead constraints cannot be null in approach pass."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, LE0/c0;->j2(LE0/c0;J)V

    invoke-static {p0}, LE0/C;->B3(LE0/C;)Landroidx/compose/ui/layout/d;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->p()Landroidx/compose/ui/layout/b;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->N()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/b;->S(J)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_3

    invoke-virtual {p0}, LE0/C;->D3()LY0/b;

    move-result-object v2

    invoke-static {p1, p2, v2}, LY0/b;->e(JLjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v3

    :goto_2
    invoke-virtual {v0, v2}, Landroidx/compose/ui/layout/d;->r(Z)V

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->b()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-virtual {v2, v3}, LE0/c0;->i3(Z)V

    :cond_4
    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-interface {v1, v0, v2, p1, p2}, Landroidx/compose/ui/layout/b;->Q0(LC0/d;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object p2

    invoke-virtual {p2, v4}, LE0/c0;->i3(Z)V

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p2

    invoke-virtual {p0}, LE0/C;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    if-ne p2, v1, :cond_5

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p2

    invoke-virtual {p0}, LE0/C;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    move v3, v4

    :goto_3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->b()Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object p2

    invoke-virtual {p2}, LE0/c0;->h()J

    move-result-wide v0

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object p2

    invoke-virtual {p2}, LE0/c0;->C2()LE0/Q;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, LE0/Q;->f2()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->b(J)LY0/r;

    move-result-object p2

    goto :goto_4

    :cond_6
    const/4 p2, 0x0

    :goto_4
    invoke-static {v0, v1, p2}, LY0/r;->d(JLjava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    if-nez v3, :cond_8

    new-instance p2, LE0/C$c;

    invoke-direct {p2, p1, p0}, LE0/C$c;-><init>(LC0/D;LE0/C;)V

    move-object p1, p2

    goto :goto_5

    :cond_7
    invoke-virtual {p0}, LE0/C;->C3()LE0/B;

    move-result-object v0

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LE0/B;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    :cond_8
    :goto_5
    invoke-virtual {p0, p1}, LE0/c0;->k3(LC0/D;)V

    invoke-virtual {p0}, LE0/c0;->Z2()V

    return-object p0
.end method

.method public U0(LC0/a;)I
    .locals 1

    invoke-virtual {p0}, LE0/C;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LE0/Q;->a2(LC0/a;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LE0/D;->a(LE0/P;LC0/a;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public c3(Lm0/n0;Lp0/c;)V
    .locals 1

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE0/c0;->p2(Lm0/n0;Lp0/c;)V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p2

    invoke-static {p2}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object p2

    invoke-interface {p2}, LE0/m0;->getShowLayoutBounds()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LE0/C;->p1:Lm0/S0;

    invoke-virtual {p0, p1, p2}, LE0/c0;->q2(Lm0/n0;Lm0/S0;)V

    :cond_0
    return-void
.end method

.method public s(I)I
    .locals 3

    iget-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->p()Landroidx/compose/ui/layout/b;

    move-result-object v1

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-interface {v1, v0, v2, p1}, Landroidx/compose/ui/layout/b;->W0(LC0/c;LC0/n;I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/C;->k1:LE0/B;

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LE0/B;->v(LC0/o;LC0/n;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public s0(I)I
    .locals 3

    iget-object v0, p0, LE0/C;->n1:Landroidx/compose/ui/layout/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/d;->p()Landroidx/compose/ui/layout/b;

    move-result-object v1

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v2

    invoke-interface {v1, v0, v2, p1}, Landroidx/compose/ui/layout/b;->V(LC0/c;LC0/n;I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/C;->k1:LE0/B;

    invoke-virtual {p0}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1}, LE0/B;->p(LC0/o;LC0/n;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public s2()V
    .locals 1

    invoke-virtual {p0}, LE0/C;->C2()LE0/Q;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LE0/C$b;

    invoke-direct {v0, p0}, LE0/C$b;-><init>(LE0/C;)V

    invoke-virtual {p0, v0}, LE0/C;->I3(LE0/Q;)V

    :cond_0
    return-void
.end method
