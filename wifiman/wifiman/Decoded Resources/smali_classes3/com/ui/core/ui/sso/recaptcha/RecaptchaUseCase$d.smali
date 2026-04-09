.class final Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->f(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->b:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    iput-object p2, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;

    iget-object v0, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->b:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    iget-object v1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;-><init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    check-cast p1, LYg/u;

    invoke-virtual {p1}, LYg/u;->o()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/recaptcha/Recaptcha;->INSTANCE:Lcom/google/android/recaptcha/Recaptcha;

    iget-object p1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->b:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    invoke-static {p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->c(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)Landroid/app/Application;

    move-result-object p1

    iget-object v3, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->c:Ljava/lang/String;

    iput v2, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->a:I

    const-wide/16 v4, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p1

    move-object v6, p0

    invoke-static/range {v1 .. v8}, Lcom/google/android/recaptcha/Recaptcha;->getClient-BWLJW6A$default(Lcom/google/android/recaptcha/Recaptcha;Landroid/app/Application;Ljava/lang/String;JLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-static {p1}, LYg/u;->a(Ljava/lang/Object;)LYg/u;

    move-result-object p1

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
