.class public final Lje/r$b$a$b;
.super Lje/r$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje/r$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lke/c;

.field private final b:Lh9/a;

.field private final c:LS8/a;

.field private final d:LS8/j;

.field private final e:Lje/q;

.field private final f:La8/b;


# direct methods
.method public constructor <init>(Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lje/r$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lje/r$b$a$b;->a:Lke/c;

    iput-object p2, p0, Lje/r$b$a$b;->b:Lh9/a;

    iput-object p3, p0, Lje/r$b$a$b;->c:LS8/a;

    iput-object p4, p0, Lje/r$b$a$b;->d:LS8/j;

    iput-object p5, p0, Lje/r$b$a$b;->e:Lje/q;

    invoke-virtual {p0}, Lje/r$b$a$b;->c()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p2, La8/b;->c:La8/b$a;

    invoke-virtual {p2, p1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lje/r$b$a$b;->f:La8/b;

    return-void
.end method

.method public static synthetic k(Lje/r$b$a$b;Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;ILjava/lang/Object;)Lje/r$b$a$b;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lje/r$b$a$b;->a:Lke/c;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lje/r$b$a$b;->b:Lh9/a;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lje/r$b$a$b;->c:LS8/a;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lje/r$b$a$b;->d:LS8/j;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lje/r$b$a$b;->e:Lje/q;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lje/r$b$a$b;->j(Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;)Lje/r$b$a$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()La8/b;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->f:La8/b;

    return-object v0
.end method

.method public b()LS8/c;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->e:Lje/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lje/q;->c()LS8/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c()Lh9/a;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->b:Lh9/a;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->e:Lje/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lje/q;->f()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e()LS8/a;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->c:LS8/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lje/r$b$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lje/r$b$a$b;

    iget-object v1, p0, Lje/r$b$a$b;->a:Lke/c;

    iget-object v3, p1, Lje/r$b$a$b;->a:Lke/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lje/r$b$a$b;->b:Lh9/a;

    iget-object v3, p1, Lje/r$b$a$b;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lje/r$b$a$b;->c:LS8/a;

    iget-object v3, p1, Lje/r$b$a$b;->c:LS8/a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lje/r$b$a$b;->d:LS8/j;

    iget-object v3, p1, Lje/r$b$a$b;->d:LS8/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lje/r$b$a$b;->e:Lje/q;

    iget-object p1, p1, Lje/r$b$a$b;->e:Lje/q;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public f()LW7/b;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->e:Lje/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lje/q;->g()LW7/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g()LS8/j;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->d:LS8/j;

    return-object v0
.end method

.method public h()LS8/l;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->e:Lje/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lje/q;->h()LS8/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lje/r$b$a$b;->a:Lke/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lje/r$b$a$b;->b:Lh9/a;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lh9/a;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lje/r$b$a$b;->c:LS8/a;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lje/r$b$a$b;->d:LS8/j;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, LS8/j;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lje/r$b$a$b;->e:Lje/q;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lje/q;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public i()Lke/c;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->a:Lke/c;

    return-object v0
.end method

.method public final j(Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;)Lje/r$b$a$b;
    .locals 7

    new-instance v6, Lje/r$b$a$b;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lje/r$b$a$b;-><init>(Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;)V

    return-object v6
.end method

.method public l()LS8/d;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->e:Lje/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lje/q;->d()LS8/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final m()Lje/q;
    .locals 1

    iget-object v0, p0, Lje/r$b$a$b;->e:Lje/q;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lje/r$b$a$b;->a:Lke/c;

    iget-object v1, p0, Lje/r$b$a$b;->b:Lh9/a;

    iget-object v2, p0, Lje/r$b$a$b;->c:LS8/a;

    iget-object v3, p0, Lje/r$b$a$b;->d:LS8/j;

    iget-object v4, p0, Lje/r$b$a$b;->e:Lje/q;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SLO(ssid="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bssid="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ieeeMode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", securityType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", link="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
