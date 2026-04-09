.class public final Lg2/e;
.super Lf2/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/e$a;,
        Lg2/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf2/D;"
    }
.end annotation

.annotation runtime Lf2/D$b;
    value = "composable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 $2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J1\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u0018R \u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050 8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006\'"
    }
    d2 = {
        "Lg2/e;",
        "Lf2/D;",
        "Lg2/e$b;",
        "<init>",
        "()V",
        "",
        "Lf2/k;",
        "entries",
        "Lf2/y;",
        "navOptions",
        "Lf2/D$a;",
        "navigatorExtras",
        "LYg/J;",
        "e",
        "(Ljava/util/List;Lf2/y;Lf2/D$a;)V",
        "l",
        "()Lg2/e$b;",
        "popUpTo",
        "",
        "savedState",
        "j",
        "(Lf2/k;Z)V",
        "entry",
        "p",
        "(Lf2/k;)V",
        "o",
        "LT/q0;",
        "c",
        "LT/q0;",
        "n",
        "()LT/q0;",
        "isPop",
        "LLi/N;",
        "m",
        "()LLi/N;",
        "backStack",
        "d",
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
.field public static final d:Lg2/e$a;


# instance fields
.field private final c:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg2/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg2/e;->d:Lg2/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lf2/D;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Lg2/e;->c:LT/q0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lg2/e;->l()Lg2/e$b;

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

    invoke-virtual {p3, p2}, Lf2/F;->k(Lf2/k;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lg2/e;->c:LT/q0;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public j(Lf2/k;Z)V
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf2/F;->h(Lf2/k;Z)V

    iget-object p1, p0, Lg2/e;->c:LT/q0;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public l()Lg2/e$b;
    .locals 2

    new-instance v0, Lg2/e$b;

    sget-object v1, Lg2/b;->a:Lg2/b;

    invoke-virtual {v1}, Lg2/b;->a()Lmh/r;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lg2/e$b;-><init>(Lg2/e;Lmh/r;)V

    return-object v0
.end method

.method public final m()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0}, Lf2/F;->b()LLi/N;

    move-result-object v0

    return-object v0
.end method

.method public final n()LT/q0;
    .locals 1

    iget-object v0, p0, Lg2/e;->c:LT/q0;

    return-object v0
.end method

.method public final o(Lf2/k;)V
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf2/F;->e(Lf2/k;)V

    return-void
.end method

.method public final p(Lf2/k;)V
    .locals 1

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf2/F;->i(Lf2/k;)V

    return-void
.end method
