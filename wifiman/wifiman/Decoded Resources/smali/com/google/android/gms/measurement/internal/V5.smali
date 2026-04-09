.class final Lcom/google/android/gms/measurement/internal/V5;
.super Lcom/google/android/gms/measurement/internal/A;
.source "SourceFile"


# instance fields
.field private final synthetic e:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/c4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/V5;->e:Lcom/google/android/gms/measurement/internal/C5;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/A;-><init>(Lcom/google/android/gms/measurement/internal/c4;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/V5;->e:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Tasks have been queued for a long time"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void
.end method
