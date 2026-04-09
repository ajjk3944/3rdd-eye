.class final Laj/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:Laj/y;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laj/y;

    invoke-direct {v0}, Laj/y;-><init>()V

    sput-object v0, Laj/y;->a:Laj/y;

    const-string v0, "kotlinx.serialization.json.JsonLiteral"

    sget-object v1, LXi/e$i;->a:LXi/e$i;

    invoke-static {v0, v1}, LXi/l;->b(Ljava/lang/String;LXi/e;)LXi/f;

    move-result-object v0

    sput-object v0, Laj/y;->b:LXi/f;

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

    sget-object v0, Laj/y;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Laj/y;->g(LYi/e;)Laj/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laj/x;

    invoke-virtual {p0, p1, p2}, Laj/y;->h(LYi/f;Laj/x;)V

    return-void
.end method

.method public g(LYi/e;)Laj/x;
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->d(LYi/e;)Laj/i;

    move-result-object p1

    invoke-interface {p1}, Laj/i;->m()Laj/j;

    move-result-object p1

    instance-of v0, p1, Laj/x;

    if-eqz v0, :cond_0

    check-cast p1, Laj/x;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected JSON element, expected JsonLiteral, had "

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

.method public h(LYi/f;Laj/x;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->c(LYi/f;)V

    invoke-virtual {p2}, Laj/x;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->G(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Laj/x;->e()LXi/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Laj/x;->e()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->B(LXi/f;)LYi/f;

    move-result-object p1

    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->G(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/t;->s(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, LYi/f;->E(J)V

    return-void

    :cond_2
    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/M;->i(Ljava/lang/String;)LYg/E;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LYg/E;->j()J

    move-result-wide v0

    sget-object p2, LYg/E;->b:LYg/E$a;

    invoke-static {p2}, LWi/a;->z(LYg/E$a;)LVi/b;

    move-result-object p2

    invoke-interface {p2}, LVi/b;->a()LXi/f;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->B(LXi/f;)LYi/f;

    move-result-object p1

    invoke-interface {p1, v0, v1}, LYi/f;->E(J)V

    return-void

    :cond_3
    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/t;->n(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-interface {p1, v0, v1}, LYi/f;->j(D)V

    return-void

    :cond_4
    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/t;->p1(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, LYi/f;->m(Z)V

    return-void

    :cond_5
    invoke-virtual {p2}, Laj/x;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->G(Ljava/lang/String;)V

    return-void
.end method
