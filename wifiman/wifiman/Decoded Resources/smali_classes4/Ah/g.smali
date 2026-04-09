.class public final LAh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCh/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/g$a;
    }
.end annotation


# static fields
.field public static final d:LAh/g$a;

.field static final synthetic e:[Lth/l;

.field private static final f:LZh/c;

.field private static final g:LZh/f;

.field private static final h:LZh/b;


# instance fields
.field private final a:LBh/G;

.field private final b:Lmh/l;

.field private final c:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LAh/g;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "cloneable"

    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LAh/g;->e:[Lth/l;

    new-instance v0, LAh/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAh/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAh/g;->d:LAh/g$a;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    sput-object v0, LAh/g;->f:LZh/c;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->d:LZh/d;

    invoke-virtual {v0}, LZh/d;->i()LZh/f;

    move-result-object v1

    const-string v2, "shortName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, LAh/g;->g:LZh/f;

    sget-object v1, LZh/b;->d:LZh/b$a;

    invoke-virtual {v0}, LZh/d;->l()LZh/c;

    move-result-object v0

    const-string v2, "toSafe(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v0

    sput-object v0, LAh/g;->h:LZh/b;

    return-void
.end method

.method public constructor <init>(Loi/n;LBh/G;Lmh/l;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeContainingDeclaration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, LAh/g;->a:LBh/G;

    .line 3
    iput-object p3, p0, LAh/g;->b:Lmh/l;

    .line 4
    new-instance p2, LAh/e;

    invoke-direct {p2, p0, p1}, LAh/e;-><init>(LAh/g;Loi/n;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LAh/g;->c:Loi/i;

    return-void
.end method

.method public synthetic constructor <init>(Loi/n;LBh/G;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, LAh/f;->a:LAh/f;

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LAh/g;-><init>(Loi/n;LBh/G;Lmh/l;)V

    return-void
.end method

.method private static final d(LBh/G;)Lkotlin/reflect/jvm/internal/impl/builtins/c;
    .locals 3

    const-string v0, "module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/g;->f:LZh/c;

    invoke-interface {p0, v0}, LBh/G;->y(LZh/c;)LBh/U;

    move-result-object p0

    invoke-interface {p0}, LBh/U;->J()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lkotlin/reflect/jvm/internal/impl/builtins/c;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/c;

    return-object p0
.end method

.method public static final synthetic e()LZh/b;
    .locals 1

    sget-object v0, LAh/g;->h:LZh/b;

    return-object v0
.end method

.method static synthetic f(LAh/g;Loi/n;)LDh/k;
    .locals 0

    invoke-static {p0, p1}, LAh/g;->h(LAh/g;Loi/n;)LDh/k;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(LBh/G;)Lkotlin/reflect/jvm/internal/impl/builtins/c;
    .locals 0

    invoke-static {p0}, LAh/g;->d(LBh/G;)Lkotlin/reflect/jvm/internal/impl/builtins/c;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LAh/g;Loi/n;)LDh/k;
    .locals 10

    new-instance v9, LDh/k;

    iget-object v0, p0, LAh/g;->b:Lmh/l;

    iget-object v1, p0, LAh/g;->a:LBh/G;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LBh/m;

    sget-object v2, LAh/g;->g:LZh/f;

    sget-object v3, LBh/D;->ABSTRACT:LBh/D;

    sget-object v4, LBh/f;->INTERFACE:LBh/f;

    iget-object p0, p0, LAh/g;->a:LBh/G;

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object p0

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/Collection;

    sget-object v6, LBh/g0;->a:LBh/g0;

    const/4 v7, 0x0

    move-object v0, v9

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, LDh/k;-><init>(LBh/m;LZh/f;LBh/D;LBh/f;Ljava/util/Collection;LBh/g0;ZLoi/n;)V

    new-instance p0, LAh/a;

    invoke-direct {p0, p1, v9}, LAh/a;-><init>(Loi/n;LBh/e;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v9, p0, p1, v0}, LDh/k;->K0(Lii/k;Ljava/util/Set;LBh/d;)V

    return-object v9
.end method

.method private final i()LDh/k;
    .locals 3

    iget-object v0, p0, LAh/g;->c:Loi/i;

    sget-object v1, LAh/g;->e:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDh/k;

    return-object v0
.end method


# virtual methods
.method public a(LZh/c;LZh/f;)Z
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/g;->g:LZh/f;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LAh/g;->f:LZh/c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(LZh/b;)LBh/e;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/g;->h:LZh/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, LAh/g;->i()LDh/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public c(LZh/c;)Ljava/util/Collection;
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/g;->f:LZh/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, LAh/g;->i()LDh/k;

    move-result-object p1

    invoke-static {p1}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :goto_0
    return-object p1
.end method
