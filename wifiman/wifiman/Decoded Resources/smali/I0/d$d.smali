.class final LI0/d$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI0/d;->e(Landroid/view/ScrollCaptureSession;LY0/p;Ldh/e;)Ljava/lang/Object;
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

.field final synthetic g:LI0/d;

.field h:I


# direct methods
.method constructor <init>(LI0/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI0/d$d;->g:LI0/d;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LI0/d$d;->f:Ljava/lang/Object;

    iget p1, p0, LI0/d$d;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LI0/d$d;->h:I

    iget-object p1, p0, LI0/d$d;->g:LI0/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, LI0/d;->d(LI0/d;Landroid/view/ScrollCaptureSession;LY0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
