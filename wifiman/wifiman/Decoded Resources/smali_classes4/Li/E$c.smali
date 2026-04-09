.class final LLi/E$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/E;->C(LLi/E;LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field synthetic e:Ljava/lang/Object;

.field final synthetic f:LLi/E;

.field g:I


# direct methods
.method constructor <init>(LLi/E;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LLi/E$c;->f:LLi/E;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LLi/E$c;->e:Ljava/lang/Object;

    iget p1, p0, LLi/E$c;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LLi/E$c;->g:I

    iget-object p1, p0, LLi/E$c;->f:LLi/E;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, LLi/E;->C(LLi/E;LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
