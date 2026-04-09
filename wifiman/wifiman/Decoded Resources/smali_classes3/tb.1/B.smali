.class public final synthetic Ltb/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lorg/webrtc/PeerConnection;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/PeerConnection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/B;->a:Lorg/webrtc/PeerConnection;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ltb/B;->a:Lorg/webrtc/PeerConnection;

    invoke-static {v0}, Ltb/N;->n(Lorg/webrtc/PeerConnection;)V

    return-void
.end method
