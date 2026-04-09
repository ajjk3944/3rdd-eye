.class final LQ/a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a;->c(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/A;


# direct methods
.method constructor <init>(LQ/A;)V
    .locals 0

    iput-object p1, p0, LQ/a$d;->a:LQ/A;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/h;)V
    .locals 1

    iget-object v0, p0, LQ/a$d;->a:LQ/A;

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, LQ/A;->g(F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, LQ/a$d;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
