.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "k"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "_googlecast._tcp"

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$k;->b(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$j;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$j;
    .locals 4

    const-string v0, "txt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$j;

    const-string v1, "md"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "bs"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "fn"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$k;->a:Ljava/lang/String;

    return-object v0
.end method
