.class public final Lhw2;
.super Lab2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:Liw2;


# direct methods
.method public constructor <init>(Liw2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    invoke-direct {p0}, Lab2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final U0(Lva2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    new-instance v0, Lbu1;

    .line 8
    .line 9
    const-string v4, "rewarded"

    .line 10
    .line 11
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "onUserEarnedReward"

    .line 21
    .line 22
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {p1}, Lva2;->b()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, v0, Lbu1;->k:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1}, Lva2;->c()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, v0, Lbu1;->l:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    new-instance v0, Lbu1;

    .line 8
    .line 9
    const-string v4, "rewarded"

    .line 10
    .line 11
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "onRewardedAdOpened"

    .line 21
    .line 22
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    new-instance v0, Lbu1;

    .line 8
    .line 9
    const-string v4, "rewarded"

    .line 10
    .line 11
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "onRewardedAdClosed"

    .line 21
    .line 22
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    new-instance v0, Lbu1;

    .line 8
    .line 9
    const-string v4, "rewarded"

    .line 10
    .line 11
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "onAdImpression"

    .line 21
    .line 22
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    new-instance v0, Lbu1;

    .line 8
    .line 9
    const-string v4, "rewarded"

    .line 10
    .line 11
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "onAdClicked"

    .line 21
    .line 22
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final t2(Lnx2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    iget p1, p1, Lnx2;->f:I

    .line 8
    .line 9
    new-instance v0, Lbu1;

    .line 10
    .line 11
    const-string v4, "rewarded"

    .line 12
    .line 13
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 21
    .line 22
    const-string v2, "onRewardedAdFailedToShow"

    .line 23
    .line 24
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, v0, Lbu1;->j:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final z(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->f:Liw2;

    .line 2
    .line 3
    iget-object v1, v0, Liw2;->b:Lf20;

    .line 4
    .line 5
    iget-wide v2, v0, Liw2;->a:J

    .line 6
    .line 7
    new-instance v0, Lbu1;

    .line 8
    .line 9
    const-string v4, "rewarded"

    .line 10
    .line 11
    invoke-direct {v0, v4}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "onRewardedAdFailedToShow"

    .line 21
    .line 22
    iput-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, Lbu1;->j:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lf20;->r(Lbu1;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
