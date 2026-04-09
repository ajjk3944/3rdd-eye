.class public final synthetic Ln82;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Ln82;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ln82;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Ln82;->g:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Ln82;->f:I

    .line 2
    .line 3
    iget-boolean v1, p0, Ln82;->g:Z

    .line 4
    .line 5
    iget-object v2, p0, Ln82;->h:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lwt2;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, v2, Lwt2;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Loa4;

    .line 20
    .line 21
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 22
    .line 23
    iget-boolean v2, v0, Lya4;->X:Z

    .line 24
    .line 25
    if-ne v2, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-boolean v1, v0, Lya4;->X:Z

    .line 29
    .line 30
    iget-object v0, v0, Lya4;->t:Lmu2;

    .line 31
    .line 32
    new-instance v2, Ly24;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Ly24;-><init>(Z)V

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x17

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lmu2;->c(ILks2;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lmu2;->d()V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :pswitch_0
    check-cast v2, Ljd4;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {v2, v1, v0}, Ljd4;->d(ZZ)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    check-cast v2, Lgb4;

    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    :try_start_0
    iget-object v0, v2, Lgb4;->o:Landroid/content/Context;

    .line 60
    .line 61
    iget-object v5, v2, Lgb4;->q:Le51;

    .line 62
    .line 63
    iget-boolean v6, v2, Lgb4;->r:Z

    .line 64
    .line 65
    invoke-static {v0, v5, v1, v6}, Lgb4;->p(Landroid/content/Context;Le51;ZZ)Lps1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lps1;->k()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move-exception v0

    .line 74
    iget-object v1, v2, Lgb4;->m:Lgd3;

    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    sub-long/2addr v5, v3

    .line 81
    const/16 v2, 0x7eb

    .line 82
    .line 83
    invoke-virtual {v1, v2, v5, v6, v0}, Lgd3;->c(IJLjava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    return-void

    .line 87
    :pswitch_2
    check-cast v2, Lpr2;

    .line 88
    .line 89
    iget-object v0, v2, Lpr2;->w:Lhv1;

    .line 90
    .line 91
    if-nez v0, :cond_1

    .line 92
    .line 93
    const-string v0, "Ad should be associated with an ad view before calling recordCustomClickGesture()"

    .line 94
    .line 95
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    iget-object v1, v2, Lpr2;->n:Lwr2;

    .line 100
    .line 101
    invoke-interface {v0}, Lrs2;->X0()Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v0, v2, Lpr2;->w:Lhv1;

    .line 106
    .line 107
    invoke-interface {v0}, Lrs2;->g()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    iget-object v0, v2, Lpr2;->w:Lhv1;

    .line 112
    .line 113
    invoke-interface {v0}, Lrs2;->k()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v2}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v2, 0x0

    .line 123
    iget-boolean v6, p0, Ln82;->g:Z

    .line 124
    .line 125
    invoke-interface/range {v1 .. v8}, Lwr2;->j(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V

    .line 126
    .line 127
    .line 128
    :goto_2
    return-void

    .line 129
    :pswitch_3
    check-cast v2, Lo82;

    .line 130
    .line 131
    invoke-virtual {v2, v1}, Lo82;->L(Z)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
