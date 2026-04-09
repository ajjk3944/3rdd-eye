.class public final Loj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lga4;

.field public final b:Lga4;

.field public final c:Lga4;

.field public final d:Lll2;

.field public final e:Lll2;

.field public final f:Lga4;

.field public final g:Lba4;

.field public final h:Lca4;

.field public final i:Lca4;

.field public final j:Lga4;

.field public final k:Lga4;

.field public final l:Lga4;

.field public final m:Lga4;

.field public final n:Lba4;

.field public final o:Lba4;


# direct methods
.method public constructor <init>(Lhh2;Lba4;Lba4;Lll2;Lll2;Lba4;Lba4;Lca4;Lca4;Lba4;Lba4;Lba4;Lpm2;Lba4;Lba4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loj2;->a:Lga4;

    .line 5
    .line 6
    iput-object p2, p0, Loj2;->b:Lga4;

    .line 7
    .line 8
    iput-object p3, p0, Loj2;->c:Lga4;

    .line 9
    .line 10
    iput-object p4, p0, Loj2;->d:Lll2;

    .line 11
    .line 12
    iput-object p5, p0, Loj2;->e:Lll2;

    .line 13
    .line 14
    iput-object p6, p0, Loj2;->f:Lga4;

    .line 15
    .line 16
    iput-object p7, p0, Loj2;->g:Lba4;

    .line 17
    .line 18
    iput-object p8, p0, Loj2;->h:Lca4;

    .line 19
    .line 20
    iput-object p9, p0, Loj2;->i:Lca4;

    .line 21
    .line 22
    iput-object p10, p0, Loj2;->j:Lga4;

    .line 23
    .line 24
    iput-object p11, p0, Loj2;->k:Lga4;

    .line 25
    .line 26
    iput-object p12, p0, Loj2;->l:Lga4;

    .line 27
    .line 28
    iput-object p13, p0, Loj2;->m:Lga4;

    .line 29
    .line 30
    iput-object p14, p0, Loj2;->n:Lba4;

    .line 31
    .line 32
    iput-object p15, p0, Loj2;->o:Lba4;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Loj2;->a:Lga4;

    .line 4
    .line 5
    check-cast v1, Lhh2;

    .line 6
    .line 7
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, Lmd2;->a:Lld2;

    .line 12
    .line 13
    invoke-static {v4}, Li41;->M(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Loj2;->b:Lga4;

    .line 17
    .line 18
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v5, v1

    .line 23
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    iget-object v1, v0, Loj2;->c:Lga4;

    .line 26
    .line 27
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v6, v1

    .line 32
    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    iget-object v1, v0, Loj2;->d:Lll2;

    .line 35
    .line 36
    invoke-virtual {v1}, Lll2;->b()Lh83;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    iget-object v1, v0, Loj2;->e:Lll2;

    .line 41
    .line 42
    invoke-virtual {v1}, Lll2;->a()La83;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    iget-object v1, v0, Loj2;->f:Lga4;

    .line 47
    .line 48
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    move-object v9, v1

    .line 53
    check-cast v9, Ldb3;

    .line 54
    .line 55
    iget-object v1, v0, Loj2;->g:Lba4;

    .line 56
    .line 57
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v10, v1

    .line 62
    check-cast v10, Lq83;

    .line 63
    .line 64
    iget-object v1, v0, Loj2;->h:Lca4;

    .line 65
    .line 66
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v11, v1

    .line 71
    check-cast v11, Landroid/view/View;

    .line 72
    .line 73
    iget-object v1, v0, Loj2;->i:Lca4;

    .line 74
    .line 75
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v12, v1

    .line 80
    check-cast v12, Lag2;

    .line 81
    .line 82
    iget-object v1, v0, Loj2;->j:Lga4;

    .line 83
    .line 84
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v13, v1

    .line 89
    check-cast v13, Lvs1;

    .line 90
    .line 91
    iget-object v1, v0, Loj2;->k:Lga4;

    .line 92
    .line 93
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    move-object v14, v1

    .line 98
    check-cast v14, Lf02;

    .line 99
    .line 100
    iget-object v1, v0, Loj2;->l:Lga4;

    .line 101
    .line 102
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lda3;

    .line 107
    .line 108
    iget-object v1, v0, Loj2;->m:Lga4;

    .line 109
    .line 110
    check-cast v1, Lpm2;

    .line 111
    .line 112
    iget-object v1, v1, Lpm2;->a:Lmm2;

    .line 113
    .line 114
    iget-object v1, v1, Lmm2;->e:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v15, v1

    .line 117
    check-cast v15, Lt83;

    .line 118
    .line 119
    iget-object v1, v0, Loj2;->n:Lba4;

    .line 120
    .line 121
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    move-object/from16 v16, v1

    .line 126
    .line 127
    check-cast v16, Lao2;

    .line 128
    .line 129
    iget-object v1, v0, Loj2;->o:Lba4;

    .line 130
    .line 131
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object/from16 v17, v1

    .line 136
    .line 137
    check-cast v17, Lgm2;

    .line 138
    .line 139
    new-instance v2, Lnj2;

    .line 140
    .line 141
    invoke-direct/range {v2 .. v17}, Lnj2;-><init>(Landroid/content/Context;Lld2;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lh83;La83;Ldb3;Lq83;Landroid/view/View;Lag2;Lvs1;Lf02;Lt83;Lao2;Lgm2;)V

    .line 142
    .line 143
    .line 144
    return-object v2
.end method
