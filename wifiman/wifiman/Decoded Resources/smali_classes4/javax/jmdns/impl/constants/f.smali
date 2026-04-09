.class public final enum Ljavax/jmdns/impl/constants/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Ljavax/jmdns/impl/constants/f;

.field static final ExtendedRCode_MASK:I = 0xff

.field public static final enum FormErr:Ljavax/jmdns/impl/constants/f;

.field public static final enum NXDomain:Ljavax/jmdns/impl/constants/f;

.field public static final enum NXRRSet:Ljavax/jmdns/impl/constants/f;

.field public static final enum NoError:Ljavax/jmdns/impl/constants/f;

.field public static final enum NotAuth:Ljavax/jmdns/impl/constants/f;

.field public static final enum NotImp:Ljavax/jmdns/impl/constants/f;

.field public static final enum NotZone:Ljavax/jmdns/impl/constants/f;

.field static final RCode_MASK:I = 0xf

.field public static final enum Refused:Ljavax/jmdns/impl/constants/f;

.field public static final enum ServFail:Ljavax/jmdns/impl/constants/f;

.field public static final enum Unknown:Ljavax/jmdns/impl/constants/f;

.field public static final enum YXDomain:Ljavax/jmdns/impl/constants/f;

.field public static final enum YXRRSet:Ljavax/jmdns/impl/constants/f;


# instance fields
.field private final _externalName:Ljava/lang/String;

.field private final _index:I


# direct methods
.method private static synthetic $values()[Ljavax/jmdns/impl/constants/f;
    .locals 12

    sget-object v0, Ljavax/jmdns/impl/constants/f;->Unknown:Ljavax/jmdns/impl/constants/f;

    sget-object v1, Ljavax/jmdns/impl/constants/f;->NoError:Ljavax/jmdns/impl/constants/f;

    sget-object v2, Ljavax/jmdns/impl/constants/f;->FormErr:Ljavax/jmdns/impl/constants/f;

    sget-object v3, Ljavax/jmdns/impl/constants/f;->ServFail:Ljavax/jmdns/impl/constants/f;

    sget-object v4, Ljavax/jmdns/impl/constants/f;->NXDomain:Ljavax/jmdns/impl/constants/f;

    sget-object v5, Ljavax/jmdns/impl/constants/f;->NotImp:Ljavax/jmdns/impl/constants/f;

    sget-object v6, Ljavax/jmdns/impl/constants/f;->Refused:Ljavax/jmdns/impl/constants/f;

    sget-object v7, Ljavax/jmdns/impl/constants/f;->YXDomain:Ljavax/jmdns/impl/constants/f;

    sget-object v8, Ljavax/jmdns/impl/constants/f;->YXRRSet:Ljavax/jmdns/impl/constants/f;

    sget-object v9, Ljavax/jmdns/impl/constants/f;->NXRRSet:Ljavax/jmdns/impl/constants/f;

    sget-object v10, Ljavax/jmdns/impl/constants/f;->NotAuth:Ljavax/jmdns/impl/constants/f;

    sget-object v11, Ljavax/jmdns/impl/constants/f;->NotZone:Ljavax/jmdns/impl/constants/f;

    filled-new-array/range {v0 .. v11}, [Ljavax/jmdns/impl/constants/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const v1, 0xffff

    const-string v2, "Unknown"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v2, v1}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->Unknown:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "No Error"

    const-string v2, "NoError"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v1, v3}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->NoError:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Format Error"

    const-string v2, "FormErr"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1, v4}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->FormErr:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Server Failure"

    const-string v2, "ServFail"

    const/4 v4, 0x3

    invoke-direct {v0, v2, v4, v1, v3}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->ServFail:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Non-Existent Domain"

    const-string v2, "NXDomain"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1, v4}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->NXDomain:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Not Implemented"

    const-string v2, "NotImp"

    const/4 v4, 0x5

    invoke-direct {v0, v2, v4, v1, v3}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->NotImp:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Query Refused"

    const-string v2, "Refused"

    const/4 v3, 0x6

    invoke-direct {v0, v2, v3, v1, v4}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->Refused:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Name Exists when it should not"

    const-string v2, "YXDomain"

    const/4 v4, 0x7

    invoke-direct {v0, v2, v4, v1, v3}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->YXDomain:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "RR Set Exists when it should not"

    const-string v2, "YXRRSet"

    const/16 v3, 0x8

    invoke-direct {v0, v2, v3, v1, v4}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->YXRRSet:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "RR Set that should exist does not"

    const-string v2, "NXRRSet"

    const/16 v4, 0x9

    invoke-direct {v0, v2, v4, v1, v3}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->NXRRSet:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const-string v1, "Server Not Authoritative for zone"

    const-string v2, "NotAuth"

    const/16 v3, 0xa

    invoke-direct {v0, v2, v3, v1, v4}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->NotAuth:Ljavax/jmdns/impl/constants/f;

    new-instance v0, Ljavax/jmdns/impl/constants/f;

    const/16 v1, 0xb

    const-string v2, "NotZone Name not contained in zone"

    const-string v4, "NotZone"

    invoke-direct {v0, v4, v1, v2, v3}, Ljavax/jmdns/impl/constants/f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/f;->NotZone:Ljavax/jmdns/impl/constants/f;

    invoke-static {}, Ljavax/jmdns/impl/constants/f;->$values()[Ljavax/jmdns/impl/constants/f;

    move-result-object v0

    sput-object v0, Ljavax/jmdns/impl/constants/f;->$VALUES:[Ljavax/jmdns/impl/constants/f;

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

    iput-object p3, p0, Ljavax/jmdns/impl/constants/f;->_externalName:Ljava/lang/String;

    iput p4, p0, Ljavax/jmdns/impl/constants/f;->_index:I

    return-void
.end method

.method public static resultCodeForFlags(I)Ljavax/jmdns/impl/constants/f;
    .locals 5

    and-int/lit8 p0, p0, 0xf

    .line 1
    invoke-static {}, Ljavax/jmdns/impl/constants/f;->values()[Ljavax/jmdns/impl/constants/f;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Ljavax/jmdns/impl/constants/f;->_index:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    sget-object p0, Ljavax/jmdns/impl/constants/f;->Unknown:Ljavax/jmdns/impl/constants/f;

    return-object p0
.end method

.method public static resultCodeForFlags(II)Ljavax/jmdns/impl/constants/f;
    .locals 4

    shr-int/lit8 p1, p1, 0x1c

    and-int/lit16 p1, p1, 0xff

    and-int/lit8 p0, p0, 0xf

    or-int/2addr p0, p1

    .line 4
    invoke-static {}, Ljavax/jmdns/impl/constants/f;->values()[Ljavax/jmdns/impl/constants/f;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 5
    iget v3, v2, Ljavax/jmdns/impl/constants/f;->_index:I

    if-ne v3, p0, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_1
    sget-object p0, Ljavax/jmdns/impl/constants/f;->Unknown:Ljavax/jmdns/impl/constants/f;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ljavax/jmdns/impl/constants/f;
    .locals 1

    const-class v0, Ljavax/jmdns/impl/constants/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljavax/jmdns/impl/constants/f;

    return-object p0
.end method

.method public static values()[Ljavax/jmdns/impl/constants/f;
    .locals 1

    sget-object v0, Ljavax/jmdns/impl/constants/f;->$VALUES:[Ljavax/jmdns/impl/constants/f;

    invoke-virtual {v0}, [Ljavax/jmdns/impl/constants/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljavax/jmdns/impl/constants/f;

    return-object v0
.end method


# virtual methods
.method public externalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljavax/jmdns/impl/constants/f;->_externalName:Ljava/lang/String;

    return-object v0
.end method

.method public indexValue()I
    .locals 1

    iget v0, p0, Ljavax/jmdns/impl/constants/f;->_index:I

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

    invoke-virtual {p0}, Ljavax/jmdns/impl/constants/f;->indexValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
