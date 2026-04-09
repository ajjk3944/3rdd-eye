.class public final enum Laj/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Laj/a;

.field public static final enum ALL_JSON_OBJECTS:Laj/a;

.field public static final enum NONE:Laj/a;

.field public static final enum POLYMORPHIC:Laj/a;


# direct methods
.method private static final synthetic $values()[Laj/a;
    .locals 3

    sget-object v0, Laj/a;->NONE:Laj/a;

    sget-object v1, Laj/a;->ALL_JSON_OBJECTS:Laj/a;

    sget-object v2, Laj/a;->POLYMORPHIC:Laj/a;

    filled-new-array {v0, v1, v2}, [Laj/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Laj/a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laj/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laj/a;->NONE:Laj/a;

    new-instance v0, Laj/a;

    const-string v1, "ALL_JSON_OBJECTS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Laj/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laj/a;->ALL_JSON_OBJECTS:Laj/a;

    new-instance v0, Laj/a;

    const-string v1, "POLYMORPHIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Laj/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laj/a;->POLYMORPHIC:Laj/a;

    invoke-static {}, Laj/a;->$values()[Laj/a;

    move-result-object v0

    sput-object v0, Laj/a;->$VALUES:[Laj/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Laj/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Laj/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Laj/a;
    .locals 1

    const-class v0, Laj/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laj/a;

    return-object p0
.end method

.method public static values()[Laj/a;
    .locals 1

    sget-object v0, Laj/a;->$VALUES:[Laj/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laj/a;

    return-object v0
.end method
