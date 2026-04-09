.class abstract Lcom/google/android/gms/measurement/internal/U6;
.super Lcom/google/android/gms/measurement/internal/P6;
.source "SourceFile"


# instance fields
.field private c:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/d7;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/P6;-><init>(Lcom/google/android/gms/measurement/internal/d7;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/d7;->N0()V

    return-void
.end method


# virtual methods
.method protected final q()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/U6;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/U6;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/U6;->t()Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d7;->M0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/U6;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/U6;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract t()Z
.end method
