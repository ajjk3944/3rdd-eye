.class public final LF4/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF4/A;

.field private final b:I

.field private final c:I


# direct methods
.method private constructor <init>(LF4/A;II)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string/jumbo v0, "Null dependency anInterface."

    invoke-static {p1, v0}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF4/A;

    iput-object p1, p0, LF4/q;->a:LF4/A;

    .line 4
    iput p2, p0, LF4/q;->b:I

    .line 5
    iput p3, p0, LF4/q;->c:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;II)V
    .locals 0

    .line 1
    invoke-static {p1}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, LF4/q;-><init>(LF4/A;II)V

    return-void
.end method

.method public static a(Ljava/lang/Class;)LF4/q;
    .locals 3

    new-instance v0, LF4/q;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2}, LF4/q;-><init>(Ljava/lang/Class;II)V

    return-object v0
.end method

.method private static b(I)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string/jumbo p0, "deferred"

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unsupported injection: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    const-string/jumbo p0, "provider"

    return-object p0

    :cond_2
    const-string/jumbo p0, "direct"

    return-object p0
.end method

.method public static h(Ljava/lang/Class;)LF4/q;
    .locals 3

    new-instance v0, LF4/q;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, LF4/q;-><init>(Ljava/lang/Class;II)V

    return-object v0
.end method

.method public static i(LF4/A;)LF4/q;
    .locals 3

    new-instance v0, LF4/q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LF4/q;-><init>(LF4/A;II)V

    return-object v0
.end method

.method public static j(Ljava/lang/Class;)LF4/q;
    .locals 3

    new-instance v0, LF4/q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LF4/q;-><init>(Ljava/lang/Class;II)V

    return-object v0
.end method

.method public static k(LF4/A;)LF4/q;
    .locals 2

    new-instance v0, LF4/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, v1}, LF4/q;-><init>(LF4/A;II)V

    return-object v0
.end method

.method public static l(Ljava/lang/Class;)LF4/q;
    .locals 2

    new-instance v0, LF4/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, v1}, LF4/q;-><init>(Ljava/lang/Class;II)V

    return-object v0
.end method

.method public static m(Ljava/lang/Class;)LF4/q;
    .locals 3

    new-instance v0, LF4/q;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LF4/q;-><init>(Ljava/lang/Class;II)V

    return-object v0
.end method


# virtual methods
.method public c()LF4/A;
    .locals 1

    iget-object v0, p0, LF4/q;->a:LF4/A;

    return-object v0
.end method

.method public d()Z
    .locals 2

    iget v0, p0, LF4/q;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 1

    iget v0, p0, LF4/q;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LF4/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LF4/q;

    iget-object v0, p0, LF4/q;->a:LF4/A;

    iget-object v2, p1, LF4/q;->a:LF4/A;

    invoke-virtual {v0, v2}, LF4/A;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LF4/q;->b:I

    iget v2, p1, LF4/q;->b:I

    if-ne v0, v2, :cond_0

    iget v0, p0, LF4/q;->c:I

    iget p1, p1, LF4/q;->c:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f()Z
    .locals 2

    iget v0, p0, LF4/q;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public g()Z
    .locals 2

    iget v0, p0, LF4/q;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LF4/q;->a:LF4/A;

    invoke-virtual {v0}, LF4/A;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, LF4/q;->b:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, LF4/q;->c:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dependency{anInterface="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LF4/q;->a:LF4/A;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF4/q;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string/jumbo v1, "required"

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    const-string/jumbo v1, "optional"

    goto :goto_0

    :cond_1
    const-string/jumbo v1, "set"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", injection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF4/q;->c:I

    invoke-static {v1}, LF4/q;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
