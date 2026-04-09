.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;
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


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lga/a;->a:Lga/a;

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v3

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->e()Lcom/ui/core/ui/sso/UiSSO$e;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lga/a;->b(Lga/a;LEb/r;LGb/f;Lcom/ui/core/ui/sso/UiSSO$e;ZILjava/lang/Object;)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;->a(LEb/r;)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object p1

    return-object p1
.end method
