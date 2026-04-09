.class final LF/h$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/h;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LT/q0;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LF/h$b;->a:LT/q0;

    iput-object p2, p0, LF/h$b;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/M;)V
    .locals 1

    iget-object v0, p0, LF/h$b;->a:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LF/h$b;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/M;

    invoke-virtual {p0, p1}, LF/h$b;->a(LL0/M;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
