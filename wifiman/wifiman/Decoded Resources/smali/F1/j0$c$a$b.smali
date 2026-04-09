.class LF1/j0$c$a$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


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

.field final synthetic b:Landroid/view/View;

.field final synthetic c:LF1/j0$c$a;


# direct methods
.method constructor <init>(LF1/j0$c$a;LF1/j0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LF1/j0$c$a$b;->c:LF1/j0$c$a;

    iput-object p2, p0, LF1/j0$c$a$b;->a:LF1/j0;

    iput-object p3, p0, LF1/j0$c$a$b;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LF1/j0$c$a$b;->a:LF1/j0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, LF1/j0;->e(F)V

    iget-object p1, p0, LF1/j0$c$a$b;->b:Landroid/view/View;

    iget-object v0, p0, LF1/j0$c$a$b;->a:LF1/j0;

    invoke-static {p1, v0}, LF1/j0$c;->i(Landroid/view/View;LF1/j0;)V

    return-void
.end method
