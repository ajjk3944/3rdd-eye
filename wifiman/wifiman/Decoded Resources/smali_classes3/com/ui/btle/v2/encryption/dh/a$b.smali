.class final enum Lcom/ui/btle/v2/encryption/dh/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/v2/encryption/dh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/encryption/dh/a$b$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/btle/v2/encryption/dh/a$b;

.field public static final Companion:Lcom/ui/btle/v2/encryption/dh/a$b$a;

.field public static final enum PUBLIC_KEY:Lcom/ui/btle/v2/encryption/dh/a$b;

.field public static final enum REQUEST_PROTOCOL_SERVER:Lcom/ui/btle/v2/encryption/dh/a$b;

.field public static final enum REQUEST_PROTOCOL_TYPE:Lcom/ui/btle/v2/encryption/dh/a$b;


# instance fields
.field private final readValue:Lyj/u;

.field private final writeValue:Lyj/u;


# direct methods
.method private static final synthetic $values()[Lcom/ui/btle/v2/encryption/dh/a$b;
    .locals 3

    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->REQUEST_PROTOCOL_TYPE:Lcom/ui/btle/v2/encryption/dh/a$b;

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$b;->REQUEST_PROTOCOL_SERVER:Lcom/ui/btle/v2/encryption/dh/a$b;

    sget-object v2, Lcom/ui/btle/v2/encryption/dh/a$b;->PUBLIC_KEY:Lcom/ui/btle/v2/encryption/dh/a$b;

    filled-new-array {v0, v1, v2}, [Lcom/ui/btle/v2/encryption/dh/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$b;

    new-instance v1, Lzj/l;

    const-string v2, "DHPK"

    invoke-direct {v1, v2}, Lzj/l;-><init>(Ljava/lang/String;)V

    new-instance v3, Lzj/l;

    invoke-direct {v3, v2}, Lzj/l;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "REQUEST_PROTOCOL_TYPE"

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v1, v3}, Lcom/ui/btle/v2/encryption/dh/a$b;-><init>(Ljava/lang/String;ILyj/u;Lyj/u;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->REQUEST_PROTOCOL_TYPE:Lcom/ui/btle/v2/encryption/dh/a$b;

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$b;

    sget-object v1, Lzj/f;->b:Lyj/h;

    sget-object v2, Lzj/f;->c:Lyj/h;

    const-string/jumbo v3, "REQUEST_PROTOCOL_SERVER"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/ui/btle/v2/encryption/dh/a$b;-><init>(Ljava/lang/String;ILyj/u;Lyj/u;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->REQUEST_PROTOCOL_SERVER:Lcom/ui/btle/v2/encryption/dh/a$b;

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$b;

    const-string/jumbo v1, "PUBLIC_KEY"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/ui/btle/v2/encryption/dh/a$b;-><init>(Ljava/lang/String;ILyj/u;Lyj/u;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->PUBLIC_KEY:Lcom/ui/btle/v2/encryption/dh/a$b;

    invoke-static {}, Lcom/ui/btle/v2/encryption/dh/a$b;->$values()[Lcom/ui/btle/v2/encryption/dh/a$b;

    move-result-object v0

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->$VALUES:[Lcom/ui/btle/v2/encryption/dh/a$b;

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$b$a;

    invoke-direct {v0, v3}, Lcom/ui/btle/v2/encryption/dh/a$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->Companion:Lcom/ui/btle/v2/encryption/dh/a$b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILyj/u;Lyj/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyj/u;",
            "Lyj/u;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/btle/v2/encryption/dh/a$b;->readValue:Lyj/u;

    iput-object p4, p0, Lcom/ui/btle/v2/encryption/dh/a$b;->writeValue:Lyj/u;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/btle/v2/encryption/dh/a$b;
    .locals 1

    const-class v0, Lcom/ui/btle/v2/encryption/dh/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/btle/v2/encryption/dh/a$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/btle/v2/encryption/dh/a$b;
    .locals 1

    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->$VALUES:[Lcom/ui/btle/v2/encryption/dh/a$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/btle/v2/encryption/dh/a$b;

    return-object v0
.end method


# virtual methods
.method protected final getReadValue()Lyj/u;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a$b;->readValue:Lyj/u;

    return-object v0
.end method

.method protected final getWriteValue()Lyj/u;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a$b;->writeValue:Lyj/u;

    return-object v0
.end method
