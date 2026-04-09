.class final LQ0/f$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/f;->j(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field e:I

.field synthetic f:Ljava/lang/Object;

.field final synthetic g:LQ0/f;

.field h:I


# direct methods
.method constructor <init>(LQ0/f;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQ0/f$a;->g:LQ0/f;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LQ0/f$a;->f:Ljava/lang/Object;

    iget p1, p0, LQ0/f$a;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LQ0/f$a;->h:I

    iget-object p1, p0, LQ0/f$a;->g:LQ0/f;

    invoke-virtual {p1, p0}, LQ0/f;->j(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
