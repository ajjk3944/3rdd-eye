.class public abstract LDh/g;
.super LDh/n;
.source "SourceFile"

# interfaces
.implements LBh/k0;


# static fields
.field static final synthetic j:[Lth/l;


# instance fields
.field private final e:Loi/n;

.field private final f:LBh/u;

.field private final g:Loi/i;

.field private h:Ljava/util/List;

.field private final i:LDh/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LDh/g;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "constructors"

    const-string v3, "getConstructors()Ljava/util/Collection;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LDh/g;->j:[Lth/l;

    return-void
.end method

.method public constructor <init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;LBh/u;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElement"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibilityImpl"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4, p5}, LDh/n;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;)V

    iput-object p1, p0, LDh/g;->e:Loi/n;

    iput-object p6, p0, LDh/g;->f:LBh/u;

    new-instance p2, LDh/d;

    invoke-direct {p2, p0}, LDh/d;-><init>(LDh/g;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LDh/g;->g:Loi/i;

    new-instance p1, LDh/g$a;

    invoke-direct {p1, p0}, LDh/g$a;-><init>(LDh/g;)V

    iput-object p1, p0, LDh/g;->i:LDh/g$a;

    return-void
.end method

.method static synthetic G0(LDh/g;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, LDh/g;->O0(LDh/g;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic K0(LDh/g;Lpi/M0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LDh/g;->T0(LDh/g;Lpi/M0;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic L0(LDh/g;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-static {p0, p1}, LDh/g;->N0(LDh/g;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(LDh/g;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->f(LBh/m;)LBh/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LBh/h;->u()Lpi/d0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final O0(LDh/g;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0}, LDh/g;->Q0()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(LDh/g;Lpi/M0;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    instance-of v0, p1, LBh/l0;

    if-eqz v0, :cond_0

    check-cast p1, LBh/l0;

    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic B0()LBh/p;
    .locals 1

    invoke-virtual {p0}, LDh/g;->P0()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method public F0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public M()Z
    .locals 2

    invoke-interface {p0}, LBh/k0;->f0()Lpi/d0;

    move-result-object v0

    new-instance v1, LDh/e;

    invoke-direct {v1, p0}, LDh/e;-><init>(LDh/g;)V

    invoke-static {v0, v1}, Lpi/J0;->c(Lpi/S;Lmh/l;)Z

    move-result v0

    return v0
.end method

.method protected final M0()Lpi/d0;
    .locals 2

    invoke-interface {p0}, LBh/k0;->t()LBh/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LBh/e;->E0()Lii/k;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lii/k$b;->b:Lii/k$b;

    :cond_1
    new-instance v1, LDh/f;

    invoke-direct {v1, p0}, LDh/f;-><init>(LDh/g;)V

    invoke-static {p0, v0, v1}, Lpi/J0;->u(LBh/h;Lii/k;Lmh/l;)Lpi/d0;

    move-result-object v0

    const-string v1, "makeUnsubstitutedType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public P0()LBh/k0;
    .locals 2

    invoke-super {p0}, LDh/n;->B0()LBh/p;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/k0;

    return-object v0
.end method

.method public final Q0()Ljava/util/Collection;
    .locals 5

    invoke-interface {p0}, LBh/k0;->t()LBh/e;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_0
    invoke-interface {v0}, LBh/e;->m()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getConstructors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/d;

    sget-object v3, LDh/T;->I:LDh/T$a;

    iget-object v4, p0, LDh/g;->e:Loi/n;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3, v4, p0, v2}, LDh/T$a;->b(Loi/n;LBh/k0;LBh/d;)LDh/Q;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method protected abstract R0()Ljava/util/List;
.end method

.method public final S0(Ljava/util/List;)V
    .locals 1

    const-string v0, "declaredTypeParameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDh/g;->h:Ljava/util/List;

    return-void
.end method

.method public bridge synthetic a()LBh/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/g;->P0()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/g;->P0()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method protected final g0()Loi/n;
    .locals 1

    iget-object v0, p0, LDh/g;->e:Loi/n;

    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 1

    iget-object v0, p0, LDh/g;->f:LBh/u;

    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k()Lpi/v0;
    .locals 1

    iget-object v0, p0, LDh/g;->i:LDh/g$a;

    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LBh/o;->g(LBh/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "typealias "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LDh/g;->h:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "declaredTypeParametersImpl"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
