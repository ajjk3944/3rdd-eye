.class final LD3/v;
.super LD3/A;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:I

.field private d:B


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LD3/A;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)LD3/A;
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, LD3/v;->b:Z

    iget-byte v0, p0, LD3/v;->d:B

    or-int/2addr p1, v0

    int-to-byte p1, p1

    iput-byte p1, p0, LD3/v;->d:B

    return-object p0
.end method

.method public final b(I)LD3/A;
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, LD3/v;->c:I

    iget-byte p1, p0, LD3/v;->d:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, LD3/v;->d:B

    return-object p0
.end method

.method public final c()LD3/B;
    .locals 5

    iget-byte v0, p0, LD3/v;->d:B

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LD3/v;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LD3/x;

    iget-boolean v2, p0, LD3/v;->b:Z

    iget v3, p0, LD3/v;->c:I

    const/4 v4, 0x0

    invoke-direct {v1, v0, v2, v3, v4}, LD3/x;-><init>(Ljava/lang/String;ZILD3/w;)V

    return-object v1

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LD3/v;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " libraryName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-byte v1, p0, LD3/v;->d:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_3

    const-string v1, " enableFirelog"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v1, p0, LD3/v;->d:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    const-string v1, " firelogEventType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d(Ljava/lang/String;)LD3/A;
    .locals 0

    const-string p1, "common"

    iput-object p1, p0, LD3/v;->a:Ljava/lang/String;

    return-object p0
.end method
