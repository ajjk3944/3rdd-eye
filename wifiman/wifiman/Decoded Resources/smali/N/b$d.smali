.class final LN/b$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;->i(Ljava/lang/Object;Ls/L;Lmh/r;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LN/b;

.field d:I


# direct methods
.method constructor <init>(LN/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/b$d;->c:LN/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LN/b$d;->b:Ljava/lang/Object;

    iget p1, p0, LN/b$d;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LN/b$d;->d:I

    iget-object p1, p0, LN/b$d;->c:LN/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, LN/b;->i(Ljava/lang/Object;Ls/L;Lmh/r;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
