.class final Lu9/k$f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu9/k$f;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Lmh/l;LT/q0;)V
    .locals 0

    iput-object p1, p0, Lu9/k$f$c;->a:Lmh/l;

    iput-object p2, p0, Lu9/k$f$c;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF/B;)V
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lu9/k$f$c;->a:Lmh/l;

    iget-object v0, p0, Lu9/k$f$c;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR0/Q;

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF/B;

    invoke-virtual {p0, p1}, Lu9/k$f$c;->a(LF/B;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
