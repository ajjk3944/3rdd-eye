.class public final enum Lic/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lic/a;

.field public static final enum NAME:Lic/a;

.field public static final enum SIGNAL:Lic/a;


# direct methods
.method private static final synthetic $values()[Lic/a;
    .locals 2

    sget-object v0, Lic/a;->NAME:Lic/a;

    sget-object v1, Lic/a;->SIGNAL:Lic/a;

    filled-new-array {v0, v1}, [Lic/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lic/a;

    const-string/jumbo v1, "NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lic/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/a;->NAME:Lic/a;

    new-instance v0, Lic/a;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lic/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/a;->SIGNAL:Lic/a;

    invoke-static {}, Lic/a;->$values()[Lic/a;

    move-result-object v0

    sput-object v0, Lic/a;->$VALUES:[Lic/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lic/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lic/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lic/a;
    .locals 1

    const-class v0, Lic/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lic/a;

    return-object p0
.end method

.method public static values()[Lic/a;
    .locals 1

    sget-object v0, Lic/a;->$VALUES:[Lic/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lic/a;

    return-object v0
.end method
