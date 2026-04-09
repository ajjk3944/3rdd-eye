.class public final Landroidx/compose/ui/platform/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/l0;


# instance fields
.field private a:Lp0/c;

.field private final b:Lm0/H0;

.field private final c:Landroidx/compose/ui/platform/r;

.field private d:Lmh/p;

.field private e:Lmh/a;

.field private f:J

.field private g:Z

.field private final h:[F

.field private i:[F

.field private j:Z

.field private k:LY0/d;

.field private l:LY0/t;

.field private final m:Lo0/a;

.field private n:I

.field private o:J

.field private p:Lm0/Q0;

.field private q:Lm0/U0;

.field private r:Lm0/S0;

.field private s:Z

.field private final t:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp0/c;Lm0/H0;Landroidx/compose/ui/platform/r;Lmh/p;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    iput-object p2, p0, Landroidx/compose/ui/platform/u0;->b:Lm0/H0;

    iput-object p3, p0, Landroidx/compose/ui/platform/u0;->c:Landroidx/compose/ui/platform/r;

    iput-object p4, p0, Landroidx/compose/ui/platform/u0;->d:Lmh/p;

    iput-object p5, p0, Landroidx/compose/ui/platform/u0;->e:Lmh/a;

    const p1, 0x7fffffff

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/u0;->f:J

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, p1, p2}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->h:[F

    const/4 p1, 0x0

    const/4 p3, 0x2

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-static {p4, p1, p3, p2}, LY0/f;->b(FFILjava/lang/Object;)LY0/d;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->k:LY0/d;

    sget-object p1, LY0/t;->Ltr:LY0/t;

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->l:LY0/t;

    new-instance p1, Lo0/a;

    invoke-direct {p1}, Lo0/a;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->m:Lo0/a;

    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/u0;->o:J

    new-instance p1, Landroidx/compose/ui/platform/u0$a;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/u0$a;-><init>(Landroidx/compose/ui/platform/u0;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->t:Lmh/l;

    return-void
.end method

.method public static final synthetic l(Landroidx/compose/ui/platform/u0;)Lmh/p;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/u0;->d:Lmh/p;

    return-object p0
.end method

.method private final m(Lm0/n0;)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v0}, Lp0/c;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v0}, Lp0/c;->n()Lm0/Q0;

    move-result-object v0

    instance-of v1, v0, Lm0/Q0$b;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lm0/Q0$b;

    invoke-virtual {v0}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v0

    invoke-static {p1, v0, v2, v3, v4}, Lm0/n0;->o(Lm0/n0;Ll0/i;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lm0/Q0$c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->q:Lm0/U0;

    if-nez v1, :cond_1

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/u0;->q:Lm0/U0;

    :cond_1
    invoke-interface {v1}, Lm0/U0;->a()V

    check-cast v0, Lm0/Q0$c;

    invoke-virtual {v0}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v0

    invoke-static {v1, v0, v4, v3, v4}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    invoke-static {p1, v1, v2, v3, v4}, Lm0/n0;->t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lm0/Q0$a;

    if-eqz v1, :cond_3

    check-cast v0, Lm0/Q0$a;

    invoke-virtual {v0}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v0

    invoke-static {p1, v0, v2, v3, v4}, Lm0/n0;->t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private final n()[F
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->o()[F

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->i:[F

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-static {v2, v1, v2}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/u0;->i:[F

    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/platform/D0;->a([F[F)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v2, v1

    :cond_1
    return-object v2
.end method

.method private final o()[F
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->r()V

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->h:[F

    return-object v0
.end method

.method private final p(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/u0;->j:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/u0;->j:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->c:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/platform/r;->A0(LE0/l0;Z)V

    :cond_0
    return-void
.end method

.method private final q()V
    .locals 2

    sget-object v0, Landroidx/compose/ui/platform/L1;->a:Landroidx/compose/ui/platform/L1;

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->c:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/L1;->a(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final r()V
    .locals 13

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v0}, Lp0/c;->o()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/h;->d(J)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v1, v2}, LY0/s;->d(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/n;->b(J)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lp0/c;->o()J

    move-result-wide v1

    :goto_0
    iget-object v3, p0, Landroidx/compose/ui/platform/u0;->h:[F

    invoke-static {v3}, Lm0/O0;->h([F)V

    iget-object v3, p0, Landroidx/compose/ui/platform/u0;->h:[F

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v4, v5, v4}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v12

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v6

    neg-float v7, v6

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result v6

    neg-float v8, v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, v12

    invoke-static/range {v6 .. v11}, Lm0/O0;->q([FFFFILjava/lang/Object;)V

    invoke-static {v3, v12}, Lm0/O0;->n([F[F)V

    iget-object v3, p0, Landroidx/compose/ui/platform/u0;->h:[F

    invoke-static {v4, v5, v4}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v12

    invoke-virtual {v0}, Lp0/c;->x()F

    move-result v7

    invoke-virtual {v0}, Lp0/c;->y()F

    move-result v8

    move-object v6, v12

    invoke-static/range {v6 .. v11}, Lm0/O0;->q([FFFFILjava/lang/Object;)V

    invoke-virtual {v0}, Lp0/c;->p()F

    move-result v6

    invoke-static {v12, v6}, Lm0/O0;->i([FF)V

    invoke-virtual {v0}, Lp0/c;->q()F

    move-result v6

    invoke-static {v12, v6}, Lm0/O0;->j([FF)V

    invoke-virtual {v0}, Lp0/c;->r()F

    move-result v6

    invoke-static {v12, v6}, Lm0/O0;->k([FF)V

    invoke-virtual {v0}, Lp0/c;->s()F

    move-result v7

    invoke-virtual {v0}, Lp0/c;->t()F

    move-result v8

    move-object v6, v12

    invoke-static/range {v6 .. v11}, Lm0/O0;->m([FFFFILjava/lang/Object;)V

    invoke-static {v3, v12}, Lm0/O0;->n([F[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->h:[F

    invoke-static {v4, v5, v4}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v3

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v7

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result v8

    move-object v6, v3

    invoke-static/range {v6 .. v11}, Lm0/O0;->q([FFFFILjava/lang/Object;)V

    invoke-static {v0, v3}, Lm0/O0;->n([F[F)V

    return-void
.end method

.method private final s()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->p:Lm0/Q0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-static {v1, v0}, Lp0/e;->b(Lp0/c;Lm0/Q0;)V

    instance-of v0, v0, Lm0/Q0$a;

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->e:Lmh/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_1
    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->o()[F

    move-result-object v0

    invoke-static {p1, v0}, Lm0/O0;->n([F[F)V

    return-void
.end method

.method public b(J)Z
    .locals 7

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v2

    iget-object p1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Lp0/c;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Lp0/c;->n()Lm0/Q0;

    move-result-object v0

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/m1;->c(Lm0/Q0;FFLm0/U0;Lm0/U0;ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public c(Landroidx/compose/ui/graphics/d;)V
    .locals 6

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->z()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/u0;->n:I

    or-int/2addr v0, v1

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->v()LY0/t;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/u0;->l:LY0/t;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->s()LY0/d;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/u0;->k:LY0/d;

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->t1()J

    move-result-wide v2

    iput-wide v2, p0, Landroidx/compose/ui/platform/u0;->o:J

    :cond_0
    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->n()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->X(F)V

    :cond_1
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->K()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->Y(F)V

    :cond_2
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->b()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->J(F)V

    :cond_3
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_4

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->F()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->d0(F)V

    :cond_4
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_5

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->C()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->e0(F)V

    :cond_5
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_6

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->Z(F)V

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_6

    iget-boolean v2, p0, Landroidx/compose/ui/platform/u0;->s:Z

    if-nez v2, :cond_6

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->e:Lmh/a;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_6
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_7

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->p()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lp0/c;->K(J)V

    :cond_7
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_8

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->M()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lp0/c;->b0(J)V

    :cond_8
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_9

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->w()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->V(F)V

    :cond_9
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_a

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->H()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->T(F)V

    :cond_a
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_b

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->u()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->U(F)V

    :cond_b
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_c

    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->E()F

    move-result v3

    invoke-virtual {v2, v3}, Lp0/c;->L(F)V

    :cond_c
    if-eqz v1, :cond_e

    iget-wide v1, p0, Landroidx/compose/ui/platform/u0;->o:J

    sget-object v3, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    sget-object v2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v2}, Ll0/g$a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lp0/c;->P(J)V

    goto :goto_0

    :cond_d
    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    iget-wide v2, p0, Landroidx/compose/ui/platform/u0;->o:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v2

    iget-wide v3, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    iget-wide v3, p0, Landroidx/compose/ui/platform/u0;->o:J

    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v3

    iget-wide v4, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v4, v5}, LY0/r;->f(J)I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v2, v3}, Ll0/h;->a(FF)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lp0/c;->P(J)V

    :cond_e
    :goto_0
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_f

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->q()Z

    move-result v2

    invoke-virtual {v1, v2}, Lp0/c;->M(Z)V

    :cond_f
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->B()Lm0/d1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp0/c;->S(Lm0/d1;)V

    :cond_10
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->r()I

    move-result v2

    sget-object v3, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v4

    if-eqz v4, :cond_11

    sget-object v2, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v2}, Lp0/b$a;->a()I

    move-result v2

    goto :goto_1

    :cond_11
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/a$a;->c()I

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v2, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v2}, Lp0/b$a;->c()I

    move-result v2

    goto :goto_1

    :cond_12
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/a$a;->b()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v2

    if-eqz v2, :cond_13

    sget-object v2, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v2}, Lp0/b$a;->b()I

    move-result v2

    :goto_1
    invoke-virtual {v1, v2}, Lp0/c;->N(I)V

    goto :goto_2

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not supported composition strategy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    :goto_2
    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->p:Lm0/Q0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->A()Lm0/Q0;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->A()Lm0/Q0;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/u0;->p:Lm0/Q0;

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->s()V

    const/4 v1, 0x1

    goto :goto_3

    :cond_15
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->z()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/platform/u0;->n:I

    if-nez v0, :cond_16

    if-eqz v1, :cond_17

    :cond_16
    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->q()V

    :cond_17
    return-void
.end method

.method public d(Lm0/n0;Lp0/c;)V
    .locals 7

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/u0;->j()V

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v0}, Lp0/c;->u()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Landroidx/compose/ui/platform/u0;->s:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->m:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v0, p2}, Lo0/d;->h(Lp0/c;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/u0;->m:Lo0/a;

    iget-object p2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-static {p1, p2}, Lp0/e;->a(Lo0/f;Lp0/c;)V

    goto/16 :goto_2

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p2}, Lp0/c;->w()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result p2

    int-to-float p2, p2

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v1}, Lp0/c;->w()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v1

    int-to-float v6, v1

    iget-wide v1, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    int-to-float v1, v1

    add-float v3, p2, v1

    iget-wide v1, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result v1

    int-to-float v1, v1

    add-float v4, v6, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v1}, Lp0/c;->i()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_3

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->r:Lm0/S0;

    if-nez v1, :cond_2

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/u0;->r:Lm0/S0;

    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v2}, Lp0/c;->i()F

    move-result v2

    invoke-interface {v1, v2}, Lm0/S0;->a(F)V

    invoke-interface {v1}, Lm0/S0;->x()Landroid/graphics/Paint;

    move-result-object v5

    move v1, p2

    move v2, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lm0/n0;->j()V

    :goto_1
    invoke-interface {p1, p2, v6}, Lm0/n0;->c(FF)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->o()[F

    move-result-object p2

    invoke-interface {p1, p2}, Lm0/n0;->n([F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {p2}, Lp0/c;->k()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/u0;->m(Lm0/n0;)V

    :cond_4
    iget-object p2, p0, Landroidx/compose/ui/platform/u0;->d:Lmh/p;

    if-eqz p2, :cond_5

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {p1}, Lm0/n0;->r()V

    :goto_2
    return-void
.end method

.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/u0;->d:Lmh/p;

    iput-object v0, p0, Landroidx/compose/ui/platform/u0;->e:Lmh/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/u0;->g:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/u0;->p(Z)V

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->b:Lm0/H0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-interface {v0, v1}, Lm0/H0;->a(Lp0/c;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->c:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/r;->J0(LE0/l0;)Z

    :cond_0
    return-void
.end method

.method public e(JZ)J
    .locals 0

    if-eqz p3, :cond_1

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->n()[F

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->o()[F

    move-result-object p3

    invoke-static {p3, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public f(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {p1, p2, v0, v1}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-virtual {p0}, Landroidx/compose/ui/platform/u0;->invalidate()V

    :cond_0
    return-void
.end method

.method public g(Lmh/p;Lmh/a;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->b:Lm0/H0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v1}, Lp0/c;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lm0/H0;->b()Lp0/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/u0;->g:Z

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->d:Lmh/p;

    iput-object p2, p0, Landroidx/compose/ui/platform/u0;->e:Lmh/a;

    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/u0;->o:J

    iput-boolean v0, p0, Landroidx/compose/ui/platform/u0;->s:Z

    const p1, 0x7fffffff

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/u0;->f:J

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/u0;->p:Lm0/Q0;

    iput v0, p0, Landroidx/compose/ui/platform/u0;->n:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "layer should have been released before reuse"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "currently reuse is only supported when we manage the layer lifecycle"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h([F)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->n()[F

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Lm0/O0;->n([F[F)V

    :cond_0
    return-void
.end method

.method public i(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v0, p1, p2}, Lp0/c;->c0(J)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->q()V

    return-void
.end method

.method public invalidate()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/u0;->j:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/ui/platform/u0;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->c:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/u0;->p(Z)V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 9

    iget-boolean v0, p0, Landroidx/compose/ui/platform/u0;->j:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Landroidx/compose/ui/platform/u0;->o:J

    sget-object v2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    invoke-virtual {v0}, Lp0/c;->v()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v0, v1, v2, v3}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    iget-wide v1, p0, Landroidx/compose/ui/platform/u0;->o:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v1

    iget-wide v2, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    iget-wide v2, p0, Landroidx/compose/ui/platform/u0;->o:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v2

    iget-wide v3, p0, Landroidx/compose/ui/platform/u0;->f:J

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ll0/h;->a(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lp0/c;->P(J)V

    :cond_0
    iget-object v3, p0, Landroidx/compose/ui/platform/u0;->a:Lp0/c;

    iget-object v4, p0, Landroidx/compose/ui/platform/u0;->k:LY0/d;

    iget-object v5, p0, Landroidx/compose/ui/platform/u0;->l:LY0/t;

    iget-wide v6, p0, Landroidx/compose/ui/platform/u0;->f:J

    iget-object v8, p0, Landroidx/compose/ui/platform/u0;->t:Lmh/l;

    invoke-virtual/range {v3 .. v8}, Lp0/c;->E(LY0/d;LY0/t;JLmh/l;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/u0;->p(Z)V

    :cond_1
    return-void
.end method

.method public k(Ll0/e;Z)V
    .locals 0

    if-eqz p2, :cond_1

    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->n()[F

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Ll0/e;->g(FFFF)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p1}, Lm0/O0;->g([FLl0/e;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/u0;->o()[F

    move-result-object p2

    invoke-static {p2, p1}, Lm0/O0;->g([FLl0/e;)V

    :goto_0
    return-void
.end method
