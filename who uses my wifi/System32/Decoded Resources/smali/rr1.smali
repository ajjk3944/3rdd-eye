.class public final Lrr1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lba4;

.field public final d:Lba4;

.field public final e:Lba4;

.field public final f:Lba4;

.field public final g:Lga4;

.field public final h:Lga4;

.field public final i:Lga4;

.field public final j:Lga4;

.field public final k:Lga4;

.field public final l:Lga4;

.field public final m:Lca4;


# direct methods
.method public constructor <init>(Lba4;Lga4;Lga4;Lri2;Lga4;Lba4;Lga4;Lba4;Le02;Lqm2;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrr1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr1;->b:Lba4;

    iput-object p2, p0, Lrr1;->g:Lga4;

    iput-object p3, p0, Lrr1;->h:Lga4;

    iput-object p4, p0, Lrr1;->i:Lga4;

    iput-object p5, p0, Lrr1;->j:Lga4;

    iput-object p6, p0, Lrr1;->c:Lba4;

    iput-object p7, p0, Lrr1;->k:Lga4;

    iput-object p8, p0, Lrr1;->d:Lba4;

    iput-object p9, p0, Lrr1;->l:Lga4;

    iput-object p10, p0, Lrr1;->m:Lca4;

    iput-object p11, p0, Lrr1;->e:Lba4;

    iput-object p12, p0, Lrr1;->f:Lba4;

    return-void
.end method

.method public constructor <init>(Lda4;Lhh2;Lba4;Lba4;Lba4;Lba4;Lba4;Lph2;Le02;Lba4;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lrr1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr1;->g:Lga4;

    iput-object p2, p0, Lrr1;->h:Lga4;

    iput-object p3, p0, Lrr1;->b:Lba4;

    iput-object p4, p0, Lrr1;->c:Lba4;

    iput-object p5, p0, Lrr1;->d:Lba4;

    iput-object p6, p0, Lrr1;->e:Lba4;

    iput-object p7, p0, Lrr1;->f:Lba4;

    iput-object p8, p0, Lrr1;->l:Lga4;

    iput-object p9, p0, Lrr1;->m:Lca4;

    iput-object p10, p0, Lrr1;->i:Lga4;

    iput-object p11, p0, Lrr1;->j:Lga4;

    iput-object p12, p0, Lrr1;->k:Lga4;

    return-void
.end method

.method public constructor <init>(Lga4;Lba4;Lba4;Lba4;Lba4;Lga4;Lba4;Lga4;Lba4;Lba4;Lnt2;Lba4;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lrr1;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr1;->g:Lga4;

    iput-object p2, p0, Lrr1;->b:Lba4;

    iput-object p3, p0, Lrr1;->c:Lba4;

    iput-object p4, p0, Lrr1;->d:Lba4;

    iput-object p5, p0, Lrr1;->e:Lba4;

    iput-object p6, p0, Lrr1;->h:Lga4;

    iput-object p7, p0, Lrr1;->f:Lba4;

    iput-object p8, p0, Lrr1;->l:Lga4;

    iput-object p9, p0, Lrr1;->i:Lga4;

    iput-object p10, p0, Lrr1;->j:Lga4;

    iput-object p11, p0, Lrr1;->m:Lca4;

    iput-object p12, p0, Lrr1;->k:Lga4;

    return-void
.end method


# virtual methods
.method public a()Lkm2;
    .locals 15

    .line 1
    iget-object v0, p0, Lrr1;->b:Lba4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lu93;

    .line 9
    .line 10
    iget-object v0, p0, Lrr1;->g:Lga4;

    .line 11
    .line 12
    check-cast v0, Lph2;

    .line 13
    .line 14
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v0, p0, Lrr1;->h:Lga4;

    .line 19
    .line 20
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v4, v0

    .line 25
    check-cast v4, Landroid/content/pm/ApplicationInfo;

    .line 26
    .line 27
    iget-object v0, p0, Lrr1;->i:Lga4;

    .line 28
    .line 29
    check-cast v0, Lri2;

    .line 30
    .line 31
    iget-object v0, v0, Lri2;->b:Lga4;

    .line 32
    .line 33
    check-cast v0, Lhh2;

    .line 34
    .line 35
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v5}, Li41;->M(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lmz1;->a:Liz1;

    .line 47
    .line 48
    sget-object v0, Ltw1;->e:Ltw1;

    .line 49
    .line 50
    iget-object v0, v0, Ltw1;->a:Lxb4;

    .line 51
    .line 52
    invoke-virtual {v0}, Lxb4;->H()Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    iget-object v0, p0, Lrr1;->j:Lga4;

    .line 57
    .line 58
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v7, v0

    .line 63
    check-cast v7, Landroid/content/pm/PackageInfo;

    .line 64
    .line 65
    iget-object v0, p0, Lrr1;->c:Lba4;

    .line 66
    .line 67
    invoke-static {v0}, Lba4;->b(Lga4;)Lz94;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    iget-object v0, p0, Lrr1;->k:Lga4;

    .line 72
    .line 73
    check-cast v0, Lfh2;

    .line 74
    .line 75
    invoke-virtual {v0}, Lfh2;->a()Lra4;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    iget-object v0, p0, Lrr1;->d:Lba4;

    .line 80
    .line 81
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v10, v0

    .line 86
    check-cast v10, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v0, p0, Lrr1;->l:Lga4;

    .line 89
    .line 90
    check-cast v0, Le02;

    .line 91
    .line 92
    invoke-virtual {v0}, Le02;->c()Ls53;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    iget-object v0, p0, Lrr1;->m:Lca4;

    .line 97
    .line 98
    check-cast v0, Lqm2;

    .line 99
    .line 100
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    iget-object v0, p0, Lrr1;->e:Lba4;

    .line 105
    .line 106
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    move-object v13, v0

    .line 111
    check-cast v13, Lbp2;

    .line 112
    .line 113
    iget-object v0, p0, Lrr1;->f:Lba4;

    .line 114
    .line 115
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    new-instance v1, Lkm2;

    .line 126
    .line 127
    invoke-direct/range {v1 .. v14}, Lkm2;-><init>(Lu93;Le51;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/pm/PackageInfo;Lz94;Lra4;Ljava/lang/String;Ls53;Ll83;Lbp2;I)V

    .line 128
    .line 129
    .line 130
    return-object v1
.end method

.method public b()Ls13;
    .locals 15

    .line 1
    iget-object v0, p0, Lrr1;->g:Lga4;

    .line 2
    .line 3
    check-cast v0, Lhh2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, p0, Lrr1;->b:Lba4;

    .line 10
    .line 11
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lu93;

    .line 17
    .line 18
    iget-object v0, p0, Lrr1;->c:Lba4;

    .line 19
    .line 20
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v4, v0

    .line 25
    check-cast v4, Lo13;

    .line 26
    .line 27
    iget-object v0, p0, Lrr1;->d:Lba4;

    .line 28
    .line 29
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v5, v0

    .line 34
    check-cast v5, Lvm2;

    .line 35
    .line 36
    iget-object v0, p0, Lrr1;->e:Lba4;

    .line 37
    .line 38
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v6, v0

    .line 43
    check-cast v6, Ldb3;

    .line 44
    .line 45
    iget-object v0, p0, Lrr1;->h:Lga4;

    .line 46
    .line 47
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v7, v0

    .line 52
    check-cast v7, Leb3;

    .line 53
    .line 54
    iget-object v0, p0, Lrr1;->f:Lba4;

    .line 55
    .line 56
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v8, v0

    .line 61
    check-cast v8, Lgl2;

    .line 62
    .line 63
    sget-object v9, Lmd2;->a:Lld2;

    .line 64
    .line 65
    invoke-static {v9}, Li41;->M(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lrr1;->l:Lga4;

    .line 69
    .line 70
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v10, v0

    .line 75
    check-cast v10, Ljava/util/concurrent/ScheduledExecutorService;

    .line 76
    .line 77
    iget-object v0, p0, Lrr1;->i:Lga4;

    .line 78
    .line 79
    check-cast v0, Lba4;

    .line 80
    .line 81
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v11, v0

    .line 86
    check-cast v11, Le03;

    .line 87
    .line 88
    iget-object v0, p0, Lrr1;->j:Lga4;

    .line 89
    .line 90
    check-cast v0, Lba4;

    .line 91
    .line 92
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v12, v0

    .line 97
    check-cast v12, Lda3;

    .line 98
    .line 99
    iget-object v0, p0, Lrr1;->m:Lca4;

    .line 100
    .line 101
    check-cast v0, Lnt2;

    .line 102
    .line 103
    invoke-virtual {v0}, Lnt2;->a()Lh2;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    iget-object v0, p0, Lrr1;->k:Lga4;

    .line 108
    .line 109
    check-cast v0, Lba4;

    .line 110
    .line 111
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    move-object v14, v0

    .line 116
    check-cast v14, Ljv2;

    .line 117
    .line 118
    new-instance v1, Ls13;

    .line 119
    .line 120
    invoke-direct/range {v1 .. v14}, Ls13;-><init>(Landroid/content/Context;Lu93;Lo13;Lvm2;Ldb3;Leb3;Lgl2;Lld2;Ljava/util/concurrent/ScheduledExecutorService;Le03;Lda3;Lh2;Ljv2;)V

    .line 121
    .line 122
    .line 123
    return-object v1
.end method

.method public final d()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lrr1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lrr1;->b()Ls13;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lrr1;->a()Lkm2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :pswitch_1
    iget-object v0, p0, Lrr1;->g:Lga4;

    .line 17
    .line 18
    check-cast v0, Lda4;

    .line 19
    .line 20
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v2, v0

    .line 23
    check-cast v2, Lth2;

    .line 24
    .line 25
    iget-object v0, p0, Lrr1;->h:Lga4;

    .line 26
    .line 27
    check-cast v0, Lhh2;

    .line 28
    .line 29
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v0, p0, Lrr1;->b:Lba4;

    .line 34
    .line 35
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v4, v0

    .line 40
    check-cast v4, Lvs1;

    .line 41
    .line 42
    iget-object v0, p0, Lrr1;->c:Lba4;

    .line 43
    .line 44
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v5, v0

    .line 49
    check-cast v5, Lv83;

    .line 50
    .line 51
    sget-object v6, Lmd2;->a:Lld2;

    .line 52
    .line 53
    invoke-static {v6}, Li41;->M(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lrr1;->d:Lba4;

    .line 57
    .line 58
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v7, v0

    .line 63
    check-cast v7, Ljava/util/concurrent/ScheduledExecutorService;

    .line 64
    .line 65
    iget-object v0, p0, Lrr1;->e:Lba4;

    .line 66
    .line 67
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v8, v0

    .line 72
    check-cast v8, Lpv2;

    .line 73
    .line 74
    iget-object v0, p0, Lrr1;->f:Lba4;

    .line 75
    .line 76
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v9, v0

    .line 81
    check-cast v9, Leb3;

    .line 82
    .line 83
    iget-object v0, p0, Lrr1;->l:Lga4;

    .line 84
    .line 85
    check-cast v0, Lph2;

    .line 86
    .line 87
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    iget-object v0, p0, Lrr1;->m:Lca4;

    .line 92
    .line 93
    check-cast v0, Le02;

    .line 94
    .line 95
    invoke-virtual {v0}, Le02;->a()Lb02;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    iget-object v0, p0, Lrr1;->i:Lga4;

    .line 100
    .line 101
    check-cast v0, Lba4;

    .line 102
    .line 103
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v12, v0

    .line 108
    check-cast v12, Lm83;

    .line 109
    .line 110
    iget-object v0, p0, Lrr1;->j:Lga4;

    .line 111
    .line 112
    check-cast v0, Lba4;

    .line 113
    .line 114
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v13, v0

    .line 119
    check-cast v13, Ljd4;

    .line 120
    .line 121
    iget-object v0, p0, Lrr1;->k:Lga4;

    .line 122
    .line 123
    check-cast v0, Lba4;

    .line 124
    .line 125
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move-object v14, v0

    .line 130
    check-cast v14, Lk63;

    .line 131
    .line 132
    new-instance v1, Lcr1;

    .line 133
    .line 134
    invoke-direct/range {v1 .. v14}, Lcr1;-><init>(Lth2;Landroid/content/Context;Lvs1;Lv83;Lpq3;Ljava/util/concurrent/ScheduledExecutorService;Lpv2;Leb3;Le51;Lb02;Lm83;Ljd4;Lk63;)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
