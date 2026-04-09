.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super LY1/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/g3$a;


# instance fields
.field private c:Lcom/google/android/gms/measurement/internal/g3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LY1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1, p2}, LY1/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lcom/google/android/gms/measurement/internal/g3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/measurement/internal/g3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/g3;-><init>(Lcom/google/android/gms/measurement/internal/g3$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lcom/google/android/gms/measurement/internal/g3;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lcom/google/android/gms/measurement/internal/g3;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/g3;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
