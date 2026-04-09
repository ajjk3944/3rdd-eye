.class public final enum LQ6/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LQ6/b;

.field public static final enum CONNECTABLE:LQ6/b;

.field public static final enum LEGACY_UNKNOWN:LQ6/b;

.field public static final enum NOT_CONNECTABLE:LQ6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LQ6/b;

    const-string/jumbo v1, "LEGACY_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LQ6/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ6/b;->LEGACY_UNKNOWN:LQ6/b;

    new-instance v1, LQ6/b;

    const-string v2, "CONNECTABLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LQ6/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LQ6/b;->CONNECTABLE:LQ6/b;

    new-instance v2, LQ6/b;

    const-string/jumbo v3, "NOT_CONNECTABLE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, LQ6/b;-><init>(Ljava/lang/String;I)V

    sput-object v2, LQ6/b;->NOT_CONNECTABLE:LQ6/b;

    filled-new-array {v0, v1, v2}, [LQ6/b;

    move-result-object v0

    sput-object v0, LQ6/b;->$VALUES:[LQ6/b;

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

.method public static valueOf(Ljava/lang/String;)LQ6/b;
    .locals 1

    const-class v0, LQ6/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQ6/b;

    return-object p0
.end method

.method public static values()[LQ6/b;
    .locals 1

    sget-object v0, LQ6/b;->$VALUES:[LQ6/b;

    invoke-virtual {v0}, [LQ6/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ6/b;

    return-object v0
.end method
