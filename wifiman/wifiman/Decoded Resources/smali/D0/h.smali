.class public interface abstract LD0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/k;
.implements LE0/j;


# virtual methods
.method public S0()LD0/g;
    .locals 1

    sget-object v0, LD0/b;->a:LD0/b;

    return-object v0
.end method

.method public z(LD0/c;)Ljava/lang/Object;
    .locals 11

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ModifierLocal accessed from an unattached node"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    const/16 v0, 0x20

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_b

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v3

    invoke-virtual {v3}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->a2()I

    move-result v3

    and-int/2addr v3, v0

    const/4 v4, 0x0

    if-eqz v3, :cond_9

    :goto_1
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_8

    move-object v3, v1

    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_8

    instance-of v6, v3, LD0/h;

    if-eqz v6, :cond_1

    check-cast v3, LD0/h;

    invoke-interface {v3}, LD0/h;->S0()LD0/g;

    move-result-object v6

    invoke-virtual {v6, p1}, LD0/g;->a(LD0/c;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, LD0/h;->S0()LD0/g;

    move-result-object v0

    invoke-virtual {v0, p1}, LD0/g;->b(LD0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_7

    instance-of v6, v3, LE0/m;

    if-eqz v6, :cond_7

    move-object v6, v3

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_5

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_2

    move-object v3, v6

    goto :goto_4

    :cond_2
    if-nez v5, :cond_3

    new-instance v5, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v5, v3}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v3, v4

    :cond_4
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_5
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_3

    :cond_6
    if-ne v8, v9, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_9
    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_a
    move-object v1, v4

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1}, LD0/c;->a()Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
