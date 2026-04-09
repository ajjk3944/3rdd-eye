.class final LE0/c0$g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/c0$g;->a(Lm0/n0;Lp0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/c0;

.field final synthetic b:Lm0/n0;

.field final synthetic c:Lp0/c;


# direct methods
.method constructor <init>(LE0/c0;Lm0/n0;Lp0/c;)V
    .locals 0

    iput-object p1, p0, LE0/c0$g$a;->a:LE0/c0;

    iput-object p2, p0, LE0/c0$g$a;->b:Lm0/n0;

    iput-object p3, p0, LE0/c0$g$a;->c:Lp0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LE0/c0$g$a;->a:LE0/c0;

    iget-object v1, p0, LE0/c0$g$a;->b:Lm0/n0;

    iget-object v2, p0, LE0/c0$g$a;->c:Lp0/c;

    invoke-static {v0, v1, v2}, LE0/c0;->W1(LE0/c0;Lm0/n0;Lp0/c;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/c0$g$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
