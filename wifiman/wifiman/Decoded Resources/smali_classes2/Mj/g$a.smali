.class final LMj/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMj/g$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMj/g$a;->a:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LMj/g$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(LMj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LMj/g$a;->c(LMj/d;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    return-object p1
.end method

.method public c(LMj/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 2

    new-instance v0, LMj/g$b;

    invoke-direct {v0, p1}, LMj/g$b;-><init>(LMj/d;)V

    new-instance v1, LMj/g$a$a;

    invoke-direct {v1, p0, v0}, LMj/g$a$a;-><init>(LMj/g$a;Ljava/util/concurrent/CompletableFuture;)V

    invoke-interface {p1, v1}, LMj/d;->K0(LMj/f;)V

    return-object v0
.end method
