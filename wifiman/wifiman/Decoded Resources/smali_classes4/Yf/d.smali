.class public final LYf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/net/InetAddress;

.field private final b:I


# direct methods
.method private constructor <init>(Ljava/net/InetAddress;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYf/d;->a:Ljava/net/InetAddress;

    iput p2, p0, LYf/d;->b:I

    return-void
.end method

.method public static c(Ljava/lang/String;)LYf/d;
    .locals 4

    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catch_0
    new-instance p0, Lcom/wireguard/config/ParseException;

    const-class v0, Ljava/lang/Integer;

    invoke-direct {p0, v0, v1}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V

    throw p0

    :cond_0
    const-string v1, ""

    const/4 v2, -0x1

    :goto_0
    invoke-static {p0}, LYf/b;->a(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p0

    instance-of v0, p0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x80

    :goto_1
    if-gt v2, v0, :cond_3

    if-ltz v2, :cond_2

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    new-instance v0, LYf/d;

    invoke-direct {v0, p0, v2}, LYf/d;-><init>(Ljava/net/InetAddress;I)V

    return-object v0

    :cond_3
    new-instance p0, Lcom/wireguard/config/ParseException;

    const-class v0, LYf/d;

    const-string v2, "Invalid network mask"

    invoke-direct {p0, v0, v1, v2}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, LYf/d;->a:Ljava/net/InetAddress;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LYf/d;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LYf/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYf/d;

    iget-object v0, p0, LYf/d;->a:Ljava/net/InetAddress;

    iget-object v2, p1, LYf/d;->a:Ljava/net/InetAddress;

    invoke-virtual {v0, v2}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LYf/d;->b:I

    iget p1, p1, LYf/d;->b:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYf/d;->a:Ljava/net/InetAddress;

    invoke-virtual {v0}, Ljava/net/InetAddress;->hashCode()I

    move-result v0

    iget v1, p0, LYf/d;->b:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYf/d;->a:Ljava/net/InetAddress;

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, LYf/d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
