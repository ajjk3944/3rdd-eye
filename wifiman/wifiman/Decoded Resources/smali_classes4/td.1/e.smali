.class public final Ltd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltd/d;


# instance fields
.field private final a:LLa/c;


# direct methods
.method public constructor <init>(Ldc/a;)V
    .locals 2

    const-string v0, "buildConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLa/c;

    invoke-virtual {p1}, Ldc/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ldc/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LLa/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ltd/e;->a:LLa/c;

    return-void
.end method


# virtual methods
.method public a()LKa/f$a;
    .locals 3

    sget-object v0, LKa/f;->a:LKa/f;

    const/4 v1, 0x0

    iget-object v2, p0, Ltd/e;->a:LLa/c;

    invoke-virtual {v0, v1, v2}, LKa/f;->a(Ljava/lang/String;LLa/c;)LKa/f$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)LIa/a;
    .locals 3

    sget-object v0, LIa/a;->a:LIa/a$a;

    iget-object v1, p0, Ltd/e;->a:LLa/c;

    sget-object v2, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v2}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v2

    invoke-interface {v2}, Lcom/ubnt/usurvey/a$b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/usurvey/a;->l()LIa/a$b;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, LIa/a$a;->a(Ljava/lang/String;LLa/c;LIa/a$b;)LIa/a;

    move-result-object p1

    return-object p1
.end method

.method public c()LKa/h$a;
    .locals 1

    sget-object v0, LKa/h;->a:LKa/h;

    invoke-virtual {v0}, LKa/h;->a()LKa/h$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)LKa/f$a;
    .locals 2

    sget-object v0, LKa/f;->a:LKa/f;

    iget-object v1, p0, Ltd/e;->a:LLa/c;

    invoke-virtual {v0, p1, v1}, LKa/f;->a(Ljava/lang/String;LLa/c;)LKa/f$a;

    move-result-object p1

    return-object p1
.end method
