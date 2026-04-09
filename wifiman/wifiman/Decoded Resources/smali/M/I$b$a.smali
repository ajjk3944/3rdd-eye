.class final LM/I$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/I$b;->h(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(LM/G;LT/q0;)V
    .locals 0

    iput-object p1, p0, LM/I$b$a;->a:LM/G;

    iput-object p2, p0, LM/I$b$a;->b:LT/q0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget-object v0, p0, LM/I$b$a;->a:LM/G;

    iget-object v1, p0, LM/I$b$a;->b:LT/q0;

    invoke-static {v1}, LM/I$b;->a(LT/q0;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LM/H;->b(LM/G;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LM/I$b$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    return-object v0
.end method
