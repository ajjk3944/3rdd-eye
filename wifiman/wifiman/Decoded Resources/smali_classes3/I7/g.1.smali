.class public final LI7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI7/g;

.field private static b:Li9/a;

.field private static c:Z

.field private static d:Ljava/lang/String;

.field private static e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI7/g;

    invoke-direct {v0}, LI7/g;-><init>()V

    sput-object v0, LI7/g;->a:LI7/g;

    const-string/jumbo v1, "https://cloudaccess.svc.ubnt.com"

    sput-object v1, LI7/g;->d:Ljava/lang/String;

    invoke-virtual {v0}, LI7/g;->c()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    move-result-object v0

    sput-object v0, LI7/g;->e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;
    .locals 1

    sget-object v0, LI7/g;->e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    sget-object v0, LI7/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;
    .locals 4

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;

    const/4 v1, 0x5

    const-wide/16 v2, 0x3e8

    invoke-direct {v0, v1, v2, v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;-><init>(IJ)V

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/16 v2, 0x500

    invoke-direct {v1, v0, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;I)V

    return-object v1
.end method

.method public final d()Z
    .locals 1

    sget-boolean v0, LI7/g;->c:Z

    return v0
.end method

.method public final e()Li9/a;
    .locals 1

    sget-object v0, LI7/g;->b:Li9/a;

    return-object v0
.end method

.method public final f(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, LI7/g;->e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    return-void
.end method

.method public final g(Z)V
    .locals 0

    sput-boolean p1, LI7/g;->c:Z

    return-void
.end method

.method public final h(Li9/a;)V
    .locals 0

    sput-object p1, LI7/g;->b:Li9/a;

    return-void
.end method
