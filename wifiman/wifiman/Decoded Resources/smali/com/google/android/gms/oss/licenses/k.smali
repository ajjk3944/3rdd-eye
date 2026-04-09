.class final Lcom/google/android/gms/oss/licenses/k;
.super Le2/a;
.source "SourceFile"


# instance fields
.field private o:Ljava/util/List;

.field private final p:Lcom/google/android/gms/oss/licenses/b;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/oss/licenses/b;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Le2/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/oss/licenses/k;->p:Lcom/google/android/gms/oss/licenses/b;

    return-void
.end method


# virtual methods
.method public final bridge synthetic B()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Le2/b;->i()Landroid/content/Context;

    move-result-object v0

    sget v1, LK3/c;->a:I

    invoke-static {v0, v1}, LG3/f;->b(Landroid/content/Context;I)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/k;->p:Lcom/google/android/gms/oss/licenses/b;

    invoke-virtual {v1}, Lcom/google/android/gms/oss/licenses/b;->c()Lcom/google/android/gms/oss/licenses/j;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/oss/licenses/i;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/oss/licenses/i;-><init>(Lcom/google/android/gms/oss/licenses/j;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/d;->g(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OssLicensesLoader"

    const-string v3, "Error getting license list from service: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_1
    return-object v0
.end method

.method public final synthetic f(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/k;->o:Ljava/util/List;

    invoke-super {p0, p1}, Le2/b;->f(Ljava/lang/Object;)V

    return-void
.end method

.method protected final p()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/k;->o:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-super {p0, v0}, Le2/b;->f(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Le2/b;->h()V

    return-void
.end method

.method protected final q()V
    .locals 0

    invoke-virtual {p0}, Le2/b;->b()Z

    return-void
.end method
