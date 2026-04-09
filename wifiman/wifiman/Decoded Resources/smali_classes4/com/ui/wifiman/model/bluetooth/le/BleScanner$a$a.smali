.class public final enum Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

.field public static final enum BOOTING:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

.field public static final enum FACTORY:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

.field public static final enum NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
    .locals 3

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->BOOTING:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    sget-object v1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->FACTORY:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    sget-object v2, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    filled-new-array {v0, v1, v2}, [Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    const-string v1, "BOOTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->BOOTING:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    const-string v1, "FACTORY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->FACTORY:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    const-string v1, "NORMAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->$values()[Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->$VALUES:[Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->$VALUES:[Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    return-object v0
.end method
