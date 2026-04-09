.class public final synthetic LI7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/j;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LI7/j;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    check-cast p1, Lgg/h;

    invoke-static {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->d(Ljava/util/concurrent/atomic/AtomicInteger;Lgg/h;)V

    return-void
.end method
