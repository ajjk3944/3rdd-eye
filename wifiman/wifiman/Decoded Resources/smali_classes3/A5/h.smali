.class public LA5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static c:LA5/h;


# instance fields
.field private a:LF4/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LA5/h;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LA5/h;
    .locals 3

    sget-object v0, LA5/h;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LA5/h;->c:LA5/h;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string/jumbo v2, "MlKitContext has not been initialized"

    invoke-static {v1, v2}, Ls3/p;->p(ZLjava/lang/Object;)V

    sget-object v1, LA5/h;->c:LA5/h;

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA5/h;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static d(Landroid/content/Context;)LA5/h;
    .locals 2

    sget-object v0, LA5/h;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    invoke-static {p0, v1}, LA5/h;->e(Landroid/content/Context;Ljava/util/concurrent/Executor;)LA5/h;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static e(Landroid/content/Context;Ljava/util/concurrent/Executor;)LA5/h;
    .locals 6

    sget-object v0, LA5/h;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LA5/h;->c:LA5/h;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string/jumbo v4, "MlKitContext is already initialized"

    invoke-static {v1, v4}, Ls3/p;->p(ZLjava/lang/Object;)V

    new-instance v1, LA5/h;

    invoke-direct {v1}, LA5/h;-><init>()V

    sput-object v1, LA5/h;->c:LA5/h;

    invoke-static {p0}, LA5/h;->f(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    const-class v4, Lcom/google/mlkit/common/internal/MlKitComponentDiscoveryService;

    invoke-static {p0, v4}, LF4/f;->c(Landroid/content/Context;Ljava/lang/Class;)LF4/f;

    move-result-object v4

    invoke-virtual {v4}, LF4/f;->b()Ljava/util/List;

    move-result-object v4

    invoke-static {p1}, LF4/n;->m(Ljava/util/concurrent/Executor;)LF4/n$b;

    move-result-object p1

    invoke-virtual {p1, v4}, LF4/n$b;->d(Ljava/util/Collection;)LF4/n$b;

    move-result-object p1

    const-class v4, Landroid/content/Context;

    new-array v5, v3, [Ljava/lang/Class;

    invoke-static {p0, v4, v5}, LF4/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LF4/c;

    move-result-object p0

    invoke-virtual {p1, p0}, LF4/n$b;->b(LF4/c;)LF4/n$b;

    move-result-object p0

    const-class p1, LA5/h;

    new-array v3, v3, [Ljava/lang/Class;

    invoke-static {v1, p1, v3}, LF4/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LF4/c;

    move-result-object p1

    invoke-virtual {p0, p1}, LF4/n$b;->b(LF4/c;)LF4/n$b;

    move-result-object p0

    invoke-virtual {p0}, LF4/n$b;->e()LF4/n;

    move-result-object p0

    iput-object p0, v1, LA5/h;->a:LF4/n;

    invoke-virtual {p0, v2}, LF4/n;->p(Z)V

    sget-object p0, LA5/h;->c:LA5/h;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static f(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    sget-object v0, LA5/h;->c:LA5/h;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string/jumbo v1, "MlKitContext has been deleted"

    invoke-static {v0, v1}, Ls3/p;->p(ZLjava/lang/Object;)V

    iget-object v0, p0, LA5/h;->a:LF4/n;

    invoke-static {v0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LA5/h;->a:LF4/n;

    invoke-interface {v0, p1}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Landroid/content/Context;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, LA5/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method
