.class public final Laf/P;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls9/d;

.field private final b:LDe/g;

.field private final c:LW7/e;

.field private final d:LCi/c;

.field private final e:Laf/O;

.field private final f:Laf/O;

.field private final g:Laf/O;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiBandTabs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Laf/P;->a:Ls9/d;

    .line 3
    iput-object p2, p0, Laf/P;->b:LDe/g;

    .line 4
    iput-object p3, p0, Laf/P;->c:LW7/e;

    .line 5
    iput-object p4, p0, Laf/P;->d:LCi/c;

    .line 6
    iput-object p5, p0, Laf/P;->e:Laf/O;

    .line 7
    iput-object p6, p0, Laf/P;->f:Laf/O;

    .line 8
    iput-object p7, p0, Laf/P;->g:Laf/O;

    return-void
.end method

.method public synthetic constructor <init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_1

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_2

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    .line 9
    invoke-direct/range {v2 .. v9}, Laf/P;-><init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;)V

    return-void
.end method


# virtual methods
.method public final a()LDe/g;
    .locals 1

    iget-object v0, p0, Laf/P;->b:LDe/g;

    return-object v0
.end method

.method public final b()Laf/O;
    .locals 1

    iget-object v0, p0, Laf/P;->e:Laf/O;

    return-object v0
.end method

.method public final c()LW7/e;
    .locals 1

    iget-object v0, p0, Laf/P;->c:LW7/e;

    return-object v0
.end method

.method public final d()Laf/O;
    .locals 1

    iget-object v0, p0, Laf/P;->f:Laf/O;

    return-object v0
.end method

.method public final e()Laf/O;
    .locals 1

    iget-object v0, p0, Laf/P;->g:Laf/O;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Laf/P;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Laf/P;

    iget-object v1, p0, Laf/P;->a:Ls9/d;

    iget-object v3, p1, Laf/P;->a:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Laf/P;->b:LDe/g;

    iget-object v3, p1, Laf/P;->b:LDe/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Laf/P;->c:LW7/e;

    iget-object v3, p1, Laf/P;->c:LW7/e;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Laf/P;->d:LCi/c;

    iget-object v3, p1, Laf/P;->d:LCi/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Laf/P;->e:Laf/O;

    iget-object v3, p1, Laf/P;->e:Laf/O;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Laf/P;->f:Laf/O;

    iget-object v3, p1, Laf/P;->f:Laf/O;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Laf/P;->g:Laf/O;

    iget-object p1, p1, Laf/P;->g:Laf/O;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/P;->a:Ls9/d;

    return-object v0
.end method

.method public final g()LCi/c;
    .locals 1

    iget-object v0, p0, Laf/P;->d:LCi/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Laf/P;->a:Ls9/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/P;->b:LDe/g;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/P;->c:LW7/e;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/P;->d:LCi/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/P;->e:Laf/O;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Laf/O;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/P;->f:Laf/O;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Laf/O;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/P;->g:Laf/O;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Laf/O;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Laf/P;->a:Ls9/d;

    iget-object v1, p0, Laf/P;->b:LDe/g;

    iget-object v2, p0, Laf/P;->c:LW7/e;

    iget-object v3, p0, Laf/P;->d:LCi/c;

    iget-object v4, p0, Laf/P;->e:Laf/O;

    iget-object v5, p0, Laf/P;->f:Laf/O;

    iget-object v6, p0, Laf/P;->g:Laf/O;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Model(title="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", badge="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rating="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wifiBandTabs="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", firstItem="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondItem="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", thirdItem="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
