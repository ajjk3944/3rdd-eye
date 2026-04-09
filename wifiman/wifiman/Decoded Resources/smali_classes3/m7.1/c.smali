.class public final synthetic Lm7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lm7/d;


# direct methods
.method public synthetic constructor <init>(Lm7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/c;->a:Lm7/d;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lm7/c;->a:Lm7/d;

    invoke-static {v0, p1}, Lm7/d;->a(Lm7/d;Landroid/animation/ValueAnimator;)V

    return-void
.end method
