.class public interface abstract Lcom/ubnt/teleport/unifi/stun/TeleportStun;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;,
        Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;,
        Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error;
    }
.end annotation


# virtual methods
.method public abstract activateConnection()Lgg/b;
.end method

.method public abstract closeConnection()Lgg/b;
.end method

.method public abstract closePeer()Lgg/b;
.end method

.method public abstract createLocalPeerDescription(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)Lgg/z;
.end method

.method public abstract setupPeerConnection(Ljava/lang/String;)Lgg/z;
.end method
