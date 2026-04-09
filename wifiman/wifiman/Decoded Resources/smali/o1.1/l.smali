.class public abstract Lo1/l;
.super Lo1/j;
.source "SourceFile"


# instance fields
.field private A0:I

.field private B0:I

.field private C0:I

.field private D0:I

.field private E0:I

.field private F0:I

.field private G0:Z

.field private H0:I

.field private I0:I

.field protected J0:Lp1/b$a;

.field K0:Lp1/b$b;

.field private y0:I

.field private z0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo1/j;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo1/l;->y0:I

    iput v0, p0, Lo1/l;->z0:I

    iput v0, p0, Lo1/l;->A0:I

    iput v0, p0, Lo1/l;->B0:I

    iput v0, p0, Lo1/l;->C0:I

    iput v0, p0, Lo1/l;->D0:I

    iput v0, p0, Lo1/l;->E0:I

    iput v0, p0, Lo1/l;->F0:I

    iput-boolean v0, p0, Lo1/l;->G0:Z

    iput v0, p0, Lo1/l;->H0:I

    iput v0, p0, Lo1/l;->I0:I

    new-instance v0, Lp1/b$a;

    invoke-direct {v0}, Lp1/b$a;-><init>()V

    iput-object v0, p0, Lo1/l;->J0:Lp1/b$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lo1/l;->K0:Lp1/b$b;

    return-void
.end method


# virtual methods
.method public K0(Z)V
    .locals 2

    iget v0, p0, Lo1/l;->C0:I

    if-gtz v0, :cond_0

    iget v1, p0, Lo1/l;->D0:I

    if-lez v1, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    iget p1, p0, Lo1/l;->D0:I

    iput p1, p0, Lo1/l;->E0:I

    iput v0, p0, Lo1/l;->F0:I

    goto :goto_0

    :cond_1
    iput v0, p0, Lo1/l;->E0:I

    iget p1, p0, Lo1/l;->D0:I

    iput p1, p0, Lo1/l;->F0:I

    :cond_2
    :goto_0
    return-void
.end method

.method public L0()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lo1/j;->x0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lo1/j;->w0:[Lo1/e;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lo1/e;->q0(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public M0()I
    .locals 1

    iget v0, p0, Lo1/l;->I0:I

    return v0
.end method

.method public N0()I
    .locals 1

    iget v0, p0, Lo1/l;->H0:I

    return v0
.end method

.method public O0()I
    .locals 1

    iget v0, p0, Lo1/l;->z0:I

    return v0
.end method

.method public P0()I
    .locals 1

    iget v0, p0, Lo1/l;->E0:I

    return v0
.end method

.method public Q0()I
    .locals 1

    iget v0, p0, Lo1/l;->F0:I

    return v0
.end method

.method public R0()I
    .locals 1

    iget v0, p0, Lo1/l;->y0:I

    return v0
.end method

.method public abstract S0(IIII)V
.end method

.method protected T0(Lo1/e;Lo1/e$b;ILo1/e$b;I)V
    .locals 1

    :goto_0
    iget-object v0, p0, Lo1/l;->K0:Lp1/b$b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo1/e;->G()Lo1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo1/e;->G()Lo1/e;

    move-result-object v0

    check-cast v0, Lo1/f;

    invoke-virtual {v0}, Lo1/f;->U0()Lp1/b$b;

    move-result-object v0

    iput-object v0, p0, Lo1/l;->K0:Lp1/b$b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo1/l;->J0:Lp1/b$a;

    iput-object p2, v0, Lp1/b$a;->a:Lo1/e$b;

    iput-object p4, v0, Lp1/b$a;->b:Lo1/e$b;

    iput p3, v0, Lp1/b$a;->c:I

    iput p5, v0, Lp1/b$a;->d:I

    iget-object p2, p0, Lo1/l;->K0:Lp1/b$b;

    invoke-interface {p2, p1, v0}, Lp1/b$b;->b(Lo1/e;Lp1/b$a;)V

    iget-object p2, p0, Lo1/l;->J0:Lp1/b$a;

    iget p2, p2, Lp1/b$a;->e:I

    invoke-virtual {p1, p2}, Lo1/e;->E0(I)V

    iget-object p2, p0, Lo1/l;->J0:Lp1/b$a;

    iget p2, p2, Lp1/b$a;->f:I

    invoke-virtual {p1, p2}, Lo1/e;->h0(I)V

    iget-object p2, p0, Lo1/l;->J0:Lp1/b$a;

    iget-boolean p2, p2, Lp1/b$a;->h:Z

    invoke-virtual {p1, p2}, Lo1/e;->g0(Z)V

    iget-object p2, p0, Lo1/l;->J0:Lp1/b$a;

    iget p2, p2, Lp1/b$a;->g:I

    invoke-virtual {p1, p2}, Lo1/e;->b0(I)V

    return-void
.end method

.method protected U0()Z
    .locals 9

    iget-object v0, p0, Lo1/e;->N:Lo1/e;

    if-eqz v0, :cond_0

    check-cast v0, Lo1/f;

    invoke-virtual {v0}, Lo1/f;->U0()Lp1/b$b;

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
    iget v3, p0, Lo1/j;->x0:I

    const/4 v4, 0x1

    if-ge v2, v3, :cond_7

    iget-object v3, p0, Lo1/j;->w0:[Lo1/e;

    aget-object v3, v3, v2

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    instance-of v5, v3, Lo1/h;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v3, v1}, Lo1/e;->s(I)Lo1/e$b;

    move-result-object v5

    invoke-virtual {v3, v4}, Lo1/e;->s(I)Lo1/e$b;

    move-result-object v6

    sget-object v7, Lo1/e$b;->MATCH_CONSTRAINT:Lo1/e$b;

    if-ne v5, v7, :cond_4

    iget v8, v3, Lo1/e;->l:I

    if-eq v8, v4, :cond_4

    if-ne v6, v7, :cond_4

    iget v8, v3, Lo1/e;->m:I

    if-eq v8, v4, :cond_4

    goto :goto_2

    :cond_4
    if-ne v5, v7, :cond_5

    sget-object v5, Lo1/e$b;->WRAP_CONTENT:Lo1/e$b;

    :cond_5
    if-ne v6, v7, :cond_6

    sget-object v6, Lo1/e$b;->WRAP_CONTENT:Lo1/e$b;

    :cond_6
    iget-object v4, p0, Lo1/l;->J0:Lp1/b$a;

    iput-object v5, v4, Lp1/b$a;->a:Lo1/e$b;

    iput-object v6, v4, Lp1/b$a;->b:Lo1/e$b;

    invoke-virtual {v3}, Lo1/e;->P()I

    move-result v5

    iput v5, v4, Lp1/b$a;->c:I

    iget-object v4, p0, Lo1/l;->J0:Lp1/b$a;

    invoke-virtual {v3}, Lo1/e;->v()I

    move-result v5

    iput v5, v4, Lp1/b$a;->d:I

    iget-object v4, p0, Lo1/l;->J0:Lp1/b$a;

    invoke-interface {v0, v3, v4}, Lp1/b$b;->b(Lo1/e;Lp1/b$a;)V

    iget-object v4, p0, Lo1/l;->J0:Lp1/b$a;

    iget v4, v4, Lp1/b$a;->e:I

    invoke-virtual {v3, v4}, Lo1/e;->E0(I)V

    iget-object v4, p0, Lo1/l;->J0:Lp1/b$a;

    iget v4, v4, Lp1/b$a;->f:I

    invoke-virtual {v3, v4}, Lo1/e;->h0(I)V

    iget-object v4, p0, Lo1/l;->J0:Lp1/b$a;

    iget v4, v4, Lp1/b$a;->g:I

    invoke-virtual {v3, v4}, Lo1/e;->b0(I)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    return v4
.end method

.method public V0()Z
    .locals 1

    iget-boolean v0, p0, Lo1/l;->G0:Z

    return v0
.end method

.method protected W0(Z)V
    .locals 0

    iput-boolean p1, p0, Lo1/l;->G0:Z

    return-void
.end method

.method public X0(II)V
    .locals 0

    iput p1, p0, Lo1/l;->H0:I

    iput p2, p0, Lo1/l;->I0:I

    return-void
.end method

.method public Y0(I)V
    .locals 0

    iput p1, p0, Lo1/l;->A0:I

    iput p1, p0, Lo1/l;->y0:I

    iput p1, p0, Lo1/l;->B0:I

    iput p1, p0, Lo1/l;->z0:I

    iput p1, p0, Lo1/l;->C0:I

    iput p1, p0, Lo1/l;->D0:I

    return-void
.end method

.method public Z0(I)V
    .locals 0

    iput p1, p0, Lo1/l;->z0:I

    return-void
.end method

.method public a1(I)V
    .locals 0

    iput p1, p0, Lo1/l;->D0:I

    return-void
.end method

.method public b1(I)V
    .locals 0

    iput p1, p0, Lo1/l;->A0:I

    iput p1, p0, Lo1/l;->E0:I

    return-void
.end method

.method public c(Lo1/f;)V
    .locals 0

    invoke-virtual {p0}, Lo1/l;->L0()V

    return-void
.end method

.method public c1(I)V
    .locals 0

    iput p1, p0, Lo1/l;->B0:I

    iput p1, p0, Lo1/l;->F0:I

    return-void
.end method

.method public d1(I)V
    .locals 0

    iput p1, p0, Lo1/l;->C0:I

    iput p1, p0, Lo1/l;->E0:I

    iput p1, p0, Lo1/l;->F0:I

    return-void
.end method

.method public e1(I)V
    .locals 0

    iput p1, p0, Lo1/l;->y0:I

    return-void
.end method
