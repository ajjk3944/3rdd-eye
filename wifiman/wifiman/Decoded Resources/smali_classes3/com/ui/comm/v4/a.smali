.class public abstract Lcom/ui/comm/v4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/comm/v4/a$a;,
        Lcom/ui/comm/v4/a$b;,
        Lcom/ui/comm/v4/a$c;,
        Lcom/ui/comm/v4/a$d;,
        Lcom/ui/comm/v4/a$e;,
        Lcom/ui/comm/v4/a$f;,
        Lcom/ui/comm/v4/a$g;,
        Lcom/ui/comm/v4/a$h;,
        Lcom/ui/comm/v4/a$i;,
        Lcom/ui/comm/v4/a$j;
    }
.end annotation


# instance fields
.field private a:Lcom/ui/binme/BinaryMessage$b;

.field private b:Lcom/ui/binme/BinaryMessage$b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/comm/v4/a;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/ui/comm/v4/b;
.end method

.method public final b()Lcom/ui/binme/BinaryMessage$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a;->b:Lcom/ui/binme/BinaryMessage$b;

    return-object v0
.end method

.method public final c()Lcom/ui/binme/BinaryMessage$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a;->a:Lcom/ui/binme/BinaryMessage$b;

    return-object v0
.end method

.method public final d(Lcom/ui/binme/BinaryMessage$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/comm/v4/a;->b:Lcom/ui/binme/BinaryMessage$b;

    return-void
.end method

.method public final e(Lcom/ui/binme/BinaryMessage$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/comm/v4/a;->a:Lcom/ui/binme/BinaryMessage$b;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    instance-of v0, p0, Lcom/ui/comm/v4/a$i;

    const-string v1, ")"

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$i;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$i;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Request (action:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/comm/v4/a$j$b;

    if-eqz v0, :cond_1

    const-string/jumbo v0, "Response (SUCCESS)"

    goto/16 :goto_0

    :cond_1
    instance-of v0, p0, Lcom/ui/comm/v4/a$j$a;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$j$a;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$j$a;->f()Lcom/ui/comm/v4/a$d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Response (FAILED) "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    instance-of v0, p0, Lcom/ui/comm/v4/a$f;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$f;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$f;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "HTTP Request ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \'"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\')"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    instance-of v0, p0, Lcom/ui/comm/v4/a$g;

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$g;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$g;->g()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "HTTP Response ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    instance-of v0, p0, Lcom/ui/comm/v4/a$h;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$h;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$h;->f()Lcom/ui/comm/v4/a$h$a;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Log (level: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    instance-of v0, p0, Lcom/ui/comm/v4/a$e;

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$e;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$e;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " Event ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " )"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_6
    instance-of v0, p0, Lcom/ui/comm/v4/a$c;

    if-eqz v0, :cond_7

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$c;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$c;->f()Lcom/ui/comm/v4/a$d;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Error ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_7
    instance-of v0, p0, Lcom/ui/comm/v4/a$a;

    if-eqz v0, :cond_8

    const-string v0, "Cmd"

    goto :goto_0

    :cond_8
    instance-of v0, p0, Lcom/ui/comm/v4/a$b;

    if-eqz v0, :cond_9

    move-object v0, p0

    check-cast v0, Lcom/ui/comm/v4/a$b;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$b;->f()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CmdResult (exit code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
