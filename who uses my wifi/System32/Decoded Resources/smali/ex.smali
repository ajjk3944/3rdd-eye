.class public final Lex;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ll92;

.field public final b:Lp21;

.field public final c:Liw;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Ll92;Lp21;Liw;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lex;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lex;->e:I

    .line 4
    iput-object p1, p0, Lex;->a:Ll92;

    .line 5
    iput-object p2, p0, Lex;->b:Lp21;

    .line 6
    iput-object p3, p0, Lex;->c:Liw;

    return-void
.end method

.method public constructor <init>(Ll92;Lp21;Liw;Ldx;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lex;->d:Z

    const/4 v1, -0x1

    .line 35
    iput v1, p0, Lex;->e:I

    .line 36
    iput-object p1, p0, Lex;->a:Ll92;

    .line 37
    iput-object p2, p0, Lex;->b:Lp21;

    .line 38
    iput-object p3, p0, Lex;->c:Liw;

    const/4 p1, 0x0

    .line 39
    iput-object p1, p3, Liw;->h:Landroid/util/SparseArray;

    .line 40
    iput-object p1, p3, Liw;->i:Landroid/os/Bundle;

    .line 41
    iput v0, p3, Liw;->v:I

    .line 42
    iput-boolean v0, p3, Liw;->s:Z

    .line 43
    iput-boolean v0, p3, Liw;->p:Z

    .line 44
    iget-object p2, p3, Liw;->l:Liw;

    if-eqz p2, :cond_0

    iget-object p2, p2, Liw;->j:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Liw;->m:Ljava/lang/String;

    .line 45
    iput-object p1, p3, Liw;->l:Liw;

    .line 46
    iget-object p1, p4, Ldx;->r:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 47
    iput-object p1, p3, Liw;->g:Landroid/os/Bundle;

    return-void

    .line 48
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Liw;->g:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Ll92;Lp21;Ljava/lang/ClassLoader;Lsw;Ldx;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lex;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lex;->e:I

    .line 10
    iput-object p1, p0, Lex;->a:Ll92;

    .line 11
    iput-object p2, p0, Lex;->b:Lp21;

    .line 12
    iget-object p1, p5, Ldx;->f:Ljava/lang/String;

    invoke-virtual {p4, p1}, Lsw;->a(Ljava/lang/String;)Liw;

    move-result-object p1

    .line 13
    iget-object p2, p5, Ldx;->o:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, Liw;->K(Landroid/os/Bundle;)V

    .line 16
    iget-object p2, p5, Ldx;->g:Ljava/lang/String;

    iput-object p2, p1, Liw;->j:Ljava/lang/String;

    .line 17
    iget-boolean p2, p5, Ldx;->h:Z

    iput-boolean p2, p1, Liw;->r:Z

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p1, Liw;->t:Z

    .line 19
    iget p2, p5, Ldx;->i:I

    iput p2, p1, Liw;->A:I

    .line 20
    iget p2, p5, Ldx;->j:I

    iput p2, p1, Liw;->B:I

    .line 21
    iget-object p2, p5, Ldx;->k:Ljava/lang/String;

    iput-object p2, p1, Liw;->C:Ljava/lang/String;

    .line 22
    iget-boolean p2, p5, Ldx;->l:Z

    iput-boolean p2, p1, Liw;->F:Z

    .line 23
    iget-boolean p2, p5, Ldx;->m:Z

    iput-boolean p2, p1, Liw;->q:Z

    .line 24
    iget-boolean p2, p5, Ldx;->n:Z

    iput-boolean p2, p1, Liw;->E:Z

    .line 25
    iget-boolean p2, p5, Ldx;->p:Z

    iput-boolean p2, p1, Liw;->D:Z

    .line 26
    invoke-static {}, Lu50;->values()[Lu50;

    move-result-object p2

    iget p3, p5, Ldx;->q:I

    aget-object p2, p2, p3

    iput-object p2, p1, Liw;->R:Lu50;

    .line 27
    iget-object p2, p5, Ldx;->r:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 28
    iput-object p2, p1, Liw;->g:Landroid/os/Bundle;

    goto :goto_0

    .line 29
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Liw;->g:Landroid/os/Bundle;

    .line 30
    :goto_0
    iput-object p1, p0, Lex;->c:Liw;

    const/4 p2, 0x2

    .line 31
    invoke-static {p2}, Lxw;->F(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 32
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, v2, Liw;->g:Landroid/os/Bundle;

    .line 14
    .line 15
    iget-object v1, v2, Liw;->y:Lxw;

    .line 16
    .line 17
    invoke-virtual {v1}, Lxw;->L()V

    .line 18
    .line 19
    .line 20
    iput v0, v2, Liw;->f:I

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, v2, Liw;->H:Z

    .line 24
    .line 25
    invoke-virtual {v2}, Liw;->r()V

    .line 26
    .line 27
    .line 28
    iget-boolean v3, v2, Liw;->H:Z

    .line 29
    .line 30
    const-string v4, "Fragment "

    .line 31
    .line 32
    if-eqz v3, :cond_a

    .line 33
    .line 34
    invoke-static {v0}, Lxw;->F(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Liw;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, v2, Liw;->J:Landroid/view/View;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz v0, :cond_9

    .line 47
    .line 48
    iget-object v5, v2, Liw;->g:Landroid/os/Bundle;

    .line 49
    .line 50
    iget-object v6, v2, Liw;->h:Landroid/util/SparseArray;

    .line 51
    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0, v6}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 55
    .line 56
    .line 57
    iput-object v3, v2, Liw;->h:Landroid/util/SparseArray;

    .line 58
    .line 59
    :cond_2
    iget-object v0, v2, Liw;->J:Landroid/view/View;

    .line 60
    .line 61
    if-eqz v0, :cond_7

    .line 62
    .line 63
    iget-object v0, v2, Liw;->T:Ljx;

    .line 64
    .line 65
    iget-object v6, v2, Liw;->i:Landroid/os/Bundle;

    .line 66
    .line 67
    iget-object v0, v0, Ljx;->i:Lgw3;

    .line 68
    .line 69
    iget-object v0, v0, Lgw3;->g:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lzs0;

    .line 72
    .line 73
    iget-object v7, v0, Lzs0;->a:Lat0;

    .line 74
    .line 75
    iget-boolean v8, v0, Lzs0;->e:Z

    .line 76
    .line 77
    if-nez v8, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Lzs0;->a()V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-interface {v7}, Lb60;->e()Ld60;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget-object v8, v8, Ld60;->c:Lu50;

    .line 87
    .line 88
    sget-object v9, Lu50;->i:Lu50;

    .line 89
    .line 90
    invoke-virtual {v8, v9}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-gez v8, :cond_6

    .line 95
    .line 96
    iget-boolean v7, v0, Lzs0;->g:Z

    .line 97
    .line 98
    if-nez v7, :cond_5

    .line 99
    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    const-string v7, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_4

    .line 109
    .line 110
    invoke-static {v6, v7}, Lm54;->n(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    move-object v6, v3

    .line 116
    :goto_0
    iput-object v6, v0, Lzs0;->f:Landroid/os/Bundle;

    .line 117
    .line 118
    const/4 v6, 0x1

    .line 119
    iput-boolean v6, v0, Lzs0;->g:Z

    .line 120
    .line 121
    iput-object v3, v2, Liw;->i:Landroid/os/Bundle;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string v1, "SavedStateRegistry was already restored."

    .line 127
    .line 128
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "performRestore cannot be called when owner is "

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v7}, Lb60;->e()Ld60;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v1, v1, Ld60;->c:Lu50;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v1

    .line 162
    :cond_7
    :goto_1
    iput-boolean v1, v2, Liw;->H:Z

    .line 163
    .line 164
    invoke-virtual {v2, v5}, Liw;->D(Landroid/os/Bundle;)V

    .line 165
    .line 166
    .line 167
    iget-boolean v0, v2, Liw;->H:Z

    .line 168
    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    iget-object v0, v2, Liw;->J:Landroid/view/View;

    .line 172
    .line 173
    if-eqz v0, :cond_9

    .line 174
    .line 175
    iget-object v0, v2, Liw;->T:Ljx;

    .line 176
    .line 177
    sget-object v4, Lt50;->ON_CREATE:Lt50;

    .line 178
    .line 179
    invoke-virtual {v0, v4}, Ljx;->b(Lt50;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_8
    new-instance v0, Lbz0;

    .line 184
    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, " did not call through to super.onViewStateRestored()"

    .line 194
    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_9
    :goto_2
    iput-object v3, v2, Liw;->g:Landroid/os/Bundle;

    .line 207
    .line 208
    iget-object v0, v2, Liw;->y:Lxw;

    .line 209
    .line 210
    iput-boolean v1, v0, Lxw;->E:Z

    .line 211
    .line 212
    iput-boolean v1, v0, Lxw;->F:Z

    .line 213
    .line 214
    iget-object v2, v0, Lxw;->L:Lax;

    .line 215
    .line 216
    iput-boolean v1, v2, Lax;->g:Z

    .line 217
    .line 218
    const/4 v2, 0x4

    .line 219
    invoke-virtual {v0, v2}, Lxw;->t(I)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lex;->a:Ll92;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ll92;->g(Z)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_a
    new-instance v0, Lbz0;

    .line 229
    .line 230
    new-instance v1, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v2, " did not call through to super.onActivityCreated()"

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Lex;->b:Lp21;

    .line 2
    .line 3
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, Lex;->c:Liw;

    .line 8
    .line 9
    iget-object v2, v1, Liw;->I:Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/lit8 v5, v4, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v5, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Liw;

    .line 28
    .line 29
    iget-object v7, v6, Liw;->I:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-ne v7, v2, :cond_1

    .line 32
    .line 33
    iget-object v6, v6, Liw;->J:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-ge v4, v5, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Liw;

    .line 60
    .line 61
    iget-object v6, v5, Liw;->I:Landroid/view/ViewGroup;

    .line 62
    .line 63
    if-ne v6, v2, :cond_3

    .line 64
    .line 65
    iget-object v5, v5, Liw;->J:Landroid/view/View;

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    iget-object v0, v1, Liw;->I:Landroid/view/ViewGroup;

    .line 76
    .line 77
    iget-object v1, v1, Liw;->J:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Liw;->l:Liw;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, " that does not belong to this FragmentManager!"

    .line 17
    .line 18
    const-string v4, " declared target fragment "

    .line 19
    .line 20
    iget-object v5, p0, Lex;->b:Lp21;

    .line 21
    .line 22
    const-string v6, "Fragment "

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, Liw;->j:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v5, v5, Lp21;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lex;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v3, v1, Liw;->l:Liw;

    .line 41
    .line 42
    iget-object v3, v3, Liw;->j:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v3, v1, Liw;->m:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v2, v1, Liw;->l:Liw;

    .line 47
    .line 48
    move-object v2, v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Liw;->l:Liw;

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object v0, v1, Liw;->m:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-object v2, v5, Lp21;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v2, v0

    .line 92
    check-cast v2, Lex;

    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, v1, Liw;->m:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v1, v3}, Lex0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 121
    .line 122
    invoke-virtual {v2}, Lex;->k()V

    .line 123
    .line 124
    .line 125
    :cond_5
    iget-object v0, v1, Liw;->w:Lxw;

    .line 126
    .line 127
    iget-object v2, v0, Lxw;->t:Lkw;

    .line 128
    .line 129
    iput-object v2, v1, Liw;->x:Lkw;

    .line 130
    .line 131
    iget-object v0, v0, Lxw;->v:Liw;

    .line 132
    .line 133
    iput-object v0, v1, Liw;->z:Liw;

    .line 134
    .line 135
    iget-object v0, p0, Lex;->a:Ll92;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-virtual {v0, v2}, Ll92;->n(Z)V

    .line 139
    .line 140
    .line 141
    iget-object v3, v1, Liw;->W:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    move v5, v2

    .line 148
    :goto_1
    if-ge v5, v4, :cond_6

    .line 149
    .line 150
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    add-int/lit8 v5, v5, 0x1

    .line 155
    .line 156
    check-cast v7, Lfw;

    .line 157
    .line 158
    iget-object v7, v7, Lfw;->a:Liw;

    .line 159
    .line 160
    iget-object v8, v7, Liw;->V:Lgw3;

    .line 161
    .line 162
    invoke-virtual {v8}, Lgw3;->x()V

    .line 163
    .line 164
    .line 165
    invoke-static {v7}, Lg82;->g(Lat0;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 170
    .line 171
    .line 172
    iget-object v3, v1, Liw;->y:Lxw;

    .line 173
    .line 174
    iget-object v4, v1, Liw;->x:Lkw;

    .line 175
    .line 176
    invoke-virtual {v1}, Liw;->b()Li30;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v3, v4, v5, v1}, Lxw;->b(Lkw;Li30;Liw;)V

    .line 181
    .line 182
    .line 183
    iput v2, v1, Liw;->f:I

    .line 184
    .line 185
    iput-boolean v2, v1, Liw;->H:Z

    .line 186
    .line 187
    iget-object v3, v1, Liw;->x:Lkw;

    .line 188
    .line 189
    iget-object v3, v3, Lkw;->x:Li5;

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Liw;->t(Landroid/content/Context;)V

    .line 192
    .line 193
    .line 194
    iget-boolean v3, v1, Liw;->H:Z

    .line 195
    .line 196
    if-eqz v3, :cond_8

    .line 197
    .line 198
    iget-object v3, v1, Liw;->w:Lxw;

    .line 199
    .line 200
    iget-object v3, v3, Lxw;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_7

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Lbx;

    .line 217
    .line 218
    invoke-interface {v4}, Lbx;->b()V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_7
    iget-object v1, v1, Liw;->y:Lxw;

    .line 223
    .line 224
    iput-boolean v2, v1, Lxw;->E:Z

    .line 225
    .line 226
    iput-boolean v2, v1, Lxw;->F:Z

    .line 227
    .line 228
    iget-object v3, v1, Lxw;->L:Lax;

    .line 229
    .line 230
    iput-boolean v2, v3, Lax;->g:Z

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Lxw;->t(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v2}, Ll92;->h(Z)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_8
    new-instance v0, Lbz0;

    .line 240
    .line 241
    new-instance v2, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v1, " did not call through to super.onAttach()"

    .line 250
    .line 251
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0
.end method

.method public final d()I
    .locals 14

    .line 1
    iget-object v0, p0, Lex;->c:Liw;

    .line 2
    .line 3
    iget-object v1, v0, Liw;->w:Lxw;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Liw;->f:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Lex;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Liw;->R:Lu50;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x5

    .line 20
    const/4 v5, -0x1

    .line 21
    const/4 v6, 0x3

    .line 22
    const/4 v7, 0x4

    .line 23
    const/4 v8, 0x2

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v2, v9, :cond_3

    .line 26
    .line 27
    if-eq v2, v8, :cond_2

    .line 28
    .line 29
    if-eq v2, v6, :cond_1

    .line 30
    .line 31
    if-eq v2, v7, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Liw;->r:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Liw;->s:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, Lex;->e:I

    .line 61
    .line 62
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Liw;->J:Landroid/view/View;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, Lex;->e:I

    .line 82
    .line 83
    if-ge v2, v7, :cond_6

    .line 84
    .line 85
    iget v2, v0, Liw;->f:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, Liw;->p:Z

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :cond_8
    iget-object v2, v0, Liw;->I:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v2, :cond_e

    .line 107
    .line 108
    invoke-virtual {v0}, Liw;->k()Lxw;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, Lxw;->E()Lfr;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v2, v10}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2, v0}, Ltn;->d(Liw;)Llx0;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    iget v10, v10, Llx0;->b:I

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_9
    move v10, v3

    .line 130
    :goto_2
    iget-object v2, v2, Ltn;->c:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    :cond_a
    if-ge v3, v11, :cond_b

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    check-cast v12, Llx0;

    .line 145
    .line 146
    iget-object v13, v12, Llx0;->c:Liw;

    .line 147
    .line 148
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eqz v13, :cond_a

    .line 153
    .line 154
    iget-boolean v13, v12, Llx0;->f:Z

    .line 155
    .line 156
    if-nez v13, :cond_a

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_b
    const/4 v12, 0x0

    .line 160
    :goto_3
    if-eqz v12, :cond_d

    .line 161
    .line 162
    if-eqz v10, :cond_c

    .line 163
    .line 164
    if-ne v10, v9, :cond_d

    .line 165
    .line 166
    :cond_c
    iget v2, v12, Llx0;->b:I

    .line 167
    .line 168
    move v3, v2

    .line 169
    goto :goto_4

    .line 170
    :cond_d
    move v3, v10

    .line 171
    :cond_e
    :goto_4
    if-ne v3, v8, :cond_f

    .line 172
    .line 173
    const/4 v2, 0x6

    .line 174
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    goto :goto_5

    .line 179
    :cond_f
    if-ne v3, v6, :cond_10

    .line 180
    .line 181
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    goto :goto_5

    .line 186
    :cond_10
    iget-boolean v2, v0, Liw;->q:Z

    .line 187
    .line 188
    if-eqz v2, :cond_12

    .line 189
    .line 190
    invoke-virtual {v0}, Liw;->q()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_11

    .line 195
    .line 196
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    goto :goto_5

    .line 201
    :cond_11
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    :cond_12
    :goto_5
    iget-boolean v2, v0, Liw;->K:Z

    .line 206
    .line 207
    if-eqz v2, :cond_13

    .line 208
    .line 209
    iget v2, v0, Liw;->f:I

    .line 210
    .line 211
    if-ge v2, v4, :cond_13

    .line 212
    .line 213
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    :cond_13
    invoke-static {v8}, Lxw;->F(I)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_14

    .line 222
    .line 223
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    :cond_14
    return v1
.end method

.method public final e()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-boolean v0, v1, Liw;->P:Z

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v0, :cond_6

    .line 17
    .line 18
    iget-object v0, p0, Lex;->a:Ll92;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, v3}, Ll92;->o(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v1, Liw;->g:Landroid/os/Bundle;

    .line 25
    .line 26
    iget-object v5, v1, Liw;->y:Lxw;

    .line 27
    .line 28
    invoke-virtual {v5}, Lxw;->L()V

    .line 29
    .line 30
    .line 31
    iput v2, v1, Liw;->f:I

    .line 32
    .line 33
    iput-boolean v3, v1, Liw;->H:Z

    .line 34
    .line 35
    iget-object v5, v1, Liw;->S:Ld60;

    .line 36
    .line 37
    new-instance v6, Lun0;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    invoke-direct {v6, v7, v1}, Lun0;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v6}, Ld60;->a(La60;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, v1, Liw;->V:Lgw3;

    .line 47
    .line 48
    iget-object v5, v5, Lgw3;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, Lzs0;

    .line 51
    .line 52
    iget-object v6, v5, Lzs0;->a:Lat0;

    .line 53
    .line 54
    iget-boolean v7, v5, Lzs0;->e:Z

    .line 55
    .line 56
    if-nez v7, :cond_1

    .line 57
    .line 58
    invoke-virtual {v5}, Lzs0;->a()V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-interface {v6}, Lb60;->e()Ld60;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    iget-object v7, v7, Ld60;->c:Lu50;

    .line 66
    .line 67
    sget-object v8, Lu50;->i:Lu50;

    .line 68
    .line 69
    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-gez v7, :cond_5

    .line 74
    .line 75
    iget-boolean v6, v5, Lzs0;->g:Z

    .line 76
    .line 77
    if-nez v6, :cond_4

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    const-string v7, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 83
    .line 84
    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_2

    .line 89
    .line 90
    invoke-static {v4, v7}, Lm54;->n(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    :cond_2
    iput-object v6, v5, Lzs0;->f:Landroid/os/Bundle;

    .line 95
    .line 96
    iput-boolean v2, v5, Lzs0;->g:Z

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Liw;->u(Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    iput-boolean v2, v1, Liw;->P:Z

    .line 102
    .line 103
    iget-boolean v2, v1, Liw;->H:Z

    .line 104
    .line 105
    if-eqz v2, :cond_3

    .line 106
    .line 107
    iget-object v1, v1, Liw;->S:Ld60;

    .line 108
    .line 109
    sget-object v2, Lt50;->ON_CREATE:Lt50;

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ld60;->d(Lt50;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3}, Ll92;->i(Z)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_3
    new-instance v0, Lbz0;

    .line 119
    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v3, "Fragment "

    .line 123
    .line 124
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, " did not call through to super.onCreate()"

    .line 131
    .line 132
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v1, "SavedStateRegistry was already restored."

    .line 146
    .line 147
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v0

    .line 151
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v1, "performRestore cannot be called when owner is "

    .line 154
    .line 155
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v6}, Lb60;->e()Ld60;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v1, v1, Ld60;->c:Lu50;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v1

    .line 181
    :cond_6
    iget-object v0, v1, Liw;->g:Landroid/os/Bundle;

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Liw;->I(Landroid/os/Bundle;)V

    .line 184
    .line 185
    .line 186
    iput v2, v1, Liw;->f:I

    .line 187
    .line 188
    return-void
.end method

.method public final f()V
    .locals 6

    .line 1
    iget-object v0, p0, Lex;->c:Liw;

    .line 2
    .line 3
    iget-boolean v1, v0, Liw;->r:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    invoke-static {v1}, Lxw;->F(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v1, v0, Liw;->g:Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Liw;->y(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Liw;->O:Landroid/view/LayoutInflater;

    .line 25
    .line 26
    iget-object v2, v0, Liw;->I:Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_2
    iget v2, v0, Liw;->B:I

    .line 33
    .line 34
    if-eqz v2, :cond_6

    .line 35
    .line 36
    const/4 v3, -0x1

    .line 37
    if-eq v2, v3, :cond_5

    .line 38
    .line 39
    iget-object v3, v0, Liw;->w:Lxw;

    .line 40
    .line 41
    iget-object v3, v3, Lxw;->u:Li30;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Li30;->K(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Landroid/view/ViewGroup;

    .line 48
    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    iget-boolean v3, v0, Liw;->t:Z

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Liw;->l()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget v2, v0, Liw;->B:I

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 67
    :catch_0
    const-string v1, "unknown"

    .line 68
    .line 69
    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v4, "No view found for id 0x"

    .line 74
    .line 75
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget v4, v0, Liw;->B:I

    .line 79
    .line 80
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v4, " ("

    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ") for fragment "

    .line 96
    .line 97
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v2

    .line 111
    :cond_4
    instance-of v3, v2, Landroidx/fragment/app/FragmentContainerView;

    .line 112
    .line 113
    if-nez v3, :cond_7

    .line 114
    .line 115
    sget-object v3, Lgx;->a:Lfx;

    .line 116
    .line 117
    new-instance v3, Lhx;

    .line 118
    .line 119
    const/4 v4, 0x1

    .line 120
    invoke-direct {v3, v0, v2, v4}, Lhx;-><init>(Liw;Landroid/view/ViewGroup;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Lgx;->b(Lp71;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lgx;->a(Liw;)Lfx;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    new-instance v2, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v3, "Cannot create fragment "

    .line 139
    .line 140
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, " for a container view with no id"

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_6
    const/4 v2, 0x0

    .line 160
    :cond_7
    :goto_1
    iput-object v2, v0, Liw;->I:Landroid/view/ViewGroup;

    .line 161
    .line 162
    iget-object v3, v0, Liw;->g:Landroid/os/Bundle;

    .line 163
    .line 164
    invoke-virtual {v0, v1, v2, v3}, Liw;->E(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 168
    .line 169
    const/4 v3, 0x2

    .line 170
    if-eqz v1, :cond_c

    .line 171
    .line 172
    const/4 v4, 0x0

    .line 173
    invoke-virtual {v1, v4}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 174
    .line 175
    .line 176
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 177
    .line 178
    const v5, 0x7f090110

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v5, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    if-eqz v2, :cond_8

    .line 185
    .line 186
    invoke-virtual {p0}, Lex;->b()V

    .line 187
    .line 188
    .line 189
    :cond_8
    iget-boolean v1, v0, Liw;->D:Z

    .line 190
    .line 191
    if-eqz v1, :cond_9

    .line 192
    .line 193
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 194
    .line 195
    const/16 v2, 0x8

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 198
    .line 199
    .line 200
    :cond_9
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 201
    .line 202
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 203
    .line 204
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_a

    .line 209
    .line 210
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 211
    .line 212
    invoke-static {v1}, Lr51;->c(Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_a
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 217
    .line 218
    new-instance v2, Lud;

    .line 219
    .line 220
    invoke-direct {v2, v3, v1}, Lud;-><init>(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 224
    .line 225
    .line 226
    :goto_2
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 227
    .line 228
    iget-object v2, v0, Liw;->g:Landroid/os/Bundle;

    .line 229
    .line 230
    invoke-virtual {v0, v1, v2}, Liw;->C(Landroid/view/View;Landroid/os/Bundle;)V

    .line 231
    .line 232
    .line 233
    iget-object v1, v0, Liw;->y:Lxw;

    .line 234
    .line 235
    invoke-virtual {v1, v3}, Lxw;->t(I)V

    .line 236
    .line 237
    .line 238
    iget-object v1, p0, Lex;->a:Ll92;

    .line 239
    .line 240
    invoke-virtual {v1, v4}, Ll92;->t(Z)V

    .line 241
    .line 242
    .line 243
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 244
    .line 245
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    iget-object v2, v0, Liw;->J:Landroid/view/View;

    .line 250
    .line 251
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {v0}, Liw;->f()Lhw;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    iput v2, v4, Lhw;->j:F

    .line 260
    .line 261
    iget-object v2, v0, Liw;->I:Landroid/view/ViewGroup;

    .line 262
    .line 263
    if-eqz v2, :cond_c

    .line 264
    .line 265
    if-nez v1, :cond_c

    .line 266
    .line 267
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 268
    .line 269
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-eqz v1, :cond_b

    .line 274
    .line 275
    invoke-virtual {v0}, Liw;->f()Lhw;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    iput-object v1, v2, Lhw;->k:Landroid/view/View;

    .line 280
    .line 281
    invoke-static {v3}, Lxw;->F(I)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_b

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    :cond_b
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 294
    .line 295
    const/4 v2, 0x0

    .line 296
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 297
    .line 298
    .line 299
    :cond_c
    iput v3, v0, Liw;->f:I

    .line 300
    .line 301
    return-void
.end method

.method public final g()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-boolean v1, v2, Liw;->q:Z

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Liw;->q()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v1, v4

    .line 28
    :goto_0
    iget-object v5, p0, Lex;->b:Lp21;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v6, v2, Liw;->j:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v7, v5, Lp21;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ldx;

    .line 43
    .line 44
    :cond_2
    if-nez v1, :cond_7

    .line 45
    .line 46
    iget-object v6, v5, Lp21;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lax;

    .line 49
    .line 50
    iget-object v7, v6, Lax;->b:Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v8, v2, Liw;->j:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget-boolean v7, v6, Lax;->e:Z

    .line 62
    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    iget-boolean v6, v6, Lax;->f:Z

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    :goto_1
    move v6, v3

    .line 69
    :goto_2
    if-eqz v6, :cond_5

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_5
    iget-object v0, v2, Liw;->m:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-virtual {v5, v0}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iget-boolean v1, v0, Liw;->F:Z

    .line 83
    .line 84
    if-eqz v1, :cond_6

    .line 85
    .line 86
    iput-object v0, v2, Liw;->l:Liw;

    .line 87
    .line 88
    :cond_6
    iput v4, v2, Liw;->f:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_7
    :goto_3
    iget-object v6, v2, Liw;->x:Lkw;

    .line 92
    .line 93
    if-eqz v6, :cond_8

    .line 94
    .line 95
    iget-object v3, v5, Lp21;->i:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lax;

    .line 98
    .line 99
    iget-boolean v3, v3, Lax;->f:Z

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_8
    iget-object v6, v6, Lkw;->x:Li5;

    .line 103
    .line 104
    if-eqz v6, :cond_9

    .line 105
    .line 106
    invoke-virtual {v6}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    xor-int/2addr v3, v6

    .line 111
    :cond_9
    :goto_4
    if-eqz v1, :cond_a

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_a
    if-eqz v3, :cond_c

    .line 115
    .line 116
    :goto_5
    iget-object v1, v5, Lp21;->i:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Lax;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Lxw;->F(I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_b

    .line 128
    .line 129
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    :cond_b
    iget-object v0, v2, Liw;->j:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v1, v0}, Lax;->c(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_c
    iget-object v0, v2, Liw;->y:Lxw;

    .line 138
    .line 139
    invoke-virtual {v0}, Lxw;->k()V

    .line 140
    .line 141
    .line 142
    iget-object v0, v2, Liw;->S:Ld60;

    .line 143
    .line 144
    sget-object v1, Lt50;->ON_DESTROY:Lt50;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 147
    .line 148
    .line 149
    iput v4, v2, Liw;->f:I

    .line 150
    .line 151
    iput-boolean v4, v2, Liw;->H:Z

    .line 152
    .line 153
    iput-boolean v4, v2, Liw;->P:Z

    .line 154
    .line 155
    const/4 v0, 0x1

    .line 156
    iput-boolean v0, v2, Liw;->H:Z

    .line 157
    .line 158
    iget-boolean v0, v2, Liw;->H:Z

    .line 159
    .line 160
    if-eqz v0, :cond_10

    .line 161
    .line 162
    iget-object v0, p0, Lex;->a:Ll92;

    .line 163
    .line 164
    invoke-virtual {v0, v4}, Ll92;->j(Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Lp21;->l()Ljava/util/ArrayList;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    :cond_d
    :goto_6
    if-ge v4, v1, :cond_e

    .line 176
    .line 177
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    add-int/lit8 v4, v4, 0x1

    .line 182
    .line 183
    check-cast v3, Lex;

    .line 184
    .line 185
    if-eqz v3, :cond_d

    .line 186
    .line 187
    iget-object v3, v3, Lex;->c:Liw;

    .line 188
    .line 189
    iget-object v6, v2, Liw;->j:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v7, v3, Liw;->m:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_d

    .line 198
    .line 199
    iput-object v2, v3, Liw;->l:Liw;

    .line 200
    .line 201
    const/4 v6, 0x0

    .line 202
    iput-object v6, v3, Liw;->m:Ljava/lang/String;

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_e
    iget-object v0, v2, Liw;->m:Ljava/lang/String;

    .line 206
    .line 207
    if-eqz v0, :cond_f

    .line 208
    .line 209
    invoke-virtual {v5, v0}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v0, v2, Liw;->l:Liw;

    .line 214
    .line 215
    :cond_f
    invoke-virtual {v5, p0}, Lp21;->u(Lex;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_10
    new-instance v0, Lbz0;

    .line 220
    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v3, "Fragment "

    .line 224
    .line 225
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v2, " did not call through to super.onDestroy()"

    .line 232
    .line 233
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0
.end method

.method public final h()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Liw;->I:Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v2, v1, Liw;->J:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, v1, Liw;->y:Lxw;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-virtual {v0, v2}, Lxw;->t(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v1, Liw;->J:Landroid/view/View;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v1, Liw;->T:Ljx;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljx;->e()Ld60;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Ld60;->c:Lu50;

    .line 41
    .line 42
    sget-object v3, Lu50;->h:Lu50;

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ltz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v1, Liw;->T:Ljx;

    .line 51
    .line 52
    sget-object v3, Lt50;->ON_DESTROY:Lt50;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljx;->b(Lt50;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iput v2, v1, Liw;->f:I

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput-boolean v0, v1, Liw;->H:Z

    .line 61
    .line 62
    invoke-virtual {v1}, Liw;->w()V

    .line 63
    .line 64
    .line 65
    iget-boolean v2, v1, Liw;->H:Z

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-interface {v1}, Lr61;->d()Lq61;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v3, Lug0;

    .line 74
    .line 75
    sget-object v4, Lv70;->c:Lzw;

    .line 76
    .line 77
    invoke-direct {v3, v2, v4}, Lug0;-><init>(Lq61;Lp61;)V

    .line 78
    .line 79
    .line 80
    const-class v2, Lv70;

    .line 81
    .line 82
    invoke-virtual {v3, v2}, Lug0;->t(Ljava/lang/Class;)Lm61;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lv70;

    .line 87
    .line 88
    iget-object v2, v2, Lv70;->b:Ljx0;

    .line 89
    .line 90
    iget v3, v2, Ljx0;->h:I

    .line 91
    .line 92
    if-gtz v3, :cond_3

    .line 93
    .line 94
    iput-boolean v0, v1, Liw;->u:Z

    .line 95
    .line 96
    iget-object v2, p0, Lex;->a:Ll92;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ll92;->u(Z)V

    .line 99
    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    iput-object v2, v1, Liw;->I:Landroid/view/ViewGroup;

    .line 103
    .line 104
    iput-object v2, v1, Liw;->J:Landroid/view/View;

    .line 105
    .line 106
    iput-object v2, v1, Liw;->T:Ljx;

    .line 107
    .line 108
    iget-object v3, v1, Liw;->U:Lnf0;

    .line 109
    .line 110
    invoke-virtual {v3, v2}, Lnf0;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iput-boolean v0, v1, Liw;->s:Z

    .line 114
    .line 115
    return-void

    .line 116
    :cond_3
    iget-object v1, v2, Ljx0;->g:[Ljava/lang/Object;

    .line 117
    .line 118
    aget-object v0, v1, v0

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v0, Ljava/lang/ClassCastException;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_4
    new-instance v0, Lbz0;

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v3, "Fragment "

    .line 134
    .line 135
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, " did not call through to super.onDestroyView()"

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0
.end method

.method public final i()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v1, -0x1

    .line 14
    iput v1, v2, Liw;->f:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-boolean v3, v2, Liw;->H:Z

    .line 18
    .line 19
    invoke-virtual {v2}, Liw;->x()V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    iput-object v4, v2, Liw;->O:Landroid/view/LayoutInflater;

    .line 24
    .line 25
    iget-boolean v5, v2, Liw;->H:Z

    .line 26
    .line 27
    if-eqz v5, :cond_7

    .line 28
    .line 29
    iget-object v5, v2, Liw;->y:Lxw;

    .line 30
    .line 31
    iget-boolean v6, v5, Lxw;->G:Z

    .line 32
    .line 33
    if-nez v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {v5}, Lxw;->k()V

    .line 36
    .line 37
    .line 38
    new-instance v5, Lxw;

    .line 39
    .line 40
    invoke-direct {v5}, Lxw;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v5, v2, Liw;->y:Lxw;

    .line 44
    .line 45
    :cond_1
    iget-object v5, p0, Lex;->a:Ll92;

    .line 46
    .line 47
    invoke-virtual {v5, v3}, Ll92;->k(Z)V

    .line 48
    .line 49
    .line 50
    iput v1, v2, Liw;->f:I

    .line 51
    .line 52
    iput-object v4, v2, Liw;->x:Lkw;

    .line 53
    .line 54
    iput-object v4, v2, Liw;->z:Liw;

    .line 55
    .line 56
    iput-object v4, v2, Liw;->w:Lxw;

    .line 57
    .line 58
    iget-boolean v1, v2, Liw;->q:Z

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v2}, Liw;->q()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iget-object v1, p0, Lex;->b:Lp21;

    .line 70
    .line 71
    iget-object v1, v1, Lp21;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lax;

    .line 74
    .line 75
    iget-object v3, v1, Lax;->b:Ljava/util/HashMap;

    .line 76
    .line 77
    iget-object v4, v2, Liw;->j:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    iget-boolean v3, v1, Lax;->e:Z

    .line 87
    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    iget-boolean v1, v1, Lax;->f:Z

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    :goto_0
    const/4 v1, 0x1

    .line 94
    :goto_1
    if-eqz v1, :cond_6

    .line 95
    .line 96
    :goto_2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-virtual {v2}, Liw;->o()V

    .line 106
    .line 107
    .line 108
    :cond_6
    return-void

    .line 109
    :cond_7
    new-instance v0, Lbz0;

    .line 110
    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v3, "Fragment "

    .line 114
    .line 115
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v2, " did not call through to super.onDetach()"

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lex;->c:Liw;

    .line 2
    .line 3
    iget-boolean v1, v0, Liw;->r:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, Liw;->s:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Liw;->u:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Lxw;->F(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v1, v0, Liw;->g:Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Liw;->y(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, v0, Liw;->O:Landroid/view/LayoutInflater;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iget-object v3, v0, Liw;->g:Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3}, Liw;->E(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 48
    .line 49
    const v3, 0x7f090110

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-boolean v1, v0, Liw;->D:Z

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 60
    .line 61
    const/16 v3, 0x8

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 67
    .line 68
    iget-object v3, v0, Liw;->g:Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-virtual {v0, v1, v3}, Liw;->C(Landroid/view/View;Landroid/os/Bundle;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Liw;->y:Lxw;

    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    invoke-virtual {v1, v3}, Lxw;->t(I)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lex;->a:Ll92;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ll92;->t(Z)V

    .line 82
    .line 83
    .line 84
    iput v3, v0, Liw;->f:I

    .line 85
    .line 86
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-object v0, p0, Lex;->b:Lp21;

    .line 2
    .line 3
    iget-boolean v1, p0, Lex;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-static {v2}, Lxw;->F(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    const/4 v1, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    :try_start_0
    iput-boolean v1, p0, Lex;->d:Z

    .line 23
    .line 24
    move v5, v4

    .line 25
    :goto_0
    invoke-virtual {p0}, Lex;->d()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    iget v7, v3, Liw;->f:I

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    if-eq v6, v7, :cond_9

    .line 33
    .line 34
    if-le v6, v7, :cond_4

    .line 35
    .line 36
    add-int/lit8 v7, v7, 0x1

    .line 37
    .line 38
    packed-switch v7, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :pswitch_0
    invoke-virtual {p0}, Lex;->n()V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :pswitch_1
    const/4 v5, 0x6

    .line 52
    iput v5, v3, Liw;->f:I

    .line 53
    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :pswitch_2
    invoke-virtual {p0}, Lex;->p()V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :pswitch_3
    iget-object v5, v3, Liw;->J:Landroid/view/View;

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    iget-object v5, v3, Liw;->I:Landroid/view/ViewGroup;

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    invoke-virtual {v3}, Liw;->k()Lxw;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v6}, Lxw;->E()Lfr;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-static {v5, v6}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iget-object v6, v3, Liw;->J:Landroid/view/View;

    .line 82
    .line 83
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-static {v6}, Lex0;->b(I)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-static {v2}, Lxw;->F(I)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_2

    .line 96
    .line 97
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {v5, v6, v2, p0}, Ltn;->a(IILex;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    const/4 v5, 0x4

    .line 104
    iput v5, v3, Liw;->f:I

    .line 105
    .line 106
    goto/16 :goto_1

    .line 107
    .line 108
    :pswitch_4
    invoke-virtual {p0}, Lex;->a()V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :pswitch_5
    invoke-virtual {p0}, Lex;->j()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lex;->f()V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :pswitch_6
    invoke-virtual {p0}, Lex;->e()V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_7
    invoke-virtual {p0}, Lex;->c()V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    add-int/lit8 v7, v7, -0x1

    .line 130
    .line 131
    packed-switch v7, :pswitch_data_1

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :pswitch_8
    invoke-virtual {p0}, Lex;->l()V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_9
    const/4 v5, 0x5

    .line 140
    iput v5, v3, Liw;->f:I

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_a
    invoke-virtual {p0}, Lex;->q()V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :pswitch_b
    invoke-static {v8}, Lxw;->F(I)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_5

    .line 152
    .line 153
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    :cond_5
    iget-object v5, v3, Liw;->J:Landroid/view/View;

    .line 157
    .line 158
    if-eqz v5, :cond_6

    .line 159
    .line 160
    iget-object v5, v3, Liw;->h:Landroid/util/SparseArray;

    .line 161
    .line 162
    if-nez v5, :cond_6

    .line 163
    .line 164
    invoke-virtual {p0}, Lex;->o()V

    .line 165
    .line 166
    .line 167
    :cond_6
    iget-object v5, v3, Liw;->J:Landroid/view/View;

    .line 168
    .line 169
    if-eqz v5, :cond_8

    .line 170
    .line 171
    iget-object v5, v3, Liw;->I:Landroid/view/ViewGroup;

    .line 172
    .line 173
    if-eqz v5, :cond_8

    .line 174
    .line 175
    invoke-virtual {v3}, Liw;->k()Lxw;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v6}, Lxw;->E()Lfr;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v5, v6}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v2}, Lxw;->F(I)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_7

    .line 192
    .line 193
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    :cond_7
    invoke-virtual {v5, v1, v8, p0}, Ltn;->a(IILex;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    iput v8, v3, Liw;->f:I

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :pswitch_c
    iput-boolean v4, v3, Liw;->s:Z

    .line 203
    .line 204
    iput v2, v3, Liw;->f:I

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :pswitch_d
    invoke-virtual {p0}, Lex;->h()V

    .line 208
    .line 209
    .line 210
    iput v1, v3, Liw;->f:I

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :pswitch_e
    invoke-virtual {p0}, Lex;->g()V

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :pswitch_f
    invoke-virtual {p0}, Lex;->i()V

    .line 218
    .line 219
    .line 220
    :goto_1
    move v5, v1

    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_9
    if-nez v5, :cond_d

    .line 224
    .line 225
    const/4 v5, -0x1

    .line 226
    if-ne v7, v5, :cond_d

    .line 227
    .line 228
    iget-boolean v5, v3, Liw;->q:Z

    .line 229
    .line 230
    if-eqz v5, :cond_d

    .line 231
    .line 232
    invoke-virtual {v3}, Liw;->q()Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-nez v5, :cond_d

    .line 237
    .line 238
    invoke-static {v8}, Lxw;->F(I)Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-eqz v5, :cond_a

    .line 243
    .line 244
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    :cond_a
    iget-object v5, v0, Lp21;->i:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v5, Lax;

    .line 250
    .line 251
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-static {v8}, Lxw;->F(I)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_b

    .line 259
    .line 260
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    :cond_b
    iget-object v6, v3, Liw;->j:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v5, v6}, Lax;->c(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, p0}, Lp21;->u(Lex;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v8}, Lxw;->F(I)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_c

    .line 276
    .line 277
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    :cond_c
    invoke-virtual {v3}, Liw;->o()V

    .line 281
    .line 282
    .line 283
    :cond_d
    iget-boolean v0, v3, Liw;->N:Z

    .line 284
    .line 285
    if-eqz v0, :cond_13

    .line 286
    .line 287
    iget-object v0, v3, Liw;->J:Landroid/view/View;

    .line 288
    .line 289
    if-eqz v0, :cond_11

    .line 290
    .line 291
    iget-object v0, v3, Liw;->I:Landroid/view/ViewGroup;

    .line 292
    .line 293
    if-eqz v0, :cond_11

    .line 294
    .line 295
    invoke-virtual {v3}, Liw;->k()Lxw;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {v5}, Lxw;->E()Lfr;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-static {v0, v5}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-boolean v5, v3, Liw;->D:Z

    .line 308
    .line 309
    if-eqz v5, :cond_f

    .line 310
    .line 311
    invoke-static {v2}, Lxw;->F(I)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-eqz v2, :cond_e

    .line 316
    .line 317
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    :cond_e
    invoke-virtual {v0, v8, v1, p0}, Ltn;->a(IILex;)V

    .line 321
    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_f
    invoke-static {v2}, Lxw;->F(I)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-eqz v5, :cond_10

    .line 329
    .line 330
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    :cond_10
    invoke-virtual {v0, v2, v1, p0}, Ltn;->a(IILex;)V

    .line 334
    .line 335
    .line 336
    :cond_11
    :goto_2
    iget-object v0, v3, Liw;->w:Lxw;

    .line 337
    .line 338
    if-eqz v0, :cond_12

    .line 339
    .line 340
    iget-boolean v2, v3, Liw;->p:Z

    .line 341
    .line 342
    if-eqz v2, :cond_12

    .line 343
    .line 344
    invoke-static {v3}, Lxw;->G(Liw;)Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    if-eqz v2, :cond_12

    .line 349
    .line 350
    iput-boolean v1, v0, Lxw;->D:Z

    .line 351
    .line 352
    :cond_12
    iput-boolean v4, v3, Liw;->N:Z

    .line 353
    .line 354
    iget-object v0, v3, Liw;->y:Lxw;

    .line 355
    .line 356
    invoke-virtual {v0}, Lxw;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    .line 358
    .line 359
    :cond_13
    iput-boolean v4, p0, Lex;->d:Z

    .line 360
    .line 361
    return-void

    .line 362
    :goto_3
    iput-boolean v4, p0, Lex;->d:Z

    .line 363
    .line 364
    throw v0

    .line 365
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

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Liw;->y:Lxw;

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    invoke-virtual {v0, v2}, Lxw;->t(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Liw;->J:Landroid/view/View;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v1, Liw;->T:Ljx;

    .line 24
    .line 25
    sget-object v2, Lt50;->ON_PAUSE:Lt50;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljx;->b(Lt50;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v0, v1, Liw;->S:Ld60;

    .line 31
    .line 32
    sget-object v2, Lt50;->ON_PAUSE:Lt50;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ld60;->d(Lt50;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    iput v0, v1, Liw;->f:I

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, v1, Liw;->H:Z

    .line 42
    .line 43
    iget-object v0, p0, Lex;->a:Ll92;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-virtual {v0, v1}, Ll92;->m(Z)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lex;->c:Liw;

    .line 2
    .line 3
    iget-object v1, v0, Liw;->g:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Liw;->g:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "android:view_state"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, v0, Liw;->h:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object p1, v0, Liw;->g:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v1, "android:view_registry_state"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, v0, Liw;->i:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object p1, v0, Liw;->g:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v1, "android:target_state"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Liw;->m:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Liw;->g:Landroid/os/Bundle;

    .line 44
    .line 45
    const-string v1, "android:target_req_state"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, v0, Liw;->n:I

    .line 53
    .line 54
    :cond_1
    iget-object p1, v0, Liw;->g:Landroid/os/Bundle;

    .line 55
    .line 56
    const-string v1, "android:user_visible_hint"

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput-boolean p1, v0, Liw;->L:Z

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iput-boolean v2, v0, Liw;->K:Z

    .line 68
    .line 69
    :cond_2
    :goto_0
    return-void
.end method

.method public final n()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Liw;->M:Lhw;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    move-object v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v0, v0, Lhw;->k:Landroid/view/View;

    .line 21
    .line 22
    :goto_0
    if-eqz v0, :cond_4

    .line 23
    .line 24
    iget-object v3, v1, Liw;->J:Landroid/view/View;

    .line 25
    .line 26
    if-ne v0, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_1
    if-eqz v3, :cond_4

    .line 34
    .line 35
    iget-object v4, v1, Liw;->J:Landroid/view/View;

    .line 36
    .line 37
    if-ne v3, v4, :cond_3

    .line 38
    .line 39
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-static {v3}, Lxw;->F(I)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    iget-object v0, v1, Liw;->J:Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    :goto_3
    invoke-virtual {v1}, Liw;->f()Lhw;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v2, v0, Lhw;->k:Landroid/view/View;

    .line 75
    .line 76
    iget-object v0, v1, Liw;->y:Lxw;

    .line 77
    .line 78
    invoke-virtual {v0}, Lxw;->L()V

    .line 79
    .line 80
    .line 81
    iget-object v0, v1, Liw;->y:Lxw;

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {v0, v3}, Lxw;->y(Z)Z

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    iput v0, v1, Liw;->f:I

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    iput-boolean v3, v1, Liw;->H:Z

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    iput-boolean v4, v1, Liw;->H:Z

    .line 95
    .line 96
    iget-boolean v4, v1, Liw;->H:Z

    .line 97
    .line 98
    if-eqz v4, :cond_6

    .line 99
    .line 100
    iget-object v4, v1, Liw;->S:Ld60;

    .line 101
    .line 102
    sget-object v5, Lt50;->ON_RESUME:Lt50;

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ld60;->d(Lt50;)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v1, Liw;->J:Landroid/view/View;

    .line 108
    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    iget-object v4, v1, Liw;->T:Ljx;

    .line 112
    .line 113
    iget-object v4, v4, Ljx;->h:Ld60;

    .line 114
    .line 115
    invoke-virtual {v4, v5}, Ld60;->d(Lt50;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    iget-object v4, v1, Liw;->y:Lxw;

    .line 119
    .line 120
    iput-boolean v3, v4, Lxw;->E:Z

    .line 121
    .line 122
    iput-boolean v3, v4, Lxw;->F:Z

    .line 123
    .line 124
    iget-object v5, v4, Lxw;->L:Lax;

    .line 125
    .line 126
    iput-boolean v3, v5, Lax;->g:Z

    .line 127
    .line 128
    invoke-virtual {v4, v0}, Lxw;->t(I)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lex;->a:Ll92;

    .line 132
    .line 133
    invoke-virtual {v0, v3}, Ll92;->p(Z)V

    .line 134
    .line 135
    .line 136
    iput-object v2, v1, Liw;->g:Landroid/os/Bundle;

    .line 137
    .line 138
    iput-object v2, v1, Liw;->h:Landroid/util/SparseArray;

    .line 139
    .line 140
    iput-object v2, v1, Liw;->i:Landroid/os/Bundle;

    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    new-instance v0, Lbz0;

    .line 144
    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v3, "Fragment "

    .line 148
    .line 149
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v1, " did not call through to super.onResume()"

    .line 156
    .line 157
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lex;->c:Liw;

    .line 2
    .line 3
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x2

    .line 9
    invoke-static {v1}, Lxw;->F(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Liw;->J:Landroid/view/View;

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, Liw;->J:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-lez v2, :cond_2

    .line 38
    .line 39
    iput-object v1, v0, Liw;->h:Landroid/util/SparseArray;

    .line 40
    .line 41
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, Liw;->T:Ljx;

    .line 47
    .line 48
    iget-object v2, v2, Ljx;->i:Lgw3;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Lgw3;->y(Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    iput-object v1, v0, Liw;->i:Landroid/os/Bundle;

    .line 60
    .line 61
    :cond_3
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Liw;->y:Lxw;

    .line 14
    .line 15
    invoke-virtual {v0}, Lxw;->L()V

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Liw;->y:Lxw;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v2}, Lxw;->y(Z)Z

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x5

    .line 25
    iput v0, v1, Liw;->f:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-boolean v2, v1, Liw;->H:Z

    .line 29
    .line 30
    invoke-virtual {v1}, Liw;->A()V

    .line 31
    .line 32
    .line 33
    iget-boolean v3, v1, Liw;->H:Z

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    iget-object v3, v1, Liw;->S:Ld60;

    .line 38
    .line 39
    sget-object v4, Lt50;->ON_START:Lt50;

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ld60;->d(Lt50;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v1, Liw;->J:Landroid/view/View;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v3, v1, Liw;->T:Ljx;

    .line 49
    .line 50
    iget-object v3, v3, Ljx;->h:Ld60;

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ld60;->d(Lt50;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v1, v1, Liw;->y:Lxw;

    .line 56
    .line 57
    iput-boolean v2, v1, Lxw;->E:Z

    .line 58
    .line 59
    iput-boolean v2, v1, Lxw;->F:Z

    .line 60
    .line 61
    iget-object v3, v1, Lxw;->L:Lax;

    .line 62
    .line 63
    iput-boolean v2, v3, Lax;->g:Z

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Lxw;->t(I)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lex;->a:Ll92;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ll92;->r(Z)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    new-instance v0, Lbz0;

    .line 75
    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v3, "Fragment "

    .line 79
    .line 80
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, " did not call through to super.onStart()"

    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0
.end method

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lex;->c:Liw;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Liw;->y:Lxw;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    iput-boolean v2, v0, Lxw;->F:Z

    .line 17
    .line 18
    iget-object v3, v0, Lxw;->L:Lax;

    .line 19
    .line 20
    iput-boolean v2, v3, Lax;->g:Z

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-virtual {v0, v2}, Lxw;->t(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Liw;->J:Landroid/view/View;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, v1, Liw;->T:Ljx;

    .line 31
    .line 32
    sget-object v3, Lt50;->ON_STOP:Lt50;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljx;->b(Lt50;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, v1, Liw;->S:Ld60;

    .line 38
    .line 39
    sget-object v3, Lt50;->ON_STOP:Lt50;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ld60;->d(Lt50;)V

    .line 42
    .line 43
    .line 44
    iput v2, v1, Liw;->f:I

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    iput-boolean v0, v1, Liw;->H:Z

    .line 48
    .line 49
    invoke-virtual {v1}, Liw;->B()V

    .line 50
    .line 51
    .line 52
    iget-boolean v2, v1, Liw;->H:Z

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v1, p0, Lex;->a:Ll92;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ll92;->s(Z)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    new-instance v0, Lbz0;

    .line 63
    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v3, "Fragment "

    .line 67
    .line 68
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, " did not call through to super.onStop()"

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0
.end method
