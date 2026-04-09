.class final LLi/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/J;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LLi/N;)LLi/g;
    .locals 2

    new-instance v0, LLi/L$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LLi/L$a;-><init>(LLi/N;Ldh/e;)V

    invoke-static {v0}, LLi/i;->A(Lmh/p;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SharingStarted.Lazily"

    return-object v0
.end method
