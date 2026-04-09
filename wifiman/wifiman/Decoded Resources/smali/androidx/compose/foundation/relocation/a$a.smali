.class final Landroidx/compose/foundation/relocation/a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/a;->a(Ll0/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field d:I

.field synthetic e:Ljava/lang/Object;

.field final synthetic f:Landroidx/compose/foundation/relocation/a;

.field g:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/a$a;->f:Landroidx/compose/foundation/relocation/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/relocation/a$a;->e:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/relocation/a$a;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/relocation/a$a;->g:I

    iget-object p1, p0, Landroidx/compose/foundation/relocation/a$a;->f:Landroidx/compose/foundation/relocation/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/compose/foundation/relocation/a;->a(Ll0/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
