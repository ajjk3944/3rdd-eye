.class final Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)LDj/a;
    .locals 2

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->d(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;LZc/e;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->e()Lgg/z;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a$a;

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a$b;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a$b;

    invoke-virtual {p1, v1}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance v1, Ll9/a;

    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;->a(LZc/e;)LDj/a;

    move-result-object p1

    return-object p1
.end method
