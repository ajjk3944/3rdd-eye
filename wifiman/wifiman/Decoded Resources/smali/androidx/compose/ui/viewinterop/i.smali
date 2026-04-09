.class public final Landroidx/compose/ui/viewinterop/i;
.super Landroidx/compose/ui/viewinterop/c;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/B1;


# instance fields
.field private final A:Landroid/view/View;

.field private final B:Lx0/b;

.field private final C:Lc0/h;

.field private final D:I

.field private final E:Ljava/lang/String;

.field private F:Lc0/h$a;

.field private G:Lmh/l;

.field private H:Lmh/l;

.field private I:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LT/q;Landroid/view/View;Lx0/b;Lc0/h;ILE0/m0;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p6

    move-object v4, p4

    move-object v5, p3

    move-object v6, p7

    .line 3
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V

    .line 4
    iput-object p3, p0, Landroidx/compose/ui/viewinterop/i;->A:Landroid/view/View;

    .line 5
    iput-object p4, p0, Landroidx/compose/ui/viewinterop/i;->B:Lx0/b;

    .line 6
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/i;->C:Lc0/h;

    .line 7
    iput p6, p0, Landroidx/compose/ui/viewinterop/i;->D:I

    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 9
    invoke-static {p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->E:Ljava/lang/String;

    const/4 p2, 0x0

    if-eqz p5, :cond_0

    .line 10
    invoke-interface {p5, p1}, Lc0/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 11
    :goto_0
    instance-of p4, p1, Landroid/util/SparseArray;

    if-eqz p4, :cond_1

    move-object p2, p1

    check-cast p2, Landroid/util/SparseArray;

    :cond_1
    if-eqz p2, :cond_2

    .line 12
    invoke-virtual {p3, p2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 13
    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/i;->y()V

    .line 14
    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->e()Lmh/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->G:Lmh/l;

    .line 15
    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->e()Lmh/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->H:Lmh/l;

    .line 16
    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->e()Lmh/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->I:Lmh/l;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;LT/q;Landroid/view/View;Lx0/b;Lc0/h;ILE0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    .line 1
    new-instance v0, Lx0/b;

    invoke-direct {v0}, Lx0/b;-><init>()V

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    .line 2
    invoke-direct/range {v1 .. v8}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;LT/q;Landroid/view/View;Lx0/b;Lc0/h;ILE0/m0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lmh/l;LT/q;Lc0/h;ILE0/m0;)V
    .locals 10

    move-object v1, p1

    move-object v0, p2

    .line 17
    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    .line 18
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;LT/q;Landroid/view/View;Lx0/b;Lc0/h;ILE0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private final setSavableRegistryEntry(Lc0/h$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->F:Lc0/h$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc0/h$a;->a()V

    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->F:Lc0/h$a;

    return-void
.end method

.method public static final synthetic w(Landroidx/compose/ui/viewinterop/i;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/i;->A:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic x(Landroidx/compose/ui/viewinterop/i;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/i;->z()V

    return-void
.end method

.method private final y()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->C:Lc0/h;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/i;->E:Ljava/lang/String;

    new-instance v2, Landroidx/compose/ui/viewinterop/i$a;

    invoke-direct {v2, p0}, Landroidx/compose/ui/viewinterop/i$a;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-interface {v0, v1, v2}, Lc0/h;->e(Ljava/lang/String;Lmh/a;)Lc0/h$a;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/i;->setSavableRegistryEntry(Lc0/h$a;)V

    :cond_0
    return-void
.end method

.method private final z()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/i;->setSavableRegistryEntry(Lc0/h$a;)V

    return-void
.end method


# virtual methods
.method public final getDispatcher()Lx0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->B:Lx0/b;

    return-object v0
.end method

.method public final getReleaseBlock()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->I:Lmh/l;

    return-object v0
.end method

.method public final getResetBlock()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->H:Lmh/l;

    return-object v0
.end method

.method public bridge synthetic getSubCompositionView()Landroidx/compose/ui/platform/a;
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/platform/B1;->getSubCompositionView()Landroidx/compose/ui/platform/a;

    move-result-object v0

    return-object v0
.end method

.method public final getUpdateBlock()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->G:Lmh/l;

    return-object v0
.end method

.method public getViewRoot()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final setReleaseBlock(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->I:Lmh/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/i$b;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$b;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c;->setRelease(Lmh/a;)V

    return-void
.end method

.method public final setResetBlock(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->H:Lmh/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/i$c;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$c;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c;->setReset(Lmh/a;)V

    return-void
.end method

.method public final setUpdateBlock(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->G:Lmh/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/i$d;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$d;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c;->setUpdate(Lmh/a;)V

    return-void
.end method
