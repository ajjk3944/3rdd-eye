.class Lcom/bumptech/glide/load/resource/bitmap/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/resource/bitmap/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/resource/bitmap/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/bitmap/u;

.field private final b:LW2/d;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/resource/bitmap/u;LW2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/w$a;->a:Lcom/bumptech/glide/load/resource/bitmap/u;

    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/w$a;->b:LW2/d;

    return-void
.end method


# virtual methods
.method public a(LF2/d;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/w$a;->b:LW2/d;

    invoke-virtual {v0}, LW2/d;->a()Ljava/io/IOException;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, LF2/d;->c(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/w$a;->a:Lcom/bumptech/glide/load/resource/bitmap/u;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/u;->g()V

    return-void
.end method
