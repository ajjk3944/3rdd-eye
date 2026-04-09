.class public final Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final synthetic F:I


# instance fields
.field public C:Lp21;

.field public D:Le3;

.field public E:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li5;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Li5;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f0c001c

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const v0, 0x7f090053

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v5, v1

    .line 25
    check-cast v5, Landroid/widget/FrameLayout;

    .line 26
    .line 27
    if-eqz v5, :cond_5

    .line 28
    .line 29
    const v0, 0x7f090054

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v6, v1

    .line 37
    check-cast v6, Landroid/widget/FrameLayout;

    .line 38
    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    const v0, 0x7f090263

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v7, v1

    .line 49
    check-cast v7, Landroidx/appcompat/widget/Toolbar;

    .line 50
    .line 51
    if-eqz v7, :cond_5

    .line 52
    .line 53
    const v0, 0x7f090293

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v8, v1

    .line 61
    check-cast v8, Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v8, :cond_5

    .line 64
    .line 65
    new-instance v3, Lp21;

    .line 66
    .line 67
    move-object v4, p1

    .line 68
    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 69
    .line 70
    invoke-direct/range {v3 .. v8}, Lp21;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object v3, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 74
    .line 75
    const-string p1, "getRoot(...)"

    .line 76
    .line 77
    invoke-static {v4, p1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v4}, Li5;->setContentView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 84
    .line 85
    const-string v0, "binding"

    .line 86
    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    iget-object p1, p1, Lp21;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Li5;->w(Landroidx/appcompat/widget/Toolbar;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Li5;->n()Lm54;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_0

    .line 101
    .line 102
    const/4 v1, 0x1

    .line 103
    invoke-virtual {p1, v1}, Lm54;->y(Z)V

    .line 104
    .line 105
    .line 106
    :cond_0
    new-instance p1, Le3;

    .line 107
    .line 108
    invoke-direct {p1, p0}, Le3;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 112
    .line 113
    iget-object v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 114
    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    iget-object v1, v1, Lp21;->g:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Landroid/widget/FrameLayout;

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 125
    .line 126
    if-eqz p1, :cond_2

    .line 127
    .line 128
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, Landroid/widget/FrameLayout;

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance v1, Lo00;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    invoke-direct {v1, p0, v3}, Lo00;-><init>(Li5;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Landroid/os/Handler;

    .line 146
    .line 147
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 152
    .line 153
    .line 154
    new-instance v1, Lp00;

    .line 155
    .line 156
    invoke-direct {v1, p0, v3}, Lp00;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;I)V

    .line 157
    .line 158
    .line 159
    const-wide/16 v3, 0x1388

    .line 160
    .line 161
    invoke-virtual {p1, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 165
    .line 166
    if-eqz p1, :cond_1

    .line 167
    .line 168
    iget-object p1, p1, Lp21;->i:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p1, Landroid/widget/TextView;

    .line 171
    .line 172
    const v0, 0x7f120020

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const v1, 0x7f12014d

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_1
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v2

    .line 198
    :cond_2
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v2

    .line 202
    :cond_3
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v2

    .line 206
    :cond_4
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v2

    .line 210
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    new-instance v0, Ljava/lang/NullPointerException;

    .line 219
    .line 220
    const-string v1, "Missing required view with ID: "

    .line 221
    .line 222
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr9;->a()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Li5;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "adView"

    .line 13
    .line 14
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lch;->i()Laj0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Laj0;->c()V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public final onPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr9;->c()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Li5;->onPause()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "adView"

    .line 13
    .line 14
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Li5;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lr9;->d()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "adView"

    .line 13
    .line 14
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method
