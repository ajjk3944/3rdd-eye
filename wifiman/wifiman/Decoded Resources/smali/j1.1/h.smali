.class public Lj1/h;
.super Lj1/e;
.source "SourceFile"


# instance fields
.field protected K0:F

.field protected L0:I

.field protected M0:I

.field protected N0:Z

.field private O0:Lj1/d;

.field private P0:I

.field private Q0:I

.field private R0:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lj1/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lj1/h;->K0:F

    const/4 v0, -0x1

    iput v0, p0, Lj1/h;->L0:I

    iput v0, p0, Lj1/h;->M0:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1/h;->N0:Z

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    iput-object v0, p0, Lj1/h;->O0:Lj1/d;

    const/4 v0, 0x0

    iput v0, p0, Lj1/h;->P0:I

    iput v0, p0, Lj1/h;->Q0:I

    iget-object v1, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lj1/e;->V:[Lj1/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lj1/e;->V:[Lj1/d;

    iget-object v3, p0, Lj1/h;->O0:Lj1/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public Z0(Lc1/d;Z)V
    .locals 2

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p1, p2}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lj1/h;->P0:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, Lj1/e;->V0(I)V

    invoke-virtual {p0, v1}, Lj1/e;->W0(I)V

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object p1

    invoke-virtual {p1}, Lj1/e;->u()I

    move-result p1

    invoke-virtual {p0, p1}, Lj1/e;->z0(I)V

    invoke-virtual {p0, v1}, Lj1/e;->U0(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Lj1/e;->V0(I)V

    invoke-virtual {p0, p1}, Lj1/e;->W0(I)V

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object p1

    invoke-virtual {p1}, Lj1/e;->O()I

    move-result p1

    invoke-virtual {p0, p1}, Lj1/e;->U0(I)V

    invoke-virtual {p0, v1}, Lj1/e;->z0(I)V

    :goto_0
    return-void
.end method

.method public a1()Lj1/d;
    .locals 1

    iget-object v0, p0, Lj1/h;->O0:Lj1/d;

    return-object v0
.end method

.method public b1()I
    .locals 1

    iget v0, p0, Lj1/h;->P0:I

    return v0
.end method

.method public c1()I
    .locals 1

    iget v0, p0, Lj1/h;->L0:I

    return v0
.end method

.method public d(Lc1/d;Z)V
    .locals 7

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object p2

    check-cast p2, Lj1/f;

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object v0, Lj1/d$a;->LEFT:Lj1/d$a;

    invoke-virtual {p2, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v0

    sget-object v1, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-virtual {p2, v1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v1

    iget-object v2, p0, Lj1/e;->Z:Lj1/e;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, Lj1/e;->Y:[Lj1/e$b;

    aget-object v2, v2, v4

    sget-object v5, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-ne v2, v5, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v5, p0, Lj1/h;->P0:I

    if-nez v5, :cond_3

    sget-object v0, Lj1/d$a;->TOP:Lj1/d$a;

    invoke-virtual {p2, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v0

    sget-object v1, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {p2, v1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v1

    iget-object p2, p0, Lj1/e;->Z:Lj1/e;

    if-eqz p2, :cond_2

    iget-object p2, p2, Lj1/e;->Y:[Lj1/e$b;

    aget-object p2, p2, v3

    sget-object v2, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    move v2, v3

    :cond_3
    iget-boolean p2, p0, Lj1/h;->R0:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p2}, Lj1/d;->n()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p1, p2}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object p2

    iget-object v6, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {v6}, Lj1/d;->e()I

    move-result v6

    invoke-virtual {p1, p2, v6}, Lc1/d;->f(Lc1/i;I)V

    iget v6, p0, Lj1/h;->L0:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_2

    :cond_4
    iget v6, p0, Lj1/h;->M0:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v1

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_5
    :goto_2
    iput-boolean v4, p0, Lj1/h;->R0:Z

    return-void

    :cond_6
    iget p2, p0, Lj1/h;->L0:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    iget-object p2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p1, p2}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object p2

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    iget v3, p0, Lj1/h;->L0:I

    invoke-virtual {p1, p2, v0, v3, v6}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_3

    :cond_7
    iget p2, p0, Lj1/h;->M0:I

    if-eq p2, v3, :cond_8

    iget-object p2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p1, p2}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object p2

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v1

    iget v3, p0, Lj1/h;->M0:I

    neg-int v3, v3

    invoke-virtual {p1, p2, v1, v3, v6}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_3

    :cond_8
    iget p2, p0, Lj1/h;->K0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    iget-object p2, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p1, p2}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object p2

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    iget v1, p0, Lj1/h;->K0:F

    invoke-static {p1, p2, v0, v1}, Lc1/d;->s(Lc1/d;Lc1/i;Lc1/i;F)Lc1/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc1/d;->d(Lc1/b;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public d1()I
    .locals 1

    iget v0, p0, Lj1/h;->M0:I

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Lj1/h;->R0:Z

    return v0
.end method

.method public e1()F
    .locals 1

    iget v0, p0, Lj1/h;->K0:F

    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Lj1/h;->R0:Z

    return v0
.end method

.method public f1(I)V
    .locals 1

    iget-object v0, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->t(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj1/h;->R0:Z

    return-void
.end method

.method public g1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lj1/h;->K0:F

    iput p1, p0, Lj1/h;->L0:I

    iput v0, p0, Lj1/h;->M0:I

    :cond_0
    return-void
.end method

.method public h1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lj1/h;->K0:F

    iput v0, p0, Lj1/h;->L0:I

    iput p1, p0, Lj1/h;->M0:I

    :cond_0
    return-void
.end method

.method public i1(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Lj1/h;->K0:F

    const/4 p1, -0x1

    iput p1, p0, Lj1/h;->L0:I

    iput p1, p0, Lj1/h;->M0:I

    :cond_0
    return-void
.end method

.method public j1(I)V
    .locals 3

    iget v0, p0, Lj1/h;->P0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lj1/h;->P0:I

    iget-object p1, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lj1/h;->P0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    iput-object p1, p0, Lj1/h;->O0:Lj1/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    iput-object p1, p0, Lj1/h;->O0:Lj1/d;

    :goto_0
    iget-object p1, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v0, p0, Lj1/h;->O0:Lj1/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lj1/e;->V:[Lj1/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lj1/e;->V:[Lj1/d;

    iget-object v2, p0, Lj1/h;->O0:Lj1/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public l(Lj1/d$a;)Lj1/d;
    .locals 2

    sget-object v0, Lj1/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lj1/h;->P0:I

    if-nez p1, :cond_2

    iget-object p1, p0, Lj1/h;->O0:Lj1/d;

    return-object p1

    :cond_1
    iget p1, p0, Lj1/h;->P0:I

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lj1/h;->O0:Lj1/d;

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
