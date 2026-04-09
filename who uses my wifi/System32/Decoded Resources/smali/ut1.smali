.class public final Lut1;
.super Lhu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final h:J


# direct methods
.method public constructor <init>(Ljt1;Lfr1;JI)V
    .locals 7

    .line 1
    const-string v3, "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc="

    .line 2
    .line 3
    const/16 v6, 0x19

    .line 4
    .line 5
    const-string v2, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p2

    .line 10
    move v5, p5

    .line 11
    invoke-direct/range {v0 .. v6}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    .line 12
    .line 13
    .line 14
    iput-wide p3, v0, Lut1;->h:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lhu1;->d:Lfr1;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    invoke-virtual {v2}, Ln54;->b()V

    .line 18
    .line 19
    .line 20
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 21
    .line 22
    check-cast v3, Lqr1;

    .line 23
    .line 24
    invoke-virtual {v3, v0, v1}, Lqr1;->n0(J)V

    .line 25
    .line 26
    .line 27
    iget-wide v3, p0, Lut1;->h:J

    .line 28
    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    cmp-long v5, v3, v5

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    sub-long/2addr v0, v3

    .line 36
    invoke-virtual {v2}, Ln54;->b()V

    .line 37
    .line 38
    .line 39
    iget-object v5, v2, Ln54;->g:Lp54;

    .line 40
    .line 41
    check-cast v5, Lqr1;

    .line 42
    .line 43
    invoke-virtual {v5, v0, v1}, Lqr1;->O0(J)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ln54;->b()V

    .line 47
    .line 48
    .line 49
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 50
    .line 51
    check-cast v0, Lqr1;

    .line 52
    .line 53
    invoke-virtual {v0, v3, v4}, Lqr1;->R0(J)V

    .line 54
    .line 55
    .line 56
    :cond_0
    monitor-exit v2

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw v0
.end method
