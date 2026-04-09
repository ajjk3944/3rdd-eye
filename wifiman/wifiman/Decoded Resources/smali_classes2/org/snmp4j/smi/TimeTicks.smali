.class public Lorg/snmp4j/smi/TimeTicks;
.super Lorg/snmp4j/smi/UnsignedInteger32;
.source "SourceFile"


# static fields
.field private static final FORMAT_FACTORS:[I

.field private static final FORMAT_PATTERN:Ljava/lang/String; = "{0,choice,0#|1#1 day, |1<{0,number,integer} days, }{1,number,integer}:{2,number,00}:{3,number,00}.{4,number,00}"

.field private static final serialVersionUID:J = 0x783bdd054fda72d7L


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x64

    const/4 v1, 0x1

    const v2, 0x83d600

    const v3, 0x57e40

    const/16 v4, 0x1770

    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/TimeTicks;->FORMAT_FACTORS:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>()V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>(J)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/TimeTicks;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>()V

    .line 3
    iget-wide v0, p1, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    return-void
.end method

.method public static synthetic c(I)[Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lorg/snmp4j/smi/TimeTicks;->lambda$setValue$1(I)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lorg/snmp4j/smi/TimeTicks;->lambda$setValue$0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static synthetic lambda$setValue$0(Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static synthetic lambda$setValue$1(I)[Ljava/lang/String;
    .locals 0

    new-array p0, p0, [Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/TimeTicks;

    iget-wide v1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/TimeTicks;-><init>(J)V

    return-object v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeUnsignedInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)J

    move-result-wide v1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result p1

    const/16 v3, 0x43

    if-ne p1, v3, :cond_0

    invoke-virtual {p0, v1, v2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding TimeTicks: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x43

    invoke-super {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lorg/snmp4j/asn1/BER;->encodeUnsignedInteger(Ljava/io/OutputStream;BJ)V

    return-void
.end method

.method public fromMilliseconds(J)V
    .locals 2

    const-wide/16 v0, 0xa

    div-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public getSyntax()I
    .locals 1

    const/16 v0, 0x43

    return v0
.end method

.method public final setValue(Ljava/lang/String;)V
    .locals 8

    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "[days :,.]"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->stream([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lorg/snmp4j/smi/a;

    invoke-direct {v0}, Lorg/snmp4j/smi/a;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lorg/snmp4j/smi/b;

    invoke-direct {v0}, Lorg/snmp4j/smi/b;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    sget-object v0, Lorg/snmp4j/smi/TimeTicks;->FORMAT_FACTORS:[I

    array-length v1, v0

    array-length v2, p1

    sub-int/2addr v1, v2

    array-length v0, v0

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    const-wide/16 v2, 0x0

    :goto_0
    if-ltz v0, :cond_1

    aget-object v4, p1, v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    sget-object v4, Lorg/snmp4j/smi/TimeTicks;->FORMAT_FACTORS:[I

    add-int v5, v0, v1

    aget v4, v4, v5

    int-to-long v4, v4

    aget-object v6, p1, v0

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    mul-long/2addr v6, v4

    add-long/2addr v2, v6

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2, v3}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    :goto_1
    return-void
.end method

.method public toMilliseconds()J
    .locals 4

    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    const-wide/16 v2, 0xa

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "{0,choice,0#|1#1 day, |1<{0,number,integer} days, }{1,number,integer}:{2,number,00}:{3,number,00}.{4,number,00}"

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/TimeTicks;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 2
    invoke-virtual {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v0

    const-wide/32 v2, 0x83d600

    .line 3
    div-long v4, v0, v2

    .line 4
    rem-long/2addr v0, v2

    const-wide/32 v2, 0x57e40

    .line 5
    div-long v6, v0, v2

    .line 6
    rem-long/2addr v0, v2

    const-wide/16 v2, 0x1770

    .line 7
    div-long v8, v0, v2

    .line 8
    rem-long/2addr v0, v2

    const-wide/16 v2, 0x64

    .line 9
    div-long v10, v0, v2

    .line 10
    rem-long/2addr v0, v2

    .line 11
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 12
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 13
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 14
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v2, v3, v4, v5, v0}, [Ljava/lang/Long;

    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
