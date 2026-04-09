.class final Lcom/google/android/recaptcha/internal/zzip;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# instance fields
.field synthetic zza:Ljava/lang/Object;

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzja;

.field zzc:I

.field zzd:Lcom/google/android/recaptcha/internal/zzja;

.field zze:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/recaptcha/internal/zzja;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzip;->zzb:Lcom/google/android/recaptcha/internal/zzja;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzip;->zza:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzip;->zzc:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzip;->zzc:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzip;->zzb:Lcom/google/android/recaptcha/internal/zzja;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/google/android/recaptcha/internal/zzja;->zzf(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, LYg/u;->a(Ljava/lang/Object;)LYg/u;

    move-result-object p1

    return-object p1
.end method
