.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->D(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field final synthetic b:LEb/r;

.field final synthetic c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->b:LEb/r;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->b:LEb/r;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSO - Updating User info for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->g(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)LLb/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v1

    new-instance v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;->b:LEb/r;

    invoke-direct {v3, v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;-><init>(LEb/r;)V

    invoke-interface {v0, v1, v3}, LLb/b;->d(Ljava/util/UUID;Lmh/l;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    const-string v0, "Update account failed."

    const/4 v1, 0x6

    invoke-static {v0, v2, v2, v1, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

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
