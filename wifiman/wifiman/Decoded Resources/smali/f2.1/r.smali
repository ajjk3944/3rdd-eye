.class public abstract Lf2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/r$a;,
        Lf2/r$b;
    }
.end annotation


# static fields
.field public static final k:Lf2/r$a;

.field private static final l:Ljava/util/Map;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lf2/t;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/CharSequence;

.field private final e:Ljava/util/List;

.field private final f:Lo/W;

.field private g:Ljava/util/Map;

.field private h:I

.field private i:Ljava/lang/String;

.field private j:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/r;->k:Lf2/r$a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lf2/r;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lf2/D;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Lf2/E;->b:Lf2/E$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf2/E$a;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lf2/r;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const-string v0, "navigatorName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf2/r;->a:Ljava/lang/String;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf2/r;->e:Ljava/util/List;

    .line 4
    new-instance p1, Lo/W;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1}, Lo/W;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lf2/r;->f:Lo/W;

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/r;->g:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic b(Lf2/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lf2/r;->g:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic j(Lf2/r;Lf2/r;ILjava/lang/Object;)[I
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lf2/r;->i(Lf2/r;)[I

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: buildDeepLinkIds"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final x(Lf2/p;Landroid/net/Uri;Ljava/util/Map;)Z
    .locals 0

    invoke-virtual {p1, p2, p3}, Lf2/p;->p(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p1

    new-instance p2, Lf2/r$d;

    invoke-direct {p2, p1}, Lf2/r$d;-><init>(Landroid/os/Bundle;)V

    invoke-static {p3, p2}, Lf2/j;->a(Ljava/util/Map;Lmh/l;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lf2/r$b;
    .locals 10

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/r;->j:LYg/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/p;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lf2/r;->k:Lf2/r$a;

    invoke-virtual {v2, p1}, Lf2/r$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v2, "Uri.parse(this)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-virtual {v0, p1, v2}, Lf2/p;->o(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0, p1}, Lf2/p;->h(Landroid/net/Uri;)I

    move-result v7

    new-instance p1, Lf2/r$b;

    invoke-virtual {v0}, Lf2/p;->z()Z

    move-result v6

    const/4 v8, 0x0

    const/4 v9, -0x1

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Lf2/r$b;-><init>(Lf2/r;Landroid/os/Bundle;ZIZI)V

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public final C(ILf2/g;)V
    .locals 2

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf2/r;->J()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lf2/r;->f:Lo/W;

    invoke-virtual {v0, p1, p2}, Lo/W;->l(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot have an action with actionId 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot add action "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final D(I)V
    .locals 0

    iput p1, p0, Lf2/r;->h:I

    const/4 p1, 0x0

    iput-object p1, p0, Lf2/r;->c:Ljava/lang/String;

    return-void
.end method

.method public final G(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lf2/r;->d:Ljava/lang/CharSequence;

    return-void
.end method

.method public final H(Lf2/t;)V
    .locals 0

    iput-object p1, p0, Lf2/r;->b:Lf2/t;

    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lf2/r;->D(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lf2/r;->k:Lf2/r$a;

    invoke-virtual {v0, p1}, Lf2/r$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lf2/p$a;

    invoke-direct {v1}, Lf2/p$a;-><init>()V

    invoke-virtual {v1, v0}, Lf2/p$a;->b(Ljava/lang/String;)Lf2/p$a;

    move-result-object v1

    invoke-virtual {v1}, Lf2/p$a;->a()Lf2/p;

    move-result-object v1

    iget-object v2, p0, Lf2/r;->g:Ljava/util/Map;

    new-instance v3, Lf2/r$f;

    invoke-direct {v3, v1}, Lf2/r$f;-><init>(Lf2/p;)V

    invoke-static {v2, v3}, Lf2/j;->a(Ljava/util/Map;Lmh/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v1, Lf2/r$e;

    invoke-direct {v1, v0}, Lf2/r$e;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, Lf2/r;->j:LYg/m;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lf2/r;->D(I)V

    :goto_0
    iput-object p1, p0, Lf2/r;->i:Ljava/lang/String;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot set route \""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" for destination "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Following required arguments are missing: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot have an empty route"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e(Ljava/lang/String;Lf2/h;)V
    .locals 1

    const-string v0, "argumentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argument"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_8

    instance-of v2, p1, Lf2/r;

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v2, p0, Lf2/r;->e:Ljava/util/List;

    check-cast p1, Lf2/r;

    iget-object v3, p1, Lf2/r;->e:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Lf2/r;->f:Lo/W;

    invoke-virtual {v3}, Lo/W;->p()I

    move-result v3

    iget-object v4, p1, Lf2/r;->f:Lo/W;

    invoke-virtual {v4}, Lo/W;->p()I

    move-result v4

    if-ne v3, v4, :cond_4

    iget-object v3, p0, Lf2/r;->f:Lo/W;

    invoke-static {v3}, Lo/Y;->a(Lo/W;)LZg/Q;

    move-result-object v3

    invoke-static {v3}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v3

    invoke-interface {v3}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget-object v5, p0, Lf2/r;->f:Lo/W;

    invoke-virtual {v5, v4}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p1, Lf2/r;->f:Lo/W;

    invoke-virtual {v6, v4}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_3
    move v3, v0

    goto :goto_1

    :cond_4
    :goto_0
    move v3, v1

    :goto_1
    iget-object v4, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    iget-object v5, p1, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v5

    if-ne v4, v5, :cond_6

    iget-object v4, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-static {v4}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object v4

    invoke-interface {v4}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    iget-object v6, p1, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, p1, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_5
    move v4, v0

    goto :goto_3

    :cond_6
    move v4, v1

    :goto_3
    iget v5, p0, Lf2/r;->h:I

    iget v6, p1, Lf2/r;->h:I

    if-ne v5, v6, :cond_7

    iget-object v5, p0, Lf2/r;->i:Ljava/lang/String;

    iget-object p1, p1, Lf2/r;->i:Ljava/lang/String;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    if-eqz v2, :cond_7

    if-eqz v3, :cond_7

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    move v0, v1

    :goto_4
    return v0

    :cond_8
    :goto_5
    return v1
.end method

.method public final f(Lf2/p;)V
    .locals 3

    const-string v0, "navDeepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/r;->g:Ljava/util/Map;

    new-instance v1, Lf2/r$c;

    invoke-direct {v1, p1}, Lf2/r$c;-><init>(Lf2/p;)V

    invoke-static {v0, v1}, Lf2/j;->a(Ljava/util/Map;Lmh/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lf2/r;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deep link "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf2/p;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " can\'t be used to open destination "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".\nFollowing required arguments are missing: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4

    if-nez p1, :cond_0

    iget-object v0, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/h;

    invoke-virtual {v2, v3, v0}, Lf2/h;->e(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_4

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object p1, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/h;

    invoke-virtual {v1}, Lf2/h;->c()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v2, v0}, Lf2/h;->f(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Wrong argument type for \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' in argument bundle. "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lf2/h;->a()Lf2/B;

    move-result-object v0

    invoke-virtual {v0}, Lf2/B;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expected."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lf2/r;->h:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf2/r;->i:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    iget-object v1, p0, Lf2/r;->e:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/p;

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v3}, Lf2/p;->y()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v3}, Lf2/p;->i()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_3

    :cond_2
    move v4, v2

    :goto_3
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v3}, Lf2/p;->t()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_4

    :cond_3
    move v3, v2

    :goto_4
    add-int/2addr v0, v3

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lf2/r;->f:Lo/W;

    invoke-static {v1}, Lo/Y;->b(Lo/W;)Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v1, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v2

    :goto_6
    add-int/2addr v0, v3

    goto :goto_5

    :cond_6
    return v0

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i(Lf2/r;)[I
    .locals 5

    new-instance v0, LZg/m;

    invoke-direct {v0}, LZg/m;-><init>()V

    move-object v1, p0

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, v1, Lf2/r;->b:Lf2/t;

    if-eqz p1, :cond_0

    iget-object v3, p1, Lf2/r;->b:Lf2/t;

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_1

    iget-object v3, p1, Lf2/r;->b:Lf2/t;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, v1, Lf2/r;->h:I

    invoke-virtual {v3, v4}, Lf2/t;->N(I)Lf2/r;

    move-result-object v3

    if-ne v3, v1, :cond_1

    invoke-virtual {v0, v1}, LZg/m;->addFirst(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lf2/t;->V()I

    move-result v3

    iget v4, v1, Lf2/r;->h:I

    if-eq v3, v4, :cond_3

    :cond_2
    invoke-virtual {v0, v1}, LZg/m;->addFirst(Ljava/lang/Object;)V

    :cond_3
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    if-nez v2, :cond_6

    :goto_2
    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/r;

    iget v1, v1, Lf2/r;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v0}, LZg/v;->h1(Ljava/util/Collection;)[I

    move-result-object p1

    return-object p1

    :cond_6
    move-object v1, v2

    goto :goto_0
.end method

.method public final k()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-static {v0}, LZg/U;->t(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/r;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget v0, p0, Lf2/r;->h:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Lf2/r;->h:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/r;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf2/r;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/r;->i:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, " route="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/r;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    iget-object v1, p0, Lf2/r;->d:Ljava/lang/CharSequence;

    if-eqz v1, :cond_3

    const-string v1, " label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/r;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/r;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final v()Lf2/t;
    .locals 1

    iget-object v0, p0, Lf2/r;->b:Lf2/t;

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/r;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final y(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/r;->i:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lf2/r;->A(Ljava/lang/String;)Lf2/r$b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lf2/r$b;->b()Lf2/r;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p1, p2}, Lf2/r$b;->d(Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public z(Lf2/q;)Lf2/r$b;
    .locals 13

    const-string v0, "navDeepLinkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/r;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lf2/r;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v2, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/p;

    invoke-virtual {p1}, Lf2/q;->c()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v3, p1}, Lf2/p;->E(Lf2/q;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v4, :cond_2

    iget-object v5, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-virtual {v3, v4, v5}, Lf2/p;->o(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v5

    move-object v8, v5

    goto :goto_1

    :cond_2
    move-object v8, v1

    :goto_1
    invoke-virtual {v3, v4}, Lf2/p;->h(Landroid/net/Uri;)I

    move-result v10

    invoke-virtual {p1}, Lf2/q;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Lf2/p;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    :goto_2
    move v11, v5

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, Lf2/q;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, -0x1

    if-eqz v5, :cond_4

    invoke-virtual {v3, v5}, Lf2/p;->u(Ljava/lang/String;)I

    move-result v5

    move v12, v5

    goto :goto_4

    :cond_4
    move v12, v6

    :goto_4
    if-nez v8, :cond_6

    if-nez v11, :cond_5

    if-le v12, v6, :cond_1

    :cond_5
    iget-object v5, p0, Lf2/r;->g:Ljava/util/Map;

    invoke-direct {p0, v3, v4, v5}, Lf2/r;->x(Lf2/p;Landroid/net/Uri;Ljava/util/Map;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_6
    new-instance v4, Lf2/r$b;

    invoke-virtual {v3}, Lf2/p;->z()Z

    move-result v9

    move-object v6, v4

    move-object v7, p0

    invoke-direct/range {v6 .. v12}, Lf2/r$b;-><init>(Lf2/r;Landroid/os/Bundle;ZIZI)V

    if-eqz v2, :cond_7

    invoke-virtual {v4, v2}, Lf2/r$b;->a(Lf2/r$b;)I

    move-result v3

    if-lez v3, :cond_1

    :cond_7
    move-object v2, v4

    goto :goto_0

    :cond_8
    return-object v2
.end method
