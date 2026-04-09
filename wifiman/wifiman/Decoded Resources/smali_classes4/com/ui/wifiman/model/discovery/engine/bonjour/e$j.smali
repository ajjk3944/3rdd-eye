.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;-><init>(LZc/f;Landroid/net/wifi/WifiManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$j;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)Lgg/D;
    .locals 2

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$j;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->g(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lb8/c;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {v1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$DiscoveryUnavailable;

    const-string v0, "JMDNS create failed - no IP available"

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$DiscoveryUnavailable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$j;->a(LZc/e;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
