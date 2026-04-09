.class Lcom/bumptech/glide/load/engine/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/load/engine/v;->j(LI2/n$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LI2/n$a;

.field final synthetic b:Lcom/bumptech/glide/load/engine/v;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/engine/v;LI2/n$a;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/v$a;->b:Lcom/bumptech/glide/load/engine/v;

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/v$a;->a:LI2/n$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/v$a;->b:Lcom/bumptech/glide/load/engine/v;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/v$a;->a:LI2/n$a;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/engine/v;->g(LI2/n$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/v$a;->b:Lcom/bumptech/glide/load/engine/v;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/v$a;->a:LI2/n$a;

    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/engine/v;->i(LI2/n$a;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/v$a;->b:Lcom/bumptech/glide/load/engine/v;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/v$a;->a:LI2/n$a;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/engine/v;->g(LI2/n$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/v$a;->b:Lcom/bumptech/glide/load/engine/v;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/v$a;->a:LI2/n$a;

    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/engine/v;->h(LI2/n$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
