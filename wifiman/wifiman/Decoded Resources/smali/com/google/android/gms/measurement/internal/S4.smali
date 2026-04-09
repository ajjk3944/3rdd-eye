.class final Lcom/google/android/gms/measurement/internal/S4;
.super Lcom/google/android/gms/measurement/internal/A;
.source "SourceFile"


# instance fields
.field private final synthetic e:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;Lcom/google/android/gms/measurement/internal/c4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/S4;->e:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/A;-><init>(Lcom/google/android/gms/measurement/internal/c4;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/S4;->e:Lcom/google/android/gms/measurement/internal/r4;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/S4;->e:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/r4;->M0(Lcom/google/android/gms/measurement/internal/r4;)Lcom/google/android/gms/measurement/internal/A;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/A;->b(J)V

    :cond_0
    return-void
.end method
