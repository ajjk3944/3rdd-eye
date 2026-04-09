.class public final Ltf4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzf4;


# instance fields
.field public final f:Landroid/media/MediaCodec;

.field public final g:Lwf4;

.field public final h:Lvf4;

.field public final i:Lwt2;

.field public j:Z

.field public k:I


# direct methods
.method public synthetic constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lvf4;Lwt2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 5
    .line 6
    new-instance p1, Lwf4;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lwf4;-><init>(Landroid/os/HandlerThread;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ltf4;->g:Lwf4;

    .line 12
    .line 13
    iput-object p3, p0, Ltf4;->h:Lvf4;

    .line 14
    .line 15
    iput-object p4, p0, Ltf4;->i:Lwt2;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Ltf4;->k:I

    .line 19
    .line 20
    return-void
.end method

.method public static c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    const-string p0, "Audio"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x2

    .line 16
    if-ne p1, p0, :cond_1

    .line 17
    .line 18
    const-string p0, "Video"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string p0, "Unknown("

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ")"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public final B(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final I(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final a(Landroid/media/MediaFormat;Landroid/view/Surface;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ltf4;->g:Lwf4;

    .line 2
    .line 3
    iget-object v1, v0, Lwf4;->c:Landroid/os/Handler;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    move v1, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lwf4;->b:Landroid/os/HandlerThread;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    new-instance v3, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 29
    .line 30
    invoke-virtual {v1, v0, v3}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;Landroid/os/Handler;)V

    .line 31
    .line 32
    .line 33
    iput-object v3, v0, Lwf4;->c:Landroid/os/Handler;

    .line 34
    .line 35
    const-string v0, "configureCodec"

    .line 36
    .line 37
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-virtual {v1, p1, p2, v0, p3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Ltf4;->h:Lvf4;

    .line 48
    .line 49
    iget-boolean p2, p1, Lvf4;->f:Z

    .line 50
    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    iget-object p2, p1, Lvf4;->b:Landroid/os/HandlerThread;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 56
    .line 57
    .line 58
    new-instance p3, Lq3;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {p3, p1, p2}, Lq3;-><init>(Lvf4;Landroid/os/Looper;)V

    .line 65
    .line 66
    .line 67
    iput-object p3, p1, Lvf4;->c:Lq3;

    .line 68
    .line 69
    iput-boolean v2, p1, Lvf4;->f:Z

    .line 70
    .line 71
    :cond_1
    const-string p1, "startCodec"

    .line 72
    .line 73
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 80
    .line 81
    .line 82
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 p2, 0x23

    .line 85
    .line 86
    if-lt p1, p2, :cond_3

    .line 87
    .line 88
    iget-object p1, p0, Ltf4;->i:Lwt2;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object p2, p1, Lwt2;->h:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p2, Landroid/media/LoudnessCodecController;

    .line 95
    .line 96
    if-eqz p2, :cond_2

    .line 97
    .line 98
    invoke-static {p2, v1}, Lsf4;->e(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-nez p2, :cond_2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object p1, p1, Lwt2;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Ljava/util/HashSet;

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-static {p1}, Lzt0;->b0(Z)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_1
    iput v2, p0, Ltf4;->k:I

    .line 117
    .line 118
    return-void
.end method

.method public final b()I
    .locals 7

    .line 1
    iget-object v0, p0, Ltf4;->h:Lvf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf4;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf4;->g:Lwf4;

    .line 7
    .line 8
    iget-object v1, v0, Lwf4;->a:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v2, v0, Lwf4;->n:Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_8

    .line 15
    .line 16
    iget-object v2, v0, Lwf4;->j:Landroid/media/MediaCodec$CodecException;

    .line 17
    .line 18
    if-nez v2, :cond_7

    .line 19
    .line 20
    iget-object v2, v0, Lwf4;->k:Landroid/media/MediaCodec$CryptoException;

    .line 21
    .line 22
    if-nez v2, :cond_6

    .line 23
    .line 24
    iget-wide v2, v0, Lwf4;->l:J

    .line 25
    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v2, v2, v4

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-gtz v2, :cond_1

    .line 33
    .line 34
    iget-boolean v2, v0, Lwf4;->m:Z

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v2, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    move v2, v4

    .line 42
    :goto_1
    const/4 v5, -0x1

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    monitor-exit v1

    .line 46
    return v5

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    iget-object v0, v0, Lwf4;->d:Lef;

    .line 50
    .line 51
    iget v2, v0, Lef;->a:I

    .line 52
    .line 53
    iget v6, v0, Lef;->b:I

    .line 54
    .line 55
    if-ne v2, v6, :cond_3

    .line 56
    .line 57
    move v3, v4

    .line 58
    :cond_3
    if-eqz v3, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    if-eq v2, v6, :cond_5

    .line 62
    .line 63
    iget-object v3, v0, Lef;->c:[I

    .line 64
    .line 65
    aget v5, v3, v2

    .line 66
    .line 67
    add-int/2addr v2, v4

    .line 68
    iget v3, v0, Lef;->d:I

    .line 69
    .line 70
    and-int/2addr v2, v3

    .line 71
    iput v2, v0, Lef;->a:I

    .line 72
    .line 73
    :goto_2
    monitor-exit v1

    .line 74
    return v5

    .line 75
    :cond_5
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_6
    iput-object v3, v0, Lwf4;->k:Landroid/media/MediaCodec$CryptoException;

    .line 82
    .line 83
    throw v2

    .line 84
    :cond_7
    iput-object v3, v0, Lwf4;->j:Landroid/media/MediaCodec$CodecException;

    .line 85
    .line 86
    throw v2

    .line 87
    :cond_8
    iput-object v3, v0, Lwf4;->n:Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    throw v2

    .line 90
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    throw v0
.end method

.method public final c0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltf4;->h:Lvf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf4;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lvf4;->c:Lq3;

    .line 7
    .line 8
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final d(IIJI)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltf4;->h:Lvf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf4;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lvf4;->c()Luf4;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput p1, v1, Luf4;->a:I

    .line 11
    .line 12
    iput p2, v1, Luf4;->b:I

    .line 13
    .line 14
    iput-wide p3, v1, Luf4;->d:J

    .line 15
    .line 16
    iput p5, v1, Luf4;->e:I

    .line 17
    .line 18
    iget-object p1, v0, Lvf4;->c:Lq3;

    .line 19
    .line 20
    sget-object p2, Lv23;->a:Ljava/lang/String;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-virtual {p1, p2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final e()Landroid/media/MediaFormat;
    .locals 2

    .line 1
    iget-object v0, p0, Ltf4;->g:Lwf4;

    .line 2
    .line 3
    iget-object v1, v0, Lwf4;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lwf4;->h:Landroid/media/MediaFormat;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw v0
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()V
    .locals 7

    .line 1
    iget-object v0, p0, Ltf4;->h:Lvf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf4;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ltf4;->g:Lwf4;

    .line 12
    .line 13
    iget-object v2, v1, Lwf4;->a:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    iget-wide v3, v1, Lwf4;->l:J

    .line 17
    .line 18
    const-wide/16 v5, 0x1

    .line 19
    .line 20
    add-long/2addr v3, v5

    .line 21
    iput-wide v3, v1, Lwf4;->l:J

    .line 22
    .line 23
    iget-object v3, v1, Lwf4;->c:Landroid/os/Handler;

    .line 24
    .line 25
    sget-object v4, Lv23;->a:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v4, Lbh3;

    .line 28
    .line 29
    const/16 v5, 0xe

    .line 30
    .line 31
    invoke-direct {v4, v5, v1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw v0
.end method

.method public final j(Lk34;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltf4;->g:Lwf4;

    .line 2
    .line 3
    iget-object v1, v0, Lwf4;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iput-object p1, v0, Lwf4;->o:Lk34;

    .line 7
    .line 8
    monitor-exit v1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final k()V
    .locals 7

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/16 v2, 0x23

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    iget v4, p0, Ltf4;->k:I

    .line 9
    .line 10
    if-ne v4, v3, :cond_1

    .line 11
    .line 12
    iget-object v4, p0, Ltf4;->h:Lvf4;

    .line 13
    .line 14
    iget-boolean v5, v4, Lvf4;->f:Z

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {v4}, Lvf4;->a()V

    .line 19
    .line 20
    .line 21
    iget-object v5, v4, Lvf4;->b:Landroid/os/HandlerThread;

    .line 22
    .line 23
    invoke-virtual {v5}, Landroid/os/HandlerThread;->quit()Z

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v5, 0x0

    .line 27
    iput-boolean v5, v4, Lvf4;->f:Z

    .line 28
    .line 29
    iget-object v4, p0, Ltf4;->g:Lwf4;

    .line 30
    .line 31
    iget-object v5, v4, Lwf4;->a:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    :try_start_1
    iput-boolean v3, v4, Lwf4;->m:Z

    .line 35
    .line 36
    iget-object v6, v4, Lwf4;->b:Landroid/os/HandlerThread;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/os/HandlerThread;->quit()Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lwf4;->a()V

    .line 42
    .line 43
    .line 44
    monitor-exit v5

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v4

    .line 47
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :try_start_2
    throw v4

    .line 49
    :catchall_1
    move-exception v4

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    :goto_0
    const/4 v4, 0x2

    .line 52
    iput v4, p0, Ltf4;->k:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .line 54
    iget-boolean v4, p0, Ltf4;->j:Z

    .line 55
    .line 56
    if-nez v4, :cond_4

    .line 57
    .line 58
    :try_start_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    if-lt v4, v1, :cond_2

    .line 61
    .line 62
    if-ge v4, v0, :cond_2

    .line 63
    .line 64
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_2
    move-exception v0

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    :goto_1
    if-lt v4, v2, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Ltf4;->i:Lwt2;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    iget-object v1, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lwt2;->l(Landroid/media/MediaCodec;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 86
    .line 87
    .line 88
    iput-boolean v3, p0, Ltf4;->j:Z

    .line 89
    .line 90
    :cond_4
    return-void

    .line 91
    :goto_2
    iget-boolean v5, p0, Ltf4;->j:Z

    .line 92
    .line 93
    if-nez v5, :cond_8

    .line 94
    .line 95
    :try_start_4
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    if-lt v5, v1, :cond_5

    .line 98
    .line 99
    if-ge v5, v0, :cond_5

    .line 100
    .line 101
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 104
    .line 105
    .line 106
    :cond_5
    if-lt v5, v2, :cond_6

    .line 107
    .line 108
    iget-object v0, p0, Ltf4;->i:Lwt2;

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    iget-object v1, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lwt2;->l(Landroid/media/MediaCodec;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 120
    .line 121
    .line 122
    iput-boolean v3, p0, Ltf4;->j:Z

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :goto_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 126
    .line 127
    if-lt v1, v2, :cond_7

    .line 128
    .line 129
    iget-object v1, p0, Ltf4;->i:Lwt2;

    .line 130
    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    iget-object v2, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Lwt2;->l(Landroid/media/MediaCodec;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    iget-object v1, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 141
    .line 142
    .line 143
    iput-boolean v3, p0, Ltf4;->j:Z

    .line 144
    .line 145
    throw v0

    .line 146
    :cond_8
    :goto_4
    throw v4
.end method

.method public final m(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n(ILyu3;JI)V
    .locals 4

    .line 1
    iget-object v0, p0, Ltf4;->h:Lvf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf4;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lvf4;->c()Luf4;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput p1, v1, Luf4;->a:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, v1, Luf4;->b:I

    .line 14
    .line 15
    iput-wide p3, v1, Luf4;->d:J

    .line 16
    .line 17
    iput p5, v1, Luf4;->e:I

    .line 18
    .line 19
    iget-object p3, v1, Luf4;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 20
    .line 21
    iget p4, p2, Lyu3;->f:I

    .line 22
    .line 23
    iput p4, p3, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 24
    .line 25
    iget-object p4, p2, Lyu3;->d:[I

    .line 26
    .line 27
    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 28
    .line 29
    if-nez p4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    if-eqz p5, :cond_2

    .line 33
    .line 34
    array-length v2, p4

    .line 35
    array-length v3, p5

    .line 36
    if-ge v3, v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {p4, p1, p5, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    array-length p5, p4

    .line 44
    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    :goto_1
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 49
    .line 50
    iget-object p4, p2, Lyu3;->e:[I

    .line 51
    .line 52
    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 53
    .line 54
    if-nez p4, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    if-eqz p5, :cond_5

    .line 58
    .line 59
    array-length v2, p4

    .line 60
    array-length v3, p5

    .line 61
    if-ge v3, v2, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    invoke-static {p4, p1, p5, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_5
    :goto_2
    array-length p5, p4

    .line 69
    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 70
    .line 71
    .line 72
    move-result-object p5

    .line 73
    :goto_3
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 74
    .line 75
    iget-object p4, p2, Lyu3;->b:[B

    .line 76
    .line 77
    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 78
    .line 79
    if-nez p4, :cond_6

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_6
    if-eqz p5, :cond_8

    .line 83
    .line 84
    array-length v2, p4

    .line 85
    array-length v3, p5

    .line 86
    if-ge v3, v2, :cond_7

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    invoke-static {p4, p1, p5, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_8
    :goto_4
    array-length p5, p4

    .line 94
    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 95
    .line 96
    .line 97
    move-result-object p5

    .line 98
    :goto_5
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 102
    .line 103
    iget-object p4, p2, Lyu3;->a:[B

    .line 104
    .line 105
    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 106
    .line 107
    if-nez p4, :cond_9

    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_9
    if-eqz p5, :cond_b

    .line 111
    .line 112
    array-length v2, p4

    .line 113
    array-length v3, p5

    .line 114
    if-ge v3, v2, :cond_a

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_a
    invoke-static {p4, p1, p5, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_b
    :goto_6
    array-length p1, p4

    .line 122
    invoke-static {p4, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 123
    .line 124
    .line 125
    move-result-object p5

    .line 126
    :goto_7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 130
    .line 131
    iget p1, p2, Lyu3;->c:I

    .line 132
    .line 133
    iput p1, p3, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 134
    .line 135
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 136
    .line 137
    iget p4, p2, Lyu3;->g:I

    .line 138
    .line 139
    iget p2, p2, Lyu3;->h:I

    .line 140
    .line 141
    invoke-direct {p1, p4, p2}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, p1}, Landroid/media/MediaCodec$CryptoInfo;->setPattern(Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    .line 145
    .line 146
    .line 147
    iget-object p1, v0, Lvf4;->c:Lq3;

    .line 148
    .line 149
    sget-object p2, Lv23;->a:Ljava/lang/String;

    .line 150
    .line 151
    const/4 p2, 0x2

    .line 152
    invoke-virtual {p1, p2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-static {v0}, Lsf4;->d(Landroid/media/MediaCodec;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 11

    .line 1
    iget-object v0, p0, Ltf4;->h:Lvf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf4;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf4;->g:Lwf4;

    .line 7
    .line 8
    iget-object v1, v0, Lwf4;->a:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v2, v0, Lwf4;->n:Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_b

    .line 15
    .line 16
    iget-object v2, v0, Lwf4;->j:Landroid/media/MediaCodec$CodecException;

    .line 17
    .line 18
    if-nez v2, :cond_a

    .line 19
    .line 20
    iget-object v2, v0, Lwf4;->k:Landroid/media/MediaCodec$CryptoException;

    .line 21
    .line 22
    if-nez v2, :cond_9

    .line 23
    .line 24
    iget-wide v4, v0, Lwf4;->l:J

    .line 25
    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    cmp-long v2, v4, v6

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    if-gtz v2, :cond_1

    .line 33
    .line 34
    iget-boolean v2, v0, Lwf4;->m:Z

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v2, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    move v2, v5

    .line 42
    :goto_1
    const/4 v6, -0x1

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    monitor-exit v1

    .line 46
    return v6

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    iget-object v2, v0, Lwf4;->e:Lef;

    .line 51
    .line 52
    iget v7, v2, Lef;->a:I

    .line 53
    .line 54
    iget v8, v2, Lef;->b:I

    .line 55
    .line 56
    if-ne v7, v8, :cond_3

    .line 57
    .line 58
    move v4, v5

    .line 59
    :cond_3
    if-eqz v4, :cond_4

    .line 60
    .line 61
    monitor-exit v1

    .line 62
    return v6

    .line 63
    :cond_4
    if-eq v7, v8, :cond_8

    .line 64
    .line 65
    iget-object v4, v2, Lef;->c:[I

    .line 66
    .line 67
    aget v4, v4, v7

    .line 68
    .line 69
    add-int/2addr v7, v5

    .line 70
    iget v5, v2, Lef;->d:I

    .line 71
    .line 72
    and-int/2addr v5, v7

    .line 73
    iput v5, v2, Lef;->a:I

    .line 74
    .line 75
    if-ltz v4, :cond_6

    .line 76
    .line 77
    iget-object v2, v0, Lwf4;->h:Landroid/media/MediaFormat;

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    iget-object v0, v0, Lwf4;->f:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroid/media/MediaCodec$BufferInfo;

    .line 88
    .line 89
    iget v6, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 90
    .line 91
    iget v7, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 92
    .line 93
    iget-wide v8, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 94
    .line 95
    iget v10, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 96
    .line 97
    move-object v5, p1

    .line 98
    invoke-virtual/range {v5 .. v10}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    throw v3

    .line 103
    :cond_6
    const/4 p1, -0x2

    .line 104
    if-ne v4, p1, :cond_7

    .line 105
    .line 106
    iget-object v2, v0, Lwf4;->g:Ljava/util/ArrayDeque;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Landroid/media/MediaFormat;

    .line 113
    .line 114
    iput-object v2, v0, Lwf4;->h:Landroid/media/MediaFormat;

    .line 115
    .line 116
    move v4, p1

    .line 117
    :cond_7
    :goto_2
    monitor-exit v1

    .line 118
    return v4

    .line 119
    :cond_8
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 120
    .line 121
    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_9
    iput-object v3, v0, Lwf4;->k:Landroid/media/MediaCodec$CryptoException;

    .line 126
    .line 127
    throw v2

    .line 128
    :cond_a
    iput-object v3, v0, Lwf4;->j:Landroid/media/MediaCodec$CodecException;

    .line 129
    .line 130
    throw v2

    .line 131
    :cond_b
    iput-object v3, v0, Lwf4;->n:Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    throw v2

    .line 134
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    throw p1
.end method

.method public final z(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Ltf4;->f:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
