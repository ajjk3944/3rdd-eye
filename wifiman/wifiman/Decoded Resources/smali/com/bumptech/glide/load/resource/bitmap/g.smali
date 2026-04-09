.class public Lcom/bumptech/glide/load/resource/bitmap/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE2/c;
.implements LE2/b;


# instance fields
.field private final a:Landroid/graphics/Bitmap;

.field private final b:LF2/d;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;LF2/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Bitmap must not be null"

    invoke-static {p1, v0}, LW2/k;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->a:Landroid/graphics/Bitmap;

    const-string p1, "BitmapPool must not be null"

    invoke-static {p2, p1}, LW2/k;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF2/d;

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->b:LF2/d;

    return-void
.end method

.method public static f(Landroid/graphics/Bitmap;LF2/d;)Lcom/bumptech/glide/load/resource/bitmap/g;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/g;

    invoke-direct {v0, p0, p1}, Lcom/bumptech/glide/load/resource/bitmap/g;-><init>(Landroid/graphics/Bitmap;LF2/d;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->a:Landroid/graphics/Bitmap;

    invoke-static {v0}, LW2/l;->h(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->b:LF2/d;

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, LF2/d;->c(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 1

    const-class v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/g;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/bitmap/g;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
