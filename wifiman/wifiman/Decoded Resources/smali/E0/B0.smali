.class public abstract LE0/B0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/j;Ljava/lang/Object;)LE0/A0;
    .locals 10

    const/high16 v0, 0x40000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    :goto_0
    const/4 v2, 0x0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object v3

    invoke-virtual {v3}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->a2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_8

    :goto_1
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_7

    move-object v3, v1

    move-object v4, v2

    :goto_2
    if-eqz v3, :cond_7

    instance-of v5, v3, LE0/A0;

    if-eqz v5, :cond_0

    check-cast v3, LE0/A0;

    invoke-interface {v3}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    return-object v3

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_6

    instance-of v5, v3, LE0/m;

    if-eqz v5, :cond_6

    move-object v5, v3

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_3
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v3, v5

    goto :goto_4

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LV/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/e$c;

    invoke-direct {v4, v8, v6}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v4, v3}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_3
    invoke-virtual {v4, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_3

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v4}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    move-object v1, v2

    goto/16 :goto_0

    :cond_a
    return-object v2

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitAncestors called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LE0/A0;)LE0/A0;
    .locals 11

    const/high16 v0, 0x40000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_a

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v4

    invoke-virtual {v4}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->a2()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_8

    :goto_1
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_7

    move-object v4, v1

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_7

    instance-of v6, v4, LE0/A0;

    if-eqz v6, :cond_0

    check-cast v4, LE0/A0;

    invoke-interface {p0}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-static {p0, v4}, Lf0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    return-object v4

    :cond_0
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_6

    instance-of v6, v4, LE0/m;

    if-eqz v6, :cond_6

    move-object v6, v4

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_4

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_1

    move-object v4, v6

    goto :goto_4

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_3
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_3

    :cond_5
    if-ne v8, v9, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_8
    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    move-object v1, v3

    goto/16 :goto_0

    :cond_a
    return-object v3

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(LE0/j;Ljava/lang/Object;Lmh/l;)V
    .locals 10

    const/high16 v0, 0x40000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_d

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object v2

    invoke-virtual {v2}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, v0

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    :goto_1
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, v0

    if-eqz v2, :cond_a

    move-object v2, v1

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_a

    instance-of v5, v2, LE0/A0;

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    check-cast v2, LE0/A0;

    invoke-interface {v2}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {p2, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_0
    if-nez v6, :cond_9

    return-void

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v0

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_3

    :cond_2
    move v5, v7

    :goto_3
    if-eqz v5, :cond_9

    instance-of v5, v2, LE0/m;

    if-eqz v5, :cond_9

    move-object v5, v2

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    move v8, v7

    :goto_4
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_3

    move v9, v6

    goto :goto_5

    :cond_3
    move v9, v7

    :goto_5
    if-eqz v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v6, :cond_4

    move-object v2, v5

    goto :goto_6

    :cond_4
    if-nez v4, :cond_5

    new-instance v4, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v4, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v4, v2}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v2, v3

    :cond_6
    invoke-virtual {v4, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_7
    :goto_6
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_4

    :cond_8
    if-ne v8, v6, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v4}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_2

    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_b
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_c
    move-object v1, v3

    goto/16 :goto_0

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitAncestors called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(LE0/A0;Lmh/l;)V
    .locals 11

    const/high16 v0, 0x40000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_d

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v3

    invoke-virtual {v3}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->a2()I

    move-result v3

    and-int/2addr v3, v0

    const/4 v4, 0x0

    if-eqz v3, :cond_b

    :goto_1
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    move-object v3, v1

    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_a

    instance-of v6, v3, LE0/A0;

    const/4 v7, 0x1

    if-eqz v6, :cond_1

    check-cast v3, LE0/A0;

    invoke-interface {p0}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {p0, v3}, Lf0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {p1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    :cond_0
    if-nez v7, :cond_9

    return-void

    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v0

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_3

    :cond_2
    move v6, v8

    :goto_3
    if-eqz v6, :cond_9

    instance-of v6, v3, LE0/m;

    if-eqz v6, :cond_9

    move-object v6, v3

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    move v9, v8

    :goto_4
    if-eqz v6, :cond_8

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_3

    move v10, v7

    goto :goto_5

    :cond_3
    move v10, v8

    :goto_5
    if-eqz v10, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_4

    move-object v3, v6

    goto :goto_6

    :cond_4
    if-nez v5, :cond_5

    new-instance v5, LV/b;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v10, v8}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v5, v3}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v3, v4

    :cond_6
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_7
    :goto_6
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_4

    :cond_8
    if-ne v9, v7, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_2

    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_1

    :cond_b
    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_c
    move-object v1, v4

    goto/16 :goto_0

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitAncestors called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(LE0/j;Ljava/lang/Object;Lmh/l;)V
    .locals 12

    const/high16 v0, 0x40000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "visitSubtreeIf called on an unattached node"

    invoke-static {v1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v1, LV/b;

    const/16 v2, 0x10

    new-array v3, v2, [Landroidx/compose/ui/e$c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p0

    invoke-static {v1, p0}, LE0/k;->a(LV/b;Landroidx/compose/ui/e$c;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-virtual {v1}, LV/b;->u()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-virtual {v1}, LV/b;->o()I

    move-result p0

    const/4 v3, 0x1

    sub-int/2addr p0, v3

    invoke-virtual {v1, p0}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/e$c;

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_d

    move-object v5, p0

    :goto_1
    if-eqz v5, :cond_d

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    move-object v7, v5

    move-object v8, v6

    :goto_2
    if-eqz v7, :cond_c

    instance-of v9, v7, LE0/A0;

    if-eqz v9, :cond_5

    check-cast v7, LE0/A0;

    invoke-interface {v7}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v9

    invoke-static {p1, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {p2, v7}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LE0/z0;

    goto :goto_3

    :cond_3
    sget-object v7, LE0/z0;->ContinueTraversal:LE0/z0;

    :goto_3
    sget-object v9, LE0/z0;->CancelTraversal:LE0/z0;

    if-ne v7, v9, :cond_4

    return-void

    :cond_4
    sget-object v9, LE0/z0;->SkipSubtreeAndContinueTraversal:LE0/z0;

    if-eq v7, v9, :cond_2

    goto :goto_6

    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_b

    instance-of v9, v7, LE0/m;

    if-eqz v9, :cond_b

    move-object v9, v7

    check-cast v9, LE0/m;

    invoke-virtual {v9}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v9

    move v10, v4

    :goto_4
    if-eqz v9, :cond_a

    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v0

    if-eqz v11, :cond_9

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v3, :cond_6

    move-object v7, v9

    goto :goto_5

    :cond_6
    if-nez v8, :cond_7

    new-instance v8, LV/b;

    new-array v11, v2, [Landroidx/compose/ui/e$c;

    invoke-direct {v8, v11, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_7
    if-eqz v7, :cond_8

    invoke-virtual {v8, v7}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v7, v6

    :cond_8
    invoke-virtual {v8, v9}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_9
    :goto_5
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v9

    goto :goto_4

    :cond_a
    if-ne v10, v3, :cond_b

    goto :goto_2

    :cond_b
    :goto_6
    invoke-static {v8}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v7

    goto :goto_2

    :cond_c
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_1

    :cond_d
    invoke-static {v1, p0}, LE0/k;->a(LV/b;Landroidx/compose/ui/e$c;)V

    goto/16 :goto_0

    :cond_e
    return-void
.end method

.method public static final f(LE0/A0;Lmh/l;)V
    .locals 13

    const/high16 v0, 0x40000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "visitSubtreeIf called on an unattached node"

    invoke-static {v1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v1, LV/b;

    const/16 v2, 0x10

    new-array v3, v2, [Landroidx/compose/ui/e$c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-static {v1, v3}, LE0/k;->a(LV/b;Landroidx/compose/ui/e$c;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-virtual {v1}, LV/b;->u()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v1}, LV/b;->o()I

    move-result v3

    const/4 v5, 0x1

    sub-int/2addr v3, v5

    invoke-virtual {v1, v3}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/e$c;

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->a2()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_d

    move-object v6, v3

    :goto_1
    if-eqz v6, :cond_d

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v7

    and-int/2addr v7, v0

    if-eqz v7, :cond_c

    const/4 v7, 0x0

    move-object v8, v6

    move-object v9, v7

    :goto_2
    if-eqz v8, :cond_c

    instance-of v10, v8, LE0/A0;

    if-eqz v10, :cond_5

    check-cast v8, LE0/A0;

    invoke-interface {p0}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v8}, LE0/A0;->W()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-static {p0, v8}, Lf0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {p1, v8}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LE0/z0;

    goto :goto_3

    :cond_3
    sget-object v8, LE0/z0;->ContinueTraversal:LE0/z0;

    :goto_3
    sget-object v10, LE0/z0;->CancelTraversal:LE0/z0;

    if-ne v8, v10, :cond_4

    return-void

    :cond_4
    sget-object v10, LE0/z0;->SkipSubtreeAndContinueTraversal:LE0/z0;

    if-eq v8, v10, :cond_2

    goto :goto_6

    :cond_5
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_b

    instance-of v10, v8, LE0/m;

    if-eqz v10, :cond_b

    move-object v10, v8

    check-cast v10, LE0/m;

    invoke-virtual {v10}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v10

    move v11, v4

    :goto_4
    if-eqz v10, :cond_a

    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->f2()I

    move-result v12

    and-int/2addr v12, v0

    if-eqz v12, :cond_9

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v5, :cond_6

    move-object v8, v10

    goto :goto_5

    :cond_6
    if-nez v9, :cond_7

    new-instance v9, LV/b;

    new-array v12, v2, [Landroidx/compose/ui/e$c;

    invoke-direct {v9, v12, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_7
    if-eqz v8, :cond_8

    invoke-virtual {v9, v8}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v8, v7

    :cond_8
    invoke-virtual {v9, v10}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_9
    :goto_5
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v10

    goto :goto_4

    :cond_a
    if-ne v11, v5, :cond_b

    goto :goto_2

    :cond_b
    :goto_6
    invoke-static {v9}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_2

    :cond_c
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto/16 :goto_1

    :cond_d
    invoke-static {v1, v3}, LE0/k;->a(LV/b;Landroidx/compose/ui/e$c;)V

    goto/16 :goto_0

    :cond_e
    return-void
.end method
