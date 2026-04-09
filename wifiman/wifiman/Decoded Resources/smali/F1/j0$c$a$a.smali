.class LF1/j0$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF1/j0$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LF1/j0;

.field final synthetic b:LF1/w0;

.field final synthetic c:LF1/w0;

.field final synthetic d:I

.field final synthetic e:Landroid/view/View;

.field final synthetic f:LF1/j0$c$a;


# direct methods
.method constructor <init>(LF1/j0$c$a;LF1/j0;LF1/w0;LF1/w0;ILandroid/view/View;)V
    .locals 0

    iput-object p1, p0, LF1/j0$c$a$a;->f:LF1/j0$c$a;

    iput-object p2, p0, LF1/j0$c$a$a;->a:LF1/j0;

    iput-object p3, p0, LF1/j0$c$a$a;->b:LF1/w0;

    iput-object p4, p0, LF1/j0$c$a$a;->c:LF1/w0;

    iput p5, p0, LF1/j0$c$a$a;->d:I

    iput-object p6, p0, LF1/j0$c$a$a;->e:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, LF1/j0$c$a$a;->a:LF1/j0;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, LF1/j0;->e(F)V

    iget-object p1, p0, LF1/j0$c$a$a;->b:LF1/w0;

    iget-object v0, p0, LF1/j0$c$a$a;->c:LF1/w0;

    iget-object v1, p0, LF1/j0$c$a$a;->a:LF1/j0;

    invoke-virtual {v1}, LF1/j0;->b()F

    move-result v1

    iget v2, p0, LF1/j0$c$a$a;->d:I

    invoke-static {p1, v0, v1, v2}, LF1/j0$c;->o(LF1/w0;LF1/w0;FI)LF1/w0;

    move-result-object p1

    iget-object v0, p0, LF1/j0$c$a$a;->a:LF1/j0;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LF1/j0$c$a$a;->e:Landroid/view/View;

    invoke-static {v1, p1, v0}, LF1/j0$c;->k(Landroid/view/View;LF1/w0;Ljava/util/List;)V

    return-void
.end method
