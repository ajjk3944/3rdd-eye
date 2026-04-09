.class public final LDh/F;
.super LDh/m;
.source "SourceFile"

# interfaces
.implements LBh/G;


# instance fields
.field private final c:Loi/n;

.field private final d:Lkotlin/reflect/jvm/internal/impl/builtins/i;

.field private final e:LZh/f;

.field private final f:Ljava/util/Map;

.field private final g:LDh/I;

.field private h:LDh/B;

.field private i:LBh/N;

.field private j:Z

.field private final k:Loi/g;

.field private final l:LYg/m;


# direct methods
.method public constructor <init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;)V
    .locals 10

    .line 1
    const-string v0, "moduleName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v9}, LDh/F;-><init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;Ljava/util/Map;LZh/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;Ljava/util/Map;LZh/f;)V
    .locals 0

    const-string p4, "moduleName"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "storageManager"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builtIns"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "capabilities"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object p4, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p4

    invoke-direct {p0, p4, p1}, LDh/m;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;)V

    .line 5
    iput-object p2, p0, LDh/F;->c:Loi/n;

    .line 6
    iput-object p3, p0, LDh/F;->d:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    .line 7
    iput-object p6, p0, LDh/F;->e:LZh/f;

    .line 8
    invoke-virtual {p1}, LZh/f;->j()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 9
    iput-object p5, p0, LDh/F;->f:Ljava/util/Map;

    .line 10
    sget-object p1, LDh/I;->a:LDh/I$a;

    invoke-virtual {p1}, LDh/I$a;->a()LBh/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LDh/F;->b0(LBh/F;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDh/I;

    if-nez p1, :cond_0

    sget-object p1, LDh/I$b;->b:LDh/I$b;

    :cond_0
    iput-object p1, p0, LDh/F;->g:LDh/I;

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, LDh/F;->j:Z

    .line 12
    new-instance p1, LDh/D;

    invoke-direct {p1, p0}, LDh/D;-><init>(LDh/F;)V

    invoke-interface {p2, p1}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, LDh/F;->k:Loi/g;

    .line 13
    new-instance p1, LDh/E;

    invoke-direct {p1, p0}, LDh/E;-><init>(LDh/F;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LDh/F;->l:LYg/m;

    return-void

    .line 14
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Module name must be special: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public synthetic constructor <init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;Ljava/util/Map;LZh/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, p6

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 3
    invoke-direct/range {v2 .. v8}, LDh/F;-><init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;Ljava/util/Map;LZh/f;)V

    return-void
.end method

.method static synthetic B0(LDh/F;LZh/c;)LBh/U;
    .locals 0

    invoke-static {p0, p1}, LDh/F;->S0(LDh/F;LZh/c;)LBh/U;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G0(LDh/F;)LDh/l;
    .locals 0

    invoke-static {p0}, LDh/F;->R0(LDh/F;)LDh/l;

    move-result-object p0

    return-object p0
.end method

.method private final L0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final N0()LDh/l;
    .locals 1

    iget-object v0, p0, LDh/F;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDh/l;

    return-object v0
.end method

.method private final P0()Z
    .locals 1

    iget-object v0, p0, LDh/F;->i:LBh/N;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final R0(LDh/F;)LDh/l;
    .locals 3

    iget-object v0, p0, LDh/F;->h:LDh/B;

    if-eqz v0, :cond_2

    invoke-interface {v0}, LDh/B;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, LDh/F;->K0()V

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDh/F;

    invoke-direct {v2}, LDh/F;->P0()Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDh/F;

    iget-object v2, v2, LDh/F;->i:LBh/N;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CompositeProvider@ModuleDescriptor for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, LDh/l;

    invoke-direct {v0, v1, p0}, LDh/l;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dependencies of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LDh/F;->L0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " were not set before querying module content"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method private static final S0(LDh/F;LZh/c;)LBh/U;
    .locals 2

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDh/F;->g:LDh/I;

    iget-object v1, p0, LDh/F;->c:Loi/n;

    invoke-interface {v0, p0, p1, v1}, LDh/I;->a(LDh/F;LZh/c;Loi/n;)LBh/U;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public K(LBh/G;)Z
    .locals 2

    const-string v0, "targetModule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LDh/F;->h:LDh/B;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, LDh/B;->b()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p1}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LDh/F;->r0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, LBh/G;->r0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public K0()V
    .locals 1

    invoke-virtual {p0}, LDh/F;->Q0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, LBh/B;->a(LBh/G;)V

    :cond_0
    return-void
.end method

.method public final M0()LBh/N;
    .locals 1

    invoke-virtual {p0}, LDh/F;->K0()V

    invoke-direct {p0}, LDh/F;->N0()LDh/l;

    move-result-object v0

    return-object v0
.end method

.method public final O0(LBh/N;)V
    .locals 1

    const-string v0, "providerForModuleContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LDh/F;->P0()Z

    iput-object p1, p0, LDh/F;->i:LBh/N;

    return-void
.end method

.method public Q0()Z
    .locals 1

    iget-boolean v0, p0, LDh/F;->j:Z

    return v0
.end method

.method public final T0(LDh/B;)V
    .locals 1

    const-string v0, "dependencies"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDh/F;->h:LDh/B;

    return-void
.end method

.method public final U0(Ljava/util/List;)V
    .locals 1

    const-string v0, "descriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LDh/F;->V0(Ljava/util/List;Ljava/util/Set;)V

    return-void
.end method

.method public final V0(Ljava/util/List;Ljava/util/Set;)V
    .locals 3

    const-string v0, "descriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "friends"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDh/C;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, p1, p2, v1, v2}, LDh/C;-><init>(Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V

    invoke-virtual {p0, v0}, LDh/F;->T0(LDh/B;)V

    return-void
.end method

.method public final varargs W0([LDh/F;)V
    .locals 1

    const-string v0, "descriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/n;->d1([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LDh/F;->U0(Ljava/util/List;)V

    return-void
.end method

.method public b()LBh/m;
    .locals 1

    invoke-static {p0}, LBh/G$a;->b(LBh/G;)LBh/m;

    move-result-object v0

    return-object v0
.end method

.method public b0(LBh/F;)Ljava/lang/Object;
    .locals 1

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDh/F;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    iget-object v0, p0, LDh/F;->d:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    return-object v0
.end method

.method public r0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LDh/F;->h:LDh/B;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LDh/B;->c()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dependencies of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LDh/F;->L0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " were not set"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public s(LZh/c;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/F;->K0()V

    invoke-virtual {p0}, LDh/F;->M0()LBh/N;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LBh/N;->s(LZh/c;Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LBh/G$a;->a(LBh/G;LBh/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LDh/m;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/F;->Q0()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, " !isValid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " packageFragmentProvider: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LDh/F;->i:LBh/N;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public y(LZh/c;)LBh/U;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/F;->K0()V

    iget-object v0, p0, LDh/F;->k:Loi/g;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/U;

    return-object p1
.end method
