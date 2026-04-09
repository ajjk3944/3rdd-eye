.class public final Lcom/ui/wifiman/model/android/permissions/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/android/permissions/d;
.implements Lcom/ui/wifiman/model/android/permissions/b;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lfh/a;

.field private final c:LFg/c;

.field private final d:LHg/b;

.field private final e:Lgg/i;

.field private final f:Lgg/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c;->a:Landroid/content/Context;

    invoke-static {}, Lcom/ui/wifiman/model/android/permissions/a;->getEntries()Lfh/a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c;->b:Lfh/a;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c;->c:LFg/c;

    invoke-static {}, LHg/b;->k1()LHg/b;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ui/wifiman/model/android/permissions/c;->d:LHg/b;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/c$a;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/android/permissions/c$a;-><init>(Lcom/ui/wifiman/model/android/permissions/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/c$f;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/android/permissions/c$f;-><init>(Lcom/ui/wifiman/model/android/permissions/c;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/i;->y1(Lgg/D;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/c$b;->a:Lcom/ui/wifiman/model/android/permissions/c$b;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c;->e:Lgg/i;

    sget-object p1, Lcom/ui/wifiman/model/android/permissions/c$d;->a:Lcom/ui/wifiman/model/android/permissions/c$d;

    invoke-virtual {v1, p1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c;->f:Lgg/s;

    return-void
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/android/permissions/c;)LHg/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/android/permissions/c;->d:LHg/b;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/android/permissions/c;)LFg/c;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/android/permissions/c;->c:LFg/c;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/android/permissions/c;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/android/permissions/c;->h()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final h()Ljava/util/Set;
    .locals 9

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lcom/ui/wifiman/model/android/permissions/c;->b:Lfh/a;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/android/permissions/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/android/permissions/a;->getAlwaysGranted()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lcom/ui/wifiman/model/android/permissions/a;->getApiID()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v8, p0, Lcom/ui/wifiman/model/android/permissions/c;->a:Landroid/content/Context;

    invoke-static {v8, v5}, Lt1/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_1

    move v6, v7

    :cond_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/ui/wifiman/model/android/permissions/a;->getAllRequired()Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    move v6, v7

    goto :goto_2

    :cond_3
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    :cond_4
    :goto_2
    if-eqz v6, :cond_0

    :cond_5
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-ge v1, v2, :cond_7

    iget-object v1, p0, Lcom/ui/wifiman/model/android/permissions/c;->a:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v1, v2}, Lt1/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_7

    sget-object v1, Lcom/ui/wifiman/model/android/permissions/a;->BLUETOOTH:Lcom/ui/wifiman/model/android/permissions/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_7
    return-object v0
.end method


# virtual methods
.method public varargs a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;
    .locals 1

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/c$e;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/android/permissions/c$e;-><init>([Lcom/ui/wifiman/model/android/permissions/a;Lcom/ui/wifiman/model/android/permissions/c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/android/permissions/c;->e:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/s;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/android/permissions/c;->f:Lgg/s;

    return-object v0
.end method

.method public d()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/c$c;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/android/permissions/c$c;-><init>(Lcom/ui/wifiman/model/android/permissions/c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
