.class public final enum LZc/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LZc/e$b;

.field public static final enum AUTHENTICATING:LZc/e$b;

.field public static final enum CONNECTED:LZc/e$b;

.field public static final enum CONNECTING:LZc/e$b;

.field public static final enum DISCONNECTED:LZc/e$b;

.field public static final enum OBTAINING_IP:LZc/e$b;


# direct methods
.method private static final synthetic $values()[LZc/e$b;
    .locals 5

    sget-object v0, LZc/e$b;->DISCONNECTED:LZc/e$b;

    sget-object v1, LZc/e$b;->CONNECTING:LZc/e$b;

    sget-object v2, LZc/e$b;->AUTHENTICATING:LZc/e$b;

    sget-object v3, LZc/e$b;->OBTAINING_IP:LZc/e$b;

    sget-object v4, LZc/e$b;->CONNECTED:LZc/e$b;

    filled-new-array {v0, v1, v2, v3, v4}, [LZc/e$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZc/e$b;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZc/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZc/e$b;->DISCONNECTED:LZc/e$b;

    new-instance v0, LZc/e$b;

    const-string v1, "CONNECTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LZc/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZc/e$b;->CONNECTING:LZc/e$b;

    new-instance v0, LZc/e$b;

    const-string v1, "AUTHENTICATING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LZc/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZc/e$b;->AUTHENTICATING:LZc/e$b;

    new-instance v0, LZc/e$b;

    const-string v1, "OBTAINING_IP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LZc/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZc/e$b;->OBTAINING_IP:LZc/e$b;

    new-instance v0, LZc/e$b;

    const-string v1, "CONNECTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LZc/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZc/e$b;->CONNECTED:LZc/e$b;

    invoke-static {}, LZc/e$b;->$values()[LZc/e$b;

    move-result-object v0

    sput-object v0, LZc/e$b;->$VALUES:[LZc/e$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LZc/e$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LZc/e$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LZc/e$b;
    .locals 1

    const-class v0, LZc/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZc/e$b;

    return-object p0
.end method

.method public static values()[LZc/e$b;
    .locals 1

    sget-object v0, LZc/e$b;->$VALUES:[LZc/e$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZc/e$b;

    return-object v0
.end method
