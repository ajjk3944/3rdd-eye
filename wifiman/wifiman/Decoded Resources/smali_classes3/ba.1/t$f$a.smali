.class public final Lba/t$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/t$f;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/h;

.field final synthetic b:Lba/t;


# direct methods
.method public constructor <init>(LLi/h;Lba/t;)V
    .locals 0

    iput-object p1, p0, Lba/t$f$a;->a:LLi/h;

    iput-object p2, p0, Lba/t$f$a;->b:Lba/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lba/t$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lba/t$f$a$a;

    iget v1, v0, Lba/t$f$a$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lba/t$f$a$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Lba/t$f$a$a;

    invoke-direct {v0, p0, p2}, Lba/t$f$a$a;-><init>(Lba/t$f$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lba/t$f$a$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lba/t$f$a$a;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lba/t$f$a;->a:LLi/h;

    check-cast p1, Ljava/lang/CharSequence;

    iget-object v2, p0, Lba/t$f$a;->b:Lba/t;

    invoke-static {v2}, Lba/t;->D0(Lba/t;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput v3, v0, Lba/t$f$a$a;->b:I

    invoke-interface {p2, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
