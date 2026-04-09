.class public final Lk7;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final g:I

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk7;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7;->i:Ljava/lang/Object;

    iput-object p2, p0, Lk7;->h:Ljava/lang/Object;

    iput p3, p0, Lk7;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILandroid/os/Parcelable;I)V
    .locals 0

    .line 1
    iput p4, p0, Lk7;->f:I

    iput-object p1, p0, Lk7;->i:Ljava/lang/Object;

    iput p2, p0, Lk7;->g:I

    iput-object p3, p0, Lk7;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lk7;->f:I

    iput-object p1, p0, Lk7;->h:Ljava/lang/Object;

    iput p2, p0, Lk7;->g:I

    iput-object p3, p0, Lk7;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p4, p0, Lk7;->f:I

    iput-object p1, p0, Lk7;->h:Ljava/lang/Object;

    iput-object p2, p0, Lk7;->i:Ljava/lang/Object;

    iput p3, p0, Lk7;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lk7;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk7;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ltp3;

    .line 9
    .line 10
    iget-object v1, p0, Lk7;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ln70;

    .line 13
    .line 14
    iget v2, p0, Lk7;->g:I

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Ltp3;->s(ILn70;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lk7;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lk7;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lks2;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lht2;

    .line 43
    .line 44
    iget-boolean v3, v2, Lht2;->d:Z

    .line 45
    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    const/4 v3, -0x1

    .line 49
    iget v4, p0, Lk7;->g:I

    .line 50
    .line 51
    if-eq v4, v3, :cond_1

    .line 52
    .line 53
    iget-object v3, v2, Lht2;->b:Lnb;

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Lnb;->e(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    const/4 v3, 0x1

    .line 59
    iput-boolean v3, v2, Lht2;->c:Z

    .line 60
    .line 61
    iget-object v2, v2, Lht2;->a:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-interface {v1, v2}, Lks2;->c(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void

    .line 68
    :pswitch_1
    iget-object v0, p0, Lk7;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 71
    .line 72
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->j:Landroid/app/NotificationManager;

    .line 73
    .line 74
    iget-object v1, p0, Lk7;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Landroid/app/Notification;

    .line 77
    .line 78
    iget v2, p0, Lk7;->g:I

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_2
    iget-object v0, p0, Lk7;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lqz0;

    .line 87
    .line 88
    iget-object v1, p0, Lk7;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroid/content/Intent;

    .line 91
    .line 92
    iget v2, p0, Lk7;->g:I

    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Lqz0;->b(Landroid/content/Intent;I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_3
    iget-object v0, p0, Lk7;->i:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lnl;

    .line 101
    .line 102
    iget-object v0, v0, Lnl;->g:Lil;

    .line 103
    .line 104
    iget-object v1, p0, Lk7;->h:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Landroid/os/Bundle;

    .line 107
    .line 108
    iget v2, p0, Lk7;->g:I

    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, Lil;->e(ILandroid/os/Bundle;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_4
    iget-object v0, p0, Lk7;->i:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 117
    .line 118
    iget-object v1, p0, Lk7;->h:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Landroid/view/View;

    .line 121
    .line 122
    iget v2, p0, Lk7;->g:I

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Landroid/view/View;IZ)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_5
    iget-object v0, p0, Lk7;->h:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Landroid/widget/TextView;

    .line 132
    .line 133
    iget-object v1, p0, Lk7;->i:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Landroid/graphics/Typeface;

    .line 136
    .line 137
    iget v2, p0, Lk7;->g:I

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
