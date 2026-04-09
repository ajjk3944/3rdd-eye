.class abstract enum Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

.field public static final enum SPEEDTEST_STATUS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;


# instance fields
.field private final typeId:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->SPEEDTEST_STATUS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a$a;

    const-string v1, "SPEEDTEST_STATUS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->SPEEDTEST_STATUS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->$values()[Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->$VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->$ENTRIES:Lfh/a;

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

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->typeId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

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

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->$VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    return-object v0
.end method


# virtual methods
.method public abstract getJsonAdapter(LY6/r;)LY6/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY6/r;",
            ")",
            "LY6/h<",
            "+",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data<",
            "+",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/a;",
            ">;>;"
        }
    .end annotation
.end method

.method public final getTypeId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->typeId:Ljava/lang/String;

    return-object v0
.end method
