.class public final LK2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/bitmap/p;

.field private final b:I

.field private final c:I

.field private final d:LC2/b;

.field private final e:Lcom/bumptech/glide/load/resource/bitmap/k;

.field private final f:Z

.field private final g:LC2/h;


# direct methods
.method public constructor <init>(IILC2/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/p;->b()Lcom/bumptech/glide/load/resource/bitmap/p;

    move-result-object v0

    iput-object v0, p0, LK2/h;->a:Lcom/bumptech/glide/load/resource/bitmap/p;

    iput p1, p0, LK2/h;->b:I

    iput p2, p0, LK2/h;->c:I

    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/l;->f:LC2/f;

    invoke-virtual {p3, p1}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC2/b;

    iput-object p1, p0, LK2/h;->d:LC2/b;

    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/k;->h:LC2/f;

    invoke-virtual {p3, p1}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/load/resource/bitmap/k;

    iput-object p1, p0, LK2/h;->e:Lcom/bumptech/glide/load/resource/bitmap/k;

    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/l;->j:LC2/f;

    invoke-virtual {p3, p1}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LK2/h;->f:Z

    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/l;->g:LC2/f;

    invoke-virtual {p3, p1}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC2/h;

    iput-object p1, p0, LK2/h;->g:LC2/h;

    return-void
.end method


# virtual methods
.method public onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 6

    iget-object p3, p0, LK2/h;->a:Lcom/bumptech/glide/load/resource/bitmap/p;

    iget v0, p0, LK2/h;->b:I

    iget v1, p0, LK2/h;->c:I

    iget-boolean v2, p0, LK2/h;->f:Z

    const/4 v3, 0x0

    invoke-virtual {p3, v0, v1, v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/p;->f(IIZZ)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x3

    invoke-static {p1, p3}, LK2/a;->a(Landroid/graphics/ImageDecoder;I)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    invoke-static {p1, p3}, LK2/a;->a(Landroid/graphics/ImageDecoder;I)V

    :goto_0
    iget-object p3, p0, LK2/h;->d:LC2/b;

    sget-object v0, LC2/b;->PREFER_RGB_565:LC2/b;

    if-ne p3, v0, :cond_1

    invoke-static {p1, v3}, LK2/b;->a(Landroid/graphics/ImageDecoder;I)V

    :cond_1
    new-instance p3, LK2/h$a;

    invoke-direct {p3, p0}, LK2/h$a;-><init>(LK2/h;)V

    invoke-static {p1, p3}, LK2/c;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    invoke-static {p2}, LK2/d;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    move-result-object p3

    iget v0, p0, LK2/h;->b:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_2

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v0

    :cond_2
    iget v2, p0, LK2/h;->c:I

    if-ne v2, v1, :cond_3

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v2

    :cond_3
    iget-object v1, p0, LK2/h;->e:Lcom/bumptech/glide/load/resource/bitmap/k;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {v1, v3, v4, v0, v2}, Lcom/bumptech/glide/load/resource/bitmap/k;->b(IIII)F

    move-result v0

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    const/4 v3, 0x2

    const-string v4, "ImageDecoder"

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Resizing from ["

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "x"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] to ["

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] scaleFactor: "

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v4, p3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-static {p1, v1, v2}, LK2/e;->a(Landroid/graphics/ImageDecoder;II)V

    iget-object p3, p0, LK2/h;->g:LC2/h;

    if-eqz p3, :cond_7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_6

    sget-object v0, LC2/h;->DISPLAY_P3:LC2/h;

    if-ne p3, v0, :cond_5

    invoke-static {p2}, LK2/f;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-static {p2}, LK2/f;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/ColorSpace;->isWideGamut()Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    goto :goto_1

    :cond_5
    sget-object p2, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    :goto_1
    invoke-static {p2}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-static {p1, p2}, LK2/g;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    goto :goto_2

    :cond_6
    sget-object p2, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {p2}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-static {p1, p2}, LK2/g;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    :cond_7
    :goto_2
    return-void
.end method
