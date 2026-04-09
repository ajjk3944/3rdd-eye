.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$f;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$f;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "component1(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/auth/a;

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$f;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->f()Ljava/util/UUID;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, p1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;-><init>(Ljava/util/UUID;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/sso/auth/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$f;->a(LYg/s;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    move-result-object p1

    return-object p1
.end method
