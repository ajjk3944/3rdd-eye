.class public final Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final synthetic K:I


# instance fields
.field public final C:Ljava/util/ArrayList;

.field public D:Lql0;

.field public E:Lh2;

.field public F:Lc10;

.field public G:Ljava/util/ArrayList;

.field public H:Ljava/lang/String;

.field public I:Le3;

.field public J:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Li5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->C:Ljava/util/ArrayList;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->H:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final doShare(Landroid/view/View;)V
    .locals 13

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const-string v1, "dataList"

    .line 10
    .line 11
    if-eqz p1, :cond_6

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    move v5, v4

    .line 35
    move v6, v5

    .line 36
    :goto_0
    if-ge v6, v3, :cond_4

    .line 37
    .line 38
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    add-int/lit8 v6, v6, 0x1

    .line 43
    .line 44
    add-int/lit8 v8, v5, 0x1

    .line 45
    .line 46
    if-ltz v5, :cond_3

    .line 47
    .line 48
    check-cast v7, Lol0;

    .line 49
    .line 50
    iget-object v9, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    add-int/lit8 v9, v9, -0x1

    .line 59
    .line 60
    const-string v10, "\n"

    .line 61
    .line 62
    if-ne v5, v9, :cond_1

    .line 63
    .line 64
    iget-object v5, v7, Lol0;->b:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v7, v7, Lol0;->c:Ljava/lang/String;

    .line 67
    .line 68
    new-instance v9, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v11, ">> "

    .line 71
    .line 72
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    iget-object v5, v7, Lol0;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget v9, v7, Lol0;->d:I

    .line 98
    .line 99
    iget-object v7, v7, Lol0;->c:Ljava/lang/String;

    .line 100
    .line 101
    new-instance v11, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v12, ". "

    .line 110
    .line 111
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v5, " ["

    .line 118
    .line 119
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v5, "]\n"

    .line 126
    .line 127
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    :goto_1
    move v5, v8

    .line 144
    goto :goto_0

    .line 145
    :cond_2
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    .line 150
    .line 151
    const-string v0, "Index overflow has happened."

    .line 152
    .line 153
    invoke-direct {p1, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_4
    const v0, 0x7f12001e

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->H:Ljava/lang/String;

    .line 165
    .line 166
    new-instance v2, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v0, ": "

    .line 175
    .line 176
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 187
    .line 188
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 189
    .line 190
    .line 191
    const-string v2, "android.intent.action.SEND"

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    .line 195
    .line 196
    const-string v2, "android.intent.extra.SUBJECT"

    .line 197
    .line 198
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    .line 200
    .line 201
    const-string v0, "android.intent.extra.TEXT"

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 208
    .line 209
    .line 210
    const-string p1, "text/plain"

    .line 211
    .line 212
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :catch_0
    move-exception p1

    .line 220
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {v0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_5
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v0

    .line 240
    :cond_6
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

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
    const v0, 0x7f0c001f

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

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
    move-result-object v3

    .line 24
    check-cast v3, Landroid/widget/FrameLayout;

    .line 25
    .line 26
    if-eqz v3, :cond_9

    .line 27
    .line 28
    const v0, 0x7f090054

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Landroid/widget/FrameLayout;

    .line 36
    .line 37
    if-eqz v4, :cond_9

    .line 38
    .line 39
    const v0, 0x7f09009d

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Landroid/widget/Button;

    .line 47
    .line 48
    if-eqz v5, :cond_9

    .line 49
    .line 50
    const v0, 0x7f09009e

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroid/widget/Button;

    .line 58
    .line 59
    if-eqz v6, :cond_9

    .line 60
    .line 61
    const v0, 0x7f090118

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Landroidx/constraintlayout/widget/Group;

    .line 69
    .line 70
    if-eqz v7, :cond_9

    .line 71
    .line 72
    const v0, 0x7f090144

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, Landroid/widget/ImageView;

    .line 80
    .line 81
    if-eqz v8, :cond_9

    .line 82
    .line 83
    const v0, 0x7f090145

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    check-cast v8, Landroid/widget/ImageView;

    .line 91
    .line 92
    if-eqz v8, :cond_9

    .line 93
    .line 94
    const v0, 0x7f0901df

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 102
    .line 103
    if-eqz v8, :cond_9

    .line 104
    .line 105
    const v0, 0x7f0901f8

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 113
    .line 114
    if-eqz v9, :cond_9

    .line 115
    .line 116
    const v0, 0x7f090264

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    if-eqz v10, :cond_9

    .line 124
    .line 125
    invoke-static {v10}, Lp21;->h(Landroid/view/View;)Lp21;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const v10, 0x7f09028e

    .line 130
    .line 131
    .line 132
    invoke-static {p1, v10}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    check-cast v11, Landroid/widget/TextView;

    .line 137
    .line 138
    if-eqz v11, :cond_8

    .line 139
    .line 140
    new-instance v10, Lh2;

    .line 141
    .line 142
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 143
    .line 144
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object p1, v10, Lh2;->a:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v3, v10, Lh2;->b:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v4, v10, Lh2;->c:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v5, v10, Lh2;->d:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v6, v10, Lh2;->e:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v7, v10, Lh2;->f:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v8, v10, Lh2;->g:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v9, v10, Lh2;->h:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v0, v10, Lh2;->i:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v10, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->E:Lh2;

    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object p1, p1, Lh2;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 174
    .line 175
    const-string v0, "getRoot(...)"

    .line 176
    .line 177
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, p1}, Li5;->setContentView(Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    new-instance p1, Le3;

    .line 184
    .line 185
    invoke-direct {p1, p0}, Le3;-><init>(Landroid/content/Context;)V

    .line 186
    .line 187
    .line 188
    iput-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object p1, p1, Lh2;->c:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p1, Landroid/widget/FrameLayout;

    .line 197
    .line 198
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 199
    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iget-object p1, p1, Lh2;->c:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p1, Landroid/widget/FrameLayout;

    .line 212
    .line 213
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    new-instance v0, Lo00;

    .line 218
    .line 219
    const/4 v3, 0x2

    .line 220
    invoke-direct {v0, p0, v3}, Lo00;-><init>(Li5;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 224
    .line 225
    .line 226
    new-instance p1, Landroid/os/Handler;

    .line 227
    .line 228
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 233
    .line 234
    .line 235
    new-instance v0, Lll0;

    .line 236
    .line 237
    const/4 v3, 0x3

    .line 238
    invoke-direct {v0, p0, v3}, Lll0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 239
    .line 240
    .line 241
    const-wide/16 v3, 0x1388

    .line 242
    .line 243
    invoke-virtual {p1, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0}, Li5;->getResources()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const v0, 0x7f030001

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    const-string v0, "obtainTypedArray(...)"

    .line 258
    .line 259
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->C:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-lez v3, :cond_0

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 271
    .line 272
    .line 273
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->length()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    move v4, v2

    .line 278
    :goto_0
    const/4 v5, 0x1

    .line 279
    if-ge v4, v3, :cond_3

    .line 280
    .line 281
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    if-eqz v6, :cond_1

    .line 286
    .line 287
    const-string v7, "*"

    .line 288
    .line 289
    filled-new-array {v7}, [Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    invoke-static {v6, v7}, Lsy0;->E(Ljava/lang/CharSequence;[Ljava/lang/String;)Lfo;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    new-instance v8, Lm;

    .line 298
    .line 299
    const/4 v9, 0x3

    .line 300
    invoke-direct {v8, v9, v6}, Lm;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    new-instance v6, Lfo;

    .line 304
    .line 305
    const/4 v9, 0x2

    .line 306
    invoke-direct {v6, v9, v8, v7}, Lfo;-><init>(ILdy;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v6}, Liu0;->F(Lhu0;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    goto :goto_1

    .line 314
    :cond_1
    move-object v6, v1

    .line 315
    :goto_1
    if-eqz v6, :cond_2

    .line 316
    .line 317
    new-instance v7, Lnl0;

    .line 318
    .line 319
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    check-cast v8, Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    check-cast v5, Ljava/lang/String;

    .line 334
    .line 335
    const/4 v9, 0x2

    .line 336
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    check-cast v6, Ljava/lang/String;

    .line 341
    .line 342
    const-string v9, "protocal"

    .line 343
    .line 344
    invoke-static {v5, v9}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    const-string v9, "fullName"

    .line 348
    .line 349
    invoke-static {v6, v9}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 353
    .line 354
    .line 355
    iput v8, v7, Lnl0;->a:I

    .line 356
    .line 357
    iput-object v5, v7, Lnl0;->b:Ljava/lang/String;

    .line 358
    .line 359
    iput-object v6, v7, Lnl0;->c:Ljava/lang/String;

    .line 360
    .line 361
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 365
    .line 366
    goto :goto_0

    .line 367
    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    const-string v0, "scan_ip_arg"

    .line 375
    .line 376
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-object v0, v0, Lh2;->i:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Lp21;

    .line 387
    .line 388
    iget-object v2, v0, Lp21;->g:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v2, Lcom/google/android/material/button/MaterialButton;

    .line 391
    .line 392
    iget-object v3, v0, Lp21;->i:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v3, Lcom/google/android/material/textfield/TextInputEditText;

    .line 395
    .line 396
    iget-object v4, v0, Lp21;->h:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 399
    .line 400
    const/16 v6, 0x8

    .line 401
    .line 402
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 403
    .line 404
    .line 405
    if-eqz p1, :cond_5

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-nez v2, :cond_4

    .line 412
    .line 413
    goto :goto_2

    .line 414
    :cond_4
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    .line 416
    .line 417
    :try_start_0
    invoke-virtual {v4}, Lcom/google/android/material/button/MaterialButton;->performClick()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    .line 419
    .line 420
    goto :goto_3

    .line 421
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    const-string v2, "wifi"

    .line 426
    .line 427
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    const-string v2, "null cannot be cast to non-null type android.net.wifi.WifiManager"

    .line 432
    .line 433
    invoke-static {p1, v2}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    check-cast p1, Landroid/net/wifi/WifiManager;

    .line 437
    .line 438
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    iget p1, p1, Landroid/net/DhcpInfo;->gateway:I

    .line 443
    .line 444
    invoke-static {p1}, Landroid/text/format/Formatter;->formatIpAddress(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    const-string v2, "formatIpAddress(...)"

    .line 449
    .line 450
    invoke-static {p1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    .line 455
    .line 456
    :try_start_1
    invoke-virtual {v4}, Lcom/google/android/material/button/MaterialButton;->performClick()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 457
    .line 458
    .line 459
    :catch_0
    :goto_3
    iget-object p1, v0, Lp21;->f:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 462
    .line 463
    new-instance v0, Lkl0;

    .line 464
    .line 465
    const/4 v2, 0x0

    .line 466
    invoke-direct {v0, p0, v2}, Lkl0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 470
    .line 471
    .line 472
    new-instance p1, Lkl0;

    .line 473
    .line 474
    const/4 v0, 0x1

    .line 475
    invoke-direct {p1, p0, v0}, Lkl0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    iget-object p1, p1, Lh2;->e:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast p1, Landroid/widget/Button;

    .line 488
    .line 489
    new-instance v0, Lkl0;

    .line 490
    .line 491
    const/4 v2, 0x2

    .line 492
    invoke-direct {v0, p0, v2}, Lkl0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 496
    .line 497
    .line 498
    new-instance p1, Ljava/util/ArrayList;

    .line 499
    .line 500
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 501
    .line 502
    .line 503
    iput-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 504
    .line 505
    new-instance v0, Lc10;

    .line 506
    .line 507
    new-instance v2, Lwk0;

    .line 508
    .line 509
    const/4 v3, 0x1

    .line 510
    invoke-direct {v2, v3}, Lwk0;-><init>(I)V

    .line 511
    .line 512
    .line 513
    const/4 v3, 0x2

    .line 514
    invoke-direct {v0, p1, v2, v3}, Lc10;-><init>(Ljava/util/ArrayList;Lpy;I)V

    .line 515
    .line 516
    .line 517
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->F:Lc10;

    .line 518
    .line 519
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    iget-object p1, p1, Lh2;->h:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 526
    .line 527
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 528
    .line 529
    .line 530
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->F:Lc10;

    .line 531
    .line 532
    if-eqz v0, :cond_6

    .line 533
    .line 534
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :cond_6
    const-string p1, "portAdapter"

    .line 539
    .line 540
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    throw v1

    .line 544
    :cond_7
    const-string p1, "adView"

    .line 545
    .line 546
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v1

    .line 550
    :cond_8
    move v0, v10

    .line 551
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    new-instance v0, Ljava/lang/NullPointerException;

    .line 560
    .line 561
    const-string v1, "Missing required view with ID: "

    .line 562
    .line 563
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    throw v0
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

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

.method public final onPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lr9;->c()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->D:Lql0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, v0, Lql0;->d:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "portScan"

    .line 18
    .line 19
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :catch_0
    :goto_0
    invoke-super {p0}, Li5;->onPause()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string v0, "adView"

    .line 28
    .line 29
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Li5;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

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

.method public final x()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lh2;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lp21;

    .line 8
    .line 9
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 12
    .line 13
    invoke-virtual {v0}, Ln6;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lsy0;->J(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Landroid/util/Patterns;->IP_ADDRESS:Ljava/util/regex/Pattern;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_9

    .line 40
    .line 41
    const/4 v2, 0x6

    .line 42
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->onEditorAction(I)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lll0;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {v0, p0, v2}, Lll0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const-string v3, "dataList"

    .line 58
    .line 59
    if-eqz v0, :cond_8

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v4, 0x0

    .line 66
    if-lez v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->F:Lc10;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    iget-object v5, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 73
    .line 74
    if-eqz v5, :cond_1

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    iget-object v0, v0, Lao0;->f:Lbo0;

    .line 81
    .line 82
    invoke-virtual {v0, v4, v5}, Lbo0;->e(II)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 86
    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v2

    .line 97
    :cond_1
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v2

    .line 101
    :cond_2
    const-string v0, "portAdapter"

    .line 102
    .line 103
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v2

    .line 107
    :cond_3
    :goto_0
    iput-object v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->H:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    invoke-static {v1}, Lql0;->a(Ljava/lang/String;)Lql0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, v0, Lql0;->e:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 120
    .line 121
    .line 122
    new-instance v1, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v5, ","

    .line 128
    .line 129
    const-string v6, "19-8884"

    .line 130
    .line 131
    invoke-virtual {v6, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    array-length v6, v5

    .line 136
    move v7, v4

    .line 137
    :goto_1
    if-ge v7, v6, :cond_7

    .line 138
    .line 139
    aget-object v8, v5, v7

    .line 140
    .line 141
    const-string v9, "-"

    .line 142
    .line 143
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_5

    .line 148
    .line 149
    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    aget-object v10, v10, v4

    .line 154
    .line 155
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    const/4 v9, 0x1

    .line 164
    aget-object v8, v8, v9

    .line 165
    .line 166
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    invoke-static {v10}, Lql0;->b(I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v8}, Lql0;->b(I)V

    .line 174
    .line 175
    .line 176
    if-le v8, v10, :cond_4

    .line 177
    .line 178
    :goto_2
    if-gt v10, v8, :cond_6

    .line 179
    .line 180
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    add-int/lit8 v10, v10, 0x1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    const-string v1, "Start port cannot be greater than or equal to the end port"

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    invoke-static {v8}, Lql0;->b(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_7
    iput-object v1, v0, Lql0;->e:Ljava/util/ArrayList;

    .line 216
    .line 217
    const/16 v1, 0x3c

    .line 218
    .line 219
    iput v1, v0, Lql0;->c:I

    .line 220
    .line 221
    new-instance v1, Lue;

    .line 222
    .line 223
    const/4 v5, 0x1

    .line 224
    invoke-direct {v1, p0, v2, v3, v5}, Lue;-><init>(Ljava/lang/Object;JI)V

    .line 225
    .line 226
    .line 227
    iput-object v1, v0, Lql0;->g:Lpl0;

    .line 228
    .line 229
    iget-object v2, v0, Lql0;->f:Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 232
    .line 233
    .line 234
    iput-boolean v4, v0, Lql0;->d:Z

    .line 235
    .line 236
    new-instance v2, Ljava/lang/Thread;

    .line 237
    .line 238
    new-instance v3, Ljq3;

    .line 239
    .line 240
    const/16 v4, 0xd

    .line 241
    .line 242
    const/4 v5, 0x0

    .line 243
    invoke-direct {v3, v0, v1, v4, v5}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 250
    .line 251
    .line 252
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->D:Lql0;

    .line 253
    .line 254
    return-void

    .line 255
    :cond_8
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v2

    .line 259
    :cond_9
    const-string v0, ""

    .line 260
    .line 261
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->H:Ljava/lang/String;

    .line 262
    .line 263
    new-instance v0, Lll0;

    .line 264
    .line 265
    const/4 v1, 0x2

    .line 266
    invoke-direct {v0, p0, v1}, Lll0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 270
    .line 271
    .line 272
    return-void
.end method

.method public final y()Lh2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->E:Lh2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "binding"

    .line 7
    .line 8
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final z(Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lh2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/widget/Button;

    .line 8
    .line 9
    iget-object v2, v0, Lh2;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/constraintlayout/widget/Group;

    .line 12
    .line 13
    iget-object v3, v0, Lh2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lp21;

    .line 16
    .line 17
    iget-object v4, v3, Lp21;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 20
    .line 21
    iget-object v3, v3, Lp21;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 24
    .line 25
    iget-object v0, v0, Lh2;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x4

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    const/16 p1, 0x8

    .line 40
    .line 41
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne p1, v6, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    const p1, 0x7f0800f2

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p1}, Ljj;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v3, p1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Lkl0;

    .line 64
    .line 65
    const/4 v0, 0x3

    .line 66
    invoke-direct {p1, p0, v0}, Lkl0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x6

    .line 73
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->onEditorAction(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    const p1, 0x7f0800c6

    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1}, Ljj;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v3, p1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Lkl0;

    .line 94
    .line 95
    const/4 v2, 0x4

    .line 96
    invoke-direct {p1, p0, v2}, Lkl0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x1

    .line 106
    invoke-virtual {v4, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    return-void
.end method
