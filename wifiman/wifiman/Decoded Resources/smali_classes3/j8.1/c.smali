.class public final Lj8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/c$a;,
        Lj8/c$b;
    }
.end annotation


# static fields
.field public static final g:Lj8/c$a;

.field public static final h:I


# instance fields
.field private final a:Lmd/b;

.field private final b:Landroid/content/SharedPreferences;

.field private final c:Ljava/util/Map;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj8/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj8/c;->g:Lj8/c$a;

    const/16 v0, 0x8

    sput v0, Lj8/c;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lmd/b;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "settingsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj8/c;->a:Lmd/b;

    sget-object p2, LO7/d;->THEME:LO7/d;

    invoke-virtual {p2}, LO7/d;->getId()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string/jumbo p2, "getSharedPreferences(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj8/c;->b:Landroid/content/SharedPreferences;

    invoke-static {}, LT7/b;->getEntries()Lfh/a;

    move-result-object p1

    const/16 p2, 0xa

    invoke-static {p1, p2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, LZg/U;->d(I)I

    move-result p2

    const/16 v0, 0x10

    invoke-static {p2, v0}, Lsh/m;->d(II)I

    move-result p2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, LT7/b;

    invoke-direct {p0, v1}, Lj8/c;->j(LT7/b;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lj8/c;->c:Ljava/util/Map;

    iget-object p1, p0, Lj8/c;->a:Lmd/b;

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    sget-object p2, Lj8/c$c;->a:Lj8/c$c;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj8/c;->d:Lgg/i;

    new-instance p1, Lj8/c$g;

    invoke-direct {p1}, Lj8/c$g;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj8/c;->e:Lgg/i;

    iget-object p1, p0, Lj8/c;->a:Lmd/b;

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    sget-object p2, Lj8/c$d;->a:Lj8/c$d;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lj8/c$e;

    invoke-direct {p2, p0}, Lj8/c$e;-><init>(Lj8/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-static {}, Lfg/b;->g()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance p2, Lj8/c$f;

    invoke-direct {p2, p0}, Lj8/c$f;-><init>(Lj8/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "flatMapCompletable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj8/c;->f:Lgg/b;

    return-void
.end method

.method public static synthetic e(LT7/b;Lmd/a;)Lmd/a;
    .locals 0

    invoke-static {p0, p1}, Lj8/c;->k(LT7/b;Lmd/a;)Lmd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lj8/c;LT7/b;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lj8/c;->j(LT7/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lj8/c;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lj8/c;->b:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static final synthetic h(Lj8/c;LT7/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lj8/c;->l(LT7/b;)V

    return-void
.end method

.method private final j(LT7/b;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lj8/c$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "system"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "dark"

    goto :goto_0

    :cond_2
    const-string/jumbo p1, "light"

    :goto_0
    return-object p1
.end method

.method private static final k(LT7/b;Lmd/a;)Lmd/a;
    .locals 11

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v10}, Lmd/a;->b(Lmd/a;LT7/b;LT7/c;ZZZZZILjava/lang/Object;)Lmd/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(LT7/b;)V
    .locals 1

    sget-object v0, Lj8/c$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-static {v0}, Landroidx/appcompat/app/f;->M(I)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lj8/c;->e:Lgg/i;

    return-object v0
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Lj8/c;->i()LT7/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lj8/c;->l(LT7/b;)V

    return-void
.end method

.method public c()Lgg/b;
    .locals 1

    iget-object v0, p0, Lj8/c;->f:Lgg/b;

    return-object v0
.end method

.method public d(LT7/b;)Lgg/b;
    .locals 2

    const-string/jumbo v0, "dayNight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/c;->a:Lmd/b;

    new-instance v1, Lj8/b;

    invoke-direct {v1, p1}, Lj8/b;-><init>(LT7/b;)V

    invoke-interface {v0, v1}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public i()LT7/b;
    .locals 3

    iget-object v0, p0, Lj8/c;->b:Landroid/content/SharedPreferences;

    const-string/jumbo v1, "daynight"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj8/c;->c:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT7/b;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lj8/c;->a:Lmd/b;

    invoke-interface {v0}, Lmd/b;->c()Lmd/a;

    move-result-object v0

    invoke-virtual {v0}, Lmd/a;->e()LT7/b;

    move-result-object v0

    :cond_1
    return-object v0
.end method
