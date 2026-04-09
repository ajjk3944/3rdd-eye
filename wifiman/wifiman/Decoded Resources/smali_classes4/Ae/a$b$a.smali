.class final LAe/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAe/a$b;->a(Lf2/k;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:Lmh/q;

.field final synthetic c:Lf2/k;


# direct methods
.method constructor <init>(Lmh/q;Lmh/q;Lf2/k;)V
    .locals 0

    iput-object p1, p0, LAe/a$b$a;->a:Lmh/q;

    iput-object p2, p0, LAe/a$b$a;->b:Lmh/q;

    iput-object p3, p0, LAe/a$b$a;->c:Lf2/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous>.<anonymous> (NavGraphBuilderExtensions.kt:55)"

    const v2, -0x5b7db5ba

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LAe/a$b$a;->a:Lmh/q;

    if-eqz p2, :cond_3

    const p2, 0x5f2d0495

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LAe/a$b$a;->a:Lmh/q;

    new-instance v0, LAe/a$b$a$a;

    iget-object v1, p0, LAe/a$b$a;->b:Lmh/q;

    iget-object v2, p0, LAe/a$b$a;->c:Lf2/k;

    invoke-direct {v0, v1, v2}, LAe/a$b$a$a;-><init>(Lmh/q;Lf2/k;)V

    const/16 v1, 0x36

    const v2, -0x330ee8fa    # -1.2640056E8f

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const p2, 0x5f2ebf6c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LAe/a$b$a;->b:Lmh/q;

    iget-object v0, p0, LAe/a$b$a;->c:Lf2/k;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LAe/a$b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
