.class Lcom/bumptech/glide/load/engine/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/request/g;

.field final synthetic b:Lcom/bumptech/glide/load/engine/k;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/engine/k;Lcom/bumptech/glide/request/g;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/k$b;->a:Lcom/bumptech/glide/request/g;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k$b;->a:Lcom/bumptech/glide/request/g;

    invoke-interface {v0}, Lcom/bumptech/glide/request/g;->h()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    iget-object v2, v2, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/k$e;

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/k$b;->a:Lcom/bumptech/glide/request/g;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/k$e;->e(Lcom/bumptech/glide/request/g;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    iget-object v2, v2, Lcom/bumptech/glide/load/engine/k;->v:Lcom/bumptech/glide/load/engine/o;

    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/o;->b()V

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/k$b;->a:Lcom/bumptech/glide/request/g;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/k;->g(Lcom/bumptech/glide/request/g;)V

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/k$b;->a:Lcom/bumptech/glide/request/g;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/k;->r(Lcom/bumptech/glide/request/g;)V

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/k$b;->b:Lcom/bumptech/glide/load/engine/k;

    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/k;->i()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception v1

    goto :goto_2

    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method
