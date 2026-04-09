.class public abstract Lem;
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
    const-string v1, "DNSSEC algorithm"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lem;->a:Lue0;

    .line 10
    .line 11
    const/16 v1, 0xff

    .line 12
    .line 13
    iput v1, v0, Lue0;->i:I

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const-string v3, "DELETE"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const-string v3, "RSAMD5"

    .line 23
    .line 24
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    const-string v1, "DH"

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    const-string v2, "DSA"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x5

    .line 39
    const-string v2, "RSASHA1"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x6

    .line 45
    const-string v2, "DSA-NSEC3-SHA1"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x7

    .line 51
    const-string v2, "RSASHA1-NSEC3-SHA1"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    const-string v2, "RSASHA256"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    const-string v2, "RSASHA512"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xc

    .line 71
    .line 72
    const-string v2, "ECC-GOST"

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    const/16 v1, 0xd

    .line 78
    .line 79
    const-string v2, "ECDSAP256SHA256"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0xe

    .line 85
    .line 86
    const-string v2, "ECDSAP384SHA384"

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    const/16 v1, 0xf

    .line 92
    .line 93
    const-string v2, "ED25519"

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    const/16 v1, 0x10

    .line 99
    .line 100
    const-string v2, "ED448"

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    const/16 v1, 0x11

    .line 106
    .line 107
    const-string v2, "SM2SM3"

    .line 108
    .line 109
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    const/16 v1, 0x17

    .line 113
    .line 114
    const-string v2, "ECC-GOST12"

    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    const/16 v1, 0xfc

    .line 120
    .line 121
    const-string v2, "INDIRECT"

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    const/16 v1, 0xfd

    .line 127
    .line 128
    const-string v2, "PRIVATEDNS"

    .line 129
    .line 130
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    const/16 v1, 0xfe

    .line 134
    .line 135
    const-string v2, "PRIVATEOID"

    .line 136
    .line 137
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    return-void
.end method
