.class public final Lql2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lqm2;

.field public final d:Lga4;


# direct methods
.method public constructor <init>(Lba4;Lqh2;Lqm2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lql2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql2;->b:Lga4;

    iput-object p2, p0, Lql2;->d:Lga4;

    iput-object p3, p0, Lql2;->c:Lqm2;

    return-void
.end method

.method public synthetic constructor <init>(Lga4;Lqm2;Lga4;I)V
    .locals 0

    .line 3
    iput p4, p0, Lql2;->a:I

    iput-object p1, p0, Lql2;->b:Lga4;

    iput-object p2, p0, Lql2;->c:Lqm2;

    iput-object p3, p0, Lql2;->d:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lqm2;Lba4;Lfh2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lql2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql2;->c:Lqm2;

    iput-object p2, p0, Lql2;->b:Lga4;

    iput-object p3, p0, Lql2;->d:Lga4;

    return-void
.end method


# virtual methods
.method public a()Le33;
    .locals 6

    .line 1
    sget-object v1, Lmd2;->a:Lld2;

    .line 2
    .line 3
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lql2;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Lbv2;

    .line 14
    .line 15
    iget-object v0, p0, Lql2;->c:Lqm2;

    .line 16
    .line 17
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v0, p0, Lql2;->d:Lga4;

    .line 22
    .line 23
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v4, v0

    .line 28
    check-cast v4, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v0, Le33;

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    invoke-direct/range {v0 .. v5}, Le33;-><init>(Lpq3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public b()Le33;
    .locals 5

    .line 1
    iget-object v0, p0, Lql2;->b:Lga4;

    .line 2
    .line 3
    check-cast v0, Lhh2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lmd2;->a:Lld2;

    .line 10
    .line 11
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lql2;->c:Lqm2;

    .line 15
    .line 16
    invoke-virtual {v2}, Lqm2;->a()Ll83;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, Lql2;->d:Lga4;

    .line 21
    .line 22
    check-cast v3, Lph2;

    .line 23
    .line 24
    invoke-virtual {v3}, Lph2;->a()Le51;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Le33;

    .line 29
    .line 30
    invoke-direct {v4, v0, v1, v2, v3}, Le33;-><init>(Landroid/content/Context;Lpq3;Ll83;Le51;)V

    .line 31
    .line 32
    .line 33
    return-object v4
.end method

.method public final d()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lql2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lql2;->b()Le33;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    sget-object v2, Lmd2;->a:Lld2;

    .line 12
    .line 13
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lql2;->c:Lqm2;

    .line 17
    .line 18
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v0, p0, Lql2;->b:Lga4;

    .line 23
    .line 24
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/content/pm/PackageInfo;

    .line 30
    .line 31
    iget-object v0, p0, Lql2;->d:Lga4;

    .line 32
    .line 33
    check-cast v0, Lfh2;

    .line 34
    .line 35
    invoke-virtual {v0}, Lfh2;->a()Lra4;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    new-instance v1, Le33;

    .line 40
    .line 41
    const/4 v6, 0x5

    .line 42
    invoke-direct/range {v1 .. v6}, Le33;-><init>(Ljava/lang/Object;Ll83;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :pswitch_1
    invoke-virtual {p0}, Lql2;->a()Le33;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_2
    iget-object v0, p0, Lql2;->b:Lga4;

    .line 52
    .line 53
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lym;

    .line 58
    .line 59
    iget-object v1, p0, Lql2;->d:Lga4;

    .line 60
    .line 61
    check-cast v1, Lqh2;

    .line 62
    .line 63
    invoke-virtual {v1}, Lqh2;->a()Lid2;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, p0, Lql2;->c:Lqm2;

    .line 68
    .line 69
    invoke-virtual {v2}, Lqm2;->a()Ll83;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-object v2, v2, Ll83;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, v1, Lid2;->h:Ll92;

    .line 76
    .line 77
    new-instance v4, Ldd2;

    .line 78
    .line 79
    monitor-enter v3

    .line 80
    :try_start_0
    iget-object v5, v3, Ll92;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ljava/math/BigInteger;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-object v6, v3, Ll92;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, Ljava/math/BigInteger;

    .line 91
    .line 92
    sget-object v7, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    iput-object v6, v3, Ll92;->f:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, v3, Ll92;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    monitor-exit v3

    .line 103
    invoke-direct {v4, v0, v1, v5, v2}, Ldd2;-><init>(Lym;Lid2;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v4

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw v0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
