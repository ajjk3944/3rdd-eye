.class public final enum Ljavax/jmdns/impl/constants/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Ljavax/jmdns/impl/constants/d;

.field public static final enum CLASS_ANY:Ljavax/jmdns/impl/constants/d;

.field public static final enum CLASS_CH:Ljavax/jmdns/impl/constants/d;

.field public static final enum CLASS_CS:Ljavax/jmdns/impl/constants/d;

.field public static final enum CLASS_HS:Ljavax/jmdns/impl/constants/d;

.field public static final enum CLASS_IN:Ljavax/jmdns/impl/constants/d;

.field public static final CLASS_MASK:I = 0x7fff

.field public static final enum CLASS_NONE:Ljavax/jmdns/impl/constants/d;

.field public static final CLASS_UNIQUE:I = 0x8000

.field public static final enum CLASS_UNKNOWN:Ljavax/jmdns/impl/constants/d;

.field public static final NOT_UNIQUE:Z = false

.field public static final UNIQUE:Z = true

.field private static logger:LEj/b;


# instance fields
.field private final _externalName:Ljava/lang/String;

.field private final _index:I


# direct methods
.method private static synthetic $values()[Ljavax/jmdns/impl/constants/d;
    .locals 7

    sget-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_UNKNOWN:Ljavax/jmdns/impl/constants/d;

    sget-object v1, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    sget-object v2, Ljavax/jmdns/impl/constants/d;->CLASS_CS:Ljavax/jmdns/impl/constants/d;

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_CH:Ljavax/jmdns/impl/constants/d;

    sget-object v4, Ljavax/jmdns/impl/constants/d;->CLASS_HS:Ljavax/jmdns/impl/constants/d;

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_NONE:Ljavax/jmdns/impl/constants/d;

    sget-object v6, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    filled-new-array/range {v0 .. v6}, [Ljavax/jmdns/impl/constants/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const/4 v1, 0x0

    const-string v2, "?"

    const-string v3, "CLASS_UNKNOWN"

    invoke-direct {v0, v3, v1, v2, v1}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_UNKNOWN:Ljavax/jmdns/impl/constants/d;

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const/4 v1, 0x1

    const-string v2, "in"

    const-string v3, "CLASS_IN"

    invoke-direct {v0, v3, v1, v2, v1}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const/4 v1, 0x2

    const-string v2, "cs"

    const-string v3, "CLASS_CS"

    invoke-direct {v0, v3, v1, v2, v1}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_CS:Ljavax/jmdns/impl/constants/d;

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const/4 v1, 0x3

    const-string v2, "ch"

    const-string v3, "CLASS_CH"

    invoke-direct {v0, v3, v1, v2, v1}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_CH:Ljavax/jmdns/impl/constants/d;

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const/4 v1, 0x4

    const-string v2, "hs"

    const-string v3, "CLASS_HS"

    invoke-direct {v0, v3, v1, v2, v1}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_HS:Ljavax/jmdns/impl/constants/d;

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const-string v1, "none"

    const/16 v2, 0xfe

    const-string v3, "CLASS_NONE"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_NONE:Ljavax/jmdns/impl/constants/d;

    new-instance v0, Ljavax/jmdns/impl/constants/d;

    const-string v1, "any"

    const/16 v2, 0xff

    const-string v3, "CLASS_ANY"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Ljavax/jmdns/impl/constants/d;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    invoke-static {}, Ljavax/jmdns/impl/constants/d;->$values()[Ljavax/jmdns/impl/constants/d;

    move-result-object v0

    sput-object v0, Ljavax/jmdns/impl/constants/d;->$VALUES:[Ljavax/jmdns/impl/constants/d;

    const-class v0, Ljavax/jmdns/impl/constants/d;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, Ljavax/jmdns/impl/constants/d;->logger:LEj/b;

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

    iput-object p3, p0, Ljavax/jmdns/impl/constants/d;->_externalName:Ljava/lang/String;

    iput p4, p0, Ljavax/jmdns/impl/constants/d;->_index:I

    return-void
.end method

.method public static classForIndex(I)Ljavax/jmdns/impl/constants/d;
    .locals 6

    and-int/lit16 v0, p0, 0x7fff

    invoke-static {}, Ljavax/jmdns/impl/constants/d;->values()[Ljavax/jmdns/impl/constants/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget v5, v4, Ljavax/jmdns/impl/constants/d;->_index:I

    if-ne v5, v0, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Ljavax/jmdns/impl/constants/d;->logger:LEj/b;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "Could not find record class for index: {}"

    invoke-interface {v0, v1, p0}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Ljavax/jmdns/impl/constants/d;->CLASS_UNKNOWN:Ljavax/jmdns/impl/constants/d;

    return-object p0
.end method

.method public static classForName(Ljava/lang/String;)Ljavax/jmdns/impl/constants/d;
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljavax/jmdns/impl/constants/d;->values()[Ljavax/jmdns/impl/constants/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-object v5, v4, Ljavax/jmdns/impl/constants/d;->_externalName:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Ljavax/jmdns/impl/constants/d;->logger:LEj/b;

    const-string v1, "Could not find record class for name: {}"

    invoke-interface {v0, v1, p0}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Ljavax/jmdns/impl/constants/d;->CLASS_UNKNOWN:Ljavax/jmdns/impl/constants/d;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ljavax/jmdns/impl/constants/d;
    .locals 1

    const-class v0, Ljavax/jmdns/impl/constants/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljavax/jmdns/impl/constants/d;

    return-object p0
.end method

.method public static values()[Ljavax/jmdns/impl/constants/d;
    .locals 1

    sget-object v0, Ljavax/jmdns/impl/constants/d;->$VALUES:[Ljavax/jmdns/impl/constants/d;

    invoke-virtual {v0}, [Ljavax/jmdns/impl/constants/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljavax/jmdns/impl/constants/d;

    return-object v0
.end method


# virtual methods
.method public externalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljavax/jmdns/impl/constants/d;->_externalName:Ljava/lang/String;

    return-object v0
.end method

.method public indexValue()I
    .locals 1

    iget v0, p0, Ljavax/jmdns/impl/constants/d;->_index:I

    return v0
.end method

.method public isUnique(I)Z
    .locals 1

    sget-object v0, Ljavax/jmdns/impl/constants/d;->CLASS_UNKNOWN:Ljavax/jmdns/impl/constants/d;

    if-eq p0, v0, :cond_0

    const v0, 0x8000

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
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

    invoke-virtual {p0}, Ljavax/jmdns/impl/constants/d;->indexValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
