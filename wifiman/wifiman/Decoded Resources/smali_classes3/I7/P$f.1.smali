.class public final LI7/P$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->Z(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;


# direct methods
.method public constructor <init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)V
    .locals 0

    iput-object p1, p0, LI7/P$f;->a:LI7/P;

    iput-object p2, p0, LI7/P$f;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LI7/P$f;->a:LI7/P;

    iget-object v1, p0, LI7/P$f;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    invoke-static {v0, v1}, LI7/P;->S(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
