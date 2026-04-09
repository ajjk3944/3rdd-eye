.class public final Lcom/google/android/gms/measurement/internal/G6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final o:Lcom/google/common/collect/o;


# instance fields
.field private final a:Lcom/google/common/collect/p;

.field private final b:Lcom/google/common/collect/p;

.field private final c:Lcom/google/common/collect/r;

.field private final d:[C

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Z

.field private final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 25

    const-string v10, "AuthorizePurpose7"

    const-string v11, "PurposeDiagnostics"

    const-string v0, "Purpose7"

    const-string v1, "CmpSdkID"

    const-string v2, "PublisherCC"

    const-string v3, "PublisherRestrictions1"

    const-string v4, "PublisherRestrictions3"

    const-string v5, "PublisherRestrictions4"

    const-string v6, "PublisherRestrictions7"

    const-string v7, "AuthorizePurpose1"

    const-string v8, "AuthorizePurpose3"

    const-string v9, "AuthorizePurpose4"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v24

    const-string v12, "Version"

    const-string v13, "GoogleConsent"

    const-string v14, "VendorConsent"

    const-string v15, "VendorLegitimateInterest"

    const-string v16, "gdprApplies"

    const-string v17, "EnableAdvertiserConsentMode"

    const-string v18, "PolicyVersion"

    const-string v19, "PurposeConsents"

    const-string v20, "PurposeOneTreatment"

    const-string v21, "Purpose1"

    const-string v22, "Purpose3"

    const-string v23, "Purpose4"

    invoke-static/range {v12 .. v24}, Lcom/google/common/collect/o;->M0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/o;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/measurement/internal/G6;->o:Lcom/google/common/collect/o;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 9

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->zza:Lcom/google/android/gms/internal/measurement/M3;

    sget-object v1, Lcom/google/android/gms/measurement/internal/I6;->zza:Lcom/google/android/gms/measurement/internal/I6;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/measurement/M3;->zzb:Lcom/google/android/gms/internal/measurement/M3;

    sget-object v3, Lcom/google/android/gms/measurement/internal/I6;->zzb:Lcom/google/android/gms/measurement/internal/I6;

    .line 3
    invoke-static {v2, v3}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/M3;->zzc:Lcom/google/android/gms/internal/measurement/M3;

    .line 4
    invoke-static {v4, v1}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/internal/measurement/M3;->zzd:Lcom/google/android/gms/internal/measurement/M3;

    .line 5
    invoke-static {v5, v1}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/measurement/M3;->zze:Lcom/google/android/gms/internal/measurement/M3;

    .line 6
    invoke-static {v5, v3}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/measurement/M3;->zzf:Lcom/google/android/gms/internal/measurement/M3;

    .line 7
    invoke-static {v6, v3}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v6

    sget-object v7, Lcom/google/android/gms/internal/measurement/M3;->zzg:Lcom/google/android/gms/internal/measurement/M3;

    .line 8
    invoke-static {v7, v3}, Lcom/google/android/gms/measurement/internal/F6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    const/4 v7, 0x7

    new-array v7, v7, [Ljava/util/Map$Entry;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v4, v7, v0

    const/4 v0, 0x3

    aput-object v1, v7, v0

    const/4 v0, 0x4

    aput-object v5, v7, v0

    const/4 v0, 0x5

    aput-object v6, v7, v0

    const/4 v0, 0x6

    aput-object v3, v7, v0

    .line 9
    invoke-static {v7}, Lcom/google/common/collect/p;->v([Ljava/util/Map$Entry;)Lcom/google/common/collect/p;

    move-result-object v0

    const-string v1, "CH"

    .line 10
    invoke-static {v1}, Lcom/google/common/collect/r;->q0(Ljava/lang/Object;)Lcom/google/common/collect/r;

    move-result-object v1

    const/16 v2, 0x2f3

    .line 11
    invoke-direct {p0, p1, v2, v0, v1}, Lcom/google/android/gms/measurement/internal/G6;-><init>(Landroid/content/SharedPreferences;ILcom/google/common/collect/p;Lcom/google/common/collect/r;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/SharedPreferences;ILcom/google/common/collect/p;Lcom/google/common/collect/r;)V
    .locals 6

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x5

    .line 13
    new-array p2, p2, [C

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    .line 14
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/common/collect/p;

    .line 15
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/G6;->c:Lcom/google/common/collect/r;

    .line 16
    const-string p2, "IABTCF_CmpSdkID"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/measurement/internal/G6;->e:I

    .line 17
    const-string p2, "IABTCF_PolicyVersion"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/measurement/internal/G6;->h:I

    .line 18
    const-string p2, "IABTCF_gdprApplies"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/measurement/internal/G6;->g:I

    .line 19
    const-string p2, "IABTCF_PurposeOneTreatment"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/measurement/internal/G6;->i:I

    .line 20
    const-string p2, "IABTCF_EnableAdvertiserConsentMode"

    .line 21
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/measurement/internal/G6;->f:I

    .line 22
    const-string p2, "IABTCF_PublisherCC"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G6;->j:Ljava/lang/String;

    .line 23
    invoke-static {}, Lcom/google/common/collect/p;->d()Lcom/google/common/collect/p$a;

    move-result-object p2

    .line 24
    invoke-virtual {p3}, Lcom/google/common/collect/p;->p()Lcom/google/common/collect/r;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/common/collect/r;->T()Lcom/google/common/collect/S;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    const/16 v0, 0x2f2

    const/16 v1, 0x2f3

    const/4 v2, 0x1

    if-eqz p4, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/measurement/M3;

    .line 25
    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "IABTCF_PublisherRestrictions"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/measurement/internal/G6;->e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 26
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v4, v1, :cond_0

    goto :goto_2

    .line 27
    :cond_0
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v0

    if-ltz v0, :cond_5

    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/measurement/L3;->values()[Lcom/google/android/gms/internal/measurement/L3;

    move-result-object v1

    array-length v1, v1

    if-le v0, v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 29
    sget-object v0, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    goto :goto_3

    .line 30
    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/measurement/L3;->zzc:Lcom/google/android/gms/internal/measurement/L3;

    goto :goto_3

    .line 31
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/measurement/L3;->zzb:Lcom/google/android/gms/internal/measurement/L3;

    goto :goto_3

    .line 32
    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/measurement/L3;->zza:Lcom/google/android/gms/internal/measurement/L3;

    goto :goto_3

    .line 33
    :cond_5
    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/measurement/L3;->zza:Lcom/google/android/gms/internal/measurement/L3;

    goto :goto_3

    .line 34
    :cond_6
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    .line 35
    :goto_3
    invoke-virtual {p2, p4, v0}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    goto :goto_0

    .line 36
    :cond_7
    invoke-virtual {p2}, Lcom/google/common/collect/p$a;->c()Lcom/google/common/collect/p;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G6;->b:Lcom/google/common/collect/p;

    .line 37
    const-string p2, "IABTCF_PurposeConsents"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G6;->k:Ljava/lang/String;

    .line 38
    const-string p2, "IABTCF_VendorConsents"

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 39
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const/16 p4, 0x31

    const/4 v3, 0x0

    if-nez p3, :cond_9

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    if-lt p3, v1, :cond_9

    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    if-ne p2, p4, :cond_8

    move p2, v2

    goto :goto_4

    :cond_8
    move p2, v3

    :goto_4
    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/G6;->m:Z

    goto :goto_5

    .line 41
    :cond_9
    iput-boolean v3, p0, Lcom/google/android/gms/measurement/internal/G6;->m:Z

    .line 42
    :goto_5
    const-string p2, "IABTCF_PurposeLegitimateInterests"

    .line 43
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G6;->l:Ljava/lang/String;

    .line 44
    const-string p2, "IABTCF_VendorLegitimateInterests"

    .line 45
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/G6;->e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-lt p2, v1, :cond_b

    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    if-ne p1, p4, :cond_a

    move p1, v2

    goto :goto_6

    :cond_a
    move p1, v3

    :goto_6
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/G6;->n:Z

    goto :goto_7

    .line 49
    :cond_b
    iput-boolean v3, p0, Lcom/google/android/gms/measurement/internal/G6;->n:Z

    .line 50
    :goto_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    const/16 p2, 0x32

    aput-char p2, p1, v3

    .line 51
    :goto_8
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    array-length p2, p1

    if-le v2, p2, :cond_c

    const/16 p2, 0x30

    .line 52
    aput-char p2, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_c
    return-void
.end method

.method static a(Landroid/content/SharedPreferences;Ljava/lang/String;)I
    .locals 1

    const/4 v0, -0x1

    :try_start_0
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method

.method private static b(Lcom/google/android/gms/internal/measurement/M3;)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->zza:Lcom/google/android/gms/internal/measurement/M3;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->zzc:Lcom/google/android/gms/internal/measurement/M3;

    if-ne p0, v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->zzd:Lcom/google/android/gms/internal/measurement/M3;

    if-ne p0, v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->zze:Lcom/google/android/gms/internal/measurement/M3;

    if-ne p0, v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method private final d(Lcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L3;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G6;->b:Lcom/google/common/collect/p;

    sget-object v1, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    invoke-virtual {v0, p1, v1}, Lcom/google/common/collect/p;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/L3;

    return-object p1
.end method

.method static e(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    :try_start_0
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method private final f(Lcom/google/android/gms/internal/measurement/M3;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G6;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "0"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G6;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result v2

    if-lt v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G6;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/G6;->l:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/G6;->l:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result v3

    if-lt v2, v3, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G6;->l:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final g(Lcom/google/android/gms/internal/measurement/M3;)Z
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/G6;->b(Lcom/google/android/gms/internal/measurement/M3;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/G6;->m:Z

    const/4 v2, 0x0

    const/16 v3, 0x32

    if-nez v1, :cond_1

    if-lez v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v3, :cond_0

    const/16 v1, 0x34

    aput-char v1, p1, v0

    :cond_0
    return v2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G6;->k:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result v4

    if-ge v1, v4, :cond_3

    if-lez v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v3, :cond_2

    const/16 v1, 0x30

    aput-char v1, p1, v0

    :cond_2
    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G6;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result p1

    const/4 v4, 0x1

    sub-int/2addr p1, v4

    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x31

    if-ne p1, v1, :cond_4

    move v2, v4

    :cond_4
    if-lez v0, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v4, p1, v0

    if-eq v4, v3, :cond_6

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x36

    :goto_0
    aput-char v1, p1, v0

    :cond_6
    return v2
.end method

.method private final h(Lcom/google/android/gms/internal/measurement/M3;)Z
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/G6;->b(Lcom/google/android/gms/internal/measurement/M3;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/G6;->n:Z

    const/4 v2, 0x0

    const/16 v3, 0x32

    if-nez v1, :cond_1

    if-lez v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v3, :cond_0

    const/16 v1, 0x35

    aput-char v1, p1, v0

    :cond_0
    return v2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G6;->l:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result v4

    if-ge v1, v4, :cond_3

    if-lez v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v3, :cond_2

    const/16 v1, 0x30

    aput-char v1, p1, v0

    :cond_2
    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G6;->l:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/M3;->zza()I

    move-result p1

    const/4 v4, 0x1

    sub-int/2addr p1, v4

    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x31

    if-ne p1, v1, :cond_4

    move v2, v4

    :cond_4
    if-lez v0, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v4, p1, v0

    if-eq v4, v3, :cond_6

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x37

    :goto_0
    aput-char v1, p1, v0

    :cond_6
    return v2
.end method

.method private final i(Lcom/google/android/gms/internal/measurement/M3;)Z
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/G6;->b(Lcom/google/android/gms/internal/measurement/M3;)I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x32

    if-lez v0, :cond_1

    iget v3, p0, Lcom/google/android/gms/measurement/internal/G6;->g:I

    if-ne v3, v1, :cond_0

    iget v3, p0, Lcom/google/android/gms/measurement/internal/G6;->f:I

    if-eq v3, v1, :cond_1

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aput-char v2, v3, v0

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->d(Lcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L3;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/L3;->zza:Lcom/google/android/gms/internal/measurement/L3;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_3

    if-lez v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v2, :cond_2

    const/16 v1, 0x33

    aput-char v1, p1, v0

    :cond_2
    return v5

    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/measurement/M3;->zza:Lcom/google/android/gms/internal/measurement/M3;

    if-ne p1, v3, :cond_5

    iget v3, p0, Lcom/google/android/gms/measurement/internal/G6;->i:I

    if-ne v3, v1, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/G6;->c:Lcom/google/common/collect/r;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/G6;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/common/collect/n;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-lez v0, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v3, p1, v0

    if-eq v3, v2, :cond_4

    const/16 v2, 0x31

    aput-char v2, p1, v0

    :cond_4
    return v1

    :cond_5
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/common/collect/p;

    invoke-virtual {v3, p1}, Lcom/google/common/collect/p;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x30

    if-nez v3, :cond_7

    if-lez v0, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v2, :cond_6

    aput-char v4, p1, v0

    :cond_6
    return v5

    :cond_7
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/common/collect/p;

    invoke-virtual {v3, p1}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/I6;

    if-nez v3, :cond_9

    if-lez v0, :cond_8

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v2, :cond_8

    aput-char v4, p1, v0

    :cond_8
    return v5

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/16 v6, 0x38

    if-eqz v3, :cond_12

    if-eq v3, v1, :cond_f

    const/4 v1, 0x2

    if-eq v3, v1, :cond_d

    const/4 v1, 0x3

    if-eq v3, v1, :cond_b

    if-lez v0, :cond_a

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v2, :cond_a

    aput-char v4, p1, v0

    :cond_a
    return v5

    :cond_b
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->d(Lcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L3;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/L3;->zzb:Lcom/google/android/gms/internal/measurement/L3;

    if-ne v0, v1, :cond_c

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->g(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result p1

    return p1

    :cond_c
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->h(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result p1

    return p1

    :cond_d
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->d(Lcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L3;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/L3;->zzc:Lcom/google/android/gms/internal/measurement/L3;

    if-ne v0, v1, :cond_e

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->h(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result p1

    return p1

    :cond_e
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->g(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result p1

    return p1

    :cond_f
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->d(Lcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L3;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/measurement/L3;->zzb:Lcom/google/android/gms/internal/measurement/L3;

    if-ne v1, v3, :cond_11

    if-lez v0, :cond_10

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v2, :cond_10

    aput-char v6, p1, v0

    :cond_10
    return v5

    :cond_11
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->h(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result p1

    return p1

    :cond_12
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->d(Lcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L3;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/measurement/L3;->zzc:Lcom/google/android/gms/internal/measurement/L3;

    if-ne v1, v3, :cond_14

    if-lez v0, :cond_13

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    aget-char v1, p1, v0

    if-eq v1, v2, :cond_13

    aput-char v6, p1, v0

    :cond_13
    return v5

    :cond_14
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/G6;->g(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/G6;->b:Lcom/google/common/collect/p;

    sget-object v2, Lcom/google/android/gms/internal/measurement/M3;->zza:Lcom/google/android/gms/internal/measurement/M3;

    invoke-virtual {v1, v2}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/L3;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/G6;->b:Lcom/google/common/collect/p;

    sget-object v4, Lcom/google/android/gms/internal/measurement/M3;->zzc:Lcom/google/android/gms/internal/measurement/M3;

    invoke-virtual {v3, v4}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/L3;

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/G6;->b:Lcom/google/common/collect/p;

    sget-object v6, Lcom/google/android/gms/internal/measurement/M3;->zzd:Lcom/google/android/gms/internal/measurement/M3;

    invoke-virtual {v5, v6}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/L3;

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/G6;->b:Lcom/google/common/collect/p;

    sget-object v8, Lcom/google/android/gms/internal/measurement/M3;->zze:Lcom/google/android/gms/internal/measurement/M3;

    invoke-virtual {v7, v8}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/L3;

    invoke-static {}, Lcom/google/common/collect/p;->d()Lcom/google/common/collect/p$a;

    move-result-object v9

    const-string v10, "Version"

    const-string v11, "2"

    invoke-virtual {v9, v10, v11}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget-boolean v10, v0, Lcom/google/android/gms/measurement/internal/G6;->m:Z

    const-string v11, "0"

    const-string v12, "1"

    if-eqz v10, :cond_0

    move-object v10, v12

    goto :goto_0

    :cond_0
    move-object v10, v11

    :goto_0
    const-string v13, "VendorConsent"

    invoke-virtual {v9, v13, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget-boolean v10, v0, Lcom/google/android/gms/measurement/internal/G6;->n:Z

    if-eqz v10, :cond_1

    move-object v10, v12

    goto :goto_1

    :cond_1
    move-object v10, v11

    :goto_1
    const-string v13, "VendorLegitimateInterest"

    invoke-virtual {v9, v13, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget v10, v0, Lcom/google/android/gms/measurement/internal/G6;->g:I

    const/4 v13, 0x1

    if-ne v10, v13, :cond_2

    move-object v10, v12

    goto :goto_2

    :cond_2
    move-object v10, v11

    :goto_2
    const-string v14, "gdprApplies"

    invoke-virtual {v9, v14, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget v10, v0, Lcom/google/android/gms/measurement/internal/G6;->f:I

    if-ne v10, v13, :cond_3

    move-object v10, v12

    goto :goto_3

    :cond_3
    move-object v10, v11

    :goto_3
    const-string v14, "EnableAdvertiserConsentMode"

    invoke-virtual {v9, v14, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget v10, v0, Lcom/google/android/gms/measurement/internal/G6;->h:I

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "PolicyVersion"

    invoke-virtual {v9, v14, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget v10, v0, Lcom/google/android/gms/measurement/internal/G6;->e:I

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "CmpSdkID"

    invoke-virtual {v9, v14, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    iget v10, v0, Lcom/google/android/gms/measurement/internal/G6;->i:I

    if-ne v10, v13, :cond_4

    move-object v10, v12

    goto :goto_4

    :cond_4
    move-object v10, v11

    :goto_4
    const-string v13, "PurposeOneTreatment"

    invoke-virtual {v9, v13, v10}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    const-string v10, "PublisherCC"

    iget-object v13, v0, Lcom/google/android/gms/measurement/internal/G6;->j:Ljava/lang/String;

    invoke-virtual {v9, v10, v13}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v9

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v1

    goto :goto_5

    :cond_5
    sget-object v1, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v1

    :goto_5
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v10, "PublisherRestrictions1"

    invoke-virtual {v9, v10, v1}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v1

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v3

    goto :goto_6

    :cond_6
    sget-object v3, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v3

    :goto_6
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v9, "PublisherRestrictions3"

    invoke-virtual {v1, v9, v3}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v1

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v3

    goto :goto_7

    :cond_7
    sget-object v3, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v3

    :goto_7
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "PublisherRestrictions4"

    invoke-virtual {v1, v5, v3}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v1

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v3

    goto :goto_8

    :cond_8
    sget-object v3, Lcom/google/android/gms/internal/measurement/L3;->zzd:Lcom/google/android/gms/internal/measurement/L3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/L3;->zza()I

    move-result v3

    :goto_8
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "PublisherRestrictions7"

    invoke-virtual {v1, v5, v3}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    move-result-object v1

    invoke-direct {v0, v2}, Lcom/google/android/gms/measurement/internal/G6;->f(Lcom/google/android/gms/internal/measurement/M3;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v0, v4}, Lcom/google/android/gms/measurement/internal/G6;->f(Lcom/google/android/gms/internal/measurement/M3;)Ljava/lang/String;

    move-result-object v16

    invoke-direct {v0, v6}, Lcom/google/android/gms/measurement/internal/G6;->f(Lcom/google/android/gms/internal/measurement/M3;)Ljava/lang/String;

    move-result-object v18

    const-string v19, "Purpose7"

    invoke-direct {v0, v8}, Lcom/google/android/gms/measurement/internal/G6;->f(Lcom/google/android/gms/internal/measurement/M3;)Ljava/lang/String;

    move-result-object v20

    const-string v13, "Purpose1"

    const-string v15, "Purpose3"

    const-string v17, "Purpose4"

    invoke-static/range {v13 .. v20}, Lcom/google/common/collect/p;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/common/collect/p$a;->i(Ljava/util/Map;)Lcom/google/common/collect/p$a;

    move-result-object v1

    invoke-direct {v0, v2}, Lcom/google/android/gms/measurement/internal/G6;->i(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result v2

    if-eqz v2, :cond_9

    move-object v14, v12

    goto :goto_9

    :cond_9
    move-object v14, v11

    :goto_9
    invoke-direct {v0, v4}, Lcom/google/android/gms/measurement/internal/G6;->i(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result v2

    if-eqz v2, :cond_a

    move-object/from16 v16, v12

    goto :goto_a

    :cond_a
    move-object/from16 v16, v11

    :goto_a
    invoke-direct {v0, v6}, Lcom/google/android/gms/measurement/internal/G6;->i(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result v2

    if-eqz v2, :cond_b

    move-object/from16 v18, v12

    goto :goto_b

    :cond_b
    move-object/from16 v18, v11

    :goto_b
    invoke-direct {v0, v8}, Lcom/google/android/gms/measurement/internal/G6;->i(Lcom/google/android/gms/internal/measurement/M3;)Z

    move-result v2

    if-eqz v2, :cond_c

    move-object/from16 v20, v12

    goto :goto_c

    :cond_c
    move-object/from16 v20, v11

    :goto_c
    new-instance v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/G6;->d:[C

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V

    const-string v13, "AuthorizePurpose1"

    const-string v15, "AuthorizePurpose3"

    const-string v17, "AuthorizePurpose4"

    const-string v19, "AuthorizePurpose7"

    const-string v21, "PurposeDiagnostics"

    move-object/from16 v22, v2

    invoke-static/range {v13 .. v22}, Lcom/google/common/collect/p;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/common/collect/p$a;->i(Ljava/util/Map;)Lcom/google/common/collect/p$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/collect/p$a;->c()Lcom/google/common/collect/p;

    move-result-object v1

    return-object v1
.end method
