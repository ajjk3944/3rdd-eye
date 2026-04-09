.class final LT/y0$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/y0;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:LT/y0;

.field e:I


# direct methods
.method constructor <init>(LT/y0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT/y0$a;->d:LT/y0;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LT/y0$a;->c:Ljava/lang/Object;

    iget p1, p0, LT/y0$a;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LT/y0$a;->e:I

    iget-object p1, p0, LT/y0$a;->d:LT/y0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LT/y0;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
