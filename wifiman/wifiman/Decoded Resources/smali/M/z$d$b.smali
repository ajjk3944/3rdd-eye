.class final LM/z$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/z$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/a;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(Lr/a;LIi/N;)V
    .locals 0

    iput-object p1, p0, LM/z$d$b;->a:Lr/a;

    iput-object p2, p0, LM/z$d$b;->b:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, LM/z$d$b;->b(JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(JLdh/e;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LM/z$d$b;->a:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LM/z$d$b;->a:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LM/z$d$b;->b:LIi/N;

    new-instance v4, LM/z$d$b$a;

    iget-object p3, p0, LM/z$d$b;->a:Lr/a;

    const/4 v0, 0x0

    invoke-direct {v4, p3, p1, p2, v0}, LM/z$d$b$a;-><init>(Lr/a;JLdh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    :goto_0
    iget-object v0, p0, LM/z$d$b;->a:Lr/a;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
