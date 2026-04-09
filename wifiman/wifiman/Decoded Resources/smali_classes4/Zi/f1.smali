.class public final LZi/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:LZi/f1;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZi/f1;

    invoke-direct {v0}, LZi/f1;-><init>()V

    sput-object v0, LZi/f1;->a:LZi/f1;

    sget-object v0, Lkotlin/jvm/internal/e;->a:Lkotlin/jvm/internal/e;

    invoke-static {v0}, LWi/a;->D(Lkotlin/jvm/internal/e;)LVi/b;

    move-result-object v0

    const-string v1, "kotlin.UByte"

    invoke-static {v1, v0}, LZi/T;->a(Ljava/lang/String;LVi/b;)LXi/f;

    move-result-object v0

    sput-object v0, LZi/f1;->b:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    sget-object v0, LZi/f1;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/f1;->g(LYi/e;)B

    move-result p1

    invoke-static {p1}, LYg/A;->a(B)LYg/A;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LYg/A;

    invoke-virtual {p2}, LYg/A;->h()B

    move-result p2

    invoke-virtual {p0, p1, p2}, LZi/f1;->h(LYi/f;B)V

    return-void
.end method

.method public g(LYi/e;)B
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/f1;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->l(LXi/f;)LYi/e;

    move-result-object p1

    invoke-interface {p1}, LYi/e;->D()B

    move-result p1

    invoke-static {p1}, LYg/A;->b(B)B

    move-result p1

    return p1
.end method

.method public h(LYi/f;B)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/f1;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->B(LXi/f;)LYi/f;

    move-result-object p1

    invoke-interface {p1, p2}, LYi/f;->l(B)V

    return-void
.end method
