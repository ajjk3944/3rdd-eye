.class final LLi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# instance fields
.field private final a:LLi/g;

.field public final b:Lmh/l;

.field public final c:Lmh/p;


# direct methods
.method public constructor <init>(LLi/g;Lmh/l;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLi/e;->a:LLi/g;

    iput-object p2, p0, LLi/e;->b:Lmh/l;

    iput-object p3, p0, LLi/e;->c:Lmh/p;

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v1, LMi/r;->a:LNi/C;

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v1, p0, LLi/e;->a:LLi/g;

    new-instance v2, LLi/e$a;

    invoke-direct {v2, p0, v0, p1}, LLi/e$a;-><init>(LLi/e;Lkotlin/jvm/internal/N;LLi/h;)V

    invoke-interface {v1, v2, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
