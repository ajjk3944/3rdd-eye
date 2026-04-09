.class public LO2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/k;


# instance fields
.field private final b:LC2/k;


# direct methods
.method public constructor <init>(LC2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC2/k;

    iput-object p1, p0, LO2/f;->b:LC2/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, LO2/f;->b:LC2/k;

    invoke-interface {v0, p1}, LC2/e;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public b(Landroid/content/Context;LE2/c;II)LE2/c;
    .locals 4

    invoke-interface {p2}, LE2/c;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO2/c;

    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/b;->f()LF2/d;

    move-result-object v1

    invoke-virtual {v0}, LO2/c;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Lcom/bumptech/glide/load/resource/bitmap/g;

    invoke-direct {v3, v2, v1}, Lcom/bumptech/glide/load/resource/bitmap/g;-><init>(Landroid/graphics/Bitmap;LF2/d;)V

    iget-object v1, p0, LO2/f;->b:LC2/k;

    invoke-interface {v1, p1, v3, p3, p4}, LC2/k;->b(Landroid/content/Context;LE2/c;II)LE2/c;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-interface {v3}, LE2/c;->c()V

    :cond_0
    invoke-interface {p1}, LE2/c;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, p0, LO2/f;->b:LC2/k;

    invoke-virtual {v0, p3, p1}, LO2/c;->m(LC2/k;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LO2/f;

    if-eqz v0, :cond_0

    check-cast p1, LO2/f;

    iget-object v0, p0, LO2/f;->b:LC2/k;

    iget-object p1, p1, LO2/f;->b:LC2/k;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LO2/f;->b:LC2/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
