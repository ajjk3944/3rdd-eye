.class public final Lxc4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public b:I

.field public c:Z

.field public d:J

.field public final synthetic e:Lyc4;


# direct methods
.method public constructor <init>(Lyc4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxc4;->e:Lyc4;

    .line 5
    .line 6
    iput p2, p0, Lxc4;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    iget-object v0, p0, Lxc4;->e:Lyc4;

    .line 2
    .line 3
    iget-object v1, v0, Lyc4;->f:Lya4;

    .line 4
    .line 5
    iget-object v2, v0, Lyc4;->i:Ld13;

    .line 6
    .line 7
    invoke-virtual {v1}, Lya4;->D1()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v3, v0, Lyc4;->f:Lya4;

    .line 12
    .line 13
    invoke-virtual {v3}, Lya4;->H1()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x4

    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    invoke-virtual {v3}, Lya4;->C1()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v6, 0x1

    .line 25
    if-eq v4, v6, :cond_3

    .line 26
    .line 27
    invoke-virtual {v3}, Lya4;->C1()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eq v3, v5, :cond_3

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-ne v1, v6, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    iget-boolean v7, p0, Lxc4;->c:Z

    .line 43
    .line 44
    iget v8, p0, Lxc4;->a:I

    .line 45
    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    iget v7, p0, Lxc4;->b:I

    .line 49
    .line 50
    if-ne v7, v1, :cond_2

    .line 51
    .line 52
    iget-wide v1, p0, Lxc4;->d:J

    .line 53
    .line 54
    sub-long/2addr v3, v1

    .line 55
    int-to-long v1, v8

    .line 56
    cmp-long v1, v3, v1

    .line 57
    .line 58
    if-ltz v1, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lyc4;->g:Loa4;

    .line 61
    .line 62
    new-instance v1, Lzc4;

    .line 63
    .line 64
    invoke-direct {v1, v5, v8}, Lzc4;-><init>(II)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 68
    .line 69
    new-instance v2, Lb84;

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    const/16 v4, 0x3eb

    .line 73
    .line 74
    invoke-direct {v2, v3, v1, v4}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Lya4;->Y1(Lb84;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :cond_2
    iput-boolean v6, p0, Lxc4;->c:Z

    .line 82
    .line 83
    iput-wide v3, p0, Lxc4;->d:J

    .line 84
    .line 85
    iput v1, p0, Lxc4;->b:I

    .line 86
    .line 87
    invoke-virtual {v2, v5}, Ld13;->c(I)V

    .line 88
    .line 89
    .line 90
    int-to-long v0, v8

    .line 91
    iget-object v2, v2, Ld13;->a:Landroid/os/Handler;

    .line 92
    .line 93
    invoke-virtual {v2, v5, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lxc4;->c:Z

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-virtual {v2, v5}, Ld13;->c(I)V

    .line 102
    .line 103
    .line 104
    :cond_4
    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Lxc4;->c:Z

    .line 106
    .line 107
    return-void
.end method
