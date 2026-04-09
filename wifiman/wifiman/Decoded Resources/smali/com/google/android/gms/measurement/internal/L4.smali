.class final Lcom/google/android/gms/measurement/internal/L4;
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

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/L4;->a:J

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/L4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/L4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/X2;->m:Lcom/google/android/gms/measurement/internal/Y2;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/L4;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/Y2;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/L4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/L4;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Session timeout duration set"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
