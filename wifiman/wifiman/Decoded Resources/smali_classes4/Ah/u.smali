.class public final LAh/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCh/a;
.implements LCh/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/u$a;,
        LAh/u$b;
    }
.end annotation


# static fields
.field static final synthetic i:[Lth/l;


# instance fields
.field private final a:LBh/G;

.field private final b:LAh/d;

.field private final c:Loi/i;

.field private final d:Lpi/S;

.field private final e:Loi/i;

.field private final f:Loi/a;

.field private final g:Loi/i;

.field private final h:Loi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LAh/u;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "settings"

    const-string v4, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-string v4, "cloneableType"

    const-string v5, "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-direct {v2, v3, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v4, "notConsideredDeprecation"

    const-string v5, "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"

    invoke-direct {v3, v1, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LAh/u;->i:[Lth/l;

    return-void
.end method

.method public constructor <init>(LBh/G;Loi/n;Lmh/a;)V
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsComputation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/u;->a:LBh/G;

    sget-object p1, LAh/d;->a:LAh/d;

    iput-object p1, p0, LAh/u;->b:LAh/d;

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LAh/u;->c:Loi/i;

    invoke-direct {p0, p2}, LAh/u;->q(Loi/n;)Lpi/S;

    move-result-object p1

    iput-object p1, p0, LAh/u;->d:Lpi/S;

    new-instance p1, LAh/l;

    invoke-direct {p1, p0, p2}, LAh/l;-><init>(LAh/u;Loi/n;)V

    invoke-interface {p2, p1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LAh/u;->e:Loi/i;

    invoke-interface {p2}, Loi/n;->c()Loi/a;

    move-result-object p1

    iput-object p1, p0, LAh/u;->f:Loi/a;

    new-instance p1, LAh/m;

    invoke-direct {p1, p0}, LAh/m;-><init>(LAh/u;)V

    invoke-interface {p2, p1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LAh/u;->g:Loi/i;

    new-instance p1, LAh/n;

    invoke-direct {p1, p0}, LAh/n;-><init>(LAh/u;)V

    invoke-interface {p2, p1}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, LAh/u;->h:Loi/g;

    return-void
.end method

.method private final A(LBh/z;)LAh/u$a;
    .locals 4

    invoke-interface {p1}, LBh/z;->b()LBh/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/e;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v3, v3, v1, v2}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v2, LAh/t;

    invoke-direct {v2, p0}, LAh/t;-><init>(LAh/u;)V

    new-instance v3, LAh/u$d;

    invoke-direct {v3, p1, v1}, LAh/u$d;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/N;)V

    invoke-static {v0, v2, v3}, Lxi/b;->b(Ljava/util/Collection;Lxi/b$c;Lxi/b$d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "dfs(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LAh/u$a;

    return-object p1
.end method

.method private static final B(LAh/u;LBh/e;)Ljava/lang/Iterable;
    .locals 4

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getSupertypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    invoke-virtual {v1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-interface {v1}, Lpi/v0;->c()LBh/h;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1}, LBh/h;->a()LBh/h;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    instance-of v3, v1, LBh/e;

    if-eqz v3, :cond_2

    check-cast v1, LBh/e;

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-direct {p0, v1}, LAh/u;->z(LBh/e;)LNh/n;

    move-result-object v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method private final C()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 3

    iget-object v0, p0, LAh/u;->g:Loi/i;

    sget-object v1, LAh/u;->i:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-object v0
.end method

.method private final D()LAh/k$b;
    .locals 3

    iget-object v0, p0, LAh/u;->c:Loi/i;

    sget-object v1, LAh/u;->i:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAh/k$b;

    return-object v0
.end method

.method private final E(LBh/f0;Z)Z
    .locals 4

    invoke-interface {p1}, LBh/z;->b()LBh/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/e;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v3, v3, v1, v2}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, LAh/x;->a:LAh/x;

    invoke-virtual {v2}, LAh/x;->g()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LSh/F;->a:LSh/F;

    invoke-static {v3, v0, v1}, LSh/B;->a(LSh/F;LBh/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr p2, v0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    sget-object p2, LAh/r;->a:LAh/r;

    new-instance v0, LAh/s;

    invoke-direct {v0, p0}, LAh/s;-><init>(LAh/u;)V

    invoke-static {p1, p2, v0}, Lxi/b;->e(Ljava/util/Collection;Lxi/b$c;Lmh/l;)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "ifAny(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method private static final F(LBh/b;)Ljava/lang/Iterable;
    .locals 0

    invoke-interface {p0}, LBh/b;->a()LBh/b;

    move-result-object p0

    invoke-interface {p0}, LBh/b;->f()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method

.method private static final G(LAh/u;LBh/b;)Ljava/lang/Boolean;
    .locals 2

    invoke-interface {p1}, LBh/b;->h()LBh/b$a;

    move-result-object v0

    sget-object v1, LBh/b$a;->DECLARATION:LBh/b$a;

    if-ne v0, v1, :cond_0

    iget-object p0, p0, LAh/u;->b:LAh/d;

    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LBh/e;

    invoke-virtual {p0, p1}, LAh/d;->c(LBh/e;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final H(LBh/l;LBh/e;)Z
    .locals 2

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/s0;

    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private static final I(LAh/u;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 7

    iget-object p0, p0, LAh/u;->a:LBh/G;

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->c(Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(LAh/u;Loi/n;)Lpi/d0;
    .locals 0

    invoke-static {p0, p1}, LAh/u;->o(LAh/u;Loi/n;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(LAh/u;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 0

    invoke-static {p0}, LAh/u;->I(LAh/u;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(LAh/u;LYg/s;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 0

    invoke-static {p0, p1}, LAh/u;->s(LAh/u;LYg/s;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(LAh/u;)Lpi/S;
    .locals 0

    invoke-static {p0}, LAh/u;->r(LAh/u;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(LZh/f;Lii/k;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LAh/u;->x(LZh/f;Lii/k;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(LNh/n;LBh/e;)LBh/e;
    .locals 0

    invoke-static {p0, p1}, LAh/u;->u(LNh/n;LBh/e;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(LBh/b;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, LAh/u;->F(LBh/b;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(LAh/u;LBh/b;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LAh/u;->G(LAh/u;LBh/b;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(LAh/u;LBh/e;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1}, LAh/u;->B(LAh/u;LBh/e;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method private static final o(LAh/u;Loi/n;)Lpi/d0;
    .locals 3

    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object v0

    invoke-virtual {v0}, LAh/k$b;->a()LBh/G;

    move-result-object v0

    sget-object v1, LAh/g;->d:LAh/g$a;

    invoke-virtual {v1}, LAh/g$a;->a()LZh/b;

    move-result-object v1

    new-instance v2, LBh/L;

    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object p0

    invoke-virtual {p0}, LAh/k$b;->a()LBh/G;

    move-result-object p0

    invoke-direct {v2, p1, p0}, LBh/L;-><init>(Loi/n;LBh/G;)V

    invoke-static {v0, v1, v2}, LBh/y;->d(LBh/G;LZh/b;LBh/L;)LBh/e;

    move-result-object p0

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lni/m;LBh/f0;)LBh/f0;
    .locals 1

    invoke-interface {p2}, LBh/f0;->v()LBh/z$a;

    move-result-object p2

    invoke-interface {p2, p1}, LBh/z$a;->p(LBh/m;)LBh/z$a;

    sget-object v0, LBh/t;->e:LBh/u;

    invoke-interface {p2, v0}, LBh/z$a;->f(LBh/u;)LBh/z$a;

    invoke-virtual {p1}, LDh/a;->u()Lpi/d0;

    move-result-object v0

    invoke-interface {p2, v0}, LBh/z$a;->g(Lpi/S;)LBh/z$a;

    invoke-virtual {p1}, LDh/a;->J0()LBh/b0;

    move-result-object p1

    invoke-interface {p2, p1}, LBh/z$a;->e(LBh/b0;)LBh/z$a;

    invoke-interface {p2}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LBh/f0;

    return-object p1
.end method

.method private final q(Loi/n;)Lpi/S;
    .locals 12

    iget-object v0, p0, LAh/u;->a:LBh/G;

    new-instance v1, LZh/c;

    const-string v2, "java.io"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v4, LAh/u$c;

    invoke-direct {v4, v0, v1}, LAh/u$c;-><init>(LBh/G;LZh/c;)V

    new-instance v0, Lpi/Y;

    new-instance v1, LAh/o;

    invoke-direct {v1, p0}, LAh/o;-><init>(LAh/u;)V

    invoke-direct {v0, p1, v1}, Lpi/Y;-><init>(Loi/n;Lmh/a;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LDh/k;

    const-string v2, "Serializable"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v5

    sget-object v6, LBh/D;->ABSTRACT:LBh/D;

    sget-object v7, LBh/f;->INTERFACE:LBh/f;

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    sget-object v9, LBh/g0;->a:LBh/g0;

    const/4 v10, 0x0

    move-object v3, v1

    move-object v11, p1

    invoke-direct/range {v3 .. v11}, LDh/k;-><init>(LBh/m;LZh/f;LBh/D;LBh/f;Ljava/util/Collection;LBh/g0;ZLoi/n;)V

    sget-object p1, Lii/k$b;->b:Lii/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, LDh/k;->K0(Lii/k;Ljava/util/Set;LBh/d;)V

    invoke-virtual {v1}, LDh/a;->u()Lpi/d0;

    move-result-object p1

    const-string v0, "getDefaultType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final r(LAh/u;)Lpi/S;
    .locals 1

    iget-object p0, p0, LAh/u;->a:LBh/G;

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object p0

    const-string v0, "getAnyType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final s(LAh/u;LYg/s;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p0, p0, LAh/u;->a:LBh/G;

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "()\' member of List is redundant in Kotlin and might be removed soon. Please use \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "()\' stdlib extension instead"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "()"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-static {p0, v0, p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    return-object p0
.end method

.method private final t(LBh/e;Lmh/l;)Ljava/util/Collection;
    .locals 7

    invoke-direct {p0, p1}, LAh/u;->z(LBh/e;)LNh/n;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object v1, p0, LAh/u;->b:LAh/d;

    invoke-static {v0}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v2

    sget-object v3, LAh/b;->h:LAh/b$a;

    invoke-virtual {v3}, LAh/b$a;->a()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LAh/d;->g(LZh/c;Lkotlin/reflect/jvm/internal/impl/builtins/i;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LZg/v;->C0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/e;

    if-nez v2, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_1
    sget-object v3, Lxi/l;->c:Lxi/l$b;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBh/e;

    invoke-static {v5}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v3, v4}, Lxi/l$b;->b(Ljava/util/Collection;)Lxi/l;

    move-result-object v1

    iget-object v3, p0, LAh/u;->b:LAh/d;

    invoke-virtual {v3, p1}, LAh/d;->c(LBh/e;)Z

    move-result p1

    iget-object v3, p0, LAh/u;->f:Loi/a;

    invoke-static {v0}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v4

    new-instance v5, LAh/q;

    invoke-direct {v5, v0, v2}, LAh/q;-><init>(LNh/n;LBh/e;)V

    invoke-interface {v3, v4, v5}, Loi/a;->a(Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/e;

    invoke-interface {v0}, LBh/e;->E0()Lii/k;

    move-result-object v0

    const-string v2, "getUnsubstitutedMemberScope(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LBh/f0;

    invoke-interface {v3}, LBh/b;->h()LBh/b$a;

    move-result-object v4

    sget-object v5, LBh/b$a;->DECLARATION:LBh/b$a;

    if-eq v4, v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v3}, LBh/C;->getVisibility()LBh/u;

    move-result-object v4

    invoke-virtual {v4}, LBh/u;->d()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k0(LBh/m;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_6
    invoke-interface {v3}, LBh/z;->f()Ljava/util/Collection;

    move-result-object v4

    const-string v5, "getOverriddenDescriptors(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_7

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBh/z;

    invoke-interface {v5}, LBh/z;->b()LBh/m;

    move-result-object v5

    const-string v6, "getContainingDeclaration(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v5

    invoke-virtual {v1, v5}, Lxi/l;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_1

    :cond_9
    :goto_2
    invoke-direct {p0, v3, p1}, LAh/u;->E(LBh/f0;Z)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_a
    return-object v0
.end method

.method private static final u(LNh/n;LBh/e;)LBh/e;
    .locals 2

    sget-object v0, LKh/j;->a:LKh/j;

    const-string v1, "EMPTY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, LNh/n;->P0(LKh/j;LBh/e;)LNh/n;

    move-result-object p0

    return-object p0
.end method

.method private final v()Lpi/d0;
    .locals 3

    iget-object v0, p0, LAh/u;->e:Loi/i;

    sget-object v1, LAh/u;->i:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/d0;

    return-object v0
.end method

.method private static final w(LBh/l;Lpi/G0;LBh/l;)Z
    .locals 0

    invoke-interface {p2, p1}, LBh/l;->c(Lpi/G0;)LBh/l;

    move-result-object p1

    invoke-static {p0, p1}, Lbi/o;->x(LBh/a;LBh/a;)Lbi/o$i$a;

    move-result-object p0

    sget-object p1, Lbi/o$i$a;->OVERRIDABLE:Lbi/o$i$a;

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final x(LZh/f;Lii/k;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LIh/d;->FROM_BUILTINS:LIh/d;

    invoke-interface {p1, p0, v0}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final z(LBh/e;)LNh/n;
    .locals 3

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a0(LBh/e;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->B0(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p1}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p1

    invoke-virtual {p1}, LZh/d;->f()Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    sget-object v0, LAh/c;->a:LAh/c;

    invoke-virtual {v0, p1}, LAh/c;->n(LZh/d;)LZh/b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object v0

    invoke-virtual {v0}, LAh/k$b;->a()LBh/G;

    move-result-object v0

    sget-object v2, LIh/d;->FROM_BUILTINS:LIh/d;

    invoke-static {v0, p1, v2}, LBh/s;->d(LBh/G;LZh/c;LIh/b;)LBh/e;

    move-result-object p1

    instance-of v0, p1, LNh/n;

    if-eqz v0, :cond_4

    move-object v1, p1

    check-cast v1, LNh/n;

    :cond_4
    :goto_0
    return-object v1
.end method


# virtual methods
.method public a(LBh/e;)Ljava/util/Collection;
    .locals 12

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/e;->h()LBh/f;

    move-result-object v0

    sget-object v1, LBh/f;->CLASS:LBh/f;

    if-ne v0, v1, :cond_a

    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object v0

    invoke-virtual {v0}, LAh/k$b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-direct {p0, p1}, LAh/u;->z(LBh/e;)LNh/n;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_1
    iget-object v1, p0, LAh/u;->b:LAh/d;

    invoke-static {v0}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v2

    sget-object v3, LAh/b;->h:LAh/b$a;

    invoke-virtual {v3}, LAh/b$a;->a()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LAh/d;->f(LAh/d;LZh/c;Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/Integer;ILjava/lang/Object;)LBh/e;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_2
    invoke-static {v1, v0}, LAh/y;->a(LBh/e;LBh/e;)Lpi/w0;

    move-result-object v2

    invoke-virtual {v2}, Lpi/E0;->c()Lpi/G0;

    move-result-object v2

    invoke-virtual {v0}, LNh/n;->R0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-eqz v5, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, LBh/d;

    invoke-interface {v9}, LBh/C;->getVisibility()LBh/u;

    move-result-object v10

    invoke-virtual {v10}, LBh/u;->d()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v1}, LBh/e;->m()Ljava/util/Collection;

    move-result-object v10

    const-string v11, "getConstructors(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/Iterable;

    instance-of v11, v10, Ljava/util/Collection;

    if-eqz v11, :cond_4

    move-object v11, v10

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LBh/d;

    invoke-static {v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v11, v2, v9}, LAh/u;->w(LBh/l;Lpi/G0;LBh/l;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_0

    :cond_6
    :goto_1
    invoke-direct {p0, v9, p1}, LAh/u;->H(LBh/l;LBh/e;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-static {v9}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k0(LBh/m;)Z

    move-result v10

    if-nez v10, :cond_3

    sget-object v10, LAh/x;->a:LAh/x;

    invoke-virtual {v10}, LAh/x;->e()Ljava/util/Set;

    move-result-object v10

    sget-object v11, LSh/F;->a:LSh/F;

    invoke-static {v9, v8, v8, v7, v6}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v11, v0, v6}, LSh/B;->a(LSh/F;LBh/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v4, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/d;

    invoke-interface {v4}, LBh/z;->v()LBh/z$a;

    move-result-object v5

    invoke-interface {v5, p1}, LBh/z$a;->p(LBh/m;)LBh/z$a;

    invoke-interface {p1}, LBh/e;->u()Lpi/d0;

    move-result-object v9

    invoke-interface {v5, v9}, LBh/z$a;->g(Lpi/S;)LBh/z$a;

    invoke-interface {v5}, LBh/z$a;->i()LBh/z$a;

    invoke-virtual {v2}, Lpi/G0;->j()Lpi/E0;

    move-result-object v9

    invoke-interface {v5, v9}, LBh/z$a;->t(Lpi/E0;)LBh/z$a;

    sget-object v9, LAh/x;->a:LAh/x;

    invoke-virtual {v9}, LAh/x;->h()Ljava/util/Set;

    move-result-object v9

    sget-object v10, LSh/F;->a:LSh/F;

    invoke-static {v4, v8, v8, v7, v6}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v0, v4}, LSh/B;->a(LSh/F;LBh/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v9, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-direct {p0}, LAh/u;->C()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    invoke-interface {v5, v4}, LBh/z$a;->r(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/z$a;

    :cond_8
    invoke-interface {v5}, LBh/z$a;->a()LBh/z;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LBh/d;

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    return-object v1

    :cond_a
    :goto_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public b(LBh/e;LBh/f0;)Z
    .locals 6

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LAh/u;->z(LBh/e;)LNh/n;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {}, LCh/d;->a()LZh/c;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object v1

    invoke-virtual {v1}, LAh/k$b;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const/4 v1, 0x3

    const/4 v3, 0x0

    invoke-static {p2, v2, v2, v1, v3}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LNh/n;->U0()LNh/z;

    move-result-object p1

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object p2

    const-string v5, "getName(...)"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LIh/d;->FROM_BUILTINS:LIh/d;

    invoke-virtual {p1, p2, v5}, LNh/z;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBh/f0;

    invoke-static {p2, v2, v2, v1, v3}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    :goto_0
    return v0
.end method

.method public c(LBh/e;)Ljava/util/Collection;
    .locals 3

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p1

    sget-object v0, LAh/x;->a:LAh/x;

    invoke-virtual {v0, p1}, LAh/x;->j(LZh/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LAh/u;->v()Lpi/d0;

    move-result-object p1

    iget-object v0, p0, LAh/u;->d:Lpi/S;

    const/4 v1, 0x2

    new-array v1, v1, [Lpi/S;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LAh/x;->k(LZh/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LAh/u;->d:Lpi/S;

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_0

    :cond_1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :goto_0
    return-object p1
.end method

.method public d(LZh/f;LBh/e;)Ljava/util/Collection;
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/a;->e:LAh/a$a;

    invoke-virtual {v0}, LAh/a$a;->a()LZh/f;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p2, Lni/m;

    if-eqz v0, :cond_3

    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->d0(LBh/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p2, Lni/m;

    invoke-virtual {p2}, Lni/m;->e1()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->R1()Ljava/util/List;

    move-result-object v0

    const-string v1, "getFunctionList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/i;

    invoke-virtual {p2}, Lni/m;->d1()Lli/p;

    move-result-object v2

    invoke-virtual {v2}, Lli/p;->g()LWh/c;

    move-result-object v2

    invoke-virtual {v1}, LUh/i;->n1()I

    move-result v1

    invoke-static {v2, v1}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v1

    sget-object v2, LAh/a;->e:LAh/a$a;

    invoke-virtual {v2}, LAh/a$a;->a()LZh/f;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_2
    :goto_0
    invoke-direct {p0}, LAh/u;->v()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->r()Lii/k;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_BUILTINS:LIh/d;

    invoke-interface {v0, p1, v1}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->Q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/f0;

    invoke-direct {p0, p2, p1}, LAh/u;->p(Lni/m;LBh/f0;)LBh/f0;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_3
    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object v0

    invoke-virtual {v0}, LAh/k$b;->b()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_4
    new-instance v0, LAh/p;

    invoke-direct {v0, p1}, LAh/p;-><init>(LZh/f;)V

    invoke-direct {p0, p2, v0}, LAh/u;->t(LBh/e;Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/f0;

    invoke-interface {v1}, LBh/z;->b()LBh/m;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LBh/e;

    invoke-static {v2, p2}, LAh/y;->a(LBh/e;LBh/e;)Lpi/w0;

    move-result-object v2

    invoke-virtual {v2}, Lpi/E0;->c()Lpi/G0;

    move-result-object v2

    invoke-interface {v1, v2}, LBh/z;->c(Lpi/G0;)LBh/z;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LBh/f0;

    invoke-interface {v2}, LBh/f0;->v()LBh/z$a;

    move-result-object v2

    invoke-interface {v2, p2}, LBh/z$a;->p(LBh/m;)LBh/z$a;

    invoke-interface {p2}, LBh/e;->J0()LBh/b0;

    move-result-object v3

    invoke-interface {v2, v3}, LBh/z$a;->e(LBh/b0;)LBh/z$a;

    invoke-interface {v2}, LBh/z$a;->i()LBh/z$a;

    invoke-direct {p0, v1}, LAh/u;->A(LBh/z;)LAh/u$a;

    move-result-object v3

    sget-object v4, LAh/u$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_b

    const/4 v4, 0x2

    if-eq v3, v4, :cond_8

    const/4 v1, 0x3

    if-eq v3, v1, :cond_7

    const/4 v1, 0x4

    if-eq v3, v1, :cond_d

    const/4 v1, 0x5

    if-ne v3, v1, :cond_6

    sget-object v1, LYg/J;->a:LYg/J;

    goto/16 :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    invoke-direct {p0}, LAh/u;->C()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-interface {v2, v1}, LBh/z$a;->r(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/z$a;

    goto :goto_3

    :cond_8
    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v3

    invoke-static {}, LAh/v;->a()LZh/f;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v3, p0, LAh/u;->h:Loi/g;

    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    const-string v4, "first"

    invoke-static {v1, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    invoke-interface {v3, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    goto :goto_2

    :cond_9
    invoke-static {}, LAh/v;->b()LZh/f;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, p0, LAh/u;->h:Loi/g;

    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    const-string v4, "last"

    invoke-static {v1, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    invoke-interface {v3, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    :goto_2
    invoke-interface {v2, v1}, LBh/z$a;->r(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/z$a;

    goto :goto_3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected name: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p2}, LBh/E;->a(LBh/e;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_4

    :cond_c
    invoke-interface {v2}, LBh/z$a;->l()LBh/z$a;

    :goto_3
    invoke-interface {v2}, LBh/z$a;->a()LBh/z;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v5, v1

    check-cast v5, LBh/f0;

    :cond_d
    :goto_4
    if-eqz v5, :cond_5

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_e
    return-object v0
.end method

.method public bridge synthetic e(LBh/e;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, LAh/u;->y(LBh/e;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public y(LBh/e;)Ljava/util/Set;
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LAh/u;->D()LAh/k$b;

    move-result-object v0

    invoke-virtual {v0}, LAh/k$b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LAh/u;->z(LBh/e;)LNh/n;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LNh/n;->U0()LNh/z;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LNh/U;->a()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    :cond_2
    return-object p1
.end method
