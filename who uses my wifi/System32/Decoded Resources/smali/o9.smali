.class public final Lo9;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo9;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo9;->c:I

    sget-object v0, Ly54;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lo9;->d:Ljava/lang/Object;

    iput-object p0, p1, Lm0;->h:Ljava/lang/Object;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final y(I)V
    .locals 1

    .line 1
    and-int/lit8 p0, p0, 0x3

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, La64;

    .line 7
    .line 8
    const-string v0, "Failed to parse the message."

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public static final z(I)V
    .locals 1

    .line 1
    and-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, La64;

    .line 7
    .line 8
    const-string v0, "Failed to parse the message."

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method


# virtual methods
.method public A()I
    .locals 2

    .line 1
    iget v0, p0, Lo9;->c:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput v0, p0, Lo9;->a:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lo9;->c:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lm0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lm0;->j()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lo9;->a:I

    .line 20
    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget v1, p0, Lo9;->b:I

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    :goto_1
    const v0, 0x7fffffff

    .line 32
    .line 33
    .line 34
    return v0
.end method

.method public B()La54;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lo9;->t(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lm0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lm0;->w()Ly44;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public C(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    iget v1, p0, Lo9;->a:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x7

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lm0;->x()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Lo9;->z(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lm0;->e()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v1

    .line 27
    :cond_0
    invoke-virtual {v0}, Lm0;->m()D

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lm0;->e()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-lt v1, v2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p1, Lz54;

    .line 46
    .line 47
    invoke-direct {p1}, Lz54;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-virtual {v0}, Lm0;->m()D

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lm0;->c()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Lm0;->j()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iget v2, p0, Lo9;->a:I

    .line 73
    .line 74
    if-eq v1, v2, :cond_2

    .line 75
    .line 76
    iput v1, p0, Lo9;->c:I

    .line 77
    .line 78
    :cond_3
    :goto_0
    return-void
.end method

.method public D(Lx54;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    iget v1, p0, Lo9;->a:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x7

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-eq v1, v2, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Lm0;->n()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lm0;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v0}, Lm0;->j()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget v2, p0, Lo9;->a:I

    .line 37
    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    iput v1, p0, Lo9;->c:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    new-instance p1, Lz54;

    .line 44
    .line 45
    invoke-direct {p1}, Lz54;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-virtual {v0}, Lm0;->x()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Lo9;->y(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lm0;->e()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/2addr v2, v1

    .line 61
    :cond_3
    invoke-virtual {v0}, Lm0;->n()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lm0;->e()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-lt v1, v2, :cond_3

    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public E(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Le64;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Le64;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->o()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v1, v3, v4}, Le64;->c(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->o()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {v1, v2, v3}, Le64;->c(J)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->o()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->o()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    iget v1, p0, Lo9;->c:I

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget v3, p0, Lo9;->a:I

    .line 12
    .line 13
    sub-int/2addr v2, v3

    .line 14
    sub-int/2addr v1, v2

    .line 15
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget v2, p0, Lo9;->b:I

    .line 25
    .line 26
    sub-int/2addr v1, v2

    .line 27
    rsub-int/lit8 v1, v1, 0x0

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public b()Ll60;
    .locals 4

    .line 1
    new-instance v0, Ll60;

    .line 2
    .line 3
    invoke-direct {v0}, Ll60;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    iput v1, v0, Ll60;->B:I

    .line 8
    .line 9
    const v1, 0x3e4ccccd    # 0.2f

    .line 10
    .line 11
    .line 12
    iput v1, v0, Ll60;->G:F

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Ll60;->A:Z

    .line 16
    .line 17
    iput-boolean v1, v0, Ll60;->J:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Ll60;->j:Z

    .line 21
    .line 22
    const v2, 0x3f99999a    # 1.2f

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lk41;->c(F)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, v0, Ll60;->z:F

    .line 30
    .line 31
    const v2, 0x400ccccd    # 2.2f

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lk41;->c(F)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, v0, Ll60;->E:F

    .line 39
    .line 40
    iget v2, p0, Lo9;->c:I

    .line 41
    .line 42
    iput v2, v0, Ll60;->D:I

    .line 43
    .line 44
    iget-object v3, v0, Ll60;->C:Ljava/util/ArrayList;

    .line 45
    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v3, v0, Ll60;->C:Ljava/util/ArrayList;

    .line 54
    .line 55
    :cond_0
    iget-object v3, v0, Ll60;->C:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 58
    .line 59
    .line 60
    iget-object v3, v0, Ll60;->C:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    const/16 v2, 0x64

    .line 70
    .line 71
    iput v2, v0, Ll60;->y:I

    .line 72
    .line 73
    iput-boolean v1, v0, Ll60;->v:Z

    .line 74
    .line 75
    iget v2, p0, Lo9;->a:I

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ll60;->e(I)V

    .line 78
    .line 79
    .line 80
    iget v2, p0, Lo9;->b:I

    .line 81
    .line 82
    iput v2, v0, Ll60;->x:I

    .line 83
    .line 84
    new-instance v2, Lxn;

    .line 85
    .line 86
    invoke-direct {v2, v1}, Lxn;-><init>(I)V

    .line 87
    .line 88
    .line 89
    iput-object v2, v0, Ll60;->f:Ln41;

    .line 90
    .line 91
    return-object v0
.end method

.method public c(Ln9;Ll60;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li60;

    .line 4
    .line 5
    iget-object v0, v0, Lom;->i:Lke;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-static {v0, v0}, Ljava/lang/Math;->min(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-interface {p1}, Ln9;->getLowestVisibleX()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-interface {p1}, Ln9;->getHighestVisibleX()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v2, 0x2

    .line 30
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 31
    .line 32
    invoke-virtual {p2, v1, v3, v2}, Ll60;->c(FFI)Lxs;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p2, Ll60;->o:Ljava/util/ArrayList;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-virtual {p2, p1, v3, v4}, Ll60;->c(FFI)Lxs;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 p2, 0x0

    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    move v1, p2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :goto_0
    iput v1, p0, Lo9;->a:I

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    :goto_1
    iput p2, p0, Lo9;->b:I

    .line 62
    .line 63
    iget p1, p0, Lo9;->a:I

    .line 64
    .line 65
    sub-int/2addr p2, p1

    .line 66
    int-to-float p1, p2

    .line 67
    mul-float/2addr p1, v0

    .line 68
    float-to-int p1, p1

    .line 69
    iput p1, p0, Lo9;->c:I

    .line 70
    .line 71
    return-void
.end method

.method public d(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Le64;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Le64;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->p()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v1, v3, v4}, Le64;->c(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->p()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {v1, v2, v3}, Le64;->c(J)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->p()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->p()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public e(Lx54;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Lq54;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lq54;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->q()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->q()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->q()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->q()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public f(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Le64;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Le64;

    .line 13
    .line 14
    iget p1, p0, Lo9;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x7

    .line 17
    .line 18
    if-eq p1, v3, :cond_2

    .line 19
    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lm0;->x()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Lo9;->z(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lm0;->e()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, p1

    .line 34
    :cond_0
    invoke-virtual {v0}, Lm0;->r()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-virtual {v1, v3, v4}, Le64;->c(J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lm0;->e()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-lt p1, v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Lz54;

    .line 49
    .line 50
    invoke-direct {p1}, Lz54;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-virtual {v0}, Lm0;->r()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    invoke-virtual {v1, v2, v3}, Le64;->c(J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lm0;->c()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget v2, p0, Lo9;->a:I

    .line 73
    .line 74
    if-eq p1, v2, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 78
    .line 79
    and-int/lit8 v1, v1, 0x7

    .line 80
    .line 81
    if-eq v1, v3, :cond_7

    .line 82
    .line 83
    if-ne v1, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0}, Lm0;->x()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Lo9;->z(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lm0;->e()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    add-int/2addr v2, v1

    .line 97
    :cond_5
    invoke-virtual {v0}, Lm0;->r()J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lm0;->e()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-lt v1, v2, :cond_5

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    new-instance p1, Lz54;

    .line 116
    .line 117
    invoke-direct {p1}, Lz54;-><init>()V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_7
    invoke-virtual {v0}, Lm0;->r()J

    .line 122
    .line 123
    .line 124
    move-result-wide v1

    .line 125
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lm0;->c()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0}, Lm0;->j()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    iget v2, p0, Lo9;->a:I

    .line 143
    .line 144
    if-eq v1, v2, :cond_7

    .line 145
    .line 146
    move p1, v1

    .line 147
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 148
    .line 149
    :cond_8
    :goto_1
    return-void
.end method

.method public g(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Lq54;

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x2

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Lq54;

    .line 13
    .line 14
    iget p1, p0, Lo9;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x7

    .line 17
    .line 18
    if-eq p1, v3, :cond_3

    .line 19
    .line 20
    if-ne p1, v2, :cond_2

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, Lm0;->s()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lm0;->c()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, Lm0;->j()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget v2, p0, Lo9;->a:I

    .line 42
    .line 43
    if-eq p1, v2, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance p1, Lz54;

    .line 47
    .line 48
    invoke-direct {p1}, Lz54;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_3
    invoke-virtual {v0}, Lm0;->x()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Lo9;->y(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lm0;->e()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int v4, v2, p1

    .line 64
    .line 65
    :cond_4
    invoke-virtual {v0}, Lm0;->s()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lm0;->e()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-lt p1, v4, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    iget v1, p0, Lo9;->a:I

    .line 80
    .line 81
    and-int/lit8 v1, v1, 0x7

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    if-ne v1, v2, :cond_7

    .line 86
    .line 87
    :cond_6
    invoke-virtual {v0}, Lm0;->s()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lm0;->c()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_a

    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->j()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iget v2, p0, Lo9;->a:I

    .line 109
    .line 110
    if-eq v1, v2, :cond_6

    .line 111
    .line 112
    move p1, v1

    .line 113
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 114
    .line 115
    return-void

    .line 116
    :cond_7
    new-instance p1, Lz54;

    .line 117
    .line 118
    invoke-direct {p1}, Lz54;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_8
    invoke-virtual {v0}, Lm0;->x()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v1}, Lo9;->y(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lm0;->e()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    add-int/2addr v2, v1

    .line 134
    :cond_9
    invoke-virtual {v0}, Lm0;->s()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lm0;->e()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-lt v1, v2, :cond_9

    .line 150
    .line 151
    :cond_a
    :goto_1
    return-void
.end method

.method public h(Lx54;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    iget v1, p0, Lo9;->a:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x7

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lm0;->x()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Lm0;->e()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v1

    .line 23
    :cond_0
    invoke-virtual {v0}, Lm0;->t()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lm0;->e()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-lt v1, v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    new-instance p1, Lz54;

    .line 45
    .line 46
    invoke-direct {p1}, Lz54;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-virtual {v0}, Lm0;->t()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lm0;->c()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq v1, v2, :cond_2

    .line 74
    .line 75
    iput v1, p0, Lo9;->c:I

    .line 76
    .line 77
    :cond_3
    return-void
.end method

.method public i(Lx54;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    iget v1, p0, Lo9;->a:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x7

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-ne v1, v2, :cond_3

    .line 11
    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lo9;->t(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lm0;->v()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p0, v2}, Lo9;->t(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lm0;->u()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lm0;->c()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {v0}, Lm0;->j()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iget v3, p0, Lo9;->a:I

    .line 44
    .line 45
    if-eq v1, v3, :cond_0

    .line 46
    .line 47
    iput v1, p0, Lo9;->c:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    new-instance p1, Lz54;

    .line 51
    .line 52
    invoke-direct {p1}, Lz54;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public j(Lx54;Lv64;Lh54;)V
    .locals 3

    .line 1
    iget v0, p0, Lo9;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne v1, v2, :cond_3

    .line 7
    .line 8
    :cond_0
    invoke-interface {p2}, Lv64;->a()Lp54;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0, v1, p2, p3}, Lo9;->u(Ljava/lang/Object;Lv64;Lh54;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v1}, Lv64;->h(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lo9;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lm0;

    .line 24
    .line 25
    invoke-virtual {v1}, Lm0;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lo9;->c:I

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v1}, Lm0;->j()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v1, v0, :cond_0

    .line 41
    .line 42
    iput v1, p0, Lo9;->c:I

    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void

    .line 45
    :cond_3
    new-instance p1, Lz54;

    .line 46
    .line 47
    invoke-direct {p1}, Lz54;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public k(Lx54;Lv64;Lh54;)V
    .locals 3

    .line 1
    iget v0, p0, Lo9;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-ne v1, v2, :cond_3

    .line 7
    .line 8
    :cond_0
    invoke-interface {p2}, Lv64;->a()Lp54;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0, v1, p2, p3}, Lo9;->v(Ljava/lang/Object;Lv64;Lh54;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v1}, Lv64;->h(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lo9;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lm0;

    .line 24
    .line 25
    invoke-virtual {v1}, Lm0;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lo9;->c:I

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v1}, Lm0;->j()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v1, v0, :cond_0

    .line 41
    .line 42
    iput v1, p0, Lo9;->c:I

    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void

    .line 45
    :cond_3
    new-instance p1, Lz54;

    .line 46
    .line 47
    invoke-direct {p1}, Lz54;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public l(Lx54;)V
    .locals 2

    .line 1
    iget v0, p0, Lo9;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lo9;->B()La54;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lm0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lm0;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {v0}, Lm0;->j()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p0, Lo9;->a:I

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    iput v0, p0, Lo9;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance p1, Lz54;

    .line 38
    .line 39
    invoke-direct {p1}, Lz54;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public m(Lx54;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Lq54;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lq54;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->x()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->x()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->x()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->x()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public n(Lx54;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Lq54;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lq54;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->y()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->y()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->y()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->y()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public o(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Lq54;

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x2

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Lq54;

    .line 13
    .line 14
    iget p1, p0, Lo9;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x7

    .line 17
    .line 18
    if-eq p1, v3, :cond_3

    .line 19
    .line 20
    if-ne p1, v2, :cond_2

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, Lm0;->z()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lm0;->c()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, Lm0;->j()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget v2, p0, Lo9;->a:I

    .line 42
    .line 43
    if-eq p1, v2, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance p1, Lz54;

    .line 47
    .line 48
    invoke-direct {p1}, Lz54;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_3
    invoke-virtual {v0}, Lm0;->x()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Lo9;->y(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lm0;->e()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int v4, v2, p1

    .line 64
    .line 65
    :cond_4
    invoke-virtual {v0}, Lm0;->z()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lm0;->e()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-lt p1, v4, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    iget v1, p0, Lo9;->a:I

    .line 80
    .line 81
    and-int/lit8 v1, v1, 0x7

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    if-ne v1, v2, :cond_7

    .line 86
    .line 87
    :cond_6
    invoke-virtual {v0}, Lm0;->z()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lm0;->c()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_a

    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->j()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iget v2, p0, Lo9;->a:I

    .line 109
    .line 110
    if-eq v1, v2, :cond_6

    .line 111
    .line 112
    move p1, v1

    .line 113
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 114
    .line 115
    return-void

    .line 116
    :cond_7
    new-instance p1, Lz54;

    .line 117
    .line 118
    invoke-direct {p1}, Lz54;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_8
    invoke-virtual {v0}, Lm0;->x()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v1}, Lo9;->y(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lm0;->e()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    add-int/2addr v2, v1

    .line 134
    :cond_9
    invoke-virtual {v0}, Lm0;->z()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lm0;->e()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-lt v1, v2, :cond_9

    .line 150
    .line 151
    :cond_a
    :goto_1
    return-void
.end method

.method public p(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Le64;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Le64;

    .line 13
    .line 14
    iget p1, p0, Lo9;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x7

    .line 17
    .line 18
    if-eq p1, v3, :cond_2

    .line 19
    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lm0;->x()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Lo9;->z(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lm0;->e()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, p1

    .line 34
    :cond_0
    invoke-virtual {v0}, Lm0;->A()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-virtual {v1, v3, v4}, Le64;->c(J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lm0;->e()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-lt p1, v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Lz54;

    .line 49
    .line 50
    invoke-direct {p1}, Lz54;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-virtual {v0}, Lm0;->A()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    invoke-virtual {v1, v2, v3}, Le64;->c(J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lm0;->c()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget v2, p0, Lo9;->a:I

    .line 73
    .line 74
    if-eq p1, v2, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 78
    .line 79
    and-int/lit8 v1, v1, 0x7

    .line 80
    .line 81
    if-eq v1, v3, :cond_7

    .line 82
    .line 83
    if-ne v1, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0}, Lm0;->x()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Lo9;->z(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lm0;->e()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    add-int/2addr v2, v1

    .line 97
    :cond_5
    invoke-virtual {v0}, Lm0;->A()J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lm0;->e()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-lt v1, v2, :cond_5

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    new-instance p1, Lz54;

    .line 116
    .line 117
    invoke-direct {p1}, Lz54;-><init>()V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_7
    invoke-virtual {v0}, Lm0;->A()J

    .line 122
    .line 123
    .line 124
    move-result-wide v1

    .line 125
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lm0;->c()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0}, Lm0;->j()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    iget v2, p0, Lo9;->a:I

    .line 143
    .line 144
    if-eq v1, v2, :cond_7

    .line 145
    .line 146
    move p1, v1

    .line 147
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 148
    .line 149
    :cond_8
    :goto_1
    return-void
.end method

.method public q(Lx54;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Lq54;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lq54;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->B()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->B()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v1, p1}, Lq54;->d(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->B()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->B()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public r(Lx54;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    instance-of v1, p1, Le64;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Le64;

    .line 12
    .line 13
    iget p1, p0, Lo9;->a:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0;->x()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Lm0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lm0;->C()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v1, v3, v4}, Le64;->c(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lm0;->e()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lt p1, v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Lz54;

    .line 48
    .line 49
    invoke-direct {p1}, Lz54;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lm0;->C()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {v1, v2, v3}, Le64;->c(J)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lm0;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Lm0;->j()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v2, p0, Lo9;->a:I

    .line 72
    .line 73
    if-eq p1, v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget v1, p0, Lo9;->a:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0}, Lm0;->x()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0}, Lm0;->e()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v1

    .line 93
    :cond_5
    invoke-virtual {v0}, Lm0;->C()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lm0;->e()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lo9;->x(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    new-instance p1, Lz54;

    .line 115
    .line 116
    invoke-direct {p1}, Lz54;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    invoke-virtual {v0}, Lm0;->C()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lm0;->c()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lm0;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lo9;->a:I

    .line 142
    .line 143
    if-eq v1, v2, :cond_7

    .line 144
    .line 145
    move p1, v1

    .line 146
    :goto_0
    iput p1, p0, Lo9;->c:I

    .line 147
    .line 148
    :cond_8
    :goto_1
    return-void
.end method

.method public s(Lg64;Ljr3;Lh54;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lo9;->t(I)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lo9;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lm0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lm0;->x()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Lm0;->D(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p2, Ljr3;->i:Ljava/lang/Object;

    .line 18
    .line 19
    const-string v4, ""

    .line 20
    .line 21
    move-object v5, v3

    .line 22
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lo9;->A()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const v7, 0x7fffffff

    .line 27
    .line 28
    .line 29
    if-eq v6, v7, :cond_9

    .line 30
    .line 31
    invoke-virtual {v1}, Lm0;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    goto :goto_5

    .line 38
    :cond_0
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    const-string v9, "Unable to parse map entry."

    .line 41
    .line 42
    if-eq v6, v7, :cond_5

    .line 43
    .line 44
    if-eq v6, v0, :cond_4

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {v1}, Lm0;->c()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    iget v6, p0, Lo9;->a:I

    .line 53
    .line 54
    iget v7, p0, Lo9;->b:I

    .line 55
    .line 56
    if-ne v6, v7, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v1, v6}, Lm0;->l(I)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    :goto_1
    move v6, v8

    .line 65
    :goto_2
    if-eqz v6, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    new-instance v6, La64;

    .line 69
    .line 70
    invoke-direct {v6, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v6

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_6

    .line 76
    :catch_0
    move-exception v6

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget-object v6, p2, Ljr3;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lj74;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {p0, v6, v7, p3}, Lo9;->w(Lj74;Ljava/lang/Class;Lh54;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    iget-object v6, p2, Ljr3;->g:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, Lj74;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    invoke-virtual {p0, v6, v7, v7}, Lo9;->w(Lj74;Ljava/lang/Class;Lh54;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4
    :try_end_1
    .catch Lz54; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    goto :goto_0

    .line 101
    :goto_3
    :try_start_2
    invoke-virtual {v1}, Lm0;->c()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-nez v7, :cond_7

    .line 106
    .line 107
    iget v7, p0, Lo9;->a:I

    .line 108
    .line 109
    iget v10, p0, Lo9;->b:I

    .line 110
    .line 111
    if-ne v7, v10, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    invoke-virtual {v1, v7}, Lm0;->l(I)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    :cond_7
    :goto_4
    if-eqz v8, :cond_8

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    new-instance p1, La64;

    .line 122
    .line 123
    invoke-direct {p1, v9, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_9
    :goto_5
    invoke-virtual {p1, v4, v5}, Lg64;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v2}, Lm0;->a(I)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :goto_6
    invoke-virtual {v1, v2}, Lm0;->a(I)V

    .line 135
    .line 136
    .line 137
    throw p1
.end method

.method public t(I)V
    .locals 1

    .line 1
    iget v0, p0, Lo9;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Lz54;

    .line 9
    .line 10
    invoke-direct {p1}, Lz54;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public u(Ljava/lang/Object;Lv64;Lh54;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0;->x()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, v0, Lm0;->f:I

    .line 10
    .line 11
    iget v3, v0, Lm0;->g:I

    .line 12
    .line 13
    add-int/2addr v2, v3

    .line 14
    const/16 v3, 0x64

    .line 15
    .line 16
    if-ge v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lm0;->D(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v2, v0, Lm0;->f:I

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    iput v2, v0, Lm0;->f:I

    .line 27
    .line 28
    invoke-interface {p2, p1, p0, p3}, Lv64;->c(Ljava/lang/Object;Lo9;Lh54;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, p1}, Lm0;->k(I)V

    .line 33
    .line 34
    .line 35
    iget p1, v0, Lm0;->f:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    iput p1, v0, Lm0;->f:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lm0;->a(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p1, La64;

    .line 46
    .line 47
    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public v(Ljava/lang/Object;Lv64;Lh54;)V
    .locals 2

    .line 1
    iget v0, p0, Lo9;->b:I

    .line 2
    .line 3
    iget v1, p0, Lo9;->a:I

    .line 4
    .line 5
    ushr-int/lit8 v1, v1, 0x3

    .line 6
    .line 7
    shl-int/lit8 v1, v1, 0x3

    .line 8
    .line 9
    or-int/lit8 v1, v1, 0x4

    .line 10
    .line 11
    iput v1, p0, Lo9;->b:I

    .line 12
    .line 13
    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lv64;->c(Ljava/lang/Object;Lo9;Lh54;)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lo9;->a:I

    .line 17
    .line 18
    iget p2, p0, Lo9;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    iput v0, p0, Lo9;->b:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    :try_start_1
    new-instance p1, La64;

    .line 26
    .line 27
    const-string p2, "Failed to parse the message."

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    iput v0, p0, Lo9;->b:I

    .line 35
    .line 36
    throw p1
.end method

.method public w(Lj74;Ljava/lang/Class;Lh54;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    sget-object v1, Lj74;->h:Lj74;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x5

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p2, "unsupported field type."

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :pswitch_1
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lm0;->C()J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_2
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lm0;->B()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :pswitch_3
    invoke-virtual {p0, v3}, Lo9;->t(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lm0;->A()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_4
    invoke-virtual {p0, v2}, Lo9;->t(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lm0;->z()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_5
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lm0;->y()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :pswitch_6
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lm0;->x()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_7
    invoke-virtual {p0}, Lo9;->B()La54;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :pswitch_8
    invoke-virtual {p0, v1}, Lo9;->t(I)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lp64;->c:Lp64;

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Lp64;->a(Ljava/lang/Class;)Lv64;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Lv64;->a()Lp54;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p0, p2, p1, p3}, Lo9;->u(Ljava/lang/Object;Lv64;Lh54;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, p2}, Lv64;->h(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-object p2

    .line 123
    :pswitch_9
    invoke-virtual {p0, v1}, Lo9;->t(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lm0;->v()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_a
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lm0;->t()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :pswitch_b
    invoke-virtual {p0, v2}, Lo9;->t(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lm0;->s()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    :pswitch_c
    invoke-virtual {p0, v3}, Lo9;->t(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lm0;->r()J

    .line 159
    .line 160
    .line 161
    move-result-wide p1

    .line 162
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_d
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lm0;->q()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :pswitch_e
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Lm0;->o()J

    .line 183
    .line 184
    .line 185
    move-result-wide p1

    .line 186
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    :pswitch_f
    invoke-virtual {p0, v4}, Lo9;->t(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Lm0;->p()J

    .line 195
    .line 196
    .line 197
    move-result-wide p1

    .line 198
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1

    .line 203
    :pswitch_10
    invoke-virtual {p0, v2}, Lo9;->t(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lm0;->n()F

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    return-object p1

    .line 215
    :pswitch_11
    invoke-virtual {p0, v3}, Lo9;->t(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lm0;->m()D

    .line 219
    .line 220
    .line 221
    move-result-wide p1

    .line 222
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    return-object p1

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public x(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0;->e()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, La64;

    .line 13
    .line 14
    const-string v0, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method
