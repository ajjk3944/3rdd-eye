.class final Landroidx/compose/material/a$d$a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a$d$a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;

.field final synthetic e:Landroidx/compose/material/a$d$a;

.field f:I


# direct methods
.method constructor <init>(Landroidx/compose/material/a$d$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$d$a$b;->e:Landroidx/compose/material/a$d$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/material/a$d$a$b;->d:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/material/a$d$a$b;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/material/a$d$a$b;->f:I

    iget-object p1, p0, Landroidx/compose/material/a$d$a$b;->e:Landroidx/compose/material/a$d$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/compose/material/a$d$a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
