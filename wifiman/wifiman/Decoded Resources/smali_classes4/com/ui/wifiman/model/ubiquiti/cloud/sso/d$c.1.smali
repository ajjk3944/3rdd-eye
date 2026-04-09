.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;
    .locals 4

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v3, v0, p1, v3}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
