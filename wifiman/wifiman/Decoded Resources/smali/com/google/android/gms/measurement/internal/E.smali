.class final Lcom/google/android/gms/measurement/internal/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/c4;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/A;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/A;Lcom/google/android/gms/measurement/internal/c4;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/E;->a:Lcom/google/android/gms/measurement/internal/c4;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E;->b:Lcom/google/android/gms/measurement/internal/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E;->a:Lcom/google/android/gms/measurement/internal/c4;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/c4;->zzd()Lcom/google/android/gms/measurement/internal/e;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E;->a:Lcom/google/android/gms/measurement/internal/c4;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/c4;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/measurement/internal/s3;->z(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E;->b:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/A;->e()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/E;->b:Lcom/google/android/gms/measurement/internal/A;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/A;->c(Lcom/google/android/gms/measurement/internal/A;J)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E;->b:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/A;->d()V

    :cond_1
    return-void
.end method
