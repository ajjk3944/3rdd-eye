.class public final Lcs3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldp2;


# static fields
.field public static final h:Lcs3;

.field public static final i:Lcs3;

.field public static final j:Lcs3;

.field public static final k:Lcs3;

.field public static final l:Lcs3;

.field public static final m:Lcs3;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcs3;

    .line 2
    .line 3
    const-string v1, "TINK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcs3;->h:Lcs3;

    .line 10
    .line 11
    new-instance v0, Lcs3;

    .line 12
    .line 13
    const-string v1, "CRUNCHY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcs3;->i:Lcs3;

    .line 19
    .line 20
    new-instance v0, Lcs3;

    .line 21
    .line 22
    const-string v1, "NO_PREFIX"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcs3;->j:Lcs3;

    .line 28
    .line 29
    new-instance v0, Lcs3;

    .line 30
    .line 31
    const-string v1, "TINK"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v1, v2}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcs3;->k:Lcs3;

    .line 38
    .line 39
    new-instance v0, Lcs3;

    .line 40
    .line 41
    const-string v1, "CRUNCHY"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcs3;->l:Lcs3;

    .line 47
    .line 48
    new-instance v0, Lcs3;

    .line 49
    .line 50
    const-string v1, "NO_PREFIX"

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcs3;->m:Lcs3;

    .line 56
    .line 57
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcs3;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lcs3;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static a(Lkz2;)Lcs3;
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lkz2;->G(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lkz2;->K()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    shr-int/lit8 v1, v0, 0x1

    .line 10
    .line 11
    and-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0}, Lkz2;->K()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    shr-int/lit8 p0, p0, 0x3

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    const/4 v3, 0x5

    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    if-eq v1, v3, :cond_3

    .line 26
    .line 27
    const/4 v2, 0x7

    .line 28
    if-eq v1, v2, :cond_3

    .line 29
    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v2, 0x9

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    const-string v2, "dvav"

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    if-ne v1, v4, :cond_2

    .line 43
    .line 44
    const-string v2, "dav1"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_3
    :goto_0
    const-string v2, "dvhe"

    .line 50
    .line 51
    :goto_1
    shl-int/2addr v0, v3

    .line 52
    or-int/2addr p0, v0

    .line 53
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const-string v5, "."

    .line 70
    .line 71
    const-string v6, ".0"

    .line 72
    .line 73
    if-ge v1, v4, :cond_4

    .line 74
    .line 75
    move-object v7, v6

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move-object v7, v5

    .line 78
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-static {v7, v8, v0}, Lga1;->i(Ljava/lang/String;II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ge p0, v4, :cond_5

    .line 87
    .line 88
    move-object v5, v6

    .line 89
    :cond_5
    invoke-static {v5, v0, v3}, Lga1;->i(Ljava/lang/String;II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    new-instance v0, Lcs3;

    .line 118
    .line 119
    const/4 v1, 0x3

    .line 120
    invoke-direct {v0, p0, v1}, Lcs3;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Llp2;

    .line 2
    .line 3
    iget-object v0, p0, Lcs3;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Llp2;->l(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lcs3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lcs3;->g:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_1
    iget-object v0, p0, Lcs3;->g:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
