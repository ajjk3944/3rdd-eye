.class LF1/j0$c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF1/j0$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:LF1/j0;

.field final synthetic c:LF1/j0$a;

.field final synthetic d:Landroid/animation/ValueAnimator;

.field final synthetic e:LF1/j0$c$a;


# direct methods
.method constructor <init>(LF1/j0$c$a;Landroid/view/View;LF1/j0;LF1/j0$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, LF1/j0$c$a$c;->e:LF1/j0$c$a;

    iput-object p2, p0, LF1/j0$c$a$c;->a:Landroid/view/View;

    iput-object p3, p0, LF1/j0$c$a$c;->b:LF1/j0;

    iput-object p4, p0, LF1/j0$c$a$c;->c:LF1/j0$a;

    iput-object p5, p0, LF1/j0$c$a$c;->d:Landroid/animation/ValueAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LF1/j0$c$a$c;->a:Landroid/view/View;

    iget-object v1, p0, LF1/j0$c$a$c;->b:LF1/j0;

    iget-object v2, p0, LF1/j0$c$a$c;->c:LF1/j0$a;

    invoke-static {v0, v1, v2}, LF1/j0$c;->l(Landroid/view/View;LF1/j0;LF1/j0$a;)V

    iget-object v0, p0, LF1/j0$c$a$c;->d:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
