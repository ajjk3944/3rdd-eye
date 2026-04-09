.class public final Lcom/ui/wifiman/model/vendor/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/vendor/d$b;


# instance fields
.field private final a:Lgg/z;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ui/wifiman/model/vendor/e$b;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/vendor/e$b;-><init>(Lcom/ui/wifiman/model/vendor/e;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->e()Lgg/z;

    move-result-object v0

    const-string v1, "cache(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/vendor/e;->a:Lgg/z;

    invoke-static {}, Lcom/ui/wifiman/model/vendor/d$d;->getEntries()Lfh/a;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/vendor/d$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/vendor/d$d;->getNames()[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "US"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "toLowerCase(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lcom/ui/wifiman/model/vendor/e;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/e;->a:Lgg/z;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/ui/wifiman/model/vendor/d;
    .locals 3

    const-string v0, "vendor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/e;->b:Ljava/util/Map;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/vendor/d$d;

    if-eqz v0, :cond_0

    new-instance p1, Lcom/ui/wifiman/model/vendor/d$c;

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/vendor/d$c;-><init>(Lcom/ui/wifiman/model/vendor/d$d;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/vendor/d$e;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/ui/wifiman/model/vendor/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
