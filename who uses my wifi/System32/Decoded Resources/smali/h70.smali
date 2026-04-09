.class public final Lh70;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh70;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lh70;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget v0, p0, Lh70;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh70;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lou2;

    .line 9
    .line 10
    sget-object v1, Lmz1;->Pa:Liz1;

    .line 11
    .line 12
    sget-object v2, Ltw1;->e:Ltw1;

    .line 13
    .line 14
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v1, v0, Lou2;->r:Ltu2;

    .line 37
    .line 38
    iput-object p2, v1, Ltu2;->a:Landroid/view/MotionEvent;

    .line 39
    .line 40
    :cond_0
    iget-object p2, v0, Lou2;->j:Lsu1;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p2, Lsu1;->b:Z

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :pswitch_0
    check-cast p1, Landroid/widget/Checkable;

    .line 53
    .line 54
    invoke-interface {p1}, Landroid/widget/Checkable;->isChecked()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Lh70;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Landroid/view/GestureDetector;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 p1, 0x0

    .line 70
    :goto_0
    return p1

    .line 71
    :pswitch_1
    iget-object p1, p0, Lh70;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Li70;

    .line 74
    .line 75
    iget-object v0, p1, Li70;->w:Lf70;

    .line 76
    .line 77
    iget-object v1, p1, Li70;->A:Landroid/os/Handler;

    .line 78
    .line 79
    iget-object p1, p1, Li70;->E:Lr6;

    .line 80
    .line 81
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    float-to-int v3, v3

    .line 90
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    float-to-int p2, p2

    .line 95
    if-nez v2, :cond_3

    .line 96
    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    if-ltz v3, :cond_3

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-ge v3, v4, :cond_3

    .line 112
    .line 113
    if-ltz p2, :cond_3

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-ge p2, p1, :cond_3

    .line 120
    .line 121
    const-wide/16 p1, 0xfa

    .line 122
    .line 123
    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    const/4 p1, 0x1

    .line 128
    if-ne v2, p1, :cond_4

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 134
    return p1

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
