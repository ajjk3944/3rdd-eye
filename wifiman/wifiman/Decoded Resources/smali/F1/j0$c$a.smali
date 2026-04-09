.class LF1/j0$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/j0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field final a:LF1/j0$b;

.field private b:LF1/w0;


# direct methods
.method constructor <init>(Landroid/view/View;LF1/j0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LF1/j0$c$a;->a:LF1/j0$b;

    invoke-static {p1}, LF1/W;->F(Landroid/view/View;)LF1/w0;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, LF1/w0$a;

    invoke-direct {p2, p1}, LF1/w0$a;-><init>(LF1/w0;)V

    invoke-virtual {p2}, LF1/w0$a;->a()LF1/w0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LF1/j0$c$a;->b:LF1/w0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v9, v8}, LF1/w0;->x(Landroid/view/WindowInsets;Landroid/view/View;)LF1/w0;

    move-result-object v0

    iput-object v0, v7, LF1/j0$c$a;->b:LF1/w0;

    invoke-static/range {p1 .. p2}, LF1/j0$c;->m(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v9, v8}, LF1/w0;->x(Landroid/view/WindowInsets;Landroid/view/View;)LF1/w0;

    move-result-object v10

    iget-object v0, v7, LF1/j0$c$a;->b:LF1/w0;

    if-nez v0, :cond_1

    invoke-static/range {p1 .. p1}, LF1/W;->F(Landroid/view/View;)LF1/w0;

    move-result-object v0

    iput-object v0, v7, LF1/j0$c$a;->b:LF1/w0;

    :cond_1
    iget-object v0, v7, LF1/j0$c$a;->b:LF1/w0;

    if-nez v0, :cond_2

    iput-object v10, v7, LF1/j0$c$a;->b:LF1/w0;

    invoke-static/range {p1 .. p2}, LF1/j0$c;->m(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static/range {p1 .. p1}, LF1/j0$c;->n(Landroid/view/View;)LF1/j0$b;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, LF1/j0$b;->a:Landroid/view/WindowInsets;

    invoke-static {v0, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static/range {p1 .. p2}, LF1/j0$c;->m(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v0, v7, LF1/j0$c$a;->b:LF1/w0;

    invoke-static {v10, v0}, LF1/j0$c;->e(LF1/w0;LF1/w0;)I

    move-result v5

    if-nez v5, :cond_4

    invoke-static/range {p1 .. p2}, LF1/j0$c;->m(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v4, v7, LF1/j0$c$a;->b:LF1/w0;

    invoke-static {v5, v10, v4}, LF1/j0$c;->g(ILF1/w0;LF1/w0;)Landroid/view/animation/Interpolator;

    move-result-object v0

    new-instance v11, LF1/j0;

    const-wide/16 v1, 0xa0

    invoke-direct {v11, v5, v0, v1, v2}, LF1/j0;-><init>(ILandroid/view/animation/Interpolator;J)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, LF1/j0;->e(F)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v11}, LF1/j0;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v12

    invoke-static {v10, v4, v5}, LF1/j0$c;->f(LF1/w0;LF1/w0;I)LF1/j0$a;

    move-result-object v13

    const/4 v0, 0x0

    invoke-static {v8, v11, v9, v0}, LF1/j0$c;->j(Landroid/view/View;LF1/j0;Landroid/view/WindowInsets;Z)V

    new-instance v14, LF1/j0$c$a$a;

    move-object v0, v14

    move-object v1, p0

    move-object v2, v11

    move-object v3, v10

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, LF1/j0$c$a$a;-><init>(LF1/j0$c$a;LF1/j0;LF1/w0;LF1/w0;ILandroid/view/View;)V

    invoke-virtual {v12, v14}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, LF1/j0$c$a$b;

    invoke-direct {v0, p0, v11, v8}, LF1/j0$c$a$b;-><init>(LF1/j0$c$a;LF1/j0;Landroid/view/View;)V

    invoke-virtual {v12, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v6, LF1/j0$c$a$c;

    move-object v0, v6

    move-object/from16 v2, p1

    move-object v3, v11

    move-object v4, v13

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, LF1/j0$c$a$c;-><init>(LF1/j0$c$a;Landroid/view/View;LF1/j0;LF1/j0$a;Landroid/animation/ValueAnimator;)V

    invoke-static {v8, v6}, LF1/I;->a(Landroid/view/View;Ljava/lang/Runnable;)LF1/I;

    iput-object v10, v7, LF1/j0$c$a;->b:LF1/w0;

    invoke-static/range {p1 .. p2}, LF1/j0$c;->m(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
