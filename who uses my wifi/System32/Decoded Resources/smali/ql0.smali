.class public final Lql0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:Ljava/net/InetAddress;

.field public c:I

.field public d:Z

.field public e:Ljava/util/ArrayList;

.field public f:Ljava/util/ArrayList;

.field public g:Lpl0;


# direct methods
.method public static a(Ljava/lang/String;)Lql0;
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lql0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x32

    .line 11
    .line 12
    iput v1, v0, Lql0;->a:I

    .line 13
    .line 14
    const/16 v2, 0x3e8

    .line 15
    .line 16
    iput v2, v0, Lql0;->c:I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    iput-boolean v3, v0, Lql0;->d:Z

    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v3, v0, Lql0;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v3, v0, Lql0;->f:Ljava/util/ArrayList;

    .line 34
    .line 35
    iput-object p0, v0, Lql0;->b:Ljava/net/InetAddress;

    .line 36
    .line 37
    sget-object v3, Lx10;->a:Ljava/util/regex/Pattern;

    .line 38
    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/net/NetworkInterface;->getByInetAddress(Ljava/net/InetAddress;)Ljava/net/NetworkInterface;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catch_0
    :cond_2
    :goto_0
    iget-object p0, v0, Lql0;->b:Ljava/net/InetAddress;

    .line 63
    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    iput v2, v0, Lql0;->c:I

    .line 73
    .line 74
    iput v1, v0, Lql0;->a:I

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/16 p0, 0x9c4

    .line 78
    .line 79
    iput p0, v0, Lql0;->c:I

    .line 80
    .line 81
    iput v1, v0, Lql0;->a:I

    .line 82
    .line 83
    :goto_1
    return-object v0

    .line 84
    :cond_4
    :goto_2
    const/16 p0, 0x19

    .line 85
    .line 86
    iput p0, v0, Lql0;->c:I

    .line 87
    .line 88
    const/4 p0, 0x7

    .line 89
    iput p0, v0, Lql0;->a:I

    .line 90
    .line 91
    return-object v0
.end method

.method public static b(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_1

    .line 3
    .line 4
    const v0, 0xffff

    .line 5
    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "Start cannot be greater than 65535"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Start port cannot be less than 1"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method
