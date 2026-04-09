.class public final Lt14;
.super Lp24;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final j:Lq14;

.field public final k:Lv34;

.field public final l:Lv34;

.field public final m:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lq14;Lv34;Lv34;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt14;->j:Lq14;

    .line 5
    .line 6
    iput-object p2, p0, Lt14;->k:Lv34;

    .line 7
    .line 8
    iput-object p3, p0, Lt14;->l:Lv34;

    .line 9
    .line 10
    iput-object p4, p0, Lt14;->m:Ljava/lang/Integer;

    .line 11
    .line 12
    return-void
.end method

.method public static s0(Lp14;Lv34;Ljava/lang/Integer;)Lt14;
    .locals 6

    .line 1
    iget-object v0, p0, Lp14;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lv34;->a:[B

    .line 4
    .line 5
    new-instance v2, Lq14;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Lq14;-><init>(Lp14;)V

    .line 8
    .line 9
    .line 10
    sget-object v3, Lp14;->e:Lp14;

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x3e

    .line 30
    .line 31
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 32
    .line 33
    .line 34
    const-string p1, "For given Variant "

    .line 35
    .line 36
    const-string v1, " the value of idRequirement must be non-null"

    .line 37
    .line 38
    invoke-static {p2, p1, v0, v1}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 56
    .line 57
    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_3
    :goto_1
    array-length v4, v1

    .line 64
    const/16 v5, 0x20

    .line 65
    .line 66
    if-ne v4, v5, :cond_8

    .line 67
    .line 68
    new-instance v1, Lt14;

    .line 69
    .line 70
    if-ne p0, v3, :cond_4

    .line 71
    .line 72
    sget-object p0, Lsv3;->a:Lv34;

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    sget-object v3, Lp14;->c:Lp14;

    .line 76
    .line 77
    if-eq p0, v3, :cond_7

    .line 78
    .line 79
    sget-object v3, Lp14;->d:Lp14;

    .line 80
    .line 81
    if-ne p0, v3, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    sget-object v3, Lp14;->b:Lp14;

    .line 85
    .line 86
    if-ne p0, v3, :cond_6

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
    goto :goto_3

    .line 97
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string p1, "Unknown Variant: "

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_7
    :goto_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p0}, Lsv3;->a(I)Lv34;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    :goto_3
    invoke-direct {v1, v2, p1, p0, p2}, Lt14;-><init>(Lq14;Lv34;Lv34;Ljava/lang/Integer;)V

    .line 118
    .line 119
    .line 120
    return-object v1

    .line 121
    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 122
    .line 123
    array-length p1, v1

    .line 124
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    add-int/lit8 p2, p2, 0x41

    .line 135
    .line 136
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const-string p2, "Ed25519 key must be constructed with key of length 32 bytes, not "

    .line 140
    .line 141
    invoke-static {v0, p2, p1}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0
.end method


# virtual methods
.method public final synthetic D()Lmr3;
    .locals 1

    .line 1
    iget-object v0, p0, Lt14;->j:Lq14;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r0()Lv34;
    .locals 1

    .line 1
    iget-object v0, p0, Lt14;->l:Lv34;

    .line 2
    .line 3
    return-object v0
.end method
