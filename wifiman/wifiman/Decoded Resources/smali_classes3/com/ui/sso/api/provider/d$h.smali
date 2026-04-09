.class public final Lcom/ui/sso/api/provider/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/d$h$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/ui/sso/api/provider/d$h$a;


# instance fields
.field private final a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/d$h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/d$h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/d$h;->b:Lcom/ui/sso/api/provider/d$h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    const-class v1, Lcom/ui/sso/api/provider/d;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;-><init>(Lth/p;)V

    iput-object v0, p0, Lcom/ui/sso/api/provider/d$h;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/provider/d;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/d$h;->e(Lcom/ui/sso/api/provider/d;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/d$h;->c(Landroid/os/Bundle;)Lcom/ui/sso/api/provider/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/os/Bundle;)Lcom/ui/sso/api/provider/d;
    .locals 3

    const-string/jumbo v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "params"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    new-instance v2, Lcom/ui/sso/api/provider/d$h$b;

    invoke-direct {v2, p1}, Lcom/ui/sso/api/provider/d$h$b;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, p0, Lcom/ui/sso/api/provider/d$h;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    invoke-virtual {v2, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Lcom/ui/sso/api/provider/d;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/ui/sso/api/provider/d;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    const-string v2, "Deserialized request msg with invalid type"

    invoke-direct {p1, v2, v1, v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    const-string/jumbo v2, "Key params not found in request bundle"

    invoke-direct {p1, v2, v1, v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public final d()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public e(Lcom/ui/sso/api/provider/d;)Landroid/os/Bundle;
    .locals 2

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/sso/api/provider/d$h;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    invoke-virtual {v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/ui/sso/api/provider/d$h$c;

    invoke-direct {v0, p1}, Lcom/ui/sso/api/provider/d$h$c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/d$h;->d()Landroid/os/Bundle;

    move-result-object v0

    const-string/jumbo v1, "params"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
