.class public final synthetic LF1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LF1/h0;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(LF1/h0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF1/d0;->a:LF1/h0;

    iput-object p2, p0, LF1/d0;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, LF1/d0;->a:LF1/h0;

    iget-object v1, p0, LF1/d0;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, LF1/e0;->a(LF1/h0;Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method
