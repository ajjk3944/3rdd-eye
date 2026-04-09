.class public final enum Lcom/ui/wifiman/model/android/permissions/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/android/permissions/a;

.field public static final enum BLUETOOTH:Lcom/ui/wifiman/model/android/permissions/a;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final enum CAMERA:Lcom/ui/wifiman/model/android/permissions/a;

.field public static final enum LOCATION:Lcom/ui/wifiman/model/android/permissions/a;

.field public static final enum LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

.field public static final enum NOTIFICATION:Lcom/ui/wifiman/model/android/permissions/a;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final enum PHONE_STATE:Lcom/ui/wifiman/model/android/permissions/a;


# instance fields
.field private final allRequired:Z

.field private final alwaysGranted:Z

.field private final apiID:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/android/permissions/a;
    .locals 6

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v1, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v2, Lcom/ui/wifiman/model/android/permissions/a;->BLUETOOTH:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v3, Lcom/ui/wifiman/model/android/permissions/a;->PHONE_STATE:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v4, Lcom/ui/wifiman/model/android/permissions/a;->CAMERA:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v5, Lcom/ui/wifiman/model/android/permissions/a;->NOTIFICATION:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array/range {v0 .. v5}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 18

    new-instance v8, Lcom/ui/wifiman/model/android/permissions/a;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v9, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {v9, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v1, "LOCATION"

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION:Lcom/ui/wifiman/model/android/permissions/a;

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/a;

    invoke-static {v9}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const-string v11, "LOCATION_FINE"

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v17}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/a;

    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    const-string v2, "android.permission.BLUETOOTH_SCAN"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v2, "BLUETOOTH"

    const/4 v3, 0x2

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->BLUETOOTH:Lcom/ui/wifiman/model/android/permissions/a;

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/a;

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const-string v10, "PHONE_STATE"

    const/4 v11, 0x3

    const/4 v13, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->PHONE_STATE:Lcom/ui/wifiman/model/android/permissions/a;

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/a;

    const-string v1, "android.permission.CAMERA"

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v2, "CAMERA"

    const/4 v3, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->CAMERA:Lcom/ui/wifiman/model/android/permissions/a;

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/a;

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    :goto_0
    move v14, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/4 v15, 0x2

    const/16 v16, 0x0

    const-string v10, "NOTIFICATION"

    const/4 v11, 0x5

    const/4 v13, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->NOTIFICATION:Lcom/ui/wifiman/model/android/permissions/a;

    invoke-static {}, Lcom/ui/wifiman/model/android/permissions/a;->$values()[Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->$VALUES:[Lcom/ui/wifiman/model/android/permissions/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/android/permissions/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/List;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/ui/wifiman/model/android/permissions/a;->apiID:Ljava/util/List;

    .line 3
    iput-boolean p4, p0, Lcom/ui/wifiman/model/android/permissions/a;->allRequired:Z

    .line 4
    iput-boolean p5, p0, Lcom/ui/wifiman/model/android/permissions/a;->alwaysGranted:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x4

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 5
    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/model/android/permissions/a;-><init>(Ljava/lang/String;ILjava/util/List;ZZ)V

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

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/android/permissions/a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/android/permissions/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/android/permissions/a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/android/permissions/a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->$VALUES:[Lcom/ui/wifiman/model/android/permissions/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/android/permissions/a;

    return-object v0
.end method


# virtual methods
.method public final getAllRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/android/permissions/a;->allRequired:Z

    return v0
.end method

.method public final getAlwaysGranted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/android/permissions/a;->alwaysGranted:Z

    return v0
.end method

.method public final getApiID()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ui/wifiman/model/android/permissions/a;->apiID:Ljava/util/List;

    return-object v0
.end method
