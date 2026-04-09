.class public abstract LJh/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;

.field private static final b:Ljava/util/List;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/Map;

.field private static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    sget-object v0, LJh/c;->FIELD:LJh/c;

    sget-object v1, LJh/c;->METHOD_RETURN_TYPE:LJh/c;

    sget-object v2, LJh/c;->VALUE_PARAMETER:LJh/c;

    sget-object v3, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    sget-object v4, LJh/c;->TYPE_USE:LJh/c;

    filled-new-array {v0, v1, v2, v3, v4}, [LJh/c;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LJh/x;->a:Ljava/util/List;

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, LJh/x;->b:Ljava/util/List;

    invoke-static {}, LJh/J;->k()LZh/c;

    move-result-object v2

    new-instance v3, LJh/w;

    new-instance v4, LRh/l;

    sget-object v5, LRh/k;->NOT_NULL:LRh/k;

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct {v4, v5, v6, v7, v8}, LRh/l;-><init>(LRh/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    invoke-direct {v3, v4, v9, v6}, LJh/w;-><init>(LRh/l;Ljava/util/Collection;Z)V

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    invoke-static {}, LJh/J;->i()LZh/c;

    move-result-object v3

    new-instance v4, LJh/w;

    new-instance v9, LRh/l;

    invoke-direct {v9, v5, v6, v7, v8}, LRh/l;-><init>(LRh/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v0

    check-cast v10, Ljava/util/Collection;

    invoke-direct {v4, v9, v10, v6}, LJh/w;-><init>(LRh/l;Ljava/util/Collection;Z)V

    invoke-static {v3, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    invoke-static {}, LJh/J;->j()LZh/c;

    move-result-object v4

    new-instance v15, LJh/w;

    new-instance v10, LRh/l;

    sget-object v9, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    invoke-direct {v10, v9, v6, v7, v8}, LRh/l;-><init>(LRh/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v0

    check-cast v11, Ljava/util/Collection;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object v9, v15

    invoke-direct/range {v9 .. v14}, LJh/w;-><init>(LRh/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, v15}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    filled-new-array {v2, v3, v0}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LJh/x;->c:Ljava/util/Map;

    invoke-static {}, LJh/J;->d()LZh/c;

    move-result-object v2

    new-instance v3, LJh/w;

    new-instance v10, LRh/l;

    invoke-direct {v10, v5, v6, v7, v8}, LRh/l;-><init>(LRh/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v1

    check-cast v11, Ljava/util/Collection;

    move-object v9, v3

    invoke-direct/range {v9 .. v14}, LJh/w;-><init>(LRh/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    invoke-static {}, LJh/J;->e()LZh/c;

    move-result-object v3

    new-instance v4, LJh/w;

    new-instance v10, LRh/l;

    sget-object v5, LRh/k;->NULLABLE:LRh/k;

    invoke-direct {v10, v5, v6, v7, v8}, LRh/l;-><init>(LRh/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v1

    check-cast v11, Ljava/util/Collection;

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, LJh/w;-><init>(LRh/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    filled-new-array {v2, v1}, [LYg/s;

    move-result-object v1

    invoke-static {v1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, LJh/x;->d:Ljava/util/Map;

    invoke-static {v0, v1}, LZg/U;->n(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LJh/x;->e:Ljava/util/Map;

    return-void
.end method

.method public static final a()Ljava/util/Map;
    .locals 1

    sget-object v0, LJh/x;->e:Ljava/util/Map;

    return-object v0
.end method

.method public static final b()Ljava/util/Map;
    .locals 1

    sget-object v0, LJh/x;->c:Ljava/util/Map;

    return-object v0
.end method
