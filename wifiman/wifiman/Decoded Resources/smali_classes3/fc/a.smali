.class public final enum Lfc/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lfc/a;

.field public static final enum MAC:Lfc/a;

.field public static final enum NAME:Lfc/a;

.field public static final enum SIGNAL:Lfc/a;


# direct methods
.method private static final synthetic $values()[Lfc/a;
    .locals 3

    sget-object v0, Lfc/a;->NAME:Lfc/a;

    sget-object v1, Lfc/a;->SIGNAL:Lfc/a;

    sget-object v2, Lfc/a;->MAC:Lfc/a;

    filled-new-array {v0, v1, v2}, [Lfc/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfc/a;

    const-string/jumbo v1, "NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc/a;->NAME:Lfc/a;

    new-instance v0, Lfc/a;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc/a;->SIGNAL:Lfc/a;

    new-instance v0, Lfc/a;

    const-string/jumbo v1, "MAC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc/a;->MAC:Lfc/a;

    invoke-static {}, Lfc/a;->$values()[Lfc/a;

    move-result-object v0

    sput-object v0, Lfc/a;->$VALUES:[Lfc/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lfc/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lfc/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfc/a;
    .locals 1

    const-class v0, Lfc/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfc/a;

    return-object p0
.end method

.method public static values()[Lfc/a;
    .locals 1

    sget-object v0, Lfc/a;->$VALUES:[Lfc/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfc/a;

    return-object v0
.end method
