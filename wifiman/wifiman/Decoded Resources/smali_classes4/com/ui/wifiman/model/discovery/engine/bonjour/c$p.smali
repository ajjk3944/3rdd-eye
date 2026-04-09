.class abstract Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$a;,
        Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$b;,
        Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p;->b(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;
    .locals 4

    const-string v0, "txt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ty"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "usb_MDL"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "usb_MFG"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "adminurl"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v3, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;

    invoke-direct {v3, p1, v0, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method
