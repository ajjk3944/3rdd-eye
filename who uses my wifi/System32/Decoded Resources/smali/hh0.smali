.class public final Lhh0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/net/InetSocketAddress;


# direct methods
.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhh0;->a:Ljava/net/InetSocketAddress;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lhh0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lhh0;

    .line 10
    .line 11
    iget-object p1, p1, Lhh0;->a:Ljava/net/InetSocketAddress;

    .line 12
    .line 13
    iget-object v0, p0, Lhh0;->a:Ljava/net/InetSocketAddress;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_3

    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/16 v0, 0x3b

    .line 2
    .line 3
    const/16 v1, 0x2b

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x3b

    .line 7
    .line 8
    iget-object v2, p0, Lhh0;->a:Ljava/net/InetSocketAddress;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :goto_0
    add-int/2addr v0, v1

    .line 18
    return v0
.end method
