.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;->h(Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljava/lang/Object;)LDj/a;
    .locals 3

    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-static {v1, v2, p0, v0}, Lgg/i;->e2(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lgg/i;)LDj/a;
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/a;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/a;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;->c(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
