.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)LDj/a;
    .locals 4

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->f()LLi/g;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V

    invoke-virtual {v1, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$b;

    invoke-direct {v2, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$b;-><init>(Lcom/ui/sso/api/UiAccountApi;)V

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/i;->T0(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;->a(Lcom/ui/sso/api/UiAccountApi;)LDj/a;

    move-result-object p1

    return-object p1
.end method
