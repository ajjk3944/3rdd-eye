.class public final enum Lh8/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lh8/d;

.field public static final enum CREATE:Lh8/d;

.field public static final enum DESTROY:Lh8/d;

.field public static final enum PAUSE:Lh8/d;

.field public static final enum RESUME:Lh8/d;

.field public static final enum START:Lh8/d;

.field public static final enum STOP:Lh8/d;

.field public static final enum USER_INVISIBLE:Lh8/d;

.field public static final enum USER_VISIBLE:Lh8/d;

.field public static final enum VIEW_CREATED:Lh8/d;

.field public static final enum VIEW_DESTROYED:Lh8/d;


# direct methods
.method private static final synthetic $values()[Lh8/d;
    .locals 10

    sget-object v0, Lh8/d;->CREATE:Lh8/d;

    sget-object v1, Lh8/d;->VIEW_CREATED:Lh8/d;

    sget-object v2, Lh8/d;->START:Lh8/d;

    sget-object v3, Lh8/d;->RESUME:Lh8/d;

    sget-object v4, Lh8/d;->USER_VISIBLE:Lh8/d;

    sget-object v5, Lh8/d;->USER_INVISIBLE:Lh8/d;

    sget-object v6, Lh8/d;->PAUSE:Lh8/d;

    sget-object v7, Lh8/d;->STOP:Lh8/d;

    sget-object v8, Lh8/d;->VIEW_DESTROYED:Lh8/d;

    sget-object v9, Lh8/d;->DESTROY:Lh8/d;

    filled-new-array/range {v0 .. v9}, [Lh8/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh8/d;

    const-string v1, "CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->CREATE:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "VIEW_CREATED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->VIEW_CREATED:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->START:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "RESUME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->RESUME:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "USER_VISIBLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->USER_VISIBLE:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "USER_INVISIBLE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->USER_INVISIBLE:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "PAUSE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->PAUSE:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "STOP"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->STOP:Lh8/d;

    new-instance v0, Lh8/d;

    const-string/jumbo v1, "VIEW_DESTROYED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->VIEW_DESTROYED:Lh8/d;

    new-instance v0, Lh8/d;

    const-string v1, "DESTROY"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lh8/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh8/d;->DESTROY:Lh8/d;

    invoke-static {}, Lh8/d;->$values()[Lh8/d;

    move-result-object v0

    sput-object v0, Lh8/d;->$VALUES:[Lh8/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lh8/d;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lh8/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh8/d;
    .locals 1

    const-class v0, Lh8/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh8/d;

    return-object p0
.end method

.method public static values()[Lh8/d;
    .locals 1

    sget-object v0, Lh8/d;->$VALUES:[Lh8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh8/d;

    return-object v0
.end method
