.class final enum LAh/u$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAh/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LAh/u$a;

.field public static final enum DEPRECATED_LIST_METHODS:LAh/u$a;

.field public static final enum DROP:LAh/u$a;

.field public static final enum HIDDEN:LAh/u$a;

.field public static final enum NOT_CONSIDERED:LAh/u$a;

.field public static final enum VISIBLE:LAh/u$a;


# direct methods
.method private static final synthetic $values()[LAh/u$a;
    .locals 5

    sget-object v0, LAh/u$a;->HIDDEN:LAh/u$a;

    sget-object v1, LAh/u$a;->VISIBLE:LAh/u$a;

    sget-object v2, LAh/u$a;->DEPRECATED_LIST_METHODS:LAh/u$a;

    sget-object v3, LAh/u$a;->NOT_CONSIDERED:LAh/u$a;

    sget-object v4, LAh/u$a;->DROP:LAh/u$a;

    filled-new-array {v0, v1, v2, v3, v4}, [LAh/u$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LAh/u$a;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAh/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/u$a;->HIDDEN:LAh/u$a;

    new-instance v0, LAh/u$a;

    const-string v1, "VISIBLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LAh/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/u$a;->VISIBLE:LAh/u$a;

    new-instance v0, LAh/u$a;

    const-string v1, "DEPRECATED_LIST_METHODS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LAh/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/u$a;->DEPRECATED_LIST_METHODS:LAh/u$a;

    new-instance v0, LAh/u$a;

    const-string v1, "NOT_CONSIDERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LAh/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/u$a;->NOT_CONSIDERED:LAh/u$a;

    new-instance v0, LAh/u$a;

    const-string v1, "DROP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LAh/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/u$a;->DROP:LAh/u$a;

    invoke-static {}, LAh/u$a;->$values()[LAh/u$a;

    move-result-object v0

    sput-object v0, LAh/u$a;->$VALUES:[LAh/u$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LAh/u$a;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LAh/u$a;
    .locals 1

    const-class v0, LAh/u$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAh/u$a;

    return-object p0
.end method

.method public static values()[LAh/u$a;
    .locals 1

    sget-object v0, LAh/u$a;->$VALUES:[LAh/u$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAh/u$a;

    return-object v0
.end method
