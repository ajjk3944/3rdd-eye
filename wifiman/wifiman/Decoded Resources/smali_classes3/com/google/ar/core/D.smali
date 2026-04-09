.class final Lcom/google/ar/core/D;
.super Lcom/google/ar/core/dependencies/a;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:I

.field final synthetic c:Lcom/google/ar/core/ArImage;


# direct methods
.method public constructor <init>(Lcom/google/ar/core/ArImage;JI)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/D;->c:Lcom/google/ar/core/ArImage;

    invoke-direct {p0}, Lcom/google/ar/core/dependencies/a;-><init>()V

    iput-wide p2, p0, Lcom/google/ar/core/D;->a:J

    iput p4, p0, Lcom/google/ar/core/D;->b:I

    return-void
.end method


# virtual methods
.method public final getBuffer()Ljava/nio/ByteBuffer;
    .locals 6

    iget-object v0, p0, Lcom/google/ar/core/D;->c:Lcom/google/ar/core/ArImage;

    invoke-virtual {v0}, Lcom/google/ar/core/ArImage;->j()Lcom/google/ar/core/Session;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/ar/core/Session;->nativeWrapperHandle:J

    iget-wide v3, p0, Lcom/google/ar/core/D;->a:J

    iget v5, p0, Lcom/google/ar/core/D;->b:I

    invoke-virtual/range {v0 .. v5}, Lcom/google/ar/core/ArImage;->h(JJI)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final getPixelStride()I
    .locals 6

    iget-object v0, p0, Lcom/google/ar/core/D;->c:Lcom/google/ar/core/ArImage;

    invoke-virtual {v0}, Lcom/google/ar/core/ArImage;->j()Lcom/google/ar/core/Session;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/ar/core/Session;->nativeWrapperHandle:J

    iget-wide v3, p0, Lcom/google/ar/core/D;->a:J

    iget v5, p0, Lcom/google/ar/core/D;->b:I

    invoke-virtual/range {v0 .. v5}, Lcom/google/ar/core/ArImage;->g(JJI)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string/jumbo v1, "Unknown error in ArImage.Plane.getPixelStride()."

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getRowStride()I
    .locals 6

    iget-object v0, p0, Lcom/google/ar/core/D;->c:Lcom/google/ar/core/ArImage;

    invoke-virtual {v0}, Lcom/google/ar/core/ArImage;->j()Lcom/google/ar/core/Session;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/ar/core/Session;->nativeWrapperHandle:J

    iget-wide v3, p0, Lcom/google/ar/core/D;->a:J

    iget v5, p0, Lcom/google/ar/core/D;->b:I

    invoke-virtual/range {v0 .. v5}, Lcom/google/ar/core/ArImage;->a(JJI)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string/jumbo v1, "Unknown error in ArImage.Plane.getRowStride()."

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
