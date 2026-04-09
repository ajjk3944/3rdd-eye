.class public abstract Ln9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, Ln9/c;->e(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, Ln9/c;->f(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lgg/i;Lmh/l;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "actionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln9/b;

    invoke-direct {v0, p1}, Ln9/b;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p0

    const-string/jumbo p1, "flatMapSingle {\n        \u2026en(Single.just(it))\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(Lgg/z;Lmh/l;)Lgg/z;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "actionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln9/a;

    invoke-direct {v0, p1}, Ln9/a;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p0

    const-string/jumbo p1, "flatMap {\n        action\u2026en(Single.just(it))\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final e(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$actionFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/b;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$actionFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/b;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p0

    return-object p0
.end method
