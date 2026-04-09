.class final Lcom/ui/wifiman/model/wifi/scan/a$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/a;-><init>(Lme/f;Lje/B;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lme/F;Loe/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wifi/scan/a;

.field final synthetic b:Lcom/ui/wifiman/model/vendor/d$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wifi/scan/a;Lcom/ui/wifiman/model/vendor/d$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$m;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/wifi/scan/a$m;->b:Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wmw/g;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a$m;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/wifi/scan/a;->j(Lcom/ui/wifiman/model/wifi/scan/a;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wifi/scan/a$m;->b:Lcom/ui/wifiman/model/vendor/d$b;

    invoke-interface {v1}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object v1

    invoke-virtual {v1}, Lgg/z;->W()Lgg/i;

    move-result-object v1

    invoke-interface {p1}, Lcom/ui/wmw/g;->d()Lcom/ui/wmw/wifi/a$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/wifi/a$a;->b()Lgg/i;

    move-result-object p1

    new-instance v2, Lcom/ui/wifiman/model/wifi/scan/a$m$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/wifi/scan/a$m;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/model/wifi/scan/a$m$a;-><init>(Lcom/ui/wifiman/model/wifi/scan/a;)V

    invoke-static {v0, v1, p1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$m;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
