.class public final synthetic LI7/I0;
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

    iput-object p1, p0, LI7/I0;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI7/I0;->a:Lmh/p;

    invoke-static {v0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->l(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
