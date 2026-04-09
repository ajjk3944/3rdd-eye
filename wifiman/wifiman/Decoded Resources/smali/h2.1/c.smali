.class public abstract Lh2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LVi/b;Ljava/util/Map;Lmh/q;)V
    .locals 5

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->e()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-interface {v2, v1}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/B;

    if-eqz v3, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4, v2, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Cannot locate NavType for argument ["

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public static final b(LVi/b;)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v1

    invoke-interface {v1}, LXi/f;->e()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v3

    invoke-interface {v3, v2}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static final c(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    const-string v0, "route"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, LVi/w;->d(Lth/d;)LVi/b;

    move-result-object v0

    new-instance v1, Lh2/b;

    invoke-direct {v1, v0, p1}, Lh2/b;-><init>(LVi/b;Ljava/util/Map;)V

    invoke-virtual {v1, p0}, Lh2/b;->J(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    new-instance v1, Lh2/a;

    invoke-direct {v1, v0}, Lh2/a;-><init>(LVi/b;)V

    new-instance v2, Lh2/c$a;

    invoke-direct {v2, p0, v1}, Lh2/c$a;-><init>(Ljava/util/Map;Lh2/a;)V

    invoke-static {v0, p1, v2}, Lh2/c;->a(LVi/b;Ljava/util/Map;Lmh/q;)V

    invoke-virtual {v1}, Lh2/a;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LXi/f;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LXi/f;->h()LXi/m;

    move-result-object v0

    sget-object v1, LXi/n$a;->a:LXi/n$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LXi/f;->isInline()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LXi/f;->e()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
