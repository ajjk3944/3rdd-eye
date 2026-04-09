.class public final enum Lbf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lbf/a;

.field public static final enum DRAGGING:Lbf/a;

.field public static final enum IN_LIST_MIDDLE:Lbf/a;

.field public static final enum ON_LIST_BOTTOM:Lbf/a;

.field public static final enum ON_LIST_TOP:Lbf/a;

.field public static final enum ON_LIST_TOP_BOTTOM:Lbf/a;


# direct methods
.method private static final synthetic $values()[Lbf/a;
    .locals 5

    sget-object v0, Lbf/a;->ON_LIST_TOP:Lbf/a;

    sget-object v1, Lbf/a;->ON_LIST_BOTTOM:Lbf/a;

    sget-object v2, Lbf/a;->ON_LIST_TOP_BOTTOM:Lbf/a;

    sget-object v3, Lbf/a;->IN_LIST_MIDDLE:Lbf/a;

    sget-object v4, Lbf/a;->DRAGGING:Lbf/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lbf/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbf/a;

    const-string v1, "ON_LIST_TOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbf/a;->ON_LIST_TOP:Lbf/a;

    new-instance v0, Lbf/a;

    const-string v1, "ON_LIST_BOTTOM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbf/a;->ON_LIST_BOTTOM:Lbf/a;

    new-instance v0, Lbf/a;

    const-string v1, "ON_LIST_TOP_BOTTOM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbf/a;->ON_LIST_TOP_BOTTOM:Lbf/a;

    new-instance v0, Lbf/a;

    const-string v1, "IN_LIST_MIDDLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbf/a;->IN_LIST_MIDDLE:Lbf/a;

    new-instance v0, Lbf/a;

    const-string v1, "DRAGGING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbf/a;->DRAGGING:Lbf/a;

    invoke-static {}, Lbf/a;->$values()[Lbf/a;

    move-result-object v0

    sput-object v0, Lbf/a;->$VALUES:[Lbf/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lbf/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lbf/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbf/a;
    .locals 1

    const-class v0, Lbf/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbf/a;

    return-object p0
.end method

.method public static values()[Lbf/a;
    .locals 1

    sget-object v0, Lbf/a;->$VALUES:[Lbf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbf/a;

    return-object v0
.end method
