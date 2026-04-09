.class public LSf/b;
.super LSf/a;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/util/HashSet;

.field private d:Ljava/util/HashSet;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LSf/a;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LSf/b;->f:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LSf/b;->d:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LSf/b;->c:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public e(LSf/c;)V
    .locals 1

    iget-object v0, p0, LSf/b;->c:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LSf/b;->c:Ljava/util/HashSet;

    :cond_0
    iget-object v0, p0, LSf/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(LSf/d;)V
    .locals 1

    iget-object v0, p0, LSf/b;->d:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LSf/b;->d:Ljava/util/HashSet;

    :cond_0
    iget-object v0, p0, LSf/b;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(LSf/e;)V
    .locals 1

    iget-object v0, p0, LSf/b;->f:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LSf/b;->f:Ljava/util/HashSet;

    :cond_0
    iget-object v0, p0, LSf/b;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSf/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, LSf/b;->c:Ljava/util/HashSet;

    return-object v0
.end method

.method public j()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, LSf/b;->d:Ljava/util/HashSet;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSf/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, LSf/b;->f:Ljava/util/HashSet;

    return-object v0
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LSf/b;->b:Ljava/lang/String;

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LSf/b;->e:Ljava/lang/String;

    return-void
.end method
