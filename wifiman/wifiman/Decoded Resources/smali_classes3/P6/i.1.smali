.class public LP6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:[I


# direct methods
.method public constructor <init>(IIIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LP6/i;->a:I

    iput p2, p0, LP6/i;->b:I

    iput p3, p0, LP6/i;->c:I

    iput p4, p0, LP6/i;->d:I

    iput p5, p0, LP6/i;->e:I

    iput p6, p0, LP6/i;->f:I

    iput p7, p0, LP6/i;->g:I

    invoke-direct {p0}, LP6/i;->a()[I

    move-result-object p1

    iput-object p1, p0, LP6/i;->h:[I

    return-void
.end method

.method private a()[I
    .locals 7

    iget v0, p0, LP6/i;->a:I

    iget v1, p0, LP6/i;->b:I

    iget v2, p0, LP6/i;->c:I

    iget v3, p0, LP6/i;->d:I

    iget v4, p0, LP6/i;->e:I

    iget v5, p0, LP6/i;->f:I

    iget v6, p0, LP6/i;->g:I

    filled-new-array/range {v0 .. v6}, [I

    move-result-object v0

    return-object v0
.end method

.method private static b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private d(I)Ljava/lang/String;
    .locals 2

    iget v0, p0, LP6/i;->b:I

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "READ"

    return-object p1

    :cond_0
    iget v0, p0, LP6/i;->d:I

    if-ne p1, v0, :cond_1

    const-string/jumbo p1, "WRITE"

    return-object p1

    :cond_1
    iget v0, p0, LP6/i;->c:I

    if-ne p1, v0, :cond_2

    const-string/jumbo p1, "WRITE_NO_RESPONSE"

    return-object p1

    :cond_2
    iget v0, p0, LP6/i;->g:I

    if-ne p1, v0, :cond_3

    const-string/jumbo p1, "SIGNED_WRITE"

    return-object p1

    :cond_3
    iget v0, p0, LP6/i;->f:I

    if-ne p1, v0, :cond_4

    const-string/jumbo p1, "INDICATE"

    return-object p1

    :cond_4
    iget v0, p0, LP6/i;->a:I

    if-ne p1, v0, :cond_5

    const-string p1, "BROADCAST"

    return-object p1

    :cond_5
    iget v0, p0, LP6/i;->e:I

    if-ne p1, v0, :cond_6

    const-string/jumbo p1, "NOTIFY"

    return-object p1

    :cond_6
    if-nez p1, :cond_7

    const-string p1, ""

    return-object p1

    :cond_7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "Unknown property specified (%d)"

    invoke-static {v1, v0}, LI6/q;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "UNKNOWN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " -> check android.bluetooth.BluetoothGattCharacteristic)"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "[ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP6/i;->h:[I

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    invoke-static {p1, v4}, LP6/i;->b(II)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-direct {p0, v4}, LP6/i;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string/jumbo p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
