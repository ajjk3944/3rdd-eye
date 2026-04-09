.class public final Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$RecaptchaFailureException;
    }
.end annotation


# instance fields
.field private final a:Landroid/app/Application;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string/jumbo v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->a:Landroid/app/Application;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Lcom/google/android/recaptcha/RecaptchaClient;Lcom/google/android/recaptcha/RecaptchaAction;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->e(Lcom/google/android/recaptcha/RecaptchaClient;Lcom/google/android/recaptcha/RecaptchaAction;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->a:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Ljava/lang/Object;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->h(Ljava/lang/Object;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/google/android/recaptcha/RecaptchaClient;Lcom/google/android/recaptcha/RecaptchaAction;)Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$a;-><init>(Lcom/google/android/recaptcha/RecaptchaClient;Lcom/google/android/recaptcha/RecaptchaAction;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    new-instance p2, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$b;

    invoke-direct {p2, p0}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$b;-><init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)V

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$c;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$c;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final f(Ljava/lang/String;)Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$d;-><init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;Ljava/lang/String;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$e;

    invoke-direct {v0, p0}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$e;-><init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "flatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final h(Ljava/lang/Object;)Lgg/z;
    .locals 1

    new-instance v0, Lca/c;

    invoke-direct {v0, p1}, Lca/c;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "fromCallable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LYg/v;->b(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public final g(Ljava/lang/String;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "siteKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->f(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$f;

    invoke-direct {v0, p0}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$f;-><init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$g;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$g;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
