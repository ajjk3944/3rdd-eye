.class public final enum LF/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LF/p;

.field public static final enum Cursor:LF/p;

.field public static final enum SelectionEnd:LF/p;

.field public static final enum SelectionStart:LF/p;


# direct methods
.method private static final synthetic $values()[LF/p;
    .locals 3

    sget-object v0, LF/p;->Cursor:LF/p;

    sget-object v1, LF/p;->SelectionStart:LF/p;

    sget-object v2, LF/p;->SelectionEnd:LF/p;

    filled-new-array {v0, v1, v2}, [LF/p;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF/p;

    const-string v1, "Cursor"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF/p;->Cursor:LF/p;

    new-instance v0, LF/p;

    const-string v1, "SelectionStart"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF/p;->SelectionStart:LF/p;

    new-instance v0, LF/p;

    const-string v1, "SelectionEnd"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF/p;->SelectionEnd:LF/p;

    invoke-static {}, LF/p;->$values()[LF/p;

    move-result-object v0

    sput-object v0, LF/p;->$VALUES:[LF/p;

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

.method public static valueOf(Ljava/lang/String;)LF/p;
    .locals 1

    const-class v0, LF/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF/p;

    return-object p0
.end method

.method public static values()[LF/p;
    .locals 1

    sget-object v0, LF/p;->$VALUES:[LF/p;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF/p;

    return-object v0
.end method
