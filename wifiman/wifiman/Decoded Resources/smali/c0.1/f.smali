.class final Lc0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc0/f$c;,
        Lc0/f$d;
    }
.end annotation


# static fields
.field public static final d:Lc0/f$c;

.field private static final e:Lc0/k;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private c:Lc0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc0/f$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc0/f$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lc0/f;->d:Lc0/f$c;

    sget-object v0, Lc0/f$a;->a:Lc0/f$a;

    sget-object v1, Lc0/f$b;->a:Lc0/f$b;

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, Lc0/f;->e:Lc0/k;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc0/f;->a:Ljava/util/Map;

    .line 3
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lc0/f;->b:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lc0/f;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic a(Lc0/f;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lc0/f;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic b(Lc0/f;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lc0/f;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic c()Lc0/k;
    .locals 1

    sget-object v0, Lc0/f;->e:Lc0/k;

    return-object v0
.end method

.method public static final synthetic e(Lc0/f;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lc0/f;->h()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final h()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Lc0/f;->a:Ljava/util/Map;

    invoke-static {v0}, LZg/U;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lc0/f;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/f$d;

    invoke-virtual {v2, v0}, Lc0/f$d;->b(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/Object;Lmh/p;LT/l;I)V
    .locals 5

    const v0, -0x47703d6d

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

    goto/16 :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const/16 v0, 0xcf

    invoke-interface {p3, v0, p1}, LT/l;->y(ILjava/lang/Object;)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_b

    iget-object v0, p0, Lc0/f;->c:Lc0/h;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lc0/h;->a(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_5

    :cond_9
    const/4 v0, 0x1

    :goto_5
    if-eqz v0, :cond_a

    new-instance v0, Lc0/f$d;

    invoke-direct {v0, p0, p1}, Lc0/f$d;-><init>(Lc0/f;Ljava/lang/Object;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Type of the key "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    :goto_6
    check-cast v0, Lc0/f$d;

    invoke-static {}, Lc0/j;->d()LT/H0;

    move-result-object v3

    invoke-virtual {v0}, Lc0/f$d;->a()Lc0/h;

    move-result-object v4

    invoke-virtual {v3, v4}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v3

    sget v4, LT/I0;->i:I

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v4

    invoke-static {v3, p2, p3, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v4, Lc0/f$e;

    invoke-direct {v4, p0, p1, v0}, Lc0/f$e;-><init>(Lc0/f;Ljava/lang/Object;Lc0/f$d;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lmh/l;

    const/4 v0, 0x6

    invoke-static {v1, v4, p3, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p3}, LT/l;->d()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_7
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_f

    new-instance v0, Lc0/f$f;

    invoke-direct {v0, p0, p1, p2, p4}, Lc0/f$f;-><init>(Lc0/f;Ljava/lang/Object;Lmh/p;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lc0/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/f$d;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lc0/f$d;->c(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc0/f;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final g()Lc0/h;
    .locals 1

    iget-object v0, p0, Lc0/f;->c:Lc0/h;

    return-object v0
.end method

.method public final i(Lc0/h;)V
    .locals 0

    iput-object p1, p0, Lc0/f;->c:Lc0/h;

    return-void
.end method
