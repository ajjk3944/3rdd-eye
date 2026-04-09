.class final LE8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lrd/b$a;

.field private final b:LCc/a;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Linet/ipaddr/g;

.field private final g:LS8/g;


# direct methods
.method public constructor <init>(Lrd/b$a;LCc/a;)V
    .locals 1

    const-string/jumbo v0, "a2aEndpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/f$a;->a:Lrd/b$a;

    iput-object p2, p0, LE8/f$a;->b:LCc/a;

    invoke-virtual {p1}, Lrd/b$a;->b()Linet/ipaddr/g;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LE8/f$a;->c:Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-interface {p2}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lrd/b$a;->d()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iput-object v0, p0, LE8/f$a;->d:Ljava/lang/String;

    if-eqz p2, :cond_2

    invoke-interface {p2}, LCc/a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {p1}, Lrd/b$a;->c()Ljava/lang/String;

    move-result-object v0

    :cond_3
    iput-object v0, p0, LE8/f$a;->e:Ljava/lang/String;

    invoke-virtual {p1}, Lrd/b$a;->b()Linet/ipaddr/g;

    move-result-object v0

    iput-object v0, p0, LE8/f$a;->f:Linet/ipaddr/g;

    if-eqz p2, :cond_4

    invoke-interface {p2}, LCc/a;->j()LDc/j;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LDc/j;->N()LS8/g;

    move-result-object p2

    if-nez p2, :cond_5

    :cond_4
    invoke-virtual {p1}, Lrd/b$a;->g()LS8/g;

    move-result-object p2

    :cond_5
    iput-object p2, p0, LE8/f$a;->g:LS8/g;

    return-void
.end method


# virtual methods
.method public final a()Lrd/b$a;
    .locals 1

    iget-object v0, p0, LE8/f$a;->a:Lrd/b$a;

    return-object v0
.end method

.method public final b()LCc/a;
    .locals 1

    iget-object v0, p0, LE8/f$a;->b:LCc/a;

    return-object v0
.end method

.method public final c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LE8/f$a;->f:Linet/ipaddr/g;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE8/f$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE8/f$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LE8/f$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LE8/f$a;

    iget-object v1, p0, LE8/f$a;->a:Lrd/b$a;

    iget-object v3, p1, LE8/f$a;->a:Lrd/b$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LE8/f$a;->b:LCc/a;

    iget-object p1, p1, LE8/f$a;->b:LCc/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE8/f$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final g()LS8/g;
    .locals 1

    iget-object v0, p0, LE8/f$a;->g:LS8/g;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LE8/f$a;->a:Lrd/b$a;

    invoke-virtual {v0}, Lrd/b$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LE8/f$a;->b:LCc/a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LE8/f$a;->a:Lrd/b$a;

    iget-object v1, p0, LE8/f$a;->b:LCc/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "SpeedtestEnpoint(a2aEndpoint="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", device="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
