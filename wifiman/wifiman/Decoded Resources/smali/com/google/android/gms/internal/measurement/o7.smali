.class public final Lcom/google/android/gms/internal/measurement/o7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/q7;


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/s3;

.field private static final b:Lcom/google/android/gms/internal/measurement/s3;

.field private static final c:Lcom/google/android/gms/internal/measurement/s3;

.field private static final d:Lcom/google/android/gms/internal/measurement/s3;

.field private static final e:Lcom/google/android/gms/internal/measurement/s3;

.field private static final f:Lcom/google/android/gms/internal/measurement/s3;

.field private static final g:Lcom/google/android/gms/internal/measurement/s3;

.field private static final h:Lcom/google/android/gms/internal/measurement/s3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/B3;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/t3;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/B3;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B3;->f()Lcom/google/android/gms/internal/measurement/B3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B3;->e()Lcom/google/android/gms/internal/measurement/B3;

    move-result-object v0

    const-string v1, "measurement.sgtm.client.scion_upload_action"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->a:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.client.upload_on_backgrounded.dev"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->b:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.google_signal.enable"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->c:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.no_proxy.client"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->d:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.no_proxy.service"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->e:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.preview_mode_enabled"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.rollout_percentage_fix"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.service"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.service.batching_on_backgrounded"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->f:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.upload_queue"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->g:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.sgtm.upload_on_uninstall"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/o7;->h:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.id.sgtm"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/B3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/s3;

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

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->a:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->b:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->c:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzd()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->d:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zze()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->e:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzf()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->f:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzg()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->g:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzh()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o7;->h:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
