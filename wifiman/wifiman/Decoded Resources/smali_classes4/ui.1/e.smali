.class public abstract Lui/e;
.super Lui/a;
.source "SourceFile"


# instance fields
.field private a:Lui/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    sget-object v0, Lui/i;->a:Lui/i;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lui/e;-><init>(Lui/c;)V

    return-void
.end method

.method protected constructor <init>(Lui/c;)V
    .locals 1

    const-string v0, "arrayMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lui/a;-><init>()V

    .line 2
    iput-object p1, p0, Lui/e;->a:Lui/c;

    return-void
.end method


# virtual methods
.method protected final b()Lui/c;
    .locals 1

    iget-object v0, p0, Lui/e;->a:Lui/c;

    return-object v0
.end method

.method protected final f(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "keyQualifiedName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lui/a;->e()Lui/z;

    move-result-object v0

    invoke-virtual {v0, p1}, Lui/z;->d(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lui/e;->a:Lui/c;

    invoke-virtual {v0}, Lui/c;->b()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lui/e;->a:Lui/c;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lui/o;

    invoke-virtual {v0}, Lui/o;->f()I

    move-result v1

    if-ne v1, p1, :cond_1

    new-instance v0, Lui/o;

    invoke-direct {v0, p2, p1}, Lui/o;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lui/e;->a:Lui/c;

    return-void

    :cond_1
    new-instance v1, Lui/d;

    invoke-direct {v1}, Lui/d;-><init>()V

    iput-object v1, p0, Lui/e;->a:Lui/c;

    invoke-virtual {v0}, Lui/o;->f()I

    move-result v2

    invoke-virtual {v0}, Lui/o;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lui/c;->e(ILjava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lui/e;->a:Lui/c;

    invoke-virtual {v0, p1, p2}, Lui/c;->e(ILjava/lang/Object;)V

    return-void

    :cond_2
    new-instance v0, Lui/o;

    invoke-direct {v0, p2, p1}, Lui/o;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lui/e;->a:Lui/c;

    return-void
.end method
