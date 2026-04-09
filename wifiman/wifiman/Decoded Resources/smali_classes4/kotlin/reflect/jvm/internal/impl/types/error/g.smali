.class public Lkotlin/reflect/jvm/internal/impl/types/error/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lii/k;


# instance fields
.field private final b:Lkotlin/reflect/jvm/internal/impl/types/error/h;

.field private final c:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/g;->b:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/error/h;->getDebugMessage()Ljava/lang/String;

    move-result-object p1

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/g;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/g;->h(LZh/f;LIh/b;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/g;->i(LZh/f;LIh/b;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/types/error/a;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/b;->ERROR_CLASS:Lkotlin/reflect/jvm/internal/impl/types/error/b;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/b;->getDebugText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object p1

    const-string v0, "special(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/a;-><init>(LZh/f;)V

    return-object p2
.end method

.method public h(LZh/f;LIh/b;)Ljava/util/Set;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/error/c;

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->h()Lkotlin/reflect/jvm/internal/impl/types/error/a;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/c;-><init>(LBh/e;)V

    invoke-static {p1}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public i(LZh/f;LIh/b;)Ljava/util/Set;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->j()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ErrorScope{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
