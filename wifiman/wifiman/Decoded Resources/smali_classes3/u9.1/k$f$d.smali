.class final Lu9/k$f$d;
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

    iput-object p1, p0, Lu9/k$f$d;->a:LT/q0;

    iput-object p2, p0, Lu9/k$f$d;->b:Lmh/l;

    iput-object p3, p0, Lu9/k$f$d;->c:Lu9/c;

    iput-object p4, p0, Lu9/k$f$d;->d:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LR0/Q;)V
    .locals 4

    const-string/jumbo v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu9/k$f$d;->a:LT/q0;

    iget-object v1, p0, Lu9/k$f$d;->b:Lmh/l;

    iget-object v2, p0, Lu9/k$f$d;->c:Lu9/c;

    iget-object v3, p0, Lu9/k$f$d;->d:Lmh/l;

    invoke-static {v0, v1, v2, v3, p1}, Lu9/k;->s(LT/q0;Lmh/l;Lu9/c;Lmh/l;LR0/Q;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/Q;

    invoke-virtual {p0, p1}, Lu9/k$f$d;->a(LR0/Q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
