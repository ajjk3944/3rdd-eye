.class final Ljj/f$b$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljj/i;


# direct methods
.method constructor <init>(Ljj/i;)V
    .locals 0

    iput-object p1, p0, Ljj/f$b$a$c;->a:Ljj/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;J)V
    .locals 1

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly0/y;->a()V

    iget-object p1, p0, Ljj/f$b$a$c;->a:Ljj/i;

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result v0

    float-to-int v0, v0

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p1, v0, p2}, Ljj/i;->J(II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly0/y;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Ljj/f$b$a$c;->a(Ly0/y;J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
