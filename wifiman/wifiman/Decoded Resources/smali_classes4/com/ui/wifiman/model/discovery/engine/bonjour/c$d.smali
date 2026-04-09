.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$d;
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
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "_companion-link._tcp"

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$d;->b(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;
    .locals 1

    const-string v0, "txt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;->h:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$d;->a:Ljava/lang/String;

    return-object v0
.end method
