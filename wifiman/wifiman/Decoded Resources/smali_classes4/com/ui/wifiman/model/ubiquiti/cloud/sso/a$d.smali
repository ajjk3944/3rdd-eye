.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;-><init>(Ljava/util/UUID;LNd/c;Lfe/u;LT7/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)Lgg/D;
    .locals 4

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->d()LIi/J;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;-><init>(Lcom/ui/sso/api/UiAccountApi;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;Ldh/e;)V

    invoke-static {v0, v1}, LQi/l;->b(Ldh/i;Lmh/p;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;Lcom/ui/sso/api/UiAccountApi;)V

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
