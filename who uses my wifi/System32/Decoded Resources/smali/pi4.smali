.class public final Lpi4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lli4;


# instance fields
.field public final a:Lli4;

.field public final b:J


# direct methods
.method public constructor <init>(Lli4;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpi4;->a:Lli4;

    .line 5
    .line 6
    iput-wide p2, p0, Lpi4;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lmr2;Lvw3;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lpi4;->a:Lli4;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lli4;->a(Lmr2;Lvw3;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p3, -0x4

    .line 8
    if-ne p1, p3, :cond_0

    .line 9
    .line 10
    iget-wide v0, p2, Lvw3;->g:J

    .line 11
    .line 12
    iget-wide v2, p0, Lpi4;->b:J

    .line 13
    .line 14
    add-long/2addr v0, v2

    .line 15
    iput-wide v0, p2, Lvw3;->g:J

    .line 16
    .line 17
    return p3

    .line 18
    :cond_0
    return p1
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lpi4;->a:Lli4;

    .line 2
    .line 3
    invoke-interface {v0}, Lli4;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lpi4;->a:Lli4;

    .line 2
    .line 3
    iget-wide v1, p0, Lpi4;->b:J

    .line 4
    .line 5
    sub-long/2addr p1, v1

    .line 6
    invoke-interface {v0, p1, p2}, Lli4;->f(J)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lpi4;->a:Lli4;

    .line 2
    .line 3
    invoke-interface {v0}, Lli4;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
