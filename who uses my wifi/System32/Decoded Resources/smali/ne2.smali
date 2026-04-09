.class public final synthetic Lne2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lse2;


# direct methods
.method public synthetic constructor <init>(Lse2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lne2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lne2;->g:Lse2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lne2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 7
    .line 8
    iget-object v1, v0, Lae2;->g:Lme2;

    .line 9
    .line 10
    iget-boolean v2, v1, Lme2;->e:Z

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    move v2, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v2, v1, Lme2;->f:F

    .line 18
    .line 19
    :goto_0
    iget-boolean v1, v1, Lme2;->c:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move v3, v2

    .line 24
    :cond_1
    iget-object v0, v0, Lse2;->n:Lsf2;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    :try_start_0
    iget-object v0, v0, Lsf2;->l:Lmc4;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v1, v0, Lmc4;->j:Lhp2;

    .line 33
    .line 34
    invoke-virtual {v1}, Lhp2;->b()V

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Lmc4;->i:Lya4;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Lya4;->U1(F)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_0
    const/4 v0, 0x5

    .line 44
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const-string v0, "Trying to set volume before player is initialized."

    .line 49
    .line 50
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    return-void

    .line 54
    :pswitch_0
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 55
    .line 56
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {v0}, Lee2;->i()V

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :pswitch_1
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 65
    .line 66
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    iget-object v1, v0, Lee2;->j:Lde2;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    iput-boolean v2, v1, Lde2;->h:Z

    .line 74
    .line 75
    sget-object v2, Llf4;->l:Li63;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v3, 0xfa

    .line 81
    .line 82
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    .line 84
    .line 85
    new-instance v1, Lbe2;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-direct {v1, v0, v3}, Lbe2;-><init>(Lee2;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 92
    .line 93
    .line 94
    :cond_5
    return-void

    .line 95
    :pswitch_2
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 96
    .line 97
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-virtual {v0}, Lee2;->g()V

    .line 102
    .line 103
    .line 104
    :cond_6
    return-void

    .line 105
    :pswitch_3
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 106
    .line 107
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    invoke-virtual {v0}, Lee2;->f()V

    .line 112
    .line 113
    .line 114
    :cond_7
    return-void

    .line 115
    :pswitch_4
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 116
    .line 117
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    invoke-virtual {v0}, Lee2;->h()V

    .line 122
    .line 123
    .line 124
    :cond_8
    return-void

    .line 125
    :pswitch_5
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 126
    .line 127
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 128
    .line 129
    if-eqz v0, :cond_9

    .line 130
    .line 131
    invoke-virtual {v0}, Lee2;->k()V

    .line 132
    .line 133
    .line 134
    :cond_9
    return-void

    .line 135
    :pswitch_6
    iget-object v0, p0, Lne2;->g:Lse2;

    .line 136
    .line 137
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 138
    .line 139
    if-eqz v0, :cond_a

    .line 140
    .line 141
    invoke-virtual {v0}, Lee2;->e()V

    .line 142
    .line 143
    .line 144
    :cond_a
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
