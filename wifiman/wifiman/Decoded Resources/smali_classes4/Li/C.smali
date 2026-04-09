.class final LLi/C;
.super LLi/a;
.source "SourceFile"


# instance fields
.field private final a:Lmh/p;


# direct methods
.method public constructor <init>(Lmh/p;)V
    .locals 0

    invoke-direct {p0}, LLi/a;-><init>()V

    iput-object p1, p0, LLi/C;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public e(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LLi/C;->a:Lmh/p;

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
