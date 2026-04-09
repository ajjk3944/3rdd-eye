.class public final synthetic Lmo;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lmo;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lmo;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget v0, p0, Lmo;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmo;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfc0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Float;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/high16 v1, 0x437f0000    # 255.0f

    .line 24
    .line 25
    mul-float/2addr v1, p1

    .line 26
    float-to-int v1, v1

    .line 27
    iget-object v2, v0, Lfc0;->j:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 30
    .line 31
    .line 32
    iput p1, v0, Lfc0;->x:F

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    iget-object p1, p0, Lmo;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Li90;

    .line 38
    .line 39
    iget-object v0, p1, Li90;->Q:Lx8;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v0, Lx8;->f:Lx8;

    .line 45
    .line 46
    :goto_0
    sget-object v1, Lx8;->g:Lx8;

    .line 47
    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, Li90;->invalidateSelf()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object v0, p1, Li90;->t:Lfh;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object p1, p1, Li90;->g:Ls90;

    .line 59
    .line 60
    invoke-virtual {p1}, Ls90;->a()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lfh;->r(F)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_1
    return-void

    .line 68
    :pswitch_1
    iget-object v0, p0, Lmo;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ltq;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/lang/Float;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iget-object v0, v0, Lvs;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_2
    iget-object p1, p0, Lmo;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Loo;

    .line 94
    .line 95
    iget-object v0, p1, Loo;->v:Lcq;

    .line 96
    .line 97
    iget-object v1, p1, Loo;->A:Landroid/animation/TimeInterpolator;

    .line 98
    .line 99
    iget-object p1, p1, Loo;->z:Landroid/animation/ValueAnimator;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-interface {v1, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    iput p1, v0, Lcq;->e:F

    .line 110
    .line 111
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
