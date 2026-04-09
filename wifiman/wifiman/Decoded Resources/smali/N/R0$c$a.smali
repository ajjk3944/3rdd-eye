.class final LN/R0$c$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0$c;->b(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:LN/R0$c;

.field e:I


# direct methods
.method constructor <init>(LN/R0$c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/R0$c$a;->d:LN/R0$c;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LN/R0$c$a;->c:Ljava/lang/Object;

    iget p1, p0, LN/R0$c$a;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LN/R0$c$a;->e:I

    iget-object p1, p0, LN/R0$c$a;->d:LN/R0$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LN/R0$c;->b(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
