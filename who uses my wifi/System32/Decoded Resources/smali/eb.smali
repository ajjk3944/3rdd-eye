.class public final Leb;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/material/bottomappbar/BottomAppBar;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar;I)V
    .locals 0

    .line 1
    iput p2, p0, Leb;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Leb;->b:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, Leb;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Leb;->b:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    sget p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->z0:I

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, v2, Lcom/google/android/material/bottomappbar/BottomAppBar;->r0:Z

    .line 17
    .line 18
    iput-object v1, v2, Lcom/google/android/material/bottomappbar/BottomAppBar;->f0:Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    sget p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->z0:I

    .line 22
    .line 23
    iput-object v1, v2, Lcom/google/android/material/bottomappbar/BottomAppBar;->e0:Landroid/animation/AnimatorSet;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Leb;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Leb;->b:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->x0:Leb;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Leb;->onAnimationStart(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->B()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->w(Lcom/google/android/material/bottomappbar/BottomAppBar;)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationX(F)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :pswitch_0
    sget p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->z0:I

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    sget p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->z0:I

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    iget-boolean p1, v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->r0:Z

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    iget p1, v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->g0:I

    .line 44
    .line 45
    iget-boolean v0, v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->s0:Z

    .line 46
    .line 47
    invoke-virtual {v1, p1, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->F(IZ)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
