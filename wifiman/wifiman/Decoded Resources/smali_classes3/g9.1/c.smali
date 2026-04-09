.class public final enum Lg9/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lg9/c;

.field public static final enum CMD:Lg9/c;

.field public static final enum CMD_RESPONSE:Lg9/c;

.field public static final enum ERROR:Lg9/c;

.field public static final enum EVENT:Lg9/c;

.field public static final enum HTTP_REQUEST:Lg9/c;

.field public static final enum HTTP_RESPONSE:Lg9/c;

.field public static final enum LOG:Lg9/c;

.field public static final enum REQUEST:Lg9/c;

.field public static final enum RESPONSE:Lg9/c;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lg9/c;
    .locals 9

    sget-object v0, Lg9/c;->REQUEST:Lg9/c;

    sget-object v1, Lg9/c;->RESPONSE:Lg9/c;

    sget-object v2, Lg9/c;->HTTP_REQUEST:Lg9/c;

    sget-object v3, Lg9/c;->HTTP_RESPONSE:Lg9/c;

    sget-object v4, Lg9/c;->LOG:Lg9/c;

    sget-object v5, Lg9/c;->EVENT:Lg9/c;

    sget-object v6, Lg9/c;->ERROR:Lg9/c;

    sget-object v7, Lg9/c;->CMD:Lg9/c;

    sget-object v8, Lg9/c;->CMD_RESPONSE:Lg9/c;

    filled-new-array/range {v0 .. v8}, [Lg9/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg9/c;

    const/4 v1, 0x0

    const-string/jumbo v2, "request"

    const-string/jumbo v3, "REQUEST"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->REQUEST:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x1

    const-string/jumbo v2, "response"

    const-string/jumbo v3, "RESPONSE"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->RESPONSE:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x2

    const-string/jumbo v2, "httpRequest"

    const-string/jumbo v3, "HTTP_REQUEST"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->HTTP_REQUEST:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x3

    const-string/jumbo v2, "httpResponse"

    const-string/jumbo v3, "HTTP_RESPONSE"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->HTTP_RESPONSE:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x4

    const-string/jumbo v2, "log"

    const-string/jumbo v3, "LOG"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->LOG:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x5

    const-string/jumbo v2, "event"

    const-string/jumbo v3, "EVENT"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->EVENT:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x6

    const-string/jumbo v2, "error"

    const-string/jumbo v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->ERROR:Lg9/c;

    new-instance v0, Lg9/c;

    const/4 v1, 0x7

    const-string/jumbo v2, "cmd"

    const-string v3, "CMD"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->CMD:Lg9/c;

    new-instance v0, Lg9/c;

    const/16 v1, 0x8

    const-string/jumbo v2, "cmdResponse"

    const-string v3, "CMD_RESPONSE"

    invoke-direct {v0, v3, v1, v2}, Lg9/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lg9/c;->CMD_RESPONSE:Lg9/c;

    invoke-static {}, Lg9/c;->$values()[Lg9/c;

    move-result-object v0

    sput-object v0, Lg9/c;->$VALUES:[Lg9/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lg9/c;->id:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg9/c;
    .locals 1

    const-class v0, Lg9/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg9/c;

    return-object p0
.end method

.method public static values()[Lg9/c;
    .locals 1

    sget-object v0, Lg9/c;->$VALUES:[Lg9/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg9/c;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg9/c;->id:Ljava/lang/String;

    return-object v0
.end method
