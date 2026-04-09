.class public final LTe/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LTe/N;

.field private final b:LS8/c;

.field private final c:LDe/g;

.field private final d:LS8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LTe/N;LS8/c;LDe/g;LS8/l;)V
    .locals 1

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "band"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/E0;->a:LTe/N;

    iput-object p2, p0, LTe/E0;->b:LS8/c;

    iput-object p3, p0, LTe/E0;->c:LDe/g;

    iput-object p4, p0, LTe/E0;->d:LS8/l;

    return-void
.end method


# virtual methods
.method public final a()LDe/g;
    .locals 1

    iget-object v0, p0, LTe/E0;->c:LDe/g;

    return-object v0
.end method

.method public final b()LS8/c;
    .locals 1

    iget-object v0, p0, LTe/E0;->b:LS8/c;

    return-object v0
.end method

.method public final c()LTe/N;
    .locals 1

    iget-object v0, p0, LTe/E0;->a:LTe/N;

    return-object v0
.end method

.method public final d()LS8/l;
    .locals 1

    iget-object v0, p0, LTe/E0;->d:LS8/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LTe/E0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LTe/E0;

    iget-object v1, p0, LTe/E0;->a:LTe/N;

    iget-object v3, p1, LTe/E0;->a:LTe/N;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LTe/E0;->b:LS8/c;

    iget-object v3, p1, LTe/E0;->b:LS8/c;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LTe/E0;->c:LDe/g;

    iget-object v3, p1, LTe/E0;->c:LDe/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LTe/E0;->d:LS8/l;

    iget-object p1, p1, LTe/E0;->d:LS8/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LTe/E0;->a:LTe/N;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/E0;->b:LS8/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/E0;->c:LDe/g;

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

    iget-object v1, p0, LTe/E0;->d:LS8/l;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LS8/l;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LTe/E0;->a:LTe/N;

    iget-object v1, p0, LTe/E0;->b:LS8/c;

    iget-object v2, p0, LTe/E0;->c:LDe/g;

    iget-object v3, p0, LTe/E0;->d:LS8/l;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Link(color="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", band="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", badge="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signal="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
