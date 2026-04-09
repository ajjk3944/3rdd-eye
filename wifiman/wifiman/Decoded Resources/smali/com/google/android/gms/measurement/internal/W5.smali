.class final Lcom/google/android/gms/measurement/internal/W5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Z

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic c:Z

.field private final synthetic d:Lcom/google/android/gms/measurement/internal/K;

.field private final synthetic e:Landroid/os/Bundle;

.field private final synthetic f:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C5;ZLcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/K;Landroid/os/Bundle;)V
    .locals 0

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/W5;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/W5;->b:Lcom/google/android/gms/measurement/internal/t7;

    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/W5;->c:Z

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/W5;->d:Lcom/google/android/gms/measurement/internal/K;

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/W5;->e:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->y(Lcom/google/android/gms/measurement/internal/C5;)Lcom/google/android/gms/measurement/internal/s2;

    move-result-object v0

    const-string v1, "Failed to send default event parameters to service"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/N;->n1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/W5;->a:Z

    if-eqz v2, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/W5;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/W5;->c:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/W5;->d:Lcom/google/android/gms/measurement/internal/K;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/W5;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/C5;->I(Lcom/google/android/gms/measurement/internal/s2;Lt3/a;Lcom/google/android/gms/measurement/internal/t7;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/W5;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/W5;->e:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/W5;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/s2;->J(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/t7;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->u0(Lcom/google/android/gms/measurement/internal/C5;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/W5;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
