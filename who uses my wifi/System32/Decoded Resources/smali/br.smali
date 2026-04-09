.class public abstract Lbr;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lue0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lue0;

    .line 2
    .line 3
    const-string v1, "EDNS Option Codes"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbr;->a:Lue0;

    .line 10
    .line 11
    const v1, 0xffff

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lue0;->i:I

    .line 15
    .line 16
    const-string v1, "CODE"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "LLQ"

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const-string v2, "UL"

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    const-string v2, "NSID"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x5

    .line 39
    const-string v2, "DAU"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x6

    .line 45
    const-string v2, "DHU"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x7

    .line 51
    const-string v2, "N3U"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    const-string v2, "edns-client-subnet"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    const/16 v1, 0x9

    .line 64
    .line 65
    const-string v2, "EDNS_EXPIRE"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    const-string v2, "COOKIE"

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    const/16 v1, 0xb

    .line 78
    .line 79
    const-string v2, "edns-tcp-keepalive"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0xc

    .line 85
    .line 86
    const-string v2, "Padding"

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    const/16 v1, 0xd

    .line 92
    .line 93
    const-string v2, "CHAIN"

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    const/16 v1, 0xe

    .line 99
    .line 100
    const-string v2, "edns-key-tag"

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    const/16 v1, 0xf

    .line 106
    .line 107
    const-string v2, "Extended_DNS_Error"

    .line 108
    .line 109
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    const/16 v1, 0x10

    .line 113
    .line 114
    const-string v2, "EDNS-Client-Tag"

    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    const/16 v1, 0x11

    .line 120
    .line 121
    const-string v2, "EDNS-Server-Tag"

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    const/16 v1, 0x12

    .line 127
    .line 128
    const-string v2, "Report-Channel"

    .line 129
    .line 130
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    return-void
.end method
