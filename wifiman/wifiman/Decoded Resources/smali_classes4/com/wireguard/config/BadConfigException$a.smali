.class public final enum Lcom/wireguard/config/BadConfigException$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/config/BadConfigException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/wireguard/config/BadConfigException$a;

.field public static final enum ADDRESS:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum ALLOWED_IPS:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum DNS:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum ENDPOINT:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum EXCLUDED_APPLICATIONS:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum INCLUDED_APPLICATIONS:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum LISTEN_ADDRESS:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum LISTEN_PORT:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum MTU:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum PERSISTENT_KEEPALIVE:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum PRE_SHARED_KEY:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum PRIVATE_KEY:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum PUBLIC_KEY:Lcom/wireguard/config/BadConfigException$a;

.field public static final enum TOP_LEVEL:Lcom/wireguard/config/BadConfigException$a;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/wireguard/config/BadConfigException$a;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "TOP_LEVEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/wireguard/config/BadConfigException$a;->TOP_LEVEL:Lcom/wireguard/config/BadConfigException$a;

    new-instance v1, Lcom/wireguard/config/BadConfigException$a;

    const/4 v2, 0x1

    const-string v3, "Address"

    const-string v4, "ADDRESS"

    invoke-direct {v1, v4, v2, v3}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/wireguard/config/BadConfigException$a;->ADDRESS:Lcom/wireguard/config/BadConfigException$a;

    new-instance v2, Lcom/wireguard/config/BadConfigException$a;

    const/4 v3, 0x2

    const-string v4, "AllowedIPs"

    const-string v5, "ALLOWED_IPS"

    invoke-direct {v2, v5, v3, v4}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/wireguard/config/BadConfigException$a;->ALLOWED_IPS:Lcom/wireguard/config/BadConfigException$a;

    new-instance v3, Lcom/wireguard/config/BadConfigException$a;

    const-string v4, "DNS"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v4}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/wireguard/config/BadConfigException$a;->DNS:Lcom/wireguard/config/BadConfigException$a;

    new-instance v4, Lcom/wireguard/config/BadConfigException$a;

    const/4 v5, 0x4

    const-string v6, "Endpoint"

    const-string v7, "ENDPOINT"

    invoke-direct {v4, v7, v5, v6}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/wireguard/config/BadConfigException$a;->ENDPOINT:Lcom/wireguard/config/BadConfigException$a;

    new-instance v5, Lcom/wireguard/config/BadConfigException$a;

    const/4 v6, 0x5

    const-string v7, "ExcludedApplications"

    const-string v8, "EXCLUDED_APPLICATIONS"

    invoke-direct {v5, v8, v6, v7}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/wireguard/config/BadConfigException$a;->EXCLUDED_APPLICATIONS:Lcom/wireguard/config/BadConfigException$a;

    new-instance v6, Lcom/wireguard/config/BadConfigException$a;

    const/4 v7, 0x6

    const-string v8, "IncludedApplications"

    const-string v9, "INCLUDED_APPLICATIONS"

    invoke-direct {v6, v9, v7, v8}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/wireguard/config/BadConfigException$a;->INCLUDED_APPLICATIONS:Lcom/wireguard/config/BadConfigException$a;

    new-instance v7, Lcom/wireguard/config/BadConfigException$a;

    const/4 v8, 0x7

    const-string v9, "ListenAddress"

    const-string v10, "LISTEN_ADDRESS"

    invoke-direct {v7, v10, v8, v9}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/wireguard/config/BadConfigException$a;->LISTEN_ADDRESS:Lcom/wireguard/config/BadConfigException$a;

    new-instance v8, Lcom/wireguard/config/BadConfigException$a;

    const/16 v9, 0x8

    const-string v10, "ListenPort"

    const-string v11, "LISTEN_PORT"

    invoke-direct {v8, v11, v9, v10}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/wireguard/config/BadConfigException$a;->LISTEN_PORT:Lcom/wireguard/config/BadConfigException$a;

    new-instance v9, Lcom/wireguard/config/BadConfigException$a;

    const-string v10, "MTU"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11, v10}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/wireguard/config/BadConfigException$a;->MTU:Lcom/wireguard/config/BadConfigException$a;

    new-instance v10, Lcom/wireguard/config/BadConfigException$a;

    const/16 v11, 0xa

    const-string v12, "PersistentKeepalive"

    const-string v13, "PERSISTENT_KEEPALIVE"

    invoke-direct {v10, v13, v11, v12}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/wireguard/config/BadConfigException$a;->PERSISTENT_KEEPALIVE:Lcom/wireguard/config/BadConfigException$a;

    new-instance v11, Lcom/wireguard/config/BadConfigException$a;

    const/16 v12, 0xb

    const-string v13, "PresharedKey"

    const-string v14, "PRE_SHARED_KEY"

    invoke-direct {v11, v14, v12, v13}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/wireguard/config/BadConfigException$a;->PRE_SHARED_KEY:Lcom/wireguard/config/BadConfigException$a;

    new-instance v12, Lcom/wireguard/config/BadConfigException$a;

    const/16 v13, 0xc

    const-string v14, "PrivateKey"

    const-string v15, "PRIVATE_KEY"

    invoke-direct {v12, v15, v13, v14}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/wireguard/config/BadConfigException$a;->PRIVATE_KEY:Lcom/wireguard/config/BadConfigException$a;

    new-instance v13, Lcom/wireguard/config/BadConfigException$a;

    const/16 v14, 0xd

    const-string v15, "PublicKey"

    move-object/from16 v16, v12

    const-string v12, "PUBLIC_KEY"

    invoke-direct {v13, v12, v14, v15}, Lcom/wireguard/config/BadConfigException$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/wireguard/config/BadConfigException$a;->PUBLIC_KEY:Lcom/wireguard/config/BadConfigException$a;

    move-object/from16 v12, v16

    filled-new-array/range {v0 .. v13}, [Lcom/wireguard/config/BadConfigException$a;

    move-result-object v0

    sput-object v0, Lcom/wireguard/config/BadConfigException$a;->$VALUES:[Lcom/wireguard/config/BadConfigException$a;

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

    iput-object p3, p0, Lcom/wireguard/config/BadConfigException$a;->name:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/wireguard/config/BadConfigException$a;
    .locals 1

    const-class v0, Lcom/wireguard/config/BadConfigException$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/wireguard/config/BadConfigException$a;

    return-object p0
.end method

.method public static values()[Lcom/wireguard/config/BadConfigException$a;
    .locals 1

    sget-object v0, Lcom/wireguard/config/BadConfigException$a;->$VALUES:[Lcom/wireguard/config/BadConfigException$a;

    invoke-virtual {v0}, [Lcom/wireguard/config/BadConfigException$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/wireguard/config/BadConfigException$a;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/BadConfigException$a;->name:Ljava/lang/String;

    return-object v0
.end method
