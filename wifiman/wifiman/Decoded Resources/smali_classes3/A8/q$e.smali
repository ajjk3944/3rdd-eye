.class final LA8/q$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/q;->s0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/q;


# direct methods
.method constructor <init>(LA8/q;)V
    .locals 0

    iput-object p1, p0, LA8/q$e;->a:LA8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXe/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/a;

    iget-object v1, p0, LA8/q$e;->a:LA8/q;

    invoke-static {v1}, LA8/q;->v0(LA8/q;)Lod/b;

    move-result-object v1

    invoke-virtual {v0}, LXe/a;->a()J

    move-result-wide v2

    iget-object v0, p0, LA8/q$e;->a:LA8/q;

    invoke-static {v0}, LA8/q;->x0(LA8/q;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec/a;

    if-eqz p1, :cond_2

    iget-object v0, p0, LA8/q$e;->a:LA8/q;

    invoke-virtual {v0}, LA8/q;->d()Lorg/kodein/di/DI;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v0

    invoke-interface {v0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v4, Lorg/kodein/type/d;

    new-instance v6, LA8/q$e$a;

    invoke-direct {v6}, LA8/q$e$a;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    const-string/jumbo v7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Landroid/content/Context;

    invoke-direct {v4, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v4, v5}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p1, v0}, Lec/a;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v0

    :cond_2
    :goto_1
    invoke-interface {v1, v2, v3, v5}, Lod/b;->b(JLjava/lang/String;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LA8/q$e;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
