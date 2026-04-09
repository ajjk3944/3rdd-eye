.class public final Lo7;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:Z

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo7;->d:Ljava/lang/Object;

    new-instance v0, Landroid/os/Bundle;

    .line 2
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lo7;->e:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo7;->f:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    .line 4
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo7;->g:Ljava/lang/Object;

    new-instance v0, Landroid/os/Bundle;

    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lo7;->h:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo7;->i:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo7;->k:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lo7;->a:I

    const v0, 0xea60

    iput v0, p0, Lo7;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lo7;->a:I

    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lo7;->c:I

    .line 11
    iput-object p1, p0, Lo7;->d:Ljava/lang/Object;

    .line 12
    new-instance v0, Lx7;

    invoke-direct {v0, p1}, Lx7;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lo7;->l:Ljava/lang/Object;

    return-void
.end method

.method public static c(Landroid/content/Context;Ll6;I)Lgc3;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Ll6;->a:Lzp0;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lzp0;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lgc3;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Lgc3;->b:Z

    .line 18
    .line 19
    iput-object p0, p1, Lgc3;->c:Ljava/lang/Object;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method

.method public static h(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-ge v0, v1, :cond_d

    .line 6
    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Lir;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1}, Lir;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget p2, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 29
    .line 30
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 31
    .line 32
    if-le p2, v0, :cond_2

    .line 33
    .line 34
    move v1, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v1, p2

    .line 37
    :goto_0
    if-le p2, v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move p2, v0

    .line 41
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    if-ltz v1, :cond_c

    .line 48
    .line 49
    if-le p2, v0, :cond_4

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_4
    iget v4, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 54
    .line 55
    and-int/lit16 v4, v4, 0xfff

    .line 56
    .line 57
    const/16 v5, 0x81

    .line 58
    .line 59
    if-eq v4, v5, :cond_b

    .line 60
    .line 61
    const/16 v5, 0xe1

    .line 62
    .line 63
    if-eq v4, v5, :cond_b

    .line 64
    .line 65
    const/16 v5, 0x12

    .line 66
    .line 67
    if-ne v4, v5, :cond_5

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_5
    const/16 v3, 0x800

    .line 72
    .line 73
    if-gt v0, v3, :cond_6

    .line 74
    .line 75
    invoke-static {p0, p1, v1, p2}, Lob1;->r(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    sub-int v0, p2, v1

    .line 80
    .line 81
    const/16 v3, 0x400

    .line 82
    .line 83
    if-le v0, v3, :cond_7

    .line 84
    .line 85
    move v3, v2

    .line 86
    goto :goto_2

    .line 87
    :cond_7
    move v3, v0

    .line 88
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v4, p2

    .line 93
    rsub-int v5, v3, 0x800

    .line 94
    .line 95
    const-wide v6, 0x3fe999999999999aL    # 0.8

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    int-to-double v8, v5

    .line 101
    mul-double/2addr v8, v6

    .line 102
    double-to-int v6, v8

    .line 103
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    sub-int v6, v5, v6

    .line 108
    .line 109
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    sub-int/2addr v5, v4

    .line 114
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    sub-int/2addr v1, v5

    .line 119
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_8

    .line 128
    .line 129
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    add-int/lit8 v5, v5, -0x1

    .line 132
    .line 133
    :cond_8
    add-int v6, p2, v4

    .line 134
    .line 135
    const/4 v7, 0x1

    .line 136
    sub-int/2addr v6, v7

    .line 137
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_9

    .line 146
    .line 147
    add-int/lit8 v4, v4, -0x1

    .line 148
    .line 149
    :cond_9
    add-int v6, v5, v3

    .line 150
    .line 151
    add-int v8, v6, v4

    .line 152
    .line 153
    if-eq v3, v0, :cond_a

    .line 154
    .line 155
    add-int v0, v1, v5

    .line 156
    .line 157
    invoke-interface {p1, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    add-int/2addr v4, p2

    .line 162
    invoke-interface {p1, p2, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const/4 p2, 0x2

    .line 167
    new-array p2, p2, [Ljava/lang/CharSequence;

    .line 168
    .line 169
    aput-object v0, p2, v2

    .line 170
    .line 171
    aput-object p1, p2, v7

    .line 172
    .line 173
    invoke-static {p2}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    goto :goto_3

    .line 178
    :cond_a
    add-int/2addr v8, v1

    .line 179
    invoke-interface {p1, v1, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_3
    invoke-static {p0, p1, v5, v6}, Lob1;->r(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_b
    :goto_4
    invoke-static {p0, v3, v2, v2}, Lob1;->r(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_c
    :goto_5
    invoke-static {p0, v3, v2, v2}, Lob1;->r(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 192
    .line 193
    .line 194
    :cond_d
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;Lgc3;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lo7;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1, p2, v0}, Ll6;->e(Landroid/graphics/drawable/Drawable;Lgc3;[I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lo7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v1, p0, Lo7;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lgc3;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lo7;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lgc3;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lo7;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lgc3;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lo7;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lgc3;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    aget-object v4, v1, v3

    .line 36
    .line 37
    iget-object v5, p0, Lo7;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Lgc3;

    .line 40
    .line 41
    invoke-virtual {p0, v4, v5}, Lo7;->a(Landroid/graphics/drawable/Drawable;Lgc3;)V

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    aget-object v4, v1, v4

    .line 46
    .line 47
    iget-object v5, p0, Lo7;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Lgc3;

    .line 50
    .line 51
    invoke-virtual {p0, v4, v5}, Lo7;->a(Landroid/graphics/drawable/Drawable;Lgc3;)V

    .line 52
    .line 53
    .line 54
    aget-object v4, v1, v2

    .line 55
    .line 56
    iget-object v5, p0, Lo7;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Lgc3;

    .line 59
    .line 60
    invoke-virtual {p0, v4, v5}, Lo7;->a(Landroid/graphics/drawable/Drawable;Lgc3;)V

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x3

    .line 64
    aget-object v1, v1, v4

    .line 65
    .line 66
    iget-object v4, p0, Lo7;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Lgc3;

    .line 69
    .line 70
    invoke-virtual {p0, v1, v4}, Lo7;->a(Landroid/graphics/drawable/Drawable;Lgc3;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object v1, p0, Lo7;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lgc3;

    .line 76
    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    iget-object v1, p0, Lo7;->j:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lgc3;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    return-void

    .line 87
    :cond_3
    :goto_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    aget-object v1, v0, v3

    .line 92
    .line 93
    iget-object v3, p0, Lo7;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Lgc3;

    .line 96
    .line 97
    invoke-virtual {p0, v1, v3}, Lo7;->a(Landroid/graphics/drawable/Drawable;Lgc3;)V

    .line 98
    .line 99
    .line 100
    aget-object v0, v0, v2

    .line 101
    .line 102
    iget-object v1, p0, Lo7;->j:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lgc3;

    .line 105
    .line 106
    invoke-virtual {p0, v0, v1}, Lo7;->a(Landroid/graphics/drawable/Drawable;Lgc3;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public d()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgc3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lgc3;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgc3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lgc3;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public f(Landroid/util/AttributeSet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    iget-object v1, v0, Lo7;->l:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v7, v1

    .line 10
    check-cast v7, Lx7;

    .line 11
    .line 12
    iget-object v1, v0, Lo7;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    invoke-static {}, Ll6;->a()Ll6;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    sget-object v3, Lhn0;->h:[I

    .line 25
    .line 26
    invoke-static {v8, v4, v3, v6}, Lxb4;->r(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lxb4;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v5, v10, Lxb4;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Landroid/content/res/TypedArray;

    .line 37
    .line 38
    invoke-static/range {v1 .. v6}, Le61;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 39
    .line 40
    .line 41
    move-object v11, v1

    .line 42
    iget-object v1, v10, Lxb4;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/content/res/TypedArray;

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, -0x1

    .line 48
    invoke-virtual {v1, v12, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v14, 0x3

    .line 53
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-virtual {v1, v14, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v8, v9, v3}, Lo7;->c(Landroid/content/Context;Ll6;I)Lgc3;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput-object v3, v0, Lo7;->e:Ljava/lang/Object;

    .line 68
    .line 69
    :cond_0
    const/4 v15, 0x1

    .line 70
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    invoke-virtual {v1, v15, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {v8, v9, v3}, Lo7;->c(Landroid/content/Context;Ll6;I)Lgc3;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iput-object v3, v0, Lo7;->f:Ljava/lang/Object;

    .line 85
    .line 86
    :cond_1
    const/4 v3, 0x4

    .line 87
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    invoke-virtual {v1, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-static {v8, v9, v5}, Lo7;->c(Landroid/content/Context;Ll6;I)Lgc3;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iput-object v5, v0, Lo7;->g:Ljava/lang/Object;

    .line 102
    .line 103
    :cond_2
    const/4 v5, 0x2

    .line 104
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 105
    .line 106
    .line 107
    move-result v16

    .line 108
    if-eqz v16, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1, v5, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-static {v8, v9, v3}, Lo7;->c(Landroid/content/Context;Ll6;I)Lgc3;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    iput-object v3, v0, Lo7;->h:Ljava/lang/Object;

    .line 119
    .line 120
    :cond_3
    const/4 v3, 0x5

    .line 121
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 122
    .line 123
    .line 124
    move-result v17

    .line 125
    if-eqz v17, :cond_4

    .line 126
    .line 127
    invoke-virtual {v1, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-static {v8, v9, v5}, Lo7;->c(Landroid/content/Context;Ll6;I)Lgc3;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iput-object v5, v0, Lo7;->i:Ljava/lang/Object;

    .line 136
    .line 137
    :cond_4
    const/4 v5, 0x6

    .line 138
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 139
    .line 140
    .line 141
    move-result v18

    .line 142
    if-eqz v18, :cond_5

    .line 143
    .line 144
    invoke-virtual {v1, v5, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v8, v9, v1}, Lo7;->c(Landroid/content/Context;Ll6;I)Lgc3;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iput-object v1, v0, Lo7;->j:Ljava/lang/Object;

    .line 153
    .line 154
    :cond_5
    invoke-virtual {v10}, Lxb4;->z()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 162
    .line 163
    sget-object v10, Lhn0;->x:[I

    .line 164
    .line 165
    const/16 v3, 0xe

    .line 166
    .line 167
    const/16 v15, 0xf

    .line 168
    .line 169
    if-eq v2, v13, :cond_9

    .line 170
    .line 171
    new-instance v5, Lxb4;

    .line 172
    .line 173
    invoke-virtual {v8, v2, v10}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v14, 0xa

    .line 178
    .line 179
    invoke-direct {v5, v8, v2, v14}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    if-nez v1, :cond_6

    .line 183
    .line 184
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    if-eqz v14, :cond_6

    .line 189
    .line 190
    invoke-virtual {v2, v3, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    const/16 v22, 0x1

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_6
    move v14, v12

    .line 198
    move/from16 v22, v14

    .line 199
    .line 200
    :goto_0
    invoke-virtual {v0, v8, v5}, Lo7;->n(Landroid/content/Context;Lxb4;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 204
    .line 205
    .line 206
    move-result v23

    .line 207
    if-eqz v23, :cond_7

    .line 208
    .line 209
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v23

    .line 213
    :goto_1
    const/16 v13, 0xd

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_7
    const/16 v23, 0x0

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :goto_2
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 220
    .line 221
    .line 222
    move-result v21

    .line 223
    if-eqz v21, :cond_8

    .line 224
    .line 225
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    goto :goto_3

    .line 230
    :cond_8
    const/4 v2, 0x0

    .line 231
    :goto_3
    invoke-virtual {v5}, Lxb4;->z()V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_9
    move v14, v12

    .line 236
    move/from16 v22, v14

    .line 237
    .line 238
    const/4 v2, 0x0

    .line 239
    const/16 v23, 0x0

    .line 240
    .line 241
    :goto_4
    new-instance v5, Lxb4;

    .line 242
    .line 243
    invoke-virtual {v8, v4, v10, v6, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    const/16 v13, 0xa

    .line 248
    .line 249
    invoke-direct {v5, v8, v10, v13}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    if-nez v1, :cond_a

    .line 253
    .line 254
    invoke-virtual {v10, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    if-eqz v13, :cond_a

    .line 259
    .line 260
    invoke-virtual {v10, v3, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    const/16 v22, 0x1

    .line 265
    .line 266
    :cond_a
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 267
    .line 268
    invoke-virtual {v10, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    if-eqz v13, :cond_b

    .line 273
    .line 274
    invoke-virtual {v10, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v23

    .line 278
    :cond_b
    const/16 v13, 0xd

    .line 279
    .line 280
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 281
    .line 282
    .line 283
    move-result v21

    .line 284
    if-eqz v21, :cond_c

    .line 285
    .line 286
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    :cond_c
    const/16 v13, 0x1c

    .line 291
    .line 292
    if-lt v3, v13, :cond_d

    .line 293
    .line 294
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_d

    .line 299
    .line 300
    const/4 v3, -0x1

    .line 301
    invoke-virtual {v10, v12, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-nez v10, :cond_d

    .line 306
    .line 307
    const/4 v3, 0x0

    .line 308
    invoke-virtual {v11, v12, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 309
    .line 310
    .line 311
    :cond_d
    invoke-virtual {v0, v8, v5}, Lo7;->n(Landroid/content/Context;Lxb4;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5}, Lxb4;->z()V

    .line 315
    .line 316
    .line 317
    if-nez v1, :cond_e

    .line 318
    .line 319
    if-eqz v22, :cond_e

    .line 320
    .line 321
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 322
    .line 323
    .line 324
    :cond_e
    iget-object v1, v0, Lo7;->m:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v1, Landroid/graphics/Typeface;

    .line 327
    .line 328
    if-eqz v1, :cond_10

    .line 329
    .line 330
    iget v3, v0, Lo7;->c:I

    .line 331
    .line 332
    const/4 v5, -0x1

    .line 333
    if-ne v3, v5, :cond_f

    .line 334
    .line 335
    iget v3, v0, Lo7;->a:I

    .line 336
    .line 337
    invoke-virtual {v11, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_f
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 342
    .line 343
    .line 344
    :cond_10
    :goto_5
    if-eqz v2, :cond_11

    .line 345
    .line 346
    invoke-static {v11, v2}, Lm7;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 347
    .line 348
    .line 349
    :cond_11
    if-eqz v23, :cond_12

    .line 350
    .line 351
    invoke-static/range {v23 .. v23}, Ll7;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-static {v11, v1}, Ll7;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 356
    .line 357
    .line 358
    :cond_12
    iget-object v10, v7, Lx7;->j:Landroid/content/Context;

    .line 359
    .line 360
    sget-object v3, Lhn0;->i:[I

    .line 361
    .line 362
    invoke-virtual {v10, v4, v3, v6, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    iget-object v1, v7, Lx7;->i:Landroid/widget/TextView;

    .line 367
    .line 368
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const/4 v13, 0x2

    .line 373
    const/4 v14, 0x4

    .line 374
    const/4 v15, 0x5

    .line 375
    invoke-static/range {v1 .. v6}, Le61;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_13

    .line 383
    .line 384
    invoke-virtual {v5, v15, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    iput v1, v7, Lx7;->a:I

    .line 389
    .line 390
    :cond_13
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    const/high16 v2, -0x40800000    # -1.0f

    .line 395
    .line 396
    if-eqz v1, :cond_14

    .line 397
    .line 398
    invoke-virtual {v5, v14, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    goto :goto_6

    .line 403
    :cond_14
    move v1, v2

    .line 404
    :goto_6
    invoke-virtual {v5, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    if-eqz v6, :cond_15

    .line 409
    .line 410
    invoke-virtual {v5, v13, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    :goto_7
    const/4 v14, 0x1

    .line 415
    goto :goto_8

    .line 416
    :cond_15
    move v6, v2

    .line 417
    goto :goto_7

    .line 418
    :goto_8
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 419
    .line 420
    .line 421
    move-result v17

    .line 422
    if-eqz v17, :cond_16

    .line 423
    .line 424
    invoke-virtual {v5, v14, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 425
    .line 426
    .line 427
    move-result v17

    .line 428
    :goto_9
    const/4 v14, 0x3

    .line 429
    goto :goto_a

    .line 430
    :cond_16
    move/from16 v17, v2

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :goto_a
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 434
    .line 435
    .line 436
    move-result v18

    .line 437
    move/from16 p2, v2

    .line 438
    .line 439
    if-eqz v18, :cond_19

    .line 440
    .line 441
    invoke-virtual {v5, v14, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-lez v2, :cond_19

    .line 446
    .line 447
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 448
    .line 449
    .line 450
    move-result-object v14

    .line 451
    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->length()I

    .line 456
    .line 457
    .line 458
    move-result v14

    .line 459
    new-array v15, v14, [I

    .line 460
    .line 461
    if-lez v14, :cond_18

    .line 462
    .line 463
    :goto_b
    if-ge v12, v14, :cond_17

    .line 464
    .line 465
    const/4 v13, -0x1

    .line 466
    invoke-virtual {v2, v12, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 467
    .line 468
    .line 469
    move-result v24

    .line 470
    aput v24, v15, v12

    .line 471
    .line 472
    add-int/lit8 v12, v12, 0x1

    .line 473
    .line 474
    const/4 v13, 0x2

    .line 475
    goto :goto_b

    .line 476
    :cond_17
    invoke-static {v15}, Lx7;->b([I)[I

    .line 477
    .line 478
    .line 479
    move-result-object v12

    .line 480
    iput-object v12, v7, Lx7;->f:[I

    .line 481
    .line 482
    invoke-virtual {v7}, Lx7;->h()Z

    .line 483
    .line 484
    .line 485
    :cond_18
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 486
    .line 487
    .line 488
    :cond_19
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v7}, Lx7;->i()Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_1e

    .line 496
    .line 497
    iget v2, v7, Lx7;->a:I

    .line 498
    .line 499
    const/4 v14, 0x1

    .line 500
    if-ne v2, v14, :cond_1f

    .line 501
    .line 502
    iget-boolean v2, v7, Lx7;->g:Z

    .line 503
    .line 504
    if-nez v2, :cond_1d

    .line 505
    .line 506
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    cmpl-float v5, v6, p2

    .line 515
    .line 516
    if-nez v5, :cond_1a

    .line 517
    .line 518
    const/high16 v5, 0x41400000    # 12.0f

    .line 519
    .line 520
    const/4 v13, 0x2

    .line 521
    invoke-static {v13, v5, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    goto :goto_c

    .line 526
    :cond_1a
    const/4 v13, 0x2

    .line 527
    :goto_c
    cmpl-float v5, v17, p2

    .line 528
    .line 529
    if-nez v5, :cond_1b

    .line 530
    .line 531
    const/high16 v5, 0x42e00000    # 112.0f

    .line 532
    .line 533
    invoke-static {v13, v5, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 534
    .line 535
    .line 536
    move-result v17

    .line 537
    :cond_1b
    move/from16 v2, v17

    .line 538
    .line 539
    cmpl-float v5, v1, p2

    .line 540
    .line 541
    if-nez v5, :cond_1c

    .line 542
    .line 543
    const/high16 v1, 0x3f800000    # 1.0f

    .line 544
    .line 545
    :cond_1c
    invoke-virtual {v7, v6, v2, v1}, Lx7;->j(FFF)V

    .line 546
    .line 547
    .line 548
    :cond_1d
    invoke-virtual {v7}, Lx7;->g()Z

    .line 549
    .line 550
    .line 551
    goto :goto_d

    .line 552
    :cond_1e
    const/4 v1, 0x0

    .line 553
    iput v1, v7, Lx7;->a:I

    .line 554
    .line 555
    :cond_1f
    :goto_d
    sget-boolean v1, Lg71;->c:Z

    .line 556
    .line 557
    if-eqz v1, :cond_21

    .line 558
    .line 559
    iget v1, v7, Lx7;->a:I

    .line 560
    .line 561
    if-eqz v1, :cond_21

    .line 562
    .line 563
    iget-object v1, v7, Lx7;->f:[I

    .line 564
    .line 565
    array-length v2, v1

    .line 566
    if-lez v2, :cond_21

    .line 567
    .line 568
    invoke-static {v11}, Lm7;->a(Landroid/widget/TextView;)I

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    int-to-float v2, v2

    .line 573
    cmpl-float v2, v2, p2

    .line 574
    .line 575
    if-eqz v2, :cond_20

    .line 576
    .line 577
    iget v1, v7, Lx7;->d:F

    .line 578
    .line 579
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    iget v2, v7, Lx7;->e:F

    .line 584
    .line 585
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    iget v5, v7, Lx7;->c:F

    .line 590
    .line 591
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    const/4 v6, 0x0

    .line 596
    invoke-static {v11, v1, v2, v5, v6}, Lm7;->b(Landroid/widget/TextView;IIII)V

    .line 597
    .line 598
    .line 599
    goto :goto_e

    .line 600
    :cond_20
    const/4 v6, 0x0

    .line 601
    invoke-static {v11, v1, v6}, Lm7;->c(Landroid/widget/TextView;[II)V

    .line 602
    .line 603
    .line 604
    :cond_21
    :goto_e
    invoke-virtual {v8, v4, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    const/16 v2, 0x8

    .line 609
    .line 610
    const/4 v13, -0x1

    .line 611
    invoke-virtual {v1, v2, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-eq v2, v13, :cond_22

    .line 616
    .line 617
    invoke-virtual {v9, v8, v2}, Ll6;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    :goto_f
    const/16 v3, 0xd

    .line 622
    .line 623
    goto :goto_10

    .line 624
    :cond_22
    const/4 v2, 0x0

    .line 625
    goto :goto_f

    .line 626
    :goto_10
    invoke-virtual {v1, v3, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    if-eq v3, v13, :cond_23

    .line 631
    .line 632
    invoke-virtual {v9, v8, v3}, Ll6;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    goto :goto_11

    .line 637
    :cond_23
    const/4 v3, 0x0

    .line 638
    :goto_11
    const/16 v4, 0x9

    .line 639
    .line 640
    invoke-virtual {v1, v4, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    if-eq v4, v13, :cond_24

    .line 645
    .line 646
    invoke-virtual {v9, v8, v4}, Ll6;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    :goto_12
    const/4 v5, 0x6

    .line 651
    goto :goto_13

    .line 652
    :cond_24
    const/4 v4, 0x0

    .line 653
    goto :goto_12

    .line 654
    :goto_13
    invoke-virtual {v1, v5, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    if-eq v5, v13, :cond_25

    .line 659
    .line 660
    invoke-virtual {v9, v8, v5}, Ll6;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    goto :goto_14

    .line 665
    :cond_25
    const/4 v5, 0x0

    .line 666
    :goto_14
    const/16 v6, 0xa

    .line 667
    .line 668
    invoke-virtual {v1, v6, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    if-eq v6, v13, :cond_26

    .line 673
    .line 674
    invoke-virtual {v9, v8, v6}, Ll6;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 675
    .line 676
    .line 677
    move-result-object v6

    .line 678
    goto :goto_15

    .line 679
    :cond_26
    const/4 v6, 0x0

    .line 680
    :goto_15
    const/4 v7, 0x7

    .line 681
    invoke-virtual {v1, v7, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    if-eq v7, v13, :cond_27

    .line 686
    .line 687
    invoke-virtual {v9, v8, v7}, Ll6;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 688
    .line 689
    .line 690
    move-result-object v7

    .line 691
    goto :goto_16

    .line 692
    :cond_27
    const/4 v7, 0x0

    .line 693
    :goto_16
    if-nez v6, :cond_32

    .line 694
    .line 695
    if-eqz v7, :cond_28

    .line 696
    .line 697
    goto :goto_1f

    .line 698
    :cond_28
    if-nez v2, :cond_29

    .line 699
    .line 700
    if-nez v3, :cond_29

    .line 701
    .line 702
    if-nez v4, :cond_29

    .line 703
    .line 704
    if-eqz v5, :cond_37

    .line 705
    .line 706
    :cond_29
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 707
    .line 708
    .line 709
    move-result-object v6

    .line 710
    const/16 v22, 0x0

    .line 711
    .line 712
    aget-object v7, v6, v22

    .line 713
    .line 714
    if-nez v7, :cond_2a

    .line 715
    .line 716
    const/16 v23, 0x2

    .line 717
    .line 718
    aget-object v9, v6, v23

    .line 719
    .line 720
    if-eqz v9, :cond_2b

    .line 721
    .line 722
    :cond_2a
    const/16 v19, 0x3

    .line 723
    .line 724
    goto :goto_1b

    .line 725
    :cond_2b
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 726
    .line 727
    .line 728
    move-result-object v6

    .line 729
    if-eqz v2, :cond_2c

    .line 730
    .line 731
    goto :goto_17

    .line 732
    :cond_2c
    aget-object v2, v6, v22

    .line 733
    .line 734
    :goto_17
    if-eqz v3, :cond_2d

    .line 735
    .line 736
    goto :goto_18

    .line 737
    :cond_2d
    const/16 v20, 0x1

    .line 738
    .line 739
    aget-object v3, v6, v20

    .line 740
    .line 741
    :goto_18
    if-eqz v4, :cond_2e

    .line 742
    .line 743
    goto :goto_19

    .line 744
    :cond_2e
    const/16 v23, 0x2

    .line 745
    .line 746
    aget-object v4, v6, v23

    .line 747
    .line 748
    :goto_19
    if-eqz v5, :cond_2f

    .line 749
    .line 750
    goto :goto_1a

    .line 751
    :cond_2f
    const/16 v19, 0x3

    .line 752
    .line 753
    aget-object v5, v6, v19

    .line 754
    .line 755
    :goto_1a
    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 756
    .line 757
    .line 758
    goto :goto_24

    .line 759
    :goto_1b
    if-eqz v3, :cond_30

    .line 760
    .line 761
    goto :goto_1c

    .line 762
    :cond_30
    const/16 v20, 0x1

    .line 763
    .line 764
    aget-object v3, v6, v20

    .line 765
    .line 766
    :goto_1c
    if-eqz v5, :cond_31

    .line 767
    .line 768
    :goto_1d
    const/16 v23, 0x2

    .line 769
    .line 770
    goto :goto_1e

    .line 771
    :cond_31
    aget-object v5, v6, v19

    .line 772
    .line 773
    goto :goto_1d

    .line 774
    :goto_1e
    aget-object v2, v6, v23

    .line 775
    .line 776
    invoke-virtual {v11, v7, v3, v2, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 777
    .line 778
    .line 779
    goto :goto_24

    .line 780
    :cond_32
    :goto_1f
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    if-eqz v6, :cond_33

    .line 785
    .line 786
    goto :goto_20

    .line 787
    :cond_33
    const/16 v22, 0x0

    .line 788
    .line 789
    aget-object v6, v2, v22

    .line 790
    .line 791
    :goto_20
    if-eqz v3, :cond_34

    .line 792
    .line 793
    goto :goto_21

    .line 794
    :cond_34
    const/16 v20, 0x1

    .line 795
    .line 796
    aget-object v3, v2, v20

    .line 797
    .line 798
    :goto_21
    if-eqz v7, :cond_35

    .line 799
    .line 800
    goto :goto_22

    .line 801
    :cond_35
    const/16 v23, 0x2

    .line 802
    .line 803
    aget-object v7, v2, v23

    .line 804
    .line 805
    :goto_22
    if-eqz v5, :cond_36

    .line 806
    .line 807
    goto :goto_23

    .line 808
    :cond_36
    const/16 v19, 0x3

    .line 809
    .line 810
    aget-object v5, v2, v19

    .line 811
    .line 812
    :goto_23
    invoke-virtual {v11, v6, v3, v7, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 813
    .line 814
    .line 815
    :cond_37
    :goto_24
    const/16 v2, 0xb

    .line 816
    .line 817
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 818
    .line 819
    .line 820
    move-result v3

    .line 821
    if-eqz v3, :cond_39

    .line 822
    .line 823
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    if-eqz v3, :cond_38

    .line 828
    .line 829
    const/4 v6, 0x0

    .line 830
    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    if-eqz v3, :cond_38

    .line 835
    .line 836
    invoke-static {v8, v3}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    if-eqz v3, :cond_38

    .line 841
    .line 842
    goto :goto_25

    .line 843
    :cond_38
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    :goto_25
    invoke-static {v11, v3}, Lg11;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 848
    .line 849
    .line 850
    :cond_39
    const/16 v2, 0xc

    .line 851
    .line 852
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    const/4 v13, -0x1

    .line 857
    if-eqz v3, :cond_3a

    .line 858
    .line 859
    invoke-virtual {v1, v2, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    const/4 v3, 0x0

    .line 864
    invoke-static {v2, v3}, Lyp;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    invoke-static {v11, v2}, Lg11;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 869
    .line 870
    .line 871
    :cond_3a
    const/16 v2, 0xf

    .line 872
    .line 873
    invoke-virtual {v1, v2, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    const/16 v3, 0x12

    .line 878
    .line 879
    invoke-virtual {v1, v3, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    const/16 v4, 0x13

    .line 884
    .line 885
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 886
    .line 887
    .line 888
    move-result v5

    .line 889
    if-eqz v5, :cond_3c

    .line 890
    .line 891
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    if-eqz v5, :cond_3b

    .line 896
    .line 897
    iget v6, v5, Landroid/util/TypedValue;->type:I

    .line 898
    .line 899
    const/4 v15, 0x5

    .line 900
    if-ne v6, v15, :cond_3b

    .line 901
    .line 902
    iget v4, v5, Landroid/util/TypedValue;->data:I

    .line 903
    .line 904
    and-int/lit8 v5, v4, 0xf

    .line 905
    .line 906
    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 907
    .line 908
    .line 909
    move-result v4

    .line 910
    const/4 v13, -0x1

    .line 911
    goto :goto_27

    .line 912
    :cond_3b
    const/4 v13, -0x1

    .line 913
    invoke-virtual {v1, v4, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 914
    .line 915
    .line 916
    move-result v4

    .line 917
    int-to-float v4, v4

    .line 918
    :goto_26
    move v5, v13

    .line 919
    goto :goto_27

    .line 920
    :cond_3c
    const/4 v13, -0x1

    .line 921
    move/from16 v4, p2

    .line 922
    .line 923
    goto :goto_26

    .line 924
    :goto_27
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 925
    .line 926
    .line 927
    if-eq v2, v13, :cond_3d

    .line 928
    .line 929
    invoke-static {v11, v2}, Lou1;->t(Landroid/widget/TextView;I)V

    .line 930
    .line 931
    .line 932
    :cond_3d
    if-eq v3, v13, :cond_3e

    .line 933
    .line 934
    invoke-static {v11, v3}, Lou1;->u(Landroid/widget/TextView;I)V

    .line 935
    .line 936
    .line 937
    :cond_3e
    cmpl-float v1, v4, p2

    .line 938
    .line 939
    if-eqz v1, :cond_41

    .line 940
    .line 941
    if-ne v5, v13, :cond_3f

    .line 942
    .line 943
    float-to-int v1, v4

    .line 944
    invoke-static {v11, v1}, Lou1;->v(Landroid/widget/TextView;I)V

    .line 945
    .line 946
    .line 947
    return-void

    .line 948
    :cond_3f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 949
    .line 950
    const/16 v2, 0x22

    .line 951
    .line 952
    if-lt v1, v2, :cond_40

    .line 953
    .line 954
    invoke-static {v11, v5, v4}, Lj11;->a(Landroid/widget/TextView;IF)V

    .line 955
    .line 956
    .line 957
    return-void

    .line 958
    :cond_40
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-static {v5, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 967
    .line 968
    .line 969
    move-result v1

    .line 970
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 971
    .line 972
    .line 973
    move-result v1

    .line 974
    invoke-static {v11, v1}, Lou1;->v(Landroid/widget/TextView;I)V

    .line 975
    .line 976
    .line 977
    :cond_41
    return-void
.end method

.method public g(Landroid/content/Context;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    new-instance v1, Lxb4;

    .line 6
    .line 7
    sget-object v2, Lhn0;->x:[I

    .line 8
    .line 9
    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/16 v2, 0xa

    .line 14
    .line 15
    invoke-direct {v1, p1, p2, v2}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0xe

    .line 19
    .line 20
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const/4 v2, -0x1

    .line 41
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {v0, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0, p1, v1}, Lo7;->n(Landroid/content/Context;Lxb4;)V

    .line 52
    .line 53
    .line 54
    const/16 p1, 0xd

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    invoke-static {v0, p1}, Lm7;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v1}, Lxb4;->z()V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Landroid/graphics/Typeface;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget p2, p0, Lo7;->a:I

    .line 81
    .line 82
    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method public i(IIII)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo7;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx7;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx7;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lx7;->j:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    int-to-float p1, p1

    .line 22
    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-float p2, p2

    .line 27
    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p3, p3

    .line 32
    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-virtual {v0, p1, p2, p3}, Lx7;->j(FFF)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lx7;->g()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Lx7;->a()V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public j([II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lo7;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx7;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx7;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-lez v1, :cond_3

    .line 14
    .line 15
    new-array v3, v1, [I

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v4, v0, Lx7;->j:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :goto_0
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    aget v5, p1, v2

    .line 37
    .line 38
    int-to-float v5, v5

    .line 39
    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    aput v5, v3, v2

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    invoke-static {v3}, Lx7;->b([I)[I

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iput-object p2, v0, Lx7;->f:[I

    .line 57
    .line 58
    invoke-virtual {v0}, Lx7;->h()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v1, "None of the preset sizes is valid: "

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p2

    .line 89
    :cond_3
    iput-boolean v2, v0, Lx7;->g:Z

    .line 90
    .line 91
    :goto_2
    invoke-virtual {v0}, Lx7;->g()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    invoke-virtual {v0}, Lx7;->a()V

    .line 98
    .line 99
    .line 100
    :cond_4
    return-void
.end method

.method public k(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo7;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx7;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx7;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    iget-object p1, v0, Lx7;->j:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/high16 v1, 0x41400000    # 12.0f

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/high16 v3, 0x42e00000    # 112.0f

    .line 34
    .line 35
    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/high16 v2, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-virtual {v0, v1, p1, v2}, Lx7;->j(FFF)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lx7;->g()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Lx7;->a()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    const-string v1, "Unknown auto-size text type: "

    .line 57
    .line 58
    invoke-static {v1, p1}, Lex0;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_1
    const/4 p1, 0x0

    .line 67
    iput p1, v0, Lx7;->a:I

    .line 68
    .line 69
    const/high16 v1, -0x40800000    # -1.0f

    .line 70
    .line 71
    iput v1, v0, Lx7;->d:F

    .line 72
    .line 73
    iput v1, v0, Lx7;->e:F

    .line 74
    .line 75
    iput v1, v0, Lx7;->c:F

    .line 76
    .line 77
    new-array v1, p1, [I

    .line 78
    .line 79
    iput-object v1, v0, Lx7;->f:[I

    .line 80
    .line 81
    iput-boolean p1, v0, Lx7;->b:Z

    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public l(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgc3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lgc3;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lgc3;

    .line 17
    .line 18
    iput-object p1, v0, Lgc3;->c:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-boolean p1, v0, Lgc3;->b:Z

    .line 26
    .line 27
    iput-object v0, p0, Lo7;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object v0, p0, Lo7;->f:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v0, p0, Lo7;->g:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v0, p0, Lo7;->h:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v0, p0, Lo7;->i:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v0, p0, Lo7;->j:Ljava/lang/Object;

    .line 38
    .line 39
    return-void
.end method

.method public m(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgc3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lgc3;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lo7;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lgc3;

    .line 17
    .line 18
    iput-object p1, v0, Lgc3;->d:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-boolean p1, v0, Lgc3;->a:Z

    .line 26
    .line 27
    iput-object v0, p0, Lo7;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object v0, p0, Lo7;->f:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v0, p0, Lo7;->g:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v0, p0, Lo7;->h:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v0, p0, Lo7;->i:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v0, p0, Lo7;->j:Ljava/lang/Object;

    .line 38
    .line 39
    return-void
.end method

.method public n(Landroid/content/Context;Lxb4;)V
    .locals 11

    .line 1
    iget v0, p0, Lo7;->a:I

    .line 2
    .line 3
    iget-object v1, p2, Lxb4;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lo7;->a:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    const/16 v4, 0x1c

    .line 18
    .line 19
    if-lt v0, v4, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Lo7;->c:I

    .line 28
    .line 29
    if-eq v5, v3, :cond_0

    .line 30
    .line 31
    iget v5, p0, Lo7;->a:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Lo7;->a:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_5

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_e

    .line 60
    .line 61
    iput-boolean v8, p0, Lo7;->b:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 77
    .line 78
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 82
    .line 83
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 87
    .line 88
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    :goto_0
    const/4 v6, 0x0

    .line 92
    iput-object v6, p0, Lo7;->m:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    move v5, v7

    .line 101
    :cond_6
    iget v6, p0, Lo7;->c:I

    .line 102
    .line 103
    iget v7, p0, Lo7;->a:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_b

    .line 110
    .line 111
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    iget-object v10, p0, Lo7;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v10, Landroid/widget/TextView;

    .line 116
    .line 117
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance v10, Lj7;

    .line 121
    .line 122
    invoke-direct {v10, p0, v6, v7, p1}, Lj7;-><init>(Lo7;IILjava/lang/ref/WeakReference;)V

    .line 123
    .line 124
    .line 125
    :try_start_0
    iget p1, p0, Lo7;->a:I

    .line 126
    .line 127
    invoke-virtual {p2, v5, p1, v10}, Lxb4;->o(IILj7;)Landroid/graphics/Typeface;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-eqz p1, :cond_9

    .line 132
    .line 133
    if-lt v0, v4, :cond_8

    .line 134
    .line 135
    iget p2, p0, Lo7;->c:I

    .line 136
    .line 137
    if-eq p2, v3, :cond_8

    .line 138
    .line 139
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget p2, p0, Lo7;->c:I

    .line 144
    .line 145
    iget v0, p0, Lo7;->a:I

    .line 146
    .line 147
    and-int/2addr v0, v2

    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    move v0, v9

    .line 151
    goto :goto_1

    .line 152
    :cond_7
    move v0, v8

    .line 153
    :goto_1
    invoke-static {p1, p2, v0}, Ln7;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 161
    .line 162
    :cond_9
    :goto_2
    iget-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Landroid/graphics/Typeface;

    .line 165
    .line 166
    if-nez p1, :cond_a

    .line 167
    .line 168
    move p1, v9

    .line 169
    goto :goto_3

    .line 170
    :cond_a
    move p1, v8

    .line 171
    :goto_3
    iput-boolean p1, p0, Lo7;->b:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    :catch_0
    :cond_b
    iget-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, Landroid/graphics/Typeface;

    .line 176
    .line 177
    if-nez p1, :cond_e

    .line 178
    .line 179
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-eqz p1, :cond_e

    .line 184
    .line 185
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 186
    .line 187
    if-lt p2, v4, :cond_d

    .line 188
    .line 189
    iget p2, p0, Lo7;->c:I

    .line 190
    .line 191
    if-eq p2, v3, :cond_d

    .line 192
    .line 193
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget p2, p0, Lo7;->c:I

    .line 198
    .line 199
    iget v0, p0, Lo7;->a:I

    .line 200
    .line 201
    and-int/2addr v0, v2

    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    move v8, v9

    .line 205
    :cond_c
    invoke-static {p1, p2, v8}, Ln7;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_d
    iget p2, p0, Lo7;->a:I

    .line 213
    .line 214
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iput-object p1, p0, Lo7;->m:Ljava/lang/Object;

    .line 219
    .line 220
    :cond_e
    :goto_4
    return-void
.end method
