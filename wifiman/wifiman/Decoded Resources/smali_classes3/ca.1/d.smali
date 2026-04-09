.class public final Lca/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca/d$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string/jumbo v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    invoke-direct {v0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;-><init>(Landroid/app/Application;)V

    invoke-direct {p0, v0}, Lca/d;-><init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)V

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;)V
    .locals 1

    const-string/jumbo v0, "recaptchaUseCase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lca/d;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    return-void
.end method

.method public static final synthetic a(Lca/d;)Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;
    .locals 0

    iget-object p0, p0, Lca/d;->a:Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    return-object p0
.end method

.method private final b()Lgg/z;
    .locals 2

    sget-object v0, Lca/d$b;->a:Lca/d$b;

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "fromCallable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final c()Lgg/z;
    .locals 2

    invoke-direct {p0}, Lca/d;->b()Lgg/z;

    move-result-object v0

    new-instance v1, Lca/d$c;

    invoke-direct {v1, p0}, Lca/d$c;-><init>(Lca/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "flatMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
