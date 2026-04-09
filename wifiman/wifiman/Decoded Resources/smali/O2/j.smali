.class public LO2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:LC2/i;

.field private final c:LF2/b;


# direct methods
.method public constructor <init>(Ljava/util/List;LC2/i;LF2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO2/j;->a:Ljava/util/List;

    iput-object p2, p0, LO2/j;->b:LC2/i;

    iput-object p3, p0, LO2/j;->c:LF2/b;

    return-void
.end method

.method private static e(Ljava/io/InputStream;)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :try_start_0
    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :goto_1
    const/4 v0, 0x5

    const-string v1, "StreamGifDecoder"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Error reading data from stream"

    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, LO2/j;->d(Ljava/io/InputStream;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, LO2/j;->c(Ljava/io/InputStream;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILC2/g;)LE2/c;
    .locals 1

    invoke-static {p1}, LO2/j;->e(Ljava/io/InputStream;)[B

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, LO2/j;->b:LC2/i;

    invoke-interface {v0, p1, p2, p3, p4}, LC2/i;->b(Ljava/lang/Object;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/io/InputStream;LC2/g;)Z
    .locals 1

    sget-object v0, LO2/i;->b:LC2/f;

    invoke-virtual {p2, v0}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, LO2/j;->a:Ljava/util/List;

    iget-object v0, p0, LO2/j;->c:LF2/b;

    invoke-static {p2, p1, v0}, Lcom/bumptech/glide/load/a;->f(Ljava/util/List;Ljava/io/InputStream;LF2/b;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
