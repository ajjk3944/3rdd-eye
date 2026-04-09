.class final Lcom/google/android/recaptcha/internal/zzeq;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field final synthetic zza:Lcom/google/android/recaptcha/internal/zzes;


# direct methods
.method constructor <init>(Lcom/google/android/recaptcha/internal/zzes;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzeq;->zza:Lcom/google/android/recaptcha/internal/zzes;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzeq;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzeq;->zza:Lcom/google/android/recaptcha/internal/zzes;

    invoke-direct {p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzeq;-><init>(Lcom/google/android/recaptcha/internal/zzes;Ldh/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzeq;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzeq;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzeq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzeq;->zza:Lcom/google/android/recaptcha/internal/zzes;

    const-class v0, Lcom/google/android/recaptcha/internal/zzeo;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzes;->zzb(Lcom/google/android/recaptcha/internal/zzes;)Lcom/google/android/recaptcha/internal/zzei;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzei;->zzb()I

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzes;->zzc()Ljava/util/Timer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzes;->zzf(Ljava/util/Timer;)V

    :cond_1
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzes;->zze(Lcom/google/android/recaptcha/internal/zzes;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_1
    monitor-exit v0

    throw p1
.end method
