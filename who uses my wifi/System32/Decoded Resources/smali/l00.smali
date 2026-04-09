.class public final Ll00;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final i:Ljava/security/SecureRandom;


# instance fields
.field public f:I

.field public g:I

.field public h:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll00;->i:Ljava/security/SecureRandom;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    const v0, 0xffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    iput-object v0, p0, Ll00;->h:[I

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Ll00;->g:I

    .line 18
    .line 19
    iput p1, p0, Ll00;->f:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "DNS message ID "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " is out of range"

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method public static a(I)V
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    if-gt p0, v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lou;->a:Lue0;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lue0;->d(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-lt p0, v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    if-le p0, v0, :cond_1

    .line 17
    .line 18
    :cond_0
    const/16 v0, 0xc

    .line 19
    .line 20
    if-ge p0, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v1, "invalid flag bit "

    .line 26
    .line 27
    invoke-static {v1, p0}, Lex0;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public static c(II)Z
    .locals 1

    .line 1
    invoke-static {p1}, Ll00;->a(I)V

    .line 2
    .line 3
    .line 4
    rsub-int/lit8 p1, p1, 0xf

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    shl-int p1, v0, p1

    .line 8
    .line 9
    and-int/2addr p0, p1

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method


# virtual methods
.method public final b()Ll00;
    .locals 5

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ll00;

    .line 6
    .line 7
    iget v1, p0, Ll00;->f:I

    .line 8
    .line 9
    iput v1, v0, Ll00;->f:I

    .line 10
    .line 11
    iget v1, p0, Ll00;->g:I

    .line 12
    .line 13
    iput v1, v0, Ll00;->g:I

    .line 14
    .line 15
    iget-object v1, v0, Ll00;->h:[I

    .line 16
    .line 17
    array-length v1, v1

    .line 18
    new-array v1, v1, [I

    .line 19
    .line 20
    iput-object v1, v0, Ll00;->h:[I

    .line 21
    .line 22
    iget-object v2, p0, Ll00;->h:[I

    .line 23
    .line 24
    array-length v3, v2

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll00;->b()Ll00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Ll00;->g:I

    .line 2
    .line 3
    shr-int/lit8 v0, v0, 0xb

    .line 4
    .line 5
    and-int/lit8 v0, v0, 0xf

    .line 6
    .line 7
    return v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget v0, p0, Ll00;->g:I

    .line 2
    .line 3
    const v1, 0x87ff

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    iput v0, p0, Ll00;->g:I

    .line 8
    .line 9
    return-void
.end method

.method public final f(I)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, ";; ->>HEADER<<- opcode: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ll00;->d()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sget-object v2, Loj0;->a:Lue0;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ", status: "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v1, Lpn0;->a:Lue0;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lue0;->e(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, ", id: "

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget p1, p0, Ll00;->f:I

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, "\n;; flags: "

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    move v1, p1

    .line 52
    :goto_0
    const/16 v2, 0x10

    .line 53
    .line 54
    const/4 v3, 0x4

    .line 55
    const-string v4, " "

    .line 56
    .line 57
    if-ge v1, v2, :cond_2

    .line 58
    .line 59
    if-ltz v1, :cond_1

    .line 60
    .line 61
    const/16 v2, 0xf

    .line 62
    .line 63
    if-gt v1, v2, :cond_1

    .line 64
    .line 65
    sget-object v2, Lou;->a:Lue0;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Lue0;->d(I)V

    .line 68
    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    if-lt v1, v5, :cond_0

    .line 72
    .line 73
    if-le v1, v3, :cond_1

    .line 74
    .line 75
    :cond_0
    const/16 v3, 0xc

    .line 76
    .line 77
    if-ge v1, v3, :cond_1

    .line 78
    .line 79
    iget v3, p0, Ll00;->g:I

    .line 80
    .line 81
    invoke-static {v3, v1}, Ll00;->c(II)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    const-string v1, "; "

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    :goto_1
    if-ge p1, v3, :cond_3

    .line 106
    .line 107
    sget-object v1, Ltt0;->a:Lue0;

    .line 108
    .line 109
    invoke-virtual {v1, p1}, Lue0;->e(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ": "

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Ll00;->h:[I

    .line 122
    .line 123
    aget v1, v1, p1

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    add-int/lit8 p1, p1, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ll00;->g:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ll00;->f(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
