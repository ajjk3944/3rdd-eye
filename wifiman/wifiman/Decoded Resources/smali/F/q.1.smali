.class public final enum LF/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LF/q;

.field public static final enum Cursor:LF/q;

.field public static final enum None:LF/q;

.field public static final enum Selection:LF/q;


# direct methods
.method private static final synthetic $values()[LF/q;
    .locals 3

    sget-object v0, LF/q;->None:LF/q;

    sget-object v1, LF/q;->Selection:LF/q;

    sget-object v2, LF/q;->Cursor:LF/q;

    filled-new-array {v0, v1, v2}, [LF/q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF/q;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF/q;->None:LF/q;

    new-instance v0, LF/q;

    const-string v1, "Selection"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF/q;->Selection:LF/q;

    new-instance v0, LF/q;

    const-string v1, "Cursor"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF/q;->Cursor:LF/q;

    invoke-static {}, LF/q;->$values()[LF/q;

    move-result-object v0

    sput-object v0, LF/q;->$VALUES:[LF/q;

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

.method public static valueOf(Ljava/lang/String;)LF/q;
    .locals 1

    const-class v0, LF/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF/q;

    return-object p0
.end method

.method public static values()[LF/q;
    .locals 1

    sget-object v0, LF/q;->$VALUES:[LF/q;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF/q;

    return-object v0
.end method
