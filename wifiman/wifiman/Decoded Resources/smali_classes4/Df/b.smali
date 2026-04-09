.class public final LDf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ls9/d;

.field private final c:LAf/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ls9/d;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "channels"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "security"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LDf/b;->a:Ljava/util/List;

    iput-object v2, v0, LDf/b;->b:Ls9/d;

    new-instance v3, LAf/r;

    new-instance v4, LAf/q;

    sget-object v5, LPe/a;->a:LPe/a;

    invoke-virtual {v5}, LPe/a;->b()Ls9/b;

    move-result-object v6

    new-instance v7, Ls9/d$b;

    sget v8, Lm8/c;->S4:I

    invoke-direct {v7, v8}, Ls9/d$b;-><init>(I)V

    new-instance v8, Ls9/d$c;

    move-object v9, v1

    check-cast v9, Ljava/lang/Iterable;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const-string v10, ", "

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v4, v6, v7, v8}, LAf/q;-><init>(Ls9/b;Ls9/d;Ls9/d;)V

    new-instance v1, LAf/q;

    invoke-virtual {v5}, LPe/a;->t()Ls9/b;

    move-result-object v5

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->T4:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    invoke-direct {v1, v5, v6, v2}, LAf/q;-><init>(Ls9/b;Ls9/d;Ls9/d;)V

    filled-new-array {v4, v1}, [LAf/q;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, LAf/r;-><init>(Ljava/util/List;)V

    iput-object v3, v0, LDf/b;->c:LAf/r;

    return-void
.end method


# virtual methods
.method public final a()LAf/r;
    .locals 1

    iget-object v0, p0, LDf/b;->c:LAf/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LDf/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LDf/b;

    iget-object v1, p0, LDf/b;->a:Ljava/util/List;

    iget-object v3, p1, LDf/b;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LDf/b;->b:Ls9/d;

    iget-object p1, p1, LDf/b;->b:Ls9/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LDf/b;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LDf/b;->b:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LDf/b;->a:Ljava/util/List;

    iget-object v1, p0, LDf/b;->b:Ls9/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Model(channels="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", security="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
