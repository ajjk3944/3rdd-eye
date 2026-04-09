.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;->a(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/f;
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

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a$a;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a$a;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    sget-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;->SUCCESS:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    invoke-static {p1, v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->z0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a$a;->a(Lhg/c;)V

    return-void
.end method
