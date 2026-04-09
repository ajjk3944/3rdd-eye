.class final Lhf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lff/a;

.field private final b:LW7/a;

.field private final c:LW7/a;


# direct methods
.method public constructor <init>(Lff/a;LW7/a;LW7/a;)V
    .locals 1

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedBarMax"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/b;->a:Lff/a;

    iput-object p2, p0, Lhf/b;->b:LW7/a;

    iput-object p3, p0, Lhf/b;->c:LW7/a;

    return-void
.end method


# virtual methods
.method public final a()Lff/a;
    .locals 1

    iget-object v0, p0, Lhf/b;->a:Lff/a;

    return-object v0
.end method

.method public final b()LW7/a;
    .locals 1

    iget-object v0, p0, Lhf/b;->b:LW7/a;

    return-object v0
.end method

.method public final c()LW7/a;
    .locals 1

    iget-object v0, p0, Lhf/b;->c:LW7/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhf/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhf/b;

    iget-object v1, p0, Lhf/b;->a:Lff/a;

    iget-object v3, p1, Lhf/b;->a:Lff/a;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhf/b;->b:LW7/a;

    iget-object v3, p1, Lhf/b;->b:LW7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lhf/b;->c:LW7/a;

    iget-object p1, p1, Lhf/b;->c:LW7/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhf/b;->a:Lff/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhf/b;->b:LW7/a;

    invoke-virtual {v1}, LW7/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhf/b;->c:LW7/a;

    invoke-virtual {v1}, LW7/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lhf/b;->a:Lff/a;

    iget-object v1, p0, Lhf/b;->b:LW7/a;

    iget-object v2, p0, Lhf/b;->c:LW7/a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MeasurementDirectionRow(direction="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", speed="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", speedBarMax="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
