.class public final Lcom/google/android/recaptcha/internal/zzan;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public zza:LIi/x;

.field private final zzb:LIi/N;

.field private final zzc:Lcom/google/android/recaptcha/internal/zzek;

.field private final zzd:Lcom/google/android/play/core/integrity/StandardIntegrityManager;

.field private zze:Lcom/google/android/recaptcha/internal/zzao;

.field private zzf:J

.field private final zzg:LTi/a;

.field private zzh:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LIi/N;Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/play/core/integrity/StandardIntegrityManager;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzan;->zzb:LIi/N;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzan;->zzc:Lcom/google/android/recaptcha/internal/zzek;

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzan;->zzd:Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    sget-object p1, Lcom/google/android/recaptcha/internal/zzao;->zza:Lcom/google/android/recaptcha/internal/zzao;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzan;->zze:Lcom/google/android/recaptcha/internal/zzao;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p3, p1, p2}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzan;->zzg:LTi/a;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzan;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzan;->zzi(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic zzb(Lcom/google/android/recaptcha/internal/zzan;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzan;->zzj(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic zzg(Lcom/google/android/recaptcha/internal/zzan;)LIi/N;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzan;->zzb:LIi/N;

    return-object p0
.end method

.method public static final synthetic zzh(Lcom/google/android/recaptcha/internal/zzan;Lcom/google/android/recaptcha/internal/zzao;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzan;->zze:Lcom/google/android/recaptcha/internal/zzao;

    return-void
.end method

.method private final zzi(Ldh/e;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/recaptcha/internal/zzag;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zzag;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzag;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzag;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzag;

    invoke-direct {v0, p0, p1}, Lcom/google/android/recaptcha/internal/zzag;-><init>(Lcom/google/android/recaptcha/internal/zzan;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzag;->zza:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzag;->zzc:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest;->builder()Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;

    move-result-object p1

    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzan;->zzf:J

    invoke-virtual {p1, v4, v5}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;->setCloudProjectNumber(J)Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;->build()Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzan;->zzd:Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    invoke-interface {v2, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager;->prepareIntegrityToken(Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzbx;->zza(Lcom/google/android/gms/tasks/Task;)LIi/V;

    move-result-object p1

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzag;->zzc:I

    invoke-interface {p1, v0}, LIi/V;->await(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method private final zzj(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzah;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/recaptcha/internal/zzah;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzah;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzah;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzah;

    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzah;-><init>(Lcom/google/android/recaptcha/internal/zzan;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzah;->zza:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzah;->zzc:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzah;->zzd:Ljava/lang/String;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzan;->zzf()LIi/x;

    move-result-object p2

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzah;->zzd:Ljava/lang/String;

    iput v4, v0, Lcom/google/android/recaptcha/internal/zzah;->zzc:I

    invoke-interface {p2, v0}, LIi/V;->await(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-eq p2, v1, :cond_5

    :goto_1
    check-cast p2, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    invoke-static {}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest;->builder()Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;->setRequestHash(Ljava/lang/String;)Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;->build()Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;->request(Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzbx;->zza(Lcom/google/android/gms/tasks/Task;)LIi/V;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, v0, Lcom/google/android/recaptcha/internal/zzah;->zzd:Ljava/lang/String;

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzah;->zzc:I

    invoke-interface {p1, v0}, LIi/V;->await(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p2, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityToken;

    invoke-virtual {p2}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityToken;->token()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_3
    return-object v1
.end method


# virtual methods
.method public final zzc(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzaf;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/recaptcha/internal/zzaf;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzaf;

    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzaf;-><init>(Lcom/google/android/recaptcha/internal/zzan;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zza:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzaf;->zze:Ljava/lang/String;

    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzaf;->zze:Ljava/lang/String;

    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :cond_4
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzaf;->zze:Ljava/lang/String;

    iput v5, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:I

    invoke-direct {p0, p1, v0}, Lcom/google/android/recaptcha/internal/zzan;->zzj(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    :try_start_2
    check-cast p2, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_0
    move-object v2, p0

    :catch_1
    iput-object v2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzaf;->zze:Ljava/lang/String;

    iput v4, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:I

    invoke-virtual {v2, v0}, Lcom/google/android/recaptcha/internal/zzan;->zze(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    const/4 p2, 0x0

    iput-object p2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    iput-object p2, v0, Lcom/google/android/recaptcha/internal/zzaf;->zze:Ljava/lang/String;

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:I

    invoke-direct {v2, p1, v0}, Lcom/google/android/recaptcha/internal/zzan;->zzj(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-eq p2, v1, :cond_7

    :goto_3
    check-cast p2, Ljava/lang/String;

    :goto_4
    return-object p2

    :cond_7
    return-object v1
.end method

.method public final zzd(JLdh/e;)Ljava/lang/Object;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/recaptcha/internal/zzan;->zzf:J

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final zze(Ldh/e;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, Lcom/google/android/recaptcha/internal/zzak;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zzak;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzak;->zzd:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzak;->zzd:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzak;

    invoke-direct {v0, p0, p1}, Lcom/google/android/recaptcha/internal/zzak;-><init>(Lcom/google/android/recaptcha/internal/zzan;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzak;->zzb:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzak;->zzd:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzak;->zza:Ljava/lang/Object;

    check-cast v2, LTi/a;

    iget-object v6, v0, Lcom/google/android/recaptcha/internal/zzak;->zze:Lcom/google/android/recaptcha/internal/zzan;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzan;->zzg:LTi/a;

    iput-object p0, v0, Lcom/google/android/recaptcha/internal/zzak;->zze:Lcom/google/android/recaptcha/internal/zzan;

    iput-object v2, v0, Lcom/google/android/recaptcha/internal/zzak;->zza:Ljava/lang/Object;

    iput v4, v0, Lcom/google/android/recaptcha/internal/zzak;->zzd:I

    invoke-interface {v2, v5, v0}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v1, :cond_7

    move-object v6, p0

    :goto_1
    :try_start_0
    iget-object p1, v6, Lcom/google/android/recaptcha/internal/zzan;->zze:Lcom/google/android/recaptcha/internal/zzao;

    sget-object v7, Lcom/google/android/recaptcha/internal/zzao;->zza:Lcom/google/android/recaptcha/internal/zzao;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, v5}, LTi/a;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :try_start_1
    sget-object p1, Lcom/google/android/recaptcha/internal/zzao;->zzb:Lcom/google/android/recaptcha/internal/zzao;

    iput-object p1, v6, Lcom/google/android/recaptcha/internal/zzan;->zze:Lcom/google/android/recaptcha/internal/zzao;

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2, v5}, LTi/a;->d(Ljava/lang/Object;)V

    iget-object p1, v6, Lcom/google/android/recaptcha/internal/zzan;->zzc:Lcom/google/android/recaptcha/internal/zzek;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzek;->zzd()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/android/recaptcha/internal/zzek;->zzc(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzek;

    invoke-virtual {p1, v3}, Lcom/google/android/recaptcha/internal/zzek;->zzb(I)Lcom/google/android/recaptcha/internal/zzek;

    const/16 v2, 0x26

    invoke-virtual {p1, v2}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object p1

    invoke-static {v5, v4, v5}, LIi/z;->b(LIi/y0;ILjava/lang/Object;)LIi/x;

    move-result-object v2

    iput-object v2, v6, Lcom/google/android/recaptcha/internal/zzan;->zza:LIi/x;

    iget-object v7, v6, Lcom/google/android/recaptcha/internal/zzan;->zzb:LIi/N;

    new-instance v10, Lcom/google/android/recaptcha/internal/zzam;

    invoke-direct {v10, v6, p1, v5}, Lcom/google/android/recaptcha/internal/zzam;-><init>(Lcom/google/android/recaptcha/internal/zzan;Lcom/google/android/recaptcha/internal/zzen;Ldh/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzak;->zze:Lcom/google/android/recaptcha/internal/zzan;

    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzak;->zza:Ljava/lang/Object;

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzak;->zzd:I

    iget-boolean p1, v6, Lcom/google/android/recaptcha/internal/zzan;->zzh:Z

    if-nez p1, :cond_5

    new-instance v7, Ljava/util/Timer;

    invoke-direct {v7}, Ljava/util/Timer;-><init>()V

    new-instance v8, Lcom/google/android/recaptcha/internal/zzai;

    invoke-direct {v8, v6}, Lcom/google/android/recaptcha/internal/zzai;-><init>(Lcom/google/android/recaptcha/internal/zzan;)V

    const-wide/32 v11, 0x1b77400

    move-wide v9, v11

    invoke-virtual/range {v7 .. v12}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    iput-boolean v4, v6, Lcom/google/android/recaptcha/internal/zzan;->zzh:Z

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_3
    invoke-interface {v2, v5}, LTi/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_7
    :goto_4
    return-object v1
.end method

.method public final zzf()LIi/x;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzan;->zza:LIi/x;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
