.class public final Lwx2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lqm2;

.field public final d:Lga4;

.field public final e:Lga4;


# direct methods
.method public constructor <init>(Lba4;Lqm2;Lhh2;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwx2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwx2;->b:Lga4;

    iput-object p2, p0, Lwx2;->c:Lqm2;

    iput-object p3, p0, Lwx2;->d:Lga4;

    iput-object p4, p0, Lwx2;->e:Lga4;

    return-void
.end method

.method public constructor <init>(Lga4;Lga4;Lqm2;Lga4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lwx2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwx2;->b:Lga4;

    iput-object p2, p0, Lwx2;->d:Lga4;

    iput-object p3, p0, Lwx2;->c:Lqm2;

    iput-object p4, p0, Lwx2;->e:Lga4;

    return-void
.end method


# virtual methods
.method public a()Le33;
    .locals 7

    .line 1
    iget-object v0, p0, Lwx2;->b:Lga4;

    .line 2
    .line 3
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lf43;

    .line 9
    .line 10
    iget-object v0, p0, Lwx2;->c:Lqm2;

    .line 11
    .line 12
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v0, p0, Lwx2;->d:Lga4;

    .line 17
    .line 18
    check-cast v0, Lhh2;

    .line 19
    .line 20
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v0, p0, Lwx2;->e:Lga4;

    .line 25
    .line 26
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, Lgd2;

    .line 32
    .line 33
    new-instance v1, Le33;

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    invoke-direct/range {v1 .. v6}, Le33;-><init>(Ljava/lang/Object;Ll83;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final d()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwx2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lwx2;->a()Le33;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lwx2;->b:Lga4;

    .line 12
    .line 13
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lvs1;

    .line 18
    .line 19
    iget-object v1, p0, Lwx2;->d:Lga4;

    .line 20
    .line 21
    check-cast v1, Lhh2;

    .line 22
    .line 23
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lwx2;->c:Lqm2;

    .line 28
    .line 29
    invoke-virtual {v2}, Lqm2;->a()Ll83;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, Lwx2;->e:Lga4;

    .line 34
    .line 35
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Long;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    sget-object v5, Lmd2;->a:Lld2;

    .line 46
    .line 47
    invoke-static {v5}, Li41;->M(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v6, Lmz1;->U2:Liz1;

    .line 51
    .line 52
    sget-object v7, Ltw1;->e:Ltw1;

    .line 53
    .line 54
    iget-object v8, v7, Ltw1;->c:Lkz1;

    .line 55
    .line 56
    invoke-virtual {v8, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    const/4 v8, -0x1

    .line 67
    if-eq v6, v8, :cond_0

    .line 68
    .line 69
    iget-object v2, v2, Ll83;->d:Lpc4;

    .line 70
    .line 71
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v2}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, La30;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    :cond_0
    sget-object v2, Lhg4;->C:Lhg4;

    .line 90
    .line 91
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v8

    .line 100
    sub-long/2addr v8, v3

    .line 101
    sget-object v2, Lmz1;->W2:Liz1;

    .line 102
    .line 103
    iget-object v3, v7, Ltw1;->c:Lkz1;

    .line 104
    .line 105
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    int-to-long v2, v2

    .line 116
    cmp-long v2, v8, v2

    .line 117
    .line 118
    if-gez v2, :cond_1

    .line 119
    .line 120
    new-instance v2, Lvx2;

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    invoke-direct {v2, v0, v1, v3}, Lvx2;-><init>(Lvs1;Landroid/content/Context;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v2}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_0

    .line 131
    :cond_1
    new-instance v2, Lvx2;

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    invoke-direct {v2, v0, v1, v3}, Lvx2;-><init>(Lvs1;Landroid/content/Context;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v2}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :goto_0
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
