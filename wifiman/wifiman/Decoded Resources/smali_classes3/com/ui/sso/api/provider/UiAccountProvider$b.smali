.class public final enum Lcom/ui/sso/api/provider/UiAccountProvider$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/UiAccountProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum ACCOUNT_DELETE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum ACCOUNT_UPDATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum ACQUIRE_OWNERSHIP:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum GET_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum GET_DEVICE_IDENTIFIERS:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum GET_STATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum INVALIDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

.field public static final enum UPDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/sso/api/provider/UiAccountProvider$b;
    .locals 8

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_STATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v1, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACCOUNT_UPDATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v2, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACCOUNT_DELETE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v3, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v4, Lcom/ui/sso/api/provider/UiAccountProvider$b;->UPDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v5, Lcom/ui/sso/api/provider/UiAccountProvider$b;->INVALIDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v6, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_DEVICE_IDENTIFIERS:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    sget-object v7, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACQUIRE_OWNERSHIP:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    filled-new-array/range {v0 .. v7}, [Lcom/ui/sso/api/provider/UiAccountProvider$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x0

    const-string/jumbo v2, "getState"

    const-string/jumbo v3, "GET_STATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_STATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x1

    const-string/jumbo v2, "accountCreate"

    const-string v3, "ACCOUNT_UPDATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACCOUNT_UPDATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x2

    const-string/jumbo v2, "accountDelete"

    const-string v3, "ACCOUNT_DELETE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACCOUNT_DELETE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x3

    const-string/jumbo v2, "authTokenGet"

    const-string/jumbo v3, "GET_AUTH_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x4

    const-string/jumbo v2, "authTokenUpdate"

    const-string/jumbo v3, "UPDATE_AUTH_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->UPDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x5

    const-string/jumbo v2, "authTokenInvalidate"

    const-string/jumbo v3, "INVALIDATE_AUTH_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->INVALIDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x6

    const-string/jumbo v2, "getDeviceIdentifiers"

    const-string/jumbo v3, "GET_DEVICE_IDENTIFIERS"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_DEVICE_IDENTIFIERS:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    const/4 v1, 0x7

    const-string/jumbo v2, "acquireOwnership"

    const-string v3, "ACQUIRE_OWNERSHIP"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACQUIRE_OWNERSHIP:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-static {}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->$values()[Lcom/ui/sso/api/provider/UiAccountProvider$b;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->$VALUES:[Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->id:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/sso/api/provider/UiAccountProvider$b;
    .locals 1

    const-class v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/sso/api/provider/UiAccountProvider$b;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->$VALUES:[Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/sso/api/provider/UiAccountProvider$b;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->id:Ljava/lang/String;

    return-object v0
.end method
