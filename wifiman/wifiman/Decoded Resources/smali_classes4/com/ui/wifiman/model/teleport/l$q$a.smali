.class final Lcom/ui/wifiman/model/teleport/l$q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$q;->a(Ljava/util/concurrent/ConcurrentHashMap;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/l$q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$q$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/l$q$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/l$q$a;->a:Lcom/ui/wifiman/model/teleport/l$q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;Lcom/ui/wifiman/model/teleport/l$d;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/wifiman/model/teleport/l$d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p2, Lcom/ui/wifiman/model/teleport/l$d;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/teleport/l$q$a;->a(Ljava/util/concurrent/ConcurrentHashMap;Lcom/ui/wifiman/model/teleport/l$d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    return-object p1
.end method
