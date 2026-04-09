.class public final enum Lcom/ui/btle/v2/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/c$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/btle/v2/c;

.field public static final enum ALL_JOIN:Lcom/ui/btle/v2/c;

.field public static final enum AUTHENTICATION:Lcom/ui/btle/v2/c;

.field public static final enum BINARY_MESSAGE:Lcom/ui/btle/v2/c;

.field public static final Companion:Lcom/ui/btle/v2/c$a;

.field public static final enum MANAGEMENT:Lcom/ui/btle/v2/c;

.field private static final protocols:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Byte;",
            "Lcom/ui/btle/v2/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final id:B


# direct methods
.method private static final synthetic $values()[Lcom/ui/btle/v2/c;
    .locals 4

    sget-object v0, Lcom/ui/btle/v2/c;->AUTHENTICATION:Lcom/ui/btle/v2/c;

    sget-object v1, Lcom/ui/btle/v2/c;->MANAGEMENT:Lcom/ui/btle/v2/c;

    sget-object v2, Lcom/ui/btle/v2/c;->ALL_JOIN:Lcom/ui/btle/v2/c;

    sget-object v3, Lcom/ui/btle/v2/c;->BINARY_MESSAGE:Lcom/ui/btle/v2/c;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ui/btle/v2/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/ui/btle/v2/c;

    const-string v1, "AUTHENTICATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ui/btle/v2/c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/btle/v2/c;->AUTHENTICATION:Lcom/ui/btle/v2/c;

    new-instance v0, Lcom/ui/btle/v2/c;

    const-string/jumbo v1, "MANAGEMENT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/ui/btle/v2/c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/btle/v2/c;->MANAGEMENT:Lcom/ui/btle/v2/c;

    new-instance v0, Lcom/ui/btle/v2/c;

    const-string v1, "ALL_JOIN"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v3}, Lcom/ui/btle/v2/c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/btle/v2/c;->ALL_JOIN:Lcom/ui/btle/v2/c;

    new-instance v0, Lcom/ui/btle/v2/c;

    const-string v1, "BINARY_MESSAGE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v3}, Lcom/ui/btle/v2/c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/btle/v2/c;->BINARY_MESSAGE:Lcom/ui/btle/v2/c;

    invoke-static {}, Lcom/ui/btle/v2/c;->$values()[Lcom/ui/btle/v2/c;

    move-result-object v0

    sput-object v0, Lcom/ui/btle/v2/c;->$VALUES:[Lcom/ui/btle/v2/c;

    new-instance v0, Lcom/ui/btle/v2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/btle/v2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/btle/v2/c;->Companion:Lcom/ui/btle/v2/c$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/ui/btle/v2/c;->values()[Lcom/ui/btle/v2/c;

    move-result-object v1

    array-length v3, v1

    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v1, v2

    iget-byte v5, v4, Lcom/ui/btle/v2/c;->id:B

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sput-object v0, Lcom/ui/btle/v2/c;->protocols:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/ui/btle/v2/c;->id:B

    return-void
.end method

.method public static final synthetic access$getProtocols$cp()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lcom/ui/btle/v2/c;->protocols:Ljava/util/HashMap;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/btle/v2/c;
    .locals 1

    const-class v0, Lcom/ui/btle/v2/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/btle/v2/c;

    return-object p0
.end method

.method public static values()[Lcom/ui/btle/v2/c;
    .locals 1

    sget-object v0, Lcom/ui/btle/v2/c;->$VALUES:[Lcom/ui/btle/v2/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/btle/v2/c;

    return-object v0
.end method


# virtual methods
.method public final getId()B
    .locals 1

    iget-byte v0, p0, Lcom/ui/btle/v2/c;->id:B

    return v0
.end method
