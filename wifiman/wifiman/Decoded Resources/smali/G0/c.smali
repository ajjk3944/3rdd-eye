.class public final LG0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lmh/a;

.field private b:Ll0/i;

.field private c:Lmh/a;

.field private d:Lmh/a;

.field private e:Lmh/a;

.field private f:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LG0/c;->a:Lmh/a;

    .line 3
    iput-object p2, p0, LG0/c;->b:Ll0/i;

    .line 4
    iput-object p3, p0, LG0/c;->c:Lmh/a;

    .line 5
    iput-object p4, p0, LG0/c;->d:Lmh/a;

    .line 6
    iput-object p5, p0, LG0/c;->e:Lmh/a;

    .line 7
    iput-object p6, p0, LG0/c;->f:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/a;Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 5

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p8, v0

    goto :goto_0

    :cond_0
    move-object p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    .line 8
    sget-object p1, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p1}, Ll0/i$a;->a()Ll0/i;

    move-result-object p2

    :cond_1
    move-object v1, p2

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v2, v0

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move-object v3, v0

    goto :goto_2

    :cond_3
    move-object v3, p4

    :goto_2
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move-object v4, v0

    goto :goto_3

    :cond_4
    move-object v4, p5

    :goto_3
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move-object p7, v0

    goto :goto_4

    :cond_5
    move-object p7, p6

    :goto_4
    move-object p1, p0

    move-object p2, p8

    move-object p3, v1

    move-object p4, v2

    move-object p5, v3

    move-object p6, v4

    .line 9
    invoke-direct/range {p1 .. p7}, LG0/c;-><init>(Lmh/a;Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V

    return-void
.end method

.method private final b(Landroid/view/Menu;LG0/b;Lmh/a;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p2}, LG0/b;->getId()I

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LG0/c;->a(Landroid/view/Menu;LG0/b;)V

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    invoke-virtual {p2}, LG0/b;->getId()I

    move-result p3

    invoke-interface {p1, p3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, LG0/b;->getId()I

    move-result p2

    invoke-interface {p1, p2}, Landroid/view/Menu;->removeItem(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Menu;LG0/b;)V
    .locals 3

    invoke-virtual {p2}, LG0/b;->getId()I

    move-result v0

    invoke-virtual {p2}, LG0/b;->getOrder()I

    move-result v1

    invoke-virtual {p2}, LG0/b;->getTitleResource()I

    move-result p2

    const/4 v2, 0x0

    invoke-interface {p1, v2, v0, v1, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    return-void
.end method

.method public final c()Ll0/i;
    .locals 1

    iget-object v0, p0, LG0/c;->b:Ll0/i;

    return-object v0
.end method

.method public final d(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 1

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    sget-object v0, LG0/b;->Copy:LG0/b;

    invoke-virtual {v0}, LG0/b;->getId()I

    move-result v0

    if-ne p2, v0, :cond_0

    iget-object p2, p0, LG0/c;->c:Lmh/a;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object v0, LG0/b;->Paste:LG0/b;

    invoke-virtual {v0}, LG0/b;->getId()I

    move-result v0

    if-ne p2, v0, :cond_1

    iget-object p2, p0, LG0/c;->d:Lmh/a;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v0, LG0/b;->Cut:LG0/b;

    invoke-virtual {v0}, LG0/b;->getId()I

    move-result v0

    if-ne p2, v0, :cond_2

    iget-object p2, p0, LG0/c;->e:Lmh/a;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object v0, LG0/b;->SelectAll:LG0/b;

    invoke-virtual {v0}, LG0/b;->getId()I

    move-result v0

    if-ne p2, v0, :cond_5

    iget-object p2, p0, LG0/c;->f:Lmh/a;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public final e(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    if-eqz p2, :cond_5

    if-eqz p1, :cond_4

    iget-object p1, p0, LG0/c;->c:Lmh/a;

    if-eqz p1, :cond_0

    sget-object p1, LG0/b;->Copy:LG0/b;

    invoke-virtual {p0, p2, p1}, LG0/c;->a(Landroid/view/Menu;LG0/b;)V

    :cond_0
    iget-object p1, p0, LG0/c;->d:Lmh/a;

    if-eqz p1, :cond_1

    sget-object p1, LG0/b;->Paste:LG0/b;

    invoke-virtual {p0, p2, p1}, LG0/c;->a(Landroid/view/Menu;LG0/b;)V

    :cond_1
    iget-object p1, p0, LG0/c;->e:Lmh/a;

    if-eqz p1, :cond_2

    sget-object p1, LG0/b;->Cut:LG0/b;

    invoke-virtual {p0, p2, p1}, LG0/c;->a(Landroid/view/Menu;LG0/b;)V

    :cond_2
    iget-object p1, p0, LG0/c;->f:Lmh/a;

    if-eqz p1, :cond_3

    sget-object p1, LG0/b;->SelectAll:LG0/b;

    invoke-virtual {p0, p2, p1}, LG0/c;->a(Landroid/view/Menu;LG0/b;)V

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "onCreateActionMode requires a non-null mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "onCreateActionMode requires a non-null menu"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, LG0/c;->a:Lmh/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final g(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, LG0/c;->m(Landroid/view/Menu;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LG0/c;->c:Lmh/a;

    return-void
.end method

.method public final i(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LG0/c;->e:Lmh/a;

    return-void
.end method

.method public final j(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LG0/c;->d:Lmh/a;

    return-void
.end method

.method public final k(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LG0/c;->f:Lmh/a;

    return-void
.end method

.method public final l(Ll0/i;)V
    .locals 0

    iput-object p1, p0, LG0/c;->b:Ll0/i;

    return-void
.end method

.method public final m(Landroid/view/Menu;)V
    .locals 2

    sget-object v0, LG0/b;->Copy:LG0/b;

    iget-object v1, p0, LG0/c;->c:Lmh/a;

    invoke-direct {p0, p1, v0, v1}, LG0/c;->b(Landroid/view/Menu;LG0/b;Lmh/a;)V

    sget-object v0, LG0/b;->Paste:LG0/b;

    iget-object v1, p0, LG0/c;->d:Lmh/a;

    invoke-direct {p0, p1, v0, v1}, LG0/c;->b(Landroid/view/Menu;LG0/b;Lmh/a;)V

    sget-object v0, LG0/b;->Cut:LG0/b;

    iget-object v1, p0, LG0/c;->e:Lmh/a;

    invoke-direct {p0, p1, v0, v1}, LG0/c;->b(Landroid/view/Menu;LG0/b;Lmh/a;)V

    sget-object v0, LG0/b;->SelectAll:LG0/b;

    iget-object v1, p0, LG0/c;->f:Lmh/a;

    invoke-direct {p0, p1, v0, v1}, LG0/c;->b(Landroid/view/Menu;LG0/b;Lmh/a;)V

    return-void
.end method
