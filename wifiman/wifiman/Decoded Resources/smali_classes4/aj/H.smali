.class public final Laj/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:Laj/H;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Laj/H;

    invoke-direct {v0}, Laj/H;-><init>()V

    sput-object v0, Laj/H;->a:Laj/H;

    sget-object v2, LXi/e$i;->a:LXi/e$i;

    const/4 v0, 0x0

    new-array v3, v0, [LXi/f;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "kotlinx.serialization.json.JsonPrimitive"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LXi/l;->e(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;ILjava/lang/Object;)LXi/f;

    move-result-object v0

    sput-object v0, Laj/H;->b:LXi/f;

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

    sget-object v0, Laj/H;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Laj/H;->g(LYi/e;)Laj/G;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laj/G;

    invoke-virtual {p0, p1, p2}, Laj/H;->h(LYi/f;Laj/G;)V

    return-void
.end method

.method public g(LYi/e;)Laj/G;
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->d(LYi/e;)Laj/i;

    move-result-object p1

    invoke-interface {p1}, Laj/i;->m()Laj/j;

    move-result-object p1

    instance-of v0, p1, Laj/G;

    if-eqz v0, :cond_0

    check-cast p1, Laj/G;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected JSON element, expected JsonPrimitive, had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {v1, v0, p1}, Lbj/r;->e(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1
.end method

.method public h(LYi/f;Laj/G;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->c(LYi/f;)V

    instance-of v0, p2, Laj/B;

    if-eqz v0, :cond_0

    sget-object p2, Laj/C;->a:Laj/C;

    sget-object v0, Laj/B;->INSTANCE:Laj/B;

    invoke-interface {p1, p2, v0}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Laj/y;->a:Laj/y;

    check-cast p2, Laj/x;

    invoke-interface {p1, v0, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
