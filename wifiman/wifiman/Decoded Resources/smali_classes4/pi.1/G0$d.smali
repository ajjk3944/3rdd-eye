.class final enum Lpi/G0$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/G0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lpi/G0$d;

.field public static final enum IN_IN_OUT_POSITION:Lpi/G0$d;

.field public static final enum NO_CONFLICT:Lpi/G0$d;

.field public static final enum OUT_IN_IN_POSITION:Lpi/G0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lpi/G0$d;

    const-string v1, "NO_CONFLICT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpi/G0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpi/G0$d;->NO_CONFLICT:Lpi/G0$d;

    new-instance v1, Lpi/G0$d;

    const-string v2, "IN_IN_OUT_POSITION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lpi/G0$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpi/G0$d;->IN_IN_OUT_POSITION:Lpi/G0$d;

    new-instance v2, Lpi/G0$d;

    const-string v3, "OUT_IN_IN_POSITION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lpi/G0$d;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lpi/G0$d;->OUT_IN_IN_POSITION:Lpi/G0$d;

    filled-new-array {v0, v1, v2}, [Lpi/G0$d;

    move-result-object v0

    sput-object v0, Lpi/G0$d;->$VALUES:[Lpi/G0$d;

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

.method public static valueOf(Ljava/lang/String;)Lpi/G0$d;
    .locals 1

    const-class v0, Lpi/G0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpi/G0$d;

    return-object p0
.end method

.method public static values()[Lpi/G0$d;
    .locals 1

    sget-object v0, Lpi/G0$d;->$VALUES:[Lpi/G0$d;

    invoke-virtual {v0}, [Lpi/G0$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpi/G0$d;

    return-object v0
.end method
