.class public final Lmc4;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Lya4;

.field public final j:Lhp2;


# direct methods
.method public constructor <init>(Lka4;)V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lf74;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lhp2;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lmc4;->j:Lhp2;

    .line 12
    .line 13
    :try_start_0
    new-instance v1, Lya4;

    .line 14
    .line 15
    invoke-direct {v1, p1, p0}, Lya4;-><init>(Lka4;Lmc4;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lmc4;->i:Lya4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lhp2;->a()Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 26
    .line 27
    invoke-virtual {v0}, Lhp2;->a()Z

    .line 28
    .line 29
    .line 30
    throw p1
.end method


# virtual methods
.method public final C1()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->C1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final D1()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->D1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final H1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->H1()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final I1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->j2()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final J1()Lo42;
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->J1()Lo42;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final K1()Loz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->K1()Loz1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final N1()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->N1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final O1()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->O1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final Q1()J
    .locals 2

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->Q1()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final R1()J
    .locals 2

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->R1()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final S1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->S1()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final T1()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->T1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final U1()J
    .locals 2

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->n2()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final V1()J
    .locals 2

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->o2()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->d()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->j2()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final o1()J
    .locals 2

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lya4;->o1()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final u1(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc4;->j:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmc4;->i:Lya4;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lya4;->u1(IJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
