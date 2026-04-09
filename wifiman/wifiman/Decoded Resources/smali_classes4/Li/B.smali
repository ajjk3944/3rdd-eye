.class final LLi/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/N;
.implements LLi/g;
.implements LMi/o;


# instance fields
.field private final synthetic a:LLi/N;

.field private final b:LIi/y0;


# direct methods
.method public constructor <init>(LLi/N;LIi/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLi/B;->a:LLi/N;

    iput-object p2, p0, LLi/B;->b:LIi/y0;

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LLi/B;->a:LLi/N;

    invoke-interface {v0, p1, p2}, LLi/D;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ldh/i;ILKi/a;)LLi/g;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LLi/P;->d(LLi/N;Ldh/i;ILKi/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LLi/B;->a:LLi/N;

    invoke-interface {v0}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
