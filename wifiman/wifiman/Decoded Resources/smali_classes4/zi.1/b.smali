.class final Lzi/b;
.super LZg/c;
.source "SourceFile"


# instance fields
.field private final c:Ljava/util/Iterator;

.field private final d:Lmh/l;

.field private final e:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lmh/l;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keySelector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/c;-><init>()V

    iput-object p1, p0, Lzi/b;->c:Ljava/util/Iterator;

    iput-object p2, p0, Lzi/b;->d:Lmh/l;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lzi/b;->e:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 3

    :cond_0
    iget-object v0, p0, Lzi/b;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzi/b;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lzi/b;->d:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lzi/b;->e:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, LZg/c;->f(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, LZg/c;->e()V

    return-void
.end method
