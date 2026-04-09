.class public final Lkb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkb/l;

.field private b:[B

.field private c:I

.field private d:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkb/l;

    invoke-direct {v0}, Lkb/l;-><init>()V

    iput-object v0, p0, Lkb/k;->a:Lkb/l;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lkb/k;->d:[B

    return-void
.end method

.method private final b([B)[B
    .locals 5

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/util/zip/Inflater;->setInput([BII)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    array-length p1, p1

    new-array p1, p1, [B

    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/zip/Inflater;->inflate([B)I

    move-result v3

    invoke-virtual {v1, p1, v2, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v3, LSj/a;->a:LSj/a$b;

    const-string v4, "Decompression failed"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, p1, v4, v2}, LSj/a$b;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    const-string/jumbo v0, "toByteArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)V
    .locals 5

    const-string/jumbo v0, "buf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkb/k;->a:Lkb/l;

    invoke-virtual {v0}, Lkb/l;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkb/k;->a:Lkb/l;

    invoke-virtual {v0, p1}, Lkb/l;->a(Ljava/nio/ByteBuffer;)V

    :cond_0
    iget-object v0, p0, Lkb/k;->a:Lkb/l;

    invoke-virtual {v0}, Lkb/l;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lkb/k;->b:[B

    if-nez v0, :cond_1

    iget-object v0, p0, Lkb/k;->a:Lkb/l;

    invoke-virtual {v0}, Lkb/l;->b()I

    move-result v0

    iput v0, p0, Lkb/k;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lkb/k;->b:[B

    :cond_1
    iget-object v0, p0, Lkb/k;->b:[B

    const/4 v1, 0x0

    const-string/jumbo v2, "_content"

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    array-length v0, v0

    iget v3, p0, Lkb/k;->c:I

    sub-int/2addr v0, v3

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, p0, Lkb/k;->b:[B

    if-nez v4, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3
    invoke-virtual {p1, v4, v0, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget p1, p0, Lkb/k;->c:I

    sub-int/2addr p1, v3

    iput p1, p0, Lkb/k;->c:I

    invoke-virtual {p0}, Lkb/k;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lkb/k;->a:Lkb/l;

    invoke-virtual {p1}, Lkb/l;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lkb/k;->b:[B

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object p1, v1

    :cond_4
    invoke-direct {p0, p1}, Lkb/k;->b([B)[B

    move-result-object p1

    iput-object p1, p0, Lkb/k;->b:[B

    :cond_5
    iget-object p1, p0, Lkb/k;->b:[B

    if-eqz p1, :cond_7

    if-nez p1, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v1, p1

    :goto_0
    iput-object v1, p0, Lkb/k;->d:[B

    :cond_7
    return-void
.end method

.method public final c()[B
    .locals 1

    iget-object v0, p0, Lkb/k;->d:[B

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lkb/k;->a:Lkb/l;

    invoke-virtual {v0}, Lkb/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lkb/k;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
