.class public Leb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/m$a;,
        Leb/m$b;
    }
.end annotation


# static fields
.field public static final i:Leb/m$a;


# instance fields
.field private final a:Leb/o;

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:J

.field private e:Leb/j;

.field private final f:LHg/a;

.field private final g:LFg/e;

.field private final h:Leb/m$f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leb/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leb/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Leb/m;->i:Leb/m$a;

    return-void
.end method

.method private constructor <init>(Leb/o;Ljava/lang/String;ZJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Leb/m;->a:Leb/o;

    .line 4
    iput-object p2, p0, Leb/m;->b:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Leb/m;->c:Z

    .line 6
    iput-wide p4, p0, Leb/m;->d:J

    .line 7
    invoke-static {}, LHg/a;->k1()LHg/a;

    move-result-object p1

    const-string/jumbo p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Leb/m;->f:LHg/a;

    .line 8
    invoke-static {}, LFg/e;->j2()LFg/e;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Leb/m;->g:LFg/e;

    .line 9
    new-instance p1, Leb/m$f;

    invoke-direct {p1, p0}, Leb/m$f;-><init>(Leb/m;)V

    iput-object p1, p0, Leb/m;->h:Leb/m$f;

    return-void
.end method

.method public synthetic constructor <init>(Leb/o;Ljava/lang/String;ZJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Leb/m;-><init>(Leb/o;Ljava/lang/String;ZJ)V

    return-void
.end method

.method public static final synthetic a(Leb/m;)LFg/e;
    .locals 0

    iget-object p0, p0, Leb/m;->g:LFg/e;

    return-object p0
.end method

.method public static final synthetic b(Leb/m;)LHg/a;
    .locals 0

    iget-object p0, p0, Leb/m;->f:LHg/a;

    return-object p0
.end method

.method public static final synthetic c(Leb/m;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Leb/m;->g()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Leb/m;Leb/j;)V
    .locals 0

    iput-object p1, p0, Leb/m;->e:Leb/j;

    return-void
.end method

.method private final g()Lgg/z;
    .locals 6

    iget-object v0, p0, Leb/m;->a:Leb/o;

    iget-object v1, p0, Leb/m;->b:Ljava/lang/String;

    iget-object v2, p0, Leb/m;->h:Leb/m$f;

    iget-boolean v3, p0, Leb/m;->c:Z

    iget-wide v4, p0, Leb/m;->d:J

    invoke-interface/range {v0 .. v5}, Leb/o;->c(Ljava/lang/String;Leb/k;ZJ)Lgg/z;

    move-result-object v0

    new-instance v1, Leb/m$d;

    invoke-direct {v1, p0}, Leb/m$d;-><init>(Leb/m;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Leb/m$e;

    invoke-direct {v1, p0}, Leb/m$e;-><init>(Leb/m;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public e()V
    .locals 1

    iget-object v0, p0, Leb/m;->e:Leb/j;

    if-nez v0, :cond_0

    const-string/jumbo v0, "webSocket"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Leb/j;->close()V

    return-void
.end method

.method public f()Lgg/i;
    .locals 3

    iget-object v0, p0, Leb/m;->g:LFg/e;

    iget-object v1, p0, Leb/m;->f:LHg/a;

    sget-object v2, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {v1, v2}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object v1

    sget-object v2, Leb/m$c;->a:Leb/m$c;

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "combineLatest(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final h()Lgg/s;
    .locals 1

    iget-object v0, p0, Leb/m;->f:LHg/a;

    return-object v0
.end method
