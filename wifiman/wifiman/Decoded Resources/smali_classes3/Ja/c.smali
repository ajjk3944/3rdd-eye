.class public final LJa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJa/a;


# instance fields
.field private final b:LJa/a$b;


# direct methods
.method public constructor <init>(LJa/a$b;)V
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJa/c;->b:LJa/a$b;

    return-void
.end method

.method public static final synthetic a(LJa/c;LJa/a$b;)Lspeedtest/SpeedtestServerParams;
    .locals 0

    invoke-direct {p0, p1}, LJa/c;->b(LJa/a$b;)Lspeedtest/SpeedtestServerParams;

    move-result-object p0

    return-object p0
.end method

.method private final b(LJa/a$b;)Lspeedtest/SpeedtestServerParams;
    .locals 2

    new-instance v0, Lspeedtest/SpeedtestServerParams;

    invoke-direct {v0}, Lspeedtest/SpeedtestServerParams;-><init>()V

    invoke-virtual {p1}, LJa/a$b;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestServerParams;->setHttpServer(Z)V

    invoke-virtual {p1}, LJa/a$b;->b()Z

    move-result p1

    invoke-virtual {v0, p1}, Lspeedtest/SpeedtestServerParams;->setTcpServer(Z)V

    return-object v0
.end method


# virtual methods
.method public final c()LJa/a$b;
    .locals 1

    iget-object v0, p0, LJa/c;->b:LJa/a$b;

    return-object v0
.end method

.method public start()LLi/g;
    .locals 3

    new-instance v0, LJa/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJa/c$a;-><init>(LJa/c;Ldh/e;)V

    invoke-static {v0}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object v0

    new-instance v2, LJa/c$b;

    invoke-direct {v2, p0, v1}, LJa/c$b;-><init>(LJa/c;Ldh/e;)V

    invoke-static {v0, v2}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    new-instance v2, LJa/c$c;

    invoke-direct {v2, p0, v1}, LJa/c$c;-><init>(LJa/c;Ldh/e;)V

    invoke-static {v0, v2}, LLi/i;->H(LLi/g;Lmh/q;)LLi/g;

    move-result-object v0

    new-instance v2, LJa/c$d;

    invoke-direct {v2, v1}, LJa/c$d;-><init>(Ldh/e;)V

    invoke-static {v0, v2}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v1

    invoke-static {v0, v1}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v0

    return-object v0
.end method
