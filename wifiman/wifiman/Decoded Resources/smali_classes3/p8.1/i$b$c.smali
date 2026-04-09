.class public final Lp8/i$b$c;
.super Lp8/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LLe/c;

.field private final b:Ljava/util/Collection;

.field private final c:Z

.field private final d:Ljava/util/Comparator;

.field private final e:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LLe/c;Ljava/util/Collection;ZLjava/util/Comparator;Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "results"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sortComparator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "itemFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lp8/i$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lp8/i$b$c;->a:LLe/c;

    iput-object p2, p0, Lp8/i$b$c;->b:Ljava/util/Collection;

    iput-boolean p3, p0, Lp8/i$b$c;->c:Z

    iput-object p4, p0, Lp8/i$b$c;->d:Ljava/util/Comparator;

    iput-object p5, p0, Lp8/i$b$c;->e:Lmh/l;

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lp8/i$b$c;->e:Lmh/l;

    return-object v0
.end method

.method public final b()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lp8/i$b$c;->b:Ljava/util/Collection;

    return-object v0
.end method

.method public final c()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lp8/i$b$c;->d:Ljava/util/Comparator;

    return-object v0
.end method

.method public final d()LLe/c;
    .locals 1

    iget-object v0, p0, Lp8/i$b$c;->a:LLe/c;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lp8/i$b$c;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp8/i$b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp8/i$b$c;

    iget-object v1, p0, Lp8/i$b$c;->a:LLe/c;

    iget-object v3, p1, Lp8/i$b$c;->a:LLe/c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lp8/i$b$c;->b:Ljava/util/Collection;

    iget-object v3, p1, Lp8/i$b$c;->b:Ljava/util/Collection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lp8/i$b$c;->c:Z

    iget-boolean v3, p1, Lp8/i$b$c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lp8/i$b$c;->d:Ljava/util/Comparator;

    iget-object v3, p1, Lp8/i$b$c;->d:Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lp8/i$b$c;->e:Lmh/l;

    iget-object p1, p1, Lp8/i$b$c;->e:Lmh/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lp8/i$b$c;->a:LLe/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lp8/i$b$c;->b:Ljava/util/Collection;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lp8/i$b$c;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lp8/i$b$c;->d:Ljava/util/Comparator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lp8/i$b$c;->e:Lmh/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lp8/i$b$c;->a:LLe/c;

    iget-object v1, p0, Lp8/i$b$c;->b:Ljava/util/Collection;

    iget-boolean v2, p0, Lp8/i$b$c;->c:Z

    iget-object v3, p0, Lp8/i$b$c;->d:Ljava/util/Comparator;

    iget-object v4, p0, Lp8/i$b$c;->e:Lmh/l;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "Results(tab="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", results="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ubiquitiGrouped="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", sortComparator="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", itemFactory="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
