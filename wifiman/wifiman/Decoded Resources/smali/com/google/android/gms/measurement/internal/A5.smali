.class final Lcom/google/android/gms/measurement/internal/A5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/u5;

.field private final synthetic b:J

.field private final synthetic c:Lcom/google/android/gms/measurement/internal/x5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/x5;Lcom/google/android/gms/measurement/internal/u5;J)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/A5;->a:Lcom/google/android/gms/measurement/internal/u5;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/A5;->b:J

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/A5;->c:Lcom/google/android/gms/measurement/internal/x5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A5;->c:Lcom/google/android/gms/measurement/internal/x5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/A5;->a:Lcom/google/android/gms/measurement/internal/u5;

    const/4 v2, 0x0

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/A5;->b:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/x5;->J(Lcom/google/android/gms/measurement/internal/x5;Lcom/google/android/gms/measurement/internal/u5;ZJ)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A5;->c:Lcom/google/android/gms/measurement/internal/x5;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/x5;->e:Lcom/google/android/gms/measurement/internal/u5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f1;->q()Lcom/google/android/gms/measurement/internal/C5;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/C5;->J(Lcom/google/android/gms/measurement/internal/u5;)V

    return-void
.end method
