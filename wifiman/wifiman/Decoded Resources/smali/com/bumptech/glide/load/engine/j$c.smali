.class Lcom/bumptech/glide/load/engine/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/engine/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:LG2/a$a;

.field private volatile b:LG2/a;


# direct methods
.method constructor <init>(LG2/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/j$c;->a:LG2/a$a;

    return-void
.end method


# virtual methods
.method public a()LG2/a;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->b:LG2/a;

    if-nez v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->b:LG2/a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->a:LG2/a$a;

    invoke-interface {v0}, LG2/a$a;->a()LG2/a;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->b:LG2/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->b:LG2/a;

    if-nez v0, :cond_1

    new-instance v0, LG2/b;

    invoke-direct {v0}, LG2/b;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->b:LG2/a;

    :cond_1
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/j$c;->b:LG2/a;

    return-object v0
.end method
