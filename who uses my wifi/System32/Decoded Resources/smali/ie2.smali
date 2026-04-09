.class public final Lie2;
.super Ljava/lang/Thread;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# static fields
.field public static final G:[F


# instance fields
.field public A:Ljavax/microedition/khronos/egl/EGL10;

.field public B:Ljavax/microedition/khronos/egl/EGLDisplay;

.field public C:Ljavax/microedition/khronos/egl/EGLContext;

.field public D:Ljavax/microedition/khronos/egl/EGLSurface;

.field public volatile E:Z

.field public volatile F:Z

.field public final f:Lhe2;

.field public final g:[F

.field public final h:[F

.field public final i:[F

.field public final j:[F

.field public final k:[F

.field public final l:[F

.field public final m:[F

.field public n:F

.field public o:F

.field public p:F

.field public q:I

.field public r:I

.field public s:Landroid/graphics/SurfaceTexture;

.field public t:Landroid/graphics/SurfaceTexture;

.field public u:I

.field public v:I

.field public w:I

.field public final x:Ljava/nio/FloatBuffer;

.field public final y:Ljava/util/concurrent/CountDownLatch;

.field public final z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lie2;->G:[F

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "SphericalVideoProcessor"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x30

    .line 7
    .line 8
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lie2;->x:Ljava/nio/FloatBuffer;

    .line 25
    .line 26
    sget-object v1, Lie2;->G:[F

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 34
    .line 35
    .line 36
    const/16 v0, 0x9

    .line 37
    .line 38
    new-array v1, v0, [F

    .line 39
    .line 40
    iput-object v1, p0, Lie2;->g:[F

    .line 41
    .line 42
    new-array v1, v0, [F

    .line 43
    .line 44
    iput-object v1, p0, Lie2;->h:[F

    .line 45
    .line 46
    new-array v1, v0, [F

    .line 47
    .line 48
    iput-object v1, p0, Lie2;->i:[F

    .line 49
    .line 50
    new-array v1, v0, [F

    .line 51
    .line 52
    iput-object v1, p0, Lie2;->j:[F

    .line 53
    .line 54
    new-array v1, v0, [F

    .line 55
    .line 56
    iput-object v1, p0, Lie2;->k:[F

    .line 57
    .line 58
    new-array v1, v0, [F

    .line 59
    .line 60
    iput-object v1, p0, Lie2;->l:[F

    .line 61
    .line 62
    new-array v0, v0, [F

    .line 63
    .line 64
    iput-object v0, p0, Lie2;->m:[F

    .line 65
    .line 66
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 67
    .line 68
    iput v0, p0, Lie2;->n:F

    .line 69
    .line 70
    new-instance v0, Lhe2;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lhe2;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lie2;->f:Lhe2;

    .line 76
    .line 77
    iput-object p0, v0, Lhe2;->h:Lie2;

    .line 78
    .line 79
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lie2;->y:Ljava/util/concurrent/CountDownLatch;

    .line 86
    .line 87
    new-instance p1, Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lie2;->z:Ljava/lang/Object;

    .line 93
    .line 94
    return-void
.end method

.method public static final e(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    add-int/lit8 v1, v1, 0xa

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ": glError "

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "SphericalVideoRenderer"

    .line 43
    .line 44
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public static final f([F[F[F)V
    .locals 19

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    aget v2, p2, v0

    .line 5
    .line 6
    mul-float/2addr v1, v2

    .line 7
    const/4 v2, 0x1

    .line 8
    aget v3, p1, v2

    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    aget v5, p2, v4

    .line 12
    .line 13
    mul-float v6, v3, v5

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    aget v8, p1, v7

    .line 17
    .line 18
    const/4 v9, 0x6

    .line 19
    aget v10, p2, v9

    .line 20
    .line 21
    mul-float v11, v8, v10

    .line 22
    .line 23
    add-float/2addr v1, v6

    .line 24
    add-float/2addr v1, v11

    .line 25
    aput v1, p0, v0

    .line 26
    .line 27
    aget v1, p1, v0

    .line 28
    .line 29
    aget v6, p2, v2

    .line 30
    .line 31
    mul-float/2addr v6, v1

    .line 32
    const/4 v11, 0x4

    .line 33
    aget v12, p2, v11

    .line 34
    .line 35
    mul-float/2addr v3, v12

    .line 36
    const/4 v13, 0x7

    .line 37
    aget v14, p2, v13

    .line 38
    .line 39
    mul-float v15, v8, v14

    .line 40
    .line 41
    add-float/2addr v6, v3

    .line 42
    add-float/2addr v6, v15

    .line 43
    aput v6, p0, v2

    .line 44
    .line 45
    aget v3, p2, v7

    .line 46
    .line 47
    mul-float/2addr v1, v3

    .line 48
    aget v3, p1, v2

    .line 49
    .line 50
    const/4 v6, 0x5

    .line 51
    aget v15, p2, v6

    .line 52
    .line 53
    mul-float/2addr v3, v15

    .line 54
    const/16 v16, 0x8

    .line 55
    .line 56
    aget v17, p2, v16

    .line 57
    .line 58
    mul-float v8, v8, v17

    .line 59
    .line 60
    add-float/2addr v1, v3

    .line 61
    add-float/2addr v1, v8

    .line 62
    aput v1, p0, v7

    .line 63
    .line 64
    aget v1, p1, v4

    .line 65
    .line 66
    aget v0, p2, v0

    .line 67
    .line 68
    mul-float/2addr v1, v0

    .line 69
    aget v3, p1, v11

    .line 70
    .line 71
    mul-float/2addr v5, v3

    .line 72
    aget v8, p1, v6

    .line 73
    .line 74
    mul-float v18, v8, v10

    .line 75
    .line 76
    add-float/2addr v1, v5

    .line 77
    add-float v1, v1, v18

    .line 78
    .line 79
    aput v1, p0, v4

    .line 80
    .line 81
    aget v1, p1, v4

    .line 82
    .line 83
    aget v2, p2, v2

    .line 84
    .line 85
    mul-float v5, v1, v2

    .line 86
    .line 87
    mul-float/2addr v3, v12

    .line 88
    mul-float v12, v8, v14

    .line 89
    .line 90
    add-float/2addr v5, v3

    .line 91
    add-float/2addr v5, v12

    .line 92
    aput v5, p0, v11

    .line 93
    .line 94
    aget v3, p2, v7

    .line 95
    .line 96
    mul-float/2addr v1, v3

    .line 97
    aget v5, p1, v11

    .line 98
    .line 99
    mul-float/2addr v5, v15

    .line 100
    mul-float v8, v8, v17

    .line 101
    .line 102
    add-float/2addr v1, v5

    .line 103
    add-float/2addr v1, v8

    .line 104
    aput v1, p0, v6

    .line 105
    .line 106
    aget v1, p1, v9

    .line 107
    .line 108
    mul-float/2addr v1, v0

    .line 109
    aget v0, p1, v13

    .line 110
    .line 111
    aget v4, p2, v4

    .line 112
    .line 113
    mul-float/2addr v4, v0

    .line 114
    aget v5, p1, v16

    .line 115
    .line 116
    mul-float/2addr v10, v5

    .line 117
    add-float/2addr v1, v4

    .line 118
    add-float/2addr v1, v10

    .line 119
    aput v1, p0, v9

    .line 120
    .line 121
    aget v1, p1, v9

    .line 122
    .line 123
    mul-float/2addr v2, v1

    .line 124
    aget v4, p2, v11

    .line 125
    .line 126
    mul-float/2addr v0, v4

    .line 127
    add-float/2addr v0, v2

    .line 128
    mul-float/2addr v14, v5

    .line 129
    add-float/2addr v14, v0

    .line 130
    aput v14, p0, v13

    .line 131
    .line 132
    mul-float/2addr v1, v3

    .line 133
    aget v0, p1, v13

    .line 134
    .line 135
    aget v2, p2, v6

    .line 136
    .line 137
    mul-float/2addr v0, v2

    .line 138
    mul-float v5, v5, v17

    .line 139
    .line 140
    add-float/2addr v1, v0

    .line 141
    add-float/2addr v1, v5

    .line 142
    aput v1, p0, v16

    .line 143
    .line 144
    return-void
.end method

.method public static final g([FF)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    aput v1, p0, v0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    aput v1, p0, v0

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    aput v1, p0, v0

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    aput v1, p0, v0

    .line 15
    .line 16
    float-to-double v2, p1

    .line 17
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    double-to-float p1, v4

    .line 22
    const/4 v0, 0x4

    .line 23
    aput p1, p0, v0

    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    neg-double v4, v4

    .line 30
    double-to-float p1, v4

    .line 31
    const/4 v0, 0x5

    .line 32
    aput p1, p0, v0

    .line 33
    .line 34
    const/4 p1, 0x6

    .line 35
    aput v1, p0, p1

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    double-to-float p1, v0

    .line 42
    const/4 v0, 0x7

    .line 43
    aput p1, p0, v0

    .line 44
    .line 45
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    double-to-float p1, v0

    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    aput p1, p0, v0

    .line 53
    .line 54
    return-void
.end method

.method public static final h([FF)V
    .locals 5

    .line 1
    float-to-double v0, p1

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v2

    .line 6
    double-to-float p1, v2

    .line 7
    const/4 v2, 0x0

    .line 8
    aput p1, p0, v2

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    neg-double v2, v2

    .line 15
    double-to-float p1, v2

    .line 16
    const/4 v2, 0x1

    .line 17
    aput p1, p0, v2

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    const/4 v2, 0x0

    .line 21
    aput v2, p0, p1

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    double-to-float p1, v3

    .line 28
    const/4 v3, 0x3

    .line 29
    aput p1, p0, v3

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    double-to-float p1, v0

    .line 36
    const/4 v0, 0x4

    .line 37
    aput p1, p0, v0

    .line 38
    .line 39
    const/4 p1, 0x5

    .line 40
    aput v2, p0, p1

    .line 41
    .line 42
    const/4 p1, 0x6

    .line 43
    aput v2, p0, p1

    .line 44
    .line 45
    const/4 p1, 0x7

    .line 46
    aput v2, p0, p1

    .line 47
    .line 48
    const/16 p1, 0x8

    .line 49
    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    .line 51
    .line 52
    aput v0, p0, p1

    .line 53
    .line 54
    return-void
.end method

.method public static final i(Ljava/lang/String;I)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "createShader"

    .line 6
    .line 7
    invoke-static {v1}, Lie2;->e(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p0}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "shaderSource"

    .line 16
    .line 17
    invoke-static {p0}, Lie2;->e(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 21
    .line 22
    .line 23
    const-string p0, "compileShader"

    .line 24
    .line 25
    invoke-static {p0}, Lie2;->e(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    new-array p0, p0, [I

    .line 30
    .line 31
    const v1, 0x8b81

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v0, v1, p0, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 36
    .line 37
    .line 38
    const-string v1, "getShaderiv"

    .line 39
    .line 40
    invoke-static {v1}, Lie2;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    aget p0, p0, v2

    .line 44
    .line 45
    if-nez p0, :cond_0

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    add-int/lit8 p0, p0, 0x1a

    .line 58
    .line 59
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 60
    .line 61
    .line 62
    const-string p0, "Could not compile shader "

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p0, ":"

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string p1, "SphericalVideoRenderer"

    .line 80
    .line 81
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 92
    .line 93
    .line 94
    const-string p0, "deleteShader"

    .line 95
    .line 96
    invoke-static {p0}, Lie2;->e(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return v2

    .line 100
    :cond_0
    return v0
.end method


# virtual methods
.method public final a(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lie2;->z:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput p1, p0, Lie2;->r:I

    .line 5
    .line 6
    iput p2, p0, Lie2;->q:I

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lie2;->E:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lie2;->z:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lie2;->F:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lie2;->t:Landroid/graphics/SurfaceTexture;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
.end method

.method public final c(FF)V
    .locals 3

    .line 1
    iget v0, p0, Lie2;->r:I

    .line 2
    .line 3
    iget v1, p0, Lie2;->q:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    :cond_0
    iget v1, p0, Lie2;->o:F

    .line 9
    .line 10
    const v2, 0x3fdf66f3

    .line 11
    .line 12
    .line 13
    mul-float/2addr p1, v2

    .line 14
    int-to-float v0, v0

    .line 15
    div-float/2addr p1, v0

    .line 16
    sub-float/2addr v1, p1

    .line 17
    iput v1, p0, Lie2;->o:F

    .line 18
    .line 19
    iget p1, p0, Lie2;->p:F

    .line 20
    .line 21
    mul-float/2addr p2, v2

    .line 22
    div-float/2addr p2, v0

    .line 23
    sub-float/2addr p1, p2

    .line 24
    iput p1, p0, Lie2;->p:F

    .line 25
    .line 26
    const p2, -0x4036f025

    .line 27
    .line 28
    .line 29
    cmpg-float v0, p1, p2

    .line 30
    .line 31
    if-gez v0, :cond_1

    .line 32
    .line 33
    iput p2, p0, Lie2;->p:F

    .line 34
    .line 35
    move p1, p2

    .line 36
    :cond_1
    const p2, 0x3fc90fdb

    .line 37
    .line 38
    .line 39
    cmpl-float p1, p1, p2

    .line 40
    .line 41
    if-lez p1, :cond_2

    .line 42
    .line 43
    iput p2, p0, Lie2;->p:F

    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lie2;->D:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 7
    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 11
    .line 12
    iget-object v3, p0, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 13
    .line 14
    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    .line 15
    .line 16
    invoke-interface {v0, v3, v2, v2, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 20
    .line 21
    iget-object v2, p0, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 22
    .line 23
    iget-object v3, p0, Lie2;->D:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 24
    .line 25
    invoke-interface {v0, v2, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lie2;->D:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lie2;->C:Ljavax/microedition/khronos/egl/EGLContext;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 35
    .line 36
    iget-object v3, p0, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 37
    .line 38
    invoke-interface {v2, v3, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lie2;->C:Ljavax/microedition/khronos/egl/EGLContext;

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 48
    .line 49
    invoke-interface {v2, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    iget p1, p0, Lie2;->w:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iput p1, p0, Lie2;->w:I

    .line 6
    .line 7
    iget-object p1, p0, Lie2;->z:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 11
    .line 12
    .line 13
    monitor-exit p1

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lie2;->t:Landroid/graphics/SurfaceTexture;

    .line 4
    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljavax/microedition/khronos/egl/EGL10;

    .line 12
    .line 13
    iput-object v0, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 14
    .line 15
    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, v1, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 22
    .line 23
    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_DISPLAY:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 24
    .line 25
    const/16 v3, 0xb

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    const/4 v7, 0x0

    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    :cond_0
    :goto_0
    move v0, v7

    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    new-array v2, v4, [I

    .line 37
    .line 38
    iget-object v8, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 39
    .line 40
    invoke-interface {v8, v0, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    new-array v13, v6, [I

    .line 48
    .line 49
    new-array v11, v6, [Ljavax/microedition/khronos/egl/EGLConfig;

    .line 50
    .line 51
    new-array v10, v3, [I

    .line 52
    .line 53
    fill-array-data v10, :array_0

    .line 54
    .line 55
    .line 56
    iget-object v8, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 57
    .line 58
    iget-object v9, v1, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 59
    .line 60
    const/4 v12, 0x1

    .line 61
    invoke-interface/range {v8 .. v13}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    :cond_3
    move-object v0, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    aget v0, v13, v7

    .line 70
    .line 71
    if-lez v0, :cond_3

    .line 72
    .line 73
    aget-object v0, v11, v7

    .line 74
    .line 75
    :goto_1
    if-nez v0, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    const/16 v2, 0x3098

    .line 79
    .line 80
    const/16 v8, 0x3038

    .line 81
    .line 82
    filled-new-array {v2, v4, v8}, [I

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v8, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 87
    .line 88
    iget-object v9, v1, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 89
    .line 90
    sget-object v10, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    .line 91
    .line 92
    invoke-interface {v8, v9, v0, v10, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iput-object v2, v1, Lie2;->C:Ljavax/microedition/khronos/egl/EGLContext;

    .line 97
    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    if-ne v2, v10, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    iget-object v2, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 104
    .line 105
    iget-object v8, v1, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 106
    .line 107
    iget-object v9, v1, Lie2;->t:Landroid/graphics/SurfaceTexture;

    .line 108
    .line 109
    invoke-interface {v2, v8, v0, v9, v5}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateWindowSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljava/lang/Object;[I)Ljavax/microedition/khronos/egl/EGLSurface;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, v1, Lie2;->D:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 114
    .line 115
    if-eqz v0, :cond_0

    .line 116
    .line 117
    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 118
    .line 119
    if-ne v0, v2, :cond_7

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_7
    iget-object v2, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 123
    .line 124
    iget-object v8, v1, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 125
    .line 126
    iget-object v9, v1, Lie2;->C:Ljavax/microedition/khronos/egl/EGLContext;

    .line 127
    .line 128
    invoke-interface {v2, v8, v0, v0, v9}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    move v0, v6

    .line 136
    :goto_2
    sget-object v2, Lmz1;->s1:Liz1;

    .line 137
    .line 138
    sget-object v8, Ltw1;->e:Ltw1;

    .line 139
    .line 140
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 141
    .line 142
    invoke-virtual {v9, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    check-cast v9, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v2}, Liz1;->c()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-nez v9, :cond_9

    .line 157
    .line 158
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 159
    .line 160
    invoke-virtual {v9, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/String;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    const-string v2, "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"

    .line 168
    .line 169
    :goto_3
    const v9, 0x8b31

    .line 170
    .line 171
    .line 172
    invoke-static {v2, v9}, Lie2;->i(Ljava/lang/String;I)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_a

    .line 177
    .line 178
    :goto_4
    move v10, v7

    .line 179
    goto/16 :goto_6

    .line 180
    .line 181
    :cond_a
    sget-object v9, Lmz1;->t1:Liz1;

    .line 182
    .line 183
    iget-object v10, v8, Ltw1;->c:Lkz1;

    .line 184
    .line 185
    invoke-virtual {v10, v9}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v9}, Liz1;->c()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    if-nez v10, :cond_b

    .line 200
    .line 201
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 202
    .line 203
    invoke-virtual {v8, v9}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    check-cast v8, Ljava/lang/String;

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_b
    const-string v8, "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"

    .line 211
    .line 212
    :goto_5
    const v9, 0x8b30

    .line 213
    .line 214
    .line 215
    invoke-static {v8, v9}, Lie2;->i(Ljava/lang/String;I)I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-nez v8, :cond_c

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_c
    const-string v9, "createProgram"

    .line 223
    .line 224
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    invoke-static {v9}, Lie2;->e(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    if-eqz v10, :cond_e

    .line 232
    .line 233
    invoke-static {v10, v2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 234
    .line 235
    .line 236
    const-string v2, "attachShader"

    .line 237
    .line 238
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v10, v8}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 242
    .line 243
    .line 244
    const-string v2, "attachShader"

    .line 245
    .line 246
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v10}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 250
    .line 251
    .line 252
    const-string v2, "linkProgram"

    .line 253
    .line 254
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    new-array v2, v6, [I

    .line 258
    .line 259
    const v8, 0x8b82

    .line 260
    .line 261
    .line 262
    invoke-static {v10, v8, v2, v7}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 263
    .line 264
    .line 265
    const-string v8, "getProgramiv"

    .line 266
    .line 267
    invoke-static {v8}, Lie2;->e(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    aget v2, v2, v7

    .line 271
    .line 272
    if-eq v2, v6, :cond_d

    .line 273
    .line 274
    const-string v2, "SphericalVideoRenderer"

    .line 275
    .line 276
    const-string v8, "Could not link program: "

    .line 277
    .line 278
    invoke-static {v2, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    invoke-static {v10}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    const-string v8, "SphericalVideoRenderer"

    .line 286
    .line 287
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    invoke-static {v10}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 291
    .line 292
    .line 293
    const-string v2, "deleteProgram"

    .line 294
    .line 295
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_d
    invoke-static {v10}, Landroid/opengl/GLES20;->glValidateProgram(I)V

    .line 300
    .line 301
    .line 302
    const-string v2, "validateProgram"

    .line 303
    .line 304
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :cond_e
    :goto_6
    iput v10, v1, Lie2;->u:I

    .line 308
    .line 309
    invoke-static {v10}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 310
    .line 311
    .line 312
    const-string v2, "useProgram"

    .line 313
    .line 314
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    iget v2, v1, Lie2;->u:I

    .line 318
    .line 319
    const-string v8, "aPosition"

    .line 320
    .line 321
    invoke-static {v2, v8}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    const/16 v13, 0xc

    .line 326
    .line 327
    iget-object v14, v1, Lie2;->x:Ljava/nio/FloatBuffer;

    .line 328
    .line 329
    const/4 v10, 0x3

    .line 330
    const/16 v11, 0x1406

    .line 331
    .line 332
    const/4 v12, 0x0

    .line 333
    invoke-static/range {v9 .. v14}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 334
    .line 335
    .line 336
    const-string v2, "vertexAttribPointer"

    .line 337
    .line 338
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v9}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 342
    .line 343
    .line 344
    const-string v2, "enableVertexAttribArray"

    .line 345
    .line 346
    invoke-static {v2}, Lie2;->e(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-array v2, v6, [I

    .line 350
    .line 351
    invoke-static {v6, v2, v7}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 352
    .line 353
    .line 354
    const-string v8, "genTextures"

    .line 355
    .line 356
    invoke-static {v8}, Lie2;->e(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    aget v2, v2, v7

    .line 360
    .line 361
    const v8, 0x8d65

    .line 362
    .line 363
    .line 364
    invoke-static {v8, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 365
    .line 366
    .line 367
    const-string v9, "bindTextures"

    .line 368
    .line 369
    invoke-static {v9}, Lie2;->e(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    const/16 v9, 0x2800

    .line 373
    .line 374
    const/16 v10, 0x2601

    .line 375
    .line 376
    invoke-static {v8, v9, v10}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 377
    .line 378
    .line 379
    const-string v9, "texParameteri"

    .line 380
    .line 381
    invoke-static {v9}, Lie2;->e(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    const/16 v9, 0x2801

    .line 385
    .line 386
    invoke-static {v8, v9, v10}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 387
    .line 388
    .line 389
    const-string v9, "texParameteri"

    .line 390
    .line 391
    invoke-static {v9}, Lie2;->e(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    const/16 v9, 0x2802

    .line 395
    .line 396
    const v10, 0x812f

    .line 397
    .line 398
    .line 399
    invoke-static {v8, v9, v10}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 400
    .line 401
    .line 402
    const-string v9, "texParameteri"

    .line 403
    .line 404
    invoke-static {v9}, Lie2;->e(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    const/16 v9, 0x2803

    .line 408
    .line 409
    invoke-static {v8, v9, v10}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 410
    .line 411
    .line 412
    const-string v8, "texParameteri"

    .line 413
    .line 414
    invoke-static {v8}, Lie2;->e(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    iget v8, v1, Lie2;->u:I

    .line 418
    .line 419
    const-string v9, "uVMat"

    .line 420
    .line 421
    invoke-static {v8, v9}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 422
    .line 423
    .line 424
    move-result v8

    .line 425
    iput v8, v1, Lie2;->v:I

    .line 426
    .line 427
    const/16 v9, 0x9

    .line 428
    .line 429
    new-array v9, v9, [F

    .line 430
    .line 431
    fill-array-data v9, :array_1

    .line 432
    .line 433
    .line 434
    invoke-static {v8, v6, v7, v9, v7}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 435
    .line 436
    .line 437
    iget v8, v1, Lie2;->u:I

    .line 438
    .line 439
    if-eqz v0, :cond_1a

    .line 440
    .line 441
    if-nez v8, :cond_f

    .line 442
    .line 443
    goto/16 :goto_11

    .line 444
    .line 445
    :cond_f
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 446
    .line 447
    invoke-direct {v0, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 448
    .line 449
    .line 450
    iput-object v0, v1, Lie2;->s:Landroid/graphics/SurfaceTexture;

    .line 451
    .line 452
    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 453
    .line 454
    .line 455
    iget-object v0, v1, Lie2;->y:Ljava/util/concurrent/CountDownLatch;

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 458
    .line 459
    .line 460
    iget-object v2, v1, Lie2;->f:Lhe2;

    .line 461
    .line 462
    iget-object v0, v2, Lhe2;->g:Lwc1;

    .line 463
    .line 464
    if-eqz v0, :cond_10

    .line 465
    .line 466
    goto :goto_7

    .line 467
    :cond_10
    iget-object v0, v2, Lhe2;->a:Landroid/hardware/SensorManager;

    .line 468
    .line 469
    invoke-virtual {v0, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    if-nez v3, :cond_11

    .line 474
    .line 475
    const-string v0, "No Sensor of TYPE_ROTATION_VECTOR"

    .line 476
    .line 477
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    goto :goto_7

    .line 481
    :cond_11
    new-instance v8, Landroid/os/HandlerThread;

    .line 482
    .line 483
    const-string v9, "OrientationMonitor"

    .line 484
    .line 485
    invoke-direct {v8, v9}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 489
    .line 490
    .line 491
    new-instance v9, Lwc1;

    .line 492
    .line 493
    invoke-virtual {v8}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    invoke-direct {v9, v8, v4}, Lwc1;-><init>(Landroid/os/Looper;I)V

    .line 498
    .line 499
    .line 500
    iput-object v9, v2, Lhe2;->g:Lwc1;

    .line 501
    .line 502
    invoke-virtual {v0, v2, v3, v7, v9}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-nez v0, :cond_12

    .line 507
    .line 508
    const-string v0, "SensorManager.registerListener failed."

    .line 509
    .line 510
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2}, Lhe2;->b()V

    .line 514
    .line 515
    .line 516
    :cond_12
    :goto_7
    :try_start_0
    iput-boolean v6, v1, Lie2;->E:Z

    .line 517
    .line 518
    :catch_0
    :goto_8
    iget-boolean v0, v1, Lie2;->F:Z

    .line 519
    .line 520
    if-eqz v0, :cond_13

    .line 521
    .line 522
    goto/16 :goto_f

    .line 523
    .line 524
    :cond_13
    :goto_9
    iget v0, v1, Lie2;->w:I

    .line 525
    .line 526
    if-lez v0, :cond_14

    .line 527
    .line 528
    iget-object v0, v1, Lie2;->s:Landroid/graphics/SurfaceTexture;

    .line 529
    .line 530
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 531
    .line 532
    .line 533
    iget v0, v1, Lie2;->w:I

    .line 534
    .line 535
    add-int/lit8 v0, v0, -0x1

    .line 536
    .line 537
    iput v0, v1, Lie2;->w:I

    .line 538
    .line 539
    goto :goto_9

    .line 540
    :catchall_0
    move-exception v0

    .line 541
    goto/16 :goto_e

    .line 542
    .line 543
    :cond_14
    iget-object v0, v1, Lie2;->g:[F

    .line 544
    .line 545
    invoke-virtual {v2, v0}, Lhe2;->c([F)Z

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    const v8, -0x4036f025

    .line 550
    .line 551
    .line 552
    const/4 v9, 0x5

    .line 553
    const/4 v10, 0x4

    .line 554
    if-eqz v3, :cond_16

    .line 555
    .line 556
    iget v3, v1, Lie2;->n:F

    .line 557
    .line 558
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    if-eqz v3, :cond_15

    .line 563
    .line 564
    const/4 v3, 0x3

    .line 565
    new-array v11, v3, [F

    .line 566
    .line 567
    fill-array-data v11, :array_2

    .line 568
    .line 569
    .line 570
    aget v12, v0, v7

    .line 571
    .line 572
    aget v13, v11, v7

    .line 573
    .line 574
    mul-float/2addr v12, v13

    .line 575
    aget v14, v0, v6

    .line 576
    .line 577
    aget v11, v11, v6

    .line 578
    .line 579
    mul-float/2addr v14, v11

    .line 580
    add-float/2addr v14, v12

    .line 581
    aget v12, v0, v4

    .line 582
    .line 583
    const/4 v15, 0x0

    .line 584
    mul-float/2addr v12, v15

    .line 585
    add-float/2addr v12, v14

    .line 586
    aget v14, v0, v3

    .line 587
    .line 588
    mul-float/2addr v14, v13

    .line 589
    aget v16, v0, v10

    .line 590
    .line 591
    mul-float v16, v16, v11

    .line 592
    .line 593
    add-float v16, v16, v14

    .line 594
    .line 595
    aget v14, v0, v9

    .line 596
    .line 597
    mul-float/2addr v14, v15

    .line 598
    add-float v14, v14, v16

    .line 599
    .line 600
    const/16 v16, 0x6

    .line 601
    .line 602
    aget v16, v0, v16

    .line 603
    .line 604
    mul-float v16, v16, v13

    .line 605
    .line 606
    const/4 v13, 0x7

    .line 607
    aget v13, v0, v13

    .line 608
    .line 609
    mul-float/2addr v13, v11

    .line 610
    add-float v13, v13, v16

    .line 611
    .line 612
    const/16 v11, 0x8

    .line 613
    .line 614
    aget v11, v0, v11

    .line 615
    .line 616
    mul-float/2addr v11, v15

    .line 617
    add-float/2addr v11, v13

    .line 618
    new-array v3, v3, [F

    .line 619
    .line 620
    aput v12, v3, v7

    .line 621
    .line 622
    aput v14, v3, v6

    .line 623
    .line 624
    aput v11, v3, v4

    .line 625
    .line 626
    aget v11, v3, v6

    .line 627
    .line 628
    float-to-double v11, v11

    .line 629
    aget v3, v3, v7

    .line 630
    .line 631
    float-to-double v13, v3

    .line 632
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    .line 633
    .line 634
    .line 635
    move-result-wide v11

    .line 636
    double-to-float v3, v11

    .line 637
    add-float/2addr v3, v8

    .line 638
    neg-float v3, v3

    .line 639
    iput v3, v1, Lie2;->n:F

    .line 640
    .line 641
    :cond_15
    iget-object v3, v1, Lie2;->l:[F

    .line 642
    .line 643
    iget v8, v1, Lie2;->n:F

    .line 644
    .line 645
    iget v11, v1, Lie2;->o:F

    .line 646
    .line 647
    add-float/2addr v8, v11

    .line 648
    invoke-static {v3, v8}, Lie2;->h([FF)V

    .line 649
    .line 650
    .line 651
    goto :goto_a

    .line 652
    :cond_16
    invoke-static {v0, v8}, Lie2;->g([FF)V

    .line 653
    .line 654
    .line 655
    iget-object v3, v1, Lie2;->l:[F

    .line 656
    .line 657
    iget v8, v1, Lie2;->o:F

    .line 658
    .line 659
    invoke-static {v3, v8}, Lie2;->h([FF)V

    .line 660
    .line 661
    .line 662
    :goto_a
    iget-object v3, v1, Lie2;->h:[F

    .line 663
    .line 664
    const v8, 0x3fc90fdb

    .line 665
    .line 666
    .line 667
    invoke-static {v3, v8}, Lie2;->g([FF)V

    .line 668
    .line 669
    .line 670
    iget-object v8, v1, Lie2;->i:[F

    .line 671
    .line 672
    iget-object v11, v1, Lie2;->l:[F

    .line 673
    .line 674
    invoke-static {v8, v11, v3}, Lie2;->f([F[F[F)V

    .line 675
    .line 676
    .line 677
    iget-object v3, v1, Lie2;->j:[F

    .line 678
    .line 679
    invoke-static {v3, v0, v8}, Lie2;->f([F[F[F)V

    .line 680
    .line 681
    .line 682
    iget-object v0, v1, Lie2;->k:[F

    .line 683
    .line 684
    iget v8, v1, Lie2;->p:F

    .line 685
    .line 686
    invoke-static {v0, v8}, Lie2;->g([FF)V

    .line 687
    .line 688
    .line 689
    iget-object v8, v1, Lie2;->m:[F

    .line 690
    .line 691
    invoke-static {v8, v0, v3}, Lie2;->f([F[F[F)V

    .line 692
    .line 693
    .line 694
    iget v0, v1, Lie2;->v:I

    .line 695
    .line 696
    invoke-static {v0, v6, v7, v8, v7}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 697
    .line 698
    .line 699
    invoke-static {v9, v7, v10}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 700
    .line 701
    .line 702
    const-string v0, "drawArrays"

    .line 703
    .line 704
    invoke-static {v0}, Lie2;->e(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 708
    .line 709
    .line 710
    iget-object v0, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 711
    .line 712
    iget-object v3, v1, Lie2;->B:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 713
    .line 714
    iget-object v8, v1, Lie2;->D:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 715
    .line 716
    invoke-interface {v0, v3, v8}, Ljavax/microedition/khronos/egl/EGL10;->eglSwapBuffers(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 717
    .line 718
    .line 719
    iget-boolean v0, v1, Lie2;->E:Z

    .line 720
    .line 721
    if-eqz v0, :cond_18

    .line 722
    .line 723
    iget v0, v1, Lie2;->r:I

    .line 724
    .line 725
    iget v3, v1, Lie2;->q:I

    .line 726
    .line 727
    invoke-static {v7, v7, v0, v3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 728
    .line 729
    .line 730
    const-string v0, "viewport"

    .line 731
    .line 732
    invoke-static {v0}, Lie2;->e(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    iget v0, v1, Lie2;->u:I

    .line 736
    .line 737
    const-string v3, "uFOVx"

    .line 738
    .line 739
    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    iget v3, v1, Lie2;->u:I

    .line 744
    .line 745
    const-string v8, "uFOVy"

    .line 746
    .line 747
    invoke-static {v3, v8}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    iget v8, v1, Lie2;->r:I

    .line 752
    .line 753
    iget v9, v1, Lie2;->q:I

    .line 754
    .line 755
    const v10, 0x3f5f66f3

    .line 756
    .line 757
    .line 758
    if-le v8, v9, :cond_17

    .line 759
    .line 760
    invoke-static {v0, v10}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 761
    .line 762
    .line 763
    iget v0, v1, Lie2;->q:I

    .line 764
    .line 765
    int-to-float v0, v0

    .line 766
    mul-float/2addr v0, v10

    .line 767
    iget v8, v1, Lie2;->r:I

    .line 768
    .line 769
    int-to-float v8, v8

    .line 770
    div-float/2addr v0, v8

    .line 771
    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 772
    .line 773
    .line 774
    goto :goto_b

    .line 775
    :cond_17
    int-to-float v8, v8

    .line 776
    mul-float/2addr v8, v10

    .line 777
    int-to-float v9, v9

    .line 778
    div-float/2addr v8, v9

    .line 779
    invoke-static {v0, v8}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 780
    .line 781
    .line 782
    invoke-static {v3, v10}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 783
    .line 784
    .line 785
    :goto_b
    iput-boolean v7, v1, Lie2;->E:Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 786
    .line 787
    :cond_18
    :try_start_1
    iget-object v3, v1, Lie2;->z:Ljava/lang/Object;

    .line 788
    .line 789
    monitor-enter v3
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 790
    :try_start_2
    iget-boolean v0, v1, Lie2;->F:Z

    .line 791
    .line 792
    if-nez v0, :cond_19

    .line 793
    .line 794
    iget-boolean v0, v1, Lie2;->E:Z

    .line 795
    .line 796
    if-nez v0, :cond_19

    .line 797
    .line 798
    iget v0, v1, Lie2;->w:I

    .line 799
    .line 800
    if-nez v0, :cond_19

    .line 801
    .line 802
    invoke-virtual {v3}, Ljava/lang/Object;->wait()V

    .line 803
    .line 804
    .line 805
    goto :goto_c

    .line 806
    :catchall_1
    move-exception v0

    .line 807
    goto :goto_d

    .line 808
    :cond_19
    :goto_c
    monitor-exit v3

    .line 809
    goto/16 :goto_8

    .line 810
    .line 811
    :goto_d
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 812
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 813
    :goto_e
    :try_start_4
    const-string v2, "SphericalVideoProcessor died."

    .line 814
    .line 815
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 816
    .line 817
    .line 818
    sget-object v2, Lhg4;->C:Lhg4;

    .line 819
    .line 820
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 821
    .line 822
    const-string v3, "SphericalVideoProcessor.run.2"

    .line 823
    .line 824
    invoke-virtual {v2, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 825
    .line 826
    .line 827
    goto :goto_f

    .line 828
    :catchall_2
    move-exception v0

    .line 829
    goto :goto_10

    .line 830
    :catch_1
    const-string v0, "SphericalVideoProcessor halted unexpectedly."

    .line 831
    .line 832
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 833
    .line 834
    .line 835
    :goto_f
    iget-object v0, v1, Lie2;->f:Lhe2;

    .line 836
    .line 837
    invoke-virtual {v0}, Lhe2;->b()V

    .line 838
    .line 839
    .line 840
    iget-object v0, v1, Lie2;->s:Landroid/graphics/SurfaceTexture;

    .line 841
    .line 842
    invoke-virtual {v0, v5}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 843
    .line 844
    .line 845
    iput-object v5, v1, Lie2;->s:Landroid/graphics/SurfaceTexture;

    .line 846
    .line 847
    invoke-virtual {v1}, Lie2;->d()V

    .line 848
    .line 849
    .line 850
    return-void

    .line 851
    :goto_10
    iget-object v2, v1, Lie2;->f:Lhe2;

    .line 852
    .line 853
    invoke-virtual {v2}, Lhe2;->b()V

    .line 854
    .line 855
    .line 856
    iget-object v2, v1, Lie2;->s:Landroid/graphics/SurfaceTexture;

    .line 857
    .line 858
    invoke-virtual {v2, v5}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 859
    .line 860
    .line 861
    iput-object v5, v1, Lie2;->s:Landroid/graphics/SurfaceTexture;

    .line 862
    .line 863
    invoke-virtual {v1}, Lie2;->d()V

    .line 864
    .line 865
    .line 866
    throw v0

    .line 867
    :cond_1a
    :goto_11
    iget-object v0, v1, Lie2;->A:Ljavax/microedition/khronos/egl/EGL10;

    .line 868
    .line 869
    invoke-interface {v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    invoke-static {v0}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    const-string v2, "EGL initialization failed: "

    .line 882
    .line 883
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    sget-object v2, Lhg4;->C:Lhg4;

    .line 891
    .line 892
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 893
    .line 894
    new-instance v3, Ljava/lang/Throwable;

    .line 895
    .line 896
    invoke-direct {v3, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    const-string v0, "SphericalVideoProcessor.run.1"

    .line 900
    .line 901
    invoke-virtual {v2, v0, v3}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v1}, Lie2;->d()V

    .line 905
    .line 906
    .line 907
    iget-object v0, v1, Lie2;->y:Ljava/util/concurrent/CountDownLatch;

    .line 908
    .line 909
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 910
    .line 911
    .line 912
    return-void

    .line 913
    :cond_1b
    const-string v0, "SphericalVideoProcessor started with no output texture."

    .line 914
    .line 915
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    iget-object v0, v1, Lie2;->y:Ljava/util/concurrent/CountDownLatch;

    .line 919
    .line 920
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 921
    .line 922
    .line 923
    return-void

    .line 924
    nop

    .line 925
    :array_0
    .array-data 4
        0x3040
        0x4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3025
        0x10
        0x3038
    .end array-data

    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
