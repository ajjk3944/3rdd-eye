.class final Lcom/google/android/gms/common/api/internal/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lr3/b;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/D;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/D;Lr3/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/C;->a:Lr3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/D;->f:Lcom/google/android/gms/common/api/internal/e;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/e;->w(Lcom/google/android/gms/common/api/internal/e;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/D;->f(Lcom/google/android/gms/common/api/internal/D;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/z;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/C;->a:Lr3/b;

    invoke-virtual {v1}, Lr3/b;->i()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/google/android/gms/common/api/internal/D;->g(Lcom/google/android/gms/common/api/internal/D;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/D;->e(Lcom/google/android/gms/common/api/internal/D;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/api/a$f;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/D;->h(Lcom/google/android/gms/common/api/internal/D;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/D;->e(Lcom/google/android/gms/common/api/internal/D;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v3

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/D;->e(Lcom/google/android/gms/common/api/internal/D;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/api/a$f;->a()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Lcom/google/android/gms/common/api/a$f;->k(Ls3/j;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/C;->b:Lcom/google/android/gms/common/api/internal/D;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/D;->e(Lcom/google/android/gms/common/api/internal/D;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, Lcom/google/android/gms/common/api/a$f;->b(Ljava/lang/String;)V

    new-instance v1, Lr3/b;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lr3/b;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/z;->H(Lr3/b;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/C;->a:Lr3/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/z;->H(Lr3/b;Ljava/lang/Exception;)V

    return-void
.end method
