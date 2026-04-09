.class final Landroidx/compose/foundation/relocation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/b;


# instance fields
.field private final a:LV/b;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [Landroidx/compose/foundation/relocation/e;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/compose/foundation/relocation/a;->a:LV/b;

    return-void
.end method


# virtual methods
.method public a(Ll0/i;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Landroidx/compose/foundation/relocation/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/foundation/relocation/a$a;

    iget v1, v0, Landroidx/compose/foundation/relocation/a$a;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/relocation/a$a;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/relocation/a$a;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/relocation/a$a;-><init>(Landroidx/compose/foundation/relocation/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/relocation/a$a;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/relocation/a$a;->g:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Landroidx/compose/foundation/relocation/a$a;->d:I

    iget v2, v0, Landroidx/compose/foundation/relocation/a$a;->c:I

    iget-object v4, v0, Landroidx/compose/foundation/relocation/a$a;->b:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    iget-object v5, v0, Landroidx/compose/foundation/relocation/a$a;->a:Ljava/lang/Object;

    check-cast v5, Ll0/i;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p2, v5

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/foundation/relocation/a;->a:LV/b;

    invoke-virtual {p2}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_5

    invoke-virtual {p2}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p2

    const/4 v4, 0x0

    move-object v6, p2

    move-object p2, p1

    move p1, v4

    move-object v4, v6

    :cond_3
    aget-object v5, v4, p1

    check-cast v5, Landroidx/compose/foundation/relocation/e;

    iput-object p2, v0, Landroidx/compose/foundation/relocation/a$a;->a:Ljava/lang/Object;

    iput-object v4, v0, Landroidx/compose/foundation/relocation/a$a;->b:Ljava/lang/Object;

    iput v2, v0, Landroidx/compose/foundation/relocation/a$a;->c:I

    iput p1, v0, Landroidx/compose/foundation/relocation/a$a;->d:I

    iput v3, v0, Landroidx/compose/foundation/relocation/a$a;->g:I

    invoke-static {v5, p2, v0}, LD/e;->a(LE0/j;Ll0/i;Ldh/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    add-int/2addr p1, v3

    if-lt p1, v2, :cond_3

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final b()LV/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/a;->a:LV/b;

    return-object v0
.end method
