.class public abstract Lm5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm5/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lm5/h$a;LF4/d;)Lm5/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lm5/h;->d(Ljava/lang/String;Lm5/h$a;LF4/d;)Lm5/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)LF4/c;
    .locals 0

    invoke-static {p0, p1}, Lm5/f;->a(Ljava/lang/String;Ljava/lang/String;)Lm5/f;

    move-result-object p0

    const-class p1, Lm5/f;

    invoke-static {p0, p1}, LF4/c;->l(Ljava/lang/Object;Ljava/lang/Class;)LF4/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lm5/h$a;)LF4/c;
    .locals 2

    const-class v0, Lm5/f;

    invoke-static {v0}, LF4/c;->m(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v1, Lm5/g;

    invoke-direct {v1, p0, p1}, Lm5/g;-><init>(Ljava/lang/String;Lm5/h$a;)V

    invoke-virtual {v0, v1}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object p0

    invoke-virtual {p0}, LF4/c$b;->c()LF4/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Ljava/lang/String;Lm5/h$a;LF4/d;)Lm5/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lm5/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lm5/f;->a(Ljava/lang/String;Ljava/lang/String;)Lm5/f;

    move-result-object p0

    return-object p0
.end method
