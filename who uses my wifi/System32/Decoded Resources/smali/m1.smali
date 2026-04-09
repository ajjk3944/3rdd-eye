.class public final Lm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm1;->f:I

    iput-object p2, p0, Lm1;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo82;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lm1;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lm1;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lm1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lou2;

    .line 9
    .line 10
    iget-object p1, p1, Lou2;->j:Lsu1;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lsu1;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljh1;

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    iput v0, p1, Ljh1;->B:I

    .line 22
    .line 23
    iget-object p1, p1, Ljh1;->g:Landroid/app/Activity;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lo82;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-virtual {p1, v0}, Lo82;->K(Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 41
    .line 42
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->R:Lb21;

    .line 43
    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p1, Lb21;->g:Lsd0;

    .line 49
    .line 50
    :goto_0
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lsd0;->collapseActionView()Z

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_3
    iget-object v0, p0, Lm1;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Landroidx/preference/Preference;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroidx/preference/Preference;->s(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lcc0;

    .line 67
    .line 68
    iget v0, p1, Lcc0;->d0:I

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    const/4 v2, 0x2

    .line 72
    if-ne v0, v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lcc0;->O(I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 78
    .line 79
    const v1, 0x7f1200c5

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Liw;->l()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    if-ne v0, v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1, v2}, Lcc0;->O(I)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p1, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 100
    .line 101
    const v1, 0x7f1200c6

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Liw;->l()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    :goto_1
    return-void

    .line 116
    :pswitch_5
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Lvb;

    .line 119
    .line 120
    iget-boolean v0, p1, Lvb;->p:Z

    .line 121
    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    iget-boolean v0, p1, Lvb;->r:Z

    .line 131
    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const v1, 0x101035b

    .line 139
    .line 140
    .line 141
    filled-new-array {v1}, [I

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const/4 v1, 0x0

    .line 150
    const/4 v2, 0x1

    .line 151
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    iput-boolean v1, p1, Lvb;->q:Z

    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 158
    .line 159
    .line 160
    iput-boolean v2, p1, Lvb;->r:Z

    .line 161
    .line 162
    :cond_4
    iget-boolean v0, p1, Lvb;->q:Z

    .line 163
    .line 164
    if-eqz v0, :cond_5

    .line 165
    .line 166
    invoke-virtual {p1}, Lvb;->cancel()V

    .line 167
    .line 168
    .line 169
    :cond_5
    return-void

    .line 170
    :pswitch_6
    iget-object v0, p0, Lm1;->g:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Ls3;

    .line 173
    .line 174
    iget-object v1, v0, Ls3;->i:Landroid/widget/Button;

    .line 175
    .line 176
    if-ne p1, v1, :cond_6

    .line 177
    .line 178
    iget-object v1, v0, Ls3;->k:Landroid/os/Message;

    .line 179
    .line 180
    if-eqz v1, :cond_6

    .line 181
    .line 182
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    goto :goto_2

    .line 187
    :cond_6
    iget-object v1, v0, Ls3;->l:Landroid/widget/Button;

    .line 188
    .line 189
    if-ne p1, v1, :cond_7

    .line 190
    .line 191
    iget-object v1, v0, Ls3;->n:Landroid/os/Message;

    .line 192
    .line 193
    if-eqz v1, :cond_7

    .line 194
    .line 195
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    goto :goto_2

    .line 200
    :cond_7
    iget-object v1, v0, Ls3;->o:Landroid/widget/Button;

    .line 201
    .line 202
    if-ne p1, v1, :cond_8

    .line 203
    .line 204
    iget-object p1, v0, Ls3;->q:Landroid/os/Message;

    .line 205
    .line 206
    if-eqz p1, :cond_8

    .line 207
    .line 208
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    goto :goto_2

    .line 213
    :cond_8
    const/4 p1, 0x0

    .line 214
    :goto_2
    if-eqz p1, :cond_9

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 217
    .line 218
    .line 219
    :cond_9
    iget-object p1, v0, Ls3;->F:Lq3;

    .line 220
    .line 221
    const/4 v1, 0x1

    .line 222
    iget-object v0, v0, Ls3;->b:Lu3;

    .line 223
    .line 224
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_7
    iget-object p1, p0, Lm1;->g:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast p1, Lc2;

    .line 235
    .line 236
    invoke-virtual {p1}, Lc2;->a()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
