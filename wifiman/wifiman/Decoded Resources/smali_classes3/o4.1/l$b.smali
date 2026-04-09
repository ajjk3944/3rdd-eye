.class public final enum Lo4/l$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lo4/l$b;

.field public static final enum CRUNCHY:Lo4/l$b;

.field public static final enum LEGACY:Lo4/l$b;

.field public static final enum RAW:Lo4/l$b;

.field public static final enum TINK:Lo4/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lo4/l$b;

    const-string/jumbo v1, "TINK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo4/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo4/l$b;->TINK:Lo4/l$b;

    new-instance v1, Lo4/l$b;

    const-string/jumbo v2, "LEGACY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lo4/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo4/l$b;->LEGACY:Lo4/l$b;

    new-instance v2, Lo4/l$b;

    const-string/jumbo v3, "RAW"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lo4/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lo4/l$b;->RAW:Lo4/l$b;

    new-instance v3, Lo4/l$b;

    const-string v4, "CRUNCHY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lo4/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo4/l$b;->CRUNCHY:Lo4/l$b;

    filled-new-array {v0, v1, v2, v3}, [Lo4/l$b;

    move-result-object v0

    sput-object v0, Lo4/l$b;->$VALUES:[Lo4/l$b;

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

.method public static valueOf(Ljava/lang/String;)Lo4/l$b;
    .locals 1

    const-class v0, Lo4/l$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo4/l$b;

    return-object p0
.end method

.method public static values()[Lo4/l$b;
    .locals 1

    sget-object v0, Lo4/l$b;->$VALUES:[Lo4/l$b;

    invoke-virtual {v0}, [Lo4/l$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo4/l$b;

    return-object v0
.end method
