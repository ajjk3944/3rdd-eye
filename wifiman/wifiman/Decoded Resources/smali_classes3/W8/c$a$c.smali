.class public final LW8/c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW8/c$a;->a(LQ6/f;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ6/f;


# direct methods
.method public constructor <init>(LQ6/f;)V
    .locals 0

    iput-object p1, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 11

    :try_start_0
    iget-object v0, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v0}, LQ6/f;->a()LG6/O;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LG6/O;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string/jumbo v2, "macAddress"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v2, v0}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    move-object v2, v1

    :goto_0
    const/4 v0, 0x2

    if-eqz v2, :cond_9

    iget-object v3, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v3}, LQ6/f;->c()LQ6/e;

    move-result-object v3

    invoke-interface {v3}, LQ6/e;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v4}, LQ6/f;->b()I

    move-result v4

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v5, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v5}, LQ6/f;->c()LQ6/e;

    move-result-object v5

    invoke-interface {v5}, LQ6/e;->f()Ljava/util/List;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string/jumbo v6, "service.uuid"

    if-eqz v5, :cond_1

    :try_start_1
    const-string/jumbo v8, "serviceUuids"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/os/ParcelUuid;

    invoke-virtual {v8}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, LT8/a$c;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v8

    invoke-static {v8}, LT8/a$c;->a(Ljava/util/UUID;)LT8/a$c;

    move-result-object v8

    invoke-virtual {v7, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object v5, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v5}, LQ6/f;->c()LQ6/e;

    move-result-object v5

    invoke-interface {v5}, LQ6/e;->g()Ljava/util/Map;

    move-result-object v5

    if-eqz v5, :cond_2

    const-string/jumbo v8, "serviceData"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/os/ParcelUuid;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    invoke-virtual {v10}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, LT8/a$c;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v10

    invoke-static {v10}, LT8/a$c;->a(Ljava/util/UUID;)LT8/a$c;

    move-result-object v10

    invoke-virtual {v7, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object v5, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v5}, LQ6/f;->c()LQ6/e;

    move-result-object v5

    invoke-interface {v5}, LQ6/e;->c()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_3

    move-object v5, v1

    goto :goto_3

    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_3
    iget-object v8, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-virtual {v8}, LQ6/f;->d()LQ6/b;

    move-result-object v8

    if-nez v8, :cond_4

    move v8, v6

    goto :goto_4

    :cond_4
    sget-object v9, LW8/c$a$b;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v9, v8

    :goto_4
    if-eq v8, v6, :cond_7

    const/4 v6, 0x1

    if-eq v8, v6, :cond_8

    if-eq v8, v0, :cond_6

    const/4 v0, 0x3

    if-ne v8, v0, :cond_5

    goto :goto_5

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_7
    :goto_5
    move-object v6, v1

    goto :goto_6

    :cond_8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_5

    :goto_6
    new-instance v0, LW8/a;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LW8/a;-><init>(Lh9/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;)V

    move-object v1, v0

    goto :goto_7

    :cond_9
    new-instance v2, LW8/c$a$a;

    iget-object v3, p0, LW8/c$a$c;->a:LQ6/f;

    invoke-direct {v2, v3}, LW8/c$a$a;-><init>(LQ6/f;)V

    invoke-static {v2, v1, v0, v1}, LX8/a;->e(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :goto_7
    if-eqz v1, :cond_a

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_9

    :cond_a
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_9

    :goto_8
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_9
    return-void
.end method
