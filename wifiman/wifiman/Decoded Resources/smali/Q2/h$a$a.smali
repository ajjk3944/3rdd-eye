.class LQ2/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/h$a;->onDraw()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewTreeObserver$OnDrawListener;

.field final synthetic b:LQ2/h$a;


# direct methods
.method constructor <init>(LQ2/h$a;Landroid/view/ViewTreeObserver$OnDrawListener;)V
    .locals 0

    iput-object p1, p0, LQ2/h$a$a;->b:LQ2/h$a;

    iput-object p2, p0, LQ2/h$a$a;->a:Landroid/view/ViewTreeObserver$OnDrawListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/p;->b()Lcom/bumptech/glide/load/resource/bitmap/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/p;->h()V

    iget-object v0, p0, LQ2/h$a$a;->b:LQ2/h$a;

    iget-object v0, v0, LQ2/h$a;->b:LQ2/h;

    const/4 v1, 0x1

    iput-boolean v1, v0, LQ2/h;->b:Z

    iget-object v0, p0, LQ2/h$a$a;->b:LQ2/h$a;

    iget-object v0, v0, LQ2/h$a;->a:Landroid/view/View;

    iget-object v1, p0, LQ2/h$a$a;->a:Landroid/view/ViewTreeObserver$OnDrawListener;

    invoke-static {v0, v1}, LQ2/h;->b(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V

    iget-object v0, p0, LQ2/h$a$a;->b:LQ2/h$a;

    iget-object v0, v0, LQ2/h$a;->b:LQ2/h;

    iget-object v0, v0, LQ2/h;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method
