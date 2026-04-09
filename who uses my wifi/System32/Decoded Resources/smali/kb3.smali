.class public final Lkb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:J

.field public final b:J

.field public c:J

.field public d:J

.field public e:J

.field public final f:Ljava/util/Random;


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x5

    .line 5
    .line 6
    iput-wide v0, p0, Lkb3;->d:J

    .line 7
    .line 8
    new-instance v0, Ljava/util/Random;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lkb3;->f:Ljava/util/Random;

    .line 14
    .line 15
    iput-wide p1, p0, Lkb3;->a:J

    .line 16
    .line 17
    iput-wide p3, p0, Lkb3;->b:J

    .line 18
    .line 19
    iput-wide p1, p0, Lkb3;->e:J

    .line 20
    .line 21
    const-wide/16 p1, 0x0

    .line 22
    .line 23
    iput-wide p1, p0, Lkb3;->c:J

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 6

    .line 1
    sget-object v0, Lmz1;->G:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-gez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-wide v2, p0, Lkb3;->c:J

    .line 21
    .line 22
    iget-wide v4, p0, Lkb3;->d:J

    .line 23
    .line 24
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    int-to-long v0, v0

    .line 37
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    cmp-long v0, v2, v0

    .line 42
    .line 43
    if-lez v0, :cond_1

    .line 44
    .line 45
    iget-wide v0, p0, Lkb3;->e:J

    .line 46
    .line 47
    iget-wide v2, p0, Lkb3;->b:J

    .line 48
    .line 49
    cmp-long v0, v0, v2

    .line 50
    .line 51
    if-ltz v0, :cond_1

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    return v0

    .line 55
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 56
    return v0
.end method
