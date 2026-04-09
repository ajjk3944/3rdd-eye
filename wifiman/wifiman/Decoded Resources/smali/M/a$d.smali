.class final LM/a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/j;

.field final synthetic b:Z

.field final synthetic c:Z


# direct methods
.method constructor <init>(LM/j;ZZ)V
    .locals 0

    iput-object p1, p0, LM/a$d;->a:LM/j;

    iput-boolean p2, p0, LM/a$d;->b:Z

    iput-boolean p3, p0, LM/a$d;->c:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 9

    iget-object v0, p0, LM/a$d;->a:LM/j;

    invoke-interface {v0}, LM/j;->a()J

    move-result-wide v3

    invoke-static {}, LM/w;->d()LJ0/v;

    move-result-object v0

    new-instance v8, LM/v;

    iget-boolean v1, p0, LM/a$d;->b:Z

    if-eqz v1, :cond_0

    sget-object v1, LF/p;->SelectionStart:LF/p;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    sget-object v1, LF/p;->SelectionEnd:LF/p;

    goto :goto_0

    :goto_1
    iget-boolean v1, p0, LM/a$d;->c:Z

    if-eqz v1, :cond_1

    sget-object v1, LM/u;->Left:LM/u;

    :goto_2
    move-object v5, v1

    goto :goto_3

    :cond_1
    sget-object v1, LM/u;->Right:LM/u;

    goto :goto_2

    :goto_3
    invoke-static {v3, v4}, Ll0/h;->c(J)Z

    move-result v6

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LM/v;-><init>(LF/p;JLM/u;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0, v8}, LJ0/w;->b(LJ0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LM/a$d;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
