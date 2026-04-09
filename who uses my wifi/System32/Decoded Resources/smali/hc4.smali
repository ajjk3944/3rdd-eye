.class public final Lhc4;
.super Lah4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lic4;Loz1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhc4;->c:I

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p2}, Lah4;-><init>(Loz1;)V

    .line 3
    new-instance p1, Lez1;

    invoke-direct {p1}, Lez1;-><init>()V

    iput-object p1, p0, Lhc4;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Loz1;Lfk1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhc4;->c:I

    .line 1
    invoke-direct {p0, p1}, Lah4;-><init>(Loz1;)V

    iput-object p2, p0, Lhc4;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(ILez1;J)Lez1;
    .locals 1

    .line 1
    iget v0, p0, Lhc4;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lah4;->b(ILez1;J)Lez1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Lah4;->b:Loz1;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3, p4}, Loz1;->b(ILez1;J)Lez1;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lhc4;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lfk1;

    .line 19
    .line 20
    iput-object p1, p2, Lez1;->b:Lfk1;

    .line 21
    .line 22
    iget-object p1, p1, Lfk1;->b:Lkh1;

    .line 23
    .line 24
    return-object p2

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d(ILsw1;Z)Lsw1;
    .locals 8

    .line 1
    iget v0, p0, Lhc4;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lah4;->d(ILsw1;Z)Lsw1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Lah4;->b:Loz1;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget p1, v1, Lsw1;->c:I

    .line 18
    .line 19
    iget-object p3, p0, Lhc4;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p3, Lez1;

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-virtual {v0, p1, p3, v2, v3}, Loz1;->b(ILez1;J)Lez1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lez1;->b()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object v2, p2, Lsw1;->a:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v3, p2, Lsw1;->b:Ljava/lang/Object;

    .line 38
    .line 39
    iget v4, p2, Lsw1;->c:I

    .line 40
    .line 41
    iget-wide v5, p2, Lsw1;->d:J

    .line 42
    .line 43
    sget-object p1, Lzb2;->b:Lzb2;

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    invoke-virtual/range {v1 .. v7}, Lsw1;->a(Ljava/lang/Object;Ljava/lang/Object;IJZ)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, v1, Lsw1;->e:Z

    .line 52
    .line 53
    :goto_0
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
