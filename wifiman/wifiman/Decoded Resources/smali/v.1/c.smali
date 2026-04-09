.class public abstract Lv/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lv/c;->b(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lv/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/c$a;

    iget v1, v0, Lv/c$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/c$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/c$a;

    invoke-direct {v0, p1}, Lv/c$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lv/c$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lv/c$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/c$a;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iput-object p0, v0, Lv/c$a;->a:Ljava/lang/Object;

    iput v3, v0, Lv/c$a;->c:I

    const/4 p1, 0x0

    invoke-static {p0, p1, v0, v3, p1}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->b()I

    move-result v2

    invoke-static {v2}, Ly0/r;->c(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v4, :cond_6

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/y;

    invoke-static {v7}, Ly0/o;->a(Ly0/y;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lv/i;)Landroidx/compose/ui/e;
    .locals 3

    sget-object v0, Lv/d;->a:Lv/d;

    new-instance v1, Lv/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lv/c$b;-><init>(Lv/i;Ldh/e;)V

    invoke-static {p0, v0, v1}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ly0/G;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lv/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lv/c$c;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {p0, v0, p2}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
