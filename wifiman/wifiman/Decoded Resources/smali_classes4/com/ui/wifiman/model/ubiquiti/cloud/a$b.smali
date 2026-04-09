.class final Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/a;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lgg/D;
    .locals 3

    const-string v0, "catalogBrowser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->c(Lcom/ui/wifiman/model/ubiquiti/cloud/a;)Lcb/c;

    move-result-object v0

    invoke-virtual {v0}, Lcb/c;->c()Ljb/a;

    move-result-object v0

    invoke-interface {v0}, Ljb/a;->a()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/a;Lwa/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwa/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;->a(Lwa/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
