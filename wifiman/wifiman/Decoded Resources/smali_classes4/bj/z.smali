.class Lbj/z;
.super Lbj/c;
.source "SourceFile"


# instance fields
.field private final h:Laj/E;

.field private final i:LXi/f;

.field private j:I

.field private k:Z


# direct methods
.method public constructor <init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lbj/c;-><init>(Laj/b;Laj/j;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p2, p0, Lbj/z;->h:Laj/E;

    .line 4
    iput-object p4, p0, Lbj/z;->i:LXi/f;

    return-void
.end method

.method public synthetic constructor <init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lbj/z;-><init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;)V

    return-void
.end method

.method private final D0(LXi/f;I)Z
    .locals 1

    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LXi/f;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    invoke-interface {p1}, LXi/f;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lbj/z;->k:Z

    return p1
.end method

.method private final E0(LXi/f;ILjava/lang/String;)Z
    .locals 5

    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v0

    invoke-interface {p1, p2}, LXi/f;->j(I)Z

    move-result v1

    invoke-interface {p1, p2}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p1}, LXi/f;->c()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, p3}, Lbj/z;->m0(Ljava/lang/String;)Laj/j;

    move-result-object v2

    instance-of v2, v2, Laj/B;

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object v2

    sget-object v3, LXi/m$b;->a:LXi/m$b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, LXi/f;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p3}, Lbj/z;->m0(Ljava/lang/String;)Laj/j;

    move-result-object v2

    instance-of v2, v2, Laj/B;

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    move p2, v3

    goto :goto_3

    :cond_2
    invoke-virtual {p0, p3}, Lbj/z;->m0(Ljava/lang/String;)Laj/j;

    move-result-object p3

    instance-of v2, p3, Laj/G;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    check-cast p3, Laj/G;

    goto :goto_1

    :cond_3
    move-object p3, v4

    :goto_1
    if-eqz p3, :cond_4

    invoke-static {p3}, Laj/k;->e(Laj/G;)Ljava/lang/String;

    move-result-object v4

    :cond_4
    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p1, v0, v4}, Lbj/t;->i(LXi/f;Laj/b;Ljava/lang/String;)I

    move-result p3

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->j()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p1}, LXi/f;->c()Z

    move-result p1

    if-eqz p1, :cond_6

    move p1, p2

    goto :goto_2

    :cond_6
    move p1, v3

    :goto_2
    const/4 v0, -0x3

    if-ne p3, v0, :cond_1

    if-nez v1, :cond_7

    if-eqz p1, :cond_1

    :cond_7
    :goto_3
    return p2
.end method


# virtual methods
.method public bridge synthetic A0()Laj/j;
    .locals 1

    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v0

    return-object v0
.end method

.method public F0()Laj/E;
    .locals 1

    iget-object v0, p0, Lbj/z;->h:Laj/E;

    return-object v0
.end method

.method public b(LXi/f;)V
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v0

    invoke-static {p1, v0}, Lbj/t;->m(LXi/f;Laj/b;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object v0

    instance-of v0, v0, LXi/d;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v0

    invoke-static {p1, v0}, Lbj/t;->n(LXi/f;Laj/b;)Laj/A;

    iget-object v0, p0, Lbj/c;->g:Laj/g;

    invoke-virtual {v0}, Laj/g;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, LZi/X;->a(LXi/f;)Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, LZi/X;->a(LXi/f;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v2

    invoke-static {v2}, Laj/I;->a(Laj/b;)Lbj/n;

    move-result-object v2

    invoke-static {}, Lbj/t;->g()Lbj/n$a;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lbj/n;->a(LXi/f;Lbj/n$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_3

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    :cond_3
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    :goto_1
    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v0

    invoke-virtual {v0}, Laj/E;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p0}, Lbj/c;->z0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Encountered an unknown key \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' at element: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LZi/o0;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v0

    invoke-virtual {v0}, Laj/E;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Lbj/r;->i(Ljava/lang/CharSequence;IILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, -0x1

    invoke-static {v0, p1}, Lbj/r;->d(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_6
    :goto_3
    return-void
.end method

.method public c(LXi/f;)LYi/c;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/z;->i:LXi/f;

    if-ne p1, v0, :cond_1

    new-instance p1, Lbj/z;

    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {p0}, Lbj/c;->n0()Laj/j;

    move-result-object v1

    iget-object v2, p0, Lbj/z;->i:LXi/f;

    invoke-interface {v2}, LXi/f;->a()Ljava/lang/String;

    move-result-object v2

    instance-of v3, v1, Laj/E;

    if-eqz v3, :cond_0

    check-cast v1, Laj/E;

    invoke-virtual {p0}, Lbj/c;->z0()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbj/z;->i:LXi/f;

    invoke-direct {p1, v0, v1, v2, v3}, Lbj/z;-><init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v0, Laj/E;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-interface {v0}, Lth/d;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but had "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-interface {v0}, Lth/d;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " as the serialized body of "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at element: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lbj/c;->l0(Lbj/c;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lbj/r;->e(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_1
    invoke-super {p0, p1}, Lbj/c;->c(LXi/f;)LYi/c;

    move-result-object p1

    return-object p1
.end method

.method protected g0(LXi/f;I)Ljava/lang/String;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v0

    invoke-static {p1, v0}, Lbj/t;->n(LXi/f;Laj/b;)Laj/A;

    invoke-interface {p1, p2}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbj/c;->g:Laj/g;

    invoke-virtual {v1}, Laj/g;->o()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v1

    invoke-virtual {v1}, Laj/E;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lbj/c;->d()Laj/b;

    move-result-object v1

    invoke-static {v1, p1}, Lbj/t;->e(Laj/b;LXi/f;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v1

    invoke-virtual {v1}, Laj/E;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, p2, :cond_2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_5

    return-object v2

    :cond_5
    return-object v0
.end method

.method public k(LXi/f;)I
    .locals 3

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lbj/z;->j:I

    invoke-interface {p1}, LXi/f;->e()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget v0, p0, Lbj/z;->j:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lbj/z;->j:I

    invoke-virtual {p0, p1, v0}, LZi/o0;->h0(LXi/f;I)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lbj/z;->j:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    iput-boolean v2, p0, Lbj/z;->k:Z

    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-direct {p0, p1, v1}, Lbj/z;->D0(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    iget-object v2, p0, Lbj/c;->g:Laj/g;

    invoke-virtual {v2}, Laj/g;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, p1, v1, v0}, Lbj/z;->E0(LXi/f;ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    return v1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method protected m0(Ljava/lang/String;)Laj/j;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbj/z;->F0()Laj/E;

    move-result-object v0

    invoke-static {v0, p1}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laj/j;

    return-object p1
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, Lbj/z;->k:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lbj/c;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
