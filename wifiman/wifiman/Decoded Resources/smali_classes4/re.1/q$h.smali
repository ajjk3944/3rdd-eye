.class final Lre/q$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/q;-><init>(Lcom/ui/wmw/g;Lre/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lre/q$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/q$h;

    invoke-direct {v0}, Lre/q$h;-><init>()V

    sput-object v0, Lre/q$h;->a:Lre/q$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Ljava/util/List;
    .locals 14

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/a$a;

    invoke-virtual {v3}, Lre/a$a;->b()Lh9/a;

    move-result-object v3

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v5, 0x2710

    sub-long/2addr v2, v5

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wmw/wifi/a;

    invoke-virtual {v5}, Lcom/ui/wmw/wifi/a;->c()Lh9/a;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Lcom/ui/wmw/wifi/a;->c()Lh9/a;

    move-result-object v6

    invoke-virtual {v5}, Lcom/ui/wmw/wifi/a;->l()LS8/l;

    move-result-object v7

    invoke-virtual {v5}, Lcom/ui/wmw/wifi/a;->k()J

    move-result-wide v8

    cmp-long v5, v8, v2

    if-lez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v7, v4

    :goto_2
    invoke-interface {v1, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v5, 0x88b8

    sub-long v5, v2, v5

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v7

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lre/a$a;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lre/q$a;

    invoke-virtual {v8}, Lre/a$a;->b()Lh9/a;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7}, Lre/q$a;->a()Ljava/util/LinkedList;

    move-result-object v10

    new-instance v11, LWc/c;

    invoke-direct {v11, v2, v3, v9}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {v10, v11}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Lre/q$a;->a()Ljava/util/LinkedList;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const-string v10, "iterator(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v4

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    const-string v12, "next(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, LWc/c;

    invoke-virtual {v11}, LWc/c;->c()J

    move-result-wide v12

    cmp-long v12, v12, v5

    if-gez v12, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    move-object v10, v11

    goto :goto_4

    :cond_4
    if-eqz v10, :cond_5

    invoke-virtual {v7}, Lre/q$a;->a()Ljava/util/LinkedList;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v9, v11, v10}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V

    :cond_5
    new-instance v9, Lre/n$a;

    invoke-virtual {v7}, Lre/q$a;->a()Ljava/util/LinkedList;

    move-result-object v7

    invoke-static {v7}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v9, v8, v7}, Lre/n$a;-><init>(Lre/a$a;Ljava/util/List;)V

    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lre/q$h;->a(LYg/s;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
