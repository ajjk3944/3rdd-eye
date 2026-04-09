.class final Lcom/google/android/recaptcha/internal/zzco;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field zza:I

.field final synthetic zzb:Landroid/app/Application;

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:J


# direct methods
.method constructor <init>(Landroid/app/Application;Ljava/lang/String;JLdh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzco;->zzb:Landroid/app/Application;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzco;->zzc:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzco;->zzd:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Lcom/google/android/recaptcha/internal/zzco;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzco;->zzb:Landroid/app/Application;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzco;->zzc:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzco;->zzd:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzco;-><init>(Landroid/app/Application;Ljava/lang/String;JLdh/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzco;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzco;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzco;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzco;->zza:I

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzco;->zzb:Landroid/app/Application;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzco;->zzc:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzco;->zzd:J

    const/4 v4, 0x1

    iput v4, p0, Lcom/google/android/recaptcha/internal/zzco;->zza:I

    invoke-static {p1, v1, v2, v3, p0}, Lcom/google/android/recaptcha/internal/zzcq;->zzb(Landroid/app/Application;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method
