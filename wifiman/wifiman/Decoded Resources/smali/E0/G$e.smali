.class public final enum LE0/G$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LE0/G$e;

.field public static final enum Idle:LE0/G$e;

.field public static final enum LayingOut:LE0/G$e;

.field public static final enum LookaheadLayingOut:LE0/G$e;

.field public static final enum LookaheadMeasuring:LE0/G$e;

.field public static final enum Measuring:LE0/G$e;


# direct methods
.method private static final synthetic $values()[LE0/G$e;
    .locals 5

    sget-object v0, LE0/G$e;->Measuring:LE0/G$e;

    sget-object v1, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    sget-object v2, LE0/G$e;->LayingOut:LE0/G$e;

    sget-object v3, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    sget-object v4, LE0/G$e;->Idle:LE0/G$e;

    filled-new-array {v0, v1, v2, v3, v4}, [LE0/G$e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE0/G$e;

    const-string v1, "Measuring"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LE0/G$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$e;->Measuring:LE0/G$e;

    new-instance v0, LE0/G$e;

    const-string v1, "LookaheadMeasuring"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LE0/G$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    new-instance v0, LE0/G$e;

    const-string v1, "LayingOut"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LE0/G$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$e;->LayingOut:LE0/G$e;

    new-instance v0, LE0/G$e;

    const-string v1, "LookaheadLayingOut"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LE0/G$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    new-instance v0, LE0/G$e;

    const-string v1, "Idle"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LE0/G$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$e;->Idle:LE0/G$e;

    invoke-static {}, LE0/G$e;->$values()[LE0/G$e;

    move-result-object v0

    sput-object v0, LE0/G$e;->$VALUES:[LE0/G$e;

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

.method public static valueOf(Ljava/lang/String;)LE0/G$e;
    .locals 1

    const-class v0, LE0/G$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LE0/G$e;

    return-object p0
.end method

.method public static values()[LE0/G$e;
    .locals 1

    sget-object v0, LE0/G$e;->$VALUES:[LE0/G$e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LE0/G$e;

    return-object v0
.end method
