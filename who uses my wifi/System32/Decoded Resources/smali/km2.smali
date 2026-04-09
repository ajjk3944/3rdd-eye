.class public final Lkm2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lu93;

.field public final b:Le51;

.field public final c:Landroid/content/pm/ApplicationInfo;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;

.field public final f:Landroid/content/pm/PackageInfo;

.field public final g:Lz94;

.field public final h:Ljava/lang/String;

.field public final i:Ls53;

.field public final j:Lra4;

.field public final k:Ll83;

.field public final l:I

.field public final m:Lbp2;


# direct methods
.method public constructor <init>(Lu93;Le51;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/pm/PackageInfo;Lz94;Lra4;Ljava/lang/String;Ls53;Ll83;Lbp2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkm2;->a:Lu93;

    .line 5
    .line 6
    iput-object p2, p0, Lkm2;->b:Le51;

    .line 7
    .line 8
    iput-object p3, p0, Lkm2;->c:Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    iput-object p4, p0, Lkm2;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lkm2;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p6, p0, Lkm2;->f:Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    iput-object p7, p0, Lkm2;->g:Lz94;

    .line 17
    .line 18
    iput-object p9, p0, Lkm2;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p10, p0, Lkm2;->i:Ls53;

    .line 21
    .line 22
    iput-object p8, p0, Lkm2;->j:Lra4;

    .line 23
    .line 24
    iput-object p11, p0, Lkm2;->k:Ll83;

    .line 25
    .line 26
    iput-object p12, p0, Lkm2;->m:Lbp2;

    .line 27
    .line 28
    iput p13, p0, Lkm2;->l:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Lq93;
    .locals 8

    .line 1
    iget-object v0, p0, Lkm2;->m:Lbp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbp2;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lkm2;->a:Lu93;

    .line 7
    .line 8
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljm2;

    .line 12
    .line 13
    new-instance v1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v3, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v3}, Ljm2;-><init>(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lkm2;->l:I

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    if-ne v1, v3, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    iget-object v3, p0, Lkm2;->i:Ls53;

    .line 35
    .line 36
    invoke-virtual {v3, v0, p1, v1}, Ls53;->a(Ljava/lang/Object;Landroid/os/Bundle;Z)Lcq3;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    new-instance v1, Lbu1;

    .line 41
    .line 42
    sget-object v5, Lu93;->d:Llq3;

    .line 43
    .line 44
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    sget-object v3, Ls93;->g:Ls93;

    .line 48
    .line 49
    invoke-direct/range {v1 .. v7}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method public final b()Lq93;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lmz1;->m2:Liz1;

    .line 7
    .line 8
    sget-object v2, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lkm2;->k:Ll83;

    .line 26
    .line 27
    iget-object v1, v1, Ll83;->t:Landroid/os/Bundle;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const-string v1, "ls"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0, v0}, Lkm2;->a(Landroid/os/Bundle;)Lq93;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v3, p0, Lkm2;->g:Lz94;

    .line 44
    .line 45
    invoke-interface {v3}, Lz94;->d()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ln70;

    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    new-array v4, v4, [Ln70;

    .line 53
    .line 54
    aput-object v1, v4, v2

    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    aput-object v3, v4, v5

    .line 58
    .line 59
    iget-object v7, p0, Lkm2;->a:Lu93;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    new-instance v3, Lyi1;

    .line 69
    .line 70
    const/4 v4, 0x3

    .line 71
    invoke-direct {v3, p0, v1, v0, v4}, Lyi1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lxm3;->g:Lvm3;

    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v11}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v1, Lgz1;->f:Lgz1;

    .line 84
    .line 85
    sget-object v4, Lmd2;->g:Lld2;

    .line 86
    .line 87
    new-instance v10, Lcq3;

    .line 88
    .line 89
    invoke-direct {v10, v0, v5, v2}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 90
    .line 91
    .line 92
    new-instance v6, Lbq3;

    .line 93
    .line 94
    invoke-direct {v6, v10, v1, v4}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 95
    .line 96
    .line 97
    iput-object v6, v10, Lcq3;->u:Lbq3;

    .line 98
    .line 99
    invoke-virtual {v10}, Ltp3;->v()V

    .line 100
    .line 101
    .line 102
    new-instance v6, Lbu1;

    .line 103
    .line 104
    iget-object v1, v7, Lu93;->a:Lpq3;

    .line 105
    .line 106
    new-instance v12, Lcq3;

    .line 107
    .line 108
    invoke-direct {v12, v0, v5, v2}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Lbq3;

    .line 112
    .line 113
    invoke-direct {v0, v12, v3, v1}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, v12, Lcq3;->u:Lbq3;

    .line 117
    .line 118
    invoke-virtual {v12}, Ltp3;->v()V

    .line 119
    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    sget-object v8, Ls93;->h:Ls93;

    .line 123
    .line 124
    invoke-direct/range {v6 .. v12}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Lbu1;->A()Lq93;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
.end method
