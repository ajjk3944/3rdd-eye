.class public final Lh2/b;
.super LYi/b;
.source "SourceFile"


# instance fields
.field private final a:LVi/b;

.field private final b:Ljava/util/Map;

.field private final c:Lcj/e;

.field private final d:Ljava/util/Map;

.field private e:I


# direct methods
.method public constructor <init>(LVi/b;Ljava/util/Map;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYi/b;-><init>()V

    iput-object p1, p0, Lh2/b;->a:LVi/b;

    iput-object p2, p0, Lh2/b;->b:Ljava/util/Map;

    invoke-static {}, Lcj/g;->a()Lcj/e;

    move-result-object p1

    iput-object p1, p0, Lh2/b;->c:Lcj/e;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lh2/b;->d:Ljava/util/Map;

    const/4 p1, -0x1

    iput p1, p0, Lh2/b;->e:I

    return-void
.end method

.method private final K(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lh2/b;->a:LVi/b;

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v0

    iget v1, p0, Lh2/b;->e:I

    invoke-interface {v0, v1}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh2/b;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/B;

    if-eqz v1, :cond_1

    instance-of v2, v1, Lf2/c;

    if-eqz v2, :cond_0

    check-cast v1, Lf2/c;

    invoke-virtual {v1, p1}, Lf2/c;->l(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Lf2/B;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iget-object v1, p0, Lh2/b;->d:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot find NavType for argument "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Please provide NavType through typeMap."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public B(LXi/f;)LYi/f;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lh2/c;->d(LXi/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lh2/b;->e:I

    :cond_0
    invoke-super {p0, p1}, LYi/b;->B(LXi/f;)LYi/f;

    move-result-object p1

    return-object p1
.end method

.method public H(LXi/f;I)Z
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput p2, p0, Lh2/b;->e:I

    const/4 p1, 0x1

    return p1
.end method

.method public I(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lh2/b;->K(Ljava/lang/Object;)V

    return-void
.end method

.method public final J(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/b;->a:LVi/b;

    invoke-super {p0, v0, p1}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/b;->d:Ljava/util/Map;

    invoke-static {p1}, LZg/U;->t(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public a()Lcj/e;
    .locals 1

    iget-object v0, p0, Lh2/b;->c:Lcj/e;

    return-object v0
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh2/b;->K(Ljava/lang/Object;)V

    return-void
.end method

.method public z(LVi/o;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lh2/b;->K(Ljava/lang/Object;)V

    return-void
.end method
