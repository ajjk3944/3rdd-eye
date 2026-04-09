.class final Laa/c$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LIi/N;

.field final synthetic c:Laa/d;


# direct methods
.method constructor <init>(Ljava/util/List;LIi/N;Laa/d;)V
    .locals 0

    iput-object p1, p0, Laa/c$b$c;->a:Ljava/util/List;

    iput-object p2, p0, Laa/c$b$c;->b:LIi/N;

    iput-object p3, p0, Laa/c$b$c;->c:Laa/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA/y;)V
    .locals 7

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laa/c$b$c;->a:Ljava/util/List;

    sget-object v1, Laa/c$b$c$a;->a:Laa/c$b$c$a;

    iget-object v2, p0, Laa/c$b$c;->b:LIi/N;

    iget-object v3, p0, Laa/c$b$c;->c:Laa/d;

    sget-object v4, Laa/c$b$c$c;->a:Laa/c$b$c$c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-eqz v1, :cond_0

    new-instance v6, Laa/c$b$c$d;

    invoke-direct {v6, v1, v0}, Laa/c$b$c$d;-><init>(Lmh/l;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    new-instance v1, Laa/c$b$c$e;

    invoke-direct {v1, v4, v0}, Laa/c$b$c$e;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v4, Laa/c$b$c$f;

    invoke-direct {v4, v0, v2, v3}, Laa/c$b$c$f;-><init>(Ljava/util/List;LIi/N;Laa/d;)V

    const v0, -0x25b7f321

    const/4 v2, 0x1

    invoke-static {v0, v2, v4}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    invoke-interface {p1, v5, v6, v1, v0}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/y;

    invoke-virtual {p0, p1}, Laa/c$b$c;->a(LA/y;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
