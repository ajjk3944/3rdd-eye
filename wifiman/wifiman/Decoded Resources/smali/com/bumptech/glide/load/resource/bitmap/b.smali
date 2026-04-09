.class public Lcom/bumptech/glide/load/resource/bitmap/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/j;


# instance fields
.field private final a:LF2/d;

.field private final b:LC2/j;


# direct methods
.method public constructor <init>(LF2/d;LC2/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/b;->a:LF2/d;

    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/b;->b:LC2/j;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/File;LC2/g;)Z
    .locals 0

    check-cast p1, LE2/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/bumptech/glide/load/resource/bitmap/b;->c(LE2/c;Ljava/io/File;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public b(LC2/g;)LC2/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/b;->b:LC2/j;

    invoke-interface {v0, p1}, LC2/j;->b(LC2/g;)LC2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(LE2/c;Ljava/io/File;LC2/g;)Z
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/b;->b:LC2/j;

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/g;

    invoke-interface {p1}, LE2/c;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/b;->a:LF2/d;

    invoke-direct {v1, p1, v2}, Lcom/bumptech/glide/load/resource/bitmap/g;-><init>(Landroid/graphics/Bitmap;LF2/d;)V

    invoke-interface {v0, v1, p2, p3}, LC2/d;->a(Ljava/lang/Object;Ljava/io/File;LC2/g;)Z

    move-result p1

    return p1
.end method
