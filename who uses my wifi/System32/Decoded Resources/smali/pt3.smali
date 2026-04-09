.class public final Lpt3;
.super Lsr3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final j:Lrt3;

.field public final k:Lyf3;

.field public final l:Lv34;

.field public final m:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lrt3;Lyf3;Lv34;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpt3;->j:Lrt3;

    .line 5
    .line 6
    iput-object p2, p0, Lpt3;->k:Lyf3;

    .line 7
    .line 8
    iput-object p3, p0, Lpt3;->l:Lv34;

    .line 9
    .line 10
    iput-object p4, p0, Lpt3;->m:Ljava/lang/Integer;

    .line 11
    .line 12
    return-void
.end method

.method public static s0(Lcs3;Lyf3;Ljava/lang/Integer;)Lpt3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcs3;->g:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lyf3;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lv34;

    .line 6
    .line 7
    sget-object v2, Lcs3;->m:Lcs3;

    .line 8
    .line 9
    if-eq p0, v2, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x3e

    .line 23
    .line 24
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const-string p1, "For given Variant "

    .line 28
    .line 29
    const-string v1, " the value of idRequirement must be non-null"

    .line 30
    .line 31
    invoke-static {p2, p1, v0, v1}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_1
    :goto_0
    if-ne p0, v2, :cond_3

    .line 40
    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 45
    .line 46
    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_3
    :goto_1
    iget-object v3, v1, Lv34;->a:[B

    .line 53
    .line 54
    array-length v3, v3

    .line 55
    const/16 v4, 0x20

    .line 56
    .line 57
    if-ne v3, v4, :cond_7

    .line 58
    .line 59
    new-instance v1, Lrt3;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lrt3;-><init>(Lcs3;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lpt3;

    .line 65
    .line 66
    if-ne p0, v2, :cond_4

    .line 67
    .line 68
    sget-object p0, Lsv3;->a:Lv34;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    sget-object v2, Lcs3;->l:Lcs3;

    .line 72
    .line 73
    if-ne p0, v2, :cond_5

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0}, Lsv3;->a(I)Lv34;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    sget-object v2, Lcs3;->k:Lcs3;

    .line 85
    .line 86
    if-ne p0, v2, :cond_6

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Lsv3;->b(I)Lv34;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_2
    invoke-direct {v3, v1, p1, p0, p2}, Lpt3;-><init>(Lrt3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 97
    .line 98
    .line 99
    return-object v3

    .line 100
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    const-string p1, "Unknown Variant: "

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 113
    .line 114
    iget-object p1, v1, Lv34;->a:[B

    .line 115
    .line 116
    array-length p1, p1

    .line 117
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    add-int/lit8 p2, p2, 0x4b

    .line 128
    .line 129
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 130
    .line 131
    .line 132
    const-string p2, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "

    .line 133
    .line 134
    invoke-static {v0, p2, p1}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0
.end method


# virtual methods
.method public final synthetic D()Lmr3;
    .locals 1

    .line 1
    iget-object v0, p0, Lpt3;->j:Lrt3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r0()Lv34;
    .locals 1

    .line 1
    iget-object v0, p0, Lpt3;->l:Lv34;

    .line 2
    .line 3
    return-object v0
.end method
