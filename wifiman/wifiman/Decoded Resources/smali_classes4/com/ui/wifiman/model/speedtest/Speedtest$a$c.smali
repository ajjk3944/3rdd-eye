.class public final enum Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/Speedtest$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

.field public static final enum CONNECTING:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

.field public static final enum FINISHED:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

.field public static final enum IN_PROGRESS:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;
    .locals 3

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->CONNECTING:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    sget-object v1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->IN_PROGRESS:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    sget-object v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->FINISHED:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    filled-new-array {v0, v1, v2}, [Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    const-string v1, "CONNECTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->CONNECTING:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    const-string v1, "IN_PROGRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->IN_PROGRESS:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    const-string v1, "FINISHED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->FINISHED:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-static {}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->$values()[Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->$VALUES:[Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->$VALUES:[Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    return-object v0
.end method
