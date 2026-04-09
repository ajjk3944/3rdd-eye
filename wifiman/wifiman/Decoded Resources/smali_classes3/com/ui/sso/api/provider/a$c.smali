.class public final Lcom/ui/sso/api/provider/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/provider/a$b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LIi/J;

.field private b:Landroid/os/HandlerThread;

.field private final c:LLi/y;


# direct methods
.method public constructor <init>(LIi/J;)V
    .locals 2

    const-string/jumbo v0, "dispatcherDefault"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$c;->a:LIi/J;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0, p1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$c;->c:LLi/y;

    return-void
.end method

.method private final b(Landroid/os/Handler;)Landroid/database/ContentObserver;
    .locals 1

    new-instance v0, Lcom/ui/sso/api/provider/a$c$a;

    invoke-direct {v0, p1, p0}, Lcom/ui/sso/api/provider/a$c$a;-><init>(Landroid/os/Handler;Lcom/ui/sso/api/provider/a$c;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()LLi/D;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a$c;->d()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public final c()LIi/J;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c;->a:LIi/J;

    return-object v0
.end method

.method public d()LLi/y;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c;->c:LLi/y;

    return-object v0
.end method

.method public start()Landroid/database/ContentObserver;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c;->b:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a$c;->stop()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "UIAccountNotification"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/sso/api/provider/a$c;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, v1}, Lcom/ui/sso/api/provider/a$c;->b(Landroid/os/Handler;)Landroid/database/ContentObserver;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public stop()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c;->b:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ui/sso/api/provider/a$c;->b:Landroid/os/HandlerThread;

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method
