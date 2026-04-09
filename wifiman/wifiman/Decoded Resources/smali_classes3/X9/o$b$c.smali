.class final LX9/o$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/o$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:LX9/p;


# direct methods
.method constructor <init>(LIi/N;LX9/p;)V
    .locals 0

    iput-object p1, p0, LX9/o$b$c;->a:LIi/N;

    iput-object p2, p0, LX9/o$b$c;->b:LX9/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZ9/a;)V
    .locals 7

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LX9/o$b$c;->a:LIi/N;

    new-instance v4, LX9/o$b$c$a;

    iget-object p1, p0, LX9/o$b$c;->b:LX9/p;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, LX9/o$b$c$a;-><init>(LX9/p;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ9/a;

    invoke-virtual {p0, p1}, LX9/o$b$c;->a(LZ9/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
