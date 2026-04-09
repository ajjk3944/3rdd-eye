.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;->a(Ljava/util/List;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

.field final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 2

    const-string v0, "localAccounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;->b:Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->l(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ljava/util/List;Ljava/util/List;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A$a;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
