.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;->a(Lcom/ui/sso/api/UiAccountApi;)LDj/a;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/UUID;)Z
    .locals 1

    const-string v0, "authChangedAccountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->f()Ljava/util/UUID;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/UUID;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$a;->a(Ljava/util/UUID;)Z

    move-result p1

    return p1
.end method
