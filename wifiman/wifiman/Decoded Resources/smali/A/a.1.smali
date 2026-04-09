.class final LA/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/w;


# instance fields
.field private final a:I

.field private b:I

.field private c:Landroidx/compose/foundation/lazy/layout/d$b;

.field private d:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LA/a;->a:I

    const/4 p1, -0x1

    iput p1, p0, LA/a;->b:I

    return-void
.end method


# virtual methods
.method public a(LB/L;I)V
    .locals 3

    iget v0, p0, LA/a;->a:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    invoke-interface {p1, v2}, LB/L;->a(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(LA/v;FLA/q;)V
    .locals 3

    invoke-interface {p3}, LA/q;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    const/4 v1, 0x1

    if-gez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p3}, LA/q;->j()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA/l;

    invoke-interface {v2}, LA/l;->getIndex()I

    move-result v2

    add-int/2addr v2, v1

    goto :goto_1

    :cond_1
    invoke-interface {p3}, LA/q;->j()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA/l;

    invoke-interface {v2}, LA/l;->getIndex()I

    move-result v2

    sub-int/2addr v2, v1

    :goto_1
    if-ltz v2, :cond_5

    invoke-interface {p3}, LA/q;->h()I

    move-result v1

    if-ge v2, v1, :cond_5

    iget v1, p0, LA/a;->b:I

    if-eq v2, v1, :cond_3

    iget-boolean v1, p0, LA/a;->d:Z

    if-eq v1, v0, :cond_2

    iget-object v1, p0, LA/a;->c:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    :cond_2
    iput-boolean v0, p0, LA/a;->d:Z

    iput v2, p0, LA/a;->b:I

    invoke-interface {p1, v2}, LA/v;->a(I)Landroidx/compose/foundation/lazy/layout/d$b;

    move-result-object p1

    iput-object p1, p0, LA/a;->c:Landroidx/compose/foundation/lazy/layout/d$b;

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {p3}, LA/q;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/l;

    invoke-interface {p3}, LA/q;->i()I

    move-result v0

    invoke-interface {p1}, LA/l;->b()I

    move-result v1

    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    add-int/2addr v1, p1

    add-int/2addr v1, v0

    invoke-interface {p3}, LA/q;->d()I

    move-result p1

    sub-int/2addr v1, p1

    int-to-float p1, v1

    neg-float p2, p2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_5

    iget-object p1, p0, LA/a;->c:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->b()V

    goto :goto_2

    :cond_4
    invoke-interface {p3}, LA/q;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/l;

    invoke-interface {p3}, LA/q;->g()I

    move-result p3

    invoke-interface {p1}, LA/l;->b()I

    move-result p1

    sub-int/2addr p3, p1

    int-to-float p1, p3

    cmpg-float p1, p1, p2

    if-gez p1, :cond_5

    iget-object p1, p0, LA/a;->c:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->b()V

    :cond_5
    :goto_2
    return-void
.end method

.method public d(LA/v;LA/q;)V
    .locals 1

    iget p1, p0, LA/a;->b:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    invoke-interface {p2}, LA/q;->j()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, LA/a;->d:Z

    if-eqz p1, :cond_0

    invoke-interface {p2}, LA/q;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/l;

    invoke-interface {p1}, LA/l;->getIndex()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LA/q;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/l;

    invoke-interface {p1}, LA/l;->getIndex()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    iget p2, p0, LA/a;->b:I

    if-eq p2, p1, :cond_2

    iput v0, p0, LA/a;->b:I

    iget-object p1, p0, LA/a;->c:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, LA/a;->c:Landroidx/compose/foundation/lazy/layout/d$b;

    :cond_2
    return-void
.end method
