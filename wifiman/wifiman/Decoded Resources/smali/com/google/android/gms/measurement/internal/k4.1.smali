.class final Lcom/google/android/gms/measurement/internal/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/measurement/U0;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/k4;->a:Lcom/google/android/gms/internal/measurement/U0;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/k4;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k4;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->I()Lcom/google/android/gms/measurement/internal/C5;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/k4;->a:Lcom/google/android/gms/internal/measurement/U0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/C5;->A(Lcom/google/android/gms/internal/measurement/U0;)V

    return-void
.end method
