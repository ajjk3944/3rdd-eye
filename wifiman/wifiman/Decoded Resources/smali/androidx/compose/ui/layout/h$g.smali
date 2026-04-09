.class public final Landroidx/compose/ui/layout/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/h;->G(Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/layout/x$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/h;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/h;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    iput-object p2, p0, Landroidx/compose/ui/layout/h$g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lmh/l;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->g(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->k0()LE0/a0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, LE0/B0;->e(LE0/j;Ljava/lang/Object;Lmh/l;)V

    :cond_0
    return-void
.end method

.method public b(IJ)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->g(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LE0/G;->H()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ltz p1, :cond_1

    if-ge p1, v1, :cond_1

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, LE0/G;->s(LE0/G;Z)V

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v2

    invoke-virtual {v0}, LE0/G;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE0/G;

    invoke-interface {v2, p1, p2, p3}, LE0/m0;->A(LE0/G;J)V

    const/4 p1, 0x0

    invoke-static {v1, p1}, LE0/G;->s(LE0/G;Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pre-measure called on node that is not placed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bound of [0, "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_0
    return-void
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->g(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->H()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public dispose()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h;->B()V

    iget-object v0, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->g(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->i(Landroidx/compose/ui/layout/h;)I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v2}, Landroidx/compose/ui/layout/h;->i(Landroidx/compose/ui/layout/h;)I

    move-result v2

    sub-int/2addr v1, v2

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->j(Landroidx/compose/ui/layout/h;)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Landroidx/compose/ui/layout/h;->t(Landroidx/compose/ui/layout/h;I)V

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->i(Landroidx/compose/ui/layout/h;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Landroidx/compose/ui/layout/h;->s(Landroidx/compose/ui/layout/h;I)V

    iget-object v1, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v2}, Landroidx/compose/ui/layout/h;->i(Landroidx/compose/ui/layout/h;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v2}, Landroidx/compose/ui/layout/h;->j(Landroidx/compose/ui/layout/h;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v2, v0, v1, v3}, Landroidx/compose/ui/layout/h;->n(Landroidx/compose/ui/layout/h;III)V

    iget-object v0, p0, Landroidx/compose/ui/layout/h$g;->a:Landroidx/compose/ui/layout/h;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/layout/h;->x(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Item is not in pre-composed item range"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pre-composed items to dispose"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method
