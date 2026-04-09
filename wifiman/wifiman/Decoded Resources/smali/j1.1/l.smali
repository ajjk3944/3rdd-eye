.class public abstract Lj1/l;
.super Lj1/j;
.source "SourceFile"


# instance fields
.field private M0:I

.field private N0:I

.field private O0:I

.field private P0:I

.field private Q0:I

.field private R0:I

.field private S0:I

.field private T0:I

.field private U0:Z

.field private V0:I

.field private W0:I

.field protected X0:Lk1/b$a;

.field Y0:Lk1/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj1/j;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj1/l;->M0:I

    iput v0, p0, Lj1/l;->N0:I

    iput v0, p0, Lj1/l;->O0:I

    iput v0, p0, Lj1/l;->P0:I

    iput v0, p0, Lj1/l;->Q0:I

    iput v0, p0, Lj1/l;->R0:I

    iput v0, p0, Lj1/l;->S0:I

    iput v0, p0, Lj1/l;->T0:I

    iput-boolean v0, p0, Lj1/l;->U0:Z

    iput v0, p0, Lj1/l;->V0:I

    iput v0, p0, Lj1/l;->W0:I

    new-instance v0, Lk1/b$a;

    invoke-direct {v0}, Lk1/b$a;-><init>()V

    iput-object v0, p0, Lj1/l;->X0:Lk1/b$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lj1/l;->Y0:Lk1/b$b;

    return-void
.end method


# virtual methods
.method public d1(Ljava/util/HashSet;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lj1/j;->L0:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lj1/j;->K0:[Lj1/e;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public e1()I
    .locals 1

    iget v0, p0, Lj1/l;->W0:I

    return v0
.end method

.method public f1()I
    .locals 1

    iget v0, p0, Lj1/l;->V0:I

    return v0
.end method

.method public g1()I
    .locals 1

    iget v0, p0, Lj1/l;->N0:I

    return v0
.end method

.method public h1()I
    .locals 1

    iget v0, p0, Lj1/l;->S0:I

    return v0
.end method

.method public i1()I
    .locals 1

    iget v0, p0, Lj1/l;->T0:I

    return v0
.end method

.method public j1()I
    .locals 1

    iget v0, p0, Lj1/l;->M0:I

    return v0
.end method

.method public k1(IIII)V
    .locals 0

    return-void
.end method

.method protected l1(Lj1/e;Lj1/e$b;ILj1/e$b;I)V
    .locals 1

    :goto_0
    iget-object v0, p0, Lj1/l;->Y0:Lk1/b$b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object v0

    check-cast v0, Lj1/f;

    invoke-virtual {v0}, Lj1/f;->t1()Lk1/b$b;

    move-result-object v0

    iput-object v0, p0, Lj1/l;->Y0:Lk1/b$b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj1/l;->X0:Lk1/b$a;

    iput-object p2, v0, Lk1/b$a;->a:Lj1/e$b;

    iput-object p4, v0, Lk1/b$a;->b:Lj1/e$b;

    iput p3, v0, Lk1/b$a;->c:I

    iput p5, v0, Lk1/b$a;->d:I

    iget-object p2, p0, Lj1/l;->Y0:Lk1/b$b;

    invoke-interface {p2, p1, v0}, Lk1/b$b;->b(Lj1/e;Lk1/b$a;)V

    iget-object p2, p0, Lj1/l;->X0:Lk1/b$a;

    iget p2, p2, Lk1/b$a;->e:I

    invoke-virtual {p1, p2}, Lj1/e;->U0(I)V

    iget-object p2, p0, Lj1/l;->X0:Lk1/b$a;

    iget p2, p2, Lk1/b$a;->f:I

    invoke-virtual {p1, p2}, Lj1/e;->z0(I)V

    iget-object p2, p0, Lj1/l;->X0:Lk1/b$a;

    iget-boolean p2, p2, Lk1/b$a;->h:Z

    invoke-virtual {p1, p2}, Lj1/e;->y0(Z)V

    iget-object p2, p0, Lj1/l;->X0:Lk1/b$a;

    iget p2, p2, Lk1/b$a;->g:I

    invoke-virtual {p1, p2}, Lj1/e;->o0(I)V

    return-void
.end method

.method protected m1()Z
    .locals 9

    iget-object v0, p0, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_0

    check-cast v0, Lj1/f;

    invoke-virtual {v0}, Lj1/f;->t1()Lk1/b$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    move v2, v1

    :goto_1
    iget v3, p0, Lj1/j;->L0:I

    const/4 v4, 0x1

    if-ge v2, v3, :cond_7

    iget-object v3, p0, Lj1/j;->K0:[Lj1/e;

    aget-object v3, v3, v2

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    instance-of v5, v3, Lj1/h;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v3, v1}, Lj1/e;->r(I)Lj1/e$b;

    move-result-object v5

    invoke-virtual {v3, v4}, Lj1/e;->r(I)Lj1/e$b;

    move-result-object v6

    sget-object v7, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v5, v7, :cond_4

    iget v8, v3, Lj1/e;->w:I

    if-eq v8, v4, :cond_4

    if-ne v6, v7, :cond_4

    iget v8, v3, Lj1/e;->x:I

    if-eq v8, v4, :cond_4

    goto :goto_2

    :cond_4
    if-ne v5, v7, :cond_5

    sget-object v5, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    :cond_5
    if-ne v6, v7, :cond_6

    sget-object v6, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    :cond_6
    iget-object v4, p0, Lj1/l;->X0:Lk1/b$a;

    iput-object v5, v4, Lk1/b$a;->a:Lj1/e$b;

    iput-object v6, v4, Lk1/b$a;->b:Lj1/e$b;

    invoke-virtual {v3}, Lj1/e;->O()I

    move-result v5

    iput v5, v4, Lk1/b$a;->c:I

    iget-object v4, p0, Lj1/l;->X0:Lk1/b$a;

    invoke-virtual {v3}, Lj1/e;->u()I

    move-result v5

    iput v5, v4, Lk1/b$a;->d:I

    iget-object v4, p0, Lj1/l;->X0:Lk1/b$a;

    invoke-interface {v0, v3, v4}, Lk1/b$b;->b(Lj1/e;Lk1/b$a;)V

    iget-object v4, p0, Lj1/l;->X0:Lk1/b$a;

    iget v4, v4, Lk1/b$a;->e:I

    invoke-virtual {v3, v4}, Lj1/e;->U0(I)V

    iget-object v4, p0, Lj1/l;->X0:Lk1/b$a;

    iget v4, v4, Lk1/b$a;->f:I

    invoke-virtual {v3, v4}, Lj1/e;->z0(I)V

    iget-object v4, p0, Lj1/l;->X0:Lk1/b$a;

    iget v4, v4, Lk1/b$a;->g:I

    invoke-virtual {v3, v4}, Lj1/e;->o0(I)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    return v4
.end method

.method public n1()Z
    .locals 1

    iget-boolean v0, p0, Lj1/l;->U0:Z

    return v0
.end method

.method protected o1(Z)V
    .locals 0

    iput-boolean p1, p0, Lj1/l;->U0:Z

    return-void
.end method

.method public p1(II)V
    .locals 0

    iput p1, p0, Lj1/l;->V0:I

    iput p2, p0, Lj1/l;->W0:I

    return-void
.end method

.method public q1(I)V
    .locals 0

    iput p1, p0, Lj1/l;->N0:I

    return-void
.end method

.method public r1(I)V
    .locals 0

    iput p1, p0, Lj1/l;->R0:I

    return-void
.end method

.method public s1(I)V
    .locals 0

    iput p1, p0, Lj1/l;->O0:I

    iput p1, p0, Lj1/l;->S0:I

    return-void
.end method

.method public t1(I)V
    .locals 0

    iput p1, p0, Lj1/l;->P0:I

    iput p1, p0, Lj1/l;->T0:I

    return-void
.end method

.method public u1(I)V
    .locals 0

    iput p1, p0, Lj1/l;->Q0:I

    iput p1, p0, Lj1/l;->S0:I

    iput p1, p0, Lj1/l;->T0:I

    return-void
.end method

.method public v1(I)V
    .locals 0

    iput p1, p0, Lj1/l;->M0:I

    return-void
.end method
