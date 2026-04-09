.class final Lcom/google/android/recaptcha/internal/zzfs;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:Ljava/lang/Object;

.field zzc:I

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzgd;

.field final synthetic zze:Lcom/google/android/recaptcha/internal/zzft;

.field final synthetic zzf:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/recaptcha/internal/zzgd;Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzf:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lcom/google/android/recaptcha/internal/zzfs;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzf:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/google/android/recaptcha/internal/zzfs;-><init>(Lcom/google/android/recaptcha/internal/zzgd;Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzfs;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzfs;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzfs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzc:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzb:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/recaptcha/internal/zzjh;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zza:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/recaptcha/internal/zzub;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    new-instance v1, Lcom/google/android/recaptcha/internal/zzbn;

    invoke-direct {v1}, Lcom/google/android/recaptcha/internal/zzbn;-><init>()V

    iput-object v1, p1, Lcom/google/android/recaptcha/internal/zzgd;->zza:Lcom/google/android/recaptcha/internal/zzbn;

    :try_start_1
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzkh;->zzj(Ljava/lang/CharSequence;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzub;->zzi([B)Lcom/google/android/recaptcha/internal/zzub;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzub;->zzf()Lcom/google/android/recaptcha/internal/zztl;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzft;->zzb(Lcom/google/android/recaptcha/internal/zzft;)Lcom/google/android/recaptcha/internal/zzhx;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/recaptcha/internal/zzhx;->zza(Lcom/google/android/recaptcha/internal/zzub;)Lcom/google/android/recaptcha/internal/zztz;

    move-result-object v1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzjh;->zzb()Lcom/google/android/recaptcha/internal/zzjh;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zztz;->zzi()Ljava/util/List;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zza:Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzb:Ljava/lang/Object;

    iput v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzc:I

    invoke-static {v4, v1, v5, p0}, Lcom/google/android/recaptcha/internal/zzft;->zzc(Lcom/google/android/recaptcha/internal/zzft;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzgd;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_2

    move-object v2, p1

    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzjh;->zzf()Lcom/google/android/recaptcha/internal/zzjh;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzjh;->zza(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzub;->zzf()Lcom/google/android/recaptcha/internal/zztl;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zza:Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzb:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzc:I

    invoke-static {v1, p1, v2, p0}, Lcom/google/android/recaptcha/internal/zzft;->zzd(Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzgd;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
