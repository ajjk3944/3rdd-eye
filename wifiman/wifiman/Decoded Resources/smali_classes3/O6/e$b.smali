.class LO6/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/e;->a(LM6/j;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/j;

.field final synthetic b:LO6/e;


# direct methods
.method constructor <init>(LO6/e;LM6/j;)V
    .locals 0

    iput-object p1, p0, LO6/e$b;->b:LO6/e;

    iput-object p2, p0, LO6/e$b;->a:LM6/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/t;)V
    .locals 2

    new-instance v0, LO6/g;

    iget-object v1, p0, LO6/e$b;->a:LM6/j;

    invoke-direct {v0, v1, p1}, LO6/g;-><init>(LM6/j;Lgg/t;)V

    new-instance v1, LO6/e$b$a;

    invoke-direct {v1, p0, v0}, LO6/e$b$a;-><init>(LO6/e$b;LO6/g;)V

    invoke-interface {p1, v1}, Lgg/t;->d(Lkg/e;)V

    iget-object p1, p0, LO6/e$b;->a:LM6/j;

    invoke-static {p1}, LL6/b;->p(LM6/j;)V

    iget-object p1, p0, LO6/e$b;->b:LO6/e;

    iget-object p1, p1, LO6/e;->d:LO6/h;

    invoke-virtual {p1, v0}, LO6/h;->a(LO6/g;)V

    return-void
.end method
