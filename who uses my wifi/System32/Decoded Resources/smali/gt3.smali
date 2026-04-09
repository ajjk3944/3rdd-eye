.class public final Lgt3;
.super Ld42;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Lum;

.field public final g:Lk52;


# direct methods
.method public constructor <init>(Lum;Lk52;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld42;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgt3;->f:Lum;

    .line 5
    .line 6
    iput-object p2, p0, Lgt3;->g:Lk52;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final O(Lnx2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgt3;->f:Lum;

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
    invoke-virtual {v0, p1}, Lum;->q(Lu70;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgt3;->f:Lum;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lgt3;->g:Lk52;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lum;->r(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
