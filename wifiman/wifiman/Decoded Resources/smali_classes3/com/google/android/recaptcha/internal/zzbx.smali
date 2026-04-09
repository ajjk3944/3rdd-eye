.class public final Lcom/google/android/recaptcha/internal/zzbx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final zza(Lcom/google/android/gms/tasks/Task;)LIi/V;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LIi/z;->b(LIi/y0;ILjava/lang/Object;)LIi/x;

    move-result-object v0

    sget-object v1, Lcom/google/android/recaptcha/internal/zzbv;->zza:Lcom/google/android/recaptcha/internal/zzbv;

    new-instance v2, Lcom/google/android/recaptcha/internal/zzbu;

    invoke-direct {v2, v0}, Lcom/google/android/recaptcha/internal/zzbu;-><init>(LIi/x;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    new-instance p0, Lcom/google/android/recaptcha/internal/zzbw;

    invoke-direct {p0, v0}, Lcom/google/android/recaptcha/internal/zzbw;-><init>(LIi/x;)V

    return-object p0
.end method
