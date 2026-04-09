.class public final LA8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA8/d;

    invoke-direct {v0}, LA8/d;-><init>()V

    sput-object v0, LA8/d;->a:LA8/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JLcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p4}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-interface {p3, p1, p2}, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;->c(J)Lgg/z;

    move-result-object p1

    new-instance p2, LA8/d$b;

    invoke-direct {p2, v0}, LA8/d$b;-><init>(LIi/n;)V

    new-instance p3, LA8/d$c;

    invoke-direct {p3, v0}, LA8/d$c;-><init>(LIi/n;)V

    invoke-virtual {p1, p2, p3}, Lgg/z;->M(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object p1

    const-string/jumbo p2, "subscribe(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LA8/d$a;

    invoke-direct {p2, p1}, LA8/d$a;-><init>(Lhg/c;)V

    invoke-interface {v0, p2}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p1
.end method

.method public final b(JLandroid/content/Context;Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p5

    instance-of v4, v3, LA8/d$d;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, LA8/d$d;

    iget v5, v4, LA8/d$d;->e:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, LA8/d$d;->e:I

    goto :goto_0

    :cond_0
    new-instance v4, LA8/d$d;

    invoke-direct {v4, v0, v3}, LA8/d$d;-><init>(LA8/d;Ldh/e;)V

    :goto_0
    iget-object v3, v4, LA8/d$d;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v5

    iget v6, v4, LA8/d$d;->e:I

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v6, :cond_3

    if-eq v6, v7, :cond_2

    if-ne v6, v8, :cond_1

    iget-wide v1, v4, LA8/d$d;->a:J

    iget-object v4, v4, LA8/d$d;->b:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-static {v3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v1, v4, LA8/d$d;->a:J

    iget-object v6, v4, LA8/d$d;->b:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    invoke-static {v3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v18, v6

    move-object v6, v3

    move-object/from16 v3, v18

    goto :goto_1

    :cond_3
    invoke-static {v3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p3

    iput-object v3, v4, LA8/d$d;->b:Ljava/lang/Object;

    iput-wide v1, v4, LA8/d$d;->a:J

    iput v7, v4, LA8/d$d;->e:I

    move-object/from16 v6, p4

    invoke-virtual {v0, v1, v2, v6, v4}, LA8/d;->a(JLcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_4

    return-object v5

    :cond_4
    :goto_1
    check-cast v6, LUe/g;

    if-eqz v6, :cond_6

    iput-object v3, v4, LA8/d$d;->b:Ljava/lang/Object;

    iput-wide v1, v4, LA8/d$d;->a:J

    iput v8, v4, LA8/d$d;->e:I

    const/16 v7, 0x400

    const/16 v10, 0x240

    invoke-interface {v6, v7, v10, v4}, LUe/g;->c(IILdh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_5

    return-object v5

    :cond_5
    move-object/from16 v18, v4

    move-object v4, v3

    move-object/from16 v3, v18

    :goto_2
    check-cast v3, Landroid/graphics/Bitmap;

    goto :goto_3

    :cond_6
    move-object v4, v3

    move-object v3, v9

    :goto_3
    if-eqz v3, :cond_7

    sget-object v1, LL8/h;->a:LL8/h;

    invoke-static {v1, v4, v9, v8, v9}, LL8/h;->b(LL8/h;Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;

    move-result-object v9

    sget-object v1, LB8/a;->a:LB8/a$a;

    invoke-virtual {v1}, LB8/a$a;->a()LB8/a;

    move-result-object v1

    new-instance v2, LB8/b;

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v2

    move-object v15, v3

    invoke-direct/range {v10 .. v17}, LB8/b;-><init>(IILB8/b$a;Ljava/lang/Integer;Landroid/graphics/Bitmap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4, v2}, LB8/a;->a(Landroid/content/Context;LB8/b;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1, v9}, LL8/a;->a(Landroid/graphics/Bitmap;Ljava/io/File;)V

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_4

    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Failed to instantiate floorplan controller "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v9, v9, v2, v9}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_4
    return-object v9
.end method
