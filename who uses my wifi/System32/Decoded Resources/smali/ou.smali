.class public abstract Lou;
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
    const-string v1, "DNS Header Flag"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lou;->a:Lue0;

    .line 10
    .line 11
    const/16 v1, 0xf

    .line 12
    .line 13
    iput v1, v0, Lue0;->i:I

    .line 14
    .line 15
    const-string v1, "FLAG"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, "qr"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    const-string v2, "aa"

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    const-string v2, "tc"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x7

    .line 39
    const-string v2, "rd"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    const-string v2, "ra"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    const/16 v1, 0xa

    .line 52
    .line 53
    const-string v2, "ad"

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0xb

    .line 59
    .line 60
    const-string v2, "cd"

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
