.class final Lcom/google/android/gms/measurement/internal/T5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic b:Lcom/google/android/gms/internal/measurement/U0;

.field private final synthetic c:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/T5;->a:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/T5;->b:Lcom/google/android/gms/internal/measurement/U0;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "Failed to get app instance id"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->J()Lcom/google/android/gms/measurement/internal/e4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/e4;->x()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->I()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/measurement/internal/r4;->U0(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/X2;->i:Lcom/google/android/gms/measurement/internal/a3;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/measurement/internal/a3;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->b:Lcom/google/android/gms/internal/measurement/U0;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/x7;->O(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/C5;->y(Lcom/google/android/gms/measurement/internal/C5;)Lcom/google/android/gms/measurement/internal/s2;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->b:Lcom/google/android/gms/internal/measurement/U0;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/x7;->O(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_2
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/T5;->a:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/T5;->a:Lcom/google/android/gms/measurement/internal/t7;

    invoke-interface {v2, v3}, Lcom/google/android/gms/measurement/internal/s2;->e(Lcom/google/android/gms/measurement/internal/t7;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/measurement/internal/r4;->U0(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/X2;->i:Lcom/google/android/gms/measurement/internal/a3;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/measurement/internal/a3;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/C5;->u0(Lcom/google/android/gms/measurement/internal/C5;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->b:Lcom/google/android/gms/internal/measurement/U0;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/x7;->O(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_3
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->b:Lcom/google/android/gms/internal/measurement/U0;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/x7;->O(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/T5;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/T5;->b:Lcom/google/android/gms/internal/measurement/U0;

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/x7;->O(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    throw v0
.end method
