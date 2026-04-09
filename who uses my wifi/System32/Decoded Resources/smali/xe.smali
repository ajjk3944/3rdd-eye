.class public final Lxe;
.super Lob1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxe;->q:I

    .line 2
    .line 3
    iput-object p2, p0, Lxe;->r:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final M(I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final p(I)V
    .locals 1

    .line 1
    iget p1, p0, Lxe;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lxe;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lal0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p1, Lal0;->c:Z

    .line 12
    .line 13
    iget-object p1, p1, Lal0;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lx01;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p1, Lbf;

    .line 26
    .line 27
    invoke-virtual {p1}, Lbf;->H()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lnc0;->invalidateSelf()V

    .line 31
    .line 32
    .line 33
    :cond_0
    :pswitch_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Landroid/graphics/Typeface;Z)V
    .locals 1

    .line 1
    iget p1, p0, Lxe;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lxe;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lal0;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    iput-boolean p2, p1, Lal0;->c:Z

    .line 15
    .line 16
    iget-object p1, p1, Lal0;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lx01;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    check-cast p1, Lbf;

    .line 29
    .line 30
    invoke-virtual {p1}, Lbf;->H()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lnc0;->invalidateSelf()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void

    .line 37
    :pswitch_0
    iget-object p1, p0, Lxe;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lcom/google/android/material/chip/Chip;

    .line 40
    .line 41
    iget-object p2, p1, Lcom/google/android/material/chip/Chip;->j:Lbf;

    .line 42
    .line 43
    iget-boolean v0, p2, Lbf;->R0:Z

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object p2, p2, Lbf;->T:Ljava/lang/CharSequence;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
