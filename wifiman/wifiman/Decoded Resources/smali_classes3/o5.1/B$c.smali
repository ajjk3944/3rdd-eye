.class final Lo5/B$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/B;->i(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lo5/B;

.field d:I


# direct methods
.method constructor <init>(Lo5/B;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lo5/B$c;->c:Lo5/B;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo5/B$c;->b:Ljava/lang/Object;

    iget p1, p0, Lo5/B$c;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo5/B$c;->d:I

    iget-object p1, p0, Lo5/B$c;->c:Lo5/B;

    invoke-static {p1, p0}, Lo5/B;->f(Lo5/B;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
