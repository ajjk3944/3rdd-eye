.class public final Lrc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrc/b;
.implements Lrc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrc/h$a;,
        Lrc/h$b;
    }
.end annotation


# static fields
.field public static final i:Lrc/h$b;


# instance fields
.field private final a:Lj4/b;

.field private final b:Lhc/b;

.field private c:Landroid/app/Activity;

.field private final d:Lrc/h$a;

.field private final e:Lgg/i;

.field private final f:Lgg/b;

.field private final g:Lgg/b;

.field private final h:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrc/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrc/h$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrc/h;->i:Lrc/h$b;

    return-void
.end method

.method public constructor <init>(Lj4/b;Lhc/b;LMb/a;)V
    .locals 1

    const-string v0, "reviewManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toastService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/h;->a:Lj4/b;

    iput-object p2, p0, Lrc/h;->b:Lhc/b;

    new-instance p1, Lrc/h$a;

    invoke-direct {p1, p3}, Lrc/h$a;-><init>(LMb/a;)V

    iput-object p1, p0, Lrc/h;->d:Lrc/h$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->b()Lgg/i;

    move-result-object p1

    sget-object p2, Lrc/h$i;->a:Lrc/h$i;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrc/h;->e:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p2

    new-instance p3, Lrc/h$e;

    invoke-direct {p3, p0}, Lrc/h$e;-><init>(Lrc/h;)V

    invoke-virtual {p2, p3}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p2

    const-string p3, "flatMapCompletable(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lfe/i;->b(Lgg/b;)Lgg/b;

    move-result-object p2

    iput-object p2, p0, Lrc/h;->f:Lgg/b;

    sget-object v0, Lrc/h$j;->a:Lrc/h$j;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lrc/h$k;->a:Lrc/h$k;

    invoke-virtual {p1, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    new-instance v0, Lrc/h$l;

    invoke-direct {v0, p0}, Lrc/h$l;-><init>(Lrc/h;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfe/i;->b(Lgg/b;)Lgg/b;

    move-result-object p1

    iput-object p1, p0, Lrc/h;->g:Lgg/b;

    filled-new-array {p2, p1}, [Lgg/b;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object p1

    sget-object p2, Lrc/h$c;->a:Lrc/h$c;

    invoke-virtual {p1, p2}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    sget-object p2, Lrc/h$d;->a:Lrc/h$d;

    invoke-virtual {p1, p2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance p2, Lrc/c;

    invoke-direct {p2}, Lrc/c;-><init>()V

    invoke-virtual {p1, p2}, Lgg/b;->y(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string p2, "doOnDispose(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfe/i;->b(Lgg/b;)Lgg/b;

    move-result-object p1

    iput-object p1, p0, Lrc/h;->h:Lgg/b;

    return-void
.end method

.method public static synthetic e()V
    .locals 0

    invoke-static {}, Lrc/h;->n()V

    return-void
.end method

.method public static synthetic f(Lrc/h;Landroid/app/Activity;Lj4/a;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrc/h;->s(Lrc/h;Landroid/app/Activity;Lj4/a;Lgg/c;)V

    return-void
.end method

.method public static synthetic g(Lrc/h;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1}, Lrc/h;->p(Lrc/h;Lgg/A;)V

    return-void
.end method

.method public static synthetic h(Lgg/A;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lrc/h;->q(Lgg/A;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic i(Lgg/c;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lrc/h;->t(Lgg/c;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static final synthetic j(Lrc/h;)Lrc/h$a;
    .locals 0

    iget-object p0, p0, Lrc/h;->d:Lrc/h$a;

    return-object p0
.end method

.method public static final synthetic k(Lrc/h;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lrc/h;->c:Landroid/app/Activity;

    return-object p0
.end method

.method public static final synthetic l(Lrc/h;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Lrc/h;->o()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lrc/h;Landroid/app/Activity;Lj4/a;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrc/h;->r(Landroid/app/Activity;Lj4/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final n()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "AppReview auto request disposed"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final o()Lgg/z;
    .locals 2

    new-instance v0, Lrc/d;

    invoke-direct {v0, p0}, Lrc/d;-><init>(Lrc/h;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final p(Lrc/h;Lgg/A;)V
    .locals 1

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lrc/h;->a:Lj4/b;

    invoke-interface {p0}, Lj4/b;->b()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance v0, Lrc/e;

    invoke-direct {v0, p1}, Lrc/e;-><init>(Lgg/A;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final q(Lgg/A;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "failed to obtain review info or the error"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_1
    invoke-interface {p0, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private final r(Landroid/app/Activity;Lj4/a;)Lgg/b;
    .locals 1

    new-instance v0, Lrc/f;

    invoke-direct {v0, p0, p1, p2}, Lrc/f;-><init>(Lrc/h;Landroid/app/Activity;Lj4/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final s(Lrc/h;Landroid/app/Activity;Lj4/a;Lgg/c;)V
    .locals 3

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Requesting the app review dialog"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p0, p0, Lrc/h;->a:Lj4/b;

    invoke-interface {p0, p1, p2}, Lj4/b;->a(Landroid/app/Activity;Lj4/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, Lrc/g;

    invoke-direct {p1, p3}, Lrc/g;-><init>(Lgg/c;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final t(Lgg/c;Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "App review request successfully completed"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p0}, Lgg/c;->a()V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "failed to request the review and obtain the errorr"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_1
    invoke-interface {p0, p1}, Lgg/c;->c(Ljava/lang/Throwable;)Z

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    iget-object v0, p0, Lrc/h;->e:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lrc/h$f;->a:Lrc/h$f;

    invoke-virtual {v0, v1}, Lgg/z;->r(Lkg/p;)Lgg/n;

    move-result-object v0

    new-instance v1, Lrc/h$g;

    invoke-direct {v1, p0}, Lrc/h$g;-><init>(Lrc/h;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    sget-object v1, Lrc/h$h;->a:Lrc/h$h;

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrc/h;->c:Landroid/app/Activity;

    return-void
.end method

.method public c()Lgg/b;
    .locals 1

    iget-object v0, p0, Lrc/h;->h:Lgg/b;

    return-object v0
.end method

.method public d(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrc/h;->c:Landroid/app/Activity;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lrc/h;->c:Landroid/app/Activity;

    :cond_0
    return-void
.end method
