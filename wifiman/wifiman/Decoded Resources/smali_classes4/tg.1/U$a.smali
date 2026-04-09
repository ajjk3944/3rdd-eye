.class final Ltg/U$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Ltg/U;

.field b:Lhg/c;

.field c:J

.field d:Z

.field e:Z


# direct methods
.method constructor <init>(Ltg/U;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/U$a;->a:Ltg/U;

    return-void
.end method


# virtual methods
.method public a(Lhg/c;)V
    .locals 1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    iget-object p1, p0, Ltg/U$a;->a:Ltg/U;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Ltg/U$a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/U$a;->a:Ltg/U;

    iget-object v0, v0, Ltg/U;->a:LBg/a;

    invoke-virtual {v0}, LBg/a;->o1()V

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

    invoke-virtual {p0, p1}, Ltg/U$a;->a(Lhg/c;)V

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Ltg/U$a;->a:Ltg/U;

    invoke-virtual {v0, p0}, Ltg/U;->k1(Ltg/U$a;)V

    return-void
.end method
