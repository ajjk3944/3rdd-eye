.class public abstract Lfx3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lzw3;

.field public static final b:Lzw3;

.field public static final c:Lrw3;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lxw3;->f:Lxw3;

    .line 2
    .line 3
    sget-object v1, Lxw3;->d:Lxw3;

    .line 4
    .line 5
    sget-object v2, Lyw3;->b:Lyw3;

    .line 6
    .line 7
    :try_start_0
    new-instance v3, Lmc2;

    .line 8
    .line 9
    const/16 v4, 0x19

    .line 10
    .line 11
    invoke-direct {v3, v4}, Lmc2;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/16 v4, 0x20

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Lmc2;->i(I)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0x10

    .line 20
    .line 21
    invoke-virtual {v3, v5}, Lmc2;->o(I)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v3, Lmc2;->j:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object v1, v3, Lmc2;->i:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v3}, Lmc2;->A()Lzw3;

    .line 29
    .line 30
    .line 31
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 32
    sput-object v3, Lfx3;->a:Lzw3;

    .line 33
    .line 34
    :try_start_1
    new-instance v3, Lmc2;

    .line 35
    .line 36
    const/16 v6, 0x19

    .line 37
    .line 38
    invoke-direct {v3, v6}, Lmc2;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Lmc2;->i(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v4}, Lmc2;->o(I)V

    .line 45
    .line 46
    .line 47
    iput-object v2, v3, Lmc2;->j:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v1, v3, Lmc2;->i:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v3}, Lmc2;->A()Lzw3;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 52
    .line 53
    .line 54
    :try_start_2
    new-instance v1, Lmc2;

    .line 55
    .line 56
    const/16 v3, 0x19

    .line 57
    .line 58
    invoke-direct {v1, v3}, Lmc2;-><init>(I)V

    .line 59
    .line 60
    .line 61
    const/16 v3, 0x40

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Lmc2;->i(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v4}, Lmc2;->o(I)V

    .line 67
    .line 68
    .line 69
    iput-object v2, v1, Lmc2;->j:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v0, v1, Lmc2;->i:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v1}, Lmc2;->A()Lzw3;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 74
    .line 75
    .line 76
    :try_start_3
    new-instance v1, Lmc2;

    .line 77
    .line 78
    const/16 v6, 0x19

    .line 79
    .line 80
    invoke-direct {v1, v6}, Lmc2;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3}, Lmc2;->i(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v3}, Lmc2;->o(I)V

    .line 87
    .line 88
    .line 89
    iput-object v2, v1, Lmc2;->j:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v0, v1, Lmc2;->i:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v1}, Lmc2;->A()Lzw3;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 97
    sput-object v0, Lfx3;->b:Lzw3;

    .line 98
    .line 99
    :try_start_4
    new-instance v0, Ljr3;

    .line 100
    .line 101
    const/4 v1, 0x3

    .line 102
    invoke-direct {v0, v1}, Ljr3;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v4}, Ljr3;->b(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v5}, Ljr3;->g(I)V

    .line 109
    .line 110
    .line 111
    sget-object v1, Lgs3;->k:Lgs3;

    .line 112
    .line 113
    iput-object v1, v0, Ljr3;->i:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljr3;->l()Lrw3;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 119
    sput-object v0, Lfx3;->c:Lrw3;

    .line 120
    .line 121
    return-void

    .line 122
    :catch_0
    move-exception v0

    .line 123
    new-instance v1, Lrg;

    .line 124
    .line 125
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw v1

    .line 129
    :catch_1
    move-exception v0

    .line 130
    new-instance v1, Lrg;

    .line 131
    .line 132
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw v1

    .line 136
    :catch_2
    move-exception v0

    .line 137
    new-instance v1, Lrg;

    .line 138
    .line 139
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :catch_3
    move-exception v0

    .line 144
    new-instance v1, Lrg;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :catch_4
    move-exception v0

    .line 151
    new-instance v1, Lrg;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    throw v1
.end method
