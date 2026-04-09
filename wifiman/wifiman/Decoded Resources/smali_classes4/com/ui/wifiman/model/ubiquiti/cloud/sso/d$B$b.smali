.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field final synthetic b:LEb/r;

.field final synthetic c:Lcom/ui/sso/api/UiAccountApi;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/sso/api/UiAccountApi;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;->b:LEb/r;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;->c:Lcom/ui/sso/api/UiAccountApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 5

    :try_start_0
    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;->b:LEb/r;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;->c:Lcom/ui/sso/api/UiAccountApi;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)V

    const/4 v1, 0x1

    invoke-static {v4, v0, v1, v4}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
