.class public final Lcom/google/android/gms/internal/measurement/W6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/X6;


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/s3;

.field private static final b:Lcom/google/android/gms/internal/measurement/s3;

.field private static final c:Lcom/google/android/gms/internal/measurement/s3;

.field private static final d:Lcom/google/android/gms/internal/measurement/s3;

.field private static final e:Lcom/google/android/gms/internal/measurement/s3;

.field private static final f:Lcom/google/android/gms/internal/measurement/s3;

.field private static final g:Lcom/google/android/gms/internal/measurement/s3;

.field private static final h:Lcom/google/android/gms/internal/measurement/s3;

.field private static final i:Lcom/google/android/gms/internal/measurement/s3;

.field private static final j:Lcom/google/android/gms/internal/measurement/s3;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/measurement/B3;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/t3;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/B3;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B3;->f()Lcom/google/android/gms/internal/measurement/B3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B3;->e()Lcom/google/android/gms/internal/measurement/B3;

    move-result-object v0

    const-string v1, "measurement.rb.attribution.ad_campaign_info"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->a:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.client.bundle_on_backgrounded"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.service.bundle_on_backgrounded"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.client2"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->b:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.dma_fix"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.followup1.service"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->c:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.client.get_trigger_uris_async"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->d:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.service.trigger_uris_high_priority"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->e:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.index_out_of_bounds_fix"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->f:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.retry_disposition"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->g:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.service"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->h:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.enable_trigger_redaction"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->i:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.uuid_generation"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/B3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/W6;->j:Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.id.rb.attribution.retry_disposition"

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v3, v4}, Lcom/google/android/gms/internal/measurement/B3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "measurement.rb.attribution.improved_retry"

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

    const/4 v0, 0x1

    return v0
.end method

.method public final zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->a:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->b:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzd()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->c:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zze()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->d:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzf()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->e:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzg()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->f:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzh()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->g:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzi()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->h:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzj()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->i:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzk()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/W6;->j:Lcom/google/android/gms/internal/measurement/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
