.class public final LNh/D;
.super LDh/H;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNh/D$a;
    }
.end annotation


# static fields
.field static final synthetic o:[Lth/l;


# instance fields
.field private final g:LQh/u;

.field private final h:LMh/k;

.field private final i:LYh/e;

.field private final j:Loi/i;

.field private final k:LNh/f;

.field private final l:Loi/i;

.field private final m:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

.field private final n:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LNh/D;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "binaryClasses"

    const-string v4, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "partToFacade"

    const-string v4, "getPartToFacade()Ljava/util/HashMap;"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LNh/D;->o:[Lth/l;

    return-void
.end method

.method public constructor <init>(LMh/k;LQh/u;)V
    .locals 8

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jPackage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LMh/k;->d()LBh/G;

    move-result-object v0

    invoke-interface {p2}, LQh/u;->e()LZh/c;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LDh/H;-><init>(LBh/G;LZh/c;)V

    iput-object p2, p0, LNh/D;->g:LQh/u;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p0

    invoke-static/range {v2 .. v7}, LMh/c;->f(LMh/k;LBh/g;LQh/z;IILjava/lang/Object;)LMh/k;

    move-result-object v0

    iput-object v0, p0, LNh/D;->h:LMh/k;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->b()LSh/n;

    move-result-object p1

    invoke-virtual {p1}, LSh/n;->f()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->g()Lli/o;

    move-result-object p1

    invoke-static {p1}, Lxi/c;->a(Lli/o;)LYh/e;

    move-result-object p1

    iput-object p1, p0, LNh/D;->i:LYh/e;

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance v1, LNh/A;

    invoke-direct {v1, p0}, LNh/A;-><init>(LNh/D;)V

    invoke-interface {p1, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LNh/D;->j:Loi/i;

    new-instance p1, LNh/f;

    invoke-direct {p1, v0, p2, p0}, LNh/f;-><init>(LMh/k;LQh/u;LNh/D;)V

    iput-object p1, p0, LNh/D;->k:LNh/f;

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance v1, LNh/B;

    invoke-direct {v1, p0}, LNh/B;-><init>(LNh/D;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Loi/n;->g(Lmh/a;Ljava/lang/Object;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LNh/D;->l:Loi/i;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->i()LJh/D;

    move-result-object p1

    invoke-virtual {p1}, LJh/D;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v0, p2}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LNh/D;->m:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance p2, LNh/C;

    invoke-direct {p2, p0}, LNh/C;-><init>(LNh/D;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LNh/D;->n:Loi/i;

    return-void
.end method

.method static synthetic G0(LNh/D;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, LNh/D;->M0(LNh/D;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic K0(LNh/D;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LNh/D;->S0(LNh/D;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic L0(LNh/D;)Ljava/util/HashMap;
    .locals 0

    invoke-static {p0}, LNh/D;->R0(LNh/D;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(LNh/D;)Ljava/util/Map;
    .locals 6

    iget-object v0, p0, LNh/D;->h:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->o()LSh/D;

    move-result-object v0

    invoke-virtual {p0}, LDh/H;->e()LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "asString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LSh/D;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, LZh/b;->d:LZh/b$a;

    invoke-static {v2}, Lgi/d;->d(Ljava/lang/String;)Lgi/d;

    move-result-object v4

    invoke-virtual {v4}, Lgi/d;->e()LZh/c;

    move-result-object v4

    const-string v5, "getFqNameForTopLevelClassMaybeWithDollars(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v3

    iget-object v4, p0, LNh/D;->h:LMh/k;

    invoke-virtual {v4}, LMh/k;->a()LMh/d;

    move-result-object v4

    invoke-virtual {v4}, LMh/d;->j()LSh/v;

    move-result-object v4

    iget-object v5, p0, LNh/D;->i:LYh/e;

    invoke-static {v4, v3, v5}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, LZg/U;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(LNh/D;)Ljava/util/HashMap;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, LNh/D;->O0()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LSh/x;

    invoke-static {v2}, Lgi/d;->d(Ljava/lang/String;)Lgi/d;

    move-result-object v2

    const-string v3, "byInternalName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, LSh/x;->a()LTh/a;

    move-result-object v1

    invoke-virtual {v1}, LTh/a;->c()LTh/a$a;

    move-result-object v3

    sget-object v4, LNh/D$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v1, 0x2

    if-eq v3, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, LTh/a;->e()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lgi/d;->d(Ljava/lang/String;)Lgi/d;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private static final S0(LNh/D;)Ljava/util/List;
    .locals 2

    iget-object p0, p0, LNh/D;->g:LQh/u;

    invoke-interface {p0}, LQh/u;->z()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQh/u;

    invoke-interface {v1}, LQh/u;->e()LZh/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final N0(LQh/g;)LBh/e;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/D;->k:LNh/f;

    invoke-virtual {v0}, LNh/f;->i()LNh/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LNh/G;->k0(LQh/g;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public final O0()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LNh/D;->j:Loi/i;

    sget-object v1, LNh/D;->o:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public P0()LNh/f;
    .locals 1

    iget-object v0, p0, LNh/D;->k:LNh/f;

    return-object v0
.end method

.method public final Q0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNh/D;->l:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    iget-object v0, p0, LNh/D;->m:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-object v0
.end method

.method public j()LBh/g0;
    .locals 1

    new-instance v0, LSh/y;

    invoke-direct {v0, p0}, LSh/y;-><init>(LNh/D;)V

    return-object v0
.end method

.method public bridge synthetic r()Lii/k;
    .locals 1

    invoke-virtual {p0}, LNh/D;->P0()LNh/f;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java package fragment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/H;->e()LZh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LNh/D;->h:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->m()LBh/G;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
