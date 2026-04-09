.class final Lqg/c0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lqg/c0;

.field b:Lhg/c;

.field c:J

.field d:Z

.field e:Z


# direct methods
.method constructor <init>(Lqg/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/c0$a;->a:Lqg/c0;

    return-void
.end method


# virtual methods
.method public a(Lhg/c;)V
    .locals 1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    iget-object p1, p0, Lqg/c0$a;->a:Lqg/c0;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lqg/c0$a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/c0$a;->a:Lqg/c0;

    iget-object v0, v0, Lqg/c0;->b:Ljg/a;

    invoke-virtual {v0}, Ljg/a;->l2()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lqg/c0$a;->a(Lhg/c;)V

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lqg/c0$a;->a:Lqg/c0;

    invoke-virtual {v0, p0}, Lqg/c0;->j2(Lqg/c0$a;)V

    return-void
.end method
