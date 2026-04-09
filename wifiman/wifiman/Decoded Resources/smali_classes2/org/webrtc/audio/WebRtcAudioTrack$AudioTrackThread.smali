.class Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/audio/WebRtcAudioTrack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AudioTrackThread"
.end annotation


# instance fields
.field private bufferManager:Lorg/webrtc/audio/LowLatencyAudioBufferManager;

.field private volatile keepAlive:Z

.field final synthetic this$0:Lorg/webrtc/audio/WebRtcAudioTrack;


# direct methods
.method public constructor <init>(Lorg/webrtc/audio/WebRtcAudioTrack;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    new-instance p1, Lorg/webrtc/audio/LowLatencyAudioBufferManager;

    invoke-direct {p1}, Lorg/webrtc/audio/LowLatencyAudioBufferManager;-><init>()V

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->bufferManager:Lorg/webrtc/audio/LowLatencyAudioBufferManager;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const/16 v0, -0x13

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    invoke-static {}, Lorg/webrtc/audio/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudioTrackThread"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v0}, Lorg/webrtc/audio/WebRtcAudioTrack;->a(Lorg/webrtc/audio/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v2, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    invoke-static {v0}, Lorg/webrtc/audio/WebRtcAudioTrack;->i(Z)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v0, v4}, Lorg/webrtc/audio/WebRtcAudioTrack;->g(Lorg/webrtc/audio/WebRtcAudioTrack;I)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v0}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    :goto_1
    iget-boolean v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->d(Lorg/webrtc/audio/WebRtcAudioTrack;)J

    move-result-wide v5

    invoke-static {v5, v6, v0}, Lorg/webrtc/audio/WebRtcAudioTrack;->j(JI)V

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-gt v0, v2, :cond_1

    move v2, v3

    goto :goto_2

    :cond_1
    move v2, v4

    :goto_2
    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->i(Z)V

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->e(Lorg/webrtc/audio/WebRtcAudioTrack;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-object v5, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v5}, Lorg/webrtc/audio/WebRtcAudioTrack;->c(Lorg/webrtc/audio/WebRtcAudioTrack;)[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    :cond_2
    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->a(Lorg/webrtc/audio/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v2

    iget-object v5, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v5}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v2, v5, v0, v4}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result v2

    if-eq v2, v0, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AudioTrack.write played invalid number of bytes: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-gez v2, :cond_3

    iput-boolean v4, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    iget-object v5, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AudioTrack.write failed: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->h(Lorg/webrtc/audio/WebRtcAudioTrack;Ljava/lang/String;)V

    :cond_3
    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->f(Lorg/webrtc/audio/WebRtcAudioTrack;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->bufferManager:Lorg/webrtc/audio/LowLatencyAudioBufferManager;

    iget-object v5, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v5}, Lorg/webrtc/audio/WebRtcAudioTrack;->a(Lorg/webrtc/audio/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/webrtc/audio/LowLatencyAudioBufferManager;->maybeAdjustBufferSize(Landroid/media/AudioTrack;)V

    :cond_4
    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/audio/WebRtcAudioTrack;

    invoke-static {v2}, Lorg/webrtc/audio/WebRtcAudioTrack;->b(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    goto/16 :goto_1

    :cond_5
    return-void
.end method

.method public stopThread()V
    .locals 2

    const-string v0, "WebRtcAudioTrackExternal"

    const-string v1, "stopThread"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    return-void
.end method
