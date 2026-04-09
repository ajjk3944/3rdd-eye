.class public Landroidx/transition/t;
.super Landroidx/transition/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/t$b;
    }
.end annotation


# instance fields
.field Y:Ljava/util/ArrayList;

.field private Z:Z

.field f1:I

.field g1:Z

.field private h1:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/transition/k;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/transition/t;->Z:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/t;->g1:Z

    iput v0, p0, Landroidx/transition/t;->h1:I

    return-void
.end method

.method private B0()V
    .locals 3

    new-instance v0, Landroidx/transition/t$b;

    invoke-direct {v0, p0}, Landroidx/transition/t$b;-><init>(Landroidx/transition/t;)V

    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, v0}, Landroidx/transition/k;->b(Landroidx/transition/k$f;)Landroidx/transition/k;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Landroidx/transition/t;->f1:I

    return-void
.end method

.method private s0(Landroidx/transition/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Landroidx/transition/k;->r:Landroidx/transition/t;

    return-void
.end method


# virtual methods
.method public A0(J)Landroidx/transition/t;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/transition/k;->l0(J)Landroidx/transition/k;

    move-result-object p1

    check-cast p1, Landroidx/transition/t;

    return-object p1
.end method

.method public Y(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/transition/k;->Y(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1}, Landroidx/transition/k;->Y(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic a0(Landroidx/transition/k$f;)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/transition/t;->v0(Landroidx/transition/k$f;)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Landroidx/transition/k$f;)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/transition/t;->o0(Landroidx/transition/k$f;)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Landroid/view/View;)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/transition/t;->p0(Landroid/view/View;)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c0(Landroid/view/View;)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/transition/t;->w0(Landroid/view/View;)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method protected cancel()V
    .locals 3

    invoke-super {p0}, Landroidx/transition/k;->cancel()V

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2}, Landroidx/transition/k;->cancel()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/transition/t;->o()Landroidx/transition/k;

    move-result-object v0

    return-object v0
.end method

.method public d0(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/transition/k;->d0(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1}, Landroidx/transition/k;->d0(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected f0()V
    .locals 4

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/transition/k;->m0()V

    invoke-virtual {p0}, Landroidx/transition/k;->r()V

    return-void

    :cond_0
    invoke-direct {p0}, Landroidx/transition/t;->B0()V

    iget-boolean v0, p0, Landroidx/transition/t;->Z:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    new-instance v3, Landroidx/transition/t$a;

    invoke-direct {v3, p0, v2}, Landroidx/transition/t$a;-><init>(Landroidx/transition/t;Landroidx/transition/k;)V

    invoke-virtual {v1, v3}, Landroidx/transition/k;->b(Landroidx/transition/k$f;)Landroidx/transition/k;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/k;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/transition/k;->f0()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    invoke-virtual {v1}, Landroidx/transition/k;->f0()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic g0(J)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/transition/t;->x0(J)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroidx/transition/v;)V
    .locals 3

    iget-object v0, p1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    iget-object v2, p1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Landroidx/transition/k;->h(Landroidx/transition/v;)V

    iget-object v2, p1, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public h0(Landroidx/transition/k$e;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/transition/k;->h0(Landroidx/transition/k$e;)V

    iget v0, p0, Landroidx/transition/t;->h1:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/transition/t;->h1:I

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1}, Landroidx/transition/k;->h0(Landroidx/transition/k$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic i0(Landroid/animation/TimeInterpolator;)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/transition/t;->y0(Landroid/animation/TimeInterpolator;)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method public j0(Landroidx/transition/g;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/transition/k;->j0(Landroidx/transition/g;)V

    iget v0, p0, Landroidx/transition/t;->h1:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/transition/t;->h1:I

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    invoke-virtual {v1, p1}, Landroidx/transition/k;->j0(Landroidx/transition/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method k(Landroidx/transition/v;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/transition/k;->k(Landroidx/transition/v;)V

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1}, Landroidx/transition/k;->k(Landroidx/transition/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k0(Landroidx/transition/s;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/transition/k;->k0(Landroidx/transition/s;)V

    iget v0, p0, Landroidx/transition/t;->h1:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/transition/t;->h1:I

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1}, Landroidx/transition/k;->k0(Landroidx/transition/s;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Landroidx/transition/v;)V
    .locals 3

    iget-object v0, p1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    iget-object v2, p1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Landroidx/transition/k;->l(Landroidx/transition/v;)V

    iget-object v2, p1, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic l0(J)Landroidx/transition/k;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/transition/t;->A0(J)Landroidx/transition/t;

    move-result-object p1

    return-object p1
.end method

.method n0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, Landroidx/transition/k;->n0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/k;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/transition/k;->n0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public o()Landroidx/transition/k;
    .locals 4

    invoke-super {p0}, Landroidx/transition/k;->o()Landroidx/transition/k;

    move-result-object v0

    check-cast v0, Landroidx/transition/t;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/k;

    invoke-virtual {v3}, Landroidx/transition/k;->o()Landroidx/transition/k;

    move-result-object v3

    invoke-direct {v0, v3}, Landroidx/transition/t;->s0(Landroidx/transition/k;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public o0(Landroidx/transition/k$f;)Landroidx/transition/t;
    .locals 0

    invoke-super {p0, p1}, Landroidx/transition/k;->b(Landroidx/transition/k$f;)Landroidx/transition/k;

    move-result-object p1

    check-cast p1, Landroidx/transition/t;

    return-object p1
.end method

.method public p0(Landroid/view/View;)Landroidx/transition/t;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    invoke-virtual {v1, p1}, Landroidx/transition/k;->c(Landroid/view/View;)Landroidx/transition/k;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroidx/transition/k;->c(Landroid/view/View;)Landroidx/transition/k;

    move-result-object p1

    check-cast p1, Landroidx/transition/t;

    return-object p1
.end method

.method q(Landroid/view/ViewGroup;Landroidx/transition/w;Landroidx/transition/w;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12

    move-object v0, p0

    invoke-virtual {p0}, Landroidx/transition/k;->F()J

    move-result-wide v1

    iget-object v3, v0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroidx/transition/k;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    iget-boolean v5, v0, Landroidx/transition/t;->Z:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v6}, Landroidx/transition/k;->F()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    invoke-virtual {v6, v9, v10}, Landroidx/transition/k;->l0(J)Landroidx/transition/k;

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v1, v2}, Landroidx/transition/k;->l0(J)Landroidx/transition/k;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, Landroidx/transition/k;->q(Landroid/view/ViewGroup;Landroidx/transition/w;Landroidx/transition/w;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public r0(Landroidx/transition/k;)Landroidx/transition/t;
    .locals 4

    invoke-direct {p0, p1}, Landroidx/transition/t;->s0(Landroidx/transition/k;)V

    iget-wide v0, p0, Landroidx/transition/k;->c:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    invoke-virtual {p1, v0, v1}, Landroidx/transition/k;->g0(J)Landroidx/transition/k;

    :cond_0
    iget v0, p0, Landroidx/transition/t;->h1:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/transition/k;->w()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/k;->i0(Landroid/animation/TimeInterpolator;)Landroidx/transition/k;

    :cond_1
    iget v0, p0, Landroidx/transition/t;->h1:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/transition/k;->B()Landroidx/transition/s;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/transition/k;->k0(Landroidx/transition/s;)V

    :cond_2
    iget v0, p0, Landroidx/transition/t;->h1:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/transition/k;->A()Landroidx/transition/g;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/k;->j0(Landroidx/transition/g;)V

    :cond_3
    iget v0, p0, Landroidx/transition/t;->h1:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/transition/k;->u()Landroidx/transition/k$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/k;->h0(Landroidx/transition/k$e;)V

    :cond_4
    return-object p0
.end method

.method public t0(I)Landroidx/transition/k;
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/transition/k;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public u0()I
    .locals 1

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public v0(Landroidx/transition/k$f;)Landroidx/transition/t;
    .locals 0

    invoke-super {p0, p1}, Landroidx/transition/k;->a0(Landroidx/transition/k$f;)Landroidx/transition/k;

    move-result-object p1

    check-cast p1, Landroidx/transition/t;

    return-object p1
.end method

.method public w0(Landroid/view/View;)Landroidx/transition/t;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/k;

    invoke-virtual {v1, p1}, Landroidx/transition/k;->c0(Landroid/view/View;)Landroidx/transition/k;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroidx/transition/k;->c0(Landroid/view/View;)Landroidx/transition/k;

    move-result-object p1

    check-cast p1, Landroidx/transition/t;

    return-object p1
.end method

.method public x0(J)Landroidx/transition/t;
    .locals 4

    invoke-super {p0, p1, p2}, Landroidx/transition/k;->g0(J)Landroidx/transition/k;

    iget-wide v0, p0, Landroidx/transition/k;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1, p2}, Landroidx/transition/k;->g0(J)Landroidx/transition/k;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public y0(Landroid/animation/TimeInterpolator;)Landroidx/transition/t;
    .locals 3

    iget v0, p0, Landroidx/transition/t;->h1:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/transition/t;->h1:I

    iget-object v0, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/transition/t;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/k;

    invoke-virtual {v2, p1}, Landroidx/transition/k;->i0(Landroid/animation/TimeInterpolator;)Landroidx/transition/k;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroidx/transition/k;->i0(Landroid/animation/TimeInterpolator;)Landroidx/transition/k;

    move-result-object p1

    check-cast p1, Landroidx/transition/t;

    return-object p1
.end method

.method public z0(I)Landroidx/transition/t;
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/transition/t;->Z:Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, Landroidx/transition/t;->Z:Z

    :goto_0
    return-object p0
.end method
