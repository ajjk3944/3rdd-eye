.class final LI7/P$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->close()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$d;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lgg/f;
    .locals 1

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    if-eqz v0, :cond_0

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    :goto_0
    if-eqz v0, :cond_2

    new-instance v0, LI7/P$d$a;

    invoke-direct {v0, p1}, LI7/P$d$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object p1, p0, LI7/P$d;->a:LI7/P;

    invoke-static {p1}, LI7/P;->N(LI7/P;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    invoke-virtual {p0, p1}, LI7/P$d;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
