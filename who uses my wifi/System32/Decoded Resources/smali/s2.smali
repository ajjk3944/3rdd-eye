.class public final enum Ls2;
.super Ljava/lang/Enum;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final enum g:Ls2;

.field public static final enum h:Ls2;

.field public static final enum i:Ls2;

.field public static final enum j:Ls2;

.field public static final enum k:Ls2;

.field public static final enum l:Ls2;

.field public static final synthetic m:[Ls2;


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ls2;

    .line 2
    .line 3
    const-string v1, "BANNER"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Ls2;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls2;->g:Ls2;

    .line 10
    .line 11
    new-instance v1, Ls2;

    .line 12
    .line 13
    const-string v2, "INTERSTITIAL"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Ls2;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ls2;->h:Ls2;

    .line 20
    .line 21
    new-instance v2, Ls2;

    .line 22
    .line 23
    const-string v3, "REWARDED"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Ls2;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Ls2;->i:Ls2;

    .line 30
    .line 31
    new-instance v3, Ls2;

    .line 32
    .line 33
    const-string v4, "REWARDED_INTERSTITIAL"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Ls2;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Ls2;->j:Ls2;

    .line 40
    .line 41
    new-instance v4, Ls2;

    .line 42
    .line 43
    const-string v5, "NATIVE"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, Ls2;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Ls2;->k:Ls2;

    .line 50
    .line 51
    new-instance v5, Ls2;

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    const/4 v7, 0x6

    .line 55
    const-string v8, "APP_OPEN_AD"

    .line 56
    .line 57
    invoke-direct {v5, v8, v6, v7}, Ls2;-><init>(Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    sput-object v5, Ls2;->l:Ls2;

    .line 61
    .line 62
    filled-new-array/range {v0 .. v5}, [Ls2;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Ls2;->m:[Ls2;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ls2;->f:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(I)Ls2;
    .locals 5

    .line 1
    invoke-static {}, Ls2;->values()[Ls2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Ls2;->f:I

    .line 12
    .line 13
    if-ne v4, p0, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ls2;
    .locals 1

    .line 1
    const-class v0, Ls2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ls2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ls2;
    .locals 1

    .line 1
    sget-object v0, Ls2;->m:[Ls2;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ls2;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ls2;

    .line 8
    .line 9
    return-object v0
.end method
