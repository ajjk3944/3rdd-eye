.class public abstract Ldh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$c;


# instance fields
.field private final a:Lmh/l;

.field private final b:Ldh/i$c;


# direct methods
.method public constructor <init>(Ldh/i$c;Lmh/l;)V
    .locals 1

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldh/b;->a:Lmh/l;

    instance-of p2, p1, Ldh/b;

    if-eqz p2, :cond_0

    check-cast p1, Ldh/b;

    iget-object p1, p1, Ldh/b;->b:Ldh/i$c;

    :cond_0
    iput-object p1, p0, Ldh/b;->b:Ldh/i$c;

    return-void
.end method


# virtual methods
.method public final a(Ldh/i$c;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, Ldh/b;->b:Ldh/i$c;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Ldh/i$b;)Ldh/i$b;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldh/b;->a:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldh/i$b;

    return-object p1
.end method
