.class public final enum LKa/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LKa/b;

.field public static final enum FINISHED:LKa/b;

.field public static final enum IDLE:LKa/b;

.field public static final enum STARTED:LKa/b;


# direct methods
.method private static final synthetic $values()[LKa/b;
    .locals 3

    sget-object v0, LKa/b;->IDLE:LKa/b;

    sget-object v1, LKa/b;->STARTED:LKa/b;

    sget-object v2, LKa/b;->FINISHED:LKa/b;

    filled-new-array {v0, v1, v2}, [LKa/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LKa/b;

    const-string/jumbo v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LKa/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKa/b;->IDLE:LKa/b;

    new-instance v0, LKa/b;

    const-string/jumbo v1, "STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LKa/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKa/b;->STARTED:LKa/b;

    new-instance v0, LKa/b;

    const-string/jumbo v1, "FINISHED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LKa/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKa/b;->FINISHED:LKa/b;

    invoke-static {}, LKa/b;->$values()[LKa/b;

    move-result-object v0

    sput-object v0, LKa/b;->$VALUES:[LKa/b;

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

.method public static valueOf(Ljava/lang/String;)LKa/b;
    .locals 1

    const-class v0, LKa/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LKa/b;

    return-object p0
.end method

.method public static values()[LKa/b;
    .locals 1

    sget-object v0, LKa/b;->$VALUES:[LKa/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKa/b;

    return-object v0
.end method
