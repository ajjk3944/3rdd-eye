.class public final enum Lpi/u0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lpi/u0$b;

.field public static final enum CHECK_ONLY_LOWER:Lpi/u0$b;

.field public static final enum CHECK_SUBTYPE_AND_LOWER:Lpi/u0$b;

.field public static final enum SKIP_LOWER:Lpi/u0$b;


# direct methods
.method private static final synthetic $values()[Lpi/u0$b;
    .locals 3

    sget-object v0, Lpi/u0$b;->CHECK_ONLY_LOWER:Lpi/u0$b;

    sget-object v1, Lpi/u0$b;->CHECK_SUBTYPE_AND_LOWER:Lpi/u0$b;

    sget-object v2, Lpi/u0$b;->SKIP_LOWER:Lpi/u0$b;

    filled-new-array {v0, v1, v2}, [Lpi/u0$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpi/u0$b;

    const-string v1, "CHECK_ONLY_LOWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpi/u0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpi/u0$b;->CHECK_ONLY_LOWER:Lpi/u0$b;

    new-instance v0, Lpi/u0$b;

    const-string v1, "CHECK_SUBTYPE_AND_LOWER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpi/u0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpi/u0$b;->CHECK_SUBTYPE_AND_LOWER:Lpi/u0$b;

    new-instance v0, Lpi/u0$b;

    const-string v1, "SKIP_LOWER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpi/u0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpi/u0$b;->SKIP_LOWER:Lpi/u0$b;

    invoke-static {}, Lpi/u0$b;->$values()[Lpi/u0$b;

    move-result-object v0

    sput-object v0, Lpi/u0$b;->$VALUES:[Lpi/u0$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lpi/u0$b;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lpi/u0$b;
    .locals 1

    const-class v0, Lpi/u0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpi/u0$b;

    return-object p0
.end method

.method public static values()[Lpi/u0$b;
    .locals 1

    sget-object v0, Lpi/u0$b;->$VALUES:[Lpi/u0$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpi/u0$b;

    return-object v0
.end method
