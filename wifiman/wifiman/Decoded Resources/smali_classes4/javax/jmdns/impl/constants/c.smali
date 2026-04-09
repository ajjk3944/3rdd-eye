.class public final enum Ljavax/jmdns/impl/constants/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Ljavax/jmdns/impl/constants/c;

.field public static final enum LLQ:Ljavax/jmdns/impl/constants/c;

.field public static final enum NSID:Ljavax/jmdns/impl/constants/c;

.field public static final enum Owner:Ljavax/jmdns/impl/constants/c;

.field public static final enum UL:Ljavax/jmdns/impl/constants/c;

.field public static final enum Unknown:Ljavax/jmdns/impl/constants/c;


# instance fields
.field private final _externalName:Ljava/lang/String;

.field private final _index:I


# direct methods
.method private static synthetic $values()[Ljavax/jmdns/impl/constants/c;
    .locals 5

    sget-object v0, Ljavax/jmdns/impl/constants/c;->Unknown:Ljavax/jmdns/impl/constants/c;

    sget-object v1, Ljavax/jmdns/impl/constants/c;->LLQ:Ljavax/jmdns/impl/constants/c;

    sget-object v2, Ljavax/jmdns/impl/constants/c;->UL:Ljavax/jmdns/impl/constants/c;

    sget-object v3, Ljavax/jmdns/impl/constants/c;->NSID:Ljavax/jmdns/impl/constants/c;

    sget-object v4, Ljavax/jmdns/impl/constants/c;->Owner:Ljavax/jmdns/impl/constants/c;

    filled-new-array {v0, v1, v2, v3, v4}, [Ljavax/jmdns/impl/constants/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljavax/jmdns/impl/constants/c;

    const/4 v1, 0x0

    const v2, 0xffff

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v3, v2}, Ljavax/jmdns/impl/constants/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/c;->Unknown:Ljavax/jmdns/impl/constants/c;

    new-instance v0, Ljavax/jmdns/impl/constants/c;

    const-string v1, "LLQ"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1, v2}, Ljavax/jmdns/impl/constants/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/c;->LLQ:Ljavax/jmdns/impl/constants/c;

    new-instance v0, Ljavax/jmdns/impl/constants/c;

    const-string v1, "UL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1, v2}, Ljavax/jmdns/impl/constants/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/c;->UL:Ljavax/jmdns/impl/constants/c;

    new-instance v0, Ljavax/jmdns/impl/constants/c;

    const-string v1, "NSID"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1, v2}, Ljavax/jmdns/impl/constants/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/c;->NSID:Ljavax/jmdns/impl/constants/c;

    new-instance v0, Ljavax/jmdns/impl/constants/c;

    const-string v1, "Owner"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1, v2}, Ljavax/jmdns/impl/constants/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/c;->Owner:Ljavax/jmdns/impl/constants/c;

    invoke-static {}, Ljavax/jmdns/impl/constants/c;->$values()[Ljavax/jmdns/impl/constants/c;

    move-result-object v0

    sput-object v0, Ljavax/jmdns/impl/constants/c;->$VALUES:[Ljavax/jmdns/impl/constants/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljavax/jmdns/impl/constants/c;->_externalName:Ljava/lang/String;

    iput p4, p0, Ljavax/jmdns/impl/constants/c;->_index:I

    return-void
.end method

.method public static resultCodeForFlags(I)Ljavax/jmdns/impl/constants/c;
    .locals 5

    invoke-static {}, Ljavax/jmdns/impl/constants/c;->values()[Ljavax/jmdns/impl/constants/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Ljavax/jmdns/impl/constants/c;->_index:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Ljavax/jmdns/impl/constants/c;->Unknown:Ljavax/jmdns/impl/constants/c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ljavax/jmdns/impl/constants/c;
    .locals 1

    const-class v0, Ljavax/jmdns/impl/constants/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljavax/jmdns/impl/constants/c;

    return-object p0
.end method

.method public static values()[Ljavax/jmdns/impl/constants/c;
    .locals 1

    sget-object v0, Ljavax/jmdns/impl/constants/c;->$VALUES:[Ljavax/jmdns/impl/constants/c;

    invoke-virtual {v0}, [Ljavax/jmdns/impl/constants/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljavax/jmdns/impl/constants/c;

    return-object v0
.end method


# virtual methods
.method public externalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljavax/jmdns/impl/constants/c;->_externalName:Ljava/lang/String;

    return-object v0
.end method

.method public indexValue()I
    .locals 1

    iget v0, p0, Ljavax/jmdns/impl/constants/c;->_index:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljavax/jmdns/impl/constants/c;->indexValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
