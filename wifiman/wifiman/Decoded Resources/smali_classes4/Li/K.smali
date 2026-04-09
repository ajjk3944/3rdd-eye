.class final LLi/K;
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
    .locals 0

    sget-object p1, LLi/H;->START:LLi/H;

    invoke-static {p1}, LLi/i;->B(Ljava/lang/Object;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SharingStarted.Eagerly"

    return-object v0
.end method
