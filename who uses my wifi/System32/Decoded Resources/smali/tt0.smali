.class public abstract Ltt0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lue0;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lue0;

    .line 2
    .line 3
    const-string v1, "Message Section"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ltt0;->a:Lue0;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    new-array v3, v1, [Ljava/lang/String;

    .line 13
    .line 14
    sput-object v3, Ltt0;->b:[Ljava/lang/String;

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/String;

    .line 17
    .line 18
    sput-object v1, Ltt0;->c:[Ljava/lang/String;

    .line 19
    .line 20
    iput v2, v0, Lue0;->i:I

    .line 21
    .line 22
    const-string v4, "qd"

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-virtual {v0, v4, v5}, Lue0;->b(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v4, "an"

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-virtual {v0, v4, v6}, Lue0;->b(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-string v4, "au"

    .line 35
    .line 36
    const/4 v7, 0x2

    .line 37
    invoke-virtual {v0, v4, v7}, Lue0;->b(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const-string v4, "ad"

    .line 41
    .line 42
    invoke-virtual {v0, v4, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    const-string v0, "QUESTIONS"

    .line 46
    .line 47
    aput-object v0, v3, v5

    .line 48
    .line 49
    const-string v0, "ANSWERS"

    .line 50
    .line 51
    aput-object v0, v3, v6

    .line 52
    .line 53
    const-string v0, "AUTHORITY RECORDS"

    .line 54
    .line 55
    aput-object v0, v3, v7

    .line 56
    .line 57
    const-string v0, "ADDITIONAL RECORDS"

    .line 58
    .line 59
    aput-object v0, v3, v2

    .line 60
    .line 61
    const-string v3, "ZONE"

    .line 62
    .line 63
    aput-object v3, v1, v5

    .line 64
    .line 65
    const-string v3, "PREREQUISITES"

    .line 66
    .line 67
    aput-object v3, v1, v6

    .line 68
    .line 69
    const-string v3, "UPDATE RECORDS"

    .line 70
    .line 71
    aput-object v3, v1, v7

    .line 72
    .line 73
    aput-object v0, v1, v2

    .line 74
    .line 75
    return-void
.end method
