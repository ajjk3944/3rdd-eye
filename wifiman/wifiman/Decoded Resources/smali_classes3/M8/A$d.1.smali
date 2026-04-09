.class final LM8/A$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$d;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ll9/a;)LBf/b;
    .locals 6

    const-string/jumbo v0, "networks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, LS8/c;

    if-eqz v1, :cond_0

    iget-object v0, p0, LM8/A$d;->a:LM8/A;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LM8/K$a;->j(LM8/K;LS8/c;Lzi/j;Lmh/l;ILjava/lang/Object;)LBf/b;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object v0, p0, LM8/A$d;->a:LM8/A;

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

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LM8/A$d;->a(Ljava/util/List;Ll9/a;)LBf/b;

    move-result-object p1

    return-object p1
.end method
