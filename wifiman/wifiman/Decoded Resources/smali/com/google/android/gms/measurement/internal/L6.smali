.class final Lcom/google/android/gms/measurement/internal/L6;
.super Lcom/google/android/gms/measurement/internal/A;
.source "SourceFile"


# instance fields
.field private final synthetic e:Lcom/google/android/gms/measurement/internal/M6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/M6;Lcom/google/android/gms/measurement/internal/c4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/L6;->e:Lcom/google/android/gms/measurement/internal/M6;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/A;-><init>(Lcom/google/android/gms/measurement/internal/c4;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/L6;->e:Lcom/google/android/gms/measurement/internal/M6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/M6;->v()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/L6;->e:Lcom/google/android/gms/measurement/internal/M6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/L6;->e:Lcom/google/android/gms/measurement/internal/M6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d7;->P0()V

    return-void
.end method
