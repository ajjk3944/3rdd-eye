.class public interface abstract LC0/C;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/n;

    new-instance v4, LC0/j;

    sget-object v5, LC0/p;->Max:LC0/p;

    sget-object v6, LC0/q;->Height:LC0/q;

    invoke-direct {v4, v3, v5, v6}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/n;

    new-instance v4, LC0/j;

    sget-object v5, LC0/p;->Max:LC0/p;

    sget-object v6, LC0/q;->Width:LC0/q;

    invoke-direct {v4, v3, v5, v6}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/n;

    new-instance v4, LC0/j;

    sget-object v5, LC0/p;->Min:LC0/p;

    sget-object v6, LC0/q;->Width:LC0/q;

    invoke-direct {v4, v3, v5, v6}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/n;

    new-instance v4, LC0/j;

    sget-object v5, LC0/p;->Min:LC0/p;

    sget-object v6, LC0/q;->Height:LC0/q;

    invoke-direct {v4, v3, v5, v6}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method
