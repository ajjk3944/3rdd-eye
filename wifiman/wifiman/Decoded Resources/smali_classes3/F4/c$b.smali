.class public LF4/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private d:I

.field private e:I

.field private f:LF4/g;

.field private final g:Ljava/util/Set;


# direct methods
.method private varargs constructor <init>(LF4/A;[LF4/A;)V
    .locals 3

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, LF4/c$b;->a:Ljava/lang/String;

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LF4/c$b;->b:Ljava/util/Set;

    .line 18
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LF4/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    .line 19
    iput v1, p0, LF4/c$b;->d:I

    .line 20
    iput v1, p0, LF4/c$b;->e:I

    .line 21
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, LF4/c$b;->g:Ljava/util/Set;

    .line 22
    const-string/jumbo v2, "Null interface"

    invoke-static {p1, v2}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 25
    invoke-static {v0, v2}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, LF4/c$b;->b:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method synthetic constructor <init>(LF4/A;[LF4/A;LF4/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF4/c$b;-><init>(LF4/A;[LF4/A;)V

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, LF4/c$b;->a:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LF4/c$b;->b:Ljava/util/Set;

    .line 6
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LF4/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    .line 7
    iput v1, p0, LF4/c$b;->d:I

    .line 8
    iput v1, p0, LF4/c$b;->e:I

    .line 9
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, LF4/c$b;->g:Ljava/util/Set;

    .line 10
    const-string/jumbo v2, "Null interface"

    invoke-static {p1, v2}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    invoke-static {p1}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 13
    invoke-static {v0, v2}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    iget-object v3, p0, LF4/c$b;->b:Ljava/util/Set;

    invoke-static {v0}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;LF4/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LF4/c$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic a(LF4/c$b;)LF4/c$b;
    .locals 0

    invoke-direct {p0}, LF4/c$b;->f()LF4/c$b;

    move-result-object p0

    return-object p0
.end method

.method private f()LF4/c$b;
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LF4/c$b;->e:I

    return-object p0
.end method

.method private h(I)LF4/c$b;
    .locals 2

    iget v0, p0, LF4/c$b;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string/jumbo v1, "Instantiation type has already been set."

    invoke-static {v0, v1}, LF4/z;->d(ZLjava/lang/String;)V

    iput p1, p0, LF4/c$b;->d:I

    return-object p0
.end method

.method private i(LF4/A;)V
    .locals 1

    iget-object v0, p0, LF4/c$b;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string v0, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-static {p1, v0}, LF4/z;->a(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(LF4/q;)LF4/c$b;
    .locals 1

    const-string/jumbo v0, "Null dependency"

    invoke-static {p1, v0}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, LF4/q;->c()LF4/A;

    move-result-object v0

    invoke-direct {p0, v0}, LF4/c$b;->i(LF4/A;)V

    iget-object v0, p0, LF4/c$b;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()LF4/c;
    .locals 11

    iget-object v0, p0, LF4/c$b;->f:LF4/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string/jumbo v1, "Missing required property: factory."

    invoke-static {v0, v1}, LF4/z;->d(ZLjava/lang/String;)V

    new-instance v0, LF4/c;

    iget-object v3, p0, LF4/c$b;->a:Ljava/lang/String;

    new-instance v4, Ljava/util/HashSet;

    iget-object v1, p0, LF4/c$b;->b:Ljava/util/Set;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/HashSet;

    iget-object v1, p0, LF4/c$b;->c:Ljava/util/Set;

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget v6, p0, LF4/c$b;->d:I

    iget v7, p0, LF4/c$b;->e:I

    iget-object v8, p0, LF4/c$b;->f:LF4/g;

    iget-object v9, p0, LF4/c$b;->g:Ljava/util/Set;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, LF4/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILF4/g;Ljava/util/Set;LF4/c$a;)V

    return-object v0
.end method

.method public d()LF4/c$b;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, LF4/c$b;->h(I)LF4/c$b;

    move-result-object v0

    return-object v0
.end method

.method public e(LF4/g;)LF4/c$b;
    .locals 1

    const-string/jumbo v0, "Null factory"

    invoke-static {p1, v0}, LF4/z;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF4/g;

    iput-object p1, p0, LF4/c$b;->f:LF4/g;

    return-object p0
.end method

.method public g(Ljava/lang/String;)LF4/c$b;
    .locals 0

    iput-object p1, p0, LF4/c$b;->a:Ljava/lang/String;

    return-object p0
.end method
