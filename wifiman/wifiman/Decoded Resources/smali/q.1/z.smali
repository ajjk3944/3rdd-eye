.class public abstract Lq/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    sput v0, Lq/z;->a:F

    return-void
.end method

.method public static final a()F
    .locals 1

    sget v0, Lq/z;->a:F

    return v0
.end method

.method public static final b(LT/l;I)Lr/z;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)"

    const v2, 0x35e8bf9b

    invoke-static {v2, p1, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p1

    invoke-interface {p0, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/d;

    invoke-interface {p1}, LY0/d;->getDensity()F

    move-result v0

    invoke-interface {p0, v0}, LT/l;->g(F)Z

    move-result v0

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v0, Lq/y;

    invoke-direct {v0, p1}, Lq/y;-><init>(LY0/d;)V

    invoke-static {v0}, Lr/B;->b(Lr/J;)Lr/z;

    move-result-object v1

    invoke-interface {p0, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lr/z;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object v1
.end method
