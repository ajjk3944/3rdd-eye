.class public final Lp4/v;
.super Lp4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp4/v$b;,
        Lp4/v$c;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lp4/v$c;


# direct methods
.method private constructor <init>(ILp4/v$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp4/c;-><init>()V

    .line 3
    iput p1, p0, Lp4/v;->a:I

    .line 4
    iput-object p2, p0, Lp4/v;->b:Lp4/v$c;

    return-void
.end method

.method synthetic constructor <init>(ILp4/v$c;Lp4/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lp4/v;-><init>(ILp4/v$c;)V

    return-void
.end method

.method public static a()Lp4/v$b;
    .locals 2

    new-instance v0, Lp4/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp4/v$b;-><init>(Lp4/v$a;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lp4/v;->a:I

    return v0
.end method

.method public c()Lp4/v$c;
    .locals 1

    iget-object v0, p0, Lp4/v;->b:Lp4/v$c;

    return-object v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lp4/v;->b:Lp4/v$c;

    sget-object v1, Lp4/v$c;->d:Lp4/v$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lp4/v;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lp4/v;

    invoke-virtual {p1}, Lp4/v;->b()I

    move-result v0

    invoke-virtual {p0}, Lp4/v;->b()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lp4/v;->c()Lp4/v$c;

    move-result-object p1

    invoke-virtual {p0}, Lp4/v;->c()Lp4/v$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lp4/v;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lp4/v;->b:Lp4/v$c;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AesGcmSiv Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp4/v;->b:Lp4/v$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp4/v;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
