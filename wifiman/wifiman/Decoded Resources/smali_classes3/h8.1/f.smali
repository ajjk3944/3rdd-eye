.class public abstract Lh8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LFg/c;

.field private final b:Ljava/util/Map;

.field private final c:Lh8/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/o;)V
    .locals 2

    const-string/jumbo v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object v0

    const-string/jumbo v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lh8/f;->a:LFg/c;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lh8/f;->b:Ljava/util/Map;

    new-instance v0, Lh8/f$a;

    invoke-direct {v0, p0}, Lh8/f$a;-><init>(Lh8/f;)V

    iput-object v0, p0, Lh8/f;->c:Lh8/f$a;

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-void
.end method

.method private final c(Lh8/c;)Lhg/b;
    .locals 2

    iget-object v0, p0, Lh8/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    iget-object v1, p0, Lh8/f;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already has disposable!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected final a(Lh8/c;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh8/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhg/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhg/b;->dispose()V

    :cond_0
    return-void
.end method

.method protected final b()LFg/c;
    .locals 1

    iget-object v0, p0, Lh8/f;->a:LFg/c;

    return-object v0
.end method

.method public final d(Lhg/c;Lh8/c;)V
    .locals 1

    const-string/jumbo v0, "disposable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh8/f;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/b;

    if-nez v0, :cond_0

    invoke-direct {p0, p2}, Lh8/f;->c(Lh8/c;)Lhg/b;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p1}, Lhg/b;->a(Lhg/c;)Z

    return-void
.end method
