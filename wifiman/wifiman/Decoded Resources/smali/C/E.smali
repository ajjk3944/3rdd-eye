.class final LC/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/n;


# instance fields
.field private final a:Lw/C;

.field private final b:LC/C;


# direct methods
.method public constructor <init>(Lw/C;LC/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/E;->a:Lw/C;

    iput-object p2, p0, LC/E;->b:LC/C;

    return-void
.end method


# virtual methods
.method public a(Lw/v;FLdh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, LC/E$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LC/E$a;

    iget v1, v0, LC/E$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC/E$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LC/E$a;

    invoke-direct {v0, p0, p3}, LC/E$a;-><init>(LC/E;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LC/E$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LC/E$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p3, p0, LC/E;->a:Lw/C;

    new-instance v2, LC/E$b;

    invoke-direct {v2, p0, p1}, LC/E$b;-><init>(LC/E;Lw/v;)V

    iput v3, v0, LC/E$a;->c:I

    invoke-interface {p3, p1, p2, v2, v0}, Lw/C;->c(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final d()LC/C;
    .locals 1

    iget-object v0, p0, LC/E;->b:LC/C;

    return-object v0
.end method
