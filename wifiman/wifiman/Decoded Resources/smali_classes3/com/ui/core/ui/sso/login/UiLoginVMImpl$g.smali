.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->B0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

.field final synthetic b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Sign in failed with unexpected error!"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;->b(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Throwable;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LGb/f;->n(Ljava/lang/String;)V

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;

    check-cast p1, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    invoke-direct {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;-><init>(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz v0, :cond_1

    new-instance p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$InvalidCredentials;

    invoke-direct {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$InvalidCredentials;-><init>()V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/unifi/core/sso/exceptions/EmailNotVerifiedException;

    if-eqz v0, :cond_2

    new-instance p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$EmailNotVerified;

    invoke-direct {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$EmailNotVerified;-><init>()V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lretrofit2/HttpException;

    if-nez v0, :cond_4

    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/ui/core/ui/sso/login/h;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/login/h;-><init>()V

    invoke-static {v0, p1}, LS9/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_1

    :cond_4
    :goto_0
    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$Network;

    invoke-direct {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$Network;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_1
    return-object p1
.end method
