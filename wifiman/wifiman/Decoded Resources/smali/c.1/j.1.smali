.class public abstract Lc/j;
.super Ls1/g;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;
.implements Landroidx/lifecycle/S;
.implements Landroidx/lifecycle/i;
.implements Lq2/f;
.implements Lc/J;
.implements Lf/f;
.implements Lt1/b;
.implements Lt1/c;
.implements Ls1/o;
.implements Ls1/p;
.implements LF1/w;
.implements Lc/E;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/j$b;,
        Lc/j$c;,
        Lc/j$d;,
        Lc/j$e;,
        Lc/j$f;
    }
.end annotation


# static fields
.field private static final v:Lc/j$c;


# instance fields
.field private final c:Le/a;

.field private final d:LF1/x;

.field private final e:Lq2/e;

.field private f:Landroidx/lifecycle/Q;

.field private final g:Lc/j$e;

.field private final h:LYg/m;

.field private i:I

.field private final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final k:Lf/e;

.field private final l:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final q:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private r:Z

.field private s:Z

.field private final t:LYg/m;

.field private final u:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc/j$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/j$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lc/j;->v:Lc/j$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ls1/g;-><init>()V

    new-instance v0, Le/a;

    invoke-direct {v0}, Le/a;-><init>()V

    iput-object v0, p0, Lc/j;->c:Le/a;

    new-instance v0, LF1/x;

    new-instance v1, Lc/d;

    invoke-direct {v1, p0}, Lc/d;-><init>(Lc/j;)V

    invoke-direct {v0, v1}, LF1/x;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lc/j;->d:LF1/x;

    sget-object v0, Lq2/e;->d:Lq2/e$a;

    invoke-virtual {v0, p0}, Lq2/e$a;->a(Lq2/f;)Lq2/e;

    move-result-object v0

    iput-object v0, p0, Lc/j;->e:Lq2/e;

    invoke-direct {p0}, Lc/j;->j0()Lc/j$e;

    move-result-object v1

    iput-object v1, p0, Lc/j;->g:Lc/j$e;

    new-instance v1, Lc/j$i;

    invoke-direct {v1, p0}, Lc/j$i;-><init>(Lc/j;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, Lc/j;->h:LYg/m;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Lc/j;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Lc/j$g;

    invoke-direct {v1, p0}, Lc/j$g;-><init>(Lc/j;)V

    iput-object v1, p0, Lc/j;->k:Lf/e;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lc/j;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lc/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lc/j;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lc/j;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lc/j;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lc/j;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v1

    new-instance v2, Lc/e;

    invoke-direct {v2, p0}, Lc/e;-><init>(Lc/j;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v1

    new-instance v2, Lc/f;

    invoke-direct {v2, p0}, Lc/f;-><init>(Lc/j;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v1

    new-instance v2, Lc/j$a;

    invoke-direct {v2, p0}, Lc/j$a;-><init>(Lc/j;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    invoke-virtual {v0}, Lq2/e;->c()V

    invoke-static {p0}, Landroidx/lifecycle/H;->c(Lq2/f;)V

    invoke-virtual {p0}, Lc/j;->t()Lq2/d;

    move-result-object v0

    new-instance v1, Lc/g;

    invoke-direct {v1, p0}, Lc/g;-><init>(Lc/j;)V

    const-string v2, "android:support:activity-result"

    invoke-virtual {v0, v2, v1}, Lq2/d;->h(Ljava/lang/String;Lq2/d$c;)V

    new-instance v0, Lc/h;

    invoke-direct {v0, p0}, Lc/h;-><init>(Lc/j;)V

    invoke-virtual {p0, v0}, Lc/j;->h0(Le/b;)V

    new-instance v0, Lc/j$h;

    invoke-direct {v0, p0}, Lc/j$h;-><init>(Lc/j;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lc/j;->t:LYg/m;

    new-instance v0, Lc/j$j;

    invoke-direct {v0, p0}, Lc/j$j;-><init>(Lc/j;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lc/j;->u:LYg/m;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic R(Lc/G;Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc/j;->g0(Lc/G;Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic S(Lc/j;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1}, Lc/j;->a0(Lc/j;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic T(Lc/j;)V
    .locals 0

    invoke-static {p0}, Lc/j;->o0(Lc/j;)V

    return-void
.end method

.method public static synthetic U(Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/j;->X(Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic V(Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc/j;->Y(Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic W(Lc/j;)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0}, Lc/j;->Z(Lc/j;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method private static final X(Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_0
    return-void
.end method

.method private static final Y(Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lc/j;->c:Le/a;

    invoke-virtual {p1}, Le/a;->b()V

    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc/j;->o()Landroidx/lifecycle/Q;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/Q;->a()V

    :cond_0
    iget-object p0, p0, Lc/j;->g:Lc/j$e;

    invoke-interface {p0}, Lc/j$e;->g()V

    :cond_1
    return-void
.end method

.method private static final Z(Lc/j;)Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object p0, p0, Lc/j;->k:Lf/e;

    invoke-virtual {p0, v0}, Lf/e;->j(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static final a0(Lc/j;Landroid/content/Context;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lc/j;->t()Lq2/d;

    move-result-object p1

    const-string v0, "android:support:activity-result"

    invoke-virtual {p1, v0}, Lq2/d;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lc/j;->k:Lf/e;

    invoke-virtual {p0, p1}, Lf/e;->i(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static final synthetic b0(Lc/j;Lc/G;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/j;->f0(Lc/G;)V

    return-void
.end method

.method public static final synthetic c0(Lc/j;)V
    .locals 0

    invoke-direct {p0}, Lc/j;->k0()V

    return-void
.end method

.method public static final synthetic d0(Lc/j;)Lc/j$e;
    .locals 0

    iget-object p0, p0, Lc/j;->g:Lc/j$e;

    return-object p0
.end method

.method public static final synthetic e0(Lc/j;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method private final f0(Lc/G;)V
    .locals 2

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v0

    new-instance v1, Lc/i;

    invoke-direct {v1, p1, p0}, Lc/i;-><init>(Lc/G;Lc/j;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-void
.end method

.method private static final g0(Lc/G;Lc/j;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "event"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    if-ne p3, p2, :cond_0

    sget-object p2, Lc/j$b;->a:Lc/j$b;

    invoke-virtual {p2, p1}, Lc/j$b;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/G;->o(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_0
    return-void
.end method

.method private final j0()Lc/j$e;
    .locals 1

    new-instance v0, Lc/j$f;

    invoke-direct {v0, p0}, Lc/j$f;-><init>(Lc/j;)V

    return-object v0
.end method

.method private final k0()V
    .locals 1

    iget-object v0, p0, Lc/j;->f:Landroidx/lifecycle/Q;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/j$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/j$d;->a()Landroidx/lifecycle/Q;

    move-result-object v0

    iput-object v0, p0, Lc/j;->f:Landroidx/lifecycle/Q;

    :cond_0
    iget-object v0, p0, Lc/j;->f:Landroidx/lifecycle/Q;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/lifecycle/Q;

    invoke-direct {v0}, Landroidx/lifecycle/Q;-><init>()V

    iput-object v0, p0, Lc/j;->f:Landroidx/lifecycle/Q;

    :cond_1
    return-void
.end method

.method private static final o0(Lc/j;)V
    .locals 0

    invoke-virtual {p0}, Lc/j;->n0()V

    return-void
.end method


# virtual methods
.method public final D(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final E(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final G(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final L(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public N(LF1/z;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->d:LF1/x;

    invoke-virtual {v0, p1}, LF1/x;->f(LF1/z;)V

    return-void
.end method

.method public O()Landroidx/lifecycle/k;
    .locals 1

    invoke-super {p0}, Ls1/g;->O()Landroidx/lifecycle/k;

    move-result-object v0

    return-object v0
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Lc/j;->m0()V

    iget-object v0, p0, Lc/j;->g:Lc/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc/j$e;->P(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()Lc/G;
    .locals 1

    iget-object v0, p0, Lc/j;->u:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/G;

    return-object v0
.end method

.method public g()Landroidx/lifecycle/P$c;
    .locals 1

    iget-object v0, p0, Lc/j;->t:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/P$c;

    return-object v0
.end method

.method public h()Lb2/a;
    .locals 5

    new-instance v0, Lb2/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lb2/b;-><init>(Lb2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/P$a;->h:Lb2/a$b;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    const-string v4, "application"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    :cond_0
    sget-object v1, Landroidx/lifecycle/H;->a:Lb2/a$b;

    invoke-virtual {v0, v1, p0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    sget-object v1, Landroidx/lifecycle/H;->b:Lb2/a$b;

    invoke-virtual {v0, v1, p0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    sget-object v1, Landroidx/lifecycle/H;->c:Lb2/a$b;

    invoke-virtual {v0, v1, v2}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public final h0(Le/b;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->c:Le/a;

    invoke-virtual {v0, p1}, Le/a;->a(Le/b;)V

    return-void
.end method

.method public final i0(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final j(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final l()Lf/e;
    .locals 1

    iget-object v0, p0, Lc/j;->k:Lf/e;

    return-object v0
.end method

.method public l0()Lc/D;
    .locals 1

    iget-object v0, p0, Lc/j;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/D;

    return-object v0
.end method

.method public m0()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window.decorView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/T;->b(Landroid/view/View;Landroidx/lifecycle/o;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/U;->b(Landroid/view/View;Landroidx/lifecycle/S;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lq2/g;->b(Landroid/view/View;Lq2/f;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lc/N;->b(Landroid/view/View;Lc/J;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lc/M;->a(Landroid/view/View;Lc/E;)V

    return-void
.end method

.method public n0()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public o()Landroidx/lifecycle/Q;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lc/j;->k0()V

    iget-object v0, p0, Lc/j;->f:Landroidx/lifecycle/Q;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lc/j;->k:Lf/e;

    invoke-virtual {v0, p1, p2, p3}, Lf/e;->d(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lc/j;->b()Lc/G;

    move-result-object v0

    invoke-virtual {v0}, Lc/G;->l()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lc/j;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    invoke-interface {v1, p1}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lc/j;->e:Lq2/e;

    invoke-virtual {v0, p1}, Lq2/e;->d(Landroid/os/Bundle;)V

    iget-object v0, p0, Lc/j;->c:Le/a;

    invoke-virtual {v0, p0}, Le/a;->c(Landroid/content/Context;)V

    invoke-super {p0, p1}, Ls1/g;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Landroidx/lifecycle/B;->b:Landroidx/lifecycle/B$b;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/B$b;->c(Landroid/app/Activity;)V

    iget p1, p0, Lc/j;->i:I

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lc/j;->setContentView(I)V

    :cond_0
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    const-string v0, "menu"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lc/j;->d:LF1/x;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, LF1/x;->b(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lc/j;->d:LF1/x;

    invoke-virtual {p1, p2}, LF1/x;->d(Landroid/view/MenuItem;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/j;->r:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/j;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    .line 3
    new-instance v2, Ls1/h;

    invoke-direct {v2, p1}, Ls1/h;-><init>(Z)V

    invoke-interface {v1, v2}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    const-string v0, "newConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lc/j;->r:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, Lc/j;->r:Z

    .line 7
    iget-object v0, p0, Lc/j;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    .line 8
    new-instance v2, Ls1/h;

    invoke-direct {v2, p1, p2}, Ls1/h;-><init>(ZLandroid/content/res/Configuration;)V

    invoke-interface {v1, v2}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 9
    iput-boolean v0, p0, Lc/j;->r:Z

    throw p1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object v0, p0, Lc/j;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    invoke-interface {v1, p1}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    const-string v0, "menu"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->d:LF1/x;

    invoke-virtual {v0, p2}, LF1/x;->c(Landroid/view/Menu;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/j;->s:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/j;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    .line 3
    new-instance v2, Ls1/r;

    invoke-direct {v2, p1}, Ls1/r;-><init>(Z)V

    invoke-interface {v1, v2}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    const-string v0, "newConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lc/j;->s:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, Lc/j;->s:Z

    .line 7
    iget-object v0, p0, Lc/j;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    .line 8
    new-instance v2, Ls1/r;

    invoke-direct {v2, p1, p2}, Ls1/r;-><init>(ZLandroid/content/res/Configuration;)V

    invoke-interface {v1, v2}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 9
    iput-boolean v0, p0, Lc/j;->s:Z

    throw p1
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    const-string v0, "menu"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Lc/j;->d:LF1/x;

    invoke-virtual {p1, p3}, LF1/x;->e(Landroid/view/Menu;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->k:Lf/e;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, p1, v2, v1}, Lf/e;->d(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lc/j;->p0()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lc/j;->f:Landroidx/lifecycle/Q;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/j$d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lc/j$d;->a()Landroidx/lifecycle/Q;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, Lc/j$d;

    invoke-direct {v2}, Lc/j$d;-><init>()V

    invoke-virtual {v2, v0}, Lc/j$d;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lc/j$d;->c(Landroidx/lifecycle/Q;)V

    return-object v2
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v0

    instance-of v0, v0, Landroidx/lifecycle/p;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->m(Landroidx/lifecycle/k$b;)V

    :cond_0
    invoke-super {p0, p1}, Ls1/g;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lc/j;->e:Lq2/e;

    invoke-virtual {v0, p1}, Lq2/e;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    iget-object v0, p0, Lc/j;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE1/a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, LE1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onUserLeaveHint()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onUserLeaveHint()V

    iget-object v0, p0, Lc/j;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p0()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r(LF1/z;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->d:LF1/x;

    invoke-virtual {v0, p1}, LF1/x;->a(LF1/z;)V

    return-void
.end method

.method public reportFullyDrawn()V
    .locals 1

    :try_start_0
    invoke-static {}, Lv2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    invoke-static {v0}, Lv2/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    invoke-virtual {p0}, Lc/j;->l0()Lc/D;

    move-result-object v0

    invoke-virtual {v0}, Lc/D;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lv2/a;->b()V

    return-void

    :goto_1
    invoke-static {}, Lv2/a;->b()V

    throw v0
.end method

.method public setContentView(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc/j;->m0()V

    .line 2
    iget-object v0, p0, Lc/j;->g:Lc/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc/j$e;->P(Landroid/view/View;)V

    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3

    .line 4
    invoke-virtual {p0}, Lc/j;->m0()V

    .line 5
    iget-object v0, p0, Lc/j;->g:Lc/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc/j$e;->P(Landroid/view/View;)V

    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 7
    invoke-virtual {p0}, Lc/j;->m0()V

    .line 8
    iget-object v0, p0, Lc/j;->g:Lc/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc/j$e;->P(Landroid/view/View;)V

    .line 9
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public final t()Lq2/d;
    .locals 1

    iget-object v0, p0, Lc/j;->e:Lq2/e;

    invoke-virtual {v0}, Lq2/e;->b()Lq2/d;

    move-result-object v0

    return-object v0
.end method

.method public final u(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final x(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final z(LE1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/j;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
