.class public final LV8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT8/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV8/e$b$a;,
        LV8/e$b$b;
    }
.end annotation


# instance fields
.field private final a:LZ8/a$a;

.field private final b:LV8/e$b$b;

.field private final c:LV8/e$b$a;

.field private final d:Z

.field private final e:Z


# direct methods
.method public constructor <init>(LZ8/a$a;LV8/e$b$b;LV8/e$b$a;ZZ)V
    .locals 1

    const-string/jumbo v0, "encryption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "mtuRequested"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connectionPriority"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LV8/e$b;->a:LZ8/a$a;

    .line 3
    iput-object p2, p0, LV8/e$b;->b:LV8/e$b$b;

    .line 4
    iput-object p3, p0, LV8/e$b;->c:LV8/e$b$a;

    .line 5
    iput-boolean p4, p0, LV8/e$b;->d:Z

    .line 6
    iput-boolean p5, p0, LV8/e$b;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(LZ8/a$a;LV8/e$b$b;LV8/e$b$a;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    new-instance p1, LZ8/a$a$a;

    const/4 p7, 0x3

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, p7, v0}, LZ8/a$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    .line 8
    new-instance p2, LV8/e$b$b$a;

    sget-object p1, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    invoke-virtual {p1}, Lcom/ui/btle/rxandroidble/a;->a()I

    move-result p1

    invoke-direct {p2, p1}, LV8/e$b$b$a;-><init>(I)V

    :cond_1
    move-object v3, p2

    and-int/lit8 p1, p6, 0x4

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    .line 9
    new-instance p3, LV8/e$b$a$a;

    const-wide/16 v0, 0x3e8

    invoke-direct {p3, p2, v0, v1}, LV8/e$b$a$a;-><init>(IJ)V

    :cond_2
    move-object v4, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move v5, p4

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move v6, p2

    goto :goto_0

    :cond_4
    move v6, p5

    :goto_0
    move-object v1, p0

    .line 10
    invoke-direct/range {v1 .. v6}, LV8/e$b;-><init>(LZ8/a$a;LV8/e$b$b;LV8/e$b$a;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()LV8/e$b$a;
    .locals 1

    iget-object v0, p0, LV8/e$b;->c:LV8/e$b$a;

    return-object v0
.end method

.method public b()LZ8/a$a;
    .locals 1

    iget-object v0, p0, LV8/e$b;->a:LZ8/a$a;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LV8/e$b;->d:Z

    return v0
.end method

.method public final d()LV8/e$b$b;
    .locals 1

    iget-object v0, p0, LV8/e$b;->b:LV8/e$b$b;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LV8/e$b;->e:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LV8/e$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LV8/e$b;

    iget-object v1, p0, LV8/e$b;->a:LZ8/a$a;

    iget-object v3, p1, LV8/e$b;->a:LZ8/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LV8/e$b;->b:LV8/e$b$b;

    iget-object v3, p1, LV8/e$b;->b:LV8/e$b$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LV8/e$b;->c:LV8/e$b$a;

    iget-object v3, p1, LV8/e$b;->c:LV8/e$b$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LV8/e$b;->d:Z

    iget-boolean v3, p1, LV8/e$b;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, LV8/e$b;->e:Z

    iget-boolean p1, p1, LV8/e$b;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LV8/e$b;->a:LZ8/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LV8/e$b;->b:LV8/e$b$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LV8/e$b;->c:LV8/e$b$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LV8/e$b;->d:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LV8/e$b;->e:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LV8/e$b;->a:LZ8/a$a;

    iget-object v1, p0, LV8/e$b;->b:LV8/e$b$b;

    iget-object v2, p0, LV8/e$b;->c:LV8/e$b$a;

    iget-boolean v3, p0, LV8/e$b;->d:Z

    iget-boolean v4, p0, LV8/e$b;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "Params(encryption="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mtuRequested="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connectionPriority="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", longWriteSupported="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", writeFragmentationSupported="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
