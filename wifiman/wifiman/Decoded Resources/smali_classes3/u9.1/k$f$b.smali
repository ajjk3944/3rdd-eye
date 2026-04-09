.class final Lu9/k$f$b;
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
.field final synthetic a:LT/q0;

.field final synthetic b:Lmh/l;

.field final synthetic c:Lu9/c;

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(LT/q0;Lmh/l;Lu9/c;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lu9/k$f$b;->a:LT/q0;

    iput-object p2, p0, Lu9/k$f$b;->b:Lmh/l;

    iput-object p3, p0, Lu9/k$f$b;->c:Lu9/c;

    iput-object p4, p0, Lu9/k$f$b;->d:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu9/k$f$b;->a:LT/q0;

    iget-object v1, p0, Lu9/k$f$b;->b:Lmh/l;

    iget-object v2, p0, Lu9/k$f$b;->c:Lu9/c;

    iget-object v3, p0, Lu9/k$f$b;->d:Lmh/l;

    invoke-static {p1}, Lu9/k;->r(Ljava/lang/String;)LR0/Q;

    move-result-object p1

    invoke-static {v0, v1, v2, v3, p1}, Lu9/k;->s(LT/q0;Lmh/l;Lu9/c;Lmh/l;LR0/Q;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu9/k$f$b;->a(Ljava/lang/String;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
