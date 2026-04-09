.class public LDh/x;
.super LDh/m;
.source "SourceFile"

# interfaces
.implements LBh/U;


# static fields
.field static final synthetic h:[Lth/l;


# instance fields
.field private final c:LDh/F;

.field private final d:LZh/c;

.field private final e:Loi/i;

.field private final f:Loi/i;

.field private final g:Lii/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LDh/x;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "fragments"

    const-string v4, "getFragments()Ljava/util/List;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "empty"

    const-string v4, "getEmpty()Z"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LDh/x;->h:[Lth/l;

    return-void
.end method

.method public constructor <init>(LDh/F;LZh/c;Loi/n;)V
    .locals 2

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-virtual {p2}, LZh/c;->h()LZh/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LDh/m;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;)V

    iput-object p1, p0, LDh/x;->c:LDh/F;

    iput-object p2, p0, LDh/x;->d:LZh/c;

    new-instance p1, LDh/u;

    invoke-direct {p1, p0}, LDh/u;-><init>(LDh/x;)V

    invoke-interface {p3, p1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LDh/x;->e:Loi/i;

    new-instance p1, LDh/v;

    invoke-direct {p1, p0}, LDh/v;-><init>(LDh/x;)V

    invoke-interface {p3, p1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LDh/x;->f:Loi/i;

    new-instance p1, Lii/i;

    new-instance p2, LDh/w;

    invoke-direct {p2, p0}, LDh/w;-><init>(LDh/x;)V

    invoke-direct {p1, p3, p2}, Lii/i;-><init>(Loi/n;Lmh/a;)V

    iput-object p1, p0, LDh/x;->g:Lii/k;

    return-void
.end method

.method static synthetic B0(LDh/x;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LDh/x;->M0(LDh/x;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G0(LDh/x;)Z
    .locals 0

    invoke-static {p0}, LDh/x;->L0(LDh/x;)Z

    move-result p0

    return p0
.end method

.method static synthetic K0(LDh/x;)Lii/k;
    .locals 0

    invoke-static {p0}, LDh/x;->Q0(LDh/x;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(LDh/x;)Z
    .locals 1

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v0

    invoke-virtual {v0}, LDh/F;->M0()LBh/N;

    move-result-object v0

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object p0

    invoke-static {v0, p0}, LBh/S;->b(LBh/N;LZh/c;)Z

    move-result p0

    return p0
.end method

.method private static final M0(LDh/x;)Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v0

    invoke-virtual {v0}, LDh/F;->M0()LBh/N;

    move-result-object v0

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object p0

    invoke-static {v0, p0}, LBh/S;->c(LBh/N;LZh/c;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(LDh/x;)Lii/k;
    .locals 4

    invoke-virtual {p0}, LDh/x;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lii/k$b;->b:Lii/k$b;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LDh/x;->J()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/M;

    invoke-interface {v2}, LBh/M;->r()Lii/k;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LDh/P;

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v2

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object v3

    invoke-direct {v0, v2, v3}, LDh/P;-><init>(LBh/G;LZh/c;)V

    invoke-static {v1, v0}, LZg/v;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lii/b;->d:Lii/b$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package view scope for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object p0

    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v1, p0, v0}, Lii/b$a;->a(Ljava/lang/String;Ljava/lang/Iterable;)Lii/k;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public J()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LDh/x;->e:Loi/i;

    sget-object v1, LDh/x;->h:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public N0()LBh/U;
    .locals 3

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object v0

    invoke-virtual {v0}, LZh/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v0

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->e()LZh/c;

    move-result-object v1

    const-string v2, "parent(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LDh/F;->y(LZh/c;)LBh/U;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected final O0()Z
    .locals 3

    iget-object v0, p0, LDh/x;->f:Loi/i;

    sget-object v1, LDh/x;->h:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public P0()LDh/F;
    .locals 1

    iget-object v0, p0, LDh/x;->c:LDh/F;

    return-object v0
.end method

.method public bridge synthetic b()LBh/m;
    .locals 1

    invoke-virtual {p0}, LDh/x;->N0()LBh/U;

    move-result-object v0

    return-object v0
.end method

.method public e()LZh/c;
    .locals 1

    iget-object v0, p0, LDh/x;->d:LZh/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LBh/U;

    if-eqz v0, :cond_0

    check-cast p1, LBh/U;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object v1

    invoke-interface {p1}, LBh/U;->e()LZh/c;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v1

    invoke-interface {p1}, LBh/U;->u0()LBh/G;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LDh/x;->e()LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, LDh/x;->O0()Z

    move-result v0

    return v0
.end method

.method public r()Lii/k;
    .locals 1

    iget-object v0, p0, LDh/x;->g:Lii/k;

    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LBh/o;->b(LBh/U;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u0()LBh/G;
    .locals 1

    invoke-virtual {p0}, LDh/x;->P0()LDh/F;

    move-result-object v0

    return-object v0
.end method
