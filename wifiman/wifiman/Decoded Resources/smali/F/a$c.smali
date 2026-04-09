.class final LF/a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a;->a(LM/j;Landroidx/compose/ui/e;JLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/j;


# direct methods
.method constructor <init>(LM/j;)V
    .locals 0

    iput-object p1, p0, LF/a$c;->a:LM/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 9

    invoke-static {}, LM/w;->d()LJ0/v;

    move-result-object v0

    new-instance v8, LM/v;

    sget-object v2, LF/p;->Cursor:LF/p;

    iget-object v1, p0, LF/a$c;->a:LM/j;

    invoke-interface {v1}, LM/j;->a()J

    move-result-wide v3

    sget-object v5, LM/u;->Middle:LM/u;

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LM/v;-><init>(LF/p;JLM/u;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0, v8}, LJ0/w;->b(LJ0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LF/a$c;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
