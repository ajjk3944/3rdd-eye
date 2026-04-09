.class final Lcom/google/android/gms/measurement/internal/G4;
.super Lcom/google/android/gms/measurement/internal/A;
.source "SourceFile"


# instance fields
.field private final synthetic e:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;Lcom/google/android/gms/measurement/internal/c4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/G4;->e:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/A;-><init>(Lcom/google/android/gms/measurement/internal/c4;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G4;->e:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/measurement/internal/F4;

    invoke-direct {v2, v1}, Lcom/google/android/gms/measurement/internal/F4;-><init>(Lcom/google/android/gms/measurement/internal/r4;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
