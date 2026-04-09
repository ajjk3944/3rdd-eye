.class public final Lon1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public synthetic constructor <init>(IJ)V
    .locals 0

    .line 1
    iput p1, p0, Lon1;->a:I

    .line 2
    .line 3
    iput-wide p2, p0, Lon1;->b:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static a(Lmf1;Lkz2;)Lon1;
    .locals 3

    .line 1
    iget-object v0, p1, Lkz2;->a:[B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p0, v0, v2, v1}, Lmf1;->u([BII)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v2}, Lkz2;->E(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lkz2;->b()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {p1}, Lkz2;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-instance p1, Lon1;

    .line 21
    .line 22
    invoke-direct {p1, p0, v0, v1}, Lon1;-><init>(IJ)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method
