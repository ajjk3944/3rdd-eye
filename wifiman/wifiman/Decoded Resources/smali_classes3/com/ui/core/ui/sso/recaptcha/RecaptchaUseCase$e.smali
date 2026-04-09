.class final Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->f(Ljava/lang/String;)Lgg/z;
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

    iput-object p1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$e;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lgg/D;
    .locals 2

    iget-object v0, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$e;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    invoke-static {p1}, LYg/u;->a(Ljava/lang/Object;)LYg/u;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->d(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/u;

    invoke-virtual {p1}, LYg/u;->o()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$e;->a(Ljava/lang/Object;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
