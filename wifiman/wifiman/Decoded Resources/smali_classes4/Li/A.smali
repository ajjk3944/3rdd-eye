.class final LLi/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/D;
.implements LLi/g;
.implements LMi/o;


# instance fields
.field private final synthetic a:LLi/D;

.field private final b:LIi/y0;


# direct methods
.method public constructor <init>(LLi/D;LIi/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLi/A;->a:LLi/D;

    iput-object p2, p0, LLi/A;->b:LIi/y0;

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LLi/A;->a:LLi/D;

    invoke-interface {v0, p1, p2}, LLi/D;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ldh/i;ILKi/a;)LLi/g;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LLi/F;->e(LLi/D;Ldh/i;ILKi/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method
