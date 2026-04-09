.class public final Lli/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/j;


# instance fields
.field private final a:LBh/N;


# direct methods
.method public constructor <init>(LBh/N;)V
    .locals 1

    const-string v0, "packageFragmentProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/q;->a:LBh/N;

    return-void
.end method


# virtual methods
.method public a(LZh/b;)Lli/i;
    .locals 3

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/q;->a:LBh/N;

    invoke-virtual {p1}, LZh/b;->f()LZh/c;

    move-result-object v1

    invoke-static {v0, v1}, LBh/S;->c(LBh/N;LZh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/M;

    instance-of v2, v1, Lli/r;

    if-eqz v2, :cond_0

    check-cast v1, Lli/r;

    invoke-virtual {v1}, Lli/r;->G0()Lli/j;

    move-result-object v1

    invoke-interface {v1, p1}, Lli/j;->a(LZh/b;)Lli/i;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
