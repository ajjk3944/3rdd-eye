.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->s(Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/sso/api/UiAccountApi;


# direct methods
.method public constructor <init>(Lcom/ui/sso/api/UiAccountApi;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v0}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result v0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/sso/api/UiAccountApi$c;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v2}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/sso/api/UiAccountApi$c;->a()Lcom/ui/sso/api/UiAccountApi$a;

    move-result-object v2

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v3}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UI Account API (v"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") provided by "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " accessed "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " - state: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v0}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->e()LNa/c;

    move-result-object v0

    sget-object v3, LNa/c;->ANDROID:LNa/c;

    if-eq v0, v3, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v3}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v4}, Lcom/ui/sso/api/UiAccountApi;->i()Lcom/ui/sso/api/UiAccountApi$d;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$a;-><init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;)V

    invoke-static {v0, v2, v1, v2}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
