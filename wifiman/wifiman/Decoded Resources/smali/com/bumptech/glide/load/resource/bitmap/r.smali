.class public final Lcom/bumptech/glide/load/resource/bitmap/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/bitmap/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/f;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/r;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/r;->d(Ljava/io/InputStream;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/resource/bitmap/r;->c(Ljava/io/InputStream;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILC2/g;)LE2/c;
    .locals 1

    invoke-static {p1}, LW2/a;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/load/resource/bitmap/i;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/r;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/resource/bitmap/f;->c(Landroid/graphics/ImageDecoder$Source;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/io/InputStream;LC2/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
