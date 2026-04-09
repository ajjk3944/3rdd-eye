.class final Lcom/google/android/recaptcha/internal/zzjc;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field final synthetic zza:Lcom/google/android/recaptcha/internal/zzjd;

.field final synthetic zzb:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/google/android/recaptcha/internal/zzjd;Landroid/content/Context;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzjc;->zza:Lcom/google/android/recaptcha/internal/zzjd;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzjc;->zzb:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/google/android/recaptcha/internal/zzjc;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzjc;->zza:Lcom/google/android/recaptcha/internal/zzjd;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzjc;->zzb:Landroid/content/Context;

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/recaptcha/internal/zzjc;-><init>(Lcom/google/android/recaptcha/internal/zzjd;Landroid/content/Context;Ldh/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzjc;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzjc;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzjc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzjc;->zza:Lcom/google/android/recaptcha/internal/zzjd;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzjd;->zza(Lcom/google/android/recaptcha/internal/zzjd;)Landroid/webkit/WebView;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzjc;->zzb:Landroid/content/Context;

    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    move-object p1, v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzjc;->zza:Lcom/google/android/recaptcha/internal/zzjd;

    invoke-static {v0, p1}, Lcom/google/android/recaptcha/internal/zzjd;->zzb(Lcom/google/android/recaptcha/internal/zzjd;Landroid/webkit/WebView;)V

    return-object p1
.end method
