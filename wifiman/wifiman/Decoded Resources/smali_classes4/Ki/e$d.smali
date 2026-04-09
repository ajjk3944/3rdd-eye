.class final LKi/e$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKi/e;->R0(LKi/e;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:LKi/e;

.field c:I


# direct methods
.method constructor <init>(LKi/e;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LKi/e$d;->b:LKi/e;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LKi/e$d;->a:Ljava/lang/Object;

    iget p1, p0, LKi/e$d;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LKi/e$d;->c:I

    iget-object p1, p0, LKi/e$d;->b:LKi/e;

    invoke-static {p1, p0}, LKi/e;->R0(LKi/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    move-result-object p1

    return-object p1
.end method
