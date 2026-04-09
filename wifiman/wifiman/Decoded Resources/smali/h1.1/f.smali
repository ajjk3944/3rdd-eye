.class public Lh1/f;
.super Lg1/e;
.source "SourceFile"


# instance fields
.field protected A0:I

.field protected B0:I

.field protected C0:I

.field protected D0:I

.field protected E0:I

.field protected F0:I

.field protected G0:I

.field protected H0:I

.field protected I0:I

.field protected J0:I

.field protected K0:I

.field protected L0:F

.field protected M0:F

.field protected N0:F

.field protected O0:F

.field protected q0:Lj1/g;

.field protected r0:Ljava/util/HashMap;

.field protected s0:Ljava/util/HashMap;

.field protected t0:Ljava/util/HashMap;

.field protected u0:I

.field protected v0:I

.field protected w0:I

.field protected x0:I

.field protected y0:I

.field protected z0:I


# direct methods
.method public constructor <init>(Lg1/g;Lg1/g$d;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lg1/e;-><init>(Lg1/g;Lg1/g$d;)V

    const/4 p1, 0x0

    iput p1, p0, Lh1/f;->u0:I

    const/4 v0, -0x1

    iput v0, p0, Lh1/f;->v0:I

    iput v0, p0, Lh1/f;->w0:I

    iput v0, p0, Lh1/f;->x0:I

    iput v0, p0, Lh1/f;->y0:I

    iput v0, p0, Lh1/f;->z0:I

    iput v0, p0, Lh1/f;->A0:I

    const/4 v1, 0x2

    iput v1, p0, Lh1/f;->B0:I

    iput v1, p0, Lh1/f;->C0:I

    iput p1, p0, Lh1/f;->D0:I

    iput p1, p0, Lh1/f;->E0:I

    iput p1, p0, Lh1/f;->F0:I

    iput p1, p0, Lh1/f;->G0:I

    iput p1, p0, Lh1/f;->H0:I

    iput p1, p0, Lh1/f;->I0:I

    iput v0, p0, Lh1/f;->J0:I

    iput p1, p0, Lh1/f;->K0:I

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lh1/f;->L0:F

    iput p1, p0, Lh1/f;->M0:F

    iput p1, p0, Lh1/f;->N0:F

    iput p1, p0, Lh1/f;->O0:F

    sget-object p1, Lg1/g$d;->VERTICAL_FLOW:Lg1/g$d;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lh1/f;->K0:I

    :cond_0
    return-void
.end method


# virtual methods
.method public A0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->w0:I

    return-void
.end method

.method public B0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->C0:I

    return-void
.end method

.method public C0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->E0:I

    return-void
.end method

.method public D0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->y0:I

    return-void
.end method

.method public E0(F)V
    .locals 0

    iput p1, p0, Lh1/f;->O0:F

    return-void
.end method

.method public F0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->A0:I

    return-void
.end method

.method public G0(F)V
    .locals 0

    iput p1, p0, Lh1/f;->M0:F

    return-void
.end method

.method public H0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->x0:I

    return-void
.end method

.method public I0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->J0:I

    return-void
.end method

.method public J0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->K0:I

    return-void
.end method

.method public K0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->I0:I

    return-void
.end method

.method public L0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->F0:I

    return-void
.end method

.method public M0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->G0:I

    return-void
.end method

.method public N0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->H0:I

    return-void
.end method

.method public O0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->B0:I

    return-void
.end method

.method public P0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->D0:I

    return-void
.end method

.method public Q0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->v0:I

    return-void
.end method

.method public R0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->u0:I

    return-void
.end method

.method public apply()V
    .locals 4

    invoke-virtual {p0}, Lh1/f;->u0()Lj1/j;

    iget-object v0, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {p0, v0}, Lg1/a;->d(Lj1/e;)V

    iget-object v0, p0, Lh1/f;->q0:Lj1/g;

    iget v1, p0, Lh1/f;->K0:I

    invoke-virtual {v0, v1}, Lj1/g;->k2(I)V

    iget-object v0, p0, Lh1/f;->q0:Lj1/g;

    iget v1, p0, Lh1/f;->u0:I

    invoke-virtual {v0, v1}, Lj1/g;->p2(I)V

    iget v0, p0, Lh1/f;->J0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->j2(I)V

    :cond_0
    iget v0, p0, Lh1/f;->F0:I

    if-eqz v0, :cond_1

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/l;->s1(I)V

    :cond_1
    iget v0, p0, Lh1/f;->H0:I

    if-eqz v0, :cond_2

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/l;->v1(I)V

    :cond_2
    iget v0, p0, Lh1/f;->G0:I

    if-eqz v0, :cond_3

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/l;->t1(I)V

    :cond_3
    iget v0, p0, Lh1/f;->I0:I

    if-eqz v0, :cond_4

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/l;->q1(I)V

    :cond_4
    iget v0, p0, Lh1/f;->E0:I

    if-eqz v0, :cond_5

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->d2(I)V

    :cond_5
    iget v0, p0, Lh1/f;->D0:I

    if-eqz v0, :cond_6

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->n2(I)V

    :cond_6
    iget v0, p0, Lg1/a;->i:F

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_7

    iget-object v3, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v3, v0}, Lj1/g;->c2(F)V

    :cond_7
    iget v0, p0, Lh1/f;->N0:F

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_8

    iget-object v3, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v3, v0}, Lj1/g;->X1(F)V

    :cond_8
    iget v0, p0, Lh1/f;->O0:F

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_9

    iget-object v3, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v3, v0}, Lj1/g;->f2(F)V

    :cond_9
    iget v0, p0, Lg1/a;->j:F

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_a

    iget-object v3, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v3, v0}, Lj1/g;->m2(F)V

    :cond_a
    iget v0, p0, Lh1/f;->L0:F

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_b

    iget-object v3, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v3, v0}, Lj1/g;->Z1(F)V

    :cond_b
    iget v0, p0, Lh1/f;->M0:F

    cmpl-float v2, v0, v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->h2(F)V

    :cond_c
    iget v0, p0, Lh1/f;->C0:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_d

    iget-object v3, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v3, v0}, Lj1/g;->b2(I)V

    :cond_d
    iget v0, p0, Lh1/f;->B0:I

    if-eq v0, v2, :cond_e

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->l2(I)V

    :cond_e
    iget v0, p0, Lh1/f;->v0:I

    if-eq v0, v1, :cond_f

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->o2(I)V

    :cond_f
    iget v0, p0, Lh1/f;->w0:I

    if-eq v0, v1, :cond_10

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->a2(I)V

    :cond_10
    iget v0, p0, Lh1/f;->x0:I

    if-eq v0, v1, :cond_11

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->i2(I)V

    :cond_11
    iget v0, p0, Lh1/f;->y0:I

    if-eq v0, v1, :cond_12

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->e2(I)V

    :cond_12
    iget v0, p0, Lh1/f;->z0:I

    if-eq v0, v1, :cond_13

    iget-object v2, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v2, v0}, Lj1/g;->Y1(I)V

    :cond_13
    iget v0, p0, Lh1/f;->A0:I

    if-eq v0, v1, :cond_14

    iget-object v1, p0, Lh1/f;->q0:Lj1/g;

    invoke-virtual {v1, v0}, Lj1/g;->g2(I)V

    :cond_14
    invoke-virtual {p0}, Lg1/e;->t0()V

    return-void
.end method

.method public u0()Lj1/j;
    .locals 1

    iget-object v0, p0, Lh1/f;->q0:Lj1/g;

    if-nez v0, :cond_0

    new-instance v0, Lj1/g;

    invoke-direct {v0}, Lj1/g;-><init>()V

    iput-object v0, p0, Lh1/f;->q0:Lj1/g;

    :cond_0
    iget-object v0, p0, Lh1/f;->q0:Lj1/g;

    return-object v0
.end method

.method public w0(Ljava/lang/String;FFF)V
    .locals 1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, v0}, Lg1/e;->s0([Ljava/lang/Object;)Lg1/e;

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lh1/f;->r0:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh1/f;->r0:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lh1/f;->r0:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lh1/f;->s0:Ljava/util/HashMap;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lh1/f;->s0:Ljava/util/HashMap;

    :cond_2
    iget-object p2, p0, Lh1/f;->s0:Ljava/util/HashMap;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lh1/f;->t0:Ljava/util/HashMap;

    if-nez p2, :cond_4

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lh1/f;->t0:Ljava/util/HashMap;

    :cond_4
    iget-object p2, p0, Lh1/f;->t0:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method public x0(F)V
    .locals 0

    iput p1, p0, Lh1/f;->N0:F

    return-void
.end method

.method public y0(I)V
    .locals 0

    iput p1, p0, Lh1/f;->z0:I

    return-void
.end method

.method public z0(F)V
    .locals 0

    iput p1, p0, Lh1/f;->L0:F

    return-void
.end method
