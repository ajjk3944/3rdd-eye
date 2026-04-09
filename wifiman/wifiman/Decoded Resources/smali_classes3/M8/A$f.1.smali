.class final LM8/A$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$f;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lje/r;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, LM8/A$f;->b(Ll9/a;Lje/r;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Lje/r;Ll9/a;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifiConnection"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS8/c;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lle/f;

    new-instance v0, Ll9/a;

    instance-of v1, p2, Lje/r$b$a;

    if-eqz v1, :cond_0

    iget-object v1, p0, LM8/A$f;->a:LM8/A;

    check-cast p2, Lje/r$b$a;

    invoke-static {v1, p2, p1, p3}, LM8/A;->K0(LM8/A;Lje/r$b$a;LS8/c;Lle/f;)LGf/k;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of p1, p2, Lje/r$b$b;

    if-nez p1, :cond_2

    instance-of p1, p2, Lje/r$a;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    :goto_1
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
