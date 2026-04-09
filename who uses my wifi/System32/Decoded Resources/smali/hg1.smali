.class public final Lhg1;
.super Lsf1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic b:Lcg1;

.field public final synthetic c:Lue;


# direct methods
.method public constructor <init>(Lue;Lcg1;Lcg1;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lhg1;->b:Lcg1;

    .line 2
    .line 3
    iput-object p1, p0, Lhg1;->c:Lue;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lsf1;-><init>(Lcg1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(J)Lbg1;
    .locals 8

    .line 1
    iget-object v0, p0, Lhg1;->b:Lcg1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcg1;->b(J)Lbg1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p1, Lbg1;->a:Ldg1;

    .line 8
    .line 9
    new-instance v0, Lbg1;

    .line 10
    .line 11
    new-instance v1, Ldg1;

    .line 12
    .line 13
    iget-wide v2, p2, Ldg1;->a:J

    .line 14
    .line 15
    iget-wide v4, p2, Ldg1;->b:J

    .line 16
    .line 17
    iget-object p2, p0, Lhg1;->c:Lue;

    .line 18
    .line 19
    iget-wide v6, p2, Lue;->g:J

    .line 20
    .line 21
    add-long/2addr v4, v6

    .line 22
    invoke-direct {v1, v2, v3, v4, v5}, Ldg1;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lbg1;->b:Ldg1;

    .line 26
    .line 27
    new-instance p2, Ldg1;

    .line 28
    .line 29
    iget-wide v2, p1, Ldg1;->a:J

    .line 30
    .line 31
    iget-wide v4, p1, Ldg1;->b:J

    .line 32
    .line 33
    add-long/2addr v4, v6

    .line 34
    invoke-direct {p2, v2, v3, v4, v5}, Ldg1;-><init>(JJ)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, p2}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
