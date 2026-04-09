.class public final Lgw1;
.super Lmw1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Lbx2;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbx2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmw1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgw1;->f:Lbx2;

    .line 5
    .line 6
    iput-object p2, p0, Lgw1;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final I(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final W(Lnx2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgw1;->f:Lbx2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lnx2;->b()Lu70;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lbx2;->q(Lu70;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d3(Lkw1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgw1;->f:Lbx2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lhw1;

    .line 6
    .line 7
    iget-object v2, p0, Lgw1;->g:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v1, p1, v2}, Lhw1;-><init>(Lkw1;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lbx2;->r(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
