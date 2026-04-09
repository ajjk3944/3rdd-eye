.class public final LZi/G;
.super LZi/H0;
.source "SourceFile"


# instance fields
.field private final m:LXi/m;

.field private final n:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    invoke-direct/range {v1 .. v6}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, LXi/m$b;->a:LXi/m$b;

    iput-object v0, p0, LZi/G;->m:LXi/m;

    new-instance v0, LZi/F;

    invoke-direct {v0, p2, p1, p0}, LZi/F;-><init>(ILjava/lang/String;LZi/G;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LZi/G;->n:LYg/m;

    return-void
.end method

.method private final A()[LXi/f;
    .locals 1

    iget-object v0, p0, LZi/G;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXi/f;

    return-object v0
.end method

.method public static synthetic y(ILjava/lang/String;LZi/G;)[LXi/f;
    .locals 0

    invoke-static {p0, p1, p2}, LZi/G;->z(ILjava/lang/String;LZi/G;)[LXi/f;

    move-result-object p0

    return-object p0
.end method

.method private static final z(ILjava/lang/String;LZi/G;)[LXi/f;
    .locals 11

    new-array v0, p0, [LXi/f;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p0, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x2e

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, LZi/H0;->f(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LXi/n$d;->a:LXi/n$d;

    new-array v7, v1, [LXi/f;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LXi/l;->e(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;ILjava/lang/Object;)LXi/f;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, LXi/f;

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, LXi/f;

    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object v2

    sget-object v3, LXi/m$b;->a:LXi/m$b;

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, LZi/H0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, LXi/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    invoke-static {p0}, LZi/B0;->a(LXi/f;)Ljava/util/Set;

    move-result-object v2

    invoke-static {p1}, LZi/B0;->a(LXi/f;)Ljava/util/Set;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public h()LXi/m;
    .locals 1

    iget-object v0, p0, LZi/G;->m:LXi/m;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, LZi/H0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {p0}, LXi/j;->b(LXi/f;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x1f

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    return v0
.end method

.method public i(I)LXi/f;
    .locals 1

    invoke-direct {p0}, LZi/G;->A()[LXi/f;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    invoke-static {p0}, LXi/j;->b(LXi/f;)Ljava/lang/Iterable;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LZi/H0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x38

    const/4 v8, 0x0

    const-string v1, ", "

    const-string v3, ")"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
