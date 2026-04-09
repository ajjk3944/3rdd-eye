.class final Lcom/ui/wifiman/model/teleport/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;->s()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/b$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$l;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/b$l;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b$l;->a:Lcom/ui/wifiman/model/teleport/b$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/teleport/n;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/teleport/b$l;->c(Lcom/ui/wifiman/model/teleport/n;)V

    return-void
.end method

.method private static final c(Lcom/ui/wifiman/model/teleport/n;)V
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object p0

    invoke-virtual {p0}, LKd/a;->g()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TeleportConnection - Opening tunnel ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] Finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$l;->b(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;
    .locals 4

    const-string v0, "tunnel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x500

    invoke-static {v0, v3, v1, v2, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$c;->b(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;ILcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;ILjava/lang/Object;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$l$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/b$l$a;-><init>(Lcom/ui/wifiman/model/teleport/n;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/f;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/f;-><init>(Lcom/ui/wifiman/model/teleport/n;)V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
