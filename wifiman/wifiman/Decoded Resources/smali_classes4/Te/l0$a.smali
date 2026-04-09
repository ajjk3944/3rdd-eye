.class public final LTe/l0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTe/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LS8/c;

.field private final b:LS8/l;

.field private final c:LS8/d;

.field private final d:LW7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS8/c;LS8/l;LS8/d;LW7/b;)V
    .locals 1

    const-string v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/l0$a;->a:LS8/c;

    iput-object p2, p0, LTe/l0$a;->b:LS8/l;

    iput-object p3, p0, LTe/l0$a;->c:LS8/d;

    iput-object p4, p0, LTe/l0$a;->d:LW7/b;

    return-void
.end method


# virtual methods
.method public final a()LS8/c;
    .locals 1

    iget-object v0, p0, LTe/l0$a;->a:LS8/c;

    return-object v0
.end method

.method public final b()LS8/d;
    .locals 1

    iget-object v0, p0, LTe/l0$a;->c:LS8/d;

    return-object v0
.end method

.method public final c()LW7/b;
    .locals 1

    iget-object v0, p0, LTe/l0$a;->d:LW7/b;

    return-object v0
.end method

.method public final d()LS8/l;
    .locals 1

    iget-object v0, p0, LTe/l0$a;->b:LS8/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LTe/l0$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LTe/l0$a;

    iget-object v1, p0, LTe/l0$a;->a:LS8/c;

    iget-object v3, p1, LTe/l0$a;->a:LS8/c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LTe/l0$a;->b:LS8/l;

    iget-object v3, p1, LTe/l0$a;->b:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LTe/l0$a;->c:LS8/d;

    iget-object v3, p1, LTe/l0$a;->c:LS8/d;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LTe/l0$a;->d:LW7/b;

    iget-object p1, p1, LTe/l0$a;->d:LW7/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LTe/l0$a;->a:LS8/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/l0$a;->b:LS8/l;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LS8/l;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/l0$a;->c:LS8/d;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/l0$a;->d:LW7/b;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, LW7/b;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LTe/l0$a;->a:LS8/c;

    iget-object v1, p0, LTe/l0$a;->b:LS8/l;

    iget-object v2, p0, LTe/l0$a;->c:LS8/d;

    iget-object v3, p0, LTe/l0$a;->d:LW7/b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Link(band="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signal="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bandwidth="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", phySpeed="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
