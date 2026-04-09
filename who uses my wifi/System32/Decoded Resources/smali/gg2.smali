.class public final synthetic Lgg2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lll3;


# instance fields
.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Lzq;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Lvs1;

.field public final synthetic l:Lf02;

.field public final synthetic m:Le51;

.field public final synthetic n:Lgd4;

.field public final synthetic o:Ll92;

.field public final synthetic p:Lcx1;

.field public final synthetic q:La83;

.field public final synthetic r:Lc83;

.field public final synthetic s:Lm83;

.field public final synthetic t:Lmv2;

.field public final synthetic u:Lpz2;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lzq;Ljava/lang/String;ZZLvs1;Lf02;Le51;Lgd4;Ll92;Lcx1;La83;Lc83;Lm83;Lmv2;Lpz2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgg2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lgg2;->g:Lzq;

    .line 7
    .line 8
    iput-object p3, p0, Lgg2;->h:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lgg2;->i:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lgg2;->j:Z

    .line 13
    .line 14
    iput-object p6, p0, Lgg2;->k:Lvs1;

    .line 15
    .line 16
    iput-object p7, p0, Lgg2;->l:Lf02;

    .line 17
    .line 18
    iput-object p8, p0, Lgg2;->m:Le51;

    .line 19
    .line 20
    iput-object p9, p0, Lgg2;->n:Lgd4;

    .line 21
    .line 22
    iput-object p10, p0, Lgg2;->o:Ll92;

    .line 23
    .line 24
    iput-object p11, p0, Lgg2;->p:Lcx1;

    .line 25
    .line 26
    iput-object p12, p0, Lgg2;->q:La83;

    .line 27
    .line 28
    iput-object p13, p0, Lgg2;->r:Lc83;

    .line 29
    .line 30
    iput-object p14, p0, Lgg2;->s:Lm83;

    .line 31
    .line 32
    iput-object p15, p0, Lgg2;->t:Lmv2;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lgg2;->u:Lpz2;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v4, v1, Lgg2;->g:Lzq;

    .line 4
    .line 5
    iget-object v5, v1, Lgg2;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v6, v1, Lgg2;->i:Z

    .line 8
    .line 9
    iget-boolean v0, v1, Lgg2;->j:Z

    .line 10
    .line 11
    iget-object v2, v1, Lgg2;->u:Lpz2;

    .line 12
    .line 13
    iget-object v3, v1, Lgg2;->t:Lmv2;

    .line 14
    .line 15
    iget-object v10, v1, Lgg2;->n:Lgd4;

    .line 16
    .line 17
    iget-object v11, v1, Lgg2;->o:Ll92;

    .line 18
    .line 19
    iget-object v12, v1, Lgg2;->p:Lcx1;

    .line 20
    .line 21
    iget-object v13, v1, Lgg2;->q:La83;

    .line 22
    .line 23
    iget-object v14, v1, Lgg2;->r:Lc83;

    .line 24
    .line 25
    iget-object v15, v1, Lgg2;->s:Lm83;

    .line 26
    .line 27
    iget-object v7, v1, Lgg2;->k:Lvs1;

    .line 28
    .line 29
    iget-object v8, v1, Lgg2;->l:Lf02;

    .line 30
    .line 31
    iget-object v9, v1, Lgg2;->m:Le51;

    .line 32
    .line 33
    move-object/from16 v16, v2

    .line 34
    .line 35
    iget-object v2, v1, Lgg2;->f:Landroid/content/Context;

    .line 36
    .line 37
    const/16 v17, 0x108

    .line 38
    .line 39
    :try_start_0
    invoke-static/range {v17 .. v17}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljg2;

    .line 43
    .line 44
    sget v17, Log2;->h0:I

    .line 45
    .line 46
    move-object/from16 v17, v3

    .line 47
    .line 48
    new-instance v3, Lyg2;

    .line 49
    .line 50
    invoke-direct {v3, v2}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v2}, Lyg2;->setBaseContext(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Log2;

    .line 57
    .line 58
    move-object/from16 v18, v16

    .line 59
    .line 60
    move/from16 v16, v0

    .line 61
    .line 62
    move-object/from16 v0, v17

    .line 63
    .line 64
    invoke-direct/range {v2 .. v15}, Log2;-><init>(Lyg2;Lzq;Ljava/lang/String;ZLvs1;Lf02;Le51;Lgd4;Ll92;Lcx1;La83;Lc83;Lm83;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, v2, v0}, Ljg2;-><init>(Log2;Lmv2;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lhg4;->C:Lhg4;

    .line 71
    .line 72
    iget-object v0, v0, Lhg4;->f:Lnh4;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v0, Lsg2;

    .line 78
    .line 79
    move/from16 v2, v16

    .line 80
    .line 81
    move-object/from16 v3, v18

    .line 82
    .line 83
    invoke-direct {v0, v1, v12, v2, v3}, Lsg2;-><init>(Ljg2;Lcx1;ZLpz2;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v1, v0}, Lag2;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lzf2;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Lzf2;-><init>(Ljg2;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v0}, Lag2;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 103
    .line 104
    .line 105
    throw v0
.end method
