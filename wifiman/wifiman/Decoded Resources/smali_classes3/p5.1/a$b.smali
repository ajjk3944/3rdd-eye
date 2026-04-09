.class final Lp5/a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/a;->c(Ldh/e;)Ljava/lang/Object;
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

.field synthetic g:Ljava/lang/Object;

.field final synthetic h:Lp5/a;

.field i:I


# direct methods
.method constructor <init>(Lp5/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lp5/a$b;->h:Lp5/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp5/a$b;->g:Ljava/lang/Object;

    iget p1, p0, Lp5/a$b;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp5/a$b;->i:I

    iget-object p1, p0, Lp5/a$b;->h:Lp5/a;

    invoke-virtual {p1, p0}, Lp5/a;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
