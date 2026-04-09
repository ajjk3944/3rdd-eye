.class public final enum LC2/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LC2/h;

.field public static final enum DISPLAY_P3:LC2/h;

.field public static final enum SRGB:LC2/h;


# direct methods
.method private static synthetic $values()[LC2/h;
    .locals 2

    sget-object v0, LC2/h;->SRGB:LC2/h;

    sget-object v1, LC2/h;->DISPLAY_P3:LC2/h;

    filled-new-array {v0, v1}, [LC2/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LC2/h;

    const-string v1, "SRGB"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LC2/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/h;->SRGB:LC2/h;

    new-instance v0, LC2/h;

    const-string v1, "DISPLAY_P3"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LC2/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/h;->DISPLAY_P3:LC2/h;

    invoke-static {}, LC2/h;->$values()[LC2/h;

    move-result-object v0

    sput-object v0, LC2/h;->$VALUES:[LC2/h;

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

.method public static valueOf(Ljava/lang/String;)LC2/h;
    .locals 1

    const-class v0, LC2/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC2/h;

    return-object p0
.end method

.method public static values()[LC2/h;
    .locals 1

    sget-object v0, LC2/h;->$VALUES:[LC2/h;

    invoke-virtual {v0}, [LC2/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC2/h;

    return-object v0
.end method
