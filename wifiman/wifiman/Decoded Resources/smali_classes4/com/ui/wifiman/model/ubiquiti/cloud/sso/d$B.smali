.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->C(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field final synthetic b:LEb/r;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->b:LEb/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;
    .locals 3

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->b:LEb/r;

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;

    invoke-direct {v2, v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/sso/api/UiAccountApi;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
