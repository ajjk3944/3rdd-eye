.class Ljcifs/smb1/smb1/E;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# static fields
.field private static final N:Z

.field private static X:[B


# instance fields
.field private E:Ljcifs/smb1/smb1/P;

.field private F:Z

.field private G:Ljava/lang/String;

.field private H:[B

.field private I:I

.field J:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "jcifs.smb1.smb.client.disablePlainTextPasswords"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ljcifs/smb1/smb1/E;->N:Z

    const/4 v0, 0x0

    const/16 v1, 0x9

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    sput-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const-string v1, "jcifs.smb1.smb.client.TreeConnectAndX.CheckDirectory"

    invoke-static {v1}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Ljcifs/smb1/smb1/E;->X:[B

    invoke-static {v1}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v1

    aput-byte v1, v2, v0

    :cond_0
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.CreateDirectory"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v2, 0x2

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_1
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.Delete"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v2, 0x3

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_2
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.DeleteDirectory"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v2, 0x4

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_3
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.OpenAndX"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v2, 0x5

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_4
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.Rename"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v2, 0x6

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_5
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.Transaction"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v2, 0x7

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_6
    const-string v0, "jcifs.smb1.smb.client.TreeConnectAndX.QueryInformation"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v1, Ljcifs/smb1/smb1/E;->X:[B

    const/16 v2, 0x8

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    aput-byte v0, v1, v2

    :cond_7
    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x0t
    .end array-data
.end method

.method constructor <init>(Ljcifs/smb1/smb1/P;Ljava/lang/String;Ljava/lang/String;Ljcifs/smb1/smb1/l;)V
    .locals 0

    invoke-direct {p0, p4}, Ljcifs/smb1/smb1/b;-><init>(Ljcifs/smb1/smb1/l;)V

    const/4 p4, 0x0

    iput-boolean p4, p0, Ljcifs/smb1/smb1/E;->F:Z

    iput-object p1, p0, Ljcifs/smb1/smb1/E;->E:Ljcifs/smb1/smb1/P;

    iput-object p2, p0, Ljcifs/smb1/smb1/E;->J:Ljava/lang/String;

    iput-object p3, p0, Ljcifs/smb1/smb1/E;->G:Ljava/lang/String;

    const/16 p1, 0x75

    iput-byte p1, p0, Ljcifs/smb1/smb1/l;->c:B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 5

    iget-object v0, p0, Ljcifs/smb1/smb1/E;->E:Ljcifs/smb1/smb1/P;

    iget-object v1, v0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v1, v1, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v1, v1, Ljcifs/smb1/smb1/Q$a;->g:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-boolean v1, v0, Ljcifs/smb1/smb1/k;->f:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Ljcifs/smb1/smb1/k;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/E;->E:Ljcifs/smb1/smb1/P;

    iget-object v1, v0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v1, v1, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget-boolean v4, v1, Ljcifs/smb1/smb1/Q$a;->h:Z

    if-eqz v4, :cond_1

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v1, v1, Ljcifs/smb1/smb1/Q$a;->p:[B

    invoke-virtual {v0, v1}, Ljcifs/smb1/smb1/k;->d([B)[B

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/E;->H:[B

    array-length v0, v0

    iput v0, p0, Ljcifs/smb1/smb1/E;->I:I

    goto :goto_0

    :cond_1
    sget-boolean v1, Ljcifs/smb1/smb1/E;->N:Z

    if-nez v1, :cond_2

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v0, v0, Ljcifs/smb1/smb1/k;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Ljcifs/smb1/smb1/E;->H:[B

    iget-object v1, p0, Ljcifs/smb1/smb1/E;->E:Ljcifs/smb1/smb1/P;

    iget-object v1, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v1, v1, Ljcifs/smb1/smb1/k;->c:Ljava/lang/String;

    invoke-virtual {p0, v1, v0, v2}, Ljcifs/smb1/smb1/l;->B(Ljava/lang/String;[BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/E;->I:I

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Plain text passwords are disabled"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iput v3, p0, Ljcifs/smb1/smb1/E;->I:I

    :goto_0
    add-int/lit8 v0, p2, 0x1

    iget-boolean v1, p0, Ljcifs/smb1/smb1/E;->F:Z

    aput-byte v1, p1, p2

    add-int/lit8 p2, p2, 0x2

    aput-byte v2, p1, v0

    iget v0, p0, Ljcifs/smb1/smb1/E;->I:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    const/4 p1, 0x4

    return p1
.end method

.method E(B)I
    .locals 3

    and-int/lit16 p1, p1, 0xff

    if-eqz p1, :cond_7

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v0, 0x6

    if-eq p1, v0, :cond_5

    const/4 v1, 0x7

    if-eq p1, v1, :cond_4

    const/16 v0, 0x8

    if-eq p1, v0, :cond_3

    const/16 v0, 0x10

    const/4 v2, 0x0

    if-eq p1, v0, :cond_2

    const/16 v0, 0x25

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2d

    if-eq p1, v0, :cond_0

    return v2

    :cond_0
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v0, 0x5

    aget-byte p1, p1, v0

    return p1

    :cond_1
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    aget-byte p1, p1, v1

    return p1

    :cond_2
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    aget-byte p1, p1, v2

    return p1

    :cond_3
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    aget-byte p1, p1, v0

    return p1

    :cond_4
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    aget-byte p1, p1, v0

    return p1

    :cond_5
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v0, 0x3

    aget-byte p1, p1, v0

    return p1

    :cond_6
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v0, 0x4

    aget-byte p1, p1, v0

    return p1

    :cond_7
    sget-object p1, Ljcifs/smb1/smb1/E;->X:[B

    const/4 v0, 0x2

    aget-byte p1, p1, v0

    return p1
.end method

.method h([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method m([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComTreeConnectAndX["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",disconnectTid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ljcifs/smb1/smb1/E;->F:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",passwordLength="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/E;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",password="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/E;->H:[B

    iget v3, p0, Ljcifs/smb1/smb1/E;->I:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, LUg/d;->d([BII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",path="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/E;->J:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",service="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/E;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method v([BI)I
    .locals 4

    iget-object v0, p0, Ljcifs/smb1/smb1/E;->E:Ljcifs/smb1/smb1/P;

    iget-object v1, v0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v1, v1, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v1, v1, Ljcifs/smb1/smb1/Q$a;->g:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-boolean v1, v0, Ljcifs/smb1/smb1/k;->f:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Ljcifs/smb1/smb1/k;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/E;->H:[B

    iget v1, p0, Ljcifs/smb1/smb1/E;->I:I

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Ljcifs/smb1/smb1/E;->I:I

    add-int/2addr v0, p2

    goto :goto_0

    :cond_1
    add-int/lit8 v0, p2, 0x1

    aput-byte v2, p1, p2

    :goto_0
    iget-object v1, p0, Ljcifs/smb1/smb1/E;->J:Ljava/lang/String;

    invoke-virtual {p0, v1, p1, v0}, Ljcifs/smb1/smb1/l;->B(Ljava/lang/String;[BI)I

    move-result v1

    add-int/2addr v0, v1

    :try_start_0
    iget-object v1, p0, Ljcifs/smb1/smb1/E;->G:Ljava/lang/String;

    const-string v3, "ASCII"

    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    iget-object v3, p0, Ljcifs/smb1/smb1/E;->G:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Ljcifs/smb1/smb1/E;->G:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0x1

    aput-byte v2, p1, v0

    sub-int/2addr v1, p2

    return v1

    :catch_0
    return v2
.end method
