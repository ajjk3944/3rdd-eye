.class LF1/e0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF1/e0;->i(Landroid/view/View;LF1/f0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LF1/f0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:LF1/e0;


# direct methods
.method constructor <init>(LF1/e0;LF1/f0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LF1/e0$a;->c:LF1/e0;

    iput-object p2, p0, LF1/e0$a;->a:LF1/f0;

    iput-object p3, p0, LF1/e0$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LF1/e0$a;->a:LF1/f0;

    iget-object v0, p0, LF1/e0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, LF1/f0;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LF1/e0$a;->a:LF1/f0;

    iget-object v0, p0, LF1/e0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, LF1/f0;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LF1/e0$a;->a:LF1/f0;

    iget-object v0, p0, LF1/e0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, LF1/f0;->c(Landroid/view/View;)V

    return-void
.end method
