.class public final LXi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXi/f;
.implements LZi/n;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LXi/m;

.field private final c:I

.field private final d:Ljava/util/List;

.field private final e:Ljava/util/Set;

.field private final f:[Ljava/lang/String;

.field private final g:[LXi/f;

.field private final h:[Ljava/util/List;

.field private final i:[Z

.field private final j:Ljava/util/Map;

.field private final k:[LXi/f;

.field private final l:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;LXi/m;ILjava/util/List;LXi/a;)V
    .locals 1

    const-string v0, "serialName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameters"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXi/i;->a:Ljava/lang/String;

    iput-object p2, p0, LXi/i;->b:LXi/m;

    iput p3, p0, LXi/i;->c:I

    invoke-virtual {p5}, LXi/a;->c()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LXi/i;->d:Ljava/util/List;

    invoke-virtual {p5}, LXi/a;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->g1(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object p1

    iput-object p1, p0, LXi/i;->e:Ljava/util/Set;

    invoke-virtual {p5}, LXi/a;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 p2, 0x0

    new-array p3, p2, [Ljava/lang/String;

    invoke-interface {p1, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, LXi/i;->f:[Ljava/lang/String;

    invoke-virtual {p5}, LXi/a;->e()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, LZi/B0;->b(Ljava/util/List;)[LXi/f;

    move-result-object p3

    iput-object p3, p0, LXi/i;->g:[LXi/f;

    invoke-virtual {p5}, LXi/a;->d()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    new-array p2, p2, [Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/util/List;

    iput-object p2, p0, LXi/i;->h:[Ljava/util/List;

    invoke-virtual {p5}, LXi/a;->g()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, LZg/v;->c1(Ljava/util/Collection;)[Z

    move-result-object p2

    iput-object p2, p0, LXi/i;->i:[Z

    invoke-static {p1}, LZg/n;->q1([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p1, p3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LZg/N;

    invoke-virtual {p3}, LZg/N;->d()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p3}, LZg/N;->c()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p5, p3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, LZg/U;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LXi/i;->j:Ljava/util/Map;

    invoke-static {p4}, LZi/B0;->b(Ljava/util/List;)[LXi/f;

    move-result-object p1

    iput-object p1, p0, LXi/i;->k:[LXi/f;

    new-instance p1, LXi/g;

    invoke-direct {p1, p0}, LXi/g;-><init>(LXi/i;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LXi/i;->l:LYg/m;

    return-void
.end method

.method public static synthetic k(LXi/i;)I
    .locals 0

    invoke-static {p0}, LXi/i;->m(LXi/i;)I

    move-result p0

    return p0
.end method

.method public static synthetic l(LXi/i;I)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, LXi/i;->o(LXi/i;I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final m(LXi/i;)I
    .locals 1

    iget-object v0, p0, LXi/i;->k:[LXi/f;

    invoke-static {p0, v0}, LZi/I0;->a(LXi/f;[LXi/f;)I

    move-result p0

    return p0
.end method

.method private final n()I
    .locals 1

    iget-object v0, p0, LXi/i;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private static final o(LXi/i;I)Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, LXi/i;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, LXi/i;->i(I)LXi/f;

    move-result-object p0

    invoke-interface {p0}, LXi/f;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXi/i;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LXi/i;->e:Ljava/util/Set;

    return-object v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LXi/i;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x3

    :goto_0
    return p1
.end method

.method public e()I
    .locals 1

    iget v0, p0, LXi/i;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v1, p1, LXi/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    :goto_0
    move v0, v2

    goto :goto_2

    :cond_1
    invoke-interface {p0}, LXi/f;->a()Ljava/lang/String;

    move-result-object v1

    move-object v3, p1

    check-cast v3, LXi/f;

    invoke-interface {v3}, LXi/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, LXi/i;

    iget-object v1, p0, LXi/i;->k:[LXi/f;

    iget-object p1, p1, LXi/i;->k:[LXi/f;

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p0}, LXi/f;->e()I

    move-result p1

    invoke-interface {v3}, LXi/f;->e()I

    move-result v1

    if-eq p1, v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {p0}, LXi/f;->e()I

    move-result p1

    move v1, v2

    :goto_1
    if-ge v1, p1, :cond_7

    invoke-interface {p0, v1}, LXi/f;->i(I)LXi/f;

    move-result-object v4

    invoke-interface {v4}, LXi/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v1}, LXi/f;->i(I)LXi/f;

    move-result-object v5

    invoke-interface {v5}, LXi/f;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-interface {p0, v1}, LXi/f;->i(I)LXi/f;

    move-result-object v4

    invoke-interface {v4}, LXi/f;->h()LXi/m;

    move-result-object v4

    invoke-interface {v3, v1}, LXi/f;->i(I)LXi/f;

    move-result-object v5

    invoke-interface {v5}, LXi/f;->h()LXi/m;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_0

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXi/i;->f:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LXi/i;->h:[Ljava/util/List;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LXi/i;->d:Ljava/util/List;

    return-object v0
.end method

.method public h()LXi/m;
    .locals 1

    iget-object v0, p0, LXi/i;->b:LXi/m;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-direct {p0}, LXi/i;->n()I

    move-result v0

    return v0
.end method

.method public i(I)LXi/f;
    .locals 1

    iget-object v0, p0, LXi/i;->g:[LXi/f;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public j(I)Z
    .locals 1

    iget-object v0, p0, LXi/i;->i:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    invoke-virtual {p0}, LXi/i;->e()I

    move-result v1

    invoke-static {v0, v1}, Lsh/m;->s(II)Lsh/i;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LXi/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v8, LXi/h;

    invoke-direct {v8, p0}, LXi/h;-><init>(LXi/i;)V

    const/16 v9, 0x18

    const/4 v10, 0x0

    const-string v3, ", "

    const-string v5, ")"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
