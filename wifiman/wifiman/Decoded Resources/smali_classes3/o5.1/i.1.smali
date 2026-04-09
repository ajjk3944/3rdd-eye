.class public final enum Lo5/i;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# static fields
.field private static final synthetic $VALUES:[Lo5/i;

.field public static final enum EVENT_TYPE_UNKNOWN:Lo5/i;

.field public static final enum SESSION_START:Lo5/i;


# instance fields
.field private final number:I


# direct methods
.method private static final synthetic $values()[Lo5/i;
    .locals 2

    sget-object v0, Lo5/i;->EVENT_TYPE_UNKNOWN:Lo5/i;

    sget-object v1, Lo5/i;->SESSION_START:Lo5/i;

    filled-new-array {v0, v1}, [Lo5/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo5/i;

    const-string/jumbo v1, "EVENT_TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo5/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/i;->EVENT_TYPE_UNKNOWN:Lo5/i;

    new-instance v0, Lo5/i;

    const-string/jumbo v1, "SESSION_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lo5/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/i;->SESSION_START:Lo5/i;

    invoke-static {}, Lo5/i;->$values()[Lo5/i;

    move-result-object v0

    sput-object v0, Lo5/i;->$VALUES:[Lo5/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lo5/i;->number:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo5/i;
    .locals 1

    const-class v0, Lo5/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo5/i;

    return-object p0
.end method

.method public static values()[Lo5/i;
    .locals 1

    sget-object v0, Lo5/i;->$VALUES:[Lo5/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo5/i;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lo5/i;->number:I

    return v0
.end method
