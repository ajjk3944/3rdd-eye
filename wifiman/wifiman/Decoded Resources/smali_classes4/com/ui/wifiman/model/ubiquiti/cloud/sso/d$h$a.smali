.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$h;->a(Llc/c;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Llc/c;


# direct methods
.method public constructor <init>(Llc/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$h$a;->a:Llc/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$h$a;->a:Llc/c;

    invoke-virtual {v0}, Llc/c;->a()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v2, Lcom/ui/core/ui/sso/UiSSO$a;->Companion:Lcom/ui/core/ui/sso/UiSSO$a$a;

    invoke-virtual {v2, v0}, Lcom/ui/core/ui/sso/UiSSO$a$a;->a(Landroid/os/Bundle;)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$a;->e()LEb/r;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LEb/r;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_2
    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$a;->e()LEb/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LEb/r;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Obtained invalid User id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v0, v1, v1, v2, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_3
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method
