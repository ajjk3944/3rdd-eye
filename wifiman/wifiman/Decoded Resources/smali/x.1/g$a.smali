.class final Lx/g$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/g;->i(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lx/g;

.field d:I


# direct methods
.method constructor <init>(Lx/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lx/g$a;->c:Lx/g;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lx/g$a;->b:Ljava/lang/Object;

    iget p1, p0, Lx/g$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx/g$a;->d:I

    iget-object p1, p0, Lx/g$a;->c:Lx/g;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, p0}, Lx/g;->d(Lx/g;Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
