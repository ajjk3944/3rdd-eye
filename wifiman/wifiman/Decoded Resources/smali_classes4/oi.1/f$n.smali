.class final enum Loi/f$n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "n"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Loi/f$n;

.field public static final enum COMPUTING:Loi/f$n;

.field public static final enum NOT_COMPUTED:Loi/f$n;

.field public static final enum RECURSION_WAS_DETECTED:Loi/f$n;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Loi/f$n;

    const-string v1, "NOT_COMPUTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Loi/f$n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loi/f$n;->NOT_COMPUTED:Loi/f$n;

    new-instance v1, Loi/f$n;

    const-string v2, "COMPUTING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Loi/f$n;-><init>(Ljava/lang/String;I)V

    sput-object v1, Loi/f$n;->COMPUTING:Loi/f$n;

    new-instance v2, Loi/f$n;

    const-string v3, "RECURSION_WAS_DETECTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Loi/f$n;-><init>(Ljava/lang/String;I)V

    sput-object v2, Loi/f$n;->RECURSION_WAS_DETECTED:Loi/f$n;

    filled-new-array {v0, v1, v2}, [Loi/f$n;

    move-result-object v0

    sput-object v0, Loi/f$n;->$VALUES:[Loi/f$n;

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

.method public static valueOf(Ljava/lang/String;)Loi/f$n;
    .locals 1

    const-class v0, Loi/f$n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loi/f$n;

    return-object p0
.end method

.method public static values()[Loi/f$n;
    .locals 1

    sget-object v0, Loi/f$n;->$VALUES:[Loi/f$n;

    invoke-virtual {v0}, [Loi/f$n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loi/f$n;

    return-object v0
.end method
