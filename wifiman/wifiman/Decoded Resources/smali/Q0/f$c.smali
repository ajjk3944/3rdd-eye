.class final LQ0/f$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/f;->p(LQ0/j;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LQ0/f;

.field d:I


# direct methods
.method constructor <init>(LQ0/f;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQ0/f$c;->c:LQ0/f;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LQ0/f$c;->b:Ljava/lang/Object;

    iget p1, p0, LQ0/f$c;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LQ0/f$c;->d:I

    iget-object p1, p0, LQ0/f$c;->c:LQ0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LQ0/f;->p(LQ0/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
