.class public final Lpa/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lpa/b;

.field private final b:Lpa/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lpa/b;Lpa/b;)V
    .locals 1

    const-string/jumbo v0, "regular"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bold"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpa/c;->a:Lpa/b;

    .line 3
    iput-object p2, p0, Lpa/c;->b:Lpa/b;

    return-void
.end method

.method public synthetic constructor <init>(Lpa/b;Lpa/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 67

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lpa/b;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lpa/b;-><init>(LL0/U;LL0/U;LL0/U;LL0/U;LL0/U;LL0/U;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p3, 0x2

    if-eqz v1, :cond_1

    .line 5
    new-instance v1, Lpa/b;

    .line 6
    invoke-virtual {v0}, Lpa/b;->e()LL0/U;

    move-result-object v2

    sget-object v34, LQ0/A;->b:LQ0/A$a;

    invoke-virtual/range {v34 .. v34}, LQ0/A$a;->b()LQ0/A;

    move-result-object v7

    const v32, 0xfffffb

    const/16 v33, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v2 .. v33}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v3

    .line 7
    invoke-virtual {v0}, Lpa/b;->d()LL0/U;

    move-result-object v35

    invoke-virtual/range {v34 .. v34}, LQ0/A$a;->b()LQ0/A;

    move-result-object v40

    const v65, 0xfffffb

    const/16 v66, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-static/range {v35 .. v66}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v4

    .line 8
    invoke-virtual {v0}, Lpa/b;->c()LL0/U;

    move-result-object v35

    invoke-virtual/range {v34 .. v34}, LQ0/A$a;->b()LQ0/A;

    move-result-object v40

    invoke-static/range {v35 .. v66}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v5

    .line 9
    invoke-virtual {v0}, Lpa/b;->b()LL0/U;

    move-result-object v35

    invoke-virtual/range {v34 .. v34}, LQ0/A$a;->b()LQ0/A;

    move-result-object v40

    invoke-static/range {v35 .. v66}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v6

    .line 10
    invoke-virtual {v0}, Lpa/b;->a()LL0/U;

    move-result-object v35

    invoke-virtual/range {v34 .. v34}, LQ0/A$a;->b()LQ0/A;

    move-result-object v40

    invoke-static/range {v35 .. v66}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v7

    .line 11
    invoke-virtual {v0}, Lpa/b;->f()LL0/U;

    move-result-object v35

    invoke-virtual/range {v34 .. v34}, LQ0/A$a;->b()LQ0/A;

    move-result-object v40

    invoke-static/range {v35 .. v66}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v8

    move-object v2, v1

    .line 12
    invoke-direct/range {v2 .. v8}, Lpa/b;-><init>(LL0/U;LL0/U;LL0/U;LL0/U;LL0/U;LL0/U;)V

    move-object/from16 v2, p0

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    move-object/from16 v1, p2

    .line 13
    :goto_1
    invoke-direct {v2, v0, v1}, Lpa/c;-><init>(Lpa/b;Lpa/b;)V

    return-void
.end method


# virtual methods
.method public final a()Lpa/b;
    .locals 1

    iget-object v0, p0, Lpa/c;->b:Lpa/b;

    return-object v0
.end method

.method public final b()Lpa/b;
    .locals 1

    iget-object v0, p0, Lpa/c;->a:Lpa/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpa/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpa/c;

    iget-object v1, p0, Lpa/c;->a:Lpa/b;

    iget-object v3, p1, Lpa/c;->a:Lpa/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpa/c;->b:Lpa/b;

    iget-object p1, p1, Lpa/c;->b:Lpa/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpa/c;->a:Lpa/b;

    invoke-virtual {v0}, Lpa/b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpa/c;->b:Lpa/b;

    invoke-virtual {v1}, Lpa/b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lpa/c;->a:Lpa/b;

    iget-object v1, p0, Lpa/c;->b:Lpa/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "UiTypography(regular="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bold="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
