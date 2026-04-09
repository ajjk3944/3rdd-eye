.class public LZi/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXi/f;
.implements LZi/n;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LZi/M;

.field private final c:I

.field private d:I

.field private final e:[Ljava/lang/String;

.field private final f:[Ljava/util/List;

.field private g:Ljava/util/List;

.field private final h:[Z

.field private i:Ljava/util/Map;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;LZi/M;I)V
    .locals 1

    const-string v0, "serialName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LZi/H0;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LZi/H0;->b:LZi/M;

    .line 4
    iput p3, p0, LZi/H0;->c:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, LZi/H0;->d:I

    .line 6
    new-array p1, p3, [Ljava/lang/String;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    const-string v0, "[UNINITIALIZED]"

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, p0, LZi/H0;->e:[Ljava/lang/String;

    .line 7
    iget p1, p0, LZi/H0;->c:I

    new-array p2, p1, [Ljava/util/List;

    iput-object p2, p0, LZi/H0;->f:[Ljava/util/List;

    .line 8
    new-array p1, p1, [Z

    iput-object p1, p0, LZi/H0;->h:[Z

    .line 9
    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LZi/H0;->i:Ljava/util/Map;

    .line 10
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, LZi/E0;

    invoke-direct {p2, p0}, LZi/E0;-><init>(LZi/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, LZi/H0;->j:LYg/m;

    .line 11
    new-instance p2, LZi/F0;

    invoke-direct {p2, p0}, LZi/F0;-><init>(LZi/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, LZi/H0;->k:LYg/m;

    .line 12
    new-instance p2, LZi/G0;

    invoke-direct {p2, p0}, LZi/G0;-><init>(LZi/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LZi/H0;->l:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LZi/M;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    return-void
.end method

.method public static synthetic k(LZi/H0;I)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, LZi/H0;->w(LZi/H0;I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(LZi/H0;)I
    .locals 0

    invoke-static {p0}, LZi/H0;->o(LZi/H0;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(LZi/H0;)[LXi/f;
    .locals 0

    invoke-static {p0}, LZi/H0;->x(LZi/H0;)[LXi/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(LZi/H0;)[LVi/b;
    .locals 0

    invoke-static {p0}, LZi/H0;->s(LZi/H0;)[LVi/b;

    move-result-object p0

    return-object p0
.end method

.method private static final o(LZi/H0;)I
    .locals 1

    invoke-virtual {p0}, LZi/H0;->u()[LXi/f;

    move-result-object v0

    invoke-static {p0, v0}, LZi/I0;->a(LXi/f;[LXi/f;)I

    move-result p0

    return p0
.end method

.method public static synthetic q(LZi/H0;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LZi/H0;->p(Ljava/lang/String;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addElement"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final r()Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, LZi/H0;->e:[Ljava/lang/String;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, LZi/H0;->e:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final s(LZi/H0;)[LVi/b;
    .locals 0

    iget-object p0, p0, LZi/H0;->b:LZi/M;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LZi/M;->d()[LVi/b;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, LZi/J0;->a:[LVi/b;

    :cond_1
    return-object p0
.end method

.method private final t()[LVi/b;
    .locals 1

    iget-object v0, p0, LZi/H0;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVi/b;

    return-object v0
.end method

.method private final v()I
    .locals 1

    iget-object v0, p0, LZi/H0;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private static final w(LZi/H0;I)Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, LZi/H0;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, LZi/H0;->i(I)LXi/f;

    move-result-object p0

    invoke-interface {p0}, LXi/f;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final x(LZi/H0;)[LXi/f;
    .locals 4

    iget-object p0, p0, LZi/H0;->b:LZi/M;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LZi/M;->b()[LVi/b;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-interface {v3}, LVi/b;->a()LXi/f;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    invoke-static {v0}, LZi/B0;->b(Ljava/util/List;)[LXi/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LZi/H0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LZi/H0;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZi/H0;->i:Ljava/util/Map;

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

.method public final e()I
    .locals 1

    iget v0, p0, LZi/H0;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v1, p1, LZi/H0;

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
    check-cast p1, LZi/H0;

    invoke-virtual {p0}, LZi/H0;->u()[LXi/f;

    move-result-object v1

    invoke-virtual {p1}, LZi/H0;->u()[LXi/f;

    move-result-object p1

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

    iget-object v0, p0, LZi/H0;->e:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LZi/H0;->f:[Ljava/util/List;

    aget-object p1, v0, p1

    if-nez p1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LZi/H0;->g:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public h()LXi/m;
    .locals 1

    sget-object v0, LXi/n$a;->a:LXi/n$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-direct {p0}, LZi/H0;->v()I

    move-result v0

    return v0
.end method

.method public i(I)LXi/f;
    .locals 1

    invoke-direct {p0}, LZi/H0;->t()[LVi/b;

    move-result-object v0

    aget-object p1, v0, p1

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object p1

    return-object p1
.end method

.method public j(I)Z
    .locals 1

    iget-object v0, p0, LZi/H0;->h:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final p(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZi/H0;->e:[Ljava/lang/String;

    iget v1, p0, LZi/H0;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LZi/H0;->d:I

    aput-object p1, v0, v1

    iget-object p1, p0, LZi/H0;->h:[Z

    aput-boolean p2, p1, v1

    iget-object p1, p0, LZi/H0;->f:[Ljava/util/List;

    const/4 p2, 0x0

    aput-object p2, p1, v1

    iget p1, p0, LZi/H0;->c:I

    add-int/lit8 p1, p1, -0x1

    if-ne v1, p1, :cond_0

    invoke-direct {p0}, LZi/H0;->r()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LZi/H0;->i:Ljava/util/Map;

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    iget v1, p0, LZi/H0;->c:I

    invoke-static {v0, v1}, Lsh/m;->s(II)Lsh/i;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LZi/H0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v8, LZi/D0;

    invoke-direct {v8, p0}, LZi/D0;-><init>(LZi/H0;)V

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

.method public final u()[LXi/f;
    .locals 1

    iget-object v0, p0, LZi/H0;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXi/f;

    return-object v0
.end method
