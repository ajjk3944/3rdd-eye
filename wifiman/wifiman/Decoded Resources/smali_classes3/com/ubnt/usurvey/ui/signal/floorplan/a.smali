.class public final Lcom/ubnt/usurvey/ui/signal/floorplan/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lod/b;

.field private final c:Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;

.field private final d:Lcom/ubnt/mlkit/product/a;

.field private final e:Lje/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lod/b;Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;Lcom/ubnt/mlkit/product/a;Lje/u;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "floorplanRecordManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "floorplanGpxSerializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arObjectProductMatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiConnectionService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b:Lod/b;

    iput-object p3, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->c:Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;

    iput-object p4, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->d:Lcom/ubnt/mlkit/product/a;

    iput-object p5, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->e:Lje/u;

    return-void
.end method

.method public static synthetic d(JJ)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->m(JJ)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(J)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->o(J)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(J)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->q(J)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(J)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->p(J)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Lcom/ubnt/mlkit/product/a;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->d:Lcom/ubnt/mlkit/product/a;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->c:Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Lod/b;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b:Lod/b;

    return-object p0
.end method

.method public static final synthetic l(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Ljava/lang/String;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->n(Ljava/lang/String;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final m(JJ)LYg/J;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "FloorplanControllerMgr - Load ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo p0, "] took "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " millis"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final n(Ljava/lang/String;)Lgg/z;
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$c;

    invoke-direct {v0, p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$c;-><init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA8/D;

    invoke-direct {v0}, LA8/D;-><init>()V

    invoke-static {p1, v0}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;

    invoke-direct {v0, p0}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;-><init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$e;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$e;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final o(J)LYg/J;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "FloorplanControllerMgr - GPX deserialization took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " millis"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(J)LYg/J;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "FloorplanControllerMgr - GPX serialization took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " millis"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final q(J)LYg/J;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "FloorplanControllerMgr - Store took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " millis"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a()LA8/z;
    .locals 11

    new-instance v0, LA8/z;

    new-instance v1, Lh7/a;

    iget-object v2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh7/a$b;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Lh7/a$b;-><init>(IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2, v3}, Lh7/a;-><init>(Landroid/content/Context;Lh7/a$b;)V

    invoke-direct {v0, v1}, LA8/z;-><init>(Lh7/a;)V

    sget-object v1, Lod/g;->c:Lod/g$a;

    invoke-virtual {v1}, Lod/g$a;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lh7/g;->R(I)V

    sget-object v1, Lgc/b;->SIGNAL:Lgc/b;

    invoke-virtual {v0, v1}, LA8/z;->u0(Lgc/b;)V

    return-object v0
.end method

.method public b(LA8/z;Ljava/lang/String;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;

    invoke-direct {v0, p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;-><init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;LA8/z;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA8/B;

    invoke-direct {v0}, LA8/B;-><init>()V

    invoke-static {p1, v0}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;

    invoke-direct {v0, p0, p2}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;-><init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "flatMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LA8/C;

    invoke-direct {p2}, LA8/C;-><init>()V

    invoke-static {p1, p2}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/floorplan/a$i;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$i;

    invoke-virtual {p1, p2}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;

    invoke-virtual {p1, p2}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "doOnError(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(J)Lgg/z;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b:Lod/b;

    invoke-interface {v0, p1, p2}, Lod/b;->f(J)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;

    invoke-direct {v1, p1, p2, p0}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;-><init>(JLcom/ubnt/usurvey/ui/signal/floorplan/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "flatMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LA8/A;

    invoke-direct {v1, p1, p2}, LA8/A;-><init>(J)V

    invoke-static {v0, v1}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ubnt/usurvey/ui/signal/floorplan/a$b;

    invoke-direct {v1, p1, p2}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$b;-><init>(J)V

    invoke-virtual {v0, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "doOnError(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
