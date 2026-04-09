.class public final LW2/b;
.super Lo/a;
.source "SourceFile"


# instance fields
.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo/a;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW2/b;->g:I

    invoke-super {p0}, Lo/V;->clear()V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LW2/b;->g:I

    if-nez v0, :cond_0

    invoke-super {p0}, Lo/V;->hashCode()I

    move-result v0

    iput v0, p0, LW2/b;->g:I

    :cond_0
    iget v0, p0, LW2/b;->g:I

    return v0
.end method

.method public i(Lo/V;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW2/b;->g:I

    invoke-super {p0, p1}, Lo/V;->i(Lo/V;)V

    return-void
.end method

.method public j(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW2/b;->g:I

    invoke-super {p0, p1}, Lo/V;->j(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW2/b;->g:I

    invoke-super {p0, p1, p2}, Lo/V;->k(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW2/b;->g:I

    invoke-super {p0, p1, p2}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
