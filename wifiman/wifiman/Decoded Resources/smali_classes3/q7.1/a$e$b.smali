.class public final Lq7/a$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/a$e;->a(Ljava/util/List;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq7/a;

.field final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lq7/a;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lq7/a$e$b;->a:Lq7/a;

    iput-object p2, p0, Lq7/a$e$b;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 7

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lq7/a$e$b;->a:Lq7/a;

    invoke-static {v1}, Lq7/a;->e(Lq7/a;)Lv7/e;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lq7/a$e$b;->a:Lq7/a;

    invoke-static {v2}, Lq7/a;->e(Lq7/a;)Lv7/e;

    move-result-object v2

    invoke-interface {v2}, Lv7/e;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr7/a;

    invoke-virtual {v3}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls7/g;

    invoke-virtual {v4}, Ls7/g;->c()Ls7/c;

    move-result-object v4

    invoke-virtual {v4}, Ls7/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls7/j;

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls7/g;

    invoke-virtual {v3}, Lr7/a;->b()I

    move-result v3

    invoke-virtual {v4, v5, v3}, Ls7/j;->i(Ls7/g;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    new-instance v4, Ls7/j;

    invoke-virtual {v3}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls7/g;

    invoke-virtual {v5}, Ls7/g;->c()Ls7/c;

    move-result-object v5

    invoke-direct {v4, v5}, Ls7/j;-><init>(Ls7/c;)V

    invoke-virtual {v3}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls7/g;

    invoke-virtual {v3}, Lr7/a;->b()I

    move-result v6

    invoke-virtual {v4, v5, v6}, Ls7/j;->i(Ls7/g;I)V

    invoke-virtual {v3}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls7/g;

    invoke-virtual {v3}, Ls7/g;->c()Ls7/c;

    move-result-object v3

    invoke-virtual {v3}, Ls7/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v1, p0, Lq7/a$e$b;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq7/a$a;

    instance-of v3, v2, Lq7/a$a$b;

    if-eqz v3, :cond_2

    check-cast v2, Lq7/a$a$b;

    invoke-virtual {v2}, Lq7/a$a$b;->a()Lr7/a;

    move-result-object v2

    invoke-virtual {v2}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls7/g;

    invoke-virtual {v2}, Ls7/g;->c()Ls7/c;

    move-result-object v2

    invoke-virtual {v2}, Ls7/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls7/j;

    if-eqz v2, :cond_3

    iget-object v3, p0, Lq7/a$e$b;->a:Lq7/a;

    invoke-static {v3}, Lq7/a;->f(Lq7/a;)LFg/c;

    move-result-object v3

    invoke-virtual {v2}, Ls7/j;->h()Ls7/i;

    move-result-object v2

    invoke-virtual {v3, v2}, LFg/c;->k2(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object v2, Lq7/a$e$a;->a:Lq7/a$e$a;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4}, Lv7/d;->d(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls7/j;

    invoke-virtual {v2}, Ls7/j;->h()Ls7/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lq7/a$e$b;->a:Lq7/a;

    invoke-static {v0}, Lq7/a;->d(Lq7/a;)LFg/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LFg/a;->m2(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lgg/c;->a()V

    return-void

    :goto_3
    monitor-exit v1

    throw p1
.end method
