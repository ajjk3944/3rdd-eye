.class public final Lcom/google/android/recaptcha/internal/zzv;
.super Lcom/google/android/recaptcha/internal/zze;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/recaptcha/internal/zzek;

.field private final zzb:Ljava/util/List;

.field private zzc:Lcom/google/android/recaptcha/internal/zzle;

.field private final zzd:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/recaptcha/internal/zzbi;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Lcom/google/android/recaptcha/internal/zzab;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzek;->zza()Lcom/google/android/recaptcha/internal/zzek;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/recaptcha/internal/zzab;-><init>(Lcom/google/android/recaptcha/internal/zzek;)V

    new-instance v2, Lcom/google/android/recaptcha/internal/zzp;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzek;->zza()Lcom/google/android/recaptcha/internal/zzek;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzek;)V

    new-instance v3, Lcom/google/android/recaptcha/internal/zzm;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzek;->zza()Lcom/google/android/recaptcha/internal/zzek;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/google/android/recaptcha/internal/zzm;-><init>(Lcom/google/android/recaptcha/internal/zzek;Landroid/content/ContentResolver;)V

    new-instance v4, Lcom/google/android/recaptcha/internal/zzn;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzek;->zza()Lcom/google/android/recaptcha/internal/zzek;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/google/android/recaptcha/internal/zzn;-><init>(Lcom/google/android/recaptcha/internal/zzek;)V

    new-instance v5, Lcom/google/android/recaptcha/internal/zzae;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzek;->zza()Lcom/google/android/recaptcha/internal/zzek;

    move-result-object v13

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/recaptcha/internal/zzbi;->zzc()LIi/N;

    move-result-object v14

    new-instance v15, Lcom/google/android/recaptcha/internal/zzan;

    invoke-static/range {p1 .. p1}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->createStandard(Landroid/content/Context;)Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    move-result-object v10

    const-wide/32 v11, 0x1b77400

    move-object v6, v15

    move-object/from16 v7, p1

    move-object v8, v14

    move-object v9, v13

    invoke-direct/range {v6 .. v12}, Lcom/google/android/recaptcha/internal/zzan;-><init>(Landroid/content/Context;LIi/N;Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/play/core/integrity/StandardIntegrityManager;J)V

    new-instance v11, Lcom/google/android/recaptcha/internal/zzbs;

    invoke-static {}, Lr3/f;->f()Lr3/f;

    move-result-object v6

    invoke-direct {v11, v6}, Lcom/google/android/recaptcha/internal/zzbs;-><init>(Lr3/f;)V

    move-object v6, v5

    move-object v7, v13

    move-object/from16 v8, p1

    move-object v9, v14

    move-object v10, v15

    invoke-direct/range {v6 .. v11}, Lcom/google/android/recaptcha/internal/zzae;-><init>(Lcom/google/android/recaptcha/internal/zzek;Landroid/content/Context;LIi/N;Lcom/google/android/recaptcha/internal/zzan;Lcom/google/android/recaptcha/internal/zzbs;)V

    const/4 v6, 0x5

    new-array v6, v6, [Lcom/google/android/recaptcha/internal/zzy;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/4 v1, 0x2

    aput-object v3, v6, v1

    const/4 v1, 0x3

    aput-object v4, v6, v1

    const/4 v1, 0x4

    aput-object v5, v6, v1

    invoke-static {v6}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct/range {p0 .. p0}, Lcom/google/android/recaptcha/internal/zze;-><init>()V

    move-object/from16 v2, p2

    iput-object v2, v0, Lcom/google/android/recaptcha/internal/zzv;->zza:Lcom/google/android/recaptcha/internal/zzek;

    iput-object v1, v0, Lcom/google/android/recaptcha/internal/zzv;->zzb:Ljava/util/List;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, v0, Lcom/google/android/recaptcha/internal/zzv;->zzd:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic zzm(Lcom/google/android/recaptcha/internal/zzv;Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsi;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzv;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic zzn(Lcom/google/android/recaptcha/internal/zzv;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzv;->zzb:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic zzp(Lcom/google/android/recaptcha/internal/zzv;Lcom/google/android/recaptcha/internal/zzle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzv;->zzc:Lcom/google/android/recaptcha/internal/zzle;

    return-void
.end method

.method private final zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsi;
    .locals 5

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzv;->zzd:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzaa;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzaa;->zzb()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v2

    :cond_1
    invoke-direct {p0, v2, p1}, Lcom/google/android/recaptcha/internal/zzv;->zzs(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsz;

    move-result-object v0

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsi;->zzf()Lcom/google/android/recaptcha/internal/zzsh;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzsh;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsh;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsg;->zzf()Lcom/google/android/recaptcha/internal/zzsf;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzko;->zzd()[B

    move-result-object v0

    array-length v2, v0

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4, v2}, Lcom/google/android/recaptcha/internal/zzkh;->zzi([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/recaptcha/internal/zzsf;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsf;

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzsh;->zzf(Lcom/google/android/recaptcha/internal/zzsf;)Lcom/google/android/recaptcha/internal/zzsh;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzsi;

    return-object p1
.end method

.method private final zzr(Lcom/google/android/recaptcha/internal/zzaa;)Lcom/google/android/recaptcha/internal/zzsx;
    .locals 5

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsx;->zzf()Lcom/google/android/recaptcha/internal/zzsv;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzsv;->zzq(I)Lcom/google/android/recaptcha/internal/zzsv;

    instance-of v1, p1, Lcom/google/android/recaptcha/internal/zzx;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzx;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzx;->zza()Lcom/google/android/recaptcha/internal/zzti;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzv;->zzc:Lcom/google/android/recaptcha/internal/zzle;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzko;->zzd()[B

    move-result-object p1

    array-length v1, p1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    move-result-object v4

    invoke-virtual {v4, p1, v2, v1}, Lcom/google/android/recaptcha/internal/zzkh;->zzi([BII)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lcom/google/android/recaptcha/internal/zzcf;->zza(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzle;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzsv;->zzf(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsv;

    goto :goto_2

    :cond_1
    instance-of v1, p1, Lcom/google/android/recaptcha/internal/zzw;

    if-eqz v1, :cond_3

    check-cast p1, Lcom/google/android/recaptcha/internal/zzw;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzw;->zza()Lcom/google/android/recaptcha/internal/zzte;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzv;->zzc:Lcom/google/android/recaptcha/internal/zzle;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzko;->zzd()[B

    move-result-object p1

    array-length v1, p1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    move-result-object v4

    invoke-virtual {v4, p1, v2, v1}, Lcom/google/android/recaptcha/internal/zzkh;->zzi([BII)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lcom/google/android/recaptcha/internal/zzcf;->zza(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzle;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzsv;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsv;

    :goto_2
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzsx;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final zzs(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsz;
    .locals 5

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsz;->zzf()Lcom/google/android/recaptcha/internal/zzsy;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/recaptcha/internal/zzsy;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsy;

    iget-object p2, p0, Lcom/google/android/recaptcha/internal/zzv;->zzb:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/recaptcha/internal/zzy;

    invoke-interface {v3}, Lcom/google/android/recaptcha/internal/zzy;->zzf()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzy;

    invoke-interface {v1}, Lcom/google/android/recaptcha/internal/zzy;->zza()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v1}, Lcom/google/android/recaptcha/internal/zzy;->zza()I

    move-result v1

    new-instance v2, Lcom/google/android/recaptcha/internal/zzw;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzte;->zzf()Lcom/google/android/recaptcha/internal/zztd;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/recaptcha/internal/zztd;->zzf(I)Lcom/google/android/recaptcha/internal/zztd;

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zztd;->zzr(I)Lcom/google/android/recaptcha/internal/zztd;

    const/16 v4, 0x1b

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zztd;->zzq(I)Lcom/google/android/recaptcha/internal/zztd;

    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    move-result-object v3

    check-cast v3, Lcom/google/android/recaptcha/internal/zzte;

    invoke-direct {v2, v1, v3}, Lcom/google/android/recaptcha/internal/zzw;-><init>(ILcom/google/android/recaptcha/internal/zzte;)V

    invoke-direct {p0, v2}, Lcom/google/android/recaptcha/internal/zzv;->zzr(Lcom/google/android/recaptcha/internal/zzaa;)Lcom/google/android/recaptcha/internal/zzsx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzsy;->zzf(Lcom/google/android/recaptcha/internal/zzsx;)Lcom/google/android/recaptcha/internal/zzsy;

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzaa;

    invoke-direct {p0, v1}, Lcom/google/android/recaptcha/internal/zzv;->zzr(Lcom/google/android/recaptcha/internal/zzaa;)Lcom/google/android/recaptcha/internal/zzsx;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p2}, Lcom/google/android/recaptcha/internal/zzsy;->zze(Ljava/lang/Iterable;)Lcom/google/android/recaptcha/internal/zzsy;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzsz;

    return-object p1
.end method


# virtual methods
.method protected final zza(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzen;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzv;->zza:Lcom/google/android/recaptcha/internal/zzek;

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzek;->zzc(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzek;

    const/16 p1, 0x23

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object p1

    return-object p1
.end method

.method protected final zzb()Lcom/google/android/recaptcha/internal/zzen;
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzv;->zza:Lcom/google/android/recaptcha/internal/zzek;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzek;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzek;->zzc(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzek;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object v0

    return-object v0
.end method

.method protected final zzd(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzv;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsi;

    move-result-object p1

    return-object p1
.end method

.method protected final zzf(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzq;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/recaptcha/internal/zzq;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzq;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzq;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzq;

    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzq;-><init>(Lcom/google/android/recaptcha/internal/zzv;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzq;->zza:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzq;->zzc:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/recaptcha/internal/zzs;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lcom/google/android/recaptcha/internal/zzs;-><init>(Lcom/google/android/recaptcha/internal/zzv;Ljava/lang/String;Ldh/e;)V

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzq;->zzc:I

    invoke-static {p2, v0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, LYg/u;

    invoke-virtual {p2}, LYg/u;->o()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final zzh(Lcom/google/android/recaptcha/internal/zzsc;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzt;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/recaptcha/internal/zzt;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzt;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzt;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzt;

    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzt;-><init>(Lcom/google/android/recaptcha/internal/zzv;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzt;->zza:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzt;->zzc:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/recaptcha/internal/zzu;

    const/4 v2, 0x0

    invoke-direct {p2, p1, p0, v2}, Lcom/google/android/recaptcha/internal/zzu;-><init>(Lcom/google/android/recaptcha/internal/zzsc;Lcom/google/android/recaptcha/internal/zzv;Ldh/e;)V

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzt;->zzc:I

    invoke-static {p2, v0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, LYg/u;

    invoke-virtual {p2}, LYg/u;->o()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final zzk(Lcom/google/android/recaptcha/internal/zzsr;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzv;->zzb:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzy;

    invoke-interface {v1, p1}, Lcom/google/android/recaptcha/internal/zzy;->zze(Lcom/google/android/recaptcha/internal/zzsr;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zzo()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzv;->zzd:Ljava/util/Map;

    return-object v0
.end method
