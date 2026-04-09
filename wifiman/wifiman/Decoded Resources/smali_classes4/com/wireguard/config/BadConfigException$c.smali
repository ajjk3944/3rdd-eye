.class public final enum Lcom/wireguard/config/BadConfigException$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/config/BadConfigException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/wireguard/config/BadConfigException$c;

.field public static final enum CONFIG:Lcom/wireguard/config/BadConfigException$c;

.field public static final enum INTERFACE:Lcom/wireguard/config/BadConfigException$c;

.field public static final enum PEER:Lcom/wireguard/config/BadConfigException$c;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/wireguard/config/BadConfigException$c;

    const/4 v1, 0x0

    const-string v2, "Config"

    const-string v3, "CONFIG"

    invoke-direct {v0, v3, v1, v2}, Lcom/wireguard/config/BadConfigException$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/wireguard/config/BadConfigException$c;->CONFIG:Lcom/wireguard/config/BadConfigException$c;

    new-instance v1, Lcom/wireguard/config/BadConfigException$c;

    const/4 v2, 0x1

    const-string v3, "Interface"

    const-string v4, "INTERFACE"

    invoke-direct {v1, v4, v2, v3}, Lcom/wireguard/config/BadConfigException$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/wireguard/config/BadConfigException$c;->INTERFACE:Lcom/wireguard/config/BadConfigException$c;

    new-instance v2, Lcom/wireguard/config/BadConfigException$c;

    const/4 v3, 0x2

    const-string v4, "Peer"

    const-string v5, "PEER"

    invoke-direct {v2, v5, v3, v4}, Lcom/wireguard/config/BadConfigException$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/wireguard/config/BadConfigException$c;->PEER:Lcom/wireguard/config/BadConfigException$c;

    filled-new-array {v0, v1, v2}, [Lcom/wireguard/config/BadConfigException$c;

    move-result-object v0

    sput-object v0, Lcom/wireguard/config/BadConfigException$c;->$VALUES:[Lcom/wireguard/config/BadConfigException$c;

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

    iput-object p3, p0, Lcom/wireguard/config/BadConfigException$c;->name:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/wireguard/config/BadConfigException$c;
    .locals 1

    const-class v0, Lcom/wireguard/config/BadConfigException$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/wireguard/config/BadConfigException$c;

    return-object p0
.end method

.method public static values()[Lcom/wireguard/config/BadConfigException$c;
    .locals 1

    sget-object v0, Lcom/wireguard/config/BadConfigException$c;->$VALUES:[Lcom/wireguard/config/BadConfigException$c;

    invoke-virtual {v0}, [Lcom/wireguard/config/BadConfigException$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/wireguard/config/BadConfigException$c;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/BadConfigException$c;->name:Ljava/lang/String;

    return-object v0
.end method
