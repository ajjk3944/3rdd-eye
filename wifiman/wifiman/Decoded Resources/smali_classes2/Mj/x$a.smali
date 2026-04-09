.class LMj/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final a:[Ljava/lang/Object;

.field final synthetic b:Ljava/lang/Class;

.field final synthetic c:LMj/x;


# direct methods
.method constructor <init>(LMj/x;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LMj/x$a;->c:LMj/x;

    iput-object p2, p0, LMj/x$a;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LMj/x$a;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p0, LMj/x$a;->a:[Ljava/lang/Object;

    :goto_0
    sget-object v0, LMj/s;->b:LMj/t;

    invoke-virtual {v0, p2}, LMj/t;->c(Ljava/lang/reflect/Method;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LMj/x$a;->b:Ljava/lang/Class;

    invoke-virtual {v0, p2, v1, p1, p3}, LMj/t;->b(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object v0, p0, LMj/x$a;->c:LMj/x;

    iget-object v1, p0, LMj/x$a;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1, p2}, LMj/x;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;)LMj/y;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, LMj/y;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
