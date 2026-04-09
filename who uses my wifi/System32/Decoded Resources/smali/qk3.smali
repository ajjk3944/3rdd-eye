.class public final Lqk3;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Lit3;

.field public final synthetic g:Lrk3;


# direct methods
.method public constructor <init>(Lrk3;Lit3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqk3;->g:Lrk3;

    .line 2
    .line 3
    const-string p1, "com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lqk3;->f:Lit3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 4

    .line 1
    const/4 p3, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    if-ne p1, v0, :cond_6

    .line 4
    .line 5
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 14
    .line 15
    .line 16
    const/16 p2, 0x1fd6

    .line 17
    .line 18
    const-string v1, "statusCode"

    .line 19
    .line 20
    invoke-virtual {p1, v1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const-string v1, "sessionToken"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "uiMode"

    .line 31
    .line 32
    invoke-virtual {p1, v2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v2, 0x0

    .line 37
    or-int/2addr v2, v0

    .line 38
    int-to-byte v2, v2

    .line 39
    or-int/2addr v2, v0

    .line 40
    int-to-byte v2, v2

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    :goto_0
    or-int/lit8 v2, v2, 0x2

    .line 46
    .line 47
    int-to-byte v2, v2

    .line 48
    const/4 v3, 0x3

    .line 49
    if-eq v2, v3, :cond_3

    .line 50
    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    and-int/lit8 p2, v2, 0x1

    .line 57
    .line 58
    if-nez p2, :cond_1

    .line 59
    .line 60
    const-string p2, " statusCode"

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :cond_1
    and-int/lit8 p2, v2, 0x2

    .line 66
    .line 67
    if-nez p2, :cond_2

    .line 68
    .line 69
    const-string p2, " uiMode"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p3, "Missing required properties:"

    .line 81
    .line 82
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p2

    .line 90
    :cond_3
    new-instance v2, Lok3;

    .line 91
    .line 92
    invoke-direct {v2, v1, p2, p1}, Lok3;-><init>(Ljava/lang/String;II)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lqk3;->f:Lit3;

    .line 96
    .line 97
    invoke-virtual {p1, v2}, Lit3;->b(Lok3;)V

    .line 98
    .line 99
    .line 100
    const/16 p1, 0x1fdd

    .line 101
    .line 102
    if-ne p2, p1, :cond_5

    .line 103
    .line 104
    iget-object p1, p0, Lqk3;->g:Lrk3;

    .line 105
    .line 106
    iget-object p1, p1, Lrk3;->a:Lx03;

    .line 107
    .line 108
    if-nez p1, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    sget-object p2, Lrk3;->c:Ler3;

    .line 112
    .line 113
    const-string v1, "unbind LMD display overlay service"

    .line 114
    .line 115
    new-array p3, p3, [Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {p2, v1, p3}, Ler3;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p2, Lbh3;

    .line 121
    .line 122
    const/4 p3, 0x5

    .line 123
    invoke-direct {p2, p3, p1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Lx03;->c(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_1
    return v0

    .line 130
    :cond_6
    return p3
.end method
