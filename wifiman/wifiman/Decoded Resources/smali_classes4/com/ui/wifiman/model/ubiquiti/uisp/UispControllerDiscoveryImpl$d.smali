.class final Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;-><init>(LZc/f;Lfd/b;)V
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

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string v0, "apiEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->b(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)LZc/f;

    move-result-object p1

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

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

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
