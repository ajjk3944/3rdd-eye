.class public Lcom/bumptech/glide/load/resource/bitmap/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# instance fields
.field private final a:LM2/l;

.field private final b:LF2/d;


# direct methods
.method public constructor <init>(LM2/l;LF2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->a:LM2/l;

    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->b:LF2/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/v;->d(Landroid/net/Uri;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/resource/bitmap/v;->c(Landroid/net/Uri;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;IILC2/g;)LE2/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->a:LM2/l;

    invoke-virtual {v0, p1, p2, p3, p4}, LM2/l;->c(Landroid/net/Uri;IILC2/g;)LE2/c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, LE2/c;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-object p4, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->b:LF2/d;

    invoke-static {p4, p1, p2, p3}, Lcom/bumptech/glide/load/resource/bitmap/m;->a(LF2/d;Landroid/graphics/drawable/Drawable;II)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/net/Uri;LC2/g;)Z
    .locals 0

    const-string p2, "android.resource"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
