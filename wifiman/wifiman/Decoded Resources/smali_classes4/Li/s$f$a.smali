.class public final LLi/s$f$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/s$f;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field b:I

.field final synthetic c:LLi/s$f;

.field d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LLi/s$f;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LLi/s$f$a;->c:LLi/s$f;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LLi/s$f$a;->a:Ljava/lang/Object;

    iget p1, p0, LLi/s$f$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LLi/s$f$a;->b:I

    iget-object p1, p0, LLi/s$f$a;->c:LLi/s$f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LLi/s$f;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
