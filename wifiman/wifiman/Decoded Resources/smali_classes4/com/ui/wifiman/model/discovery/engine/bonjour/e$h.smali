.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$h;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$h;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Linet/ipaddr/g;)Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;
    .locals 2

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$h;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-static {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->h(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;)Landroid/net/wifi/WifiManager;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;-><init>(Landroid/net/wifi/WifiManager;Linet/ipaddr/g;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Linet/ipaddr/g;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$h;->a(Linet/ipaddr/g;)Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;

    move-result-object p1

    return-object p1
.end method
