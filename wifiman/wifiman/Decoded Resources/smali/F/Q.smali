.class public final enum LF/Q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LF/Q;

.field public static final enum Copy:LF/Q;

.field public static final enum Cut:LF/Q;

.field public static final enum Paste:LF/Q;

.field public static final enum SelectAll:LF/Q;


# instance fields
.field private final stringId:I


# direct methods
.method private static final synthetic $values()[LF/Q;
    .locals 4

    sget-object v0, LF/Q;->Cut:LF/Q;

    sget-object v1, LF/Q;->Copy:LF/Q;

    sget-object v2, LF/Q;->Paste:LF/Q;

    sget-object v3, LF/Q;->SelectAll:LF/Q;

    filled-new-array {v0, v1, v2, v3}, [LF/Q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LF/Q;

    const/4 v1, 0x0

    const v2, 0x1040003

    const-string v3, "Cut"

    invoke-direct {v0, v3, v1, v2}, LF/Q;-><init>(Ljava/lang/String;II)V

    sput-object v0, LF/Q;->Cut:LF/Q;

    new-instance v0, LF/Q;

    const/4 v1, 0x1

    const v2, 0x1040001

    const-string v3, "Copy"

    invoke-direct {v0, v3, v1, v2}, LF/Q;-><init>(Ljava/lang/String;II)V

    sput-object v0, LF/Q;->Copy:LF/Q;

    new-instance v0, LF/Q;

    const/4 v1, 0x2

    const v2, 0x104000b

    const-string v3, "Paste"

    invoke-direct {v0, v3, v1, v2}, LF/Q;-><init>(Ljava/lang/String;II)V

    sput-object v0, LF/Q;->Paste:LF/Q;

    new-instance v0, LF/Q;

    const/4 v1, 0x3

    const v2, 0x104000d

    const-string v3, "SelectAll"

    invoke-direct {v0, v3, v1, v2}, LF/Q;-><init>(Ljava/lang/String;II)V

    sput-object v0, LF/Q;->SelectAll:LF/Q;

    invoke-static {}, LF/Q;->$values()[LF/Q;

    move-result-object v0

    sput-object v0, LF/Q;->$VALUES:[LF/Q;

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

    iput p3, p0, LF/Q;->stringId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LF/Q;
    .locals 1

    const-class v0, LF/Q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF/Q;

    return-object p0
.end method

.method public static values()[LF/Q;
    .locals 1

    sget-object v0, LF/Q;->$VALUES:[LF/Q;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF/Q;

    return-object v0
.end method


# virtual methods
.method public final resolvedString(LT/l;I)Ljava/lang/String;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)"

    const v2, -0x12744279

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget p2, p0, LF/Q;->stringId:I

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method
