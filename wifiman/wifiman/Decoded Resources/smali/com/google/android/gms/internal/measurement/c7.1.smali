.class public final Lcom/google/android/gms/internal/measurement/c7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/d7;


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/s3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/B3;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/t3;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/B3;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B3;->f()Lcom/google/android/gms/internal/measurement/B3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B3;->e()Lcom/google/android/gms/internal/measurement/B3;

    move-result-object v0

    const-string v1, "measurement.experiment.enable_phenotype_experiment_reporting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/c7;->a:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.experiment.enable_experiment_reporting"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->a:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
