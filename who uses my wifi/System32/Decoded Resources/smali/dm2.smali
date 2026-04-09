.class public final synthetic Ldm2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldm2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldm2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldm2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldm2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldm2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldm2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lag2;

    .line 9
    .line 10
    iget-object v0, p0, Ldm2;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La83;

    .line 13
    .line 14
    iget-boolean v0, v0, La83;->M:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Lag2;->H0()V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Ldm2;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lii2;

    .line 24
    .line 25
    invoke-interface {p1}, Lag2;->L0()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lag2;->onPause()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lii2;->y()Liu2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_0
    iget-object p1, p0, Ldm2;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lag2;

    .line 39
    .line 40
    iget-object v0, p0, Ldm2;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, La83;

    .line 43
    .line 44
    iget-boolean v0, v0, La83;->M:Z

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Lag2;->H0()V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, Ldm2;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ldi2;

    .line 54
    .line 55
    invoke-interface {p1}, Lag2;->L0()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lag2;->onPause()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ldi2;->y()Lhq2;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :pswitch_1
    iget-object p1, p0, Ldm2;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Lag2;

    .line 69
    .line 70
    iget-object v0, p0, Ldm2;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, La83;

    .line 73
    .line 74
    iget-boolean v0, v0, La83;->M:Z

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-interface {p1}, Lag2;->H0()V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object v0, p0, Ldm2;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lxh2;

    .line 84
    .line 85
    invoke-interface {p1}, Lag2;->L0()V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Lag2;->onPause()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lxh2;->y()Lfk2;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :pswitch_2
    check-cast p1, La83;

    .line 97
    .line 98
    new-instance v0, Lmq1;

    .line 99
    .line 100
    iget-object v1, p0, Ldm2;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Landroid/content/Context;

    .line 103
    .line 104
    invoke-direct {v0, v1}, Lmq1;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p1, La83;->B:Ljava/lang/String;

    .line 108
    .line 109
    iput-object v1, v0, Lmq1;->c:Ljava/lang/String;

    .line 110
    .line 111
    iget-object p1, p1, La83;->C:Lorg/json/JSONObject;

    .line 112
    .line 113
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, v0, Lmq1;->f:Ljava/lang/String;

    .line 118
    .line 119
    iget-object p1, p0, Ldm2;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Le51;

    .line 122
    .line 123
    iget-object p1, p1, Le51;->f:Ljava/lang/String;

    .line 124
    .line 125
    iput-object p1, v0, Lmq1;->e:Ljava/lang/String;

    .line 126
    .line 127
    iget-object p1, p0, Ldm2;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Ll83;

    .line 130
    .line 131
    iget-object p1, p1, Ll83;->g:Ljava/lang/String;

    .line 132
    .line 133
    iput-object p1, v0, Lmq1;->d:Ljava/lang/String;

    .line 134
    .line 135
    return-object v0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
