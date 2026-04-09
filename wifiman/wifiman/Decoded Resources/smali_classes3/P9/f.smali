.class public final LP9/f;
.super Landroidx/lifecycle/a;
.source "SourceFile"


# instance fields
.field private final e:Lcom/ui/sso/api/UiAccountApi$b;

.field private f:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/sso/api/UiAccountApi$b;LP9/k;Lq2/f;Landroid/os/Bundle;)V
    .locals 0

    const-string/jumbo p2, "uiAccountApiService"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "owner"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4}, Landroidx/lifecycle/a;-><init>(Lq2/f;Landroid/os/Bundle;)V

    iput-object p1, p0, LP9/f;->e:Lcom/ui/sso/api/UiAccountApi$b;

    return-void
.end method


# virtual methods
.method protected f(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/E;)Landroidx/lifecycle/N;
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "modelClass"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "handle"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object p2, p0, LP9/f;->e:Lcom/ui/sso/api/UiAccountApi$b;

    const/4 v0, 0x0

    invoke-direct {p1, p2, p3, v0}, Lcom/ui/core/ui/sso/SSOAccountVM;-><init>(Lcom/ui/sso/api/UiAccountApi$b;Landroidx/lifecycle/E;LP9/k;)V

    iput-object p1, p0, LP9/f;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "Unknown ViewModel class: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
