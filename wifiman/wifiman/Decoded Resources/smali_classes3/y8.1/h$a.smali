.class final Ly8/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Z

.field private final b:LBc/a$a;

.field private final c:Z

.field private final d:LBc/a$a;


# direct methods
.method public constructor <init>(ZLBc/a$a;ZLBc/a$a;)V
    .locals 1

    const-string/jumbo v0, "sim0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sim1"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ly8/h$a;->a:Z

    iput-object p2, p0, Ly8/h$a;->b:LBc/a$a;

    iput-boolean p3, p0, Ly8/h$a;->c:Z

    iput-object p4, p0, Ly8/h$a;->d:LBc/a$a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ly8/h$a;->a:Z

    return v0
.end method

.method public final b()LBc/a$a;
    .locals 1

    iget-object v0, p0, Ly8/h$a;->b:LBc/a$a;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ly8/h$a;->c:Z

    return v0
.end method

.method public final d()LBc/a$a;
    .locals 1

    iget-object v0, p0, Ly8/h$a;->d:LBc/a$a;

    return-object v0
.end method

.method public final e()LBc/a$a;
    .locals 1

    iget-object v0, p0, Ly8/h$a;->b:LBc/a$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly8/h$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly8/h$a;

    iget-boolean v1, p0, Ly8/h$a;->a:Z

    iget-boolean v3, p1, Ly8/h$a;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly8/h$a;->b:LBc/a$a;

    iget-object v3, p1, Ly8/h$a;->b:LBc/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ly8/h$a;->c:Z

    iget-boolean v3, p1, Ly8/h$a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly8/h$a;->d:LBc/a$a;

    iget-object p1, p1, Ly8/h$a;->d:LBc/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Ly8/h$a;->a:Z

    return v0
.end method

.method public final g()LBc/a$a;
    .locals 1

    iget-object v0, p0, Ly8/h$a;->d:LBc/a$a;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Ly8/h$a;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Ly8/h$a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly8/h$a;->b:LBc/a$a;

    invoke-virtual {v1}, LBc/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ly8/h$a;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly8/h$a;->d:LBc/a$a;

    invoke-virtual {v1}, LBc/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Ly8/h$a;->a:Z

    iget-object v1, p0, Ly8/h$a;->b:LBc/a$a;

    iget-boolean v2, p0, Ly8/h$a;->c:Z

    iget-object v3, p0, Ly8/h$a;->d:LBc/a$a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CellularChartData(sim0primary="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", sim0="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sim1primary="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", sim1="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
