.class final Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->g(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$f;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/recaptcha/RecaptchaClient;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$f;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    sget-object v1, Lcom/google/android/recaptcha/RecaptchaAction;->LOGIN:Lcom/google/android/recaptcha/RecaptchaAction;

    invoke-static {v0, p1, v1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->b(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Lcom/google/android/recaptcha/RecaptchaClient;Lcom/google/android/recaptcha/RecaptchaAction;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/recaptcha/RecaptchaClient;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$f;->a(Lcom/google/android/recaptcha/RecaptchaClient;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
