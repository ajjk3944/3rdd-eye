.class public abstract Loj0;
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
    const-string v1, "DNS Opcode"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Loj0;->a:Lue0;

    .line 10
    .line 11
    const/16 v1, 0xf

    .line 12
    .line 13
    iput v1, v0, Lue0;->i:I

    .line 14
    .line 15
    const-string v1, "RESERVED"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v3, "QUERY"

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const-string v3, "IQUERY"

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v1, "STATUS"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    const-string v2, "NOTIFY"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    const-string v2, "UPDATE"

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x6

    .line 50
    const-string v2, "DSO"

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
