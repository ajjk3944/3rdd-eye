.class public final LZi/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:LZi/q1;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZi/q1;

    invoke-direct {v0}, LZi/q1;-><init>()V

    sput-object v0, LZi/q1;->a:LZi/q1;

    new-instance v0, LZi/N0;

    const-string v1, "kotlin.uuid.Uuid"

    sget-object v2, LXi/e$i;->a:LXi/e$i;

    invoke-direct {v0, v1, v2}, LZi/N0;-><init>(Ljava/lang/String;LXi/e;)V

    sput-object v0, LZi/q1;->b:LXi/f;

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

    sget-object v0, LZi/q1;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/q1;->g(LYi/e;)LBi/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LBi/b;

    invoke-virtual {p0, p1, p2}, LZi/q1;->h(LYi/f;LBi/b;)V

    return-void
.end method

.method public g(LYi/e;)LBi/b;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LBi/b;->c:LBi/b$a;

    invoke-interface {p1}, LYi/e;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LBi/b$a;->c(Ljava/lang/String;)LBi/b;

    move-result-object p1

    return-object p1
.end method

.method public h(LYi/f;LBi/b;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LBi/b;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->G(Ljava/lang/String;)V

    return-void
.end method
