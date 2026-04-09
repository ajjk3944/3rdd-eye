.class public final enum Lwc/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwc/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lwc/d$a;

.field public static final enum ERROR:Lwc/d$a;

.field public static final enum STATE_OFF:Lwc/d$a;

.field public static final enum STATE_ON:Lwc/d$a;

.field public static final enum STATE_TURNING_OFF:Lwc/d$a;

.field public static final enum STATE_TURNING_ON:Lwc/d$a;


# direct methods
.method private static final synthetic $values()[Lwc/d$a;
    .locals 5

    sget-object v0, Lwc/d$a;->STATE_ON:Lwc/d$a;

    sget-object v1, Lwc/d$a;->STATE_TURNING_OFF:Lwc/d$a;

    sget-object v2, Lwc/d$a;->STATE_OFF:Lwc/d$a;

    sget-object v3, Lwc/d$a;->STATE_TURNING_ON:Lwc/d$a;

    sget-object v4, Lwc/d$a;->ERROR:Lwc/d$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lwc/d$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwc/d$a;

    const-string v1, "STATE_ON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwc/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/d$a;->STATE_ON:Lwc/d$a;

    new-instance v0, Lwc/d$a;

    const-string v1, "STATE_TURNING_OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwc/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/d$a;->STATE_TURNING_OFF:Lwc/d$a;

    new-instance v0, Lwc/d$a;

    const-string v1, "STATE_OFF"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lwc/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/d$a;->STATE_OFF:Lwc/d$a;

    new-instance v0, Lwc/d$a;

    const-string v1, "STATE_TURNING_ON"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lwc/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/d$a;->STATE_TURNING_ON:Lwc/d$a;

    new-instance v0, Lwc/d$a;

    const-string v1, "ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lwc/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/d$a;->ERROR:Lwc/d$a;

    invoke-static {}, Lwc/d$a;->$values()[Lwc/d$a;

    move-result-object v0

    sput-object v0, Lwc/d$a;->$VALUES:[Lwc/d$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lwc/d$a;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lwc/d$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwc/d$a;
    .locals 1

    const-class v0, Lwc/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwc/d$a;

    return-object p0
.end method

.method public static values()[Lwc/d$a;
    .locals 1

    sget-object v0, Lwc/d$a;->$VALUES:[Lwc/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwc/d$a;

    return-object v0
.end method
