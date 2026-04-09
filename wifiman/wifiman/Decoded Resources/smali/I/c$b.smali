.class final LI/c$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c;->c(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LI/q;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field b:I


# direct methods
.method constructor <init>(Ldh/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, LI/c$b;->a:Ljava/lang/Object;

    iget p1, p0, LI/c$b;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LI/c$b;->b:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v9, p0

    invoke-static/range {v0 .. v9}, LI/c;->c(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LI/q;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
