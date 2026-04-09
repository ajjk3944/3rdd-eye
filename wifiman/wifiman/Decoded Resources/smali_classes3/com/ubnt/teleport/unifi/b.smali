.class public final synthetic Lcom/ubnt/teleport/unifi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# instance fields
.field public final synthetic a:Lmh/p;


# direct methods
.method public synthetic constructor <init>(Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/b;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/b;->a:Lmh/p;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->c(Lmh/p;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
