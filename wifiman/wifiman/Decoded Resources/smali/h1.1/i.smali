.class public Lh1/i;
.super Lh1/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lg1/g;)V
    .locals 1

    sget-object v0, Lg1/g$d;->HORIZONTAL_CHAIN:Lg1/g$d;

    invoke-direct {p0, p1, v0}, Lh1/d;-><init>(Lg1/g;Lg1/g$d;)V

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 9

    iget-object v0, p0, Lg1/e;->o0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/e;->m0:Lg1/g;

    invoke-virtual {v2, v1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v1

    invoke-virtual {v1}, Lg1/a;->u()Lg1/a;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg1/e;->o0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lg1/e;->m0:Lg1/g;

    invoke-virtual {v4, v3}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v4

    if-nez v2, :cond_5

    iget-object v2, p0, Lg1/a;->O:Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-virtual {v4, v2}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->m:I

    invoke-virtual {v2, v5}, Lg1/a;->J(I)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->s:I

    invoke-virtual {v2, v5}, Lg1/a;->L(I)Lg1/a;

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lg1/a;->P:Ljava/lang/Object;

    if-eqz v2, :cond_2

    invoke-virtual {v4, v2}, Lg1/a;->h0(Ljava/lang/Object;)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->m:I

    invoke-virtual {v2, v5}, Lg1/a;->J(I)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->s:I

    invoke-virtual {v2, v5}, Lg1/a;->L(I)Lg1/a;

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lg1/a;->K:Ljava/lang/Object;

    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->k:I

    invoke-virtual {v2, v5}, Lg1/a;->J(I)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->q:I

    invoke-virtual {v2, v5}, Lg1/a;->L(I)Lg1/a;

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lg1/a;->L:Ljava/lang/Object;

    if-eqz v2, :cond_4

    invoke-virtual {v4, v2}, Lg1/a;->h0(Ljava/lang/Object;)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->k:I

    invoke-virtual {v2, v5}, Lg1/a;->J(I)Lg1/a;

    move-result-object v2

    iget v5, p0, Lg1/a;->q:I

    invoke-virtual {v2, v5}, Lg1/a;->L(I)Lg1/a;

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v4, v5}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    move-result-object v5

    invoke-virtual {p0, v2}, Lh1/d;->B0(Ljava/lang/String;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v5, v6}, Lg1/a;->K(Ljava/lang/Object;)Lg1/a;

    move-result-object v5

    invoke-virtual {p0, v2}, Lh1/d;->A0(Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v2}, Lg1/a;->M(Ljava/lang/Object;)Lg1/a;

    :goto_2
    move-object v2, v4

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v7}, Lg1/a;->A(Ljava/lang/Object;)Lg1/a;

    move-result-object v7

    invoke-virtual {p0, v5}, Lh1/d;->z0(Ljava/lang/String;)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v7, v8}, Lg1/a;->K(Ljava/lang/Object;)Lg1/a;

    move-result-object v7

    invoke-virtual {p0, v5}, Lh1/d;->y0(Ljava/lang/String;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v7, v5}, Lg1/a;->M(Ljava/lang/Object;)Lg1/a;

    invoke-virtual {v1}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Lg1/a;->h0(Ljava/lang/Object;)Lg1/a;

    move-result-object v1

    invoke-virtual {p0, v6}, Lh1/d;->B0(Ljava/lang/String;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v1, v5}, Lg1/a;->K(Ljava/lang/Object;)Lg1/a;

    move-result-object v1

    invoke-virtual {p0, v6}, Lh1/d;->A0(Ljava/lang/String;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v1, v5}, Lg1/a;->M(Ljava/lang/Object;)Lg1/a;

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lh1/d;->C0(Ljava/lang/String;)F

    move-result v1

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_7

    invoke-virtual {v4, v1}, Lg1/a;->a0(F)V

    :cond_7
    move-object v1, v4

    goto/16 :goto_1

    :cond_8
    if-eqz v1, :cond_d

    iget-object v0, p0, Lg1/a;->Q:Ljava/lang/Object;

    if-eqz v0, :cond_9

    invoke-virtual {v1, v0}, Lg1/a;->A(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->n:I

    invoke-virtual {v0, v1}, Lg1/a;->J(I)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->t:I

    invoke-virtual {v0, v1}, Lg1/a;->L(I)Lg1/a;

    goto :goto_3

    :cond_9
    iget-object v0, p0, Lg1/a;->R:Ljava/lang/Object;

    if-eqz v0, :cond_a

    invoke-virtual {v1, v0}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->n:I

    invoke-virtual {v0, v1}, Lg1/a;->J(I)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->t:I

    invoke-virtual {v0, v1}, Lg1/a;->L(I)Lg1/a;

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lg1/a;->M:Ljava/lang/Object;

    if-eqz v0, :cond_b

    invoke-virtual {v1, v0}, Lg1/a;->A(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->l:I

    invoke-virtual {v0, v1}, Lg1/a;->J(I)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->r:I

    invoke-virtual {v0, v1}, Lg1/a;->L(I)Lg1/a;

    goto :goto_3

    :cond_b
    iget-object v0, p0, Lg1/a;->N:Ljava/lang/Object;

    if-eqz v0, :cond_c

    invoke-virtual {v1, v0}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->l:I

    invoke-virtual {v0, v1}, Lg1/a;->J(I)Lg1/a;

    move-result-object v0

    iget v1, p0, Lg1/a;->r:I

    invoke-virtual {v0, v1}, Lg1/a;->L(I)Lg1/a;

    goto :goto_3

    :cond_c
    invoke-virtual {v1}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v1, v3}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    move-result-object v1

    invoke-virtual {p0, v0}, Lh1/d;->z0(Ljava/lang/String;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Lg1/a;->K(Ljava/lang/Object;)Lg1/a;

    move-result-object v1

    invoke-virtual {p0, v0}, Lh1/d;->y0(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Lg1/a;->M(Ljava/lang/Object;)Lg1/a;

    :cond_d
    :goto_3
    if-nez v2, :cond_e

    return-void

    :cond_e
    iget v0, p0, Lh1/d;->q0:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_f

    invoke-virtual {v2, v0}, Lg1/a;->F(F)Lg1/a;

    :cond_f
    sget-object v0, Lh1/i$a;->a:[I

    iget-object v1, p0, Lh1/d;->w0:Lg1/g$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_12

    const/4 v3, 0x2

    if-eq v0, v3, :cond_11

    const/4 v1, 0x3

    if-eq v0, v1, :cond_10

    goto :goto_4

    :cond_10
    invoke-virtual {v2, v3}, Lg1/a;->Z(I)V

    goto :goto_4

    :cond_11
    invoke-virtual {v2, v1}, Lg1/a;->Z(I)V

    goto :goto_4

    :cond_12
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lg1/a;->Z(I)V

    :goto_4
    return-void
.end method
