.class public final Lye/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lye/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lye/g;

.field private final b:Landroidx/lifecycle/k$b;

.field private final c:Lmh/a;

.field private final d:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/b$a;->a:Lye/g;

    iput-object p2, p0, Lye/b$a;->b:Landroidx/lifecycle/k$b;

    iput-object p3, p0, Lye/b$a;->c:Lmh/a;

    new-instance p1, Lye/a;

    invoke-direct {p1, p0}, Lye/a;-><init>(Lye/b$a;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lye/b$a;->d:LYg/m;

    return-void
.end method

.method public static synthetic a(Lye/b$a;)LLi/g;
    .locals 0

    invoke-static {p0}, Lye/b$a;->d(Lye/b$a;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private final b()LLi/g;
    .locals 1

    iget-object v0, p0, Lye/b$a;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLi/g;

    return-object v0
.end method

.method private static final d(Lye/b$a;)LLi/g;
    .locals 3

    sget-object v0, Lye/b;->a:Lye/b;

    iget-object v1, p0, Lye/b$a;->a:Lye/g;

    iget-object v2, p0, Lye/b$a;->b:Landroidx/lifecycle/k$b;

    iget-object p0, p0, Lye/b$a;->c:Lmh/a;

    invoke-virtual {v0, v1, v2, p0}, Lye/b;->a(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)LLi/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lth/l;)LLi/g;
    .locals 0

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lye/b$a;->b()LLi/g;

    move-result-object p1

    return-object p1
.end method
