.class public final enum LC2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LC2/a;

.field public static final enum DATA_DISK_CACHE:LC2/a;

.field public static final enum LOCAL:LC2/a;

.field public static final enum MEMORY_CACHE:LC2/a;

.field public static final enum REMOTE:LC2/a;

.field public static final enum RESOURCE_DISK_CACHE:LC2/a;


# direct methods
.method private static synthetic $values()[LC2/a;
    .locals 5

    sget-object v0, LC2/a;->LOCAL:LC2/a;

    sget-object v1, LC2/a;->REMOTE:LC2/a;

    sget-object v2, LC2/a;->DATA_DISK_CACHE:LC2/a;

    sget-object v3, LC2/a;->RESOURCE_DISK_CACHE:LC2/a;

    sget-object v4, LC2/a;->MEMORY_CACHE:LC2/a;

    filled-new-array {v0, v1, v2, v3, v4}, [LC2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LC2/a;

    const-string v1, "LOCAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LC2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/a;->LOCAL:LC2/a;

    new-instance v0, LC2/a;

    const-string v1, "REMOTE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LC2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/a;->REMOTE:LC2/a;

    new-instance v0, LC2/a;

    const-string v1, "DATA_DISK_CACHE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LC2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/a;->DATA_DISK_CACHE:LC2/a;

    new-instance v0, LC2/a;

    const-string v1, "RESOURCE_DISK_CACHE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LC2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/a;->RESOURCE_DISK_CACHE:LC2/a;

    new-instance v0, LC2/a;

    const-string v1, "MEMORY_CACHE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LC2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/a;->MEMORY_CACHE:LC2/a;

    invoke-static {}, LC2/a;->$values()[LC2/a;

    move-result-object v0

    sput-object v0, LC2/a;->$VALUES:[LC2/a;

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

.method public static valueOf(Ljava/lang/String;)LC2/a;
    .locals 1

    const-class v0, LC2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC2/a;

    return-object p0
.end method

.method public static values()[LC2/a;
    .locals 1

    sget-object v0, LC2/a;->$VALUES:[LC2/a;

    invoke-virtual {v0}, [LC2/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC2/a;

    return-object v0
.end method
