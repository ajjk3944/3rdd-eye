.class public final Lje/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LS8/c;

.field private final b:Lh9/a;

.field private final c:LS8/l;

.field private final d:LW7/b;

.field private final e:Ljava/lang/Integer;

.field private final f:LS8/d;

.field private final g:Lke/a;


# direct methods
.method public constructor <init>(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)V
    .locals 1

    const-string v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje/q;->a:LS8/c;

    iput-object p2, p0, Lje/q;->b:Lh9/a;

    iput-object p3, p0, Lje/q;->c:LS8/l;

    iput-object p4, p0, Lje/q;->d:LW7/b;

    iput-object p5, p0, Lje/q;->e:Ljava/lang/Integer;

    iput-object p6, p0, Lje/q;->f:LS8/d;

    iput-object p7, p0, Lje/q;->g:Lke/a;

    return-void
.end method

.method public static synthetic b(Lje/q;LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;ILjava/lang/Object;)Lje/q;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lje/q;->a:LS8/c;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lje/q;->b:Lh9/a;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lje/q;->c:LS8/l;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lje/q;->d:LW7/b;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lje/q;->e:Ljava/lang/Integer;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lje/q;->f:LS8/d;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lje/q;->g:Lke/a;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lje/q;->a(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)Lje/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)Lje/q;
    .locals 9

    const-string v0, "band"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lje/q;

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lje/q;-><init>(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)V

    return-object v0
.end method

.method public final c()LS8/c;
    .locals 1

    iget-object v0, p0, Lje/q;->a:LS8/c;

    return-object v0
.end method

.method public final d()LS8/d;
    .locals 1

    iget-object v0, p0, Lje/q;->f:LS8/d;

    return-object v0
.end method

.method public final e()Lh9/a;
    .locals 1

    iget-object v0, p0, Lje/q;->b:Lh9/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lje/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lje/q;

    iget-object v1, p0, Lje/q;->a:LS8/c;

    iget-object v3, p1, Lje/q;->a:LS8/c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lje/q;->b:Lh9/a;

    iget-object v3, p1, Lje/q;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lje/q;->c:LS8/l;

    iget-object v3, p1, Lje/q;->c:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lje/q;->d:LW7/b;

    iget-object v3, p1, Lje/q;->d:LW7/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lje/q;->e:Ljava/lang/Integer;

    iget-object v3, p1, Lje/q;->e:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lje/q;->f:LS8/d;

    iget-object v3, p1, Lje/q;->f:LS8/d;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lje/q;->g:Lke/a;

    iget-object p1, p1, Lje/q;->g:Lke/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lje/q;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()LW7/b;
    .locals 1

    iget-object v0, p0, Lje/q;->d:LW7/b;

    return-object v0
.end method

.method public final h()LS8/l;
    .locals 1

    iget-object v0, p0, Lje/q;->c:LS8/l;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lje/q;->a:LS8/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lje/q;->b:Lh9/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lje/q;->c:LS8/l;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LS8/l;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lje/q;->d:LW7/b;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, LW7/b;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lje/q;->e:Ljava/lang/Integer;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lje/q;->f:LS8/d;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lje/q;->g:Lke/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lke/a;
    .locals 1

    iget-object v0, p0, Lje/q;->g:Lke/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lje/q;->a:LS8/c;

    iget-object v1, p0, Lje/q;->b:Lh9/a;

    iget-object v2, p0, Lje/q;->c:LS8/l;

    iget-object v3, p0, Lje/q;->d:LW7/b;

    iget-object v4, p0, Lje/q;->e:Ljava/lang/Integer;

    iget-object v5, p0, Lje/q;->f:LS8/d;

    iget-object v6, p0, Lje/q;->g:Lke/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Link(band="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bssid="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signal="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", phyRate="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bandwidth="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
