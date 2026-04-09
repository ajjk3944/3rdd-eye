.class final LI7/P$y$d$e$f$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$y$d$e$f;->n(Lcom/wireguard/android/backend/c$a;)Lgg/f;
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

    iput-object p1, p0, LI7/P$y$d$e$f$d;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 2

    iget-object p1, p0, LI7/P$y$d$e$f$d;->a:LI7/P;

    invoke-static {p1}, LI7/P;->K(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LI7/P$y$d$e$f$d;->a:LI7/P;

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$a;

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;)V

    invoke-static {v0, v1}, LI7/P;->S(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LI7/P$y$d$e$f$d;->a(Lhg/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
