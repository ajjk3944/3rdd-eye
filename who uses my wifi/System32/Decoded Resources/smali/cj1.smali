.class public final Lcj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lak1;


# instance fields
.field public f:J

.field public g:J

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p0, Lcj1;->h:Ljava/lang/Object;

    check-cast v0, Lqj4;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    iput-wide p1, p0, Lcj1;->f:J

    const-wide/32 v0, 0x10000

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcj1;->g:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcj1;->h:Ljava/lang/Object;

    iput-object p2, p0, Lcj1;->i:Ljava/lang/Object;

    iput-wide p3, p0, Lcj1;->f:J

    iput-wide p5, p0, Lcj1;->g:J

    return-void
.end method

.method public static a(Lnb;[B)Lcj1;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lnb;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnb;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Liq1;

    .line 7
    .line 8
    iget-object v0, v0, Liq1;->c:Lr2;

    .line 9
    .line 10
    invoke-static {p1}, Lvp1;->e([B)Lvp1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, v0, Lr2;->h:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lnb;->h(Ljava/util/Optional;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/List;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Long;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/Long;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    const/4 v4, 0x2

    .line 49
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, v0, v1, p1}, Lnb;->j(JLjava/util/Optional;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {}, Lyb;->z()[B

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    invoke-direct {p1, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "3."

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v0, Lcj1;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p0, v0, Lcj1;->i:Ljava/lang/Object;

    .line 89
    .line 90
    iput-wide v2, v0, Lcj1;->f:J

    .line 91
    .line 92
    iput-wide v4, v0, Lcj1;->g:J

    .line 93
    .line 94
    iput-object p1, v0, Lcj1;->h:Ljava/lang/Object;

    .line 95
    .line 96
    return-object v0
.end method


# virtual methods
.method public b(Lmf1;)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lcj1;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    const-wide/16 v4, 0x2

    .line 12
    .line 13
    add-long/2addr v0, v4

    .line 14
    iput-wide v2, p0, Lcj1;->g:J

    .line 15
    .line 16
    neg-long v0, v0

    .line 17
    return-wide v0

    .line 18
    :cond_0
    return-wide v2
.end method

.method public d(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lvq2;

    .line 4
    .line 5
    iget-object v0, v0, Lvq2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, [J

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {v0, p1, p2, v1}, Lv23;->p([JJZ)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    aget-wide p1, v0, p1

    .line 15
    .line 16
    iput-wide p1, p0, Lcj1;->g:J

    .line 17
    .line 18
    return-void
.end method

.method public h()Lcg1;
    .locals 5

    .line 1
    iget-wide v0, p0, Lcj1;->f:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lqf1;

    .line 16
    .line 17
    iget-wide v1, p0, Lcj1;->f:J

    .line 18
    .line 19
    iget-object v3, p0, Lcj1;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lrf1;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v0, v3, v1, v2, v4}, Lqf1;-><init>(Ljava/lang/Object;JI)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
