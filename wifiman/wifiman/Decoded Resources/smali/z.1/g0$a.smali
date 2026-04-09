.class public final Lz/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz/g0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz/g0$a;->e(LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz/g0$a;->f(LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object p0

    return-object p0
.end method

.method private final d(Landroid/view/View;)Lz/g0;
    .locals 4

    invoke-static {}, Lz/g0;->a()Ljava/util/WeakHashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lz/g0;->a()Ljava/util/WeakHashMap;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lz/g0;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1, v3}, Lz/g0;-><init>(LF1/w0;Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Lz/g0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private final e(LF1/w0;ILjava/lang/String;)Lz/b;
    .locals 1

    new-instance v0, Lz/b;

    invoke-direct {v0, p2, p3}, Lz/b;-><init>(ILjava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    :cond_0
    return-object v0
.end method

.method private final f(LF1/w0;ILjava/lang/String;)Lz/d0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, LF1/w0;->g(I)Lw1/f;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lw1/f;->e:Lw1/f;

    :cond_1
    invoke-static {p1, p3}, Lz/k0;->a(Lw1/f;Ljava/lang/String;)Lz/d0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(LT/l;I)Lz/g0;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)"

    const v2, -0x5173c916

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->k()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-direct {p0, p2}, Lz/g0$a;->d(Landroid/view/View;)Lz/g0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lz/g0$a$a;

    invoke-direct {v2, v0, p2}, Lz/g0$a$a;-><init>(Lz/g0;Landroid/view/View;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lmh/l;

    const/4 p2, 0x0

    invoke-static {v0, v2, p1, p2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object v0
.end method
