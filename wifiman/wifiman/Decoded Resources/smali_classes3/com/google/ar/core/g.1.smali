.class final Lcom/google/ar/core/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/google/ar/core/L;

.field final synthetic c:Lcom/google/ar/core/N;


# direct methods
.method constructor <init>(Lcom/google/ar/core/N;Landroid/app/Activity;Lcom/google/ar/core/L;)V
    .locals 0

    iput-object p2, p0, Lcom/google/ar/core/g;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/ar/core/g;->b:Lcom/google/ar/core/L;

    iput-object p1, p0, Lcom/google/ar/core/g;->c:Lcom/google/ar/core/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    :try_start_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iget-object v1, p0, Lcom/google/ar/core/g;->c:Lcom/google/ar/core/N;

    invoke-virtual {v1}, Lcom/google/ar/core/N;->f()Lcom/google/ar/core/dependencies/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/ar/core/g;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-static {}, Lcom/google/ar/core/N;->k()Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    new-instance v5, Lcom/google/ar/core/e;

    iget-object v6, p0, Lcom/google/ar/core/g;->b:Lcom/google/ar/core/L;

    iget-object v7, p0, Lcom/google/ar/core/g;->a:Landroid/app/Activity;

    invoke-direct {v5, p0, v0, v6, v7}, Lcom/google/ar/core/e;-><init>(Lcom/google/ar/core/g;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/ar/core/L;Landroid/app/Activity;)V

    invoke-interface {v1, v2, v3, v4, v5}, Lcom/google/ar/core/dependencies/h;->d(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lcom/google/ar/core/dependencies/j;)V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/google/ar/core/f;

    iget-object v3, p0, Lcom/google/ar/core/g;->a:Landroid/app/Activity;

    iget-object v4, p0, Lcom/google/ar/core/g;->b:Lcom/google/ar/core/L;

    invoke-direct {v2, p0, v0, v3, v4}, Lcom/google/ar/core/f;-><init>(Lcom/google/ar/core/g;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Activity;Lcom/google/ar/core/L;)V

    const-wide/16 v3, 0xbb8

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "ARCore-InstallService"

    const-string/jumbo v2, "requestInstall threw, launching fullscreen."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/ar/core/g;->c:Lcom/google/ar/core/N;

    iget-object v1, p0, Lcom/google/ar/core/g;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/ar/core/g;->b:Lcom/google/ar/core/L;

    invoke-virtual {v0, v1, v2}, Lcom/google/ar/core/N;->i(Landroid/app/Activity;Lcom/google/ar/core/L;)V

    return-void
.end method
