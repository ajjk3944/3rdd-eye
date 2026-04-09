.class public final Lli/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lli/n;

.field private final b:LWh/c;

.field private final c:LBh/m;

.field private final d:LWh/g;

.field private final e:LWh/h;

.field private final f:LWh/a;

.field private final g:Lni/s;

.field private final h:Lli/X;

.field private final i:Lli/K;


# direct methods
.method public constructor <init>(Lli/n;LWh/c;LBh/m;LWh/g;LWh/h;LWh/a;Lni/s;Lli/X;Ljava/util/List;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameters"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/p;->a:Lli/n;

    iput-object p2, p0, Lli/p;->b:LWh/c;

    iput-object p3, p0, Lli/p;->c:LBh/m;

    iput-object p4, p0, Lli/p;->d:LWh/g;

    iput-object p5, p0, Lli/p;->e:LWh/h;

    iput-object p6, p0, Lli/p;->f:LWh/a;

    iput-object p7, p0, Lli/p;->g:Lni/s;

    new-instance v0, Lli/X;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Deserializer for \""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, LBh/I;->getName()LZh/f;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    if-eqz p7, :cond_1

    invoke-interface {p7}, Lni/s;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object p6, p1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "[container not found]"

    goto :goto_0

    :goto_2
    move-object p1, v0

    move-object p2, p0

    move-object p3, p8

    move-object p4, p9

    invoke-direct/range {p1 .. p6}, Lli/X;-><init>(Lli/p;Lli/X;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lli/p;->h:Lli/X;

    new-instance p1, Lli/K;

    invoke-direct {p1, p0}, Lli/K;-><init>(Lli/p;)V

    iput-object p1, p0, Lli/p;->i:Lli/K;

    return-void
.end method

.method public static synthetic b(Lli/p;LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;ILjava/lang/Object;)Lli/p;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    iget-object p3, p0, Lli/p;->b:LWh/c;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    iget-object p4, p0, Lli/p;->d:LWh/g;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    iget-object p5, p0, Lli/p;->e:LWh/h;

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    iget-object p6, p0, Lli/p;->f:LWh/a;

    :cond_3
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lli/p;->a(LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;)Lli/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;)Lli/p;
    .locals 12

    move-object v0, p0

    const-string v1, "descriptor"

    move-object v5, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "typeParameterProtos"

    move-object v11, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "nameResolver"

    move-object v4, p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "typeTable"

    move-object/from16 v6, p4

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "versionRequirementTable"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "metadataVersion"

    move-object/from16 v8, p6

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lli/p;

    iget-object v3, v0, Lli/p;->a:Lli/n;

    invoke-static/range {p6 .. p6}, LWh/i;->b(LWh/a;)Z

    move-result v7

    if-eqz v7, :cond_0

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    iget-object v2, v0, Lli/p;->e:LWh/h;

    goto :goto_0

    :goto_1
    iget-object v9, v0, Lli/p;->g:Lni/s;

    iget-object v10, v0, Lli/p;->h:Lli/X;

    move-object v2, v1

    move-object v4, p3

    move-object v5, p1

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move-object v11, p2

    invoke-direct/range {v2 .. v11}, Lli/p;-><init>(Lli/n;LWh/c;LBh/m;LWh/g;LWh/h;LWh/a;Lni/s;Lli/X;Ljava/util/List;)V

    return-object v1
.end method

.method public final c()Lli/n;
    .locals 1

    iget-object v0, p0, Lli/p;->a:Lli/n;

    return-object v0
.end method

.method public final d()Lni/s;
    .locals 1

    iget-object v0, p0, Lli/p;->g:Lni/s;

    return-object v0
.end method

.method public final e()LBh/m;
    .locals 1

    iget-object v0, p0, Lli/p;->c:LBh/m;

    return-object v0
.end method

.method public final f()Lli/K;
    .locals 1

    iget-object v0, p0, Lli/p;->i:Lli/K;

    return-object v0
.end method

.method public final g()LWh/c;
    .locals 1

    iget-object v0, p0, Lli/p;->b:LWh/c;

    return-object v0
.end method

.method public final h()Loi/n;
    .locals 1

    iget-object v0, p0, Lli/p;->a:Lli/n;

    invoke-virtual {v0}, Lli/n;->u()Loi/n;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lli/X;
    .locals 1

    iget-object v0, p0, Lli/p;->h:Lli/X;

    return-object v0
.end method

.method public final j()LWh/g;
    .locals 1

    iget-object v0, p0, Lli/p;->d:LWh/g;

    return-object v0
.end method

.method public final k()LWh/h;
    .locals 1

    iget-object v0, p0, Lli/p;->e:LWh/h;

    return-object v0
.end method
