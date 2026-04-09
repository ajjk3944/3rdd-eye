.class public final enum LC2/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LC2/b;

.field public static final DEFAULT:LC2/b;

.field public static final enum PREFER_ARGB_8888:LC2/b;

.field public static final enum PREFER_RGB_565:LC2/b;


# direct methods
.method private static synthetic $values()[LC2/b;
    .locals 2

    sget-object v0, LC2/b;->PREFER_ARGB_8888:LC2/b;

    sget-object v1, LC2/b;->PREFER_RGB_565:LC2/b;

    filled-new-array {v0, v1}, [LC2/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LC2/b;

    const-string v1, "PREFER_ARGB_8888"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LC2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/b;->PREFER_ARGB_8888:LC2/b;

    new-instance v1, LC2/b;

    const-string v2, "PREFER_RGB_565"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LC2/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LC2/b;->PREFER_RGB_565:LC2/b;

    invoke-static {}, LC2/b;->$values()[LC2/b;

    move-result-object v1

    sput-object v1, LC2/b;->$VALUES:[LC2/b;

    sput-object v0, LC2/b;->DEFAULT:LC2/b;

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

.method public static valueOf(Ljava/lang/String;)LC2/b;
    .locals 1

    const-class v0, LC2/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC2/b;

    return-object p0
.end method

.method public static values()[LC2/b;
    .locals 1

    sget-object v0, LC2/b;->$VALUES:[LC2/b;

    invoke-virtual {v0}, [LC2/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC2/b;

    return-object v0
.end method
