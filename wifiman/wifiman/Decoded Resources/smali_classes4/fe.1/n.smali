.class public final Lfe/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfe/n$a;
    }
.end annotation


# static fields
.field public static final b:Lfe/n$a;


# instance fields
.field private final a:Lgg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfe/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfe/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfe/n;->b:Lfe/n$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LO7/d;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "file"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfe/j;

    invoke-direct {v0, p1, p2}, Lfe/j;-><init>(Landroid/content/Context;LO7/d;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lfe/n;->a:Lgg/s;

    return-void
.end method

.method public static synthetic a(Lgg/t;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lfe/n;->h(Lgg/t;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 0

    invoke-static {p0, p1}, Lfe/n;->i(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;LO7/d;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lfe/n;->g(Landroid/content/Context;LO7/d;Lgg/t;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Long;Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lfe/n;->l(Ljava/lang/Long;Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lgg/s;Ljava/lang/String;)Lgg/s;
    .locals 1

    new-instance v0, Lfe/n$b;

    invoke-direct {v0, p2}, Lfe/n$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object p1

    const-string p2, "filter(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final g(Landroid/content/Context;LO7/d;Lgg/t;)V
    .locals 1

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LO7/d;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    new-instance p1, Lfe/k;

    invoke-direct {p1, p2}, Lfe/k;-><init>(Lgg/t;)V

    new-instance v0, Lfe/l;

    invoke-direct {v0, p0, p1}, Lfe/l;-><init>(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-interface {p2, v0}, Lgg/t;->d(Lkg/e;)V

    const-string v0, ""

    invoke-static {p0, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-interface {p2, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method private static final h(Lgg/t;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-interface {p0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 0

    invoke-interface {p0, p1}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method private static final l(Ljava/lang/Long;Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)LYg/J;
    .locals 2

    const-string v0, "$this$update"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p2, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f(Ljava/lang/String;)Lgg/i;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfe/n;->a:Lgg/s;

    invoke-direct {p0, v0, p1}, Lfe/n;->e(Lgg/s;Ljava/lang/String;)Lgg/s;

    move-result-object v0

    new-instance v1, Lfe/n$c;

    invoke-direct {v1, p1}, Lfe/n$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->v()Lgg/s;

    move-result-object p1

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v0}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    const-string v0, "toFlowable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/Long;)Lgg/b;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfe/m;

    invoke-direct {v0, p2, p1}, Lfe/m;-><init>(Ljava/lang/Long;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lfe/n;->k(Lmh/l;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lmh/l;)Lgg/b;
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfe/n;->a:Lgg/s;

    invoke-virtual {v0}, Lgg/s;->P()Lgg/z;

    move-result-object v0

    new-instance v1, Lfe/n$d;

    invoke-direct {v1, p1}, Lfe/n$d;-><init>(Lmh/l;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
