.class public final Lew2;
.super Ln22;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:Lf20;

.field public final synthetic g:Lfw2;


# direct methods
.method public constructor <init>(Lfw2;Lf20;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lew2;->f:Lf20;

    .line 2
    .line 3
    iput-object p1, p0, Lew2;->g:Lfw2;

    .line 4
    .line 5
    invoke-direct {p0}, Ln22;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final I(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lew2;->g:Lfw2;

    .line 2
    .line 3
    iget-wide v0, v0, Lfw2;->a:J

    .line 4
    .line 5
    new-instance v2, Lbu1;

    .line 6
    .line 7
    const-string v3, "interstitial"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, v2, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "onAdFailedToLoad"

    .line 19
    .line 20
    iput-object v0, v2, Lbu1;->i:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, v2, Lbu1;->j:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object p1, p0, Lew2;->f:Lf20;

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Lf20;->r(Lbu1;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final W(Lnx2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lew2;->g:Lfw2;

    .line 2
    .line 3
    iget-wide v0, v0, Lfw2;->a:J

    .line 4
    .line 5
    iget p1, p1, Lnx2;->f:I

    .line 6
    .line 7
    new-instance v2, Lbu1;

    .line 8
    .line 9
    const-string v3, "interstitial"

    .line 10
    .line 11
    invoke-direct {v2, v3}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, v2, Lbu1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v0, "onAdFailedToLoad"

    .line 21
    .line 22
    iput-object v0, v2, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v2, Lbu1;->j:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object p1, p0, Lew2;->f:Lf20;

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Lf20;->r(Lbu1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lew2;->g:Lfw2;

    .line 2
    .line 3
    iget-wide v0, v0, Lfw2;->a:J

    .line 4
    .line 5
    new-instance v2, Lbu1;

    .line 6
    .line 7
    const-string v3, "interstitial"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, v2, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "onAdLoaded"

    .line 19
    .line 20
    iput-object v0, v2, Lbu1;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v0, p0, Lew2;->f:Lf20;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lew2;->g:Lfw2;

    .line 2
    .line 3
    iget-wide v0, v0, Lfw2;->a:J

    .line 4
    .line 5
    new-instance v2, Lbu1;

    .line 6
    .line 7
    const-string v3, "interstitial"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, v2, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "onAdOpened"

    .line 19
    .line 20
    iput-object v0, v2, Lbu1;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v0, p0, Lew2;->f:Lf20;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lew2;->g:Lfw2;

    .line 2
    .line 3
    iget-wide v0, v0, Lfw2;->a:J

    .line 4
    .line 5
    new-instance v2, Lbu1;

    .line 6
    .line 7
    const-string v3, "interstitial"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, v2, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "onAdClicked"

    .line 19
    .line 20
    iput-object v0, v2, Lbu1;->i:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v2}, Lbu1;->j()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lew2;->f:Lf20;

    .line 27
    .line 28
    iget-object v1, v1, Lf20;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lm42;

    .line 31
    .line 32
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-virtual {v1, v2, v0}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final g()V
    .locals 0

    .line 1
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lew2;->g:Lfw2;

    .line 2
    .line 3
    iget-wide v0, v0, Lfw2;->a:J

    .line 4
    .line 5
    new-instance v2, Lbu1;

    .line 6
    .line 7
    const-string v3, "interstitial"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, v2, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "onAdClosed"

    .line 19
    .line 20
    iput-object v0, v2, Lbu1;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v0, p0, Lew2;->f:Lf20;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lf20;->r(Lbu1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
