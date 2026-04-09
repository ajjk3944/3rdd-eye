.class public final Lkb/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkb/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LMj/w;)Lkb/b;
    .locals 5

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LMj/w;->e()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Headers;->f()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lsh/m;->d(II)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, LMj/w;->e()Lokhttp3/Headers;

    move-result-object v4

    invoke-virtual {v4, v3}, Lokhttp3/Headers;->k(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lkb/b;

    new-instance v2, Lkb/g;

    invoke-direct {v2, v1}, Lkb/g;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, LMj/w;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lokhttp3/ResponseBody;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->g()[B

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [B

    :cond_2
    invoke-direct {v0, v2, p1}, Lkb/b;-><init>(Lkb/g;[B)V

    return-object v0
.end method
