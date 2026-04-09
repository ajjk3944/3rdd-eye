.class public final LZi/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:LZi/l1;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZi/l1;

    invoke-direct {v0}, LZi/l1;-><init>()V

    sput-object v0, LZi/l1;->a:LZi/l1;

    sget-object v0, Lkotlin/jvm/internal/v;->a:Lkotlin/jvm/internal/v;

    invoke-static {v0}, LWi/a;->I(Lkotlin/jvm/internal/v;)LVi/b;

    move-result-object v0

    const-string v1, "kotlin.ULong"

    invoke-static {v1, v0}, LZi/T;->a(Ljava/lang/String;LVi/b;)LXi/f;

    move-result-object v0

    sput-object v0, LZi/l1;->b:LXi/f;

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

    sget-object v0, LZi/l1;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, LZi/l1;->g(LYi/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LYg/E;->a(J)LYg/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, LYg/E;

    invoke-virtual {p2}, LYg/E;->j()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LZi/l1;->h(LYi/f;J)V

    return-void
.end method

.method public g(LYi/e;)J
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/l1;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->l(LXi/f;)LYi/e;

    move-result-object p1

    invoke-interface {p1}, LYi/e;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, LYg/E;->b(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public h(LYi/f;J)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/l1;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->B(LXi/f;)LYi/f;

    move-result-object p1

    invoke-interface {p1, p2, p3}, LYi/f;->E(J)V

    return-void
.end method
