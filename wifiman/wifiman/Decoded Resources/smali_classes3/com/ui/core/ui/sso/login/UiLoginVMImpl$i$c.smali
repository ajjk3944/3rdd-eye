.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->b(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Unexpected error in sign in process"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->b(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Throwable;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    sget-object v2, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;->IDLE:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    invoke-static {v1, v2}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->z0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    check-cast p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;->a()Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->y0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$InvalidCredentials;

    const-string/jumbo v1, "fromCallable(...)"

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$a;

    invoke-direct {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$a;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$Network;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$b;

    invoke-direct {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$b;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$EmailNotVerified;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$c;

    invoke-direct {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$c;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/ui/core/ui/sso/login/j;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/login/j;-><init>()V

    invoke-static {v0, p1}, LS9/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
