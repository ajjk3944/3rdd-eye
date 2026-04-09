.class final Lhd/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lje/r;

.field private final b:LBc/a$b;


# direct methods
.method public constructor <init>(Lje/r;LBc/a$b;)V
    .locals 1

    const-string v0, "wifi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cell"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhd/c$a;->a:Lje/r;

    iput-object p2, p0, Lhd/c$a;->b:LBc/a$b;

    return-void
.end method


# virtual methods
.method public final a()Lhd/a$d;
    .locals 2

    iget-object v0, p0, Lhd/c$a;->a:Lje/r;

    instance-of v1, v0, Lje/r$a;

    if-nez v1, :cond_2

    instance-of v1, v0, Lje/r$b$b;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lje/r$b$a;

    if-eqz v1, :cond_1

    new-instance v1, Lhd/a$d$a$b;

    check-cast v0, Lje/r$b$a;

    invoke-direct {v1, v0}, Lhd/a$d$a$b;-><init>(Lje/r$b$a;)V

    goto :goto_2

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lhd/c$a;->b:LBc/a$b;

    instance-of v1, v0, LBc/a$b$a$b;

    if-eqz v1, :cond_3

    new-instance v1, Lhd/a$d$a$a;

    check-cast v0, LBc/a$b$a$b;

    invoke-direct {v1, v0}, Lhd/a$d$a$a;-><init>(LBc/a$b$a$b;)V

    goto :goto_2

    :cond_3
    instance-of v1, v0, LBc/a$b$a$c;

    if-nez v1, :cond_5

    instance-of v1, v0, LBc/a$b$a$a;

    if-nez v1, :cond_5

    instance-of v0, v0, LBc/a$b$b;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    :goto_1
    sget-object v1, Lhd/a$d$b;->a:Lhd/a$d$b;

    :goto_2
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhd/c$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhd/c$a;

    iget-object v1, p0, Lhd/c$a;->a:Lje/r;

    iget-object v3, p1, Lhd/c$a;->a:Lje/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhd/c$a;->b:LBc/a$b;

    iget-object p1, p1, Lhd/c$a;->b:LBc/a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhd/c$a;->a:Lje/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhd/c$a;->b:LBc/a$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lhd/c$a;->a:Lje/r;

    iget-object v1, p0, Lhd/c$a;->b:LBc/a$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CombinedConnectionState(wifi="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cell="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
