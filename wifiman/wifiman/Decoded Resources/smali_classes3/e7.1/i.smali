.class public final Le7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/i$a;
    }
.end annotation


# static fields
.field public static final k:Le7/i$a;

.field private static final l:Ljava/lang/String;

.field private static final m:[F


# instance fields
.field private a:Ljava/nio/FloatBuffer;

.field private b:Ljava/nio/FloatBuffer;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private final j:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le7/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le7/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le7/i;->k:Le7/i$a;

    const-class v0, Le7/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le7/i;->l:Ljava/lang/String;

    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Le7/i;->m:[F

    return-void

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Le7/i;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Le7/i;->i:Z

    new-instance v0, Le7/h;

    invoke-direct {v0}, Le7/h;-><init>()V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Le7/i;->j:LYg/m;

    return-void
.end method

.method public static synthetic a()[F
    .locals 1

    invoke-static {}, Le7/i;->b()[F

    move-result-object v0

    return-object v0
.end method

.method private static final b()[F
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x3f19999a    # 0.6f
    .end array-data
.end method

.method private final d()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Le7/i;->b:Ljava/nio/FloatBuffer;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    const v1, 0x84c0

    invoke-static {v1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const v1, 0x8d65

    iget v3, v0, Le7/i;->h:I

    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v1, v0, Le7/i;->c:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget v1, v0, Le7/i;->f:I

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    iget v1, v0, Le7/i;->g:I

    const/4 v3, 0x1

    invoke-direct/range {p0 .. p0}, Le7/i;->f()[F

    move-result-object v4

    invoke-static {v1, v3, v4, v2}, Landroid/opengl/GLES20;->glUniform4fv(II[FI)V

    iget v5, v0, Le7/i;->d:I

    const/4 v9, 0x0

    iget-object v10, v0, Le7/i;->a:Ljava/nio/FloatBuffer;

    const/4 v6, 0x2

    const/16 v7, 0x1406

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v11, v0, Le7/i;->e:I

    const/4 v15, 0x0

    iget-object v1, v0, Le7/i;->b:Ljava/nio/FloatBuffer;

    const/4 v12, 0x2

    const/16 v13, 0x1406

    const/4 v14, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v11 .. v16}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v1, v0, Le7/i;->d:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v1, v0, Le7/i;->e:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const/4 v1, 0x5

    const/4 v3, 0x4

    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget v1, v0, Le7/i;->d:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v1, v0, Le7/i;->e:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    sget-object v1, Le7/i;->l:Ljava/lang/String;

    const-string/jumbo v2, "TAG"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "BackgroundRendererDraw"

    invoke-static {v1, v2}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final f()[F
    .locals 1

    iget-object v0, p0, Le7/i;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method


# virtual methods
.method public final c(Landroid/content/Context;)V
    .locals 4

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    aget v0, v1, v2

    iput v0, p0, Le7/i;->h:I

    const v1, 0x8d65

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v0, 0x2802

    const v3, 0x812f

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2803

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2801

    const/16 v3, 0x2601

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2800

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    sget-object v0, Le7/i;->m:[F

    array-length v1, v0

    div-int/lit8 v1, v1, 0x2

    const/4 v3, 0x4

    if-ne v3, v1, :cond_0

    array-length v1, v0

    mul-int/2addr v1, v3

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    iput-object v1, p0, Le7/i;->a:Ljava/nio/FloatBuffer;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Le7/i;->a:Ljava/nio/FloatBuffer;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v0, 0x20

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Le7/i;->b:Ljava/nio/FloatBuffer;

    sget-object v0, Lg7/d;->a:Lg7/d;

    sget v1, Lh7/k;->b:I

    invoke-virtual {v0, p1, v1}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x8b31

    invoke-virtual {v0, v2, v1}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v1

    sget v2, Lh7/k;->a:I

    invoke-virtual {v0, p1, v2}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    const v2, 0x8b30

    invoke-virtual {v0, v2, p1}, Lg7/d;->a(ILjava/lang/String;)I

    move-result p1

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Le7/i;->c:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Le7/i;->c:I

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget p1, p0, Le7/i;->c:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    iget p1, p0, Le7/i;->c:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget p1, p0, Le7/i;->c:I

    const-string/jumbo v0, "a_Position"

    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Le7/i;->d:I

    iget p1, p0, Le7/i;->c:I

    const-string/jumbo v0, "a_TexCoord"

    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Le7/i;->e:I

    sget-object p1, Le7/i;->l:Ljava/lang/String;

    const-string/jumbo v0, "TAG"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "Program creation"

    invoke-static {p1, v1}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, p0, Le7/i;->c:I

    const-string/jumbo v2, "sTexture"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    iput v1, p0, Le7/i;->f:I

    iget v1, p0, Le7/i;->c:I

    const-string/jumbo v2, "u_OverlayColor"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    iput v1, p0, Le7/i;->g:I

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "Program parameters"

    invoke-static {p1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo v0, "Unexpected number of vertices in BackgroundRenderer."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lcom/google/ar/core/Frame;)V
    .locals 4

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ar/core/Frame;->hasDisplayGeometryChanged()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/ar/core/Coordinates2d;->OPENGL_NORMALIZED_DEVICE_COORDINATES:Lcom/google/ar/core/Coordinates2d;

    iget-object v1, p0, Le7/i;->a:Ljava/nio/FloatBuffer;

    sget-object v2, Lcom/google/ar/core/Coordinates2d;->TEXTURE_NORMALIZED:Lcom/google/ar/core/Coordinates2d;

    iget-object v3, p0, Le7/i;->b:Ljava/nio/FloatBuffer;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/google/ar/core/Frame;->transformCoordinates2d(Lcom/google/ar/core/Coordinates2d;Ljava/nio/FloatBuffer;Lcom/google/ar/core/Coordinates2d;Ljava/nio/FloatBuffer;)V

    :cond_0
    invoke-virtual {p1}, Lcom/google/ar/core/Frame;->getTimestamp()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    iget-boolean p1, p0, Le7/i;->i:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Le7/i;->d()V

    return-void
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Le7/i;->h:I

    return v0
.end method
