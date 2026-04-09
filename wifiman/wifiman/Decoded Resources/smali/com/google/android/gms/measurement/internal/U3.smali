.class final Lcom/google/android/gms/measurement/internal/U3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/L;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic c:Lcom/google/android/gms/measurement/internal/A3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/L;Lcom/google/android/gms/measurement/internal/t7;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/U3;->a:Lcom/google/android/gms/measurement/internal/L;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/U3;->b:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/U3;->c:Lcom/google/android/gms/measurement/internal/A3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/U3;->c:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/U3;->a:Lcom/google/android/gms/measurement/internal/L;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/U3;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/A3;->t0(Lcom/google/android/gms/measurement/internal/L;Lcom/google/android/gms/measurement/internal/t7;)Lcom/google/android/gms/measurement/internal/L;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/U3;->c:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/U3;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/A3;->x0(Lcom/google/android/gms/measurement/internal/L;Lcom/google/android/gms/measurement/internal/t7;)V

    return-void
.end method
