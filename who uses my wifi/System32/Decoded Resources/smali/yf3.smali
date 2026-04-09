.class public final Lyf3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lsd3;
.implements Lll3;
.implements Lks2;
.implements Lpj;


# instance fields
.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Ldn3;->m([Ljava/lang/Object;I)Ldn3;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lyf3;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyf3;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b([B)Lyf3;
    .locals 1

    .line 1
    new-instance v0, Lyf3;

    .line 2
    .line 3
    invoke-static {p0}, Lv34;->a([B)Lv34;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lyf3;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static d(I)Lyf3;
    .locals 1

    .line 1
    new-instance v0, Lyf3;

    .line 2
    .line 3
    invoke-static {p0}, Lhw3;->a(I)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lv34;->a([B)Lv34;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lyf3;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lyf3;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llj4;

    .line 4
    .line 5
    return-object v0
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lzt1;

    .line 2
    .line 3
    sget v0, Lya4;->g0:I

    .line 4
    .line 5
    iget-object v0, p0, Lyf3;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ldc4;

    .line 8
    .line 9
    iget v0, v0, Ldc4;->e:I

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lzt1;->B(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public f(Lgi4;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lyf3;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmr2;

    .line 4
    .line 5
    invoke-virtual {p1}, Lgi4;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_5

    .line 10
    .line 11
    iget-boolean v1, p1, Lgi4;->d:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lgi4;->a()Ljava/lang/Exception;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v2, v1, Ly4;

    .line 21
    .line 22
    if-eqz v2, :cond_5

    .line 23
    .line 24
    check-cast v1, Ly4;

    .line 25
    .line 26
    iget-object v1, v1, Ly4;->f:Lcom/google/android/gms/common/api/Status;

    .line 27
    .line 28
    iget v1, v1, Lcom/google/android/gms/common/api/Status;->f:I

    .line 29
    .line 30
    const v2, 0xa7f9

    .line 31
    .line 32
    .line 33
    if-eq v1, v2, :cond_4

    .line 34
    .line 35
    const v2, 0xa7fa

    .line 36
    .line 37
    .line 38
    if-eq v1, v2, :cond_4

    .line 39
    .line 40
    const v2, 0xa7fb

    .line 41
    .line 42
    .line 43
    if-eq v1, v2, :cond_4

    .line 44
    .line 45
    const/16 v2, 0x11

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const v0, 0xa7f8

    .line 51
    .line 52
    .line 53
    if-ne v1, v0, :cond_2

    .line 54
    .line 55
    new-instance p1, Ljava/lang/Exception;

    .line 56
    .line 57
    const-string v0, "Failed to get app set ID due to an internal error. Please try again later."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lgi4;

    .line 63
    .line 64
    invoke-direct {v0}, Lgi4;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    const/16 v0, 0xf

    .line 72
    .line 73
    if-eq v1, v0, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    .line 77
    .line 78
    const-string v0, "The operation to get app set ID timed out. Please try again later."

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lgi4;

    .line 84
    .line 85
    invoke-direct {v0}, Lgi4;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_4
    :goto_0
    iget-object p1, v0, Lmr2;->h:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Lxb4;

    .line 95
    .line 96
    invoke-virtual {p1}, Lxb4;->h()Lgi4;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :cond_5
    :goto_1
    return-object p1
.end method

.method public j(IJLjava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long v4, v0, p2

    .line 6
    .line 7
    iget-object p2, p0, Lyf3;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lgb4;

    .line 10
    .line 11
    iget-object v2, p2, Lgb4;->m:Lgd3;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move v3, p1

    .line 16
    move-object v8, p4

    .line 17
    invoke-virtual/range {v2 .. v8}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public o(IJ)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p2

    .line 6
    iget-object p2, p0, Lyf3;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lgb4;

    .line 9
    .line 10
    iget-object p2, p2, Lgb4;->m:Lgd3;

    .line 11
    .line 12
    invoke-virtual {p2, p1, v0, v1}, Lgd3;->b(IJ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
