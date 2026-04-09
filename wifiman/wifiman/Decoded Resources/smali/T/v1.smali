.class final LT/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final a:LT/b1;

.field private final b:I

.field private final c:LT/U;

.field private final d:LT/w1;

.field private final e:I

.field private f:I


# direct methods
.method public constructor <init>(LT/b1;ILT/U;LT/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/v1;->a:LT/b1;

    iput p2, p0, LT/v1;->b:I

    iput-object p4, p0, LT/v1;->d:LT/w1;

    invoke-virtual {p1}, LT/b1;->z()I

    move-result p1

    iput p1, p0, LT/v1;->e:I

    return-void
.end method


# virtual methods
.method public d()Le0/b;
    .locals 7

    iget-object v0, p0, LT/v1;->c:LT/U;

    invoke-virtual {v0}, LT/U;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, LT/v1;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LT/v1;->f:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v1, v0, LT/d;

    if-eqz v1, :cond_1

    new-instance v1, LT/c1;

    iget-object v2, p0, LT/v1;->a:LT/b1;

    check-cast v0, LT/d;

    invoke-virtual {v0}, LT/d;->a()I

    move-result v0

    iget v3, p0, LT/v1;->e:I

    invoke-direct {v1, v2, v0, v3}, LT/c1;-><init>(LT/b1;II)V

    goto :goto_1

    :cond_1
    instance-of v1, v0, LT/U;

    if-eqz v1, :cond_2

    new-instance v1, LT/x1;

    iget-object v2, p0, LT/v1;->a:LT/b1;

    iget v3, p0, LT/v1;->b:I

    check-cast v0, LT/U;

    new-instance v4, LT/Q0;

    iget-object v5, p0, LT/v1;->d:LT/w1;

    iget v6, p0, LT/v1;->f:I

    add-int/lit8 v6, v6, -0x1

    invoke-direct {v4, v5, v6}, LT/Q0;-><init>(LT/w1;I)V

    invoke-direct {v1, v2, v3, v0, v4}, LT/x1;-><init>(LT/b1;ILT/U;LT/w1;)V

    :goto_1
    return-object v1

    :cond_2
    const-string v0, "Unexpected group information structure"

    invoke-static {v0}, LT/o;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 3

    iget-object v0, p0, LT/v1;->c:LT/U;

    invoke-virtual {v0}, LT/U;->b()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v2, p0, LT/v1;->f:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/v1;->d()Le0/b;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
