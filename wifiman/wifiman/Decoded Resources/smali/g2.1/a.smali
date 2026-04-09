.class public final Lg2/a;
.super Landroidx/lifecycle/N;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/UUID;

.field public d:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;)V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/N;-><init>()V

    const-string v0, "SaveableStateHolder_BackStackEntryKey"

    iput-object v0, p0, Lg2/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/UUID;

    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lg2/a;->c:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method protected W()V
    .locals 2

    invoke-super {p0}, Landroidx/lifecycle/N;->W()V

    invoke-virtual {p0}, Lg2/a;->Y()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg2/a;->c:Ljava/util/UUID;

    invoke-interface {v0, v1}, Lc0/e;->f(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lg2/a;->Y()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    return-void
.end method

.method public final X()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lg2/a;->c:Ljava/util/UUID;

    return-object v0
.end method

.method public final Y()Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lg2/a;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "saveableStateHolderRef"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z(Ljava/lang/ref/WeakReference;)V
    .locals 0

    iput-object p1, p0, Lg2/a;->d:Ljava/lang/ref/WeakReference;

    return-void
.end method
