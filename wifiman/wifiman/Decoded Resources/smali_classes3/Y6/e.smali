.class abstract LY6/e;
.super LY6/h;
.source "SourceFile"


# static fields
.field public static final b:LY6/h$d;


# instance fields
.field private final a:LY6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY6/e$a;

    invoke-direct {v0}, LY6/e$a;-><init>()V

    sput-object v0, LY6/e;->b:LY6/h$d;

    return-void
.end method

.method private constructor <init>(LY6/h;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LY6/h;-><init>()V

    .line 3
    iput-object p1, p0, LY6/e;->a:LY6/h;

    return-void
.end method

.method synthetic constructor <init>(LY6/h;LY6/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY6/e;-><init>(LY6/h;)V

    return-void
.end method

.method static m(Ljava/lang/reflect/Type;LY6/r;)LY6/h;
    .locals 1

    const-class v0, Ljava/util/Collection;

    invoke-static {p0, v0}, LY6/v;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-virtual {p1, p0}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object p0

    new-instance p1, LY6/e$b;

    invoke-direct {p1, p0}, LY6/e$b;-><init>(LY6/h;)V

    return-object p1
.end method

.method static o(Ljava/lang/reflect/Type;LY6/r;)LY6/h;
    .locals 1

    const-class v0, Ljava/util/Collection;

    invoke-static {p0, v0}, LY6/v;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-virtual {p1, p0}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object p0

    new-instance p1, LY6/e$c;

    invoke-direct {p1, p0}, LY6/e$c;-><init>(LY6/h;)V

    return-object p1
.end method


# virtual methods
.method public l(LY6/k;)Ljava/util/Collection;
    .locals 2

    invoke-virtual {p0}, LY6/e;->n()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p1}, LY6/k;->a()V

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LY6/e;->a:LY6/h;

    invoke-virtual {v1, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LY6/k;->h()V

    return-object v0
.end method

.method abstract n()Ljava/util/Collection;
.end method

.method public p(LY6/o;Ljava/util/Collection;)V
    .locals 2

    invoke-virtual {p1}, LY6/o;->a()LY6/o;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LY6/e;->a:LY6/h;

    invoke-virtual {v1, p1, v0}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LY6/o;->p()LY6/o;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LY6/e;->a:LY6/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".collection()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
