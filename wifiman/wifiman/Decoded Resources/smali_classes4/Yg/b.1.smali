.class public abstract LYg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, LYg/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, LYg/b;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(LYg/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYg/d;

    invoke-virtual {p0}, LYg/a;->a()Lmh/q;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LYg/d;-><init>(Lmh/q;Ljava/lang/Object;)V

    invoke-virtual {v0}, LYg/d;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
