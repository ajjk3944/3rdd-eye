.class final Lc3/c;
.super Lc3/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc3/c$b;
    }
.end annotation


# instance fields
.field private final a:Lc3/p;

.field private final b:Ljava/lang/String;

.field private final c:La3/c;

.field private final d:La3/g;

.field private final e:La3/b;


# direct methods
.method private constructor <init>(Lc3/p;Ljava/lang/String;La3/c;La3/g;La3/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lc3/o;-><init>()V

    .line 3
    iput-object p1, p0, Lc3/c;->a:Lc3/p;

    .line 4
    iput-object p2, p0, Lc3/c;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lc3/c;->c:La3/c;

    .line 6
    iput-object p4, p0, Lc3/c;->d:La3/g;

    .line 7
    iput-object p5, p0, Lc3/c;->e:La3/b;

    return-void
.end method

.method synthetic constructor <init>(Lc3/p;Ljava/lang/String;La3/c;La3/g;La3/b;Lc3/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lc3/c;-><init>(Lc3/p;Ljava/lang/String;La3/c;La3/g;La3/b;)V

    return-void
.end method


# virtual methods
.method public b()La3/b;
    .locals 1

    iget-object v0, p0, Lc3/c;->e:La3/b;

    return-object v0
.end method

.method c()La3/c;
    .locals 1

    iget-object v0, p0, Lc3/c;->c:La3/c;

    return-object v0
.end method

.method e()La3/g;
    .locals 1

    iget-object v0, p0, Lc3/c;->d:La3/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc3/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lc3/o;

    iget-object v1, p0, Lc3/c;->a:Lc3/p;

    invoke-virtual {p1}, Lc3/o;->f()Lc3/p;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc3/c;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lc3/o;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc3/c;->c:La3/c;

    invoke-virtual {p1}, Lc3/o;->c()La3/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc3/c;->d:La3/g;

    invoke-virtual {p1}, Lc3/o;->e()La3/g;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc3/c;->e:La3/b;

    invoke-virtual {p1}, Lc3/o;->b()La3/b;

    move-result-object p1

    invoke-virtual {v1, p1}, La3/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()Lc3/p;
    .locals 1

    iget-object v0, p0, Lc3/c;->a:Lc3/p;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc3/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lc3/c;->a:Lc3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc3/c;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc3/c;->c:La3/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc3/c;->d:La3/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lc3/c;->e:La3/b;

    invoke-virtual {v1}, La3/b;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendRequest{transportContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc3/c;->a:Lc3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc3/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc3/c;->c:La3/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc3/c;->d:La3/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc3/c;->e:La3/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
