.class public final LS8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/e$a;,
        LS8/e$b;
    }
.end annotation


# static fields
.field public static final f:LS8/e$a;


# instance fields
.field private final a:LS8/c;

.field private final b:I

.field private final c:LS8/e$b;

.field private final d:LS8/d;

.field private final e:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LS8/e;->f:LS8/e$a;

    return-void
.end method

.method public constructor <init>(LS8/c;ILS8/e$b;LS8/d;)V
    .locals 1

    const-string/jumbo v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "range"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bandwidth"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/e;->a:LS8/c;

    iput p2, p0, LS8/e;->b:I

    iput-object p3, p0, LS8/e;->c:LS8/e$b;

    iput-object p4, p0, LS8/e;->d:LS8/d;

    new-instance p1, LS8/e$c;

    invoke-direct {p1, p0}, LS8/e$c;-><init>(LS8/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LS8/e;->e:LYg/m;

    return-void
.end method


# virtual methods
.method public final a()LS8/c;
    .locals 1

    iget-object v0, p0, LS8/e;->a:LS8/c;

    return-object v0
.end method

.method public final b()LS8/d;
    .locals 1

    iget-object v0, p0, LS8/e;->d:LS8/d;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, LS8/e;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LS8/e;->b:I

    return v0
.end method

.method public final e()LS8/e$b;
    .locals 1

    iget-object v0, p0, LS8/e;->c:LS8/e$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LS8/e;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LS8/e;->c()I

    move-result v0

    check-cast p1, LS8/e;

    invoke-virtual {p1}, LS8/e;->c()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f(LS8/e;)Z
    .locals 7

    const-string/jumbo v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS8/e;->c:LS8/e$b;

    invoke-virtual {v0}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsh/i;

    iget-object v3, p1, LS8/e;->c:LS8/e$b;

    invoke-virtual {v3}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_2

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsh/i;

    invoke-virtual {v1}, Lsh/g;->i()I

    move-result v5

    invoke-virtual {v4}, Lsh/g;->i()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v1}, Lsh/g;->j()I

    move-result v6

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v5, v4, :cond_3

    const/4 v2, 0x1

    :cond_4
    :goto_1
    return v2
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LS8/e;->c()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, LS8/e;->b:I

    iget-object v1, p0, LS8/e;->a:LS8/c;

    iget-object v2, p0, LS8/e;->c:LS8/e$b;

    invoke-virtual {v2}, LS8/e$b;->a()I

    move-result v2

    iget-object v3, p0, LS8/e;->d:LS8/d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "WiFi Channel "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ["

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "] (center: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bw: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
