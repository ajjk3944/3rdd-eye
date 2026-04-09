.class public final Laj/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:Laj/C;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Laj/C;

    invoke-direct {v0}, Laj/C;-><init>()V

    sput-object v0, Laj/C;->a:Laj/C;

    sget-object v2, LXi/m$b;->a:LXi/m$b;

    const/4 v0, 0x0

    new-array v3, v0, [LXi/f;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "kotlinx.serialization.json.JsonNull"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LXi/l;->e(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;ILjava/lang/Object;)LXi/f;

    move-result-object v0

    sput-object v0, Laj/C;->b:LXi/f;

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

    sget-object v0, Laj/C;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Laj/C;->g(LYi/e;)Laj/B;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laj/B;

    invoke-virtual {p0, p1, p2}, Laj/C;->h(LYi/f;Laj/B;)V

    return-void
.end method

.method public g(LYi/e;)Laj/B;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->b(LYi/e;)V

    invoke-interface {p1}, LYi/e;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LYi/e;->r()Ljava/lang/Void;

    sget-object p1, Laj/B;->INSTANCE:Laj/B;

    return-object p1

    :cond_0
    new-instance p1, Lkotlinx/serialization/json/internal/JsonDecodingException;

    const-string v0, "Expected \'null\' literal"

    invoke-direct {p1, v0}, Lkotlinx/serialization/json/internal/JsonDecodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(LYi/f;Laj/B;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->c(LYi/f;)V

    invoke-interface {p1}, LYi/f;->f()V

    return-void
.end method
