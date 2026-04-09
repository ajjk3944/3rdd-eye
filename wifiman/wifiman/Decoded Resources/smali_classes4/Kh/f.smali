.class public final LKh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LKh/f;

.field private static final b:Ljava/util/Map;

.field private static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, LKh/f;

    invoke-direct {v0}, LKh/f;-><init>()V

    sput-object v0, LKh/f;->a:LKh/f;

    const-class v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "PACKAGE"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->CLASS:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->FILE:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "TYPE"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->ANNOTATION_CLASS:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "ANNOTATION_TYPE"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->TYPE_PARAMETER:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "TYPE_PARAMETER"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->FIELD:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "FIELD"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->LOCAL_VARIABLE:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "LOCAL_VARIABLE"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->VALUE_PARAMETER:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "PARAMETER"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->CONSTRUCTOR:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "CONSTRUCTOR"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->FUNCTION:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->PROPERTY_GETTER:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    sget-object v10, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->PROPERTY_SETTER:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0, v1, v10}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "METHOD"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;->TYPE:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "TYPE_USE"

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v11

    filled-new-array/range {v2 .. v11}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LKh/f;->b:Ljava/util/Map;

    const-string v0, "RUNTIME"

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;->RUNTIME:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    const-string v1, "CLASS"

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;->BINARY:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    const-string v2, "SOURCE"

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;->SOURCE:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LKh/f;->c:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(LBh/G;)Lpi/S;
    .locals 0

    invoke-static {p0}, LKh/f;->e(LBh/G;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LBh/G;)Lpi/S;
    .locals 2

    const-string v0, "module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LKh/d;->a:LKh/d;

    invoke-virtual {v0}, LKh/d;->d()LZh/f;

    move-result-object v0

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->H:LZh/c;

    invoke-virtual {p0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o(LZh/c;)LBh/e;

    move-result-object p0

    invoke-static {v0, p0}, LKh/a;->b(LZh/f;LBh/e;)LBh/s0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNMAPPED_ANNOTATION_TARGET_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(LQh/b;)Ldi/g;
    .locals 3

    instance-of v0, p1, LQh/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LQh/m;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    sget-object v0, LKh/f;->c:Ljava/util/Map;

    invoke-interface {p1}, LQh/m;->d()LZh/f;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/q;

    if-eqz p1, :cond_2

    new-instance v1, Ldi/k;

    sget-object v0, LZh/b;->d:LZh/b$a;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->K:LZh/c;

    invoke-virtual {v0, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    const-string v2, "identifier(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, p1}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    :cond_2
    return-object v1
.end method

.method public final c(Ljava/lang/String;)Ljava/util/Set;
    .locals 1

    sget-object v0, LKh/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/EnumSet;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final d(Ljava/util/List;)Ldi/g;
    .locals 5

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LQh/m;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQh/m;

    sget-object v2, LKh/f;->a:LKh/f;

    invoke-interface {v1}, LQh/m;->d()LZh/f;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v2, v1}, LKh/f;->c(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/r;

    new-instance v2, Ldi/k;

    sget-object v3, LZh/b;->d:LZh/b$a;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->J:LZh/c;

    invoke-virtual {v3, v4}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    const-string v4, "identifier(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v1}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance p1, Ldi/b;

    sget-object v1, LKh/e;->a:LKh/e;

    invoke-direct {p1, v0, v1}, Ldi/b;-><init>(Ljava/util/List;Lmh/l;)V

    return-object p1
.end method
