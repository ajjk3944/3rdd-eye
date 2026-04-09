.class public final Lbu;
.super Lv21;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final G:[Ljava/lang/String;


# instance fields
.field public final F:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "android:visibility:visibility"

    .line 2
    .line 3
    const-string v1, "android:visibility:parent"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lbu;->G:[Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lv21;-><init>()V

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lbu;->F:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbu;-><init>()V

    .line 2
    iput p1, p0, Lbu;->F:I

    return-void
.end method

.method public static I(Ld31;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld31;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object p0, p0, Ld31;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    const-string v2, "android:visibility:visibility"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v1, "android:visibility:parent"

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    new-array v1, v1, [I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 31
    .line 32
    .line 33
    const-string v0, "android:visibility:screenLocation"

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static K(Ld31;F)F
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Ld31;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v0, "android:fade:transitionAlpha"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Float;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    return p1
.end method

.method public static L(Ld31;Ld31;)Lt71;
    .locals 8

    .line 1
    new-instance v0, Lt71;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lt71;->c:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lt71;->d:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, -0x1

    .line 13
    const-string v4, "android:visibility:parent"

    .line 14
    .line 15
    const-string v5, "android:visibility:visibility"

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object v6, p0, Ld31;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v7, v0, Lt71;->a:I

    .line 38
    .line 39
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Landroid/view/ViewGroup;

    .line 44
    .line 45
    iput-object v6, v0, Lt71;->e:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v3, v0, Lt71;->a:I

    .line 49
    .line 50
    iput-object v2, v0, Lt71;->e:Ljava/lang/Object;

    .line 51
    .line 52
    :goto_0
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object v6, p1, Ld31;->a:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, v0, Lt71;->b:I

    .line 73
    .line 74
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/view/ViewGroup;

    .line 79
    .line 80
    iput-object v2, v0, Lt71;->f:Ljava/lang/Object;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iput v3, v0, Lt71;->b:I

    .line 84
    .line 85
    iput-object v2, v0, Lt71;->f:Ljava/lang/Object;

    .line 86
    .line 87
    :goto_1
    const/4 v2, 0x1

    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    iget p0, v0, Lt71;->a:I

    .line 93
    .line 94
    iget p1, v0, Lt71;->b:I

    .line 95
    .line 96
    if-ne p0, p1, :cond_2

    .line 97
    .line 98
    iget-object v3, v0, Lt71;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Landroid/view/ViewGroup;

    .line 101
    .line 102
    iget-object v4, v0, Lt71;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-ne v3, v4, :cond_2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    if-eq p0, p1, :cond_4

    .line 110
    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    iput-boolean v1, v0, Lt71;->d:Z

    .line 114
    .line 115
    iput-boolean v2, v0, Lt71;->c:Z

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_3
    if-nez p1, :cond_8

    .line 119
    .line 120
    iput-boolean v2, v0, Lt71;->d:Z

    .line 121
    .line 122
    iput-boolean v2, v0, Lt71;->c:Z

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_4
    iget-object p0, v0, Lt71;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-nez p0, :cond_5

    .line 130
    .line 131
    iput-boolean v1, v0, Lt71;->d:Z

    .line 132
    .line 133
    iput-boolean v2, v0, Lt71;->c:Z

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_5
    iget-object p0, v0, Lt71;->e:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Landroid/view/ViewGroup;

    .line 139
    .line 140
    if-nez p0, :cond_8

    .line 141
    .line 142
    iput-boolean v2, v0, Lt71;->d:Z

    .line 143
    .line 144
    iput-boolean v2, v0, Lt71;->c:Z

    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_6
    if-nez p0, :cond_7

    .line 148
    .line 149
    iget p0, v0, Lt71;->b:I

    .line 150
    .line 151
    if-nez p0, :cond_7

    .line 152
    .line 153
    iput-boolean v2, v0, Lt71;->d:Z

    .line 154
    .line 155
    iput-boolean v2, v0, Lt71;->c:Z

    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_7
    if-nez p1, :cond_8

    .line 159
    .line 160
    iget p0, v0, Lt71;->a:I

    .line 161
    .line 162
    if-nez p0, :cond_8

    .line 163
    .line 164
    iput-boolean v1, v0, Lt71;->d:Z

    .line 165
    .line 166
    iput-boolean v2, v0, Lt71;->c:Z

    .line 167
    .line 168
    :cond_8
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final J(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 2

    .line 1
    cmpl-float v0, p2, p3

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    sget-object v0, Lf71;->a:Lm71;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Li41;->y(Landroid/view/View;F)V

    .line 10
    .line 11
    .line 12
    sget-object p2, Lf71;->b:Lae;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    new-array v0, v0, [F

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aput p3, v0, v1

    .line 19
    .line 20
    invoke-static {p1, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance p3, Lau;

    .line 25
    .line 26
    invoke-direct {p3, p1}, Lau;-><init>(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lv21;->o()Lv21;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p3}, Lv21;->a(Lu21;)V

    .line 37
    .line 38
    .line 39
    return-object p2
.end method

.method public final d(Ld31;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lbu;->I(Ld31;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Ld31;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lbu;->I(Ld31;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ld31;->b:Landroid/view/View;

    .line 5
    .line 6
    const v1, 0x7f09026f

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Float;

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Lf71;->a:Lm71;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Li41;->l(Landroid/view/View;)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_1
    :goto_0
    iget-object p1, p1, Ld31;->a:Ljava/util/HashMap;

    .line 40
    .line 41
    const-string v0, "android:fade:transitionAlpha"

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Ld31;Ld31;)Landroid/animation/Animator;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-static/range {p2 .. p3}, Lbu;->L(Ld31;Ld31;)Lt71;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-boolean v5, v4, Lt71;->c:Z

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v4, Lt71;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    iget-object v5, v4, Lt71;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    move-object v4, v0

    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    goto/16 :goto_e

    .line 34
    .line 35
    :cond_1
    :goto_1
    iget-boolean v5, v4, Lt71;->d:Z

    .line 36
    .line 37
    iget v7, v0, Lbu;->F:I

    .line 38
    .line 39
    const/high16 v8, 0x3f800000    # 1.0f

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x1

    .line 43
    const/4 v11, 0x0

    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    and-int/lit8 v1, v7, 0x1

    .line 47
    .line 48
    if-ne v1, v10, :cond_0

    .line 49
    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object v1, v3, Ld31;->b:Landroid/view/View;

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v0, v3, v11}, Lv21;->n(Landroid/view/View;Z)Ld31;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v0, v3, v11}, Lv21;->r(Landroid/view/View;Z)Ld31;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v4, v3}, Lbu;->L(Ld31;Ld31;)Lt71;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-boolean v3, v3, Lt71;->c:Z

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    sget-object v3, Lf71;->a:Lm71;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v9}, Lbu;->K(Ld31;F)F

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v0, v1, v2, v8}, Lbu;->J(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    return-object v1

    .line 94
    :cond_4
    iget v4, v4, Lt71;->b:I

    .line 95
    .line 96
    const/4 v5, 0x2

    .line 97
    and-int/2addr v7, v5

    .line 98
    if-eq v7, v5, :cond_5

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    if-nez v2, :cond_6

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    iget-object v7, v2, Ld31;->b:Landroid/view/View;

    .line 105
    .line 106
    if-eqz v3, :cond_7

    .line 107
    .line 108
    iget-object v12, v3, Ld31;->b:Landroid/view/View;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    const/4 v12, 0x0

    .line 112
    :goto_2
    const v13, 0x7f0901fb

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    check-cast v14, Landroid/view/View;

    .line 120
    .line 121
    if-eqz v14, :cond_8

    .line 122
    .line 123
    move/from16 v22, v4

    .line 124
    .line 125
    move/from16 v18, v10

    .line 126
    .line 127
    move/from16 v17, v11

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    goto/16 :goto_d

    .line 133
    .line 134
    :cond_8
    if-eqz v12, :cond_c

    .line 135
    .line 136
    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    if-nez v14, :cond_9

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    const/4 v14, 0x4

    .line 144
    if-ne v4, v14, :cond_a

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_a
    if-ne v7, v12, :cond_b

    .line 148
    .line 149
    :goto_3
    move v15, v11

    .line 150
    move-object v14, v12

    .line 151
    const/4 v12, 0x0

    .line 152
    goto :goto_6

    .line 153
    :cond_b
    move v15, v10

    .line 154
    const/4 v12, 0x0

    .line 155
    :goto_4
    const/4 v14, 0x0

    .line 156
    goto :goto_6

    .line 157
    :cond_c
    :goto_5
    if-eqz v12, :cond_b

    .line 158
    .line 159
    move v15, v11

    .line 160
    goto :goto_4

    .line 161
    :goto_6
    if-eqz v15, :cond_16

    .line 162
    .line 163
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    if-nez v15, :cond_d

    .line 168
    .line 169
    move/from16 v22, v4

    .line 170
    .line 171
    move/from16 v18, v10

    .line 172
    .line 173
    move v10, v11

    .line 174
    move/from16 v17, v10

    .line 175
    .line 176
    move-object v6, v14

    .line 177
    const/16 v16, 0x0

    .line 178
    .line 179
    move-object v14, v7

    .line 180
    goto/16 :goto_d

    .line 181
    .line 182
    :cond_d
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    instance-of v15, v15, Landroid/view/View;

    .line 187
    .line 188
    if-eqz v15, :cond_16

    .line 189
    .line 190
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    check-cast v15, Landroid/view/View;

    .line 195
    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    invoke-virtual {v0, v15, v10}, Lv21;->r(Landroid/view/View;Z)Ld31;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    move/from16 v17, v11

    .line 203
    .line 204
    invoke-virtual {v0, v15, v10}, Lv21;->n(Landroid/view/View;Z)Ld31;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-static {v6, v11}, Lbu;->L(Ld31;Ld31;)Lt71;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    iget-boolean v6, v6, Lt71;->c:Z

    .line 213
    .line 214
    if-nez v6, :cond_15

    .line 215
    .line 216
    sget-boolean v6, Lc31;->a:Z

    .line 217
    .line 218
    new-instance v6, Landroid/graphics/Matrix;

    .line 219
    .line 220
    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v15}, Landroid/view/View;->getScrollX()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    neg-int v11, v11

    .line 228
    int-to-float v11, v11

    .line 229
    invoke-virtual {v15}, Landroid/view/View;->getScrollY()I

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    neg-int v12, v12

    .line 234
    int-to-float v12, v12

    .line 235
    invoke-virtual {v6, v11, v12}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 236
    .line 237
    .line 238
    sget-object v11, Lf71;->a:Lm71;

    .line 239
    .line 240
    invoke-virtual {v11, v7, v6}, Lm71;->U(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v11, v1, v6}, Lm71;->V(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 244
    .line 245
    .line 246
    new-instance v11, Landroid/graphics/RectF;

    .line 247
    .line 248
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    int-to-float v12, v12

    .line 253
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    int-to-float v15, v15

    .line 258
    invoke-direct {v11, v9, v9, v12, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6, v11}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 262
    .line 263
    .line 264
    iget v12, v11, Landroid/graphics/RectF;->left:F

    .line 265
    .line 266
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    iget v15, v11, Landroid/graphics/RectF;->top:F

    .line 271
    .line 272
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    move/from16 v18, v10

    .line 277
    .line 278
    iget v10, v11, Landroid/graphics/RectF;->right:F

    .line 279
    .line 280
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    iget v13, v11, Landroid/graphics/RectF;->bottom:F

    .line 285
    .line 286
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 287
    .line 288
    .line 289
    move-result v13

    .line 290
    new-instance v9, Landroid/widget/ImageView;

    .line 291
    .line 292
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-direct {v9, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 297
    .line 298
    .line 299
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 300
    .line 301
    invoke-virtual {v9, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7}, Landroid/view/View;->isAttachedToWindow()Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-eqz v1, :cond_e

    .line 309
    .line 310
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 311
    .line 312
    .line 313
    move-result v19

    .line 314
    if-eqz v19, :cond_e

    .line 315
    .line 316
    move/from16 v19, v18

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_e
    move/from16 v19, v17

    .line 320
    .line 321
    :goto_7
    if-nez v5, :cond_10

    .line 322
    .line 323
    if-nez v19, :cond_f

    .line 324
    .line 325
    move/from16 v22, v4

    .line 326
    .line 327
    move-object/from16 v21, v14

    .line 328
    .line 329
    move-object/from16 v0, v16

    .line 330
    .line 331
    goto/16 :goto_a

    .line 332
    .line 333
    :cond_f
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 334
    .line 335
    .line 336
    move-result-object v19

    .line 337
    move-object/from16 v8, v19

    .line 338
    .line 339
    check-cast v8, Landroid/view/ViewGroup;

    .line 340
    .line 341
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 342
    .line 343
    .line 344
    move-result v19

    .line 345
    move/from16 v20, v5

    .line 346
    .line 347
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    invoke-virtual {v5, v7}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    move/from16 v5, v19

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_10
    move/from16 v20, v5

    .line 358
    .line 359
    move-object/from16 v8, v16

    .line 360
    .line 361
    move/from16 v5, v17

    .line 362
    .line 363
    :goto_8
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 364
    .line 365
    .line 366
    move-result v19

    .line 367
    move-object/from16 v21, v14

    .line 368
    .line 369
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    .line 370
    .line 371
    .line 372
    move-result v14

    .line 373
    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    .line 374
    .line 375
    .line 376
    move-result v19

    .line 377
    move/from16 v22, v4

    .line 378
    .line 379
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-lez v14, :cond_12

    .line 384
    .line 385
    if-lez v4, :cond_12

    .line 386
    .line 387
    mul-int v3, v14, v4

    .line 388
    .line 389
    int-to-float v3, v3

    .line 390
    const/high16 v19, 0x49800000    # 1048576.0f

    .line 391
    .line 392
    div-float v3, v19, v3

    .line 393
    .line 394
    const/high16 v0, 0x3f800000    # 1.0f

    .line 395
    .line 396
    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    int-to-float v0, v14

    .line 401
    mul-float/2addr v0, v3

    .line 402
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    int-to-float v4, v4

    .line 407
    mul-float/2addr v4, v3

    .line 408
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    iget v14, v11, Landroid/graphics/RectF;->left:F

    .line 413
    .line 414
    neg-float v14, v14

    .line 415
    iget v11, v11, Landroid/graphics/RectF;->top:F

    .line 416
    .line 417
    neg-float v11, v11

    .line 418
    invoke-virtual {v6, v14, v11}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 422
    .line 423
    .line 424
    sget-boolean v3, Lc31;->a:Z

    .line 425
    .line 426
    if-eqz v3, :cond_11

    .line 427
    .line 428
    new-instance v3, Landroid/graphics/Picture;

    .line 429
    .line 430
    invoke-direct {v3}, Landroid/graphics/Picture;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3, v0, v4}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v7, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3}, Landroid/graphics/Picture;->endRecording()V

    .line 444
    .line 445
    .line 446
    invoke-static {v3}, Lb31;->a(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    goto :goto_9

    .line 451
    :cond_11
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 452
    .line 453
    invoke-static {v0, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    new-instance v3, Landroid/graphics/Canvas;

    .line 458
    .line 459
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v3, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v7, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 466
    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_12
    move-object/from16 v0, v16

    .line 470
    .line 471
    :goto_9
    if-nez v20, :cond_13

    .line 472
    .line 473
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-virtual {v3, v7}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v8, v7, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 481
    .line 482
    .line 483
    :cond_13
    :goto_a
    if-eqz v0, :cond_14

    .line 484
    .line 485
    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 486
    .line 487
    .line 488
    :cond_14
    sub-int v0, v10, v12

    .line 489
    .line 490
    const/high16 v3, 0x40000000    # 2.0f

    .line 491
    .line 492
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    sub-int v4, v13, v15

    .line 497
    .line 498
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    invoke-virtual {v9, v0, v3}, Landroid/view/View;->measure(II)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v9, v12, v15, v10, v13}, Landroid/view/View;->layout(IIII)V

    .line 506
    .line 507
    .line 508
    move-object v14, v9

    .line 509
    :goto_b
    move/from16 v10, v17

    .line 510
    .line 511
    move-object/from16 v6, v21

    .line 512
    .line 513
    goto :goto_d

    .line 514
    :cond_15
    move/from16 v22, v4

    .line 515
    .line 516
    move/from16 v18, v10

    .line 517
    .line 518
    move-object/from16 v21, v14

    .line 519
    .line 520
    invoke-virtual {v15}, Landroid/view/View;->getId()I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    if-nez v3, :cond_17

    .line 529
    .line 530
    const/4 v3, -0x1

    .line 531
    if-eq v0, v3, :cond_17

    .line 532
    .line 533
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 534
    .line 535
    .line 536
    goto :goto_c

    .line 537
    :cond_16
    move/from16 v22, v4

    .line 538
    .line 539
    move/from16 v18, v10

    .line 540
    .line 541
    move/from16 v17, v11

    .line 542
    .line 543
    move-object/from16 v21, v14

    .line 544
    .line 545
    const/16 v16, 0x0

    .line 546
    .line 547
    :cond_17
    :goto_c
    move-object v14, v12

    .line 548
    goto :goto_b

    .line 549
    :goto_d
    if-eqz v14, :cond_1c

    .line 550
    .line 551
    if-nez v10, :cond_18

    .line 552
    .line 553
    iget-object v0, v2, Ld31;->a:Ljava/util/HashMap;

    .line 554
    .line 555
    const-string v3, "android:visibility:screenLocation"

    .line 556
    .line 557
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, [I

    .line 562
    .line 563
    aget v3, v0, v17

    .line 564
    .line 565
    aget v0, v0, v18

    .line 566
    .line 567
    const/4 v4, 0x2

    .line 568
    new-array v4, v4, [I

    .line 569
    .line 570
    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 571
    .line 572
    .line 573
    aget v5, v4, v17

    .line 574
    .line 575
    sub-int/2addr v3, v5

    .line 576
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    .line 577
    .line 578
    .line 579
    move-result v5

    .line 580
    sub-int/2addr v3, v5

    .line 581
    invoke-virtual {v14, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 582
    .line 583
    .line 584
    aget v3, v4, v18

    .line 585
    .line 586
    sub-int/2addr v0, v3

    .line 587
    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    sub-int/2addr v0, v3

    .line 592
    invoke-virtual {v14, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0, v14}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 600
    .line 601
    .line 602
    :cond_18
    sget-object v0, Lf71;->a:Lm71;

    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    const/high16 v3, 0x3f800000    # 1.0f

    .line 608
    .line 609
    invoke-static {v2, v3}, Lbu;->K(Ld31;F)F

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    const/4 v5, 0x0

    .line 614
    move-object/from16 v4, p0

    .line 615
    .line 616
    invoke-virtual {v4, v14, v2, v5}, Lbu;->J(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    if-nez v2, :cond_19

    .line 621
    .line 622
    move-object/from16 v5, p3

    .line 623
    .line 624
    invoke-static {v5, v3}, Lbu;->K(Ld31;F)F

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    invoke-virtual {v0, v14, v3}, Li41;->y(Landroid/view/View;F)V

    .line 629
    .line 630
    .line 631
    :cond_19
    if-nez v10, :cond_1b

    .line 632
    .line 633
    if-nez v2, :cond_1a

    .line 634
    .line 635
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-virtual {v0, v14}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 640
    .line 641
    .line 642
    return-object v2

    .line 643
    :cond_1a
    const v0, 0x7f0901fb

    .line 644
    .line 645
    .line 646
    invoke-virtual {v7, v0, v14}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    new-instance v0, Ls71;

    .line 650
    .line 651
    invoke-direct {v0, v4, v1, v14, v7}, Ls71;-><init>(Lbu;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v2, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v0}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v4}, Lv21;->o()Lv21;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-virtual {v1, v0}, Lv21;->a(Lu21;)V

    .line 665
    .line 666
    .line 667
    :cond_1b
    return-object v2

    .line 668
    :cond_1c
    move-object/from16 v4, p0

    .line 669
    .line 670
    move-object/from16 v5, p3

    .line 671
    .line 672
    if-eqz v6, :cond_1f

    .line 673
    .line 674
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    move/from16 v1, v17

    .line 679
    .line 680
    invoke-static {v6, v1}, Lf71;->b(Landroid/view/View;I)V

    .line 681
    .line 682
    .line 683
    sget-object v1, Lf71;->a:Lm71;

    .line 684
    .line 685
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    const/high16 v3, 0x3f800000    # 1.0f

    .line 689
    .line 690
    invoke-static {v2, v3}, Lbu;->K(Ld31;F)F

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    const/4 v7, 0x0

    .line 695
    invoke-virtual {v4, v6, v2, v7}, Lbu;->J(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    if-nez v2, :cond_1d

    .line 700
    .line 701
    invoke-static {v5, v3}, Lbu;->K(Ld31;F)F

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    invoke-virtual {v1, v6, v3}, Li41;->y(Landroid/view/View;F)V

    .line 706
    .line 707
    .line 708
    :cond_1d
    if-eqz v2, :cond_1e

    .line 709
    .line 710
    new-instance v0, Lr71;

    .line 711
    .line 712
    move/from16 v1, v22

    .line 713
    .line 714
    invoke-direct {v0, v6, v1}, Lr71;-><init>(Landroid/view/View;I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v4}, Lv21;->o()Lv21;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-virtual {v1, v0}, Lv21;->a(Lu21;)V

    .line 725
    .line 726
    .line 727
    return-object v2

    .line 728
    :cond_1e
    invoke-static {v6, v0}, Lf71;->b(Landroid/view/View;I)V

    .line 729
    .line 730
    .line 731
    return-object v2

    .line 732
    :cond_1f
    :goto_e
    return-object v16
.end method

.method public final q()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lbu;->G:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ld31;Ld31;)Z
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object v0, p2, Ld31;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    const-string v1, "android:visibility:visibility"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p1, Ld31;->a:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1, p2}, Lbu;->L(Ld31;Ld31;)Lt71;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-boolean p2, p1, Lt71;->c:Z

    .line 32
    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    iget p2, p1, Lt71;->a:I

    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget p1, p1, Lt71;->b:I

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    :cond_2
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method
