.class public abstract Lo1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lo1/k;->a:[Z

    return-void
.end method

.method static a(Lo1/f;Ln1/d;Lo1/e;)V
    .locals 6

    const/4 v0, -0x1

    iput v0, p2, Lo1/e;->j:I

    iput v0, p2, Lo1/e;->k:I

    iget-object v0, p0, Lo1/e;->M:[Lo1/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Lo1/e$b;->WRAP_CONTENT:Lo1/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Lo1/e;->M:[Lo1/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lo1/e$b;->MATCH_PARENT:Lo1/e$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Lo1/e;->B:Lo1/d;

    iget v0, v0, Lo1/d;->e:I

    invoke-virtual {p0}, Lo1/e;->P()I

    move-result v1

    iget-object v4, p2, Lo1/e;->D:Lo1/d;

    iget v4, v4, Lo1/d;->e:I

    sub-int/2addr v1, v4

    iget-object v4, p2, Lo1/e;->B:Lo1/d;

    invoke-virtual {p1, v4}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v5

    iput-object v5, v4, Lo1/d;->g:Ln1/i;

    iget-object v4, p2, Lo1/e;->D:Lo1/d;

    invoke-virtual {p1, v4}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v5

    iput-object v5, v4, Lo1/d;->g:Ln1/i;

    iget-object v4, p2, Lo1/e;->B:Lo1/d;

    iget-object v4, v4, Lo1/d;->g:Ln1/i;

    invoke-virtual {p1, v4, v0}, Ln1/d;->f(Ln1/i;I)V

    iget-object v4, p2, Lo1/e;->D:Lo1/d;

    iget-object v4, v4, Lo1/d;->g:Ln1/i;

    invoke-virtual {p1, v4, v1}, Ln1/d;->f(Ln1/i;I)V

    iput v3, p2, Lo1/e;->j:I

    invoke-virtual {p2, v0, v1}, Lo1/e;->k0(II)V

    :cond_0
    iget-object v0, p0, Lo1/e;->M:[Lo1/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Lo1/e;->M:[Lo1/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lo1/e$b;->MATCH_PARENT:Lo1/e$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Lo1/e;->C:Lo1/d;

    iget v0, v0, Lo1/d;->e:I

    invoke-virtual {p0}, Lo1/e;->v()I

    move-result p0

    iget-object v1, p2, Lo1/e;->E:Lo1/d;

    iget v1, v1, Lo1/d;->e:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Lo1/e;->C:Lo1/d;

    invoke-virtual {p1, v1}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v2

    iput-object v2, v1, Lo1/d;->g:Ln1/i;

    iget-object v1, p2, Lo1/e;->E:Lo1/d;

    invoke-virtual {p1, v1}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v2

    iput-object v2, v1, Lo1/d;->g:Ln1/i;

    iget-object v1, p2, Lo1/e;->C:Lo1/d;

    iget-object v1, v1, Lo1/d;->g:Ln1/i;

    invoke-virtual {p1, v1, v0}, Ln1/d;->f(Ln1/i;I)V

    iget-object v1, p2, Lo1/e;->E:Lo1/d;

    iget-object v1, v1, Lo1/d;->g:Ln1/i;

    invoke-virtual {p1, v1, p0}, Ln1/d;->f(Ln1/i;I)V

    iget v1, p2, Lo1/e;->Y:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Lo1/e;->O()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Lo1/e;->F:Lo1/d;

    invoke-virtual {p1, v1}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v2

    iput-object v2, v1, Lo1/d;->g:Ln1/i;

    iget-object v1, p2, Lo1/e;->F:Lo1/d;

    iget-object v1, v1, Lo1/d;->g:Ln1/i;

    iget v2, p2, Lo1/e;->Y:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Ln1/d;->f(Ln1/i;I)V

    :cond_2
    iput v3, p2, Lo1/e;->k:I

    invoke-virtual {p2, v0, p0}, Lo1/e;->z0(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
