.class final Lj4/i;
.super Lk4/j;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Lj4/l;


# direct methods
.method constructor <init>(Lj4/l;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p3, p0, Lj4/i;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p1, p0, Lj4/i;->c:Lj4/l;

    invoke-direct {p0, p2}, Lk4/j;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 8

    const-string/jumbo v0, "unity"

    const-string/jumbo v1, "native"

    :try_start_0
    iget-object v2, p0, Lj4/i;->c:Lj4/l;

    iget-object v2, v2, Lj4/l;->a:Lk4/t;

    invoke-virtual {v2}, Lk4/t;->e()Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lk4/f;

    iget-object v3, p0, Lj4/i;->c:Lj4/l;

    invoke-static {v3}, Lj4/l;->c(Lj4/l;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lj4/m;->a()Ljava/util/Map;

    move-result-object v5

    const-string/jumbo v6, "playcore_version_code"

    const-string/jumbo v7, "java"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v4, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {v5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string/jumbo v6, "playcore_native_version"

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v6, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string/jumbo v1, "playcore_unity_version"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    new-instance v0, Lj4/k;

    iget-object v1, p0, Lj4/i;->c:Lj4/l;

    iget-object v5, p0, Lj4/i;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1}, Lj4/l;->c(Lj4/l;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v1, v5, v6}, Lj4/k;-><init>(Lj4/l;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V

    invoke-interface {v2, v3, v4, v0}, Lk4/f;->m(Ljava/lang/String;Landroid/os/Bundle;Lk4/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lj4/i;->c:Lj4/l;

    invoke-static {}, Lj4/l;->b()Lk4/i;

    move-result-object v2

    invoke-static {v1}, Lj4/l;->c(Lj4/l;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v3, "error requesting in-app review for %s"

    invoke-virtual {v2, v0, v3, v1}, Lk4/i;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lj4/i;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void
.end method
