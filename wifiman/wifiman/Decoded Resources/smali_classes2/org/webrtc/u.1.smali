.class public final synthetic Lorg/webrtc/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lorg/webrtc/EglRenderer;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/EglRenderer;FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/u;->a:Lorg/webrtc/EglRenderer;

    iput p2, p0, Lorg/webrtc/u;->b:F

    iput p3, p0, Lorg/webrtc/u;->c:F

    iput p4, p0, Lorg/webrtc/u;->d:F

    iput p5, p0, Lorg/webrtc/u;->e:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lorg/webrtc/u;->a:Lorg/webrtc/EglRenderer;

    iget v1, p0, Lorg/webrtc/u;->b:F

    iget v2, p0, Lorg/webrtc/u;->c:F

    iget v3, p0, Lorg/webrtc/u;->d:F

    iget v4, p0, Lorg/webrtc/u;->e:F

    invoke-static {v0, v1, v2, v3, v4}, Lorg/webrtc/EglRenderer;->c(Lorg/webrtc/EglRenderer;FFFF)V

    return-void
.end method
