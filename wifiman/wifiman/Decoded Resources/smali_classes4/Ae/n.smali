.class public final enum LAe/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LAe/n;

.field public static final enum FADE_IN:LAe/n;

.field public static final enum SLIDE_FROM_BOTTOM:LAe/n;

.field public static final enum SLIDE_FROM_RIGHT:LAe/n;


# instance fields
.field private final enterTransition:Lmh/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/l;"
        }
    .end annotation
.end field

.field private final exitTransition:Lmh/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/l;"
        }
    .end annotation
.end field

.field private final popEnterTransition:Lmh/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/l;"
        }
    .end annotation
.end field

.field private final popExitTransition:Lmh/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/l;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[LAe/n;
    .locals 3

    sget-object v0, LAe/n;->FADE_IN:LAe/n;

    sget-object v1, LAe/n;->SLIDE_FROM_RIGHT:LAe/n;

    sget-object v2, LAe/n;->SLIDE_FROM_BOTTOM:LAe/n;

    filled-new-array {v0, v1, v2}, [LAe/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 15

    new-instance v7, LAe/n;

    new-instance v3, LAe/b;

    invoke-direct {v3}, LAe/b;-><init>()V

    new-instance v4, LAe/g;

    invoke-direct {v4}, LAe/g;-><init>()V

    new-instance v5, LAe/h;

    invoke-direct {v5}, LAe/h;-><init>()V

    new-instance v6, LAe/i;

    invoke-direct {v6}, LAe/i;-><init>()V

    const-string v1, "FADE_IN"

    const/4 v2, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LAe/n;-><init>(Ljava/lang/String;ILmh/l;Lmh/l;Lmh/l;Lmh/l;)V

    sput-object v7, LAe/n;->FADE_IN:LAe/n;

    new-instance v0, LAe/n;

    new-instance v11, LAe/j;

    invoke-direct {v11}, LAe/j;-><init>()V

    new-instance v12, LAe/k;

    invoke-direct {v12}, LAe/k;-><init>()V

    new-instance v13, LAe/l;

    invoke-direct {v13}, LAe/l;-><init>()V

    new-instance v14, LAe/m;

    invoke-direct {v14}, LAe/m;-><init>()V

    const-string v9, "SLIDE_FROM_RIGHT"

    const/4 v10, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, LAe/n;-><init>(Ljava/lang/String;ILmh/l;Lmh/l;Lmh/l;Lmh/l;)V

    sput-object v0, LAe/n;->SLIDE_FROM_RIGHT:LAe/n;

    new-instance v0, LAe/n;

    new-instance v4, LAe/c;

    invoke-direct {v4}, LAe/c;-><init>()V

    new-instance v5, LAe/d;

    invoke-direct {v5}, LAe/d;-><init>()V

    new-instance v6, LAe/e;

    invoke-direct {v6}, LAe/e;-><init>()V

    new-instance v7, LAe/f;

    invoke-direct {v7}, LAe/f;-><init>()V

    const-string v2, "SLIDE_FROM_BOTTOM"

    const/4 v3, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LAe/n;-><init>(Ljava/lang/String;ILmh/l;Lmh/l;Lmh/l;Lmh/l;)V

    sput-object v0, LAe/n;->SLIDE_FROM_BOTTOM:LAe/n;

    invoke-static {}, LAe/n;->$values()[LAe/n;

    move-result-object v0

    sput-object v0, LAe/n;->$VALUES:[LAe/n;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LAe/n;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILmh/l;Lmh/l;Lmh/l;Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            "Lmh/l;",
            "Lmh/l;",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LAe/n;->enterTransition:Lmh/l;

    iput-object p4, p0, LAe/n;->exitTransition:Lmh/l;

    iput-object p5, p0, LAe/n;->popEnterTransition:Lmh/l;

    iput-object p6, p0, LAe/n;->popExitTransition:Lmh/l;

    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LAe/o;->a()Lr/H;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$1(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LAe/o;->a()Lr/H;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$10(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->d()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->c(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$11(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->a()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->a(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$2(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LAe/o;->a()Lr/H;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$3(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LAe/o;->a()Lr/H;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$4(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->c()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->c(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$5(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->c()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->a(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$6(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->d()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->c(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$7(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->d()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->a(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$8(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->f()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->c(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$9(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->c()I

    move-result v2

    invoke-static {}, LAe/o;->b()Lr/H;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->a(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$4(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$1(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$3(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$9(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LAe/n;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static synthetic h(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$8(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$5(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$6(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$0(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$11(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$2(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$10(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LAe/n;->_init_$lambda$7(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LAe/n;
    .locals 1

    const-class v0, LAe/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAe/n;

    return-object p0
.end method

.method public static values()[LAe/n;
    .locals 1

    sget-object v0, LAe/n;->$VALUES:[LAe/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAe/n;

    return-object v0
.end method


# virtual methods
.method public final getEnterTransition()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, LAe/n;->enterTransition:Lmh/l;

    return-object v0
.end method

.method public final getExitTransition()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, LAe/n;->exitTransition:Lmh/l;

    return-object v0
.end method

.method public final getPopEnterTransition()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, LAe/n;->popEnterTransition:Lmh/l;

    return-object v0
.end method

.method public final getPopExitTransition()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, LAe/n;->popExitTransition:Lmh/l;

    return-object v0
.end method
