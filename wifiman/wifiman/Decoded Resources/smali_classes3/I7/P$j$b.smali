.class final LI7/P$j$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$j;->n(Ljava/lang/Boolean;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V
    .locals 0

    iput-object p1, p0, LI7/P$j$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, LI7/P$j$b;->h(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method


# virtual methods
.method public final c(Lgg/i;)LDj/a;
    .locals 3

    iget-object v0, p0, LI7/P$j$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    move-result-object v0

    instance-of v0, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v1, LI7/P$j$b$a;

    iget-object v2, p0, LI7/P$j$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {v1, v0, v2}, LI7/P$j$b$a;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    new-instance v0, LI7/X;

    invoke-direct {v0, v1}, LI7/X;-><init>(Lmh/l;)V

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LI7/P$j$b;->c(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
