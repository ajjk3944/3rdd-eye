.class public abstract Lh8/b;
.super Landroidx/appcompat/app/c;
.source "SourceFile"

# interfaces
.implements Lh8/k;
.implements Lorg/kodein/di/c;


# static fields
.field static final synthetic F:[Lth/l;

.field public static final G:I


# instance fields
.field private final D:LYg/m;

.field private final E:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getDi()Lorg/kodein/di/DI;"

    const/4 v2, 0x0

    const-class v3, Lh8/b;

    const-string/jumbo v4, "di"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lh8/b;->F:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lh8/b;->G:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    invoke-static {}, Lsj/a;->c()Lsj/c;

    move-result-object v0

    sget-object v1, Lh8/b;->F:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lsj/c;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lh8/b;->D:LYg/m;

    new-instance v0, Lh8/a;

    invoke-direct {v0, p0}, Lh8/a;-><init>(Lh8/b;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lh8/b;->E:LYg/m;

    return-void
.end method

.method public static synthetic T0(Lh8/b;)Lh8/e;
    .locals 0

    invoke-static {p0}, Lh8/b;->V0(Lh8/b;)Lh8/e;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lh8/b;)Lh8/e;
    .locals 1

    new-instance v0, Lh8/e;

    invoke-direct {v0, p0}, Lh8/e;-><init>(Landroidx/appcompat/app/c;)V

    return-object v0
.end method


# virtual methods
.method public B(Lgg/b;Lh8/c;Lmh/l;ZLmh/a;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lh8/k$a;->j(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;)V

    return-void
.end method

.method public I()Lorg/kodein/di/f;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/c$a;->a(Lorg/kodein/di/c;)Lorg/kodein/di/f;

    move-result-object v0

    return-object v0
.end method

.method public J(Lgg/s;Lh8/c;Lkg/f;Lkg/a;ZLkg/f;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lh8/k$a;->m(Lh8/k;Lgg/s;Lh8/c;Lkg/f;Lkg/a;ZLkg/f;)V

    return-void
.end method

.method public bridge synthetic K()Lh8/f;
    .locals 1

    invoke-virtual {p0}, Lh8/b;->U0()Lh8/e;

    move-result-object v0

    return-object v0
.end method

.method public M(Lgg/i;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lh8/k$a;->l(Lh8/k;Lgg/i;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V

    return-void
.end method

.method public U0()Lh8/e;
    .locals 1

    iget-object v0, p0, Lh8/b;->E:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/e;

    return-object v0
.end method

.method public c(Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lh8/k$a;->n(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V

    return-void
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lh8/b;->D:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/kodein/di/DI;

    return-object v0
.end method

.method public i()Lrj/l2;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/c$a;->b(Lorg/kodein/di/c;)Lrj/l2;

    const/4 v0, 0x0

    return-object v0
.end method

.method public k(Lgg/i;Lh8/c;Lkg/f;Lkg/f;Lkg/a;Z)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lh8/k$a;->k(Lh8/k;Lgg/i;Lh8/c;Lkg/f;Lkg/f;Lkg/a;Z)V

    return-void
.end method

.method public q(Lgg/b;Lh8/c;Lkg/a;Lkg/f;Z)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lh8/k$a;->i(Lh8/k;Lgg/b;Lh8/c;Lkg/a;Lkg/f;Z)V

    return-void
.end method
