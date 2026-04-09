.class public final enum Lj90;
.super Ljava/lang/Enum;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final enum f:Lj90;

.field public static final synthetic g:[Lj90;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj90;

    .line 2
    .line 3
    const-string v1, "MergePathsApi19"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lj90;->f:Lj90;

    .line 10
    .line 11
    filled-new-array {v0}, [Lj90;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lj90;->g:[Lj90;

    .line 16
    .line 17
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj90;
    .locals 1

    .line 1
    const-class v0, Lj90;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lj90;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lj90;
    .locals 1

    .line 1
    sget-object v0, Lj90;->g:[Lj90;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lj90;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lj90;

    .line 8
    .line 9
    return-object v0
.end method
