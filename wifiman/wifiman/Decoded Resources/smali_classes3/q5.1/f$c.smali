.class final Lq5/f$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/f;->g(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lq5/f;

.field d:I


# direct methods
.method constructor <init>(Lq5/f;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lq5/f$c;->c:Lq5/f;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq5/f$c;->b:Ljava/lang/Object;

    iget p1, p0, Lq5/f$c;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq5/f$c;->d:I

    iget-object p1, p0, Lq5/f$c;->c:Lq5/f;

    invoke-virtual {p1, p0}, Lq5/f;->g(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
