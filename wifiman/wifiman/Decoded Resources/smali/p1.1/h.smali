.class Lp1/h;
.super Lp1/m;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo1/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lp1/m;-><init>(Lo1/e;)V

    iget-object v0, p1, Lo1/e;->e:Lp1/j;

    invoke-virtual {v0}, Lp1/j;->f()V

    iget-object v0, p1, Lo1/e;->f:Lp1/l;

    invoke-virtual {v0}, Lp1/l;->f()V

    check-cast p1, Lo1/h;

    invoke-virtual {p1}, Lo1/h;->K0()I

    move-result p1

    iput p1, p0, Lp1/m;->f:I

    return-void
.end method

.method private q(Lp1/f;)V
    .locals 1

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lp1/f;->l:Ljava/util/List;

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Lp1/d;)V
    .locals 1

    iget-object p1, p0, Lp1/m;->h:Lp1/f;

    iget-boolean v0, p1, Lp1/f;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lp1/f;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Lp1/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/f;

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    check-cast v0, Lo1/h;

    iget p1, p1, Lp1/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Lo1/h;->N0()F

    move-result v0

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    invoke-virtual {v0, p1}, Lp1/f;->d(I)V

    return-void
.end method

.method d()V
    .locals 5

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    check-cast v0, Lo1/h;

    invoke-virtual {v0}, Lo1/h;->L0()I

    move-result v1

    invoke-virtual {v0}, Lo1/h;->M0()I

    move-result v2

    invoke-virtual {v0}, Lo1/h;->N0()F

    invoke-virtual {v0}, Lo1/h;->K0()I

    move-result v0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    if-eq v1, v3, :cond_0

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->l:Ljava/util/List;

    iget-object v2, p0, Lp1/m;->b:Lo1/e;

    iget-object v2, v2, Lo1/e;->N:Lo1/e;

    iget-object v2, v2, Lo1/e;->e:Lp1/j;

    iget-object v2, v2, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->N:Lo1/e;

    iget-object v0, v0, Lo1/e;->e:Lp1/j;

    iget-object v0, v0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    iget-object v2, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iput v1, v0, Lp1/f;->f:I

    goto :goto_0

    :cond_0
    if-eq v2, v3, :cond_1

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->l:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->b:Lo1/e;

    iget-object v1, v1, Lo1/e;->N:Lo1/e;

    iget-object v1, v1, Lo1/e;->e:Lp1/j;

    iget-object v1, v1, Lp1/m;->i:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->N:Lo1/e;

    iget-object v0, v0, Lo1/e;->e:Lp1/j;

    iget-object v0, v0, Lp1/m;->i:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    neg-int v1, v2

    iput v1, v0, Lp1/f;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iput-boolean v4, v0, Lp1/f;->b:Z

    iget-object v0, v0, Lp1/f;->l:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->b:Lo1/e;

    iget-object v1, v1, Lo1/e;->N:Lo1/e;

    iget-object v1, v1, Lo1/e;->e:Lp1/j;

    iget-object v1, v1, Lp1/m;->i:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->N:Lo1/e;

    iget-object v0, v0, Lo1/e;->e:Lp1/j;

    iget-object v0, v0, Lp1/m;->i:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->e:Lp1/j;

    iget-object v0, v0, Lp1/m;->h:Lp1/f;

    invoke-direct {p0, v0}, Lp1/h;->q(Lp1/f;)V

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->e:Lp1/j;

    iget-object v0, v0, Lp1/m;->i:Lp1/f;

    invoke-direct {p0, v0}, Lp1/h;->q(Lp1/f;)V

    goto/16 :goto_2

    :cond_2
    if-eq v1, v3, :cond_3

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->l:Ljava/util/List;

    iget-object v2, p0, Lp1/m;->b:Lo1/e;

    iget-object v2, v2, Lo1/e;->N:Lo1/e;

    iget-object v2, v2, Lo1/e;->f:Lp1/l;

    iget-object v2, v2, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->N:Lo1/e;

    iget-object v0, v0, Lo1/e;->f:Lp1/l;

    iget-object v0, v0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    iget-object v2, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iput v1, v0, Lp1/f;->f:I

    goto :goto_1

    :cond_3
    if-eq v2, v3, :cond_4

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iget-object v0, v0, Lp1/f;->l:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->b:Lo1/e;

    iget-object v1, v1, Lo1/e;->N:Lo1/e;

    iget-object v1, v1, Lo1/e;->f:Lp1/l;

    iget-object v1, v1, Lp1/m;->i:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->N:Lo1/e;

    iget-object v0, v0, Lo1/e;->f:Lp1/l;

    iget-object v0, v0, Lp1/m;->i:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    neg-int v1, v2

    iput v1, v0, Lp1/f;->f:I

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    iput-boolean v4, v0, Lp1/f;->b:Z

    iget-object v0, v0, Lp1/f;->l:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->b:Lo1/e;

    iget-object v1, v1, Lo1/e;->N:Lo1/e;

    iget-object v1, v1, Lo1/e;->f:Lp1/l;

    iget-object v1, v1, Lp1/m;->i:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->N:Lo1/e;

    iget-object v0, v0, Lo1/e;->f:Lp1/l;

    iget-object v0, v0, Lp1/m;->i:Lp1/f;

    iget-object v0, v0, Lp1/f;->k:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->h:Lp1/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->f:Lp1/l;

    iget-object v0, v0, Lp1/m;->h:Lp1/f;

    invoke-direct {p0, v0}, Lp1/h;->q(Lp1/f;)V

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->f:Lp1/l;

    iget-object v0, v0, Lp1/m;->i:Lp1/f;

    invoke-direct {p0, v0}, Lp1/h;->q(Lp1/f;)V

    :goto_2
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    check-cast v0, Lo1/h;

    invoke-virtual {v0}, Lo1/h;->K0()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v1, p0, Lp1/m;->h:Lp1/f;

    iget v1, v1, Lp1/f;->g:I

    invoke-virtual {v0, v1}, Lo1/e;->F0(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v1, p0, Lp1/m;->h:Lp1/f;

    iget v1, v1, Lp1/f;->g:I

    invoke-virtual {v0, v1}, Lo1/e;->G0(I)V

    :goto_0
    return-void
.end method

.method f()V
    .locals 1

    iget-object v0, p0, Lp1/m;->h:Lp1/f;

    invoke-virtual {v0}, Lp1/f;->c()V

    return-void
.end method

.method m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
