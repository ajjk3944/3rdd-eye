.class final synthetic LI/e1$y$a$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1$y$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onImeActionPerformed-KlQnJC8(I)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, LI/e1;

    const-string v4, "onImeActionPerformed"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, LI/e1;

    invoke-static {v0, p1}, LI/e1;->Q2(LI/e1;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/r;

    invoke-virtual {p1}, LR0/r;->p()I

    move-result p1

    invoke-virtual {p0, p1}, LI/e1$y$a$a;->a(I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
