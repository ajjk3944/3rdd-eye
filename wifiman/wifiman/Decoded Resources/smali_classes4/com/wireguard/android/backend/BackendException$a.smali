.class public final enum Lcom/wireguard/android/backend/BackendException$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/android/backend/BackendException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum DNS_RESOLUTION_FAILURE:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum GO_ACTIVATION_ERROR_CODE:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum TUNNEL_MISSING_CONFIG:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum TUN_CREATION_ERROR:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum UNABLE_TO_START_VPN:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum UNKNOWN_KERNEL_MODULE_NAME:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum VPN_NOT_AUTHORIZED:Lcom/wireguard/android/backend/BackendException$a;

.field public static final enum WG_QUICK_CONFIG_ERROR_CODE:Lcom/wireguard/android/backend/BackendException$a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/wireguard/android/backend/BackendException$a;

    const-string v1, "UNKNOWN_KERNEL_MODULE_NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/wireguard/android/backend/BackendException$a;->UNKNOWN_KERNEL_MODULE_NAME:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v1, Lcom/wireguard/android/backend/BackendException$a;

    const-string v2, "WG_QUICK_CONFIG_ERROR_CODE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/wireguard/android/backend/BackendException$a;->WG_QUICK_CONFIG_ERROR_CODE:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v2, Lcom/wireguard/android/backend/BackendException$a;

    const-string v3, "TUNNEL_MISSING_CONFIG"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/wireguard/android/backend/BackendException$a;->TUNNEL_MISSING_CONFIG:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v3, Lcom/wireguard/android/backend/BackendException$a;

    const-string v4, "VPN_NOT_AUTHORIZED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/wireguard/android/backend/BackendException$a;->VPN_NOT_AUTHORIZED:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v4, Lcom/wireguard/android/backend/BackendException$a;

    const-string v5, "UNABLE_TO_START_VPN"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/wireguard/android/backend/BackendException$a;->UNABLE_TO_START_VPN:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v5, Lcom/wireguard/android/backend/BackendException$a;

    const-string v6, "TUN_CREATION_ERROR"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/wireguard/android/backend/BackendException$a;->TUN_CREATION_ERROR:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v6, Lcom/wireguard/android/backend/BackendException$a;

    const-string v7, "GO_ACTIVATION_ERROR_CODE"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/wireguard/android/backend/BackendException$a;->GO_ACTIVATION_ERROR_CODE:Lcom/wireguard/android/backend/BackendException$a;

    new-instance v7, Lcom/wireguard/android/backend/BackendException$a;

    const-string v8, "DNS_RESOLUTION_FAILURE"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lcom/wireguard/android/backend/BackendException$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/wireguard/android/backend/BackendException$a;->DNS_RESOLUTION_FAILURE:Lcom/wireguard/android/backend/BackendException$a;

    filled-new-array/range {v0 .. v7}, [Lcom/wireguard/android/backend/BackendException$a;

    move-result-object v0

    sput-object v0, Lcom/wireguard/android/backend/BackendException$a;->$VALUES:[Lcom/wireguard/android/backend/BackendException$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/wireguard/android/backend/BackendException$a;
    .locals 1

    const-class v0, Lcom/wireguard/android/backend/BackendException$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/wireguard/android/backend/BackendException$a;

    return-object p0
.end method

.method public static values()[Lcom/wireguard/android/backend/BackendException$a;
    .locals 1

    sget-object v0, Lcom/wireguard/android/backend/BackendException$a;->$VALUES:[Lcom/wireguard/android/backend/BackendException$a;

    invoke-virtual {v0}, [Lcom/wireguard/android/backend/BackendException$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/wireguard/android/backend/BackendException$a;

    return-object v0
.end method
