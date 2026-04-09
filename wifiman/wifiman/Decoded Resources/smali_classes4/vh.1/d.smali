.class public abstract Lvh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LYg/i;)Lth/g;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lkotlin/Metadata;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lkotlin/Metadata;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    if-nez v3, :cond_1

    move-object v2, v1

    :cond_1
    if-nez v2, :cond_2

    return-object v1

    :cond_2
    invoke-interface {v0}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LYh/i;->j([Ljava/lang/String;[Ljava/lang/String;)LYg/s;

    move-result-object v1

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, LYh/f;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LUh/i;

    new-instance v7, LYh/e;

    invoke-interface {v0}, Lkotlin/Metadata;->mv()[I

    move-result-object v1

    invoke-interface {v0}, Lkotlin/Metadata;->xi()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-direct {v7, v1, v0}, LYh/e;-><init>([IZ)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    new-instance v6, LWh/g;

    invoke-virtual {v4}, LUh/i;->w1()LUh/t;

    move-result-object p0

    const-string v0, "getTypeTable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, p0}, LWh/g;-><init>(LUh/t;)V

    sget-object v8, Lvh/d$a;->a:Lvh/d$a;

    invoke-static/range {v3 .. v8}, Lwh/j1;->h(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;LWh/a;Lmh/p;)LBh/a;

    move-result-object p0

    check-cast p0, LBh/f0;

    new-instance v0, Lwh/i0;

    sget-object v1, Lwh/k;->d:Lwh/k;

    invoke-direct {v0, v1, p0}, Lwh/i0;-><init>(Lwh/d0;LBh/z;)V

    return-object v0
.end method
