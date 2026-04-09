.class public final Lni0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static g:I


# instance fields
.field public a:I

.field public b:I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:Lmi0;

.field public f:F


# direct methods
.method public static declared-synchronized a(ILmi0;)Lni0;
    .locals 2

    .line 1
    const-class v0, Lni0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lni0;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    if-lez p0, :cond_0

    .line 10
    .line 11
    iput p0, v1, Lni0;->b:I

    .line 12
    .line 13
    new-array p0, p0, [Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p0, v1, Lni0;->c:[Ljava/lang/Object;

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    iput p0, v1, Lni0;->d:I

    .line 19
    .line 20
    iput-object p1, v1, Lni0;->e:Lmi0;

    .line 21
    .line 22
    const/high16 p0, 0x3f800000    # 1.0f

    .line 23
    .line 24
    iput p0, v1, Lni0;->f:F

    .line 25
    .line 26
    invoke-virtual {v1}, Lni0;->d()V

    .line 27
    .line 28
    .line 29
    sget p0, Lni0;->g:I

    .line 30
    .line 31
    iput p0, v1, Lni0;->a:I

    .line 32
    .line 33
    add-int/lit8 p0, p0, 0x1

    .line 34
    .line 35
    sput p0, Lni0;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    return-object v1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string p1, "Object Pool must be instantiated with a capacity greater than 0!"

    .line 44
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p0
.end method


# virtual methods
.method public final declared-synchronized b()Lmi0;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lni0;->d:I

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lni0;->f:F

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    cmpl-float v0, v0, v2

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lni0;->d()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-object v0, p0, Lni0;->c:[Ljava/lang/Object;

    .line 21
    .line 22
    iget v2, p0, Lni0;->d:I

    .line 23
    .line 24
    aget-object v0, v0, v2

    .line 25
    .line 26
    check-cast v0, Lmi0;

    .line 27
    .line 28
    iput v1, v0, Lmi0;->f:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    iput v2, p0, Lni0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return-object v0

    .line 36
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw v0
.end method

.method public final declared-synchronized c(Lmi0;)V
    .locals 4

    .line 1
    const-string v0, "The object to recycle already belongs to poolId "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget v1, p1, Lmi0;->f:I

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    iget v2, p0, Lni0;->a:I

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string v0, "The object passed is already stored in this pool!"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget p1, p1, Lmi0;->f:I

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, ".  Object cannot belong to two different pool instances simultaneously!"

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_1
    iget v0, p0, Lni0;->d:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    iput v0, p0, Lni0;->d:I

    .line 53
    .line 54
    iget-object v1, p0, Lni0;->c:[Ljava/lang/Object;

    .line 55
    .line 56
    array-length v1, v1

    .line 57
    if-lt v0, v1, :cond_3

    .line 58
    .line 59
    iget v0, p0, Lni0;->b:I

    .line 60
    .line 61
    mul-int/lit8 v1, v0, 0x2

    .line 62
    .line 63
    iput v1, p0, Lni0;->b:I

    .line 64
    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    :goto_0
    if-ge v2, v0, :cond_2

    .line 69
    .line 70
    iget-object v3, p0, Lni0;->c:[Ljava/lang/Object;

    .line 71
    .line 72
    aget-object v3, v3, v2

    .line 73
    .line 74
    aput-object v3, v1, v2

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iput-object v1, p0, Lni0;->c:[Ljava/lang/Object;

    .line 80
    .line 81
    :cond_3
    iget v0, p0, Lni0;->a:I

    .line 82
    .line 83
    iput v0, p1, Lmi0;->f:I

    .line 84
    .line 85
    iget-object v0, p0, Lni0;->c:[Ljava/lang/Object;

    .line 86
    .line 87
    iget v1, p0, Lni0;->d:I

    .line 88
    .line 89
    aput-object p1, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    monitor-exit p0

    .line 92
    return-void

    .line 93
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    throw p1
.end method

.method public final d()V
    .locals 5

    .line 1
    iget v0, p0, Lni0;->f:F

    .line 2
    .line 3
    iget v1, p0, Lni0;->b:I

    .line 4
    .line 5
    int-to-float v2, v1

    .line 6
    mul-float/2addr v2, v0

    .line 7
    float-to-int v0, v2

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-le v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v1, v0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    :goto_1
    if-ge v0, v1, :cond_2

    .line 19
    .line 20
    iget-object v3, p0, Lni0;->c:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v4, p0, Lni0;->e:Lmi0;

    .line 23
    .line 24
    invoke-virtual {v4}, Lmi0;->a()Lmi0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    aput-object v4, v3, v0

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    sub-int/2addr v1, v2

    .line 34
    iput v1, p0, Lni0;->d:I

    .line 35
    .line 36
    return-void
.end method
