.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;
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

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "authResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-static {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->u0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a$a;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a$a;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;->a(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
