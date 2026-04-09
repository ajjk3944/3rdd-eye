.class public final enum LK/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LK/a;

.field public static final enum End:LK/a;

.field public static final enum Inner:LK/a;

.field public static final enum NotByUser:LK/a;

.field public static final enum Start:LK/a;


# direct methods
.method private static final synthetic $values()[LK/a;
    .locals 4

    sget-object v0, LK/a;->Start:LK/a;

    sget-object v1, LK/a;->End:LK/a;

    sget-object v2, LK/a;->Inner:LK/a;

    sget-object v3, LK/a;->NotByUser:LK/a;

    filled-new-array {v0, v1, v2, v3}, [LK/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LK/a;

    const-string v1, "Start"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LK/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/a;->Start:LK/a;

    new-instance v0, LK/a;

    const-string v1, "End"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LK/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/a;->End:LK/a;

    new-instance v0, LK/a;

    const-string v1, "Inner"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LK/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/a;->Inner:LK/a;

    new-instance v0, LK/a;

    const-string v1, "NotByUser"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LK/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/a;->NotByUser:LK/a;

    invoke-static {}, LK/a;->$values()[LK/a;

    move-result-object v0

    sput-object v0, LK/a;->$VALUES:[LK/a;

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

.method public static valueOf(Ljava/lang/String;)LK/a;
    .locals 1

    const-class v0, LK/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LK/a;

    return-object p0
.end method

.method public static values()[LK/a;
    .locals 1

    sget-object v0, LK/a;->$VALUES:[LK/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LK/a;

    return-object v0
.end method
