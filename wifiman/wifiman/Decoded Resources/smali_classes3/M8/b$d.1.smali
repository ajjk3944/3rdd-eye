.class final LM8/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/b;


# direct methods
.method constructor <init>(LM8/b;)V
    .locals 0

    iput-object p1, p0, LM8/b$d;->a:LM8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lxf/d;Lle/i;)Z
    .locals 0

    invoke-static {p0, p1}, LM8/b$d;->d(Lxf/d;Lle/i;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lxf/d;Lle/i;)Z
    .locals 1

    const-string/jumbo v0, "signal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lle/i;->e()Lh9/a;

    move-result-object p1

    invoke-virtual {p0}, Lxf/d;->a()Lh9/a;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxf/d;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, LM8/b$d;->c(Lxf/d;Ljava/util/List;Ll9/a;)LBf/b;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lxf/d;Ljava/util/List;Ll9/a;)LBf/b;
    .locals 6

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LS8/c;

    if-eqz p3, :cond_0

    iget-object v0, p0, LM8/b$d;->a:LM8/b;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p2

    new-instance v1, LM8/c;

    invoke-direct {v1, p1}, LM8/c;-><init>(Lxf/d;)V

    invoke-virtual {v0, p3, p2, v1}, LM8/b;->q(LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object v0, p0, LM8/b$d;->a:LM8/b;

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    const/4 p1, 0x0

    new-array p1, p1, [Lle/f;

    invoke-static {p1}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LM8/K$a;->j(LM8/K;LS8/c;Lzi/j;Lmh/l;ILjava/lang/Object;)LBf/b;

    move-result-object p1

    :cond_1
    return-object p1
.end method
