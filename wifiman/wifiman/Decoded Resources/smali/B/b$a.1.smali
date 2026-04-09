.class final LB/b$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/b;->a(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:LB/b;

.field e:I


# direct methods
.method constructor <init>(LB/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LB/b$a;->d:LB/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB/b$a;->c:Ljava/lang/Object;

    iget p1, p0, LB/b$a;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB/b$a;->e:I

    iget-object p1, p0, LB/b$a;->d:LB/b;

    invoke-virtual {p1, p0}, LB/b;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
