.class public final enum LN/Z0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LN/Z0;

.field public static final enum Filled:LN/Z0;

.field public static final enum Outlined:LN/Z0;


# direct methods
.method private static final synthetic $values()[LN/Z0;
    .locals 2

    sget-object v0, LN/Z0;->Filled:LN/Z0;

    sget-object v1, LN/Z0;->Outlined:LN/Z0;

    filled-new-array {v0, v1}, [LN/Z0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN/Z0;

    const-string v1, "Filled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN/Z0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/Z0;->Filled:LN/Z0;

    new-instance v0, LN/Z0;

    const-string v1, "Outlined"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LN/Z0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/Z0;->Outlined:LN/Z0;

    invoke-static {}, LN/Z0;->$values()[LN/Z0;

    move-result-object v0

    sput-object v0, LN/Z0;->$VALUES:[LN/Z0;

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

.method public static valueOf(Ljava/lang/String;)LN/Z0;
    .locals 1

    const-class v0, LN/Z0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN/Z0;

    return-object p0
.end method

.method public static values()[LN/Z0;
    .locals 1

    sget-object v0, LN/Z0;->$VALUES:[LN/Z0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN/Z0;

    return-object v0
.end method
