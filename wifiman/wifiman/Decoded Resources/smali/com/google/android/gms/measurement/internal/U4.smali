.class final Lcom/google/android/gms/measurement/internal/U4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:J

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;J)V
    .locals 0

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/U4;->a:J

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/U4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/U4;->b:Lcom/google/android/gms/measurement/internal/r4;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/U4;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/r4;->N0(J)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/U4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f1;->q()Lcom/google/android/gms/measurement/internal/C5;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/C5;->R(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
