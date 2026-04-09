.class public abstract Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/f;

.field private static final b:LZh/f;

.field private static final c:LZh/f;

.field private static final d:LZh/f;

.field private static final e:LZh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "message"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->a:LZh/f;

    const-string v0, "replaceWith"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->b:LZh/f;

    const-string v0, "level"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->c:LZh/f;

    const-string v0, "expression"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->d:LZh/f;

    const-string v0, "imports"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->e:LZh/f;

    return-void
.end method

.method static synthetic a(Lkotlin/reflect/jvm/internal/impl/builtins/i;LBh/G;)Lpi/S;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->d(Lkotlin/reflect/jvm/internal/impl/builtins/i;LBh/G;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replaceWith"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->B:LZh/c;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->d:LZh/f;

    new-instance v2, Ldi/x;

    invoke-direct {v2, p2}, Ldi/x;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->e:LZh/f;

    new-instance v2, Ldi/b;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    new-instance v5, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/f;

    invoke-direct {v5, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/f;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;)V

    invoke-direct {v2, v4, v5}, Ldi/b;-><init>(Ljava/util/List;Lmh/l;)V

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    filled-new-array {p2, v1}, [LYg/s;

    move-result-object p2

    invoke-static {p2}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->y:LZh/c;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->a:LZh/f;

    new-instance v3, Ldi/x;

    invoke-direct {v3, p1}, Ldi/x;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->b:LZh/f;

    new-instance v3, Ldi/a;

    invoke-direct {v3, v0}, Ldi/a;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)V

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->c:LZh/f;

    new-instance v3, Ldi/k;

    sget-object v4, LZh/b;->d:LZh/b$a;

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->A:LZh/c;

    invoke-virtual {v4, v5}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v4

    invoke-static {p3}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p3

    const-string v5, "identifier(...)"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4, p3}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p3

    filled-new-array {p1, v0, p3}, [LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, p0, v1, p1, p4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;Z)V

    return-object p2
.end method

.method public static synthetic c(Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const-string p3, "WARNING"

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;->b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/reflect/jvm/internal/impl/builtins/i;LBh/G;)Lpi/S;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    sget-object v0, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->W()Lpi/d0;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->l(Lpi/N0;Lpi/S;)Lpi/d0;

    move-result-object p0

    const-string p1, "getArrayType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
