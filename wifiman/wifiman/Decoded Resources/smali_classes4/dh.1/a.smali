.class public abstract Ldh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$b;


# instance fields
.field private final a:Ldh/i$c;


# direct methods
.method public constructor <init>(Ldh/i$c;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh/a;->a:Ldh/i$c;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Ldh/i$b$a;->a(Ldh/i$b;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->b(Ldh/i$b;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ldh/i$c;
    .locals 1

    iget-object v0, p0, Ldh/a;->a:Ldh/i$c;

    return-object v0
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->c(Ldh/i$b;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->d(Ldh/i$b;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
