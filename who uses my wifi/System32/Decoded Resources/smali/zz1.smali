.class public final Lzz1;
.super Lil;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/List;

.field public final c:Lb02;

.field public final d:Lil;

.field public final e:Lpv2;


# direct methods
.method public constructor <init>(Lb02;Lil;Lpv2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lzz1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p2, p0, Lzz1;->d:Lil;

    .line 13
    .line 14
    iput-object p1, p0, Lzz1;->c:Lb02;

    .line 15
    .line 16
    iput-object p3, p0, Lzz1;->e:Lpv2;

    .line 17
    .line 18
    sget-object p1, Lmz1;->Ia:Liz1;

    .line 19
    .line 20
    sget-object p2, Ltw1;->e:Ltw1;

    .line 21
    .line 22
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    const-string p2, ","

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lzz1;->b:Ljava/util/List;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lil;->a(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lil;->b(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
.end method

.method public final c(IILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lil;->c(IILandroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzz1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lil;->d(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final e(ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lzz1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lil;->e(ILandroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget-object p2, Lhg4;->C:Lhg4;

    .line 15
    .line 16
    iget-object v0, p2, Lhg4;->k:Lym;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object v2, p0, Lzz1;->c:Lb02;

    .line 26
    .line 27
    iput-wide v0, v2, Lb02;->j:J

    .line 28
    .line 29
    iget-object v0, p0, Lzz1;->b:Ljava/util/List;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p2, Lhg4;->k:Lym;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    sget-object v0, Lmz1;->Fa:Liz1;

    .line 53
    .line 54
    sget-object v1, Ltw1;->e:Ltw1;

    .line 55
    .line 56
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-long v0, v0

    .line 69
    add-long/2addr p1, v0

    .line 70
    iput-wide p1, v2, Lb02;->i:J

    .line 71
    .line 72
    iget-object p1, v2, Lb02;->e:Lfu1;

    .line 73
    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    new-instance p1, Lfu1;

    .line 77
    .line 78
    const/4 p2, 0x7

    .line 79
    invoke-direct {p1, p2, v2}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, v2, Lb02;->e:Lfu1;

    .line 83
    .line 84
    :cond_1
    invoke-virtual {v2}, Lb02;->d()V

    .line 85
    .line 86
    .line 87
    new-instance p1, Landroid/util/Pair;

    .line 88
    .line 89
    const-string p2, "pe"

    .line 90
    .line 91
    const-string v0, "pact_reqpmc"

    .line 92
    .line 93
    invoke-direct {p1, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    filled-new-array {p1}, [Landroid/util/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const-string p2, "pact_action"

    .line 101
    .line 102
    iget-object v0, p0, Lzz1;->e:Lpv2;

    .line 103
    .line 104
    invoke-static {v0, p2, p1}, La30;->B(Lpv2;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    return-void
.end method

.method public final f(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "gpa"

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lzz1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    const-string v1, "pact_con"

    .line 22
    .line 23
    new-instance v2, Landroid/util/Pair;

    .line 24
    .line 25
    const-string v3, "pe"

    .line 26
    .line 27
    invoke-direct {v2, v3, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    filled-new-array {v2}, [Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "pact_action"

    .line 35
    .line 36
    iget-object v3, p0, Lzz1;->e:Lpv2;

    .line 37
    .line 38
    invoke-static {v3, v2, v1}, La30;->B(Lpv2;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lzz1;->c:Lb02;

    .line 42
    .line 43
    const-string v2, "paw_id"

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v1, v0}, Lb02;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 54
    .line 55
    .line 56
    :cond_0
    :goto_0
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2}, Lil;->f(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final g(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzz1;->d:Lil;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lil;->g(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
