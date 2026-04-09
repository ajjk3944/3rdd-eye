.class public final LI/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/f$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/m$a;
    }
.end annotation


# instance fields
.field private a:LV/b;

.field private b:LV/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/m;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v2, v1, [LI/m$a;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, LV/b;-><init>([Ljava/lang/Object;I)V

    .line 3
    iput-object v0, p0, LI/m;->a:LV/b;

    .line 4
    new-instance v0, LV/b;

    new-array v1, v1, [LI/m$a;

    invoke-direct {v0, v1, v3}, LV/b;-><init>([Ljava/lang/Object;I)V

    .line 5
    iput-object v0, p0, LI/m;->b:LV/b;

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p1, LI/m;->a:LV/b;

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_1

    .line 8
    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    .line 9
    :cond_0
    aget-object v1, p1, v3

    check-cast v1, LI/m$a;

    .line 10
    iget-object v2, p0, LI/m;->a:LV/b;

    new-instance v4, LI/m$a;

    invoke-virtual {v1}, LI/m$a;->d()I

    move-result v5

    invoke-virtual {v1}, LI/m$a;->c()I

    move-result v6

    invoke-virtual {v1}, LI/m$a;->b()I

    move-result v7

    invoke-virtual {v1}, LI/m$a;->a()I

    move-result v1

    invoke-direct {v4, v5, v6, v7, v1}, LI/m$a;-><init>(IIII)V

    .line 11
    invoke-virtual {v2, v4}, LV/b;->b(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v0, :cond_0

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(LI/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 12
    :cond_0
    invoke-direct {p0, p1}, LI/m;-><init>(LI/m;)V

    return-void
.end method

.method private final d(LI/m$a;III)V
    .locals 2

    iget-object v0, p0, LI/m;->b:LV/b;

    invoke-virtual {v0}, LV/b;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LI/m;->b:LV/b;

    invoke-virtual {v0}, LV/b;->v()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/m$a;

    invoke-virtual {v0}, LI/m$a;->c()I

    move-result v1

    invoke-virtual {v0}, LI/m$a;->a()I

    move-result v0

    sub-int v0, v1, v0

    :goto_0
    if-nez p1, :cond_1

    sub-int p1, p2, v0

    sub-int v0, p3, p2

    add-int/2addr v0, p1

    new-instance v1, LI/m$a;

    add-int/2addr p3, p4

    invoke-direct {v1, p2, p3, p1, v0}, LI/m$a;-><init>(IIII)V

    move-object p1, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LI/m$a;->d()I

    move-result v0

    if-le v0, p2, :cond_2

    invoke-virtual {p1, p2}, LI/m$a;->h(I)V

    invoke-virtual {p1, p2}, LI/m$a;->f(I)V

    :cond_2
    invoke-virtual {p1}, LI/m$a;->c()I

    move-result p2

    if-le p3, p2, :cond_3

    invoke-virtual {p1}, LI/m$a;->c()I

    move-result p2

    invoke-virtual {p1}, LI/m$a;->a()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p1, p3}, LI/m$a;->g(I)V

    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, LI/m$a;->e(I)V

    :cond_3
    invoke-virtual {p1}, LI/m$a;->c()I

    move-result p2

    add-int/2addr p2, p4

    invoke-virtual {p1, p2}, LI/m$a;->g(I)V

    :goto_1
    iget-object p2, p0, LI/m;->b:LV/b;

    invoke-virtual {p2, p1}, LV/b;->b(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LI/m;->a:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    return v0
.end method

.method public b(I)J
    .locals 2

    iget-object v0, p0, LI/m;->a:LV/b;

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    check-cast p1, LI/m$a;

    invoke-virtual {p1}, LI/m$a;->b()I

    move-result v0

    invoke-virtual {p1}, LI/m$a;->a()I

    move-result p1

    invoke-static {v0, p1}, LL0/T;->b(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(I)J
    .locals 2

    iget-object v0, p0, LI/m;->a:LV/b;

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    check-cast p1, LI/m$a;

    invoke-virtual {p1}, LI/m$a;->d()I

    move-result v0

    invoke-virtual {p1}, LI/m$a;->c()I

    move-result p1

    invoke-static {v0, p1}, LL0/T;->b(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, LI/m;->a:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    return-void
.end method

.method public final f(III)V
    .locals 5

    if-ne p1, p2, :cond_0

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int p2, p1, v0

    sub-int/2addr p3, p2

    const/4 p2, 0x0

    const/4 v1, 0x0

    move-object v2, v1

    move v1, p2

    :goto_0
    iget-object v3, p0, LI/m;->a:LV/b;

    invoke-virtual {v3}, LV/b;->o()I

    move-result v3

    if-ge p2, v3, :cond_6

    iget-object v3, p0, LI/m;->a:LV/b;

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, p2

    check-cast v3, LI/m$a;

    invoke-virtual {v3}, LI/m$a;->d()I

    move-result v4

    if-gt v0, v4, :cond_1

    if-gt v4, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, LI/m$a;->c()I

    move-result v4

    if-gt v0, v4, :cond_3

    if-gt v4, p1, :cond_3

    :goto_1
    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, LI/m$a;->c()I

    move-result v4

    invoke-virtual {v2, v4}, LI/m$a;->g(I)V

    invoke-virtual {v3}, LI/m$a;->a()I

    move-result v3

    invoke-virtual {v2, v3}, LI/m$a;->e(I)V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, LI/m$a;->d()I

    move-result v4

    if-le v4, p1, :cond_4

    if-nez v1, :cond_4

    invoke-direct {p0, v2, v0, p1, p3}, LI/m;->d(LI/m$a;III)V

    const/4 v1, 0x1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v3}, LI/m$a;->d()I

    move-result v4

    add-int/2addr v4, p3

    invoke-virtual {v3, v4}, LI/m$a;->h(I)V

    invoke-virtual {v3}, LI/m$a;->c()I

    move-result v4

    add-int/2addr v4, p3

    invoke-virtual {v3, v4}, LI/m$a;->g(I)V

    :cond_5
    iget-object v4, p0, LI/m;->b:LV/b;

    invoke-virtual {v4, v3}, LV/b;->b(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    if-nez v1, :cond_7

    invoke-direct {p0, v2, v0, p1, p3}, LI/m;->d(LI/m$a;III)V

    :cond_7
    iget-object p1, p0, LI/m;->a:LV/b;

    iget-object p2, p0, LI/m;->b:LV/b;

    iput-object p2, p0, LI/m;->a:LV/b;

    iput-object p1, p0, LI/m;->b:LV/b;

    invoke-virtual {p1}, LV/b;->h()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChangeList(changes=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/m;->a:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LI/m$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x28

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, LI/m$a;->b()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, LI/m$a;->a()I

    move-result v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ")->("

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, LI/m$a;->d()I

    move-result v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, LI/m$a;->c()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x29

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI/m;->a()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_1

    const-string v4, ", "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    const-string v1, "])"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
