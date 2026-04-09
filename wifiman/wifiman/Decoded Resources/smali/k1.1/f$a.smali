.class final enum Lk1/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk1/f$a;

.field public static final enum BASELINE:Lk1/f$a;

.field public static final enum BOTTOM:Lk1/f$a;

.field public static final enum HORIZONTAL_DIMENSION:Lk1/f$a;

.field public static final enum LEFT:Lk1/f$a;

.field public static final enum RIGHT:Lk1/f$a;

.field public static final enum TOP:Lk1/f$a;

.field public static final enum UNKNOWN:Lk1/f$a;

.field public static final enum VERTICAL_DIMENSION:Lk1/f$a;


# direct methods
.method private static synthetic $values()[Lk1/f$a;
    .locals 8

    sget-object v0, Lk1/f$a;->UNKNOWN:Lk1/f$a;

    sget-object v1, Lk1/f$a;->HORIZONTAL_DIMENSION:Lk1/f$a;

    sget-object v2, Lk1/f$a;->VERTICAL_DIMENSION:Lk1/f$a;

    sget-object v3, Lk1/f$a;->LEFT:Lk1/f$a;

    sget-object v4, Lk1/f$a;->RIGHT:Lk1/f$a;

    sget-object v5, Lk1/f$a;->TOP:Lk1/f$a;

    sget-object v6, Lk1/f$a;->BOTTOM:Lk1/f$a;

    sget-object v7, Lk1/f$a;->BASELINE:Lk1/f$a;

    filled-new-array/range {v0 .. v7}, [Lk1/f$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk1/f$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->UNKNOWN:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "HORIZONTAL_DIMENSION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->HORIZONTAL_DIMENSION:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "VERTICAL_DIMENSION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->VERTICAL_DIMENSION:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "LEFT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->LEFT:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "RIGHT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->RIGHT:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "TOP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->TOP:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "BOTTOM"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->BOTTOM:Lk1/f$a;

    new-instance v0, Lk1/f$a;

    const-string v1, "BASELINE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lk1/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/f$a;->BASELINE:Lk1/f$a;

    invoke-static {}, Lk1/f$a;->$values()[Lk1/f$a;

    move-result-object v0

    sput-object v0, Lk1/f$a;->$VALUES:[Lk1/f$a;

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

.method public static valueOf(Ljava/lang/String;)Lk1/f$a;
    .locals 1

    const-class v0, Lk1/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk1/f$a;

    return-object p0
.end method

.method public static values()[Lk1/f$a;
    .locals 1

    sget-object v0, Lk1/f$a;->$VALUES:[Lk1/f$a;

    invoke-virtual {v0}, [Lk1/f$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk1/f$a;

    return-object v0
.end method
