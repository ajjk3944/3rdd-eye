.class public final Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/builtins/i;

.field private final b:LZh/c;

.field private final c:Ljava/util/Map;

.field private final d:Z

.field private final e:LYg/m;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;Z)V
    .locals 1

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allValueArguments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->a:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    .line 3
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->b:LZh/c;

    .line 4
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->c:Ljava/util/Map;

    .line 5
    iput-boolean p4, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->d:Z

    .line 6
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/k;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/k;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->e:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;Z)V

    return-void
.end method

.method static synthetic b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;)Lpi/d0;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->c(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;)Lpi/d0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->a:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->e()LZh/c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o(LZh/c;)LBh/e;

    move-result-object p0

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->c:Ljava/util/Map;

    return-object v0
.end method

.method public e()LZh/c;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->b:LZh/c;

    return-object v0
.end method

.method public getType()Lpi/S;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lpi/S;

    return-object v0
.end method

.method public j()LBh/g0;
    .locals 2

    sget-object v0, LBh/g0;->a:LBh/g0;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
