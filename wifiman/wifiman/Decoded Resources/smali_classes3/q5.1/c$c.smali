.class final Lq5/c$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/c;->d(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lq5/c;

.field e:I


# direct methods
.method constructor <init>(Lq5/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lq5/c$c;->d:Lq5/c;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq5/c$c;->c:Ljava/lang/Object;

    iget p1, p0, Lq5/c$c;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq5/c$c;->e:I

    iget-object p1, p0, Lq5/c$c;->d:Lq5/c;

    invoke-virtual {p1, p0}, Lq5/c;->d(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
