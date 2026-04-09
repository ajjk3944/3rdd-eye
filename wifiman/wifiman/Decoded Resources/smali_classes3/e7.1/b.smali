.class public final enum Le7/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/b$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Le7/b;

.field public static final enum AVAILABLE:Le7/b;

.field public static final Companion:Le7/b$a;

.field public static final enum ERROR:Le7/b;

.field public static final enum NOT_INSTALLED:Le7/b;

.field public static final enum UNSUPPORTED:Le7/b;


# direct methods
.method private static final synthetic $values()[Le7/b;
    .locals 4

    sget-object v0, Le7/b;->AVAILABLE:Le7/b;

    sget-object v1, Le7/b;->NOT_INSTALLED:Le7/b;

    sget-object v2, Le7/b;->UNSUPPORTED:Le7/b;

    sget-object v3, Le7/b;->ERROR:Le7/b;

    filled-new-array {v0, v1, v2, v3}, [Le7/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Le7/b;

    const-string v1, "AVAILABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le7/b;->AVAILABLE:Le7/b;

    new-instance v0, Le7/b;

    const-string/jumbo v1, "NOT_INSTALLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le7/b;->NOT_INSTALLED:Le7/b;

    new-instance v0, Le7/b;

    const-string/jumbo v1, "UNSUPPORTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Le7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le7/b;->UNSUPPORTED:Le7/b;

    new-instance v0, Le7/b;

    const-string/jumbo v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Le7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le7/b;->ERROR:Le7/b;

    invoke-static {}, Le7/b;->$values()[Le7/b;

    move-result-object v0

    sput-object v0, Le7/b;->$VALUES:[Le7/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Le7/b;->$ENTRIES:Lfh/a;

    new-instance v0, Le7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le7/b;->Companion:Le7/b$a;

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

    sget-object v0, Le7/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le7/b;
    .locals 1

    const-class v0, Le7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le7/b;

    return-object p0
.end method

.method public static values()[Le7/b;
    .locals 1

    sget-object v0, Le7/b;->$VALUES:[Le7/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le7/b;

    return-object v0
.end method
