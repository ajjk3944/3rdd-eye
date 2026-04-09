.class public final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->I0(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

.field final synthetic b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;


# direct methods
.method public constructor <init>(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->a:Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->a:Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    invoke-virtual {v1}, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;->a()LEb/z;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LU9/e;->c(LEb/z;)LU9/b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo v2, "mfa params unavailable"

    invoke-direct {v1, v2}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    new-instance v2, Ls9/d$b;

    sget v3, LP9/b;->l:I

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v2}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->A0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Ls9/d;)V

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_6

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v2}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/core/ui/sso/c;->e()Lcom/ui/core/ui/sso/UiSSO$e;

    move-result-object v2

    invoke-static {v2}, Lia/a;->a(Lcom/ui/core/ui/sso/UiSSO$e;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Lcom/ui/core/ui/sso/UiSSO$e;

    iget-object v3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v3}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/core/ui/sso/c;->e()Lcom/ui/core/ui/sso/UiSSO$e;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/ui/core/ui/sso/UiSSO$e;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    const-string/jumbo v3, "S256"

    :cond_2
    iget-object v4, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v4}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/c;->e()Lcom/ui/core/ui/sso/UiSSO$e;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/UiSSO$e;->b()Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-direct {v2, v3, v0}, Lcom/ui/core/ui/sso/UiSSO$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    iget-object v2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v2}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->v0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)LLi/y;

    move-result-object v2

    new-instance v3, Lcom/ui/core/ui/sso/login/g$a$b;

    new-instance v4, Lcom/ui/core/ui/sso/UiSSO$d;

    iget-object v5, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->b:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v5}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v5

    invoke-interface {v5}, LGb/f;->z()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-direct {v4, v5, v1}, Lcom/ui/core/ui/sso/UiSSO$d;-><init>(Ljava/lang/String;LU9/b;)V

    invoke-direct {v3, v4, v0}, Lcom/ui/core/ui/sso/login/g$a$b;-><init>(Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;)V

    invoke-interface {v2, v3}, LLi/y;->j(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$Error$MissingMFAToken;

    const-string/jumbo v1, "mfa token was not set"

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/UiSSO$Error$MissingMFAToken;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_1
    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
