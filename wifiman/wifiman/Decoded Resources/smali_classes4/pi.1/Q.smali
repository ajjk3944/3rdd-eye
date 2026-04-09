.class public final Lpi/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi/v0;
.implements Lri/h;


# instance fields
.field private a:Lpi/S;

.field private final b:Ljava/util/LinkedHashSet;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "typesToIntersect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Lpi/Q;->c:I

    return-void
.end method

.method private constructor <init>(Ljava/util/Collection;Lpi/S;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lpi/Q;-><init>(Ljava/util/Collection;)V

    .line 6
    iput-object p2, p0, Lpi/Q;->a:Lpi/S;

    return-void
.end method

.method static synthetic f(Lmh/l;Lpi/S;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, Lpi/Q;->p(Lmh/l;Lpi/S;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lpi/S;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lpi/Q;->o(Lpi/S;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lpi/Q;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-static {p0, p1}, Lpi/Q;->k(Lpi/Q;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lpi/Q;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpi/Q;->r(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/Q;

    move-result-object p0

    invoke-virtual {p0}, Lpi/Q;->j()Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lpi/Q;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lpi/O;->a:Lpi/O;

    :cond_0
    invoke-virtual {p0, p1}, Lpi/Q;->m(Lmh/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lpi/S;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lmh/l;Lpi/S;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public bridge synthetic b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/Q;->r(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/Q;

    move-result-object p1

    return-object p1
.end method

.method public c()LBh/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lpi/Q;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    check-cast p1, Lpi/Q;

    iget-object p1, p1, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lpi/Q;->c:I

    return v0
.end method

.method public final i()Lii/k;
    .locals 3

    sget-object v0, Lii/x;->d:Lii/x$a;

    const-string v1, "member scope for intersection type"

    iget-object v2, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1, v2}, Lii/x$a;->a(Ljava/lang/String;Ljava/util/Collection;)Lii/k;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lpi/d0;
    .locals 7

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lpi/Q;->i()Lii/k;

    move-result-object v5

    new-instance v6, Lpi/P;

    invoke-direct {v6, p0}, Lpi/P;-><init>(Lpi/Q;)V

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lpi/V;->n(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lpi/S;
    .locals 1

    iget-object v0, p0, Lpi/Q;->a:Lpi/S;

    return-object v0
.end method

.method public final m(Lmh/l;)Ljava/lang/String;
    .locals 10

    const-string v0, "getProperTypeRelatedToStringify"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    new-instance v1, Lpi/Q$a;

    invoke-direct {v1, p1}, Lpi/Q$a;-><init>(Lmh/l;)V

    invoke-static {v0, v1}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, Lpi/N;

    invoke-direct {v7, p1}, Lpi/N;-><init>(Lmh/l;)V

    const/16 v8, 0x18

    const/4 v9, 0x0

    const-string v2, " & "

    const-string v3, "{"

    const-string v4, "}"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 2

    iget-object v0, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public r(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/Q;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/Q;->a()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2, p1}, Lpi/S;->P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lpi/Q;->l()Lpi/S;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, p1}, Lpi/S;->P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;

    move-result-object v0

    :cond_2
    new-instance p1, Lpi/Q;

    invoke-direct {p1, v1}, Lpi/Q;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, Lpi/Q;->s(Lpi/S;)Lpi/Q;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_3

    move-object v0, p0

    :cond_3
    return-object v0
.end method

.method public final s(Lpi/S;)Lpi/Q;
    .locals 2

    new-instance v0, Lpi/Q;

    iget-object v1, p0, Lpi/Q;->b:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1, p1}, Lpi/Q;-><init>(Ljava/util/Collection;Lpi/S;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lpi/Q;->n(Lpi/Q;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
