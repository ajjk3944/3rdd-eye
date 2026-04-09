.class public final LMj/q;
.super LMj/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMj/q$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LMj/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 2

    invoke-static {p1}, LMj/h$a;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/util/Optional;

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0, p1}, LMj/h$a;->a(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, LMj/x;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LMj/h;

    move-result-object p1

    new-instance p2, LMj/q$a;

    invoke-direct {p2, p1}, LMj/q$a;-><init>(LMj/h;)V

    return-object p2
.end method
