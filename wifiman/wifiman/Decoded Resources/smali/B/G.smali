.class final LB/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/h;
.implements Lc0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/G$b;
    }
.end annotation


# static fields
.field public static final d:LB/G$b;


# instance fields
.field private final a:Lc0/h;

.field private final b:LT/q0;

.field private final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB/G$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB/G$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LB/G;->d:LB/G$b;

    return-void
.end method

.method public constructor <init>(Lc0/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LB/G;->a:Lc0/h;

    const/4 p1, 0x0

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, p1, v0, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LB/G;->b:LT/q0;

    .line 4
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LB/G;->c:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lc0/h;Ljava/util/Map;)V
    .locals 1

    .line 5
    new-instance v0, LB/G$a;

    invoke-direct {v0, p1}, LB/G$a;-><init>(Lc0/h;)V

    invoke-static {p2, v0}, Lc0/j;->a(Ljava/util/Map;Lmh/l;)Lc0/h;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, LB/G;-><init>(Lc0/h;)V

    return-void
.end method

.method public static final synthetic g(LB/G;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LB/G;->c:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LB/G;->a:Lc0/h;

    invoke-interface {v0, p1}, Lc0/h;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Map;
    .locals 3

    invoke-virtual {p0}, LB/G;->h()Lc0/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LB/G;->c:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Lc0/e;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LB/G;->a:Lc0/h;

    invoke-interface {v0}, Lc0/h;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB/G;->a:Lc0/h;

    invoke-interface {v0, p1}, Lc0/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Object;Lmh/p;LT/l;I)V
    .locals 4

    const v0, -0x298e20f1

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, LB/G;->h()Lc0/e;

    move-result-object v0

    if-eqz v0, :cond_d

    and-int/lit8 v2, v1, 0xe

    and-int/lit8 v1, v1, 0x7e

    invoke-interface {v0, p1, p2, p3, v1}, Lc0/e;->d(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_a

    :cond_9
    new-instance v1, LB/G$c;

    invoke-direct {v1, p0, p1}, LB/G$c;-><init>(LB/G;Ljava/lang/Object;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lmh/l;

    invoke-static {p1, v1, p3, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, LB/G$d;

    invoke-direct {v0, p0, p1, p2, p4}, LB/G$d;-><init>(LB/G;Ljava/lang/Object;Lmh/p;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null wrappedHolder"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;Lmh/a;)Lc0/h$a;
    .locals 1

    iget-object v0, p0, LB/G;->a:Lc0/h;

    invoke-interface {v0, p1, p2}, Lc0/h;->e(Ljava/lang/String;Lmh/a;)Lc0/h$a;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LB/G;->h()Lc0/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lc0/e;->f(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "null wrappedHolder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()Lc0/e;
    .locals 1

    iget-object v0, p0, LB/G;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/e;

    return-object v0
.end method

.method public final i(Lc0/e;)V
    .locals 1

    iget-object v0, p0, LB/G;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
