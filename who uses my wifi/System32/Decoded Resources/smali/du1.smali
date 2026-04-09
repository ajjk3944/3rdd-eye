.class public final Ldu1;
.super Lhu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final h:Z


# direct methods
.method public constructor <init>(Ljt1;Lfr1;I)V
    .locals 7

    .line 1
    const-string v3, "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8="

    .line 2
    .line 3
    const/16 v6, 0x3d

    .line 4
    .line 5
    const-string v2, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p2

    .line 10
    move v5, p3

    .line 11
    invoke-direct/range {v0 .. v6}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v1, Ljt1;->o:Let1;

    .line 15
    .line 16
    iget-boolean p1, p1, Let1;->a:Z

    .line 17
    .line 18
    iput-boolean p1, v0, Ldu1;->h:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, Lhu1;->a:Ljt1;

    .line 4
    .line 5
    iget-object v1, v1, Ljt1;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-boolean v2, p0, Ldu1;->h:Z

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Long;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iget-object v2, p0, Lhu1;->d:Lfr1;

    .line 29
    .line 30
    monitor-enter v2

    .line 31
    :try_start_0
    invoke-virtual {v2}, Ln54;->b()V

    .line 32
    .line 33
    .line 34
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 35
    .line 36
    check-cast v3, Lqr1;

    .line 37
    .line 38
    invoke-virtual {v3, v0, v1}, Lqr1;->b0(J)V

    .line 39
    .line 40
    .line 41
    monitor-exit v2

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw v0
.end method
