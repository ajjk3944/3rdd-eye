.class public final LR1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/e;


# instance fields
.field private final a:LO1/e;


# direct methods
.method public constructor <init>(LO1/e;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR1/b;->a:LO1/e;

    return-void
.end method


# virtual methods
.method public a(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LR1/b;->a:LO1/e;

    new-instance v1, LR1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LR1/b$a;-><init>(Lmh/p;Ldh/e;)V

    invoke-interface {v0, v1, p2}, LO1/e;->a(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()LLi/g;
    .locals 1

    iget-object v0, p0, LR1/b;->a:LO1/e;

    invoke-interface {v0}, LO1/e;->b()LLi/g;

    move-result-object v0

    return-object v0
.end method
