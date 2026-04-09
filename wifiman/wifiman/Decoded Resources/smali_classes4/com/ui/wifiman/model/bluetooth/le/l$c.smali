.class public final enum Lcom/ui/wifiman/model/bluetooth/le/l$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum ANDROID:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum APPLE_IPAD:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum APPLE_IPHONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum LINUS_DEVICE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum SURFACE_HUB:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum WINDOWS_10_DESKTOP:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum WINDOWS_10_PHONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum WINDOWS_IOT:Lcom/ui/wifiman/model/bluetooth/le/l$c;

.field public static final enum XBOX_ONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;


# instance fields
.field private final id:B


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/bluetooth/le/l$c;
    .locals 9

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->XBOX_ONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v1, Lcom/ui/wifiman/model/bluetooth/le/l$c;->APPLE_IPHONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v2, Lcom/ui/wifiman/model/bluetooth/le/l$c;->APPLE_IPAD:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v3, Lcom/ui/wifiman/model/bluetooth/le/l$c;->ANDROID:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v4, Lcom/ui/wifiman/model/bluetooth/le/l$c;->WINDOWS_10_DESKTOP:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v5, Lcom/ui/wifiman/model/bluetooth/le/l$c;->WINDOWS_10_PHONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v6, Lcom/ui/wifiman/model/bluetooth/le/l$c;->LINUS_DEVICE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v7, Lcom/ui/wifiman/model/bluetooth/le/l$c;->WINDOWS_IOT:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    sget-object v8, Lcom/ui/wifiman/model/bluetooth/le/l$c;->SURFACE_HUB:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    filled-new-array/range {v0 .. v8}, [Lcom/ui/wifiman/model/bluetooth/le/l$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "XBOX_ONE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->XBOX_ONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "APPLE_IPHONE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->APPLE_IPHONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "APPLE_IPAD"

    const/4 v3, 0x2

    const/4 v4, 0x7

    invoke-direct {v0, v1, v3, v4}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->APPLE_IPAD:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "ANDROID"

    const/4 v3, 0x3

    const/16 v5, 0x8

    invoke-direct {v0, v1, v3, v5}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->ANDROID:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const/4 v1, 0x4

    const/16 v3, 0x9

    const-string v6, "WINDOWS_10_DESKTOP"

    invoke-direct {v0, v6, v1, v3}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->WINDOWS_10_DESKTOP:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const/4 v1, 0x5

    const/16 v3, 0xb

    const-string v6, "WINDOWS_10_PHONE"

    invoke-direct {v0, v6, v1, v3}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->WINDOWS_10_PHONE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "LINUS_DEVICE"

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, v3}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->LINUS_DEVICE:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "WINDOWS_IOT"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v4, v2}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->WINDOWS_IOT:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    const-string v1, "SURFACE_HUB"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v5, v2}, Lcom/ui/wifiman/model/bluetooth/le/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->SURFACE_HUB:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/l$c;->$values()[Lcom/ui/wifiman/model/bluetooth/le/l$c;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->$VALUES:[Lcom/ui/wifiman/model/bluetooth/le/l$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->id:B

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

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/bluetooth/le/l$c;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/bluetooth/le/l$c;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->$VALUES:[Lcom/ui/wifiman/model/bluetooth/le/l$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/bluetooth/le/l$c;

    return-object v0
.end method


# virtual methods
.method public final getId()B
    .locals 1

    iget-byte v0, p0, Lcom/ui/wifiman/model/bluetooth/le/l$c;->id:B

    return v0
.end method
