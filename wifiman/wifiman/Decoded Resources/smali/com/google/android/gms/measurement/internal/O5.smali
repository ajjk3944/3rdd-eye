.class final Lcom/google/android/gms/measurement/internal/O5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic b:Z

.field private final synthetic c:Lcom/google/android/gms/measurement/internal/r7;

.field private final synthetic d:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/r7;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/O5;->a:Lcom/google/android/gms/measurement/internal/t7;

    iput-boolean p3, p0, Lcom/google/android/gms/measurement/internal/O5;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/O5;->c:Lcom/google/android/gms/measurement/internal/r7;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/O5;->d:Lcom/google/android/gms/measurement/internal/C5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/O5;->d:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->y(Lcom/google/android/gms/measurement/internal/C5;)Lcom/google/android/gms/measurement/internal/s2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/O5;->d:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/O5;->a:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/O5;->d:Lcom/google/android/gms/measurement/internal/C5;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/O5;->b:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/O5;->c:Lcom/google/android/gms/measurement/internal/r7;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/O5;->a:Lcom/google/android/gms/measurement/internal/t7;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/C5;->I(Lcom/google/android/gms/measurement/internal/s2;Lt3/a;Lcom/google/android/gms/measurement/internal/t7;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/O5;->d:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->u0(Lcom/google/android/gms/measurement/internal/C5;)V

    return-void
.end method
