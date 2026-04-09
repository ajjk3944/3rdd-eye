.class LO6/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/b;->a(LM6/j;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/j;

.field final synthetic b:LO6/b;


# direct methods
.method constructor <init>(LO6/b;LM6/j;)V
    .locals 0

    iput-object p1, p0, LO6/b$b;->b:LO6/b;

    iput-object p2, p0, LO6/b$b;->a:LM6/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/t;)V
    .locals 2

    new-instance v0, LO6/g;

    iget-object v1, p0, LO6/b$b;->a:LM6/j;

    invoke-direct {v0, v1, p1}, LO6/g;-><init>(LM6/j;Lgg/t;)V

    new-instance v1, LO6/b$b$a;

    invoke-direct {v1, p0, v0}, LO6/b$b$a;-><init>(LO6/b$b;LO6/g;)V

    invoke-static {v1}, Lhg/c;->p(Lkg/a;)Lhg/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lgg/t;->g(Lhg/c;)V

    iget-object p1, p0, LO6/b$b;->a:LM6/j;

    invoke-static {p1}, LL6/b;->p(LM6/j;)V

    iget-object p1, p0, LO6/b$b;->b:LO6/b;

    iget-object p1, p1, LO6/b;->a:LO6/h;

    invoke-virtual {p1, v0}, LO6/h;->a(LO6/g;)V

    return-void
.end method
