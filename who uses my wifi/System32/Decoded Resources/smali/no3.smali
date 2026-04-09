.class public final enum Lno3;
.super Ljava/lang/Enum;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final enum f:Lno3;

.field public static final synthetic g:[Lno3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lno3;

    .line 2
    .line 3
    const-string v1, "APPEND"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lno3;->f:Lno3;

    .line 10
    .line 11
    filled-new-array {v0}, [Lno3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lno3;->g:[Lno3;

    .line 16
    .line 17
    return-void
.end method

.method public static values()[Lno3;
    .locals 1

    .line 1
    sget-object v0, Lno3;->g:[Lno3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lno3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lno3;

    .line 8
    .line 9
    return-object v0
.end method
