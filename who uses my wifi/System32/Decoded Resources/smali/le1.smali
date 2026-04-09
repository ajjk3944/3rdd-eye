.class public final synthetic Lle1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lgw3;Ljava/lang/Object;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lle1;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle1;->h:Ljava/lang/Object;

    iput-object p2, p0, Lle1;->i:Ljava/lang/Object;

    iput-wide p3, p0, Lle1;->g:J

    return-void
.end method

.method public constructor <init>(Ljb3;JLtx2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lle1;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lle1;->g:J

    iput-object p4, p0, Lle1;->h:Ljava/lang/Object;

    iput-object p1, p0, Lle1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljo1;Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lle1;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lle1;->h:Ljava/lang/Object;

    iput-wide p3, p0, Lle1;->g:J

    iput-object p1, p0, Lle1;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lle1;->f:I

    .line 2
    .line 3
    iget-wide v1, p0, Lle1;->g:J

    .line 4
    .line 5
    iget-object v3, p0, Lle1;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, Lle1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v4, Ljb3;

    .line 13
    .line 14
    iget-object v5, v4, Ljb3;->p:Lsq0;

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    check-cast v3, Ltx2;

    .line 19
    .line 20
    iget-object v13, v4, Ljb3;->r:Lqb3;

    .line 21
    .line 22
    instance-of v0, v3, Lrm2;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    move-object v12, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    check-cast v3, Lrm2;

    .line 30
    .line 31
    iget-object v0, v3, Lrm2;->i:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    iget-object v0, v4, Ljb3;->e:Lae3;

    .line 35
    .line 36
    iget v10, v0, Lae3;->i:I

    .line 37
    .line 38
    invoke-virtual {v4}, Ljb3;->m()I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    invoke-virtual {v4}, Ljb3;->e()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    const-string v6, "paa"

    .line 47
    .line 48
    const-string v7, "pano_ts"

    .line 49
    .line 50
    iget-wide v8, p0, Lle1;->g:J

    .line 51
    .line 52
    invoke-virtual/range {v5 .. v14}, Lsq0;->z(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Lqb3;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_0
    check-cast v4, Ljo1;

    .line 57
    .line 58
    iget-object v0, v4, Ljo1;->f:Lqo1;

    .line 59
    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v3, v1, v2}, Lqo1;->a(Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v4, Ljo1;->f:Lqo1;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljo1;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Lqo1;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_1
    check-cast v3, Lgw3;

    .line 76
    .line 77
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v0, v3, Lgw3;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Loa4;

    .line 82
    .line 83
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 84
    .line 85
    iget-object v3, v0, Lya4;->y:Lmd4;

    .line 86
    .line 87
    invoke-virtual {v3}, Lmd4;->y()Lad4;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    new-instance v6, Lbi3;

    .line 92
    .line 93
    invoke-direct {v6, v5, v4, v1, v2}, Lbi3;-><init>(Lad4;Ljava/lang/Object;J)V

    .line 94
    .line 95
    .line 96
    const/16 v1, 0x1a

    .line 97
    .line 98
    invoke-virtual {v3, v5, v1, v6}, Lmd4;->s(Lad4;ILks2;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, Lya4;->R:Ljava/lang/Object;

    .line 102
    .line 103
    if-ne v2, v4, :cond_2

    .line 104
    .line 105
    iget-object v0, v0, Lya4;->t:Lmu2;

    .line 106
    .line 107
    sget-object v2, Lt24;->o:Lt24;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, Lmu2;->c(ILks2;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lmu2;->d()V

    .line 113
    .line 114
    .line 115
    :cond_2
    return-void

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
