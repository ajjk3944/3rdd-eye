.class public interface abstract LC0/G;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 12

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    move v7, v2

    :goto_1
    if-ge v7, v6, :cond_0

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC0/n;

    new-instance v9, LC0/j;

    sget-object v10, LC0/p;->Max:LC0/p;

    sget-object v11, LC0/q;->Height:LC0/q;

    invoke-direct {v9, v8, v10, v11}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/G;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 12

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    move v7, v2

    :goto_1
    if-ge v7, v6, :cond_0

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC0/n;

    new-instance v9, LC0/j;

    sget-object v10, LC0/p;->Max:LC0/p;

    sget-object v11, LC0/q;->Width:LC0/q;

    invoke-direct {v9, v8, v10, v11}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/G;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 12

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    move v7, v2

    :goto_1
    if-ge v7, v6, :cond_0

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC0/n;

    new-instance v9, LC0/j;

    sget-object v10, LC0/p;->Min:LC0/p;

    sget-object v11, LC0/q;->Width:LC0/q;

    invoke-direct {v9, v8, v10, v11}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/G;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 12

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    move v7, v2

    :goto_1
    if-ge v7, v6, :cond_0

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC0/n;

    new-instance v9, LC0/j;

    sget-object v10, LC0/p;->Min:LC0/p;

    sget-object v11, LC0/q;->Height:LC0/q;

    invoke-direct {v9, v8, v10, v11}, LC0/j;-><init>(LC0/n;LC0/p;LC0/q;)V

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p0, v1, v0, p2, p3}, LC0/G;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method
