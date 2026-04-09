.class final LX9/o$b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


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

    iput-object p1, p0, LX9/o$b$i;->a:LIi/N;

    iput-object p2, p0, LX9/o$b$i;->b:LX9/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, LX9/o$b$i;->a:LIi/N;

    new-instance v3, LX9/o$b$i$a;

    iget-object v1, p0, LX9/o$b$i;->b:LX9/p;

    const/4 v2, 0x0

    invoke-direct {v3, v1, v2}, LX9/o$b$i$a;-><init>(LX9/p;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX9/o$b$i;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
