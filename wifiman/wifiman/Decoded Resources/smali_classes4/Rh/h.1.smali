.class public final LRh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRh/h$a;
    }
.end annotation


# static fields
.field public static final e:LRh/h$a;

.field private static final f:LRh/h;


# instance fields
.field private final a:LRh/k;

.field private final b:LRh/i;

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LRh/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LRh/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LRh/h;->e:LRh/h$a;

    new-instance v0, LRh/h;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LRh/h;-><init>(LRh/k;LRh/i;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LRh/h;->f:LRh/h;

    return-void
.end method

.method public constructor <init>(LRh/k;LRh/i;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LRh/h;->a:LRh/k;

    .line 3
    iput-object p2, p0, LRh/h;->b:LRh/i;

    .line 4
    iput-boolean p3, p0, LRh/h;->c:Z

    .line 5
    iput-boolean p4, p0, LRh/h;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(LRh/k;LRh/i;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LRh/h;-><init>(LRh/k;LRh/i;ZZ)V

    return-void
.end method

.method public static final synthetic a()LRh/h;
    .locals 1

    sget-object v0, LRh/h;->f:LRh/h;

    return-object v0
.end method

.method public static synthetic c(LRh/h;LRh/k;LRh/i;ZZILjava/lang/Object;)LRh/h;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, LRh/h;->a:LRh/k;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, LRh/h;->b:LRh/i;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, LRh/h;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, LRh/h;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LRh/h;->b(LRh/k;LRh/i;ZZ)LRh/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LRh/k;LRh/i;ZZ)LRh/h;
    .locals 1

    new-instance v0, LRh/h;

    invoke-direct {v0, p1, p2, p3, p4}, LRh/h;-><init>(LRh/k;LRh/i;ZZ)V

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LRh/h;->c:Z

    return v0
.end method

.method public final e()LRh/i;
    .locals 1

    iget-object v0, p0, LRh/h;->b:LRh/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LRh/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LRh/h;

    iget-object v1, p0, LRh/h;->a:LRh/k;

    iget-object v3, p1, LRh/h;->a:LRh/k;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LRh/h;->b:LRh/i;

    iget-object v3, p1, LRh/h;->b:LRh/i;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LRh/h;->c:Z

    iget-boolean v3, p1, LRh/h;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LRh/h;->d:Z

    iget-boolean p1, p1, LRh/h;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()LRh/k;
    .locals 1

    iget-object v0, p0, LRh/h;->a:LRh/k;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, LRh/h;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LRh/h;->a:LRh/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LRh/h;->b:LRh/i;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LRh/h;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LRh/h;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JavaTypeQualifiers(nullability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LRh/h;->a:LRh/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mutability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LRh/h;->b:LRh/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", definitelyNotNull="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LRh/h;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isNullabilityQualifierForWarning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LRh/h;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
