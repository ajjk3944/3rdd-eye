.class final Lcom/google/android/gms/measurement/internal/B5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:J

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/x5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/x5;J)V
    .locals 0

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/B5;->a:J

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/B5;->b:Lcom/google/android/gms/measurement/internal/x5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B5;->b:Lcom/google/android/gms/measurement/internal/x5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f1;->k()Lcom/google/android/gms/measurement/internal/B;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/B5;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B;->s(J)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B5;->b:Lcom/google/android/gms/measurement/internal/x5;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/x5;->e:Lcom/google/android/gms/measurement/internal/u5;

    return-void
.end method
