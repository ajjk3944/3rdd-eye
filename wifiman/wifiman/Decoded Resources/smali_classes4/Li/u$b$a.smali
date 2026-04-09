.class public final LLi/u$b$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/u$b;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field c:I

.field final synthetic d:LLi/u$b;

.field e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LLi/u$b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LLi/u$b$a;->d:LLi/u$b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LLi/u$b$a;->b:Ljava/lang/Object;

    iget p1, p0, LLi/u$b$a;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LLi/u$b$a;->c:I

    iget-object p1, p0, LLi/u$b$a;->d:LLi/u$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LLi/u$b;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
