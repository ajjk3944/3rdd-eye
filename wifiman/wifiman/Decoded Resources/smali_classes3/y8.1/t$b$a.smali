.class public final Ly8/t$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/t$b;->a(Ldd/i;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/t;

.field final synthetic b:Ldd/i;


# direct methods
.method public constructor <init>(Ly8/t;Ldd/i;)V
    .locals 0

    iput-object p1, p0, Ly8/t$b$a;->a:Ly8/t;

    iput-object p2, p0, Ly8/t$b$a;->b:Ldd/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Ly8/t$b$a;->a:Ly8/t;

    invoke-static {v0}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const v3, 0x88b8

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iget-object v3, p0, Ly8/t$b$a;->a:Ly8/t;

    invoke-static {v3}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-string/jumbo v4, "iterator(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LWc/c;

    invoke-virtual {v4}, LWc/c;->c()J

    move-result-wide v4

    cmp-long v4, v4, v1

    if-gez v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ly8/t$b$a;->a:Ly8/t;

    invoke-static {v1}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object v1

    new-instance v2, LWc/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Ly8/t$b$a;->b:Ldd/i;

    invoke-virtual {v5}, Ldd/i;->e()Lb8/d;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    iget-object v0, p0, Ly8/t$b$a;->a:Ly8/t;

    invoke-static {v0}, Ly8/t;->h(Ly8/t;)LFg/a;

    move-result-object v0

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
