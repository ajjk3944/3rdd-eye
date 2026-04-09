.class final Lcom/ui/wifiman/model/teleport/b$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b$m;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/b$m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$m$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/b$m$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b$m$a;->a:Lcom/ui/wifiman/model/teleport/b$m$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Ll9/a;
    .locals 1

    const-string v0, "tunnelState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$m$a;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
