.class public final Lsb;
.super Lp0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lsb;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lsb;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Lp0;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Lsb;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lp0;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Lp0;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lsb;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton;->i:Z

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;La1;)V
    .locals 11

    .line 1
    iget v0, p0, Lsb;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    iget-object v3, p0, Lp0;->a:Landroid/view/View$AccessibilityDelegate;

    .line 6
    .line 7
    iget-object v4, p0, Lsb;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v4, Lhm0;

    .line 13
    .line 14
    iget-object v0, v4, Lhm0;->g:Lxo0;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lxo0;->d(Landroid/view/View;La1;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, v4, Lhm0;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, p1, Lwo0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->F(Lwo0;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lao0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    instance-of p2, p1, Lem0;

    .line 44
    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    check-cast p1, Lem0;

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Lem0;->i(I)Landroidx/preference/Preference;

    .line 51
    .line 52
    .line 53
    :goto_1
    return-void

    .line 54
    :pswitch_0
    iget-object p2, p2, La1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 55
    .line 56
    invoke-virtual {v3, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 57
    .line 58
    .line 59
    check-cast v4, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 60
    .line 61
    iget-boolean p1, v4, Lcom/google/android/material/internal/NavigationMenuItemView;->C:Z

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_1
    iget-object v0, p2, La1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 68
    .line 69
    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 70
    .line 71
    .line 72
    check-cast v4, Lcc0;

    .line 73
    .line 74
    iget-object p1, v4, Lcc0;->k0:Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    const p1, 0x7f1200c4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Liw;->l()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const p1, 0x7f1200c2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Liw;->l()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_2
    new-instance v0, Lv0;

    .line 106
    .line 107
    const/16 v1, 0x10

    .line 108
    .line 109
    invoke-direct {v0, p1, v1}, Lv0;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v0}, La1;->b(Lv0;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_2
    iget-object p2, p2, La1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 117
    .line 118
    invoke-virtual {v3, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 119
    .line 120
    .line 121
    check-cast v4, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 122
    .line 123
    sget v0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->v:I

    .line 124
    .line 125
    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 126
    .line 127
    if-nez v0, :cond_5

    .line 128
    .line 129
    :cond_4
    move v7, v2

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    move v0, v1

    .line 132
    :goto_3
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-ge v1, v3, :cond_4

    .line 137
    .line 138
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    if-ne v3, p1, :cond_6

    .line 143
    .line 144
    move v7, v0

    .line 145
    goto :goto_4

    .line 146
    :cond_6
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    instance-of v3, v3, Lcom/google/android/material/button/MaterialButton;

    .line 151
    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    const/16 v5, 0x8

    .line 163
    .line 164
    if-eq v3, v5, :cond_7

    .line 165
    .line 166
    add-int/lit8 v0, v0, 0x1

    .line 167
    .line 168
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :goto_4
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 172
    .line 173
    iget-boolean v10, p1, Lcom/google/android/material/button/MaterialButton;->t:Z

    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v5, 0x0

    .line 177
    const/4 v6, 0x1

    .line 178
    const/4 v8, 0x1

    .line 179
    invoke-static/range {v5 .. v10}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_3
    iget-object p2, p2, La1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 188
    .line 189
    invoke-virtual {v3, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 190
    .line 191
    .line 192
    check-cast v4, Lcom/google/android/material/internal/CheckableImageButton;

    .line 193
    .line 194
    iget-boolean p1, v4, Lcom/google/android/material/internal/CheckableImageButton;->j:Z

    .line 195
    .line 196
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 197
    .line 198
    .line 199
    iget-boolean p1, v4, Lcom/google/android/material/internal/CheckableImageButton;->i:Z

    .line 200
    .line 201
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_4
    iget-object v0, p2, La1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 206
    .line 207
    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 208
    .line 209
    .line 210
    check-cast v4, Lvb;

    .line 211
    .line 212
    iget-boolean p1, v4, Lvb;->p:Z

    .line 213
    .line 214
    if-eqz p1, :cond_8

    .line 215
    .line 216
    const/high16 p1, 0x100000

    .line 217
    .line 218
    invoke-virtual {p2, p1}, La1;->a(I)V

    .line 219
    .line 220
    .line 221
    const/4 p1, 0x1

    .line 222
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_8
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 227
    .line 228
    .line 229
    :goto_5
    return-void

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    .line 1
    iget v0, p0, Lsb;->d:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lp0;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :sswitch_0
    iget-object v0, p0, Lsb;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lhm0;

    .line 14
    .line 15
    iget-object v0, v0, Lhm0;->g:Lxo0;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, Lxo0;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :sswitch_1
    const/high16 v0, 0x100000

    .line 23
    .line 24
    if-ne p2, v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lsb;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lvb;

    .line 29
    .line 30
    iget-boolean v1, v0, Lvb;->p:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Lvb;->cancel()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lp0;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :goto_0
    return p1

    .line 44
    nop

    .line 45
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method
