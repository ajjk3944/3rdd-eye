.class final LM5/a$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->c(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:LO5/c;


# direct methods
.method constructor <init>(LIi/N;LO5/c;)V
    .locals 0

    iput-object p1, p0, LM5/a$h;->a:LIi/N;

    iput-object p2, p0, LM5/a$h;->b:LO5/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    iget-object v0, p0, LM5/a$h;->a:LIi/N;

    new-instance v3, LM5/a$h$a;

    iget-object v1, p0, LM5/a$h;->b:LO5/c;

    const/4 v2, 0x0

    invoke-direct {v3, v1, p1, v2}, LM5/a$h$a;-><init>(LO5/c;FLdh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LM5/a$h;->a(F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
