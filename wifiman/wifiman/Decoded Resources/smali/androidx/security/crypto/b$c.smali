.class public final enum Landroidx/security/crypto/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/security/crypto/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/security/crypto/b$c;

.field public static final enum AES256_GCM:Landroidx/security/crypto/b$c;


# direct methods
.method private static synthetic $values()[Landroidx/security/crypto/b$c;
    .locals 1

    sget-object v0, Landroidx/security/crypto/b$c;->AES256_GCM:Landroidx/security/crypto/b$c;

    filled-new-array {v0}, [Landroidx/security/crypto/b$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/security/crypto/b$c;

    const-string v1, "AES256_GCM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/security/crypto/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/security/crypto/b$c;->AES256_GCM:Landroidx/security/crypto/b$c;

    invoke-static {}, Landroidx/security/crypto/b$c;->$values()[Landroidx/security/crypto/b$c;

    move-result-object v0

    sput-object v0, Landroidx/security/crypto/b$c;->$VALUES:[Landroidx/security/crypto/b$c;

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

.method public static valueOf(Ljava/lang/String;)Landroidx/security/crypto/b$c;
    .locals 1

    const-class v0, Landroidx/security/crypto/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/security/crypto/b$c;

    return-object p0
.end method

.method public static values()[Landroidx/security/crypto/b$c;
    .locals 1

    sget-object v0, Landroidx/security/crypto/b$c;->$VALUES:[Landroidx/security/crypto/b$c;

    invoke-virtual {v0}, [Landroidx/security/crypto/b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/security/crypto/b$c;

    return-object v0
.end method
