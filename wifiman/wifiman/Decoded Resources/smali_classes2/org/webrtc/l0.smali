.class public final synthetic Lorg/webrtc/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lorg/webrtc/SurfaceTextureHelper;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/SurfaceTextureHelper;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/l0;->a:Lorg/webrtc/SurfaceTextureHelper;

    iput p2, p0, Lorg/webrtc/l0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/l0;->a:Lorg/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lorg/webrtc/l0;->b:I

    invoke-static {v0, v1}, Lorg/webrtc/SurfaceTextureHelper;->f(Lorg/webrtc/SurfaceTextureHelper;I)V

    return-void
.end method
