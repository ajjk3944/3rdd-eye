.class public final LZi/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:LZi/h0;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZi/h0;

    invoke-direct {v0}, LZi/h0;-><init>()V

    sput-object v0, LZi/h0;->a:LZi/h0;

    new-instance v0, LZi/N0;

    const-string v1, "kotlin.Long"

    sget-object v2, LXi/e$g;->a:LXi/e$g;

    invoke-direct {v0, v1, v2}, LZi/N0;-><init>(Ljava/lang/String;LXi/e;)V

    sput-object v0, LZi/h0;->b:LXi/f;

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

    sget-object v0, LZi/h0;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/h0;->g(LYi/e;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LZi/h0;->h(LYi/f;J)V

    return-void
.end method

.method public g(LYi/e;)Ljava/lang/Long;
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYi/e;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public h(LYi/f;J)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, p3}, LYi/f;->E(J)V

    return-void
.end method
