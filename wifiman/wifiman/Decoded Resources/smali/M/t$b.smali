.class final LM/t$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t;->k(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field d:I


# direct methods
.method constructor <init>(Ldh/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LM/t$b;->c:Ljava/lang/Object;

    iget p1, p0, LM/t$b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LM/t$b;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, LM/t;->c(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
