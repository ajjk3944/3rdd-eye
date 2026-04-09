.class public final enum Lac3;
.super Ljava/lang/Enum;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final enum f:Lac3;

.field public static final synthetic g:[Lac3;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lac3;

    .line 2
    .line 3
    const-string v1, "VIDEO_CONTROLS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lac3;

    .line 10
    .line 11
    const-string v2, "CLOSE_AD"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lac3;

    .line 18
    .line 19
    const-string v3, "NOT_VISIBLE"

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    sput-object v2, Lac3;->f:Lac3;

    .line 26
    .line 27
    new-instance v3, Lac3;

    .line 28
    .line 29
    const-string v4, "OTHER"

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    filled-new-array {v0, v1, v2, v3}, [Lac3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lac3;->g:[Lac3;

    .line 40
    .line 41
    return-void
.end method

.method public static values()[Lac3;
    .locals 1

    .line 1
    sget-object v0, Lac3;->g:[Lac3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lac3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lac3;

    .line 8
    .line 9
    return-object v0
.end method
