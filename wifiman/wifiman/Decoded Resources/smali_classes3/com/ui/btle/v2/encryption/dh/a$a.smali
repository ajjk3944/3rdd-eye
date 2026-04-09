.class final enum Lcom/ui/btle/v2/encryption/dh/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/v2/encryption/dh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/encryption/dh/a$a$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/btle/v2/encryption/dh/a$a;

.field public static final Companion:Lcom/ui/btle/v2/encryption/dh/a$a$a;

.field public static final enum REQUEST_PROTOCOL_SERVER:Lcom/ui/btle/v2/encryption/dh/a$a;

.field public static final enum REQUEST_PROTOCOL_TYPE:Lcom/ui/btle/v2/encryption/dh/a$a;


# instance fields
.field private final value:Lyj/u;


# direct methods
.method private static final synthetic $values()[Lcom/ui/btle/v2/encryption/dh/a$a;
    .locals 2

    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->REQUEST_PROTOCOL_TYPE:Lcom/ui/btle/v2/encryption/dh/a$a;

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$a;->REQUEST_PROTOCOL_SERVER:Lcom/ui/btle/v2/encryption/dh/a$a;

    filled-new-array {v0, v1}, [Lcom/ui/btle/v2/encryption/dh/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$a;

    new-instance v1, Lzj/l;

    const-string v2, "AUTH"

    invoke-direct {v1, v2}, Lzj/l;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "REQUEST_PROTOCOL_TYPE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/ui/btle/v2/encryption/dh/a$a;-><init>(Ljava/lang/String;ILyj/u;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->REQUEST_PROTOCOL_TYPE:Lcom/ui/btle/v2/encryption/dh/a$a;

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$a;

    new-instance v1, Lzj/l;

    const-string v2, "DH"

    invoke-direct {v1, v2}, Lzj/l;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "REQUEST_PROTOCOL_SERVER"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/ui/btle/v2/encryption/dh/a$a;-><init>(Ljava/lang/String;ILyj/u;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->REQUEST_PROTOCOL_SERVER:Lcom/ui/btle/v2/encryption/dh/a$a;

    invoke-static {}, Lcom/ui/btle/v2/encryption/dh/a$a;->$values()[Lcom/ui/btle/v2/encryption/dh/a$a;

    move-result-object v0

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->$VALUES:[Lcom/ui/btle/v2/encryption/dh/a$a;

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/btle/v2/encryption/dh/a$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->Companion:Lcom/ui/btle/v2/encryption/dh/a$a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILyj/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyj/u;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/btle/v2/encryption/dh/a$a;->value:Lyj/u;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/btle/v2/encryption/dh/a$a;
    .locals 1

    const-class v0, Lcom/ui/btle/v2/encryption/dh/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/btle/v2/encryption/dh/a$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/btle/v2/encryption/dh/a$a;
    .locals 1

    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->$VALUES:[Lcom/ui/btle/v2/encryption/dh/a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/btle/v2/encryption/dh/a$a;

    return-object v0
.end method


# virtual methods
.method protected final getValue()Lyj/u;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a$a;->value:Lyj/u;

    return-object v0
.end method
