.class public final Lg2/i;
.super Lf2/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/i$a;,
        Lg2/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf2/D;"
    }
.end annotation

.annotation runtime Lf2/D$b;
    value = "dialog"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \"2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001d\u00a8\u0006%"
    }
    d2 = {
        "Lg2/i;",
        "Lf2/D;",
        "Lg2/i$b;",
        "<init>",
        "()V",
        "Lf2/k;",
        "backStackEntry",
        "LYg/J;",
        "m",
        "(Lf2/k;)V",
        "",
        "entries",
        "Lf2/y;",
        "navOptions",
        "Lf2/D$a;",
        "navigatorExtras",
        "e",
        "(Ljava/util/List;Lf2/y;Lf2/D$a;)V",
        "l",
        "()Lg2/i$b;",
        "popUpTo",
        "",
        "savedState",
        "j",
        "(Lf2/k;Z)V",
        "entry",
        "p",
        "LLi/N;",
        "n",
        "()LLi/N;",
        "backStack",
        "",
        "o",
        "transitionInProgress",
        "c",
        "a",
        "b",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lg2/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg2/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg2/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg2/i;->c:Lg2/i$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf2/D;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lg2/i;->l()Lg2/i$b;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;Lf2/y;Lf2/D$a;)V
    .locals 0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf2/k;

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object p3

    invoke-virtual {p3, p2}, Lf2/F;->j(Lf2/k;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(Lf2/k;Z)V
    .locals 3

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf2/F;->h(Lf2/k;Z)V

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object p2

    invoke-virtual {p2}, Lf2/F;->c()LLi/N;

    move-result-object p2

    invoke-interface {p2}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2, p1}, LZg/v;->u0(Ljava/lang/Iterable;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object p2

    invoke-virtual {p2}, Lf2/F;->c()LLi/N;

    move-result-object p2

    invoke-interface {p2}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v1, Lf2/k;

    if-le v0, p1, :cond_1

    invoke-virtual {p0, v1}, Lg2/i;->p(Lf2/k;)V

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public l()Lg2/i$b;
    .locals 7

    new-instance v6, Lg2/i$b;

    sget-object v0, Lg2/c;->a:Lg2/c;

    invoke-virtual {v0}, Lg2/c;->a()Lmh/q;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lg2/i$b;-><init>(Lg2/i;Landroidx/compose/ui/window/i;Lmh/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final m(Lf2/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg2/i;->j(Lf2/k;Z)V

    return-void
.end method

.method public final n()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0}, Lf2/F;->b()LLi/N;

    move-result-object v0

    return-object v0
.end method

.method public final o()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0}, Lf2/F;->c()LLi/N;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lf2/k;)V
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf2/F;->e(Lf2/k;)V

    return-void
.end method
