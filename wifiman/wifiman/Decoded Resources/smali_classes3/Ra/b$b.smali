.class final LRa/b$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRa/b;->a(LIi/N;LRa/b$a;Ldh/e;)Ljava/lang/Object;
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

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Object;

.field h:I

.field i:Z

.field j:Z

.field synthetic k:Ljava/lang/Object;

.field final synthetic l:LRa/b;

.field m:I


# direct methods
.method constructor <init>(LRa/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LRa/b$b;->l:LRa/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LRa/b$b;->k:Ljava/lang/Object;

    iget p1, p0, LRa/b$b;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LRa/b$b;->m:I

    iget-object p1, p0, LRa/b$b;->l:LRa/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, LRa/b;->a(LIi/N;LRa/b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
