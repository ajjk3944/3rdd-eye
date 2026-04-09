.class final LO1/l$k$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/l$k;->a(Lmh/p;Ldh/e;)Ljava/lang/Object;
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

.field e:Ljava/lang/Object;

.field synthetic f:Ljava/lang/Object;

.field final synthetic g:LO1/l$k;

.field h:I


# direct methods
.method constructor <init>(LO1/l$k;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LO1/l$k$a;->g:LO1/l$k;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LO1/l$k$a;->f:Ljava/lang/Object;

    iget p1, p0, LO1/l$k$a;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LO1/l$k$a;->h:I

    iget-object p1, p0, LO1/l$k$a;->g:LO1/l$k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LO1/l$k;->a(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
