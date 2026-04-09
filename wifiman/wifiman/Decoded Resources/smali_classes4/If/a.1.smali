.class public final enum LIf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LIf/a;

.field public static final enum ADOPTION_FAILED:LIf/a;

.field public static final enum ADOPTION_READY:LIf/a;

.field public static final enum COMPLIANCE:LIf/a;

.field public static final enum CONNECTED:LIf/a;

.field public static final enum CONNECTING:LIf/a;

.field public static final enum DISCOVERING:LIf/a;

.field public static final enum FW_UPDATE:LIf/a;

.field public static final enum FW_UPDATE_PROGRESS:LIf/a;

.field public static final enum LOADING:LIf/a;

.field public static final enum REQUIREMENTS_NOT_MET:LIf/a;


# direct methods
.method private static final synthetic $values()[LIf/a;
    .locals 10

    sget-object v0, LIf/a;->LOADING:LIf/a;

    sget-object v1, LIf/a;->REQUIREMENTS_NOT_MET:LIf/a;

    sget-object v2, LIf/a;->DISCOVERING:LIf/a;

    sget-object v3, LIf/a;->ADOPTION_READY:LIf/a;

    sget-object v4, LIf/a;->ADOPTION_FAILED:LIf/a;

    sget-object v5, LIf/a;->CONNECTING:LIf/a;

    sget-object v6, LIf/a;->CONNECTED:LIf/a;

    sget-object v7, LIf/a;->FW_UPDATE:LIf/a;

    sget-object v8, LIf/a;->FW_UPDATE_PROGRESS:LIf/a;

    sget-object v9, LIf/a;->COMPLIANCE:LIf/a;

    filled-new-array/range {v0 .. v9}, [LIf/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LIf/a;

    const-string v1, "LOADING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->LOADING:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "REQUIREMENTS_NOT_MET"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->REQUIREMENTS_NOT_MET:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "DISCOVERING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->DISCOVERING:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "ADOPTION_READY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->ADOPTION_READY:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "ADOPTION_FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->ADOPTION_FAILED:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "CONNECTING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->CONNECTING:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "CONNECTED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->CONNECTED:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "FW_UPDATE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->FW_UPDATE:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "FW_UPDATE_PROGRESS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->FW_UPDATE_PROGRESS:LIf/a;

    new-instance v0, LIf/a;

    const-string v1, "COMPLIANCE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LIf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIf/a;->COMPLIANCE:LIf/a;

    invoke-static {}, LIf/a;->$values()[LIf/a;

    move-result-object v0

    sput-object v0, LIf/a;->$VALUES:[LIf/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LIf/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LIf/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LIf/a;
    .locals 1

    const-class v0, LIf/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIf/a;

    return-object p0
.end method

.method public static values()[LIf/a;
    .locals 1

    sget-object v0, LIf/a;->$VALUES:[LIf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIf/a;

    return-object v0
.end method
