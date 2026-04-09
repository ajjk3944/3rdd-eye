.class public final enum LS/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LS/e;

.field public static final enum CornerExtraLarge:LS/e;

.field public static final enum CornerExtraLargeTop:LS/e;

.field public static final enum CornerExtraSmall:LS/e;

.field public static final enum CornerExtraSmallTop:LS/e;

.field public static final enum CornerFull:LS/e;

.field public static final enum CornerLarge:LS/e;

.field public static final enum CornerLargeEnd:LS/e;

.field public static final enum CornerLargeTop:LS/e;

.field public static final enum CornerMedium:LS/e;

.field public static final enum CornerNone:LS/e;

.field public static final enum CornerSmall:LS/e;


# direct methods
.method private static final synthetic $values()[LS/e;
    .locals 11

    sget-object v0, LS/e;->CornerExtraLarge:LS/e;

    sget-object v1, LS/e;->CornerExtraLargeTop:LS/e;

    sget-object v2, LS/e;->CornerExtraSmall:LS/e;

    sget-object v3, LS/e;->CornerExtraSmallTop:LS/e;

    sget-object v4, LS/e;->CornerFull:LS/e;

    sget-object v5, LS/e;->CornerLarge:LS/e;

    sget-object v6, LS/e;->CornerLargeEnd:LS/e;

    sget-object v7, LS/e;->CornerLargeTop:LS/e;

    sget-object v8, LS/e;->CornerMedium:LS/e;

    sget-object v9, LS/e;->CornerNone:LS/e;

    sget-object v10, LS/e;->CornerSmall:LS/e;

    filled-new-array/range {v0 .. v10}, [LS/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/e;

    const-string v1, "CornerExtraLarge"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerExtraLarge:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerExtraLargeTop"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerExtraLargeTop:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerExtraSmall"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerExtraSmall:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerExtraSmallTop"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerExtraSmallTop:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerFull"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerFull:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerLarge"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerLarge:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerLargeEnd"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerLargeEnd:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerLargeTop"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerLargeTop:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerMedium"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerMedium:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerNone"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerNone:LS/e;

    new-instance v0, LS/e;

    const-string v1, "CornerSmall"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, LS/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/e;->CornerSmall:LS/e;

    invoke-static {}, LS/e;->$values()[LS/e;

    move-result-object v0

    sput-object v0, LS/e;->$VALUES:[LS/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LS/e;
    .locals 1

    const-class v0, LS/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS/e;

    return-object p0
.end method

.method public static values()[LS/e;
    .locals 1

    sget-object v0, LS/e;->$VALUES:[LS/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS/e;

    return-object v0
.end method
