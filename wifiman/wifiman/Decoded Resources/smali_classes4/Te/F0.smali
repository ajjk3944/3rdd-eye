.class public final LTe/F0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls9/a;

.field private final b:Ls9/d;

.field private final c:Z

.field private final d:LCi/c;

.field private final e:Ls9/d;

.field private final f:LTe/E0;

.field private final g:LTe/E0;

.field private final h:LTe/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LTe/E0;LTe/E0;LTe/E0;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badge"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LTe/F0;->a:Ls9/a;

    .line 3
    iput-object p2, p0, LTe/F0;->b:Ls9/d;

    .line 4
    iput-boolean p3, p0, LTe/F0;->c:Z

    .line 5
    iput-object p4, p0, LTe/F0;->d:LCi/c;

    .line 6
    iput-object p5, p0, LTe/F0;->e:Ls9/d;

    .line 7
    iput-object p6, p0, LTe/F0;->f:LTe/E0;

    .line 8
    iput-object p7, p0, LTe/F0;->g:LTe/E0;

    .line 9
    iput-object p8, p0, LTe/F0;->h:LTe/E0;

    return-void
.end method

.method public synthetic constructor <init>(Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LTe/E0;LTe/E0;LTe/E0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    .line 10
    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v1

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    move-object v3, p0

    move-object v5, p2

    move-object/from16 v8, p5

    .line 11
    invoke-direct/range {v3 .. v11}, LTe/F0;-><init>(Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LTe/E0;LTe/E0;LTe/E0;)V

    return-void
.end method


# virtual methods
.method public final a()LCi/c;
    .locals 1

    iget-object v0, p0, LTe/F0;->d:LCi/c;

    return-object v0
.end method

.method public final b()Ls9/d;
    .locals 1

    iget-object v0, p0, LTe/F0;->e:Ls9/d;

    return-object v0
.end method

.method public final c()Ls9/a;
    .locals 1

    iget-object v0, p0, LTe/F0;->a:Ls9/a;

    return-object v0
.end method

.method public final d()LTe/E0;
    .locals 1

    iget-object v0, p0, LTe/F0;->f:LTe/E0;

    return-object v0
.end method

.method public final e()LTe/E0;
    .locals 1

    iget-object v0, p0, LTe/F0;->g:LTe/E0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LTe/F0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LTe/F0;

    iget-object v1, p0, LTe/F0;->a:Ls9/a;

    iget-object v3, p1, LTe/F0;->a:Ls9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LTe/F0;->b:Ls9/d;

    iget-object v3, p1, LTe/F0;->b:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LTe/F0;->c:Z

    iget-boolean v3, p1, LTe/F0;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LTe/F0;->d:LCi/c;

    iget-object v3, p1, LTe/F0;->d:LCi/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LTe/F0;->e:Ls9/d;

    iget-object v3, p1, LTe/F0;->e:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LTe/F0;->f:LTe/E0;

    iget-object v3, p1, LTe/F0;->f:LTe/E0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LTe/F0;->g:LTe/E0;

    iget-object v3, p1, LTe/F0;->g:LTe/E0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LTe/F0;->h:LTe/E0;

    iget-object p1, p1, LTe/F0;->h:LTe/E0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()LTe/E0;
    .locals 1

    iget-object v0, p0, LTe/F0;->h:LTe/E0;

    return-object v0
.end method

.method public final g()Ls9/d;
    .locals 1

    iget-object v0, p0, LTe/F0;->b:Ls9/d;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, LTe/F0;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LTe/F0;->a:Ls9/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LTe/F0;->b:Ls9/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, LTe/F0;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LTe/F0;->d:LCi/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LTe/F0;->e:Ls9/d;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LTe/F0;->f:LTe/E0;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, LTe/E0;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LTe/F0;->g:LTe/E0;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, LTe/E0;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LTe/F0;->h:LTe/E0;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, LTe/E0;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, LTe/F0;->a:Ls9/a;

    iget-object v1, p0, LTe/F0;->b:Ls9/d;

    iget-boolean v2, p0, LTe/F0;->c:Z

    iget-object v3, p0, LTe/F0;->d:LCi/c;

    iget-object v4, p0, LTe/F0;->e:Ls9/d;

    iget-object v5, p0, LTe/F0;->f:LTe/E0;

    iget-object v6, p0, LTe/F0;->g:LTe/E0;

    iget-object v7, p0, LTe/F0;->h:LTe/E0;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Model(image="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nameHighlighted="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", badge="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bssid="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", link2Ghz="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", link5Ghz="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", link6Ghz="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
