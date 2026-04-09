.class public final Ld3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final i:Ld3;

.field public static final j:Ld3;

.field public static final k:Ld3;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:Z

.field public e:Z

.field public f:I

.field public g:Z

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ld3;

    .line 2
    .line 3
    const-string v1, "320x50_mb"

    .line 4
    .line 5
    const/16 v2, 0x140

    .line 6
    .line 7
    const/16 v3, 0x32

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ld3;->i:Ld3;

    .line 13
    .line 14
    new-instance v0, Ld3;

    .line 15
    .line 16
    const/16 v1, 0x1d4

    .line 17
    .line 18
    const/16 v4, 0x3c

    .line 19
    .line 20
    const-string v5, "468x60_as"

    .line 21
    .line 22
    invoke-direct {v0, v5, v1, v4}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ld3;

    .line 26
    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const-string v4, "320x100_as"

    .line 30
    .line 31
    invoke-direct {v0, v4, v2, v1}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ld3;

    .line 35
    .line 36
    const/16 v1, 0x2d8

    .line 37
    .line 38
    const/16 v2, 0x5a

    .line 39
    .line 40
    const-string v4, "728x90_as"

    .line 41
    .line 42
    invoke-direct {v0, v4, v1, v2}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ld3;

    .line 46
    .line 47
    const/16 v1, 0x12c

    .line 48
    .line 49
    const/16 v2, 0xfa

    .line 50
    .line 51
    const-string v4, "300x250_as"

    .line 52
    .line 53
    invoke-direct {v0, v4, v1, v2}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ld3;

    .line 57
    .line 58
    const/16 v1, 0xa0

    .line 59
    .line 60
    const/16 v2, 0x258

    .line 61
    .line 62
    const-string v4, "160x600_as"

    .line 63
    .line 64
    invoke-direct {v0, v4, v1, v2}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Ld3;

    .line 68
    .line 69
    const/4 v1, -0x1

    .line 70
    const/4 v2, -0x2

    .line 71
    const-string v4, "smart_banner"

    .line 72
    .line 73
    invoke-direct {v0, v4, v1, v2}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Ld3;

    .line 77
    .line 78
    const/4 v1, -0x4

    .line 79
    const-string v2, "fluid"

    .line 80
    .line 81
    const/4 v4, -0x3

    .line 82
    invoke-direct {v0, v2, v4, v1}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Ld3;->j:Ld3;

    .line 86
    .line 87
    new-instance v0, Ld3;

    .line 88
    .line 89
    const-string v1, "invalid"

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-direct {v0, v1, v2, v2}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Ld3;->k:Ld3;

    .line 96
    .line 97
    const-string v0, "50x50_mb"

    .line 98
    .line 99
    new-instance v1, Ld3;

    .line 100
    .line 101
    invoke-direct {v1, v0, v3, v3}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 102
    .line 103
    .line 104
    const-string v0, "search_v2"

    .line 105
    .line 106
    new-instance v1, Ld3;

    .line 107
    .line 108
    invoke-direct {v1, v0, v4, v2}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public constructor <init>(II)V
    .locals 5

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1
    const-string v0, "FULL"

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, -0x2

    if-ne p2, v1, :cond_1

    .line 3
    const-string v1, "AUTO"

    goto :goto_1

    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "x"

    const-string v4, "_as"

    .line 4
    invoke-static {v2, v0, v3, v1, v4}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-direct {p0, v0, p1, p2}, Ld3;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-gez p2, :cond_1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    const/4 v0, -0x3

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    new-instance v0, Ljava/lang/StringBuilder;

    add-int/lit8 p3, p3, 0x1a

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Invalid width for AdSize: "

    .line 13
    invoke-static {v0, p3, p2}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-gez p3, :cond_3

    const/4 v0, -0x2

    if-eq p3, v0, :cond_3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    goto :goto_1

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1b

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Invalid height for AdSize: "

    .line 16
    invoke-static {v0, p2, p3}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_3
    :goto_1
    iput p2, p0, Ld3;->a:I

    iput p3, p0, Ld3;->b:I

    iput-object p1, p0, Ld3;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;I)Ld3;
    .locals 2

    .line 1
    sget-object v0, Lj63;->b:Lwc1;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    iget p0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 36
    .line 37
    int-to-float p0, p0

    .line 38
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 39
    .line 40
    div-float/2addr p0, v1

    .line 41
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    move p0, v0

    .line 47
    :goto_1
    if-ne p0, v0, :cond_3

    .line 48
    .line 49
    sget-object p0, Ld3;->k:Ld3;

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    int-to-float p0, p0

    .line 53
    const v0, 0x3e19999a    # 0.15f

    .line 54
    .line 55
    .line 56
    mul-float/2addr p0, v0

    .line 57
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    const/16 v0, 0x5a

    .line 62
    .line 63
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    const/16 v0, 0x28f

    .line 68
    .line 69
    if-le p1, v0, :cond_4

    .line 70
    .line 71
    int-to-float v0, p1

    .line 72
    const/high16 v1, 0x44360000    # 728.0f

    .line 73
    .line 74
    div-float/2addr v0, v1

    .line 75
    const/high16 v1, 0x42b40000    # 90.0f

    .line 76
    .line 77
    mul-float/2addr v0, v1

    .line 78
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/16 v0, 0x278

    .line 84
    .line 85
    if-le p1, v0, :cond_5

    .line 86
    .line 87
    const/16 v0, 0x51

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    const/16 v0, 0x20e

    .line 91
    .line 92
    if-le p1, v0, :cond_6

    .line 93
    .line 94
    int-to-float v0, p1

    .line 95
    const/high16 v1, 0x43ea0000    # 468.0f

    .line 96
    .line 97
    div-float/2addr v0, v1

    .line 98
    const/high16 v1, 0x42700000    # 60.0f

    .line 99
    .line 100
    mul-float/2addr v0, v1

    .line 101
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    const/16 v0, 0x1b0

    .line 107
    .line 108
    if-le p1, v0, :cond_7

    .line 109
    .line 110
    const/16 v0, 0x44

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    int-to-float v0, p1

    .line 114
    const/high16 v1, 0x43a00000    # 320.0f

    .line 115
    .line 116
    div-float/2addr v0, v1

    .line 117
    const/high16 v1, 0x42480000    # 50.0f

    .line 118
    .line 119
    mul-float/2addr v0, v1

    .line 120
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    :goto_2
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    const/16 v0, 0x32

    .line 129
    .line 130
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    new-instance v0, Ld3;

    .line 135
    .line 136
    invoke-direct {v0, p1, p0}, Ld3;-><init>(II)V

    .line 137
    .line 138
    .line 139
    move-object p0, v0

    .line 140
    :goto_3
    const/4 p1, 0x1

    .line 141
    iput-boolean p1, p0, Ld3;->d:Z

    .line 142
    .line 143
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p1, p0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, Ld3;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    check-cast p1, Ld3;

    .line 15
    .line 16
    iget v2, p0, Ld3;->a:I

    .line 17
    .line 18
    iget v3, p1, Ld3;->a:I

    .line 19
    .line 20
    if-ne v2, v3, :cond_3

    .line 21
    .line 22
    iget v2, p0, Ld3;->b:I

    .line 23
    .line 24
    iget v3, p1, Ld3;->b:I

    .line 25
    .line 26
    if-ne v2, v3, :cond_3

    .line 27
    .line 28
    iget-object v2, p0, Ld3;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p1, p1, Ld3;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    return v1

    .line 39
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld3;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
