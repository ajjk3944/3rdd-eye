.class public final enum Lb8/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lb8/c;

.field public static final enum DISCONNECTED:Lb8/c;

.field public static final enum ETHERNET:Lb8/c;

.field public static final enum MOBILE:Lb8/c;

.field public static final enum UNKNOWN:Lb8/c;

.field public static final enum WIFI:Lb8/c;


# direct methods
.method private static final synthetic $values()[Lb8/c;
    .locals 5

    sget-object v0, Lb8/c;->DISCONNECTED:Lb8/c;

    sget-object v1, Lb8/c;->MOBILE:Lb8/c;

    sget-object v2, Lb8/c;->WIFI:Lb8/c;

    sget-object v3, Lb8/c;->ETHERNET:Lb8/c;

    sget-object v4, Lb8/c;->UNKNOWN:Lb8/c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lb8/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb8/c;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb8/c;->DISCONNECTED:Lb8/c;

    new-instance v0, Lb8/c;

    const-string/jumbo v1, "MOBILE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb8/c;->MOBILE:Lb8/c;

    new-instance v0, Lb8/c;

    const-string/jumbo v1, "WIFI"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb8/c;->WIFI:Lb8/c;

    new-instance v0, Lb8/c;

    const-string/jumbo v1, "ETHERNET"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lb8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb8/c;->ETHERNET:Lb8/c;

    new-instance v0, Lb8/c;

    const-string/jumbo v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lb8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb8/c;->UNKNOWN:Lb8/c;

    invoke-static {}, Lb8/c;->$values()[Lb8/c;

    move-result-object v0

    sput-object v0, Lb8/c;->$VALUES:[Lb8/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lb8/c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lb8/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb8/c;
    .locals 1

    const-class v0, Lb8/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb8/c;

    return-object p0
.end method

.method public static values()[Lb8/c;
    .locals 1

    sget-object v0, Lb8/c;->$VALUES:[Lb8/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb8/c;

    return-object v0
.end method
