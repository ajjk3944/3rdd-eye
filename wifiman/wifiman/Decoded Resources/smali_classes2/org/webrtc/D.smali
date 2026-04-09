.class public final synthetic Lorg/webrtc/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lorg/webrtc/EglThread;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/EglThread;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/D;->a:Lorg/webrtc/EglThread;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/D;->a:Lorg/webrtc/EglThread;

    invoke-static {v0}, Lorg/webrtc/EglThread;->c(Lorg/webrtc/EglThread;)V

    return-void
.end method
