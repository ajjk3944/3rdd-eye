.class public final enum Lei/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lei/b;

.field public static final enum ERROR:Lei/b;

.field public static final enum HIDDEN:Lei/b;

.field public static final enum WARNING:Lei/b;


# direct methods
.method private static final synthetic $values()[Lei/b;
    .locals 3

    sget-object v0, Lei/b;->WARNING:Lei/b;

    sget-object v1, Lei/b;->ERROR:Lei/b;

    sget-object v2, Lei/b;->HIDDEN:Lei/b;

    filled-new-array {v0, v1, v2}, [Lei/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lei/b;

    const-string v1, "WARNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lei/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/b;->WARNING:Lei/b;

    new-instance v0, Lei/b;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lei/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/b;->ERROR:Lei/b;

    new-instance v0, Lei/b;

    const-string v1, "HIDDEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lei/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/b;->HIDDEN:Lei/b;

    invoke-static {}, Lei/b;->$values()[Lei/b;

    move-result-object v0

    sput-object v0, Lei/b;->$VALUES:[Lei/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lei/b;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lei/b;
    .locals 1

    const-class v0, Lei/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lei/b;

    return-object p0
.end method

.method public static values()[Lei/b;
    .locals 1

    sget-object v0, Lei/b;->$VALUES:[Lei/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lei/b;

    return-object v0
.end method
