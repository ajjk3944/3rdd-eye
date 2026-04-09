.class public final Lpv1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final t:J


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Landroid/app/Application;

.field public final h:Landroid/os/PowerManager;

.field public final i:Landroid/app/KeyguardManager;

.field public j:Ld6;

.field public k:Ljava/lang/ref/WeakReference;

.field public final l:Ljava/lang/ref/WeakReference;

.field public final m:Lct1;

.field public final n:Lrn1;

.field public o:Z

.field public p:I

.field public final q:Ljava/util/HashSet;

.field public final r:Landroid/util/DisplayMetrics;

.field public final s:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->v1:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lpv1;->t:J

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrn1;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/high16 v1, -0x8000000000000000L

    .line 10
    .line 11
    iput-wide v1, v0, Lrn1;->g:J

    .line 12
    .line 13
    new-instance v1, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lrn1;->h:Ljava/lang/Object;

    .line 19
    .line 20
    sget-wide v1, Lpv1;->t:J

    .line 21
    .line 22
    iput-wide v1, v0, Lrn1;->f:J

    .line 23
    .line 24
    iput-object v0, p0, Lpv1;->n:Lrn1;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lpv1;->o:Z

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    iput v0, p0, Lpv1;->p:I

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lpv1;->q:Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lpv1;->f:Landroid/content/Context;

    .line 44
    .line 45
    const-string v1, "window"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroid/view/WindowManager;

    .line 52
    .line 53
    const-string v2, "power"

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Landroid/os/PowerManager;

    .line 60
    .line 61
    iput-object v2, p0, Lpv1;->h:Landroid/os/PowerManager;

    .line 62
    .line 63
    const-string v2, "keyguard"

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Landroid/app/KeyguardManager;

    .line 70
    .line 71
    iput-object v2, p0, Lpv1;->i:Landroid/app/KeyguardManager;

    .line 72
    .line 73
    instance-of v2, v0, Landroid/app/Application;

    .line 74
    .line 75
    if-eqz v2, :cond_0

    .line 76
    .line 77
    move-object v2, v0

    .line 78
    check-cast v2, Landroid/app/Application;

    .line 79
    .line 80
    iput-object v2, p0, Lpv1;->g:Landroid/app/Application;

    .line 81
    .line 82
    new-instance v2, Lct1;

    .line 83
    .line 84
    check-cast v0, Landroid/app/Application;

    .line 85
    .line 86
    invoke-direct {v2, v0, p0}, Lct1;-><init>(Landroid/app/Application;Lpv1;)V

    .line 87
    .line 88
    .line 89
    iput-object v2, p0, Lpv1;->m:Lct1;

    .line 90
    .line 91
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lpv1;->r:Landroid/util/DisplayMetrics;

    .line 100
    .line 101
    new-instance p1, Landroid/graphics/Rect;

    .line 102
    .line 103
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lpv1;->s:Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 117
    .line 118
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 127
    .line 128
    iget-object p1, p0, Lpv1;->l:Ljava/lang/ref/WeakReference;

    .line 129
    .line 130
    if-eqz p1, :cond_1

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Landroid/view/View;

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    const/4 p1, 0x0

    .line 140
    :goto_0
    if-eqz p1, :cond_2

    .line 141
    .line 142
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1}, Lpv1;->f(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    :cond_2
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 149
    .line 150
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lpv1;->l:Ljava/lang/ref/WeakReference;

    .line 154
    .line 155
    if-eqz p2, :cond_4

    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_3

    .line 162
    .line 163
    invoke-virtual {p0, p2}, Lpv1;->e(Landroid/view/View;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    invoke-virtual {p2, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    iget-object v2, p0, Lpv1;->r:Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 9
    .line 10
    div-float/2addr v1, v2

    .line 11
    float-to-int v1, v1

    .line 12
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 13
    .line 14
    int-to-float v3, v3

    .line 15
    div-float/2addr v3, v2

    .line 16
    float-to-int v3, v3

    .line 17
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 18
    .line 19
    int-to-float v4, v4

    .line 20
    div-float/2addr v4, v2

    .line 21
    float-to-int v4, v4

    .line 22
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    div-float/2addr p1, v2

    .line 26
    float-to-int p1, p1

    .line 27
    invoke-direct {v0, v1, v3, v4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final b()V
    .locals 3

    .line 1
    sget-object v0, Llf4;->l:Li63;

    .line 2
    .line 3
    new-instance v1, Lfu1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c(Landroid/app/Activity;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpv1;->l:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-ne v0, p1, :cond_1

    .line 35
    .line 36
    iput p2, p0, Lpv1;->p:I

    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(I)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iget-object v3, v1, Lpv1;->i:Landroid/app/KeyguardManager;

    .line 6
    .line 7
    iget-object v4, v1, Lpv1;->h:Landroid/os/PowerManager;

    .line 8
    .line 9
    iget-object v5, v1, Lpv1;->q:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1a

    .line 18
    .line 19
    :cond_0
    iget-object v0, v1, Lpv1;->l:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v0, :cond_19

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, Landroid/view/View;

    .line 29
    .line 30
    new-instance v7, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v8, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v9, Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v10, Landroid/graphics/Rect;

    .line 46
    .line 47
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x2

    .line 51
    new-array v11, v0, [I

    .line 52
    .line 53
    new-array v12, v0, [I

    .line 54
    .line 55
    const/4 v13, 0x1

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    invoke-virtual {v6, v8}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    invoke-virtual {v6, v9}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 63
    .line 64
    .line 65
    move-result v16

    .line 66
    invoke-virtual {v6, v10}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    :try_start_0
    invoke-virtual {v6, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v12}, Landroid/view/View;->getLocationInWindow([I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const-string v14, "Failure getting view location."

    .line 82
    .line 83
    invoke-static {v14, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object v0, Lmz1;->y5:Liz1;

    .line 87
    .line 88
    sget-object v14, Ltw1;->e:Ltw1;

    .line 89
    .line 90
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 91
    .line 92
    invoke-virtual {v14, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    aget v0, v12, v17

    .line 105
    .line 106
    iput v0, v7, Landroid/graphics/Rect;->left:I

    .line 107
    .line 108
    aget v0, v12, v13

    .line 109
    .line 110
    iput v0, v7, Landroid/graphics/Rect;->top:I

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    aget v0, v11, v17

    .line 114
    .line 115
    iput v0, v7, Landroid/graphics/Rect;->left:I

    .line 116
    .line 117
    aget v0, v11, v13

    .line 118
    .line 119
    iput v0, v7, Landroid/graphics/Rect;->top:I

    .line 120
    .line 121
    :goto_1
    iget v0, v7, Landroid/graphics/Rect;->left:I

    .line 122
    .line 123
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    add-int/2addr v11, v0

    .line 128
    iput v11, v7, Landroid/graphics/Rect;->right:I

    .line 129
    .line 130
    iget v0, v7, Landroid/graphics/Rect;->top:I

    .line 131
    .line 132
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    add-int/2addr v11, v0

    .line 137
    iput v11, v7, Landroid/graphics/Rect;->bottom:I

    .line 138
    .line 139
    move-object v11, v6

    .line 140
    goto :goto_2

    .line 141
    :cond_2
    const/16 v17, 0x0

    .line 142
    .line 143
    const/4 v0, 0x0

    .line 144
    move-object v11, v0

    .line 145
    move/from16 v15, v17

    .line 146
    .line 147
    move/from16 v16, v15

    .line 148
    .line 149
    :goto_2
    sget-object v0, Lmz1;->y1:Liz1;

    .line 150
    .line 151
    sget-object v12, Ltw1;->e:Ltw1;

    .line 152
    .line 153
    iget-object v12, v12, Ltw1;->c:Lkz1;

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/lang/Boolean;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_5

    .line 166
    .line 167
    if-eqz v11, :cond_5

    .line 168
    .line 169
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    :goto_3
    instance-of v14, v12, Landroid/view/View;

    .line 179
    .line 180
    if-eqz v14, :cond_4

    .line 181
    .line 182
    move-object v14, v12

    .line 183
    check-cast v14, Landroid/view/View;

    .line 184
    .line 185
    new-instance v13, Landroid/graphics/Rect;

    .line 186
    .line 187
    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v14}, Landroid/view/View;->isScrollContainer()Z

    .line 191
    .line 192
    .line 193
    move-result v18

    .line 194
    if-eqz v18, :cond_3

    .line 195
    .line 196
    invoke-virtual {v14, v13}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-eqz v14, :cond_3

    .line 201
    .line 202
    invoke-virtual {v1, v13}, Lpv1;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :catch_1
    move-exception v0

    .line 211
    goto :goto_6

    .line 212
    :cond_3
    :goto_4
    invoke-interface {v12}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 213
    .line 214
    .line 215
    move-result-object v12
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 216
    const/4 v13, 0x1

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    :goto_5
    move-object/from16 v29, v0

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :goto_6
    const-string v12, "PositionWatcher.getParentScrollViewRects"

    .line 222
    .line 223
    sget-object v13, Lhg4;->C:Lhg4;

    .line 224
    .line 225
    iget-object v13, v13, Lhg4;->h:Lgd2;

    .line 226
    .line 227
    invoke-virtual {v13, v12, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :goto_7
    if-eqz v11, :cond_6

    .line 237
    .line 238
    invoke-virtual {v11}, Landroid/view/View;->getWindowVisibility()I

    .line 239
    .line 240
    .line 241
    move-result v12

    .line 242
    goto :goto_8

    .line 243
    :cond_6
    const/16 v12, 0x8

    .line 244
    .line 245
    :goto_8
    iget v13, v1, Lpv1;->p:I

    .line 246
    .line 247
    const/4 v14, -0x1

    .line 248
    if-eq v13, v14, :cond_7

    .line 249
    .line 250
    move v12, v13

    .line 251
    :cond_7
    sget-object v13, Lhg4;->C:Lhg4;

    .line 252
    .line 253
    iget-object v14, v13, Lhg4;->c:Llf4;

    .line 254
    .line 255
    invoke-static {v11}, Llf4;->a(Landroid/view/View;)J

    .line 256
    .line 257
    .line 258
    move-result-wide v18

    .line 259
    sget-object v14, Lmz1;->qb:Liz1;

    .line 260
    .line 261
    sget-object v0, Ltw1;->e:Ltw1;

    .line 262
    .line 263
    move-object/from16 v30, v5

    .line 264
    .line 265
    iget-object v5, v0, Ltw1;->c:Lkz1;

    .line 266
    .line 267
    invoke-virtual {v5, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    check-cast v5, Ljava/lang/Boolean;

    .line 272
    .line 273
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_c

    .line 278
    .line 279
    if-eqz v6, :cond_b

    .line 280
    .line 281
    invoke-static {v11, v4, v3}, Llf4;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_b

    .line 286
    .line 287
    if-eqz v15, :cond_a

    .line 288
    .line 289
    if-eqz v16, :cond_9

    .line 290
    .line 291
    sget-object v5, Lmz1;->tb:Liz1;

    .line 292
    .line 293
    iget-object v6, v0, Ltw1;->c:Lkz1;

    .line 294
    .line 295
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    check-cast v5, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    int-to-long v5, v5

    .line 306
    cmp-long v5, v18, v5

    .line 307
    .line 308
    if-ltz v5, :cond_8

    .line 309
    .line 310
    if-nez v12, :cond_8

    .line 311
    .line 312
    :goto_9
    move/from16 v12, v17

    .line 313
    .line 314
    const/4 v5, 0x1

    .line 315
    const/4 v6, 0x1

    .line 316
    :goto_a
    const/4 v15, 0x1

    .line 317
    goto :goto_b

    .line 318
    :cond_8
    move/from16 v6, v17

    .line 319
    .line 320
    const/4 v5, 0x1

    .line 321
    goto :goto_a

    .line 322
    :cond_9
    move/from16 v5, v17

    .line 323
    .line 324
    move v6, v5

    .line 325
    goto :goto_a

    .line 326
    :cond_a
    move/from16 v5, v16

    .line 327
    .line 328
    move/from16 v6, v17

    .line 329
    .line 330
    move v15, v6

    .line 331
    goto :goto_b

    .line 332
    :cond_b
    move/from16 v5, v16

    .line 333
    .line 334
    move/from16 v6, v17

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :cond_c
    if-eqz v6, :cond_b

    .line 338
    .line 339
    invoke-static {v11, v4, v3}, Llf4;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-eqz v5, :cond_b

    .line 344
    .line 345
    if-eqz v15, :cond_a

    .line 346
    .line 347
    if-eqz v16, :cond_9

    .line 348
    .line 349
    if-nez v12, :cond_8

    .line 350
    .line 351
    goto :goto_9

    .line 352
    :goto_b
    sget-object v14, Lmz1;->vb:Liz1;

    .line 353
    .line 354
    move/from16 v16, v12

    .line 355
    .line 356
    iget-object v12, v0, Ltw1;->c:Lkz1;

    .line 357
    .line 358
    invoke-virtual {v12, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    check-cast v12, Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 365
    .line 366
    .line 367
    move-result v12

    .line 368
    if-eqz v12, :cond_12

    .line 369
    .line 370
    invoke-static {v11, v4, v3}, Llf4;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    const/4 v12, 0x1

    .line 375
    if-eq v12, v3, :cond_d

    .line 376
    .line 377
    move/from16 v3, v17

    .line 378
    .line 379
    goto :goto_c

    .line 380
    :cond_d
    const/16 v3, 0x40

    .line 381
    .line 382
    :goto_c
    if-eq v12, v15, :cond_e

    .line 383
    .line 384
    move/from16 v14, v17

    .line 385
    .line 386
    goto :goto_d

    .line 387
    :cond_e
    const/16 v14, 0x8

    .line 388
    .line 389
    :goto_d
    if-eq v12, v5, :cond_f

    .line 390
    .line 391
    move/from16 v12, v17

    .line 392
    .line 393
    goto :goto_e

    .line 394
    :cond_f
    const/16 v12, 0x10

    .line 395
    .line 396
    :goto_e
    if-nez v16, :cond_10

    .line 397
    .line 398
    const/16 v16, 0x80

    .line 399
    .line 400
    :goto_f
    move/from16 v21, v3

    .line 401
    .line 402
    goto :goto_10

    .line 403
    :cond_10
    move/from16 v16, v17

    .line 404
    .line 405
    goto :goto_f

    .line 406
    :goto_10
    sget-object v3, Lmz1;->tb:Liz1;

    .line 407
    .line 408
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 409
    .line 410
    invoke-virtual {v0, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    check-cast v0, Ljava/lang/Integer;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    move-object/from16 v22, v4

    .line 421
    .line 422
    int-to-long v3, v0

    .line 423
    cmp-long v0, v18, v3

    .line 424
    .line 425
    if-ltz v0, :cond_11

    .line 426
    .line 427
    const/16 v0, 0x20

    .line 428
    .line 429
    goto :goto_11

    .line 430
    :cond_11
    move/from16 v0, v17

    .line 431
    .line 432
    :goto_11
    or-int v3, v21, v14

    .line 433
    .line 434
    or-int/2addr v3, v12

    .line 435
    or-int v3, v3, v16

    .line 436
    .line 437
    or-int/2addr v0, v3

    .line 438
    or-int/2addr v0, v6

    .line 439
    invoke-static {v11, v0}, Llf4;->j(Landroid/view/View;I)V

    .line 440
    .line 441
    .line 442
    :goto_12
    const/4 v12, 0x1

    .line 443
    goto :goto_13

    .line 444
    :cond_12
    move-object/from16 v22, v4

    .line 445
    .line 446
    goto :goto_12

    .line 447
    :goto_13
    if-ne v2, v12, :cond_14

    .line 448
    .line 449
    iget-object v0, v1, Lpv1;->n:Lrn1;

    .line 450
    .line 451
    iget-object v3, v0, Lrn1;->h:Ljava/lang/Object;

    .line 452
    .line 453
    monitor-enter v3

    .line 454
    :try_start_2
    iget-object v4, v13, Lhg4;->k:Lym;

    .line 455
    .line 456
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move/from16 v26, v5

    .line 460
    .line 461
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 462
    .line 463
    .line 464
    move-result-wide v4

    .line 465
    move-object v14, v11

    .line 466
    iget-wide v11, v0, Lrn1;->g:J

    .line 467
    .line 468
    move-wide/from16 v18, v11

    .line 469
    .line 470
    iget-wide v11, v0, Lrn1;->f:J

    .line 471
    .line 472
    add-long v11, v18, v11

    .line 473
    .line 474
    cmp-long v11, v11, v4

    .line 475
    .line 476
    if-lez v11, :cond_13

    .line 477
    .line 478
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 479
    iget-boolean v0, v1, Lpv1;->o:Z

    .line 480
    .line 481
    if-eq v6, v0, :cond_19

    .line 482
    .line 483
    goto :goto_15

    .line 484
    :catchall_0
    move-exception v0

    .line 485
    goto :goto_14

    .line 486
    :cond_13
    :try_start_3
    iput-wide v4, v0, Lrn1;->g:J

    .line 487
    .line 488
    monitor-exit v3

    .line 489
    goto :goto_15

    .line 490
    :goto_14
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 491
    throw v0

    .line 492
    :cond_14
    move/from16 v26, v5

    .line 493
    .line 494
    move-object v14, v11

    .line 495
    :goto_15
    if-nez v6, :cond_15

    .line 496
    .line 497
    iget-boolean v0, v1, Lpv1;->o:Z

    .line 498
    .line 499
    if-nez v0, :cond_15

    .line 500
    .line 501
    const/4 v12, 0x1

    .line 502
    if-eq v2, v12, :cond_19

    .line 503
    .line 504
    goto :goto_16

    .line 505
    :cond_15
    const/4 v12, 0x1

    .line 506
    :goto_16
    new-instance v18, Lnv1;

    .line 507
    .line 508
    iget-object v0, v13, Lhg4;->k:Lym;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v22 .. v22}, Landroid/os/PowerManager;->isScreenOn()Z

    .line 517
    .line 518
    .line 519
    if-eqz v14, :cond_16

    .line 520
    .line 521
    invoke-virtual {v14}, Landroid/view/View;->isAttachedToWindow()Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-eqz v0, :cond_16

    .line 526
    .line 527
    move/from16 v19, v12

    .line 528
    .line 529
    goto :goto_17

    .line 530
    :cond_16
    move/from16 v19, v17

    .line 531
    .line 532
    :goto_17
    if-eqz v14, :cond_17

    .line 533
    .line 534
    invoke-virtual {v14}, Landroid/view/View;->getWindowVisibility()I

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    move/from16 v20, v0

    .line 539
    .line 540
    goto :goto_18

    .line 541
    :cond_17
    const/16 v20, 0x8

    .line 542
    .line 543
    :goto_18
    iget-object v0, v1, Lpv1;->s:Landroid/graphics/Rect;

    .line 544
    .line 545
    invoke-virtual {v1, v0}, Lpv1;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 546
    .line 547
    .line 548
    move-result-object v21

    .line 549
    invoke-virtual {v1, v7}, Lpv1;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 550
    .line 551
    .line 552
    move-result-object v22

    .line 553
    invoke-virtual {v1, v8}, Lpv1;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 554
    .line 555
    .line 556
    move-result-object v23

    .line 557
    invoke-virtual {v1, v9}, Lpv1;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 558
    .line 559
    .line 560
    move-result-object v25

    .line 561
    invoke-virtual {v1, v10}, Lpv1;->a(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 562
    .line 563
    .line 564
    move-result-object v27

    .line 565
    iget-object v0, v1, Lpv1;->r:Landroid/util/DisplayMetrics;

    .line 566
    .line 567
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 568
    .line 569
    move/from16 v28, v6

    .line 570
    .line 571
    move/from16 v24, v15

    .line 572
    .line 573
    invoke-direct/range {v18 .. v29}, Lnv1;-><init>(ZILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZLandroid/graphics/Rect;ZLjava/util/List;)V

    .line 574
    .line 575
    .line 576
    move-object/from16 v2, v18

    .line 577
    .line 578
    move/from16 v0, v28

    .line 579
    .line 580
    invoke-virtual/range {v30 .. v30}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    if-eqz v4, :cond_18

    .line 589
    .line 590
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    check-cast v4, Lov1;

    .line 595
    .line 596
    invoke-interface {v4, v2}, Lov1;->S0(Lnv1;)V

    .line 597
    .line 598
    .line 599
    goto :goto_19

    .line 600
    :cond_18
    iput-boolean v0, v1, Lpv1;->o:Z

    .line 601
    .line 602
    :cond_19
    :goto_1a
    return-void
.end method

.method public final e(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lpv1;->k:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lpv1;->j:Ld6;

    .line 25
    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    new-instance p1, Landroid/content/IntentFilter;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v0, "android.intent.action.SCREEN_ON"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "android.intent.action.SCREEN_OFF"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "android.intent.action.USER_PRESENT"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Ld6;

    .line 49
    .line 50
    const/4 v1, 0x3

    .line 51
    invoke-direct {v0, v1, p0}, Ld6;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lpv1;->j:Ld6;

    .line 55
    .line 56
    iget-object v1, p0, Lpv1;->f:Landroid/content/Context;

    .line 57
    .line 58
    sget-object v2, Lhg4;->C:Lhg4;

    .line 59
    .line 60
    iget-object v2, v2, Lhg4;->z:Lm30;

    .line 61
    .line 62
    monitor-enter v2

    .line 63
    :try_start_0
    iget-boolean v3, v2, Lm30;->g:Z

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    iget-object v1, v2, Lm30;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Ljava/util/WeakHashMap;

    .line 70
    .line 71
    invoke-virtual {v1, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    monitor-exit v2

    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    :try_start_1
    invoke-static {v1}, Lmz1;->a(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    sget-object v3, Lmz1;->Nb:Liz1;

    .line 82
    .line 83
    sget-object v4, Ltw1;->e:Ltw1;

    .line 84
    .line 85
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/16 v4, 0x21

    .line 102
    .line 103
    if-lt v3, v4, :cond_2

    .line 104
    .line 105
    const/4 v3, 0x4

    .line 106
    invoke-virtual {v1, v0, p1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    monitor-exit v2

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    :try_start_2
    invoke-virtual {v1, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    .line 114
    monitor-exit v2

    .line 115
    goto :goto_1

    .line 116
    :goto_0
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    throw p1

    .line 118
    :cond_3
    :goto_1
    iget-object p1, p0, Lpv1;->g:Landroid/app/Application;

    .line 119
    .line 120
    if-eqz p1, :cond_4

    .line 121
    .line 122
    :try_start_4
    iget-object v0, p0, Lpv1;->m:Lct1;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :catch_0
    move-exception p1

    .line 129
    const-string v0, "Error registering activity lifecycle callbacks."

    .line 130
    .line 131
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lpv1;->k:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iput-object v0, p0, Lpv1;->k:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :goto_1
    const-string v2, "Error while unregistering listeners from the last ViewTreeObserver."

    .line 33
    .line 34
    invoke-static {v2, v1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catch_1
    move-exception p1

    .line 55
    const-string v1, "Error while unregistering listeners from the ViewTreeObserver."

    .line 56
    .line 57
    invoke-static {v1, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_3
    iget-object p1, p0, Lpv1;->j:Ld6;

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    :try_start_2
    sget-object v1, Lhg4;->C:Lhg4;

    .line 65
    .line 66
    iget-object v1, v1, Lhg4;->z:Lm30;

    .line 67
    .line 68
    iget-object v2, p0, Lpv1;->f:Landroid/content/Context;

    .line 69
    .line 70
    invoke-virtual {v1, v2, p1}, Lm30;->d(Landroid/content/Context;Ld6;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 71
    .line 72
    .line 73
    goto :goto_6

    .line 74
    :catch_2
    move-exception p1

    .line 75
    goto :goto_4

    .line 76
    :catch_3
    move-exception p1

    .line 77
    goto :goto_5

    .line 78
    :goto_4
    sget-object v1, Lhg4;->C:Lhg4;

    .line 79
    .line 80
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 81
    .line 82
    const-string v2, "ActiveViewUnit.stopScreenStatusMonitoring"

    .line 83
    .line 84
    invoke-virtual {v1, v2, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    goto :goto_6

    .line 88
    :goto_5
    const-string v1, "Failed trying to unregister the receiver"

    .line 89
    .line 90
    invoke-static {v1, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :goto_6
    iput-object v0, p0, Lpv1;->j:Ld6;

    .line 94
    .line 95
    :cond_3
    iget-object p1, p0, Lpv1;->g:Landroid/app/Application;

    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    :try_start_3
    iget-object v0, p0, Lpv1;->m:Lct1;

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 102
    .line 103
    .line 104
    goto :goto_7

    .line 105
    :catch_4
    move-exception p1

    .line 106
    const-string v0, "Error registering activity lifecycle callbacks."

    .line 107
    .line 108
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    :goto_7
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p1, p2}, Lpv1;->c(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lpv1;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lpv1;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, p1, v0}, Lpv1;->c(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lpv1;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lpv1;->c(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lpv1;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lpv1;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lpv1;->c(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lpv1;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lpv1;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lpv1;->d(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lpv1;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onScrollChanged()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lpv1;->d(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lpv1;->p:I

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lpv1;->e(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-virtual {p0, p1}, Lpv1;->d(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lpv1;->p:I

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    invoke-virtual {p0, v0}, Lpv1;->d(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lpv1;->b()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lpv1;->f(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
