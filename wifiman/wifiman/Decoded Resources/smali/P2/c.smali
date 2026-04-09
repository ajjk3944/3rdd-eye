.class public final LP2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/e;


# instance fields
.field private final a:LF2/d;

.field private final b:LP2/e;

.field private final c:LP2/e;


# direct methods
.method public constructor <init>(LF2/d;LP2/e;LP2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP2/c;->a:LF2/d;

    iput-object p2, p0, LP2/c;->b:LP2/e;

    iput-object p3, p0, LP2/c;->c:LP2/e;

    return-void
.end method

.method private static b(LE2/c;)LE2/c;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public a(LE2/c;LC2/g;)LE2/c;
    .locals 2

    invoke-interface {p1}, LE2/c;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, LP2/c;->b:LP2/e;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, LP2/c;->a:LF2/d;

    invoke-static {v0, v1}, Lcom/bumptech/glide/load/resource/bitmap/g;->f(Landroid/graphics/Bitmap;LF2/d;)Lcom/bumptech/glide/load/resource/bitmap/g;

    move-result-object v0

    invoke-interface {p1, v0, p2}, LP2/e;->a(LE2/c;LC2/g;)LE2/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, LO2/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, LP2/c;->c:LP2/e;

    invoke-static {p1}, LP2/c;->b(LE2/c;)LE2/c;

    move-result-object p1

    invoke-interface {v0, p1, p2}, LP2/e;->a(LE2/c;LC2/g;)LE2/c;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
