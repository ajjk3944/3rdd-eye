.class public final Lcom/ui/wifiman/model/network/hosts/a$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;->o()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/network/hosts/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/network/hosts/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$m;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 16

    :try_start_0
    const-string v0, "Favorite Host DB prepopulate initiated"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v3, p0

    :try_start_1
    iget-object v0, v3, Lcom/ui/wifiman/model/network/hosts/a$m;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/network/hosts/a;->g(Lcom/ui/wifiman/model/network/hosts/a;)LRb/a;

    move-result-object v0

    invoke-static {}, Lcom/ui/wifiman/model/network/hosts/a$c;->getEntries()Lfh/a;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/network/hosts/a$c;

    new-instance v15, LRb/c;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/network/hosts/a$c;->getHost()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Lcom/ui/wifiman/model/network/hosts/a$c;->getPosition()I

    move-result v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    const/4 v14, 0x1

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v7, v15

    move-object v1, v15

    move-object v15, v6

    invoke-direct/range {v7 .. v15}, LRb/c;-><init>(JLjava/lang/String;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x2

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_1
    move-object/from16 v1, p1

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    new-array v1, v1, [LRb/c;

    invoke-interface {v5, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LRb/c;

    array-length v4, v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LRb/c;

    invoke-interface {v0, v1}, LRb/a;->e([LRb/c;)V

    const-string v0, "Favorite Host DB prepopulate COMPLETED"

    const/4 v1, 0x2

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lgg/c;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object/from16 v3, p0

    goto :goto_1

    :goto_2
    invoke-interface {v1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
