.class public final Lw4/l;
.super Lw4/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/l$b;,
        Lw4/l$c;,
        Lw4/l$d;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lw4/l$d;

.field private final d:Lw4/l$c;


# direct methods
.method private constructor <init>(IILw4/l$d;Lw4/l$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lw4/q;-><init>()V

    .line 3
    iput p1, p0, Lw4/l;->a:I

    .line 4
    iput p2, p0, Lw4/l;->b:I

    .line 5
    iput-object p3, p0, Lw4/l;->c:Lw4/l$d;

    .line 6
    iput-object p4, p0, Lw4/l;->d:Lw4/l$c;

    return-void
.end method

.method synthetic constructor <init>(IILw4/l$d;Lw4/l$c;Lw4/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lw4/l;-><init>(IILw4/l$d;Lw4/l$c;)V

    return-void
.end method

.method public static a()Lw4/l$b;
    .locals 2

    new-instance v0, Lw4/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw4/l$b;-><init>(Lw4/l$a;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lw4/l;->b:I

    return v0
.end method

.method public c()Lw4/l$c;
    .locals 1

    iget-object v0, p0, Lw4/l;->d:Lw4/l$c;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lw4/l;->a:I

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Lw4/l;->c:Lw4/l$d;

    sget-object v1, Lw4/l$d;->e:Lw4/l$d;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lw4/l;->b()I

    move-result v0

    return v0

    :cond_0
    sget-object v1, Lw4/l$d;->b:Lw4/l$d;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lw4/l;->b()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lw4/l$d;->c:Lw4/l$d;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lw4/l;->b()I

    move-result v0

    goto :goto_0

    :cond_2
    sget-object v1, Lw4/l$d;->d:Lw4/l$d;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lw4/l;->b()I

    move-result v0

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lw4/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lw4/l;

    invoke-virtual {p1}, Lw4/l;->d()I

    move-result v0

    invoke-virtual {p0}, Lw4/l;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lw4/l;->e()I

    move-result v0

    invoke-virtual {p0}, Lw4/l;->e()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lw4/l;->f()Lw4/l$d;

    move-result-object v0

    invoke-virtual {p0}, Lw4/l;->f()Lw4/l$d;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lw4/l;->c()Lw4/l$c;

    move-result-object p1

    invoke-virtual {p0}, Lw4/l;->c()Lw4/l$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Lw4/l$d;
    .locals 1

    iget-object v0, p0, Lw4/l;->c:Lw4/l$d;

    return-object v0
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Lw4/l;->c:Lw4/l$d;

    sget-object v1, Lw4/l$d;->e:Lw4/l$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lw4/l;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lw4/l;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lw4/l;->c:Lw4/l$d;

    iget-object v3, p0, Lw4/l;->d:Lw4/l$c;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "HMAC Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw4/l;->c:Lw4/l$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw4/l;->d:Lw4/l$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lw4/l;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lw4/l;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
