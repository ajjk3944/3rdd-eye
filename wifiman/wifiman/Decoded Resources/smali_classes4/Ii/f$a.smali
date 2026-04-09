.class final LIi/f$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIi/f;->c([LIi/y0;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field c:I

.field synthetic d:Ljava/lang/Object;

.field e:I


# direct methods
.method constructor <init>(Ldh/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LIi/f$a;->d:Ljava/lang/Object;

    iget p1, p0, LIi/f$a;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LIi/f$a;->e:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, LIi/f;->c([LIi/y0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
