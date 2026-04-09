.class final Lcom/google/android/gms/measurement/internal/d6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Z

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic c:Z

.field private final synthetic d:Lcom/google/android/gms/measurement/internal/j;

.field private final synthetic e:Lcom/google/android/gms/measurement/internal/j;

.field private final synthetic f:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C5;ZLcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/j;Lcom/google/android/gms/measurement/internal/j;)V
    .locals 0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/d6;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/d6;->b:Lcom/google/android/gms/measurement/internal/t7;

    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/d6;->c:Z

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/d6;->d:Lcom/google/android/gms/measurement/internal/j;

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/d6;->e:Lcom/google/android/gms/measurement/internal/j;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d6;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d6;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->y(Lcom/google/android/gms/measurement/internal/C5;)Lcom/google/android/gms/measurement/internal/s2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d6;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send conditional user property to service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/d6;->a:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->f:Lcom/google/android/gms/measurement/internal/C5;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/d6;->c:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/d6;->d:Lcom/google/android/gms/measurement/internal/j;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/d6;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/C5;->I(Lcom/google/android/gms/measurement/internal/s2;Lt3/a;Lcom/google/android/gms/measurement/internal/t7;)V

    goto :goto_2

    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->e:Lcom/google/android/gms/measurement/internal/j;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/j;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->d:Lcom/google/android/gms/measurement/internal/j;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/d6;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/s2;->i(Lcom/google/android/gms/measurement/internal/j;Lcom/google/android/gms/measurement/internal/t7;)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->d:Lcom/google/android/gms/measurement/internal/j;

    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/s2;->g(Lcom/google/android/gms/measurement/internal/j;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d6;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v1

    const-string v2, "Failed to send conditional user property to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d6;->f:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->u0(Lcom/google/android/gms/measurement/internal/C5;)V

    return-void
.end method
