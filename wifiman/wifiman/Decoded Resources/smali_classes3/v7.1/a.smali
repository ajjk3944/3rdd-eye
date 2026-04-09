.class public final enum Lv7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lv7/a;

.field public static final enum BIG_ENDIAN:Lv7/a;

.field public static final enum LITTLE_ENDIAN:Lv7/a;


# direct methods
.method private static final synthetic $values()[Lv7/a;
    .locals 2

    sget-object v0, Lv7/a;->BIG_ENDIAN:Lv7/a;

    sget-object v1, Lv7/a;->LITTLE_ENDIAN:Lv7/a;

    filled-new-array {v0, v1}, [Lv7/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv7/a;

    const-string v1, "BIG_ENDIAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv7/a;->BIG_ENDIAN:Lv7/a;

    new-instance v0, Lv7/a;

    const-string/jumbo v1, "LITTLE_ENDIAN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lv7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv7/a;->LITTLE_ENDIAN:Lv7/a;

    invoke-static {}, Lv7/a;->$values()[Lv7/a;

    move-result-object v0

    sput-object v0, Lv7/a;->$VALUES:[Lv7/a;

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

.method public static valueOf(Ljava/lang/String;)Lv7/a;
    .locals 1

    const-class v0, Lv7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv7/a;

    return-object p0
.end method

.method public static values()[Lv7/a;
    .locals 1

    sget-object v0, Lv7/a;->$VALUES:[Lv7/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv7/a;

    return-object v0
.end method
