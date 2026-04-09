.class public final synthetic Lje1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lgw3;


# direct methods
.method public synthetic constructor <init>(IJLgw3;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lje1;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lje1;->g:Lgw3;

    return-void
.end method

.method public synthetic constructor <init>(Lgw3;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lje1;->f:I

    iput-object p1, p0, Lje1;->g:Lgw3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgw3;Ljava/lang/String;JJ)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lje1;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje1;->g:Lgw3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lje1;->f:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/16 v2, 0x16

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lje1;->g:Lgw3;

    .line 9
    .line 10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v4, Lgw3;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Loa4;

    .line 21
    .line 22
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 23
    .line 24
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v4, Lt24;

    .line 31
    .line 32
    invoke-direct {v4, v2, v3}, Lt24;-><init>(IB)V

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x3f7

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2, v4}, Lmd4;->s(Lad4;ILks2;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v0, v4, Lgw3;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Loa4;

    .line 46
    .line 47
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 48
    .line 49
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 50
    .line 51
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v3, Ly24;

    .line 56
    .line 57
    invoke-direct {v3, v1}, Ly24;-><init>(I)V

    .line 58
    .line 59
    .line 60
    const/16 v1, 0x406

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, v4, Lgw3;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Loa4;

    .line 71
    .line 72
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 73
    .line 74
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 75
    .line 76
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    new-instance v2, Lt24;

    .line 81
    .line 82
    const/16 v4, 0x17

    .line 83
    .line 84
    invoke-direct {v2, v4, v3}, Lt24;-><init>(IB)V

    .line 85
    .line 86
    .line 87
    const/16 v3, 0x3fb

    .line 88
    .line 89
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_2
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v0, v4, Lgw3;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Loa4;

    .line 98
    .line 99
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 100
    .line 101
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 102
    .line 103
    iget-object v2, v0, Lmd4;->i:Lbu1;

    .line 104
    .line 105
    iget-object v2, v2, Lbu1;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lkh4;

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Lmd4;->x(Lkh4;)Lad4;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v4, Lt24;

    .line 114
    .line 115
    invoke-direct {v4, v1, v3}, Lt24;-><init>(IB)V

    .line 116
    .line 117
    .line 118
    const/16 v1, 0x3fd

    .line 119
    .line 120
    invoke-virtual {v0, v2, v1, v4}, Lmd4;->s(Lad4;ILks2;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_3
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v0, v4, Lgw3;->h:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Loa4;

    .line 129
    .line 130
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 131
    .line 132
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 133
    .line 134
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v3, Ly24;

    .line 139
    .line 140
    invoke-direct {v3, v2}, Ly24;-><init>(I)V

    .line 141
    .line 142
    .line 143
    const/16 v2, 0x3f8

    .line 144
    .line 145
    invoke-virtual {v0, v1, v2, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
