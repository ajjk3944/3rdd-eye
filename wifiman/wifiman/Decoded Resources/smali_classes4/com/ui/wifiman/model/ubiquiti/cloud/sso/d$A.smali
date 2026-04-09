.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->x(Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 3

    const-string v0, "apiAccounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->i(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
