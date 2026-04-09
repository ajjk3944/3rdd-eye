.class public final enum LAh/k$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LAh/k$a;

.field public static final enum FALLBACK:LAh/k$a;

.field public static final enum FROM_CLASS_LOADER:LAh/k$a;

.field public static final enum FROM_DEPENDENCIES:LAh/k$a;


# direct methods
.method private static final synthetic $values()[LAh/k$a;
    .locals 3

    sget-object v0, LAh/k$a;->FROM_DEPENDENCIES:LAh/k$a;

    sget-object v1, LAh/k$a;->FROM_CLASS_LOADER:LAh/k$a;

    sget-object v2, LAh/k$a;->FALLBACK:LAh/k$a;

    filled-new-array {v0, v1, v2}, [LAh/k$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LAh/k$a;

    const-string v1, "FROM_DEPENDENCIES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAh/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/k$a;->FROM_DEPENDENCIES:LAh/k$a;

    new-instance v0, LAh/k$a;

    const-string v1, "FROM_CLASS_LOADER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LAh/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/k$a;->FROM_CLASS_LOADER:LAh/k$a;

    new-instance v0, LAh/k$a;

    const-string v1, "FALLBACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LAh/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAh/k$a;->FALLBACK:LAh/k$a;

    invoke-static {}, LAh/k$a;->$values()[LAh/k$a;

    move-result-object v0

    sput-object v0, LAh/k$a;->$VALUES:[LAh/k$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LAh/k$a;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LAh/k$a;
    .locals 1

    const-class v0, LAh/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAh/k$a;

    return-object p0
.end method

.method public static values()[LAh/k$a;
    .locals 1

    sget-object v0, LAh/k$a;->$VALUES:[LAh/k$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAh/k$a;

    return-object v0
.end method
