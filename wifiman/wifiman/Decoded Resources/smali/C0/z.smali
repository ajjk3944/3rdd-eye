.class public final LC0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/r;


# instance fields
.field private final a:LE0/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC0/z;->a:LE0/Q;

    return-void
.end method

.method private final b()J
    .locals 7

    iget-object v0, p0, LC0/z;->a:LE0/Q;

    invoke-static {v0}, LC0/A;->a(LE0/Q;)LE0/Q;

    move-result-object v0

    invoke-virtual {v0}, LE0/Q;->c1()LC0/r;

    move-result-object v1

    sget-object v2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v2}, Ll0/g$a;->c()J

    move-result-wide v3

    invoke-virtual {p0, v1, v3, v4}, LC0/z;->b0(LC0/r;J)J

    move-result-wide v3

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v1

    invoke-virtual {v0}, LE0/Q;->d2()LE0/c0;

    move-result-object v0

    invoke-virtual {v2}, Ll0/g$a;->c()J

    move-result-wide v5

    invoke-virtual {v1, v0, v5, v6}, LE0/c0;->b0(LC0/r;J)J

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Ll0/g;->q(JJ)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public A(J)J
    .locals 3

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-direct {p0}, LC0/z;->b()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, LE0/c0;->A(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public J(LC0/r;Z)Ll0/i;
    .locals 1

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE0/c0;->J(LC0/r;Z)Ll0/i;

    move-result-object p1

    return-object p1
.end method

.method public M()Z
    .locals 1

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->M()Z

    move-result v0

    return v0
.end method

.method public O([F)V
    .locals 1

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/c0;->O([F)V

    return-void
.end method

.method public V(LC0/r;JZ)J
    .locals 5

    instance-of v0, p1, LC0/z;

    if-eqz v0, :cond_1

    check-cast p1, LC0/z;

    iget-object p1, p1, LC0/z;->a:LE0/Q;

    invoke-virtual {p1}, LE0/Q;->d2()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->V2()V

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {p1}, LE0/Q;->d2()LE0/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, LE0/c0;->t2(LE0/c0;)LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_0

    xor-int/lit8 v1, p4, 0x1

    invoke-virtual {p1, v0, v1}, LE0/Q;->j2(LE0/Q;Z)J

    move-result-wide v1

    invoke-static {p2, p3}, LY0/o;->d(J)J

    move-result-wide p1

    invoke-static {v1, v2, p1, p2}, LY0/n;->l(JJ)J

    move-result-wide p1

    iget-object p3, p0, LC0/z;->a:LE0/Q;

    xor-int/lit8 p4, p4, 0x1

    invoke-virtual {p3, v0, p4}, LE0/Q;->j2(LE0/Q;Z)J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, LY0/n;->k(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/n;->h(J)I

    move-result p3

    int-to-float p3, p3

    invoke-static {p1, p2}, LY0/n;->i(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {p3, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, LC0/A;->a(LE0/Q;)LE0/Q;

    move-result-object v0

    xor-int/lit8 v1, p4, 0x1

    invoke-virtual {p1, v0, v1}, LE0/Q;->j2(LE0/Q;Z)J

    move-result-wide v1

    invoke-virtual {v0}, LE0/Q;->r1()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/n;->l(JJ)J

    move-result-wide v1

    invoke-static {p2, p3}, LY0/o;->d(J)J

    move-result-wide p1

    invoke-static {v1, v2, p1, p2}, LY0/n;->l(JJ)J

    move-result-wide p1

    iget-object p3, p0, LC0/z;->a:LE0/Q;

    invoke-static {p3}, LC0/A;->a(LE0/Q;)LE0/Q;

    move-result-object p3

    iget-object v1, p0, LC0/z;->a:LE0/Q;

    xor-int/lit8 v2, p4, 0x1

    invoke-virtual {v1, p3, v2}, LE0/Q;->j2(LE0/Q;Z)J

    move-result-wide v1

    invoke-virtual {p3}, LE0/Q;->r1()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/n;->l(JJ)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, LY0/n;->k(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/n;->h(J)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1, p2}, LY0/n;->i(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    invoke-virtual {p3}, LE0/Q;->d2()LE0/c0;

    move-result-object p3

    invoke-virtual {p3}, LE0/c0;->I2()LE0/c0;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/Q;->d2()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p3, v0, p1, p2, p4}, LE0/c0;->V(LC0/r;JZ)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_1
    iget-object v0, p0, LC0/z;->a:LE0/Q;

    invoke-static {v0}, LC0/A;->a(LE0/Q;)LE0/Q;

    move-result-object v0

    invoke-virtual {v0}, LE0/Q;->e2()LC0/z;

    move-result-object v1

    invoke-virtual {p0, v1, p2, p3, p4}, LC0/z;->V(LC0/r;JZ)J

    move-result-wide p2

    invoke-virtual {v0}, LE0/Q;->d2()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->c1()LC0/r;

    move-result-object v0

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2, p4}, LC0/r;->V(LC0/r;JZ)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public W(J)J
    .locals 2

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE0/c0;->W(J)J

    move-result-wide p1

    invoke-direct {p0}, LC0/z;->b()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final a()LE0/c0;
    .locals 1

    iget-object v0, p0, LC0/z;->a:LE0/Q;

    invoke-virtual {v0}, LE0/Q;->d2()LE0/c0;

    move-result-object v0

    return-object v0
.end method

.method public a0()LC0/r;
    .locals 2

    invoke-virtual {p0}, LC0/z;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/Q;->c1()LC0/r;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public b0(LC0/r;J)J
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, LC0/z;->V(LC0/r;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, LC0/z;->a:LE0/Q;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    invoke-static {v1, v0}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(J)J
    .locals 3

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-direct {p0}, LC0/z;->b()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, LE0/c0;->o0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public r(J)J
    .locals 2

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE0/c0;->r(J)J

    move-result-wide p1

    invoke-direct {p0}, LC0/z;->b()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public z(LC0/r;[F)V
    .locals 1

    invoke-virtual {p0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE0/c0;->z(LC0/r;[F)V

    return-void
.end method
