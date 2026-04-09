.class public final Lkotlin/reflect/jvm/internal/impl/types/error/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/G;


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/types/error/e;

.field private static final b:LZh/f;

.field private static final c:Ljava/util/List;

.field private static final d:Ljava/util/List;

.field private static final e:Ljava/util/Set;

.field private static final f:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/e;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->a:Lkotlin/reflect/jvm/internal/impl/types/error/e;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/b;->ERROR_MODULE:Lkotlin/reflect/jvm/internal/impl/types/error/b;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/b;->getDebugText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "special(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->b:LZh/f;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->c:Ljava/util/List;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->d:Ljava/util/List;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->e:Ljava/util/Set;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/d;->a:Lkotlin/reflect/jvm/internal/impl/types/error/d;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->f:LYg/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic I()Lkotlin/reflect/jvm/internal/impl/builtins/g;
    .locals 1

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/error/e;->i0()Lkotlin/reflect/jvm/internal/impl/builtins/g;

    move-result-object v0

    return-object v0
.end method

.method private static final i0()Lkotlin/reflect/jvm/internal/impl/builtins/g;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/g;->h:Lkotlin/reflect/jvm/internal/impl/builtins/g$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/g$a;->a()Lkotlin/reflect/jvm/internal/impl/builtins/g;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public B0()LZh/f;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->b:LZh/f;

    return-object v0
.end method

.method public K(LBh/G;)Z
    .locals 1

    const-string v0, "targetModule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public a()LBh/m;
    .locals 0

    return-object p0
.end method

.method public b()LBh/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b0(LBh/F;)Ljava/lang/Object;
    .locals 1

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    return-object v0
.end method

.method public getName()LZh/f;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/e;->B0()LZh/f;

    move-result-object v0

    return-object v0
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/builtins/i;

    return-object v0
.end method

.method public r0()Ljava/util/List;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->d:Ljava/util/List;

    return-object v0
.end method

.method public s(LZh/c;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "visitor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public y(LZh/c;)LBh/U;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
