.class public final enum Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

.field public static final enum BATTERY:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

.field public static final Companion:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;

.field public static final enum PLUGGED:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

.field private static final values:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
    .locals 2

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->BATTERY:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    sget-object v1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->PLUGGED:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    filled-new-array {v0, v1}, [Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    const-string v1, "battery"

    const-string v2, "BATTERY"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->BATTERY:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    new-instance v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    const/4 v1, 0x1

    const-string v2, "pluggedIn"

    const-string v4, "PLUGGED"

    invoke-direct {v0, v4, v1, v2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->PLUGGED:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    invoke-static {}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->$values()[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->$VALUES:[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->$ENTRIES:Lfh/a;

    new-instance v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->Companion:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;

    invoke-static {}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->values()[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-object v5, v4, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->id:Ljava/lang/String;

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sput-object v2, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->values:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->id:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getValues$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->values:Ljava/util/Map;

    return-object v0
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
    .locals 1

    const-class v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
    .locals 1

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->$VALUES:[Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->id:Ljava/lang/String;

    return-object v0
.end method
