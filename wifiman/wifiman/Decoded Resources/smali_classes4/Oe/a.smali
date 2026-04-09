.class public final enum LOe/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LOe/a;

.field public static final enum LOCATION_ACCESS:LOe/a;

.field public static final enum NO_WIFIMAN_API:LOe/a;

.field public static final enum PERMISSION_CELLULAR:LOe/a;

.field public static final enum PERMISSION_LOCATION:LOe/a;


# direct methods
.method private static final synthetic $values()[LOe/a;
    .locals 4

    sget-object v0, LOe/a;->PERMISSION_LOCATION:LOe/a;

    sget-object v1, LOe/a;->PERMISSION_CELLULAR:LOe/a;

    sget-object v2, LOe/a;->LOCATION_ACCESS:LOe/a;

    sget-object v3, LOe/a;->NO_WIFIMAN_API:LOe/a;

    filled-new-array {v0, v1, v2, v3}, [LOe/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LOe/a;

    const-string v1, "PERMISSION_LOCATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LOe/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOe/a;->PERMISSION_LOCATION:LOe/a;

    new-instance v0, LOe/a;

    const-string v1, "PERMISSION_CELLULAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LOe/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOe/a;->PERMISSION_CELLULAR:LOe/a;

    new-instance v0, LOe/a;

    const-string v1, "LOCATION_ACCESS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LOe/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOe/a;->LOCATION_ACCESS:LOe/a;

    new-instance v0, LOe/a;

    const-string v1, "NO_WIFIMAN_API"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LOe/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOe/a;->NO_WIFIMAN_API:LOe/a;

    invoke-static {}, LOe/a;->$values()[LOe/a;

    move-result-object v0

    sput-object v0, LOe/a;->$VALUES:[LOe/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LOe/a;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LOe/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LOe/a;
    .locals 1

    const-class v0, LOe/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LOe/a;

    return-object p0
.end method

.method public static values()[LOe/a;
    .locals 1

    sget-object v0, LOe/a;->$VALUES:[LOe/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOe/a;

    return-object v0
.end method
