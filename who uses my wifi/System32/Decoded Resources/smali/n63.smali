.class public final Ln63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lt3;


# direct methods
.method public synthetic constructor <init>(Lt3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln63;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ln63;->b:Lt3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 4

    .line 1
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 2
    .line 3
    iget-object v0, v0, Lt3;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lfa2;

    .line 6
    .line 7
    iget-object v0, v0, Lfa2;->f:Landroid/os/Bundle;

    .line 8
    .line 9
    const-string v1, "extras"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, -0x1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_1
    const-string v2, "query_info_type"

    .line 29
    .line 30
    const-string v3, ""

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    packed-switch v2, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_0
    const-string v2, "requester_type_8"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const/16 v1, 0x8

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_1
    const-string v2, "requester_type_7"

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    const/4 v1, 0x7

    .line 64
    goto :goto_0

    .line 65
    :pswitch_2
    const-string v2, "requester_type_6"

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    const/4 v1, 0x6

    .line 74
    goto :goto_0

    .line 75
    :pswitch_3
    const-string v2, "requester_type_5"

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    const/4 v1, 0x5

    .line 84
    goto :goto_0

    .line 85
    :pswitch_4
    const-string v2, "requester_type_4"

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    const/4 v1, 0x4

    .line 94
    goto :goto_0

    .line 95
    :pswitch_5
    const-string v2, "requester_type_3"

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    const/4 v1, 0x3

    .line 104
    goto :goto_0

    .line 105
    :pswitch_6
    const-string v2, "requester_type_2"

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    const/4 v1, 0x2

    .line 114
    goto :goto_0

    .line 115
    :pswitch_7
    const-string v2, "requester_type_1"

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_2

    .line 122
    .line 123
    const/4 v1, 0x1

    .line 124
    goto :goto_0

    .line 125
    :pswitch_8
    const-string v2, "requester_type_0"

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0

    .line 139
    :pswitch_data_0
    .packed-switch 0x67ecf68e
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ln63;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 7
    .line 8
    iget-object v0, v0, Lt3;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lfa2;

    .line 11
    .line 12
    iget v0, v0, Lfa2;->t:I

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    invoke-virtual {p0}, Ln63;->a()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_1
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 25
    .line 26
    iget-object v0, v0, Lt3;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lfa2;

    .line 29
    .line 30
    iget-object v0, v0, Lfa2;->m:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_2
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 37
    .line 38
    iget-object v0, v0, Lt3;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lfa2;

    .line 41
    .line 42
    iget-boolean v0, v0, Lfa2;->p:Z

    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_3
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 50
    .line 51
    iget-object v0, v0, Lt3;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lfa2;

    .line 54
    .line 55
    iget-boolean v0, v0, Lfa2;->q:Z

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_4
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 63
    .line 64
    iget v0, v0, Lt3;->g:I

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_5
    iget-object v0, p0, Ln63;->b:Lt3;

    .line 72
    .line 73
    iget-object v0, v0, Lt3;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lfa2;

    .line 76
    .line 77
    iget-object v0, v0, Lfa2;->i:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
