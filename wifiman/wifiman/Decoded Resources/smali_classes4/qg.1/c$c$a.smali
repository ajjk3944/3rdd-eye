.class final Lqg/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Collection;

.field final synthetic b:Lqg/c$c;


# direct methods
.method constructor <init>(Lqg/c$c;Ljava/util/Collection;)V
    .locals 0

    iput-object p1, p0, Lqg/c$c$a;->b:Lqg/c$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lqg/c$c$a;->a:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lqg/c$c$a;->b:Lqg/c$c;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lqg/c$c$a;->b:Lqg/c$c;

    iget-object v1, v1, Lqg/c$c;->m:Ljava/util/List;

    iget-object v2, p0, Lqg/c$c$a;->a:Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/c$c$a;->b:Lqg/c$c;

    iget-object v1, p0, Lqg/c$c$a;->a:Ljava/util/Collection;

    const/4 v2, 0x0

    iget-object v3, v0, Lqg/c$c;->l:Lgg/y$c;

    invoke-static {v0, v1, v2, v3}, Lqg/c$c;->u(Lqg/c$c;Ljava/lang/Object;ZLhg/c;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
