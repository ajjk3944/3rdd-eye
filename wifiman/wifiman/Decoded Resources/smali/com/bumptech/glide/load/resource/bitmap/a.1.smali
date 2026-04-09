.class public Lcom/bumptech/glide/load/resource/bitmap/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# instance fields
.field private final a:LC2/i;

.field private final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;LC2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/a;->b:Landroid/content/res/Resources;

    invoke-static {p2}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC2/i;

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/a;->a:LC2/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;LC2/g;)Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/a;->a:LC2/i;

    invoke-interface {v0, p1, p2}, LC2/i;->a(Ljava/lang/Object;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/a;->a:LC2/i;

    invoke-interface {v0, p1, p2, p3, p4}, LC2/i;->b(Ljava/lang/Object;IILC2/g;)LE2/c;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/a;->b:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Lcom/bumptech/glide/load/resource/bitmap/s;->f(Landroid/content/res/Resources;LE2/c;)LE2/c;

    move-result-object p1

    return-object p1
.end method
