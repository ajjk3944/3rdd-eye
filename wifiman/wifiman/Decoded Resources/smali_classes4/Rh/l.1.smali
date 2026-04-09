.class public final LRh/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LRh/k;

.field private final b:Z


# direct methods
.method public constructor <init>(LRh/k;Z)V
    .locals 1

    const-string v0, "qualifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LRh/l;->a:LRh/k;

    .line 3
    iput-boolean p2, p0, LRh/l;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(LRh/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, LRh/l;-><init>(LRh/k;Z)V

    return-void
.end method

.method public static synthetic b(LRh/l;LRh/k;ZILjava/lang/Object;)LRh/l;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, LRh/l;->a:LRh/k;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, LRh/l;->b:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, LRh/l;->a(LRh/k;Z)LRh/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LRh/k;Z)LRh/l;
    .locals 1

    const-string v0, "qualifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LRh/l;

    invoke-direct {v0, p1, p2}, LRh/l;-><init>(LRh/k;Z)V

    return-object v0
.end method

.method public final c()LRh/k;
    .locals 1

    iget-object v0, p0, LRh/l;->a:LRh/k;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LRh/l;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LRh/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LRh/l;

    iget-object v1, p0, LRh/l;->a:LRh/k;

    iget-object v3, p1, LRh/l;->a:LRh/k;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, LRh/l;->b:Z

    iget-boolean p1, p1, LRh/l;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LRh/l;->a:LRh/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LRh/l;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NullabilityQualifierWithMigrationStatus(qualifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LRh/l;->a:LRh/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isForWarningOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LRh/l;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
