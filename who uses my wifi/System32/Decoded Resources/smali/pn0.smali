.class public abstract Lpn0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lue0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lue0;

    .line 2
    .line 3
    const-string v1, "DNS Rcode"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lpn0;->a:Lue0;

    .line 10
    .line 11
    const/16 v1, 0xfff

    .line 12
    .line 13
    iput v1, v0, Lue0;->i:I

    .line 14
    .line 15
    const-string v1, "RESERVED"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v3, "NOERROR"

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const-string v3, "FORMERR"

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v1, "SERVFAIL"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    const-string v2, "NXDOMAIN"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    const-string v1, "NOTIMP"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const-string v1, "NOTIMPL"

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Lue0;->c(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    const-string v2, "REFUSED"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x6

    .line 61
    const-string v2, "YXDOMAIN"

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x7

    .line 67
    const-string v2, "YXRRSET"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0x8

    .line 73
    .line 74
    const-string v2, "NXRRSET"

    .line 75
    .line 76
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    const/16 v1, 0x9

    .line 80
    .line 81
    const-string v2, "NOTAUTH"

    .line 82
    .line 83
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    const/16 v1, 0xa

    .line 87
    .line 88
    const-string v2, "NOTZONE"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    const/16 v1, 0x10

    .line 94
    .line 95
    const-string v2, "BADVERS"

    .line 96
    .line 97
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    const/16 v1, 0x11

    .line 101
    .line 102
    const-string v2, "BADKEY"

    .line 103
    .line 104
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 105
    .line 106
    .line 107
    const/16 v1, 0x12

    .line 108
    .line 109
    const-string v2, "BADTIME"

    .line 110
    .line 111
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    const/16 v1, 0x13

    .line 115
    .line 116
    const-string v2, "BADMODE"

    .line 117
    .line 118
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    const/16 v1, 0x14

    .line 122
    .line 123
    const-string v2, "BADNAME"

    .line 124
    .line 125
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    const/16 v1, 0x15

    .line 129
    .line 130
    const-string v2, "BADALG"

    .line 131
    .line 132
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    const/16 v1, 0x16

    .line 136
    .line 137
    const-string v2, "BADTRUNC"

    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    const/16 v1, 0x17

    .line 143
    .line 144
    const-string v2, "BADCOOKIE"

    .line 145
    .line 146
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
