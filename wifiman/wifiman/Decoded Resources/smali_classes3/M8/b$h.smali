.class final LM8/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$h;

    invoke-direct {v0}, LM8/b$h;-><init>()V

    sput-object v0, LM8/b$h;->a:LM8/b$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lje/r;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connectionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh9/a;

    instance-of v0, p2, Lje/r$b$a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Lje/r$b$a$b;

    invoke-virtual {p2}, Lje/r$b$a$b;->f()LW7/b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lje/r$b$a$b;->c()Lh9/a;

    move-result-object p2

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move-object v1, v0

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lje/r$b$a$a;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_3

    check-cast p2, Lje/r$b$a$a;

    invoke-virtual {p2, p1}, Lje/r$b$a$a;->p(Lh9/a;)Lje/q;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lje/q;->g()LW7/b;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of p1, p2, Lje/r$b$b;

    if-nez p1, :cond_3

    instance-of p1, p2, Lje/r$a;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lje/r;

    invoke-virtual {p0, p1, p2}, LM8/b$h;->a(Ll9/a;Lje/r;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
