.class public final Lcom/google/android/recaptcha/internal/zzcv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/app/Application;

.field private final zzb:LTi/a;

.field private zzc:Lcom/google/android/recaptcha/internal/zzdc;

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/recaptcha/internal/zzl;

.field private zzf:Lcom/google/android/recaptcha/internal/zzbi;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/google/android/recaptcha/internal/zzcv;->zza:Landroid/app/Application;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object v5

    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzcv;->zzb:LTi/a;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzcv;->zzd:Ljava/lang/String;

    new-instance v5, Lcom/google/android/recaptcha/internal/zzbi;

    invoke-direct {v5}, Lcom/google/android/recaptcha/internal/zzbi;-><init>()V

    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzcv;->zzf:Lcom/google/android/recaptcha/internal/zzbi;

    new-instance v5, Lcom/google/android/recaptcha/internal/zzl;

    invoke-direct {v5, v4, v3, v4}, Lcom/google/android/recaptcha/internal/zzl;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzcv;->zze:Lcom/google/android/recaptcha/internal/zzl;

    sget v5, Lcom/google/android/recaptcha/internal/zzav;->zza:I

    new-instance v5, Lcom/google/android/recaptcha/internal/zzaz;

    invoke-direct {v5, v4, v3, v4}, Lcom/google/android/recaptcha/internal/zzaz;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class v6, Lcom/google/android/recaptcha/internal/zzaz;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    new-instance v7, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v7, v6, v5}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v5, Lcom/google/android/recaptcha/internal/zzfu;

    invoke-direct {v5}, Lcom/google/android/recaptcha/internal/zzfu;-><init>()V

    const-class v6, Lcom/google/android/recaptcha/internal/zzfu;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    new-instance v8, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v8, v6, v5}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v5, Lcom/google/android/recaptcha/internal/zzbe;

    invoke-direct {v5}, Lcom/google/android/recaptcha/internal/zzbe;-><init>()V

    const-class v6, Lcom/google/android/recaptcha/internal/zzbe;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    new-instance v9, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v9, v6, v5}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v5, Lcom/google/android/recaptcha/internal/zzjd;

    invoke-direct {v5}, Lcom/google/android/recaptcha/internal/zzjd;-><init>()V

    const-class v6, Lcom/google/android/recaptcha/internal/zzjd;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    new-instance v10, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v10, v6, v5}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v5, Lcom/google/android/recaptcha/internal/zzbr;

    const-string/jumbo v6, "https://www.recaptcha.net/recaptcha/api3"

    invoke-direct {v5, v6}, Lcom/google/android/recaptcha/internal/zzbr;-><init>(Ljava/lang/String;)V

    const-class v6, Lcom/google/android/recaptcha/internal/zzbr;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    new-instance v11, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v11, v6, v5}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v5, Lcom/google/android/recaptcha/internal/zzex;

    invoke-direct {v5, v4, v3, v4}, Lcom/google/android/recaptcha/internal/zzex;-><init>(Lcom/google/android/recaptcha/internal/zzfm;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class v4, Lcom/google/android/recaptcha/internal/zzex;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    new-instance v12, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v12, v4, v5}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v4, Lcom/google/android/recaptcha/internal/zzfk;

    invoke-direct {v4, v3}, Lcom/google/android/recaptcha/internal/zzfk;-><init>(Z)V

    const-class v5, Lcom/google/android/recaptcha/internal/zzfk;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    new-instance v13, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v13, v5, v4}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    const-class v4, Landroid/app/Application;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    new-instance v14, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v14, v4, v1}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v4, Lcom/google/android/recaptcha/internal/zzbf;

    invoke-direct {v4, v1}, Lcom/google/android/recaptcha/internal/zzbf;-><init>(Landroid/content/Context;)V

    const-class v5, Lcom/google/android/recaptcha/internal/zzbf;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    new-instance v15, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v15, v5, v4}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v4, Lcom/google/android/recaptcha/internal/zzfj;

    invoke-direct {v4}, Lcom/google/android/recaptcha/internal/zzfj;-><init>()V

    const-class v5, Lcom/google/android/recaptcha/internal/zzfj;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    new-instance v6, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v6, v5, v4}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v4, Lcom/google/android/recaptcha/internal/zzbm;

    invoke-direct {v4, v1}, Lcom/google/android/recaptcha/internal/zzbm;-><init>(Landroid/content/Context;)V

    const-class v1, Lcom/google/android/recaptcha/internal/zzaq;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    new-instance v5, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v5, v1, v4}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v1, Lcom/google/android/recaptcha/internal/zzfa;

    invoke-direct {v1}, Lcom/google/android/recaptcha/internal/zzfa;-><init>()V

    const-class v4, Lcom/google/android/recaptcha/internal/zzey;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    new-instance v2, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v2, v4, v1}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    new-instance v1, Lcom/google/android/recaptcha/internal/zzff;

    invoke-direct {v1}, Lcom/google/android/recaptcha/internal/zzff;-><init>()V

    const-class v4, Lcom/google/android/recaptcha/internal/zzff;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    new-instance v3, Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {v3, v4, v1}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(ILjava/lang/Object;)V

    move-object/from16 v16, v6

    move-object/from16 v17, v5

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    filled-new-array/range {v7 .. v19}, [Lcom/google/android/recaptcha/internal/zzaw;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xd

    if-ge v2, v3, :cond_1

    aget-object v3, v1, v2

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzav;->zzc()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzaw;->zza()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzav;->zzc()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzaw;->zza()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 v3, 0x1

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzdc;
    .locals 2

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcv;->zzc:Lcom/google/android/recaptcha/internal/zzdc;

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzdc;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object p1, Lcom/google/android/recaptcha/internal/zzbb;->zzd:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v1, Lcom/google/android/recaptcha/internal/zzba;->zzam:Lcom/google/android/recaptcha/internal/zzba;

    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    throw p0

    :cond_1
    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final synthetic zzb(Lcom/google/android/recaptcha/internal/zzcv;Lcom/google/android/recaptcha/internal/zzdc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcv;->zzc:Lcom/google/android/recaptcha/internal/zzdc;

    return-void
.end method

.method public static final synthetic zzc(Lcom/google/android/recaptcha/internal/zzcv;J)V
    .locals 2

    const-wide/16 v0, 0x1388

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-ltz p1, :cond_1

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcv;->zza:Landroid/app/Application;

    const-string/jumbo p1, "android.permission.INTERNET"

    invoke-static {p0, p1}, Lt1/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object p1, Lcom/google/android/recaptcha/internal/zzbb;->zzc:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzba;->zzao:Lcom/google/android/recaptcha/internal/zzba;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object p1, Lcom/google/android/recaptcha/internal/zzbb;->zzj:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzba;->zzI:Lcom/google/android/recaptcha/internal/zzba;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic zze(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Lcom/google/android/recaptcha/internal/zzek;)Lcom/google/android/recaptcha/internal/zzcn;
    .locals 1

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcv;->zze:Lcom/google/android/recaptcha/internal/zzl;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzdt;

    invoke-direct {v0, p1, p2, p4, p0}, Lcom/google/android/recaptcha/internal/zzdt;-><init>(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/recaptcha/internal/zzl;)V

    sget-object p0, Lcom/google/android/recaptcha/internal/zzch;->zza:Lcom/google/android/recaptcha/internal/zzch;

    invoke-static {p3, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lcom/google/android/recaptcha/internal/zzef;

    invoke-direct {p0, v0}, Lcom/google/android/recaptcha/internal/zzef;-><init>(Lcom/google/android/recaptcha/internal/zzdt;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/android/recaptcha/internal/zzec;

    new-instance p1, Lcom/google/android/recaptcha/internal/zzbo;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzbo;-><init>()V

    invoke-direct {p0, v0, p2, p4, p1}, Lcom/google/android/recaptcha/internal/zzec;-><init>(Lcom/google/android/recaptcha/internal/zzdt;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/recaptcha/internal/zzbo;)V

    :goto_0
    return-object p0
.end method

.method public static synthetic zzf(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/common/api/ApiException;,
            Lcom/google/android/recaptcha/RecaptchaException;
        }
    .end annotation

    move-object v0, p0

    iget-object v5, v0, Lcom/google/android/recaptcha/internal/zzcv;->zzf:Lcom/google/android/recaptcha/internal/zzbi;

    sget-object v6, Lcom/google/android/recaptcha/internal/zzch;->zzb:Lcom/google/android/recaptcha/internal/zzch;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v7, p4

    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzcv;->zzh(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic zzh(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lkotlinx/coroutines/TimeoutCancellationException;,
            Lcom/google/android/gms/common/api/ApiException;,
            Lcom/google/android/recaptcha/RecaptchaException;
        }
    .end annotation

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/recaptcha/internal/zzcv;->zzf:Lcom/google/android/recaptcha/internal/zzbi;

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v6, p5

    :goto_0
    and-int/lit8 v1, p8, 0x10

    if-eqz v1, :cond_1

    sget-object v1, Lcom/google/android/recaptcha/internal/zzch;->zza:Lcom/google/android/recaptcha/internal/zzch;

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p6

    :goto_1
    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_2

    const-wide/16 v1, 0x2710

    move-wide v3, v1

    goto :goto_2

    :cond_2
    move-wide v3, p2

    :goto_2
    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/recaptcha/internal/zzcv;->zzg(Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic zzi(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;ILmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p1, p4}, Lcom/google/android/recaptcha/internal/zzcv;->zzj(Ljava/lang/String;ILmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final zzj(Ljava/lang/String;ILmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lcom/google/android/recaptcha/internal/zzcu;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/google/android/recaptcha/internal/zzcu;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzcu;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzcu;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcu;

    invoke-direct {v0, p0, p4}, Lcom/google/android/recaptcha/internal/zzcu;-><init>(Lcom/google/android/recaptcha/internal/zzcv;Ldh/e;)V

    :goto_0
    iget-object p4, v0, Lcom/google/android/recaptcha/internal/zzcu;->zza:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzcu;->zzc:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzcu;->zzd:Lcom/google/android/recaptcha/internal/zzen;

    :try_start_0
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_3

    :catch_1
    move-exception p2

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p4, p0, Lcom/google/android/recaptcha/internal/zzcv;->zzf:Lcom/google/android/recaptcha/internal/zzbi;

    invoke-direct {p0, p1, p4, p2}, Lcom/google/android/recaptcha/internal/zzcv;->zzk(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbi;I)Lcom/google/android/recaptcha/internal/zzek;

    move-result-object p1

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object p2

    :try_start_1
    iput-object p2, v0, Lcom/google/android/recaptcha/internal/zzcu;->zzd:Lcom/google/android/recaptcha/internal/zzen;

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzcu;->zzc:I

    invoke-interface {p3, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-eq p4, v1, :cond_3

    move-object p1, p2

    :goto_1
    :try_start_2
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzen;->zza()V
    :try_end_2
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p4

    :cond_3
    return-object v1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_4

    :goto_2
    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    :goto_3
    new-instance p3, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object p4, Lcom/google/android/recaptcha/internal/zzbb;->zzb:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzba;->zza:Lcom/google/android/recaptcha/internal/zzba;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p4, v0, p2}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lcom/google/android/recaptcha/internal/zzen;->zzb(Lcom/google/android/recaptcha/internal/zzbd;)V

    invoke-virtual {p3}, Lcom/google/android/recaptcha/internal/zzbd;->zzc()Lcom/google/android/recaptcha/RecaptchaException;

    move-result-object p1

    throw p1

    :goto_4
    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    :goto_5
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzen;->zzb(Lcom/google/android/recaptcha/internal/zzbd;)V

    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzbd;->zzc()Lcom/google/android/recaptcha/RecaptchaException;

    move-result-object p1

    throw p1
.end method

.method private final zzk(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbi;I)Lcom/google/android/recaptcha/internal/zzek;
    .locals 9

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/google/android/recaptcha/internal/zzav;->zza:I

    sget-object v1, Lcom/google/android/recaptcha/internal/zzcr;->zza:Lcom/google/android/recaptcha/internal/zzcr;

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    new-instance v7, Lcom/google/android/recaptcha/internal/zzes;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzcv;->zza:Landroid/app/Application;

    new-instance v3, Lcom/google/android/recaptcha/internal/zzeu;

    invoke-interface {v1}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzbr;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzbr;->zzc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/google/android/recaptcha/internal/zzeu;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzbi;->zza()LIi/N;

    move-result-object p2

    invoke-direct {v7, v2, v3, p2}, Lcom/google/android/recaptcha/internal/zzes;-><init>(Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzet;LIi/N;)V

    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzcv;->zza:Landroid/app/Application;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzcv;->zzd:Ljava/lang/String;

    new-instance p2, Lcom/google/android/recaptcha/internal/zzek;

    const/4 v8, 0x0

    move-object v1, p2

    move-object v2, p1

    move-object v4, v0

    move v5, p3

    invoke-direct/range {v1 .. v8}, Lcom/google/android/recaptcha/internal/zzek;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;Lcom/google/android/recaptcha/internal/zzeo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v0}, Lcom/google/android/recaptcha/internal/zzek;->zzc(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzek;

    return-object p2
.end method


# virtual methods
.method public final zzd()Lcom/google/android/recaptcha/internal/zzbi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcv;->zzf:Lcom/google/android/recaptcha/internal/zzbi;

    return-object v0
.end method

.method public final zzg(Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Ldh/e;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lkotlinx/coroutines/TimeoutCancellationException;,
            Lcom/google/android/gms/common/api/ApiException;,
            Lcom/google/android/recaptcha/RecaptchaException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p7

    instance-of v2, v0, Lcom/google/android/recaptcha/internal/zzcs;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/google/android/recaptcha/internal/zzcs;

    iget v3, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/recaptcha/internal/zzcs;

    invoke-direct {v2, v1, v0}, Lcom/google/android/recaptcha/internal/zzcs;-><init>(Lcom/google/android/recaptcha/internal/zzcv;Ldh/e;)V

    :goto_0
    iget-object v0, v2, Lcom/google/android/recaptcha/internal/zzcs;->zze:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    check-cast v2, LTi/a;

    :try_start_0
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v4, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzd:J

    iget-object v8, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzc:Ljava/lang/Object;

    check-cast v8, LTi/a;

    iget-object v9, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzi:Lcom/google/android/recaptcha/internal/zzch;

    iget-object v10, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzj:Lcom/google/android/recaptcha/internal/zzbi;

    iget-object v11, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzh:Ljava/lang/String;

    iget-object v12, v2, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    check-cast v12, Lcom/google/android/recaptcha/internal/zzcv;

    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v15, v9

    move-object v14, v10

    move-object v0, v12

    move-wide/from16 v20, v4

    move-object v5, v8

    move-object v4, v11

    move-wide/from16 v11, v20

    goto :goto_1

    :cond_3
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzb:LTi/a;

    iput-object v1, v2, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzh:Ljava/lang/String;

    iput-object v7, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzb:Ljava/lang/Object;

    move-object/from16 v8, p5

    iput-object v8, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzj:Lcom/google/android/recaptcha/internal/zzbi;

    move-object/from16 v9, p6

    iput-object v9, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzi:Lcom/google/android/recaptcha/internal/zzch;

    iput-object v0, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzc:Ljava/lang/Object;

    move-wide/from16 v10, p2

    iput-wide v10, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzd:J

    iput v5, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    invoke-interface {v0, v7, v2}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v3, :cond_6

    move-object v5, v0

    move-object v0, v1

    move-object v14, v8

    move-object v15, v9

    move-wide v11, v10

    :goto_1
    :try_start_1
    sget-object v8, Lcom/google/android/recaptcha/internal/zzch;->zza:Lcom/google/android/recaptcha/internal/zzch;

    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/4 v8, 0x3

    :goto_2
    move v13, v8

    goto :goto_3

    :cond_4
    sget-object v8, Lcom/google/android/recaptcha/internal/zzch;->zzb:Lcom/google/android/recaptcha/internal/zzch;

    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/4 v8, 0x4

    goto :goto_2

    :cond_5
    move v13, v6

    :goto_3
    new-instance v10, Lcom/google/android/recaptcha/internal/zzct;

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v8, v10

    move-object v9, v0

    move-object/from16 v18, v10

    move-object v10, v4

    move/from16 v19, v13

    move-object/from16 v13, v17

    invoke-direct/range {v8 .. v16}, Lcom/google/android/recaptcha/internal/zzct;-><init>(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Ldh/e;)V

    iput-object v5, v2, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    iput-object v7, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzh:Ljava/lang/String;

    iput-object v7, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzb:Ljava/lang/Object;

    iput-object v7, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzj:Lcom/google/android/recaptcha/internal/zzbi;

    iput-object v7, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzi:Lcom/google/android/recaptcha/internal/zzch;

    iput-object v7, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzc:Ljava/lang/Object;

    iput v6, v2, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    move-object/from16 v6, v18

    move/from16 v8, v19

    invoke-direct {v0, v4, v8, v6, v2}, Lcom/google/android/recaptcha/internal/zzcv;->zzj(Ljava/lang/String;ILmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eq v0, v3, :cond_6

    move-object v2, v5

    :goto_4
    :try_start_2
    check-cast v0, Lcom/google/android/recaptcha/internal/zzdc;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v2, v7}, LTi/a;->d(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v5

    :goto_5
    invoke-interface {v2, v7}, LTi/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_6
    return-object v3
.end method
