.class public final Ll13;
.super Lj13;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lth2;

.field public final b:Lmm2;

.field public final c:Lf23;

.field public final d:Lfp2;

.field public final e:Lvq2;

.field public final f:Lgo2;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Lwo2;

.field public final i:Lo13;

.field public final j:Le03;


# direct methods
.method public constructor <init>(Lth2;Lmm2;Lf23;Lfp2;Lvq2;Lgo2;Landroid/view/ViewGroup;Lwo2;Lo13;Le03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll13;->a:Lth2;

    .line 5
    .line 6
    iput-object p2, p0, Ll13;->b:Lmm2;

    .line 7
    .line 8
    iput-object p3, p0, Ll13;->c:Lf23;

    .line 9
    .line 10
    iput-object p4, p0, Ll13;->d:Lfp2;

    .line 11
    .line 12
    iput-object p5, p0, Ll13;->e:Lvq2;

    .line 13
    .line 14
    iput-object p6, p0, Ll13;->f:Lgo2;

    .line 15
    .line 16
    iput-object p7, p0, Ll13;->g:Landroid/view/ViewGroup;

    .line 17
    .line 18
    iput-object p8, p0, Ll13;->h:Lwo2;

    .line 19
    .line 20
    iput-object p9, p0, Ll13;->i:Lo13;

    .line 21
    .line 22
    iput-object p10, p0, Ll13;->j:Le03;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final c(Ll83;Landroid/os/Bundle;La83;Lh83;)Lq93;
    .locals 13

    .line 1
    iget-object v0, p0, Ll13;->b:Lmm2;

    .line 2
    .line 3
    iput-object p1, v0, Lmm2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, v0, Lmm2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v1, Lt83;

    .line 8
    .line 9
    const/16 v5, 0x13

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v4, p0, Ll13;->i:Lo13;

    .line 13
    .line 14
    move-object/from16 v3, p3

    .line 15
    .line 16
    move-object/from16 v2, p4

    .line 17
    .line 18
    invoke-direct/range {v1 .. v6}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lmm2;->e:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p1, Lmz1;->V3:Liz1;

    .line 24
    .line 25
    sget-object v1, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Ll13;->j:Le03;

    .line 42
    .line 43
    iput-object p1, v0, Lmm2;->f:Ljava/lang/Object;

    .line 44
    .line 45
    :cond_0
    iget-object p1, p0, Ll13;->a:Lth2;

    .line 46
    .line 47
    iget-object v2, p1, Lth2;->b:Lth2;

    .line 48
    .line 49
    new-instance v7, Lmm2;

    .line 50
    .line 51
    invoke-direct {v7, v0}, Lmm2;-><init>(Lmm2;)V

    .line 52
    .line 53
    .line 54
    new-instance v10, Ll92;

    .line 55
    .line 56
    iget-object p1, p0, Ll13;->f:Lgo2;

    .line 57
    .line 58
    iget-object v0, p0, Ll13;->h:Lwo2;

    .line 59
    .line 60
    invoke-direct {v10, p1, v0}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lug0;

    .line 64
    .line 65
    const/16 p1, 0x13

    .line 66
    .line 67
    iget-object v0, p0, Ll13;->g:Landroid/view/ViewGroup;

    .line 68
    .line 69
    invoke-direct {v3, p1, v0}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-class p1, Lfp2;

    .line 73
    .line 74
    iget-object v6, p0, Ll13;->d:Lfp2;

    .line 75
    .line 76
    invoke-static {v6, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    const-class p1, Lf23;

    .line 80
    .line 81
    iget-object v9, p0, Ll13;->c:Lf23;

    .line 82
    .line 83
    invoke-static {v9, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    new-instance v8, Lf23;

    .line 87
    .line 88
    const/16 p1, 0x19

    .line 89
    .line 90
    invoke-direct {v8, p1}, Lf23;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const-class p1, Lvq2;

    .line 94
    .line 95
    iget-object v4, p0, Ll13;->e:Lvq2;

    .line 96
    .line 97
    invoke-static {v4, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    new-instance v1, Lbi2;

    .line 101
    .line 102
    new-instance v5, Ltv2;

    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-direct {v5, p1, v0}, Ltv2;-><init>(IB)V

    .line 107
    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    invoke-direct/range {v1 .. v12}, Lbi2;-><init>(Lth2;Lug0;Lvq2;Ltv2;Lfp2;Lmm2;Lf23;Lf23;Ll92;Lm73;Lb73;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, v1, Lbi2;->r:Lba4;

    .line 115
    .line 116
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Lnl2;

    .line 121
    .line 122
    invoke-virtual {p1}, Lnl2;->b()Lq93;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Lnl2;->c(Ln70;)Lq93;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method
