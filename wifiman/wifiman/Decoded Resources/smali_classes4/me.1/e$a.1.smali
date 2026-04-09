.class final enum Lme/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lme/e$a;

.field public static final enum DPP:Lme/e$a;

.field public static final enum EAP:Lme/e$a;

.field public static final enum EAP_FILS:Lme/e$a;

.field public static final enum EAP_FT:Lme/e$a;

.field public static final enum EAP_SHA1:Lme/e$a;

.field public static final enum EAP_SHA256:Lme/e$a;

.field public static final enum EAP_SUITE_B_192:Lme/e$a;

.field public static final enum ENC_SHA1:Lme/e$a;

.field public static final enum ENC_SHA256:Lme/e$a;

.field public static final enum ENC_SUITE_B:Lme/e$a;

.field public static final enum OWE:Lme/e$a;

.field public static final enum OWE_TRANSITION:Lme/e$a;

.field public static final enum PSK:Lme/e$a;

.field public static final enum PSK_FT:Lme/e$a;

.field public static final enum RSN:Lme/e$a;

.field public static final enum SAE:Lme/e$a;

.field public static final enum SAE_FT:Lme/e$a;

.field public static final enum WAPI:Lme/e$a;

.field public static final enum WEP:Lme/e$a;

.field public static final enum WPA:Lme/e$a;

.field public static final enum WPA2:Lme/e$a;

.field public static final enum WPS:Lme/e$a;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lme/e$a;
    .locals 22

    sget-object v0, Lme/e$a;->OWE_TRANSITION:Lme/e$a;

    sget-object v1, Lme/e$a;->OWE:Lme/e$a;

    sget-object v2, Lme/e$a;->DPP:Lme/e$a;

    sget-object v3, Lme/e$a;->WEP:Lme/e$a;

    sget-object v4, Lme/e$a;->WAPI:Lme/e$a;

    sget-object v5, Lme/e$a;->WPS:Lme/e$a;

    sget-object v6, Lme/e$a;->PSK:Lme/e$a;

    sget-object v7, Lme/e$a;->PSK_FT:Lme/e$a;

    sget-object v8, Lme/e$a;->WPA:Lme/e$a;

    sget-object v9, Lme/e$a;->WPA2:Lme/e$a;

    sget-object v10, Lme/e$a;->RSN:Lme/e$a;

    sget-object v11, Lme/e$a;->EAP:Lme/e$a;

    sget-object v12, Lme/e$a;->EAP_FT:Lme/e$a;

    sget-object v13, Lme/e$a;->EAP_FILS:Lme/e$a;

    sget-object v14, Lme/e$a;->EAP_SHA1:Lme/e$a;

    sget-object v15, Lme/e$a;->EAP_SHA256:Lme/e$a;

    sget-object v16, Lme/e$a;->ENC_SHA1:Lme/e$a;

    sget-object v17, Lme/e$a;->ENC_SHA256:Lme/e$a;

    sget-object v18, Lme/e$a;->EAP_SUITE_B_192:Lme/e$a;

    sget-object v19, Lme/e$a;->ENC_SUITE_B:Lme/e$a;

    sget-object v20, Lme/e$a;->SAE:Lme/e$a;

    sget-object v21, Lme/e$a;->SAE_FT:Lme/e$a;

    filled-new-array/range {v0 .. v21}, [Lme/e$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lme/e$a;

    const-string v1, "OWE_TRANSITION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->OWE_TRANSITION:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "OWE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->OWE:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "DPP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->DPP:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "WEP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->WEP:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "WAPI"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->WAPI:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "WPS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->WPS:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "PSK"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->PSK:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/4 v1, 0x7

    const-string v2, "FT/PSK"

    const-string v3, "PSK_FT"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->PSK_FT:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "WPA"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->WPA:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "WPA2"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->WPA2:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "RSN"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->RSN:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "EAP"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->EAP:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0xc

    const-string v2, "FT/EAP"

    const-string v3, "EAP_FT"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->EAP_FT:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0xd

    const-string v2, "EAP-FILS"

    const-string v3, "EAP_FILS"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->EAP_FILS:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0xe

    const-string v2, "EAP/SHA1"

    const-string v3, "EAP_SHA1"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->EAP_SHA1:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0xf

    const-string v2, "EAP/SHA256"

    const-string v3, "EAP_SHA256"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->EAP_SHA256:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0x10

    const-string v2, "SHA1"

    const-string v3, "ENC_SHA1"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->ENC_SHA1:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0x11

    const-string v2, "SHA256"

    const-string v3, "ENC_SHA256"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->ENC_SHA256:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0x12

    const-string v2, "SUITE_B_192"

    const-string v3, "EAP_SUITE_B_192"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->EAP_SUITE_B_192:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0x13

    const-string v2, "SUITE_B"

    const-string v3, "ENC_SUITE_B"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->ENC_SUITE_B:Lme/e$a;

    new-instance v0, Lme/e$a;

    const-string v1, "SAE"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2, v1}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->SAE:Lme/e$a;

    new-instance v0, Lme/e$a;

    const/16 v1, 0x15

    const-string v2, "FT/SAE"

    const-string v3, "SAE_FT"

    invoke-direct {v0, v3, v1, v2}, Lme/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lme/e$a;->SAE_FT:Lme/e$a;

    invoke-static {}, Lme/e$a;->$values()[Lme/e$a;

    move-result-object v0

    sput-object v0, Lme/e$a;->$VALUES:[Lme/e$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lme/e$a;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Lme/e$a;->key:Ljava/lang/String;

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

    sget-object v0, Lme/e$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lme/e$a;
    .locals 1

    const-class v0, Lme/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lme/e$a;

    return-object p0
.end method

.method public static values()[Lme/e$a;
    .locals 1

    sget-object v0, Lme/e$a;->$VALUES:[Lme/e$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lme/e$a;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lme/e$a;->key:Ljava/lang/String;

    return-object v0
.end method
